package com.example.tejaswini.pwcn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Step4 extends AppCompatActivity {
    Button b16,b17,b18,b19,b20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b16 =(Button)findViewById(R.id.button13);
        b17 =(Button)findViewById(R.id.button14);
        b18 =(Button)findViewById(R.id.button15);
        b19 =(Button)findViewById(R.id.button16);
        b20 =(Button)findViewById(R.id.butnex2);
        setContentView(R.layout.activity_step4);


        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step4.this,Step1.class);
                startActivity(i);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step4.this,Step2.class);
                startActivity(i);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step4.this,Step3.class);
                startActivity(i);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step4.this,Step4.class);
                startActivity(i);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step4.this,Generalreport.class);
                startActivity(i);
            }
        });
    }
}
