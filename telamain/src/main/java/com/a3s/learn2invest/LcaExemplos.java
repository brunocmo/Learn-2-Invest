package com.a3s.learn2invest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.a3s.learn2invest.Adapter.PostagemAdapter;

import java.util.ArrayList;
import java.util.List;

public class LcaExemplos extends AppCompatActivity {


    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lca_exemplos);
        recyclerPostagem = (RecyclerView) findViewById(R.id.recyclerview5);
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
        p = new Postagem("Fibra","Investimento R$: 5.000,00","Montate: 5.410,82",R.drawable.verde,"Risco: baixo","Taxa: 115% do CDI","Prazo: 365 dias");
        this.postagens.add(p);

        p = new Postagem("Banco Máxima","Investimento R$: 10.000,00","Montate: 10.830,84",R.drawable.verde,"Risco: baixo","Taxa: 93% do CDI","Prazo: 365 dias");
        this.postagens.add(p);

        p = new Postagem("BRK","Investimento R$: 10.000,00","Montate: 10.821,86",R.drawable.verde,"Risco: baixo","Taxa: 92% do CDI","Prazo: 365 dias");
        this.postagens.add(p);

        p = new Postagem("Fibra","Investimento R$: 5.000,00","Montate: 5.410,82",R.drawable.verde,"Risco: baixo","Taxa: 115% do CDI","Prazo: 365 dias");
        this.postagens.add(p);


        p = new Postagem("Banco ABC Brasil","Investimento R$: 50.000,00","Montate: 50.935,04",R.drawable.amarelo,"Risco: Médio","Taxa: 87% do CDI","Prazo: 125 dias");
        this.postagens.add(p);

        p = new Postagem("Banco ABC Brasil","Investimento R$: 50.000,00","Montate: 53.226,68",R.drawable.amarelo,"Risco: Médio","Taxa: 91% do CDI","Prazo: 365 dias");
        this.postagens.add(p);

        p = new Postagem("Banco Indusval","Investimento R$: 5.000,00","Montate: 5.864,697",R.drawable.amarelo,"Risco: Médio","Taxa: 17,2% a.a","Prazo: 4 meses");
        this.postagens.add(p);

        p = new Postagem("Facta","Investimento R$: 10.000,00","Montate: 12.004,02",R.drawable.amarelo,"Risco: Médio","Taxa: 20,0% a.a","Prazo: 2 anos");
        this.postagens.add(p);

        p = new Postagem("Bancoob","Investimento R$: 10.000,00","Montate: 10.609,99",R.drawable.amarelo,"Risco: Médio","Taxa: 87% do CDI","Prazo: 361 Dias");
        this.postagens.add(p);

        p = new Postagem("Banco BTG","Investimento R$: 5.000,00","Montate: 6.109,54",R.drawable.amarelo,"Risco: Médio","Taxa: 115% do CDI","Prazo: 361 Dias");
        this.postagens.add(p);

        p = new Postagem("Banco ABC Brasil","Investimento R$: 50.000,00","Montate: 55.213,48",R.drawable.vermelho,"Risco: Alto","Taxa: 92% do CDI","Prazo: 545 dias");
        this.postagens.add(p);

    }
}


