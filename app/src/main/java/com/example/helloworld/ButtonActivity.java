package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class ButtonActivity extends AppCompatActivity {

    private Button mbtn3;//声明控件
    private TextView mtv1;//声明控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mbtn3=findViewById(R.id.btn3); //找到控件
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "btn3被点击了！", Toast.LENGTH_SHORT).show();
            }
        });
        mtv1=findViewById(R.id.tv_1);//找到控件
        mtv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "tv1被点击了！", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View view){
        Toast.makeText(this, "btn4被点击了！", Toast.LENGTH_SHORT).show();
    }
}