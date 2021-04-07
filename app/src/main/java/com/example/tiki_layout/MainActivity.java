package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SendingData {

    TextView tvThanhTienMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvThanhTienMain = findViewById(R.id.tvThanhTienMain);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,BelowFragment.newInstance("0"))
                .commit();
    }

    @Override
    public void sendData(String data) {
//        Toast.makeText(this,data,Toast.LENGTH_LONG).show();
        tvThanhTienMain.setText(data);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,BelowFragment.newInstance(data))
                .commit();
    }
}