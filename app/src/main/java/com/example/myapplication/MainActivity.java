package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang, etLebar, etTinggi;
    private Button btPencet;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btPencet = findViewById(R.id.btPencet);
        tvHasil = findViewById(R.id.tvHasil);

        btPencet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang = Integer.parseInt(etPanjang.getText().toString());
                Integer lebar = Integer.parseInt(etLebar.getText().toString());
                Integer tinggi = Integer.parseInt(etTinggi.getText().toString());
                tvHasil.setText(String.valueOf(panjang*lebar*tinggi));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Yazidal Ghozali", MainActivity.class.getSimpleName() + "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Yazidal Ghozali", MainActivity.class.getSimpleName() + "onResume");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Yazidal Ghozali", MainActivity.class.getSimpleName() + "onStop");
    }
}

