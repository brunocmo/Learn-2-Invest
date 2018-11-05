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

        p = new Postagem("Caruana Financeira","Investimento R$: 10.000","Montate: 40.000",R.drawable.verde,"Risco: Baixo","Taxa: 9.55% a.a");
        this.postagens.add(p);
        p = new Postagem("Caruana Financeira","Investimento R$: 10.000","Montate: 40.000",R.drawable.verde,"Risco: Baixo","Taxa: 11.65% a.a");
        this.postagens.add(p);
        p = new Postagem("Avista","Investimento  R$: 5.000","Montate: 40.000",R.drawable.amarelo,"Risco: Medio","Taxa: 116.00% do CDI");
        this.postagens.add(p);
        p = new Postagem("AgoraCred","Investimento  R$: 5.000","Montate: 40.000",R.drawable.vermelho,"Risco: Alto","Taxa: 124.00% do CDI");
        this.postagens.add(p);


    }
}

