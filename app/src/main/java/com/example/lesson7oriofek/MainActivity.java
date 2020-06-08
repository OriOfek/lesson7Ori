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

    int[] array;
    Switch s;
    LinearLayout screen;
    RadioGroup rg;
    boolean isPressed;
    int []colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.rg);
        s = (Switch) findViewById(R.id.switch1);
        screen = (LinearLayout) findViewById(R.id.screen);

        array = new int[]{R.id.rb1, R.id.rb2, R.id.rb3, R.id.rb4};
        colors= new int[]{Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN};
    }

    public void isCliced(View view) {
        isPressed = true;
        if (s.isChecked())
        {
            screen.setBackgroundColor(colors[getIndex(array,rg.getCheckedRadioButtonId())]);
        }
    }

    public  int getIndex(int[] array,int indexToFind)
    {
        for (int i = 0;i < array.length;i++)
        {
            if(array[i] == indexToFind)
            {
                return i;
            }
        }
        return -1;
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
                screen.setBackgroundColor(colors[getIndex(array,rg.getCheckedRadioButtonId())]);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "you need to press on radio button", Toast.LENGTH_LONG).show();
            }
        }
    }
}