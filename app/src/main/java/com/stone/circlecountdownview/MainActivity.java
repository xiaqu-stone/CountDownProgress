package com.stone.circlecountdownview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CountDownProgress progress = (CountDownProgress) findViewById(R.id.countDownProgress);
        progress.setFinishListener(new CountDownProgress.OnFinishListener() {
            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "the count down timer is finish ", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.startCountDownTime();
            }
        });

    }
}
