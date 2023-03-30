package com.example.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;


public class StaggeredGridAdapter extends RecyclerView.Adapter<StaggeredGridAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;

    public StaggeredGridAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggered_grid_recyclerview_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredGridAdapter.LinearViewHolder holder, int position) {
        if(position % 2 !=0){
            holder.imageView.setImageResource(R.drawable.image1);
        }else{
            holder.imageView.setImageResource(R.drawable.image2);
        }//奇数设置为image1，偶数设置为image2
        holder.itemView.setOnClickListener(new View.OnClickListener() {  //给列表文字设置点击事件
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "五子登科铭文镜", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;  //列表长度
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
        }
    }

    public interface OnItemClickListener {   //定义接口
        void onClick(int pos);
    }
}
