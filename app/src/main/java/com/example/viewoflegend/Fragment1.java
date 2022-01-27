package com.example.viewoflegend;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

public class Fragment1 extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment1, container, false);

        // xml의 listview id를 반드시 "@android:id/list"로 해줘야 한다.
        // list item에 들어갈 내용 배열로 정리
        String[] values = new String[] {"美언론 “페이커, 돈 아닌 의무감에 T1 잔류”", "T1, 게임단 내 확진자 발생...사옥 폐쇄 후 방역 조치 중", "[LPL] '사실상 오피셜' 노페 정노철 iG 감독, 소속팀과 '작별'", "'데프트-베릴' 봇듀오 성사…DRX 2022 로스터 발표 [오피셜]", "e스포츠 게임단 창단·운영 기업에 조세혜택","[뉴스] 발걸음 멈춘 LCK 최강 탑 라이너 '칸' 김동하 은퇴"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

        return rootView;
    }

    //아이템 클릭 이벤트
    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        String strText = (String) l.getItemAtPosition(position);
        Log.d("Fragment: ", position + ": " +strText);
        Toast.makeText(this.getContext(), "클릭: " + position +" " + strText, Toast.LENGTH_SHORT).show(); // 토스트 메시지 출력
        
        // 각 아이템에 링크 연결
        if(position == 0){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=410&aid=0000836191"));
            startActivity(intent);
        }
        else if(position ==1){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=442&aid=0000143483"));
            startActivity(intent);
        }
        else if(position ==2){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=445&aid=0000033552"));
            startActivity(intent);
        }
        else if(position ==3){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=311&aid=0001381609"));
            startActivity(intent);
        }
        else if(position ==4){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=144&aid=0000779072"));
            startActivity(intent);
        }
        else if(position ==5){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sports.news.naver.com/news.nhn?oid=442&aid=0000143445"));
            startActivity(intent);
        }

    }



}
