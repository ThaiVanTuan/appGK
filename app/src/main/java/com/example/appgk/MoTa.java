package com.example.appgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MoTa extends AppCompatActivity {
    TextView txt_tenbaihat,txt_tennhacsi,txt_tencasi, txt_mota;
    ImageView imgAnhmota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta);
        imgAnhmota =(ImageView) findViewById(R.id.img_mota) ;
        txt_tenbaihat =(TextView) findViewById(R.id.txt_motatenbaihat) ;
        txt_tennhacsi =(TextView) findViewById(R.id.txt_motatencasi) ;
        txt_tencasi =(TextView) findViewById(R.id.txt_motatennnacsi);
        txt_mota =(TextView) findViewById(R.id.txt_mota);
        Intent intent  = getIntent();
        imgAnhmota.setImageResource(intent.getIntExtra("key1",0));
        txt_tenbaihat.setText(intent.getStringExtra("key2"));
        txt_tennhacsi.setText(intent.getStringExtra("key3"));
        txt_tencasi.setText(intent.getStringExtra("key4"));
        txt_mota.setText(intent.getStringExtra("key5"));
    }
}