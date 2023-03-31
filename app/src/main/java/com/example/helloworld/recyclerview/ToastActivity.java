package com.example.helloworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloworld.MainActivity;
import com.example.helloworld.R;
import com.example.helloworld.TextViewActivity;

public class ToastActivity extends AppCompatActivity {

    private Button mBtnToast1,mBtnToast2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1 = findViewById(R.id.btn_Toast_1);
        mBtnToast2 = findViewById(R.id.btn_Toast_2);
        OnClick onClick = new OnClick();
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btn_Toast_1:
                    Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_Toast_2:
                    Toast toastCenter = Toast.makeText(getApplicationContext(), "居中Toast", Toast.LENGTH_SHORT);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();
                    break;
            }
        }
    }
}