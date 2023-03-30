package com.example.helloworld.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import com.example.helloworld.R;

public class LinearRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvMain;//声明控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);
        mRvMain=findViewById(R.id.rv_main);  //找到控件
        mRvMain.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));  //设置一个线性的布局管理器
        mRvMain.addItemDecoration(new MyDecoration());  //实现分隔线的功能
        mRvMain.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this));
    }

    //高度为1dp的分隔线
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
}