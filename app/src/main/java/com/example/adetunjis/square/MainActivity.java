package com.example.adetunjis.square;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void square(View v) {
        //Get the input and output controls
        EditText input = (EditText) findViewById(R.id.numInput);
        TextView output = (TextView) findViewById(R.id.result);

        // Process the Data that is entered
        int base = Integer.valueOf(input.getText().toString());
        int result = base * base;
        String formattedresult = String.format("%,d", result);

        //Output the result

        output.setText("RESULT: " + formattedresult);




    }



}
