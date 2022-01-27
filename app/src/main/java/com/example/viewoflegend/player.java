package com.example.viewoflegend;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);
        
        // 5선수 모두 버튼에 선수 스펙이 정리된 url을 연결하여 클릭시 바로 이동
        Button p1_button = (Button) findViewById(R.id.p1);
        p1_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://qwer.gg/players/Burdol/bYs3f_9aw7"));
                startActivity(intent);
            }
        });

        Button p2_button = (Button) findViewById(R.id.p2);
        p2_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://qwer.gg/players/Canyon/iN_G1z5i1"));
                startActivity(intent);
            }
        });

        Button p3_button = (Button) findViewById(R.id.p3);
        p3_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://qwer.gg/players/ShowMaker/JUN1aNRpdd"));
                startActivity(intent);
            }
        });

        Button p4_button = (Button) findViewById(R.id.p4);
        p4_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://qwer.gg/players/deokdam/tzWLVP-VzB"));
                startActivity(intent);
            }
        });

        Button p5_button = (Button) findViewById(R.id.p5);
        p5_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://qwer.gg/players/Kellin/utDZy96YDS"));
                startActivity(intent);
            }
        });
    }




}
