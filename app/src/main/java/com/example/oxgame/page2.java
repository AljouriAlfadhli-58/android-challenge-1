package com.example.oxgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
 boolean Xturn= true;
    TextView turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

       final Button zero = findViewById(R.id.button0);
       final Button one = findViewById(R.id.button1);
       final Button two = findViewById(R.id.button2);
       final Button three = findViewById(R.id.button3);
        final Button four = findViewById(R.id.button4);
        final Button five = findViewById(R.id.button5);
      final   Button six = findViewById(R.id.button6);
        final Button seven = findViewById(R.id.button7);
       final  Button eight = findViewById(R.id.button8);
       turn= findViewById(R.id.textView2);
       Button reset= findViewById(R.id.button9);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn)
                    checkXwin();
                    zero.setText("X");
            }
                else{
                checkOwin();
                    zero.setText("O");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    chekXwin();
                    one.setText("X");
                }

                else{
                    checkOwin();
                    one.setText("O");
            }
        });
            {
           two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(Xturn){
                        chekXwin();
                        two.setText("X");
                    }

                    else{
                        checkOwin();

                        two.setText("O");
                }

        });
               {
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn) {
                    checkXwin();
                }
                    three.setText("X");
                }
                else{
                    checkOwin();

                    three.setText("O");
            }
        });
            {
         four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn) {
                    checkXwin();
                }
                    four.setText("X");
                }
                else {
                    checkOwin();

                    four.setText("O");
            }
        });
             {
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn) {
                    checkXwin();

                    five.setText("X");
                }
                else{
                    checkOwin();

                    five.setText("O");
                }
            }
        });
             {
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn) {
                    checkXwin();

                    six.setText("X");
                }
                else{
                    checkOwin();

                    six.setText("O");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn) {
                    checkXwin();
                }
                    seven.setText("X");
                }
                else{
                    checkOwin();

                    seven.setText("O");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn) {
                    eight.setText("X");
                }
                else{
                    eight.setText("O");
                }
            }
        });

    }
    public void checkXwin() {
        Xturn = false;
        turn.setText("O Turn");
    }
    public void checkOwin(){
        turn.setText("X Turn");
    }
                Xturn= false;
}