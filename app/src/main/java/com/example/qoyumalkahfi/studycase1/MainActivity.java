package com.example.qoyumalkahfi.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "RESTO";
    String var_menu, nama_resto;
    Integer var_porsi, total;
    EditText edMenu, edPorsi;
    Button btnEatbus, btnAbnormal;
    Bundle a,b;
    Integer harga1 = 30000;
    Integer harga2 = 50000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edMenu = (EditText)findViewById(R.id.ed_menu);
        edPorsi = (EditText)findViewById(R.id.ed_porsi);
        btnEatbus = (Button)findViewById(R.id.btn_eatbus);
        btnAbnormal = (Button)findViewById(R.id.btn_abnormal);

        btnAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_2.class);
                var_menu = edMenu.getText().toString();
                var_porsi = Integer.valueOf(edPorsi.getText().toString().trim());
                total = var_porsi * harga1;
                nama_resto = btnAbnormal.getText().toString();

                a = new Bundle();
                a.putString("parse_menu",var_menu);
                a.putInt("parse_porsi", var_porsi);
                a.putInt("parse_total", total);
                a.putString("parse_nama", nama_resto);
                intent.putExtras(a);
                startActivity(intent);

                if(total < 65500) {
                    Toast toast = Toast.makeText(MainActivity.this, "Makan disini aja ", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_2.class);
                var_menu = edMenu.getText().toString();
                var_porsi = Integer.parseInt(edPorsi.getText().toString());
                total = var_porsi * harga2;
                nama_resto = btnEatbus.getText().toString();

                b = new Bundle();
                b.putString("parse_menu",var_menu);
                b.putInt("parse_porsi",var_porsi);
                b.putInt("parse_total",total);
                b.putString("parse_nama", nama_resto);
                intent.putExtras(b);
                startActivity(intent);

                if(total < 65500) {
                    Toast toast = Toast.makeText(MainActivity.this, "Makan disini aja ", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
