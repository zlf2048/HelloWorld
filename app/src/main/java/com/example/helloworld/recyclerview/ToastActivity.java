package com.example.helloworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloworld.MainActivity;
import com.example.helloworld.R;
import com.example.helloworld.TextViewActivity;

public class ToastActivity extends AppCompatActivity {

    private Button mBtnToast1,mBtnToast2,mBtnToast3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1 = findViewById(R.id.btn_Toast_1);
        mBtnToast2 = findViewById(R.id.btn_Toast_2);
        mBtnToast3 = findViewById(R.id.btn_Toast_3);
        OnClick onClick = new OnClick();
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast3.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            switch (v.getID()){
                case R.id.btn_Toast_1:
                    break;
                case R.id.btn_Toast_2:
                    break;
                case R.id.btn_Toast_3:
                    break;
            }
        }
    }
}