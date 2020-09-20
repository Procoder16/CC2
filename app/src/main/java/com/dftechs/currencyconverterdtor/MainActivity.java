package com.dftechs.currencyconverterdtor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        Log.i("Info","Button Pressed");

        EditText input= (EditText) findViewById(R.id.amount);

        String amountInDollars=input.getText().toString();

        double amountInDollarsDouble= Double.parseDouble(amountInDollars);

        double amountInRupeesDouble= amountInDollarsDouble*73.61;

        String amountInRupeesString = String.format("%.2f",amountInRupeesDouble);

        Toast.makeText(this, "$ " + amountInDollars + " is " + amountInRupeesString + " rupees", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}