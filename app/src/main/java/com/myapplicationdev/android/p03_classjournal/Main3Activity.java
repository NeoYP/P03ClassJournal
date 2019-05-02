package com.myapplicationdev.android.p03_classjournal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView tvWeek;
    RadioGroup rg;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_main);

        tvWeek = findViewById(R.id.textViewWeek);
        btnSubmit = findViewById(R.id.buttonSubmit);
        rg = findViewById(R.id.radioGroup);

        Intent i = getIntent();

        String week = i.getStringExtra("week");
        tvWeek.setText(week);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                int selectedBtnID = rg.getCheckedRadioButtonId();
                RadioButton rb = findViewById(selectedBtnID);

                Intent i = new Intent();
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
