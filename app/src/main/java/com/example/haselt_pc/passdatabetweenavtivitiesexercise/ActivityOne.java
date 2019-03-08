package com.example.haselt_pc.passdatabetweenavtivitiesexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ActivityOne extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "extra.message";
    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void PassDataToActivityTwo(View view) {
        Intent intent = new Intent(this, ActivityTwo.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        if (message.length()>0 && message.length()<=20) {
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }else {
            Toast.makeText(ActivityOne.this,
                    "ERROR. SELF-DESTRUCTION SEQUENCE ACTIVATED", Toast.LENGTH_LONG).show();
        }
    }
}
