package com.example.m3dz3_2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class addressView extends RecyclerView.ViewHolder {

    TextView textView;

    public addressView(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.textView);
    }
    public void bind(String address){
    textView.setText(address);
    }
}
