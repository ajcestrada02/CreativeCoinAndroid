package com.creativecoin.android.creativecoin.security;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import com.creativecoin.android.creativecoin.MainActivity;
import com.creativecoin.android.creativecoin.R;

public class PinActivty extends AppCompatActivity {

    private static final String tempPinCode = "1214";
    private static String enteredPinCode = "";
    private int rate = 0;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pin_main);
    }

    protected boolean isPinCorrect(String entPincode){
        return entPincode.equals(tempPinCode) ? true : false;
    }

    public void getClickedNumber(View view) {
        switch (view.getId()) {
            case R.id.pinNumber0:
                this.enteredPinCode += "0";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber1:
                this.enteredPinCode += "1";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber2:
                this.enteredPinCode += "2";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber3:
                this.enteredPinCode += "3";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber4:
                this.enteredPinCode += "4";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber5:
                this.enteredPinCode += "5";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber6:
                this.enteredPinCode += "6";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber7:
                this.enteredPinCode += "7";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber8:
                this.enteredPinCode += "8";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinNumber9:
                this.enteredPinCode += "9";
                rate++;
                addRatingListener(rate);
                break;
            case R.id.pinClear:
                pinClear();
                Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show();
                break;
        }
        // Uncomment this for debugging purposes
//        Toast.makeText(this, this.enteredPinCode, Toast.LENGTH_SHORT).show();

        if(this.enteredPinCode.length() == 4){
            if(isPinCorrect(this.enteredPinCode)){
                Intent pinIntent = new Intent(PinActivty.this, MainActivity.class);
                startActivity(pinIntent);
                pinClear();
            }else{
                Toast.makeText(this, "Incorrect pin code", Toast.LENGTH_SHORT).show();

                // Adding delay to clear the pin rating bar icon
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        pinClear();
                    }
                },500);

            }
        }

    }

    private void pinClear(){
        rate=0;
        addRatingListener(rate);
        this.enteredPinCode = "";
    }

    private void addRatingListener(int rate){
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        ratingBar.setRating(rate);
        /*ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(PinActivty.this,
                        "Rating changed, current rating "+ ratingBar.getRating(),
                        Toast.LENGTH_SHORT).show();
            }
        });*/


    }
}

