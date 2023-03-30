package com.example.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;

    public GridAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public GridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_recyclerview_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.LinearViewHolder holder, int position) {
        holder.textView.setText("Hello"); //列表文字
        holder.itemView.setOnClickListener(new View.OnClickListener() {  //给列表文字设置点击事件
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "五子登科铭文镜", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 80;  //列表长度
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    public interface OnItemClickListener {   //定义接口
        void onClick(int pos);
    }
}
