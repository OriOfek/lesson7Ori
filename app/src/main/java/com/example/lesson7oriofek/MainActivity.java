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

public class MainActivity extends AppCompatActivity {

    LinearLayout screen;
    Switch s;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    boolean isPressed;
    Boolean mode;
    Color []colores;
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
        //colores = {Color.GREEN, Color.BLUE, Color.RED, Color.YELLOW};
    }

    public void changeMode(View view) {
        mode = !mode;
    }

    public void isCliced(View view) {
        isPressed = true;
        if (mode)
        {

        }
    }
}
