package com.a3s.learn2invest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.a3s.learn2invest.Adapter.PostagemAdapter;

import java.util.ArrayList;
import java.util.List;

public class CDB extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdb);

        recyclerPostagem = (RecyclerView) findViewById(R.id.recyclerPostagem);
        //definindo layout
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);


        //definir o adapter
        prepararPostagens();
        PostagemAdapter adapter= new PostagemAdapter(postagens);

        recyclerPostagem.setAdapter(adapter);


    }

    public void prepararPostagens(){
        Postagem p = new Postagem();
        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.466,40",R.drawable.verde,"Risco: Baixo","Taxa: 7.70% a.a","Prazo: 2160 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.954,56",R.drawable.verde,"Risco: Baixo","Taxa: 7.96% a.a","Prazo: 3600 Dias");
        this.postagens.add(p);


        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.327,89",R.drawable.verde,"Risco: Baixo","Taxa: 8.42% a.a","Prazo: 1440 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.301,25",R.drawable.verde,"Risco: Baixo","Taxa: 8.52% a.a","Prazo: 1360 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.226,63",R.drawable.verde,"Risco: Baixo","Taxa: 8.22% a.a","Prazo: 1096 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.165,64",R.drawable.verde,"Risco: Baixo","Taxa: 7.53% a.a","Prazo: 900 Dias");
        this.postagens.add(p);

        p = new Postagem("Banco PAN","Investimento R$: 10.000,00","Montate: 11.764,04",R.drawable.verde,"Risco: Baixo","Taxa: 106% do CDI","Prazo: 721 Dias");
        this.postagens.add(p);



        p = new Postagem("BS2","Investimento R$: 5.000,00","Montate: 5.643,91",R.drawable.verde,"Risco: Baixo","Taxa: 112% do CDI","Prazo: 540 Dias");
        this.postagens.add(p);


        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.052,05",R.drawable.amarelo,"Risco: Médio","Taxa: 6.31% a.a","Prazo: 181 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.052,05",R.drawable.amarelo,"Risco: Médio","Taxa: 6.31% a.a","Prazo: 181 Dias");
        this.postagens.add(p);


        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.127,08",R.drawable.amarelo,"Risco: Médio","Taxa: 7.23% a.a","Prazo: 731 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.139,88",R.drawable.amarelo,"Risco: Médio","Taxa: 7.23% a.a","Prazo: 800 Dias");
        this.postagens.add(p);

        p = new Postagem("Banco Indusval","Investimento R$: 10.000,00","Montate: 15.078,1",R.drawable.amarelo,"Risco: Médio","Taxa: 115% do CDI","Prazo: 1445 Dias");
        this.postagens.add(p);


        p = new Postagem("Modal","Investimento R$: 10.000,00","Montate: 15.105,98",R.drawable.amarelo,"Risco: Médio","Taxa: 112% do CDI","Prazo: 1445 Dias");
        this.postagens.add(p);



        p = new Postagem("Modal (Pós-fixado)","Investimento R$:1.000","Montate:1.003,26",R.drawable.vermelho,"Risco: Alto","Taxa: 85% do CDI","Prazo: 30 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.003,11",R.drawable.vermelho,"Risco: Alto","Taxa: 5.18% a.a","Prazo: 30 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.006,69",R.drawable.vermelho,"Risco: Alto","Taxa: 5.30% a.a","Prazo: 60 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.009,69",R.drawable.vermelho,"Risco: Alto","Taxa: 5.36% a.a","Prazo: 90 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.013,49",R.drawable.vermelho,"Risco: Alto","Taxa: 5.45% a.a","Prazo: 120 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.016,79",R.drawable.vermelho,"Risco: Alto","Taxa: 5.44% a.a","Prazo: 150 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.021,00",R.drawable.vermelho,"Risco: Alto","Taxa: 5.50% a.a","Prazo: 181 Dias");
        this.postagens.add(p);


        p = new Postagem("Banco Daycoval","Investimento R$:20.000,00","Montate:20.397,1",R.drawable.vermelho,"Risco: Alto","Taxa: 96,50% do CDI","Prazo: 120 Dias");
        this.postagens.add(p);


        p = new Postagem("Banco Parána)","Investimento R$:20.000,00","Montate:21.464,4",R.drawable.vermelho,"Risco: Alto","Taxa: 102,50% do CDI","Prazo: 363 Dias");
        this.postagens.add(p);


        p = new Postagem("Banco Plural Brasil","Investimento R$:20.000,00","Montate:20.522,9",R.drawable.vermelho,"Risco: Alto","Taxa:97,50% do CDI","Prazo: 125 Dias");
        this.postagens.add(p);


        p = new Postagem("Banco Daycoval","Investimento R$:20.000,00","Montate:21.461,5",R.drawable.vermelho,"Risco: Alto","Taxa: 100% do CDI","Prazo: 367 Dias");
        this.postagens.add(p);


        p = new Postagem("Paraná Banco","Investimento R$:20.000,00","Montate:23.456,7",R.drawable.vermelho,"Risco: Alto","Taxa: 104% do CDI","Prazo: 721 Dias");
        this.postagens.add(p);


        p = new Postagem("Banco Brasil Plural","Investimento R$:20.000,00","Montate:23.569,2",R.drawable.vermelho,"Risco: Alto","Taxa: 103% do CDI","Prazo: 725 Dias");
        this.postagens.add(p);


        p = new Postagem("Banco Daycoval","Investimento R$:20.000,00","Montate:23.475",R.drawable.vermelho,"Risco: Alto","Taxa: 100,50% do CDI","Prazo: 725 Dias");
        this.postagens.add(p);


        p = new Postagem("Modal","Investimento R$:5.000,00","Montate:8.323,8",R.drawable.vermelho,"Risco: Alto","Taxa: 111% do CDI","Prazo: 1800 Dias");
        this.postagens.add(p);


        p = new Postagem("NBC Bank","Investimento R$:5.000,00","Montate:8.477,3",R.drawable.vermelho,"Risco: Alto","Taxa: 115% do CDI","Prazo: 1800 Dias");
        this.postagens.add(p);



    }
}
