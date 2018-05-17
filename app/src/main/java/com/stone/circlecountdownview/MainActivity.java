package com.stone.circlecountdownview;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.stone.countdownprogress.CountDownProgress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CountDownProgress progress = findViewById(R.id.countDownProgress);
        progress.setListener(new CountDownProgress.OnProgressListener() {
            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "the count down timer is finish ", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(MainActivity.this, "the count down timer is canceled ", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.startCountDownTime();
            }
        });

        findViewById(R.id.btnReset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.reset();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progress.setText("渣渣");
                progress.setTextSize(18f);
                progress.setTextColor(0xff00ff00);
            }
        }, 8000);
    }
}
