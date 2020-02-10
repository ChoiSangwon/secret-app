package com.example.secret_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Scanner;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Stack<Integer> stack = new Stack<>();
    String aa=new String();
    TextView textView;
    int result=66;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);


    }
    public void clickSign(View v){
        switch(v.getId()){
            case R.id.plus:
                //stack.push(-1);
                aa+='+';
                break;
            case R.id.sub:
                aa+='-';
                break;
            case R.id.mul:
                aa+='*';
                break;
            case R.id.divide:
                aa+='/';
                break;
        }
        if(R.id.equl==v.getId()){
            if(result == 66){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
                startActivity(intent);
            }
        }
        else
            textView.setText(aa);
    }

    public void clickNumber(View v){
        switch (v.getId()){
            case R.id.number0:
                stack.push(0);
                aa+='0';
                break;
            case R.id.number1:
                stack.push(1);
                aa+='1';
                break;
            case R.id.number2:
                stack.push(2);
                aa+='2';
                break;
            case R.id.number3:
                stack.push(3);
                aa+='3';
                break;
            case R.id.number4:
                stack.push(4);
                aa+='4';
                break;
            case R.id.number5:
                stack.push(5);
                aa+='5';
                break;
            case R.id.number6:
                stack.push(6);
                aa+='6';
                break;
            case R.id.number7:
                stack.push(7);
                aa+='7';
                break;
            case R.id.number8:
                stack.push(8);
                aa+='8';
                break;
            case R.id.number9:
                stack.push(9);
                aa+='9';
                break;
        }
        textView.setText(aa);

    }
}
