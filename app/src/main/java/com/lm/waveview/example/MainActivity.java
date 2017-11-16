package com.lm.waveview.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lm.waveview.WaveView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        WaveView waveView=(WaveView)findViewById(R.id.wave);
        switch (view.getId()){
            case R.id.btn_begin:
                for(int i=0;i<=100;i+=10)
                    waveView.setProgress(i);
                break;
            case R.id.btn_reset:
                waveView.reset();
                break;
            default:
                break;
        }

    }
}
