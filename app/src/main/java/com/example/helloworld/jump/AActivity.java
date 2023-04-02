package com.example.helloworld.jump;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;
import com.example.helloworld.UIActivity;

public class AActivity extends AppCompatActivity {

    private Button mBtnJump;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mBtnJump = findViewById(R.id.btn_jump);
        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显式跳转方法1
                Intent intent = new Intent(AActivity.this, BActivity.class);//由AActivity跳转到BActivity演示界面
                Bundle bundle = new Bundle();//Activity之间的数据传递
                bundle.putString("name","苞米楼子");//Activity之间的数据传递
                bundle.putInt("number",99);//Activity之间的数据传递
                intent.putExtras(bundle);//Activity之间的数据传递
                startActivity(intent);

                //显式跳转方法2
//                Intent intent =new Intent();
//                intent.setClass(AActivity.this,BActivity.class);
//                startActivity(intent);
            }
        });
    }
}
