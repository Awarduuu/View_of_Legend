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


public class video extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        
        // 리스트 아이템에 들어갈 값 배열로 생성
        String[] values = {"| 2021 LCK 서머 스플릿 결승 Set4 | 담원기아 vs. T1 게임 하이라이트 | 08.28 |","| 2021 LCK 서머 스플릿 결승 Set3 | 담원기아 vs. T1 게임 하이라이트 | 08.28 |","| 2021 LCK 서머 스플릿 결승 Set2 | 담원기아 vs. T1 게임 하이라이트 | 08.28 |"
        ,"| 2021 LCK 서머 스플릿 결승 Set1 | 담원기아 vs. T1 게임 하이라이트 | 08.28 |","| 2021 LCK 서머 스플릿 준결승 Set3 | 담원기아 vs. 농심 게임 하이라이트 | 08.21 |","| 2021 LCK 서머 스플릿 준결승 Set2 | 담원기아 vs. 농심 게임 하이라이트 | 08.21 |","| 2021 LCK 서머 스플릿 준결승 Set1 | 담원기아 vs. 농심 게임 하이라이트 | 08.21 |"};
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
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9z6bBAjg4EQ&list=PLIWtfvmBcNodMntMgJtOxBgscWsEJL8Nq&index=1"));
            startActivity(intent);
        }
        else if(position == 1){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=W6lkSkSyVjI&list=PLIWtfvmBcNodMntMgJtOxBgscWsEJL8Nq&index=2"));
            startActivity(intent);
        }
        else if(position == 2){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=W6lkSkSyVjI&list=PLIWtfvmBcNodMntMgJtOxBgscWsEJL8Nq&index=3"));
            startActivity(intent);
        }
        else if(position == 3){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9z6bBAjg4EQ&list=PLIWtfvmBcNodMntMgJtOxBgscWsEJL8Nq&index=4"));
            startActivity(intent);
        }
        else if(position == 4){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=IbfZjdZweP8&list=PLIWtfvmBcNodMntMgJtOxBgscWsEJL8Nq&index=9"));
            startActivity(intent);
        }else if(position == 5){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9z6bBAjg4EQ&list=PLIWtfvmBcNodMntMgJtOxBgscWsEJL8Nq&index=10"));
            startActivity(intent);
        }
        else if(position == 6){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9z6bBAjg4EQ&list=PLIWtfvmBcNodMntMgJtOxBgscWsEJL8Nq&index=11"));
            startActivity(intent);
        }

    }
}
