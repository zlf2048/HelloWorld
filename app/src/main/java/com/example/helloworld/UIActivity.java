package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.jump.AActivity;
import com.example.helloworld.recyclerview.DialogActivity;
import com.example.helloworld.recyclerview.RecyclerViewActivity;
import com.example.helloworld.recyclerview.ToastActivity;
import com.example.helloworld.recyclerview.WebViewActivity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnTextView;//声明控件
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnRv;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnCustomDialog;
    private Button mBtnPopupWindow;
    private Button mBtnJump;

    public UIActivity(Button mBtnTextView) {this.mBtnTextView = mBtnTextView;}
    public UIActivity() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);//选中activity_main，长按ctrl+鼠标左键进入
        Button mBtnTextView = findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到TextView演示界面
                Intent intent =new Intent(UIActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton=findViewById(R.id.btn_button);//找到控件
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button演示界面
                Intent intent =new Intent(UIActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnEditText=findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到EditText演示界面
                Intent intent =new Intent(UIActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
        mBtnRadioButton=findViewById(R.id.btn_radioButton);
        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到RadioButton演示界面
                Intent intent =new Intent(UIActivity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnCheckBox=findViewById(R.id.btn_CheckBox);
        mBtnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到CheckBox演示界面
                Intent intent =new Intent(UIActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });
        mBtnImageView=findViewById(R.id.btn_imageview);
        mBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到ImagineView演示界面
                Intent intent =new Intent(UIActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnRv=findViewById(R.id.recyclerview);
        mBtnRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到RecyclerView演示界面
                Intent intent =new Intent(UIActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnWebView=findViewById(R.id.btn_WebView);
        mBtnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到WebView演示界面
                Intent intent =new Intent(UIActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnToast=findViewById(R.id.btn_Toast);
        mBtnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Toast演示界面
                Intent intent =new Intent(UIActivity.this, ToastActivity.class);
                startActivity(intent);
            }
        });
        mBtnDialog=findViewById(R.id.btn_Dialog);
        mBtnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Dialog演示界面
                Intent intent =new Intent(UIActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
        mBtnCustomDialog=findViewById(R.id.btn_custom_dialog);
        mBtnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到CustomDialog演示界面
                Intent intent =new Intent(UIActivity.this, CustomDialogActivity.class);
                startActivity(intent);
            }
        });
        mBtnPopupWindow = findViewById(R.id.btn_PopupWindow);
        mBtnPopupWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到PopupWindow演示界面
                Intent intent =new Intent(UIActivity.this, PopupWindowActivity.class);
                startActivity(intent);
            }
        });
        mBtnJump = findViewById(R.id.btn_jump);
        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //由UIActivity界面跳转到AActivity演示界面
                Intent intent =new Intent(UIActivity.this, AActivity.class);
                startActivity(intent);
            }
        });
    }
}