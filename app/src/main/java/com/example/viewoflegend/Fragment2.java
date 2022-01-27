package com.example.viewoflegend;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment2, container, false);
        // 실질적으로 10개 팀의 UI와 데이터를 모두 작성하기엔 이번 프로젝트에 무리가 있다고 판단
        // 하나의 팀만 예시로 들어도 기능을 모두 구현하고, 보여줄 수 있으므로 버튼 하나만 활성화
        ImageButton button1 = (ImageButton) v.findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), dwg.class);
                startActivity(intent);

            }
        });
        return v;


    }



}






