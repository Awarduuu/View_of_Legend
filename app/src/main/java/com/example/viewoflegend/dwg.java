package com.example.viewoflegend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class dwg extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) { // Fragment2의 첫번째 팀을 선택할 시 실행
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwg);
        
        
        // 선수, 대회 일정, 경기 영상, 소식 버튼을 Intent로 각각의 class에 연결
        Button player_button = (Button) findViewById(R.id.player);
        player_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), player.class);
                startActivity(intent);
            }
        });

        Button match_button = (Button) findViewById(R.id.match);
        match_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), match.class);
                startActivity(intent);
            }
        });

        Button video_button = (Button) findViewById(R.id.video);
        video_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), video.class);
                startActivity(intent);
            }
        });

        Button news_button = (Button) findViewById(R.id.news);
        news_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), news.class);
                startActivity(intent);
            }
        });
    }
}
