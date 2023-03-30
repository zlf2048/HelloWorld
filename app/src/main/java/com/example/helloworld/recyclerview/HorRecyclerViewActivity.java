package com.example.helloworld.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.helloworld.R;

public class HorRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvHor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recycler_view);
        mRvHor=findViewById(R.id.rv_hor);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(HorRecyclerViewActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//给linearLayoutManage设置属性
        mRvHor.setLayoutManager(linearLayoutManager);
        mRvHor.addItemDecoration(new HorRecyclerViewActivity.MyDecoration());  //实现分隔线的功能
        mRvHor.setAdapter(new HorAdapter(HorRecyclerViewActivity.this,new HorAdapter.OnItemClickListener(){
            @Override
            public void onClick(int pos){
                Toast.makeText(HorRecyclerViewActivity.this,"click",Toast.LENGTH_SHORT).show();
            }
        }));
    }

    //高度为1dp的分隔线
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight),0);
        }
    }
}