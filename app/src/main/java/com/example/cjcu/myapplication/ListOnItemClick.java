package com.example.cjcu.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

public class ListOnItemClick implements AdapterView.OnItemClickListener{

    public void onItemClick(AdapterView<?>parent,View view,int position,long id){
        Log.i("Capoo","Click");
    }
}
