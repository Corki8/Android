package com.ahstu.corki.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        final TextView textView=(TextView)findViewById(R.id.textView);

        Button button[]=new Button[10];
        button[0]=(Button)findViewById(R.id.button_num0);         //数值键
        button[1]=(Button)findViewById(R.id.button_num1);
        button[2]=(Button)findViewById(R.id.button_num2);
        button[3]=(Button)findViewById(R.id.button_num3);
        button[4]=(Button)findViewById(R.id.button_num4);
        button[5]=(Button)findViewById(R.id.button_num5);
        button[6]=(Button)findViewById(R.id.button_num6);
        button[7]=(Button)findViewById(R.id.button_num7);
        button[8]=(Button)findViewById(R.id.button_num8);
        button[9]=(Button)findViewById(R.id.button_num9);

        Button  button_clear=(Button)findViewById(R.id.button_clear),     //功能键
                button_delete=(Button)findViewById(R.id.button_delete),
                button_add=(Button)findViewById(R.id.button_add),
                button_sub=(Button)findViewById(R.id.button_sub),
                button_mul=(Button)findViewById(R.id.button_mul),
                button_div=(Button)findViewById(R.id.button_div),
                button_rat=(Button)findViewById(R.id.button_rat),
                button_equal=(Button)findViewById(R.id.button_equal),
                button_point=(Button)findViewById(R.id.button_point);


        button[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText(textView.getText().toString() + "0");
                }
            });

        button[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "1");
            }
        });
        button[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "2");
            }
        });
        button[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "3");
            }
        });
        button[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "4");
            }
        });
        button[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "5");
            }
        });
        button[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "6");
            }
        });
        button[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "7");
            }
        });
        button[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "8");
            }
        });
        button[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "9");
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {//clear
            @Override
            public void onClick(View view) {
                textView.setText(null);
            }
        });

        button_delete.setOnClickListener(new View.OnClickListener() {//delete
            @Override
            public void onClick(View view) {
                String str=textView.getText().toString();
                if(str.length()!=0)                            //避免textView为空时，按delete异常退出
                textView.setText(str.substring(0,str.length()-1));
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "＋");
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "－");
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "×");
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "÷");
            }
        });

        button_rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "％");
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText().toString();
                if(!s.equals(""))
                textView.setText(Count.run(s));
            }
        });

        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + ".");
            }
        });


    }
}
