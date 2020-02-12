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

    //Stack<Character> stack = new Stack<>();
    Stack<Character> sign = new Stack<>();
    String aa=new String();
    TextView textView;
    //int result=66;
    double result=0;
    int count=0;
    int gg=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                aa+=" = ";
                textView.setText(aa);
                String[] array=aa.split(" ");

                //Stack<Integer> operate = new Stack<Integer>();
                Stack<String> stack = new Stack<String>();
                for(int i=0;i<array.length;i++){
                    System.out.println(array[i]);
                }
                for(int i=0; i<array.length; i++) stack.add(array[i]);

                for(int i=1; i<stack.size(); i=i+2){
                    switch (stack.get(i)) {
                        case "*": result = Double.valueOf(stack.get(i-1)) * Double.valueOf(stack.get(i+1));
                            count++;
                            stack.add(i-1, String.valueOf(result));
                            stack.remove(i); stack.remove(i); stack.remove(i); i=i-2;break;
                        case "/": result = Double.valueOf(stack.get(i-1)) / Double.valueOf(stack.get(i+1));
                            count++;
                            stack.add(i-1, String.valueOf(result));
                            stack.remove(i); stack.remove(i); stack.remove(i); i=i-2;break;
                        default: break;
                    }
                }
                for(int i=1; i<stack.size(); i=i+2){
                    if(i==1){
                        result=0;
                        result = result+Double.valueOf(stack.get(i-1));
                    }switch(stack.get(i)){
                        case "+": count++;System.out.print("|"+count+". "+result+" + "+Double.valueOf(stack.get(i+1))+" = ");
                            result = result+Double.valueOf(stack.get(i+1)); break;
                        case "-": count++;System.out.print("|"+count+". "+result+" - "+Double.valueOf(stack.get(i+1))+" = ");
                            result = result-Double.valueOf(stack.get(i+1)); break;
                    }
                }

                textView.setText(Double.toString(result));
                aa="";
            }
        });



    }
    public void cla(View v){
        int a=5;
        if(v.getId()==R.id.button)
            textView.setText(a);
    }
    public void clickSign(View v){
        switch(v.getId()){
            case R.id.plus:
                //stack.push('+');
                aa+=" + ";
                textView.setText(aa);
                break;
            case R.id.sub:
                aa+=" - ";
                textView.setText(aa);
                break;
            case R.id.mul:
                aa+=" * ";
                textView.setText(aa);
                break;
            case R.id.divide:
                aa+=" / ";
                textView.setText(aa);
                break;
                default:
                    textView.setText(aa);
                    break;
        }
        /*if(R.id.equl==v.getId()){
            //String[] array=aa.split(" ");

            int result=0;
            int count=0;
            //Stack<Integer> operate = new Stack<Integer>();
            //Stack<String> stack = new Stack<String>();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
            for(int i=0; i<array.length; i++) stack.add(array[i]);

            for(int i=1; i<stack.size(); i=i+2){
                switch (stack.get(i)) {
                    case "*": result = Integer.valueOf(stack.get(i-1)) * Integer.valueOf(stack.get(i+1));
                        count++;
                        stack.add(i-1, String.valueOf(result));
                        stack.remove(i); stack.remove(i); stack.remove(i); i=i-2;break;
                    case "/": result = Integer.valueOf(stack.get(i-1)) / Integer.valueOf(stack.get(i+1));
                        count++;
                        stack.add(i-1, String.valueOf(result));
                        stack.remove(i); stack.remove(i); stack.remove(i); i=i-2;break;
                    default: break;
                }
            }
            for(int i=1; i<stack.size(); i=i+2){
                if(i==1){
                    result=0;
                    result = result+Integer.valueOf(stack.get(i-1));
                }switch(stack.get(i)){
                    case "+": count++;System.out.print("|"+count+". "+result+" + "+Integer.valueOf(stack.get(i+1))+" = ");
                        result = result+Integer.valueOf(stack.get(i+1)); break;
                    case "-": count++;System.out.print("|"+count+". "+result+" - "+Integer.valueOf(stack.get(i+1))+" = ");
                        result = result-Integer.valueOf(stack.get(i+1)); break;
                }
            }
            textView.setText(result);
        }
        else
            textView.setText(aa);*/
    }

    public void clickNumber(View v){
        switch (v.getId()){
            case R.id.number0:
                //stack.push('0');
                aa+="0";
                break;
            case R.id.number1:
                //stack.push('1');
                aa+="1";
                break;
            case R.id.number2:
                //stack.push('2');
                aa+="2";
                break;
            case R.id.number3:
                //stack.push('3');
                aa+="3";
                break;
            case R.id.number4:
                //stack.push('4');
                aa+="4";
                break;
            case R.id.number5:
                //stack.push('5');
                aa+="5";
                break;
            case R.id.number6:
                //stack.push('6');
                aa+="6";
                break;
            case R.id.number7:
                //stack.push('7');
                aa+="7";
                break;
            case R.id.number8:
                //stack.push('8');
                aa+="8";
                break;
            case R.id.number9:
                //stack.push('9');
                aa+="9";
                break;
        }
        textView.setText(aa);

    }
}
