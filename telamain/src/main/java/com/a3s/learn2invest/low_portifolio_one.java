package com.a3s.learn2invest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.a3s.learn2invest.MainActivity.montante_final;


public class low_portifolio_one extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_portifolio_one);

        double valor_low_one = Integer.parseInt(montante_final);

        double valor_1 = valor_low_one*0.5;
            String strValorOne = Double.toString(valor_1);
        double valor_2 = valor_low_one*0.175;
            String strValorTwo = Double.toString(valor_2);
        double valor_3 = valor_low_one*0.25;
            String strValorThree = Double.toString(valor_3);
        double valor_4 = valor_low_one*0.175;
            String strValorFour = Double.toString(valor_3);
        double soma = valor_1 + valor_2 + valor_3 + valor_4;
            String strSoma = Double.toString(soma);

        TextView textView = findViewById(R.id.textView5);
        textView.setText(montante_final);

        TextView textView2 = findViewById(R.id.textView12);
        textView2.setText(strValorOne);

        TextView textView3 = findViewById(R.id.textView13);
        textView3.setText(strValorTwo);

        TextView textView4 = findViewById(R.id.textView14);
        textView4.setText(strValorThree);

        TextView textView5 = findViewById(R.id.textView15);
        textView5.setText(strValorFour);

        TextView textView6 = findViewById(R.id.textView16);
        textView6.setText(strSoma);




    }


}
