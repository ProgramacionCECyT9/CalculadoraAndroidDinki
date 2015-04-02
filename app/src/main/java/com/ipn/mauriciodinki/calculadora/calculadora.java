package com.ipn.mauriciodinki.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class calculadora extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
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

    /*Calculator logic*/

    /*Variables for operations*/

    Double number1, number2, result;
    String operator;

    /*Variables for operations*/

    /*Number Methods*/

    public void onClickButtonOne(View button1){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "1");
    }

    public void onClickButtonTwo(View button2){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "2");
    }

    public void onClickButtonThree(View button3){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "3");
    }

    public void onClickButtonFour(View button4){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "4");
    }

    public void onClickButtonFive(View button5){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "5");
    }

    public void onClickButtonSix(View button6){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "6");
    }

    public void onClickButtonSeven(View button7){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "7");
    }

    public void onClickButtonEight(View button8){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "8");
    }

    public void onClickButtonNine(View button9){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "9");
    }

    public void onClickButtonZero(View button0){
        TextView textview = (TextView)findViewById(R.id.textViewNumberContainer);
        textview.setText(textview.getText() + "0");
    }

    /*Number Methods*/

    /*Operator Methods*/

    public void onClickButtonPlus(View buttonPlus){
        operator = "+";
        onClickOperationCapture(buttonPlus);
    }

    public void onClickButtonMinus(View buttonMinus){
        operator = "-";
        onClickOperationCapture(buttonMinus);
    }

    public void onClickButtonTimes(View buttonTimes){
        operator = "*";
        onClickOperationCapture(buttonTimes);
    }

    public void onClickButtonDivide(View buttonDivide){
        operator = "/";
        onClickOperationCapture(buttonDivide);
    }

    /*Operator Methods*/

    public void onClickButtonCE(View buttonCE){
        number1 = 0.0;
        number2 = 0.0;
        TextView textView = (TextView)findViewById(R.id.textViewNumberContainer);
        textView.setText("");
    }

    public void onClickButtonEquals(View buttonEquals){
        TextView textView = (TextView)findViewById(R.id.textViewNumberContainer);
        number2 = Double.parseDouble(textView.getText().toString());

        if (operator.equals("+")){
            result = number1 + number2;
        }

        if (operator.equals("-")){
            result = number1 - number2;
        }

        if (operator.equals("*")){
            result = number1 * number2;
        }

        if (operator.equals("/")){
            result = number1/number2;
        }

        textView.setText(result.toString());
    }

    public void onClickOperationCapture(View operationCapture){
        TextView textView = (TextView)findViewById(R.id.textViewNumberContainer);
        number1 = Double.parseDouble(textView.getText().toString());
        textView.setText("");
    }
}
