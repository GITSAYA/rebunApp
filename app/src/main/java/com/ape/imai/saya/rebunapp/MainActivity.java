package com.ape.imai.saya.rebunapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements DialogInterface.OnClickListener{
    TextView title,titleEn,selectLang;
    Button japanese,english;
    ImageView symbol,startmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);  //画面固定

        // textView
        title = (TextView)findViewById(R.id.textTitle);               //title
            title.setTextColor(Color.WHITE);
            title.setText("礼文町郷土資料館音声ガイダンス");

        titleEn = (TextView)findViewById(R.id.textTitleEn);           //title english
            titleEn.setTextColor(Color.WHITE);
            titleEn.setText("Rebun Town Historical Museum Voice Guidance");

        selectLang = (TextView) findViewById(R.id.textSelectLan);     //言語選択
            selectLang.setTextColor(Color.WHITE);
            selectLang.setText("言語選択　Select language");

        // button
        japanese = (Button)findViewById(R.id.buttonJP);               //日本語
            japanese.setText("日本語");
            japanese.setTextColor(Color.WHITE);

        english = (Button)findViewById(R.id.buttonEN);                //英語
            english.setText("English");
            english.setTextColor(Color.WHITE);

        //imageView
        symbol = (ImageView)findViewById(R.id.imageSymbol);          // symbol
        startmap = (ImageView)findViewById(R.id.imageStartMap);      //スタート画面画像

    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

    }
}
