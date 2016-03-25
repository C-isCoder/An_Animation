package com.example.iscoder.an_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.iscoder.yellow5a5.candlesanimlib.CandlesAnimView;

public class MainActivity extends AppCompatActivity {
    private CandlesAnimView mCandlesAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCandlesAnim = (CandlesAnimView) findViewById(R.id.candles_view);
      /*  mCandlesAnim.setStopAnimListener(new CandlesAnimView.StopAnimListener() {
            @Override
            public void OnAnimStop() {

            }
        });
        mCandlesAnim.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 5000);*/
    }
}
