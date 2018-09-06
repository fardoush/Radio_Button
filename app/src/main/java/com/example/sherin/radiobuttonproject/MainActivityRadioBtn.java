package com.example.sherin.radiobuttonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivityRadioBtn extends AppCompatActivity {

    RadioGroup radioGroup;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_radio_btn);
        //find korbo
        radioGroup = findViewById(R.id.radioGroupId);
        button = findViewById(R.id.selectId);
        textView = findViewById(R.id.resultId);
        //btn user click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectMyMovies();
            }
        });
    }

    //choose btn click
    private void selectMyMovies() {

        int id = radioGroup.getCheckedRadioButtonId();// choose the value  and id put in
        if (id == -1) {
            textView.setText("Please select your movie type");
        } else {


            RadioButton radioButton = findViewById(id);//  you are checking will show that
            String value = radioButton.getText().toString();
            textView.setText("Your movie is " + value);// displaying
        }
    }
}
