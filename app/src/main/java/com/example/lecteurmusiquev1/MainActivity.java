package com.example.lecteurmusiquev1;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.music01);

        AudioManager am= (AudioManager)getSystemService(context.AUDIO_SERVICE);
        am.setSpeakerphoneOn(true);

        Button button1=(Button)findViewById(R.id.button_pause);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (!mp.isPlaying()){
                    mp.start();
                }
                else{
                    mp.pause();
                }

            }
        });

    }




}
