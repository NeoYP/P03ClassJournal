package com.myapplicationdev.android.p03_classjournal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    int requestCode = 1;

    ListView lvnfo;
    TextView tvWeek;
    TextView tvGrade;
    ArrayAdapter aaModule;
    ArrayList<Info> alInfo;

    Button btnEmail;
    Button btnAdd;
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        tvWeek = findViewById(R.id.textViewWeek);
        tvGrade = findViewById(R.id.textViewGrade);
        lvnfo = findViewById(R.id.listViewModule);

        btnEmail = findViewById(R.id.buttonEmail);
        btnAdd = findViewById(R.id.buttonAdd);
        btnInfo = findViewById(R.id.buttonInfo);

        alInfo = new ArrayList<Info>();

        alInfo.add(new Info("Week 1", "B"));
        alInfo.add(new Info("Week 2", "C"));
        alInfo.add(new Info("Week 3", "A"));

        aaModule = new InfoAdapter(this, R.layout.activity2_main, alInfo);
        lvnfo.setAdapter(aaModule);

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_SUBJECT, "");
                email.putExtra(Intent.EXTRA_TEXT, "");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client:"));
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg"));
                startActivity(rpIntent);
            }
        });
    }
}
