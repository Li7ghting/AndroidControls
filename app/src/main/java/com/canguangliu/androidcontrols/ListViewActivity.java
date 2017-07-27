package com.canguangliu.androidcontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.canguangliu.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by canguang.liu on 2017-07-27.
 */

public class ListViewActivity extends Activity {


    ListView list_view;
    ListAdapter mAdapter;
    List<Integer> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        list_view = (ListView) findViewById(R.id.list_view);
        list = new ArrayList<Integer>();
        initList();
        mAdapter = new ListViewAdapter(this,list);
        list_view.setAdapter(mAdapter);
    }

    //初始化数组
    private void initList(){
        for(int i=0;i<20;i++){
            list.add(i);
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

}
