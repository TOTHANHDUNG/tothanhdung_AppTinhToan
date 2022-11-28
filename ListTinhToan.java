package com.example.apptinhtoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListTinhToan extends AppCompatActivity {
    ListView lvTinhToan;
    ArrayList<String> arrayCourse;


    int vitri=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tinh_toan);
        lvTinhToan = (ListView) findViewById(R.id.lisViewTinhtoan);
        arrayCourse =  new ArrayList<>();


        arrayCourse.add("Phép cộng");
        arrayCourse.add("Phép trừ");
        arrayCourse.add("Phép nhân");
        arrayCourse.add("Phép chia");
        arrayCourse.add("Phép Logarit");
        arrayCourse.add("Tìm nghiệm của PT: ax+b");
        arrayCourse.add("Tìm nghiệm của PT: ax^2 + bx + c");
        final ArrayAdapter adapter = new ArrayAdapter(
                ListTinhToan.this,
                android.R.layout.simple_list_item_1,
                arrayCourse
        );
        lvTinhToan.setAdapter(adapter);

       lvTinhToan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if(i == 0){
                   Intent myIntent0=new Intent(ListTinhToan.this, PhepCong.class);
                   startActivity(myIntent0);
               }else if(i == 1){
                   Intent myIntent1=new Intent(ListTinhToan.this, PhepTru.class);
                   startActivity(myIntent1);
               }else if(i == 2){
                   Intent myIntent2=new Intent(ListTinhToan.this, PhepNhan.class);
                   startActivity(myIntent2);
               }else if(i ==3){
                   Intent myIntent3=new Intent(ListTinhToan.this, PhepChia.class);
                   startActivity(myIntent3);
               }else if(i == 4){
                   Intent myIntent4=new Intent(ListTinhToan.this, PhepLagarit.class);
                   startActivity(myIntent4);
               }else if(i==5){
                   Intent myIntent5=new Intent(ListTinhToan.this, PTbac1.class);
                   startActivity(myIntent5);
               }else{
                   Intent myIntent6=new Intent(ListTinhToan.this, PTbac1.class);
                   startActivity(myIntent6);
               }
           }
       });
    }



}