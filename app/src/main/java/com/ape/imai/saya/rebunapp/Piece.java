package com.ape.imai.saya.rebunapp;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;


/**
 * Created by imai on 2017/07/27.
 */

public class Piece extends Activity {
    TextView heading;
    ImageView centerImg;
    ImageButton saisei;
    ImageButton volume;
    ImageButton menuIcon;
    Button nextArrow;
    MediaPlayer mediaPlayer;
    //rawに入れた曲
    int[] mp3Sounds = new int[]{R.raw.display0, R.raw.display1, R.raw.display2,
            R.raw.display3, R.raw.display4,R.raw.display5,R.raw.display6,R.raw.display7,R.raw.display8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_piece);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);  //画面固定

        mediaPlayer = MediaPlayer.create(this, mp3Sounds[0]);  //mp3セット

        //textview 見出し
        heading = (TextView) findViewById(R.id.heading);
        heading.setText("①成立と自然 : 島の成り立ちと自然環境");

        //imageview
        centerImg = (ImageView) findViewById(R.id.centerImg);

        //imagebutton
        saisei = (ImageButton) findViewById(R.id.saisei);
        // リスナーをボタンに登録
        saisei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 音楽再生
                if (mediaPlayer.isPlaying()) {                          //PLAY中の場合
                    mediaPlayer.pause();                                //PAUSE

                } else {                                                 //PAUSE中の場合
                    mediaPlayer.start();                                //再生スタート
                }
            }
        });

        volume = (ImageButton) findViewById(R.id.volume);
        menuIcon = (ImageButton) findViewById(R.id.menuIcon);
        nextArrow = (Button) findViewById(R.id.nextArrow);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.release();
    }

}