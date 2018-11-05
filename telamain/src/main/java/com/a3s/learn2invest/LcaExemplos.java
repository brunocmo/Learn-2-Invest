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
        p = new Postagem("Banco BTG Pactual S/A","Investimento R$: 10.000","Montate: 40.000",R.drawable.verde,"Risco: Baixo","Taxa: 6.80% a.a");

        this.postagens.add(p);

        p = new Postagem("Banco Ribeirao Preto S/A","Investimento R$: 100.000","Montate: 250.000",R.drawable.verde,"Risco: Baixo","Taxa: 7.29% a.a");

        this.postagens.add(p);

        p = new Postagem("Banco Ribeirao Preto S/A","Investimento R$: 50.000","Montate: 250.000",R.drawable.verde,"Risco: Baixo","Taxa: 7.75% a.a");

        this.postagens.add(p);

    }
}


