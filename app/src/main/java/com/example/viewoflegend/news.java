package com.example.viewoflegend;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class news extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);

        // 리스트 아이템에 들어갈 값 배열로 생성
        String[] values = {"[뉴스] 발걸음 멈춘 LCK 최강 탑 라이너 '칸' 김동하 은퇴","LCK 최고 탑 라이너의 퇴장… 담원, ‘칸’ 김동하 은퇴식 4일 개최","“쇼캐 잔류, 우승에 대한 자신감과 믿음 덕분”","담원 기아 2022 로스터 발표, 선수들의 각오는?",
        "'캐니언' 김건부, \"22시즌, 'T1'과 만나고 파…만났을 때 가장 재밌어\"","'버돌·캐니언·쇼메·덕담·켈린' 담원 기아, 2022년 로스터 공개 [오피셜]","[오피셜] 담원 기아, '체이시'와 계약 종료…'하차니' 코치는 재계약"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values){
            @Override

            public View getView(int position, View convertView, ViewGroup parent)

            {

                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                tv.setTextColor(Color.WHITE);

                return view;

            }


        };
        setListAdapter(adapter);
    }

    // 각 리스트아이템에 링크 연결
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + "selected", Toast.LENGTH_LONG).show();
        if(position == 0){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=442&aid=0000143445"));
            startActivity(intent);
        }
        else if(position == 1){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=109&aid=0004520996"));
            startActivity(intent);
        }
        else if(position == 2){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=005&aid=0001488602"));
            startActivity(intent);
        }
        else if(position == 3){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=236&aid=0000219169"));
            startActivity(intent);
        }
        else if(position == 4){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=311&aid=0001380402"));
            startActivity(intent);
        }else if(position == 5){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=311&aid=0001380269"));
            startActivity(intent);
        }
        else if(position == 6){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=347&aid=0000158309"));
            startActivity(intent);
        }

    }
}
