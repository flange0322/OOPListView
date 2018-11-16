package com.example.cjcu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final String[] arrayList = getResources().getStringArray(R.array.citylist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);

        ListView mListView = (ListView)findViewById(R.id.List_test);
        mListView.setAdapter(adapter);

        AdapterView.OnItemClickListener item1 = (a,b,c,d) ->
        {
            Log.i("Capoo",arrayList[c]);
        };
        mListView.setOnItemClickListener(item1);*/

        String [][] data ={
                {"牡羊座","3月21日~4月20日"},
                {"金牛座","4月21日~5月20日"},
                {"雙子座","5月21日~6月20日"},
                {"巨蟹座","6月21日~7月20日"},
                {"獅子座","7月21日~8月20日"},
                {"處女座","8月21日~9月20日"},
                {"天枰座","9月21日~10月20日"},
                {"天蠍座","10月21日~11月20日"},
                {"射手座","11月21日~12月20日"},
                {"魔羯座","12月21日~1月20日"},
                {"水瓶座","1月21日~2月20日"},
                {"雙魚座","2月21日~3月20日"},
        };

        List<Map<String,Object>> list = new ArrayList<>();
        for(int i = 0;i<data.length;i++){
            Map<String,Object> tmp = new HashMap<>();
            tmp.put("name",data[i][0]);
            tmp.put("date",data[i][1]);
            list.add(tmp);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                list,
                R.layout.simpleadapterlayout,
                new String[]{"name","date"},
                new int[]{R.id.tv_Name,R.id.tv_Date}
        );

        ListView mListView = (ListView)findViewById(R.id.List_test);
        mListView.setAdapter(simpleAdapter);
        AdapterView.OnItemClickListener item1 = (a,b,c,d) ->
        {
            Toast.makeText(this,String.format("星座: %s,日期: %s",data[c][0],data[c][1]),Toast.LENGTH_SHORT).show();
        };
        mListView.setOnItemClickListener(item1);
    }
}
