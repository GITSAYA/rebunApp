package com.ape.imai.saya.rebunapp;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by imai on 2017/07/26.
 */

public class MenuJapanese extends Activity {

    TextView mainManu,subManu,comment;
    ImageView mainImage,subImage;
    ImageButton peke,jap_1,jap_2,jap_3,jap_4,jap_5,jap_6,jap_7,jap_8,jap_9,jap_dentoh,jap_kouzan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);  //画面固定

        // textView
        mainManu = (TextView)findViewById(R.id.mainMenu);               //メインメニュー
            mainManu.setTextColor(Color.WHITE);
            mainManu.setText("メインメニュー");
        subManu = (TextView)findViewById(R.id.subMenu);                 //サブメニュー
        comment = (TextView)findViewById(R.id.comment);                 //コメント

        //imageView
        mainImage = (ImageView)findViewById(R.id.mainImage);
        subImage = (ImageView)findViewById(R.id.subImage);

        //imageButton
        peke = (ImageButton) findViewById(R.id.peke);                   //終了　ぺけマーク

        jap_1 = (ImageButton) findViewById(R.id.imageB1);              //メニュー　９個分
        jap_2 = (ImageButton) findViewById(R.id.imageB2);
        jap_3 = (ImageButton) findViewById(R.id.imageB3);
        jap_4 = (ImageButton) findViewById(R.id.imageB4);
        jap_5 = (ImageButton) findViewById(R.id.imageB5);
        jap_6 = (ImageButton) findViewById(R.id.imageB6);
        jap_7 = (ImageButton) findViewById(R.id.imageB7);
        jap_8 = (ImageButton) findViewById(R.id.imageB8);
        jap_9 = (ImageButton) findViewById(R.id.imageB9);

        jap_dentoh = (ImageButton) findViewById(R.id.imageB_dentoh);    //伝統芸能
        jap_kouzan = (ImageButton) findViewById(R.id.imageB_kouzan);    //高山植物
    }
}
