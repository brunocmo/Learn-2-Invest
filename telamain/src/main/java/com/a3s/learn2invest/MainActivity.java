package com.a3s.learn2invest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button opcao1,opcao2;
    TextView texto;

    //1 para arriscado 0.5 para não;
    double numero;

    //1 ja sabe, 0.5 n sabe;
    double perfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcao1 = (Button) findViewById(R.id.button2);
        opcao1.setTag(0);
        opcao2 = (Button) findViewById(R.id.button1);
        opcao2.setTag(0);
        texto = (TextView) findViewById(R.id.textView3);


        opcao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int status = (Integer)v.getTag();
                if(status ==0){
                    opcao1.setTag(1);
                    texto.setText("Você já investiu em algum produto de renda fixa antes?");
                    opcao1.setText("Sim, já investir");
                    opcao2.setText("Não,nunca investir!");
                    numero=numero+1;
                }

                if(status==1){
                    opcao1.setTag(2);
                    texto.setText("Se algo ruim acontecesse você analasiaria com calma ou retiraria todo valor investido?");
                    opcao1.setText("Retiraria");
                    opcao2.setText("Não retiriaria");
                    perfil=perfil+1;

                }

                if(status==2){
                    opcao1.setTag(3);
                    texto.setText("Se algo ruim acontecesse você analasiaria com calma ou retiraria todo valor investido?");
                    opcao1.setText("Retiraria");
                    opcao2.setText("Não retiraria");
                    perfil=perfil+1;
                }
                if(status==3){
                    opcao1.setTag(4);
                    texto.setText("Se seu investimento começar a render a mais que a projeção. O que você faz?");
                    opcao1.setText("Retiro, pois já tenho o que quero");
                    perfil=perfil+1;

                }
            }
        });

        opcao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int status = (Integer)v.getTag();
                if(status==0){
                    opcao2.setTag(1);
                    opcao2.setText("Não,nunca investir!");
                    texto.setText("Você já investiu em algum produto de renda fixa antes?");
                    opcao1.setText("Sim, já investir");
                    numero=numero+0.5;
                }

                if(status==1){
                    opcao2.setTag(2);
                    texto.setText("Se algo ruim acontecesse você analasiaria com calma ou retiraria todo valor investido?");
                    opcao1.setText("Retiraria");
                    opcao2.setText("Não retiraria");
                    perfil=perfil+0.5;

                }

            }
        });
    }

    
}
