package com.ahsru.corki.phone;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PhoneActivity extends AppCompatActivity {

    private Button buttoncall;
    private TextView view;
    private Vibrator vibrator;
    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_xhdpi);


        view=(TextView)findViewById(R.id.textView);
        Button button0=(Button)findViewById(R.id.button0);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);
        Button button6=(Button)findViewById(R.id.button6);
        Button button7=(Button)findViewById(R.id.button7);
        Button button8=(Button)findViewById(R.id.button8);
        Button button9=(Button)findViewById(R.id.button9);
        Button button10=(Button)findViewById(R.id.button10);
        Button button11=(Button)findViewById(R.id.button11);


        soundPool=new SoundPool(10, AudioManager.STREAM_MUSIC,5);
        final int music=soundPool.load(this,R.raw.button18,1);

        vibrator=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        button0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"0");  //显示号码
                vibrator.vibrate(new long[]{70,60},-1);       //振动效果
                soundPool.play(music,1,1,0,0,1);              //按钮音效
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"1");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"2");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"3");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"4");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"5");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"6");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"7");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"8");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"9");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"*");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });

        button11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                view.setText(view.getText().toString()+"#");
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
            }
        });


        buttoncall=(Button)this.findViewById(R.id.buttoncall);
        buttoncall.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String phoneNum = view.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phoneNum));//call button

                soundPool.play(music,1,1,0,0,1);
                try {
                    PhoneActivity.this.startActivity(intent);}
                catch (Exception e){
                    System.out.println(e);}
            }
        });


        Button button_delete=(Button)findViewById(R.id.button_delete);
        button_delete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                vibrator.vibrate(new long[]{70,60},-1);
                soundPool.play(music,1,1,0,0,1);
                String s=view.getText().toString();
                if (s.length()!=0)
                    view.setText(s.substring(0, s.length() - 1));
            }

        });





    }
}
