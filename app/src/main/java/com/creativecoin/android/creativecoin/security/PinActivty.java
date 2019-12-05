package com.creativecoin.android.creativecoin.security;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.creativecoin.android.creativecoin.MainActivity;
import com.creativecoin.android.creativecoin.R;

public class PinActivty extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pin_main);


        if(isPinCorrect()){
            Intent pinIntent = new Intent(PinActivty.this, MainActivity.class);
            startActivity(pinIntent);
        }else{

        }
    }

    protected boolean isPinCorrect(){

        return false;
    }

    private String getInputPin(){

        return "";
    }
}

