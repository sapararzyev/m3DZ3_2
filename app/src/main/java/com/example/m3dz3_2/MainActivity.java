package com.example.m3dz3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        ArrayList<String> address = new ArrayList<>();
        address.add("масалиева93");
        address.add("черемушка87");
        address.add("запыдный65");
        address.add("юговосток283");
        address.add("КурманЖандатка265");
        address.add("мкр15");
        address.add("Зайнобидинова78");
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);

    }
}