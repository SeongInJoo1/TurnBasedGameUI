package com.example.client;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameOverActivity extends AppCompatActivity {

    Button b_restart, b_exit;
    TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        Intent intent = getIntent();
        b_restart = findViewById(R.id.button_restart);
        b_exit = findViewById(R.id.button_exit);
        textView = findViewById(R.id.textView_win);

        //승리, 패배값 가져오기
        int gameover = Integer.valueOf(intent.getStringExtra("gameover"));

        //승리, 패배 문구 설정, 사진으로 변경 예정
        if(gameover==0){
            textView.setText("승리했습니다.");
        }
        else{
            textView.setText("패배했습니다.");
        }

        //재시작 버튼
        b_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(intent);

            }
        });

        //종료 버튼
        b_exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.runFinalization();
                System.exit(0);
            }
        });
    }
}