package com.example.tejaswini.pwcn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Step2 extends AppCompatActivity {
    Button b6,b7,b8,b9,b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b6 =(Button)findViewById(R.id.button5);
        b7 =(Button)findViewById(R.id.button6);
        b8 =(Button)findViewById(R.id.button7);
        b9 =(Button)findViewById(R.id.button8);
        b10 =(Button)findViewById(R.id.butnex2);
        setContentView(R.layout.activity_step2);


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step2.this,Step1.class);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step2.this,Step2.class);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step2.this,Step3.class);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step2.this,Step4.class);
                startActivity(i);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step2.this,Step3.class);
                startActivity(i);
            }
        });

    }
}
