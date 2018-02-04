package com.example.qoyumalkahfi.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_2 extends AppCompatActivity {

    TextView tvResto, tvMenu, tvPorsi, tvHarga;
    String get_menu, get_nama;
    Integer get_porsi, get_total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvResto = (TextView) findViewById(R.id.tv_resto);
        tvMenu = (TextView) findViewById(R.id.tv_menu);
        tvPorsi = (TextView) findViewById(R.id.tv_porsi);
        tvHarga = (TextView) findViewById(R.id.tv_harga);

        Bundle a = getIntent().getExtras();
        Bundle b = getIntent().getExtras();

        get_menu = a.getString("parse_menu");
        get_porsi = a.getInt("parse_porsi");
        get_menu = b.getString("parse_menu");
        get_porsi = b.getInt("parse_porsi");
        get_total = a.getInt("parse_total");
        get_total = b.getInt("parse_total");
        get_nama = a.getString("parse_nama");
        get_nama = b.getString("parse_nama");

        tvMenu.setText(get_menu);
        tvPorsi.setText(String.valueOf(get_porsi));
        tvHarga.setText(String.valueOf(get_total));
        tvResto.setText(get_nama);
    }
}
