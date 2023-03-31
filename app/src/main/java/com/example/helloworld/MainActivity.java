package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.recyclerview.RecyclerViewActivity;
import com.example.helloworld.recyclerview.ToastActivity;
import com.example.helloworld.recyclerview.WebViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;//声明控件
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnRv;
    private Button mBtnWebView;
    private Button mBtnToast;

    public MainActivity(Button mBtnTextView) {this.mBtnTextView = mBtnTextView;}
    public MainActivity() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//选中activity_main，长按ctrl+鼠标左键进入
        Button mBtnTextView = findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到TextView演示界面
                Intent intent =new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton=findViewById(R.id.btn_button);//找到控件
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button演示界面
                Intent intent =new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnEditText=findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到EditText演示界面
                Intent intent =new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
        mBtnRadioButton=findViewById(R.id.btn_radioButton);
        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到RadioButton演示界面
                Intent intent =new Intent(MainActivity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnCheckBox=findViewById(R.id.btn_CheckBox);
        mBtnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到CheckBox演示界面
                Intent intent =new Intent(MainActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });
        mBtnImageView=findViewById(R.id.btn_imageview);
        mBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到ImagineView演示界面
                Intent intent =new Intent(MainActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnRv=findViewById(R.id.recyclerview);
        mBtnRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到RecyclerView演示界面
                Intent intent =new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnWebView=findViewById(R.id.btn_WebView);
        mBtnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到WebView演示界面
                Intent intent =new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnToast=findViewById(R.id.btn_Toast);
        mBtnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Toast演示界面
                Intent intent =new Intent(MainActivity.this, ToastActivity.class);
                startActivity(intent);
            }
        });
    }
}