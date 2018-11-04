package com.a3s.learn2invest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button exemplos,simular;
    String[] SPINNERVALUES = {};
    Intent intent;
    String SpinnerValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        exemplos= (Button) findViewById(R.id.ButtonExemplos);
        simular= (Button) findViewById(R.id.ButtonSimular);


        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.opcoes,android.R.layout.
                simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerValue = (String)spinner.getSelectedItem();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        exemplos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch(SpinnerValue){
                    case "LC":
                        intent = new Intent(MainActivity.this, LcExemplos.class);
                        startActivity(intent);
                        break;

                    case "LCA":
                        intent = new Intent(MainActivity.this, LcaExemplos.class);
                        startActivity(intent);
                        break;

                    case "LCI":
                        intent = new Intent(MainActivity.this, lciExemplos.class);
                        startActivity(intent);
                        break;

                    case "CDB":
                        intent = new Intent(MainActivity.this, CDB.class);
                        startActivity(intent);
                        break;

                    case "Dêbentures":
                        intent = new Intent(MainActivity.this, debenturesExemplo.class);
                        startActivity(intent);
                        break;

                    case "Tesouro Direto":
                        intent = new Intent(MainActivity.this, TesouroDiretoExemplos.class);
                        startActivity(intent);
                        break;

                }
            }
        });


        simular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch(SpinnerValue){
                    case "LC":
                        intent = new Intent(MainActivity.this,Lcsimulador.class);
                        startActivity(intent);
                        break;

                    case "LCA":
                        intent = new Intent(MainActivity.this, LcaSimulador.class);
                        startActivity(intent);
                        break;

                    case "LCI":
                        intent = new Intent(MainActivity.this, LciSimulador.class);
                        startActivity(intent);
                        break;

                    case "CDB":
                        intent = new Intent(MainActivity.this, CDBsimulador.class);
                        startActivity(intent);
                        break;

                    case "Dêbentures":
                        intent = new Intent(MainActivity.this, debenturesSimulador.class);
                        startActivity(intent);
                        break;

                    case "Tesouro Direto":
                        intent = new Intent(MainActivity.this, TesouroDiretoSimulador.class);
                        startActivity(intent);
                        break;

                }
            }
        });
























    }


    }

    

