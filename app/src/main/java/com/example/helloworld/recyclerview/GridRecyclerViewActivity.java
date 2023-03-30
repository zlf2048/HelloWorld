package com.example.helloworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.helloworld.R;

public class GridRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvGrid;  //声明控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler_view);
        mRvGrid=findViewById(R.id.rv_grid);  //找到控件
        mRvGrid.setLayoutManager(new GridLayoutManager(GridRecyclerViewActivity.this,3));//一行展示3列
        mRvGrid.setAdapter(new GridAdapter(GridRecyclerViewActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecyclerViewActivity.this, "click", Toast.LENGTH_SHORT).show();//设置点击事件
            }
        }));
    }
}