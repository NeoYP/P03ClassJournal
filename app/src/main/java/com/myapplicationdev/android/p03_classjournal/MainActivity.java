package com.myapplicationdev.android.p03_classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvModule;
    ArrayList<Info> alInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvModule = findViewById(R.id.listViewModule);

        alInfo = new ArrayList<Info>();
        alInfo.add("C347");

        ArrayAdapter<Info> aaModule;
        aaModule = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alModule);

        lvModule.setAdapter(aaModule);

        lvModule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String modules = alInfo.get(position);

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("module", modules);

                startActivity(i);
            }
        });

    }
}
