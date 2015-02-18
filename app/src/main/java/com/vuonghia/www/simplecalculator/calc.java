package com.vuonghia.www.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calc extends Activity implements View.OnClickListener {
    Button one, two, three,
            four, five, six,
            seven, eight, nine,
            zero, add, sub,
            mul, div, cancel, equal;

    EditText display;
    int op1;
    int op2;
    String optr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        cancel = (Button) findViewById(R.id.cancel);
        equal = (Button) findViewById(R.id.equal);
        display = (EditText) findViewById(R.id.display);

        try {
            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            cancel.setOnClickListener(this);
            add.setOnClickListener(this);
            sub.setOnClickListener(this);
            mul.setOnClickListener(this);
            div.setOnClickListener(this);
            equal.setOnClickListener(this);
        } catch (Exception ex) {
/*            ex.printStackTrace();*/
        }
    }

    public void operation(){
        if(optr.equals("+")){
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 += op2;
            display.setText("Result: " + Integer.toString(op1));
        } else if(optr.equals("-")){
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 -= op2;
            display.setText("Result: " + Integer.toString(op1));
        } else if(optr.equals("*")){
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 *= op2;
            display.setText("Result: " + Integer.toString(op1));
        } else if(optr.equals("/")){
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 /= op2;
            display.setText("Result: " + Integer.toString(op1));
        } else {
            op1 = 0;
            op2 = 0;
            display.setText("Please re-enter values!");
            // Take care multiple presses operators
        }
    }

    @Override
    public void onClick(View arg0) {
        Editable str = display.getText();
        switch(arg0.getId()){
            case R.id.one:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(one.getText());
                display.setText(str);
                break;
            case R.id.two:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(two.getText());
                display.setText(str);
                break;
            case R.id.three:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(three.getText());
                display.setText(str);
                break;
            case R.id.four:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(four.getText());
                display.setText(str);
                break;
            case R.id.five:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(five.getText());
                display.setText(str);
                break;
            case R.id.six:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(six.getText());
                display.setText(str);
                break;
            case R.id.seven:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(seven.getText());
                display.setText(str);
                break;
            case R.id.eight:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(eight.getText());
                display.setText(str);
                break;
            case R.id.nine:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(nine.getText());
                display.setText(str);
                break;
            case R.id.zero:
                if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                }
                str = str.append(zero.getText());
                display.setText(str);
                break;
            case R.id.cancel:
                op1 = 0;
                op2 = 0;
                display.setText("");
//                display.setHint("Perform Operation :)");
                break;
            case R.id.add:
                optr = "+";
                if(op1 == 0){
                    op1 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                } else {
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 + op2;
                    display.setText("Result: " + Integer.toString(op1));
                }
                break;
            case R.id.sub:
                optr = "-";
                if(op1 == 0){
                    op1 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                } else {
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 - op2;
                    display.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.mul:
                optr = "*";
                if(op1 == 0){
                    op1 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                } else {
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 * op2;
                    display.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.div:
                optr = "/";
                if(op1 == 0){
                    op1 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    display.setText("");
                } else {
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 / op2;
                    display.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.equal:
                if(!optr.equals(""/*null*/)){
                    if(op2 != 0){
                        if(optr.equals("+")){
                            display.setText("");
                            /*op1 = op1 + op2;*/
                            display.setText("Result : " + Integer.toString(op1));
                        } else if(optr.equals("-")){
                            display.setText("");
                            /* op1 = op1 - op2;*/
                            display.setText("Result : " + Integer.toString(op1));
                        } else if(optr.equals("*")){
                            display.setText("");
                            /* op1 = op1 * op2;*/
                            display.setText("Result : " + Integer.toString(op1));
                        } else if(optr.equals("/")){
                            display.setText("");
                            /* op1 = op1 / op2;*/
                            display.setText("Result : " + Integer.toString(op1));
                        }
                    } else {
                        operation();
                    }
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
