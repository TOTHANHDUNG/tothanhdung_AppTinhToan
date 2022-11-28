package com.example.apptinhtoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class PhepCong extends AppCompatActivity {
    EditText mNumber1, mNumber2;
    TextView mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_cong);
        mNumber1 = findViewById(R.id.edNumber1);
        mNumber2 = findViewById(R.id.edNumber2);
        mResult = findViewById(R.id.btnTinh2);
        findViewById(R.id.btnTinh2).setOnClickListener(this::btnTinh_click);
    }
    public void btnTinh_click(View view){
        int num1 = Integer.parseInt(mNumber1.getText().toString());
        int num2 = Integer.parseInt(mNumber2.getText().toString());
        int result = 0;
        switch (view.getId()){
            case R.id.btnTinh2:
                result = num1 + num2;
                break;
        }
        Toast.makeText(PhepCong.this, "Ket qua"+result, Toast.LENGTH_SHORT).show();
    }
}