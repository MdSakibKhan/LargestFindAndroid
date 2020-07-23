package com.example.largestscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    TextView tx;
    int score = 0;
    Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        tx = findViewById(R.id.textView);
        rand = new Random();
        setValue();
        tx.setText("Score = "+ score);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt((String) bt1.getText());
                int y = Integer.parseInt((String) bt2.getText());
                if(x>y){
                    score++;
                }
                else{
                    score--;
                }
                tx.setText("Score = "+ score);
                setValue();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt((String) bt1.getText());
                int y = Integer.parseInt((String) bt2.getText());
                if(y>x){
                    score++;
                }
                else{
                    score--;
                }
                tx.setText("Score = "+ score);
                setValue();
            }
        });
    }

    private void setValue() {
        int rd1 = rand.nextInt(1000);
        int rd2 = rand.nextInt(1000);
        bt1.setText(""+rd1);
        bt2.setText(""+rd2);
    }

}