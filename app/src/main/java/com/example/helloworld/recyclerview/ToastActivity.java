package com.example.helloworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloworld.Meinv;
import com.example.helloworld.R;

public class ToastActivity extends AppCompatActivity {

    private Button mBtnToast1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1 = findViewById(R.id.btn_Toast_1);
        OnClick onClick = new OnClick();
        mBtnToast1.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btn_Toast_1:
                    Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_SHORT).show();
                    test();
                    break;
            }
        }

        public void test() {  //测试函数
            Meinv xuemei1;  //定义对象，名字是xuemei1
            int a;  //Meinv = int, xuemei1 = a
            Meinv xuemei = new Meinv();
            xuemei.eat();
        }
    }
}
//健康、发财、幸福快乐