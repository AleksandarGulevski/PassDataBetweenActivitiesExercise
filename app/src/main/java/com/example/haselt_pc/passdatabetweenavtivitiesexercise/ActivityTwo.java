package com.example.haselt_pc.passdatabetweenavtivitiesexercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityTwo extends AppCompatActivity {

    @BindView(R.id.textView3)
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ActivityOne.EXTRA_MESSAGE);


        textView3.setText(message);

    }
}
