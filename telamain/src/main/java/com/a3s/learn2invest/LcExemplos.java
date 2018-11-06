package com.a3s.learn2invest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.a3s.learn2invest.Adapter.PostagemAdapter;

import java.util.ArrayList;
import java.util.List;

public class LcExemplos extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc_exemplos);

        recyclerPostagem = (RecyclerView) findViewById(R.id.recyclerview3);
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
        p = new Postagem("Senff (Pós-fixado)","Investimento R$:1.000","Montate:1.365,48",R.drawable.verde,"Risco: Baixo","Taxa: 118% do CDI","Prazo: 1800 Dias");
        this.postagens.add(p);

        p = new Postagem("Senff (Pós-fixado)","Investimento R$:1.000","Montate:1.201,67",R.drawable.verde,"Risco: Baixo","Taxa: 117% do CDI","Prazo: 1080 Dias");
        this.postagens.add(p);

        p = new Postagem("Senff (Pós-fixado)","Investimento R$:1.000","Montate:1.279,12",R.drawable.verde,"Risco: Baixo","Taxa: 117% do CDI","Prazo: 1440 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pré-fixado)","Investimento R$:3.000","Montate:3.406,07",R.drawable.verde,"Risco: Baixo","Taxa: 7.70% a.a","Prazo: 730 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pré-fixado)","Investimento R$:3.000","Montate:4.512,05",R.drawable.verde,"Risco: Baixo","Taxa: 9.80% a.a","Prazo: 1825 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pré-fixado)","Investimento R$:3.000","Montate:3.406,07",R.drawable.verde,"Risco: Baixo","Taxa: 9.35% a.a","Prazo: 1460 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pré-fixado)","Investimento R$:3.000","Montate:3.721,88",R.drawable.verde,"Risco: Baixo","Taxa: 8.70% a.a","Prazo: 1095 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pós-fixado)","Investimento R$:3.000","Montate:4.468,92",R.drawable.verde,"Risco: Baixo","Taxa: 123,50% do CDI","Prazo: 2190 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pós-fixado)","Investimento R$:3.000","Montate:3891,56",R.drawable.verde,"Risco: Baixo","Taxa: 122,00% do CDI","Prazo: 1460 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pós-fixado)","Investimento R$:3.000","Montate:4.163,54",R.drawable.verde,"Risco: Baixo","Taxa: 122,50% do CDI","Prazo: 1825 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pós-fixado)","Investimento R$:3.000","Montate:3.636,64",R.drawable.verde,"Risco: Baixo","Taxa: 121,00% do CDI","Prazo: 1095 Dias");
        this.postagens.add(p);

        p = new Postagem("Avista (Pós-fixado)","Investimento R$: 5.000,00","Montate: 6.833,80",R.drawable.verde,"Risco: Baixo","Taxa: 125% do CDI","Prazo: 1800 Dias");
        this.postagens.add(p);

        p = new Postagem("Facta (Pós-fixado)","Investimento R$: 5.000,00","Montate: 6.905,55",R.drawable.verde,"Risco: Baixo","Taxa: 98% do CDI","Prazo: 1085 Dias");
        this.postagens.add(p);

        p = new Postagem("BRK (Pós-fixado)","Investimento R$: 5.000,00","Montate: 7.923,34",R.drawable.verde,"Risco: Baixo","Taxa: 124% do CDI","Prazo: 1445 Dias");
        this.postagens.add(p);

        p = new Postagem("Senff (Pós-fixado)","Investimento R$:1.000","Montate:1.129,53",R.drawable.amarelo,"Risco: Médio","Taxa: 117% do CDI","Prazo: 721 Dias");
        this.postagens.add(p);

        p = new Postagem("Senff (Pós-fixado)","Investimento R$:1.000","Montate:1.090,12",R.drawable.amarelo,"Risco: Médio","Taxa: 114% do CDI","Prazo: 540 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pós-fixado)","Investimento R$:3.000","Montate:3.401,48",R.drawable.amarelo,"Risco: Médio","Taxa: 119,00% do CDI","Prazo: 730 Dias");
        this.postagens.add(p);

        p = new Postagem("Senff (Pós-fixado)","Investimento R$:1.000","Montate:1.059,66",R.drawable.vermelho,"Risco: Alto","Taxa: 113% do CDI","Prazo: 365 Dias");
        this.postagens.add(p);

        p = new Postagem("Senff (Pós-fixado)","Investimento R$:1.000","Montate:1.025,11",R.drawable.vermelho,"Risco: Alto","Taxa: 103% do CDI","Prazo: 181 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pós-fixado)","Investimento R$:3.000","Montate:3.182,90",R.drawable.vermelho,"Risco: Alto","Taxa: 115,00% do CDI","Prazo: 365 Dias");
        this.postagens.add(p);

        p = new Postagem("Caruana (Pós-fixado)","Investimento R$:3.000","Montate:3.078,92",R.drawable.vermelho,"Risco: Alto","Taxa: 108,00% do CDI","Prazo: 181 Dias");
        this.postagens.add(p);



    }
}

