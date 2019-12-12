package com.example.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn=findViewById(R.id.first_btn);
        startBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
//                Intent intent=new Intent("com.example.intenttest.ACTION_START");
//                intent.addCategory("com.example.intenttest.MY_GATEGORY");
//
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));

                startActivity(intent);
            }
        });

    }
}
