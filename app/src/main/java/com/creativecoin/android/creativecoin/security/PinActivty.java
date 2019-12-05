package com.creativecoin.android.creativecoin.security;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.creativecoin.android.creativecoin.MainActivity;
import com.creativecoin.android.creativecoin.R;

public class PinActivty extends AppCompatActivity {

    private static final String tempPinCode = "1214";
    private static String enteredPinCode = "";

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
                break;
            case R.id.pinNumber1:
                this.enteredPinCode += "1";
                break;
            case R.id.pinNumber2:
                this.enteredPinCode += "2";
                break;
            case R.id.pinNumber3:
                this.enteredPinCode += "3";
                break;
            case R.id.pinNumber4:
                this.enteredPinCode += "4";
                break;
            case R.id.pinNumber5:
                this.enteredPinCode += "5";
                break;
            case R.id.pinNumber6:
                this.enteredPinCode += "6";
                break;
            case R.id.pinNumber7:
                this.enteredPinCode += "7";
                break;
            case R.id.pinNumber8:
                this.enteredPinCode += "8";
                break;
            case R.id.pinNumber9:
                this.enteredPinCode += "9";
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
                pinClear();
            }
        }

    }

    private void pinClear(){
        this.enteredPinCode = "";
    }

}

