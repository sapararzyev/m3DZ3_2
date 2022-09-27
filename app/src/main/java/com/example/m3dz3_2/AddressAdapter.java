package com.example.m3dz3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddressAdapter extends RecyclerView.Adapter<addressView> {
    private ArrayList<String > address;

    public AddressAdapter(ArrayList<String> address) {
        this.address = address;
    }

    @NonNull
    @Override
    public addressView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new addressView(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull addressView holder, int position) {
    holder.bind(address.get(position));
    }

    @Override
    public int getItemCount() {
        return address.size() ;
    }
}
