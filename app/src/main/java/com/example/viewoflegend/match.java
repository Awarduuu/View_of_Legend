package com.example.viewoflegend;

import android.app.DatePickerDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import java.util.Calendar;

public class match extends AppCompatActivity {
    // 알림

    // 채널 생성
    String NOTIFICATION_CHANNEL_ID = "my_channel";

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "My Notifications", NotificationManager.IMPORTANCE_DEFAULT);
            notificationChannel.setDescription("Channel description");
            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void sendNotification(View view) {
        // 빌더 생성
       NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID);
       
       // 액션 첨부
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        // 속성 설정
        notificationBuilder.setSmallIcon(R.drawable.team1);
        notificationBuilder.setContentTitle("알림");
        notificationBuilder.setContentText("예약 설정이 완료되었습니다.");
        notificationBuilder.setContentIntent(pendingIntent);
        
        // 알림 객체 생성하여 보내기
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, notificationBuilder.build());
    }

    // 날짜 대화상자
    Button btnSelectedDate;
    DatePickerDialog datePickerDialog;
    TextView display;
    TextView book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match);
        createNotificationChannel();
        btnSelectedDate = (Button) findViewById(R.id.date);
        display = (TextView) findViewById(R.id.text1);
        book = (TextView) findViewById(R.id.book1);
    }

    public void onClick(View v){
        if (v == btnSelectedDate) {
            final Calendar c = Calendar.getInstance();
            int mYear = c.get(Calendar.YEAR);
            int mMonth = c.get(Calendar.MONTH) ;
            int mDay = c.get(Calendar.DAY_OF_MONTH);
            datePickerDialog= new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            display.setText(year + "/" + (monthOfYear+1) + "/" + dayOfMonth);

                            //예약날짜
                            if(dayOfMonth < 15){//경기날짜의 day가 15 미만일때는 전달 1일
                                book.setText(year +  "/" + monthOfYear + "/" + 1);
                            }
                            else {// 경기날짜의 day가 15 이상일때는 전달 15일
                                book.setText(year +  "/" + monthOfYear + "/" + 15);
                            }


                            // 원래는 예약링크도 setText를 통해 조작하려 하였으나, 지금 경기를 진행하지 않아 사이트 url이 열리지 않아 실패하였다.
                        }
                    }, mYear, mMonth, mDay
            );




            datePickerDialog.show();
        }
    }
}
