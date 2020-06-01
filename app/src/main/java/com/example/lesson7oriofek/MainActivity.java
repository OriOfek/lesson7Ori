package com.example.lesson7oriofek;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.R.color;
import android.widget.Toast;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    RadioButton[] array;
    int RadiButton;
    LinearLayout screen;
    Switch s;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    boolean isPressed;
    Boolean mode;
    int []colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.rg);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        s = (Switch) findViewById(R.id.switch1);
        screen = (LinearLayout) findViewById(R.id.screen);
        array = new RadioButton[]{rb1, rb2, rb3, rb4};

        colors= new int[]{Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN};
    }

    public void isCliced(View view) {
        isPressed = true;
        if (s.isChecked())
        {
            getWindow().getDecorView().setBackgroundColor(colors[Arrays.asList(array).indexOf((RadioButton)findViewById(rg.getCheckedRadioButtonId()))]);
        }
    }


    public void change(View view) {
        if(s.isChecked())
        {
            Toast.makeText(getApplicationContext(), "button is not use in this function", Toast.LENGTH_LONG).show();
        }
        else
        {
            if (isPressed)
            {
                getWindow().getDecorView().setBackgroundColor(colors[Arrays.asList(array).indexOf((RadioButton) findViewById(rg.getCheckedRadioButtonId()))]);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "you need to press on radio button", Toast.LENGTH_LONG).show();
            }
        }
    }
}