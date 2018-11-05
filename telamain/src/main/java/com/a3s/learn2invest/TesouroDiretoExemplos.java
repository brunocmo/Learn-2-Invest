package com.a3s.learn2invest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.a3s.learn2invest.Adapter.PostagemAdapter;

import java.util.ArrayList;
import java.util.List;

public class TesouroDiretoExemplos extends AppCompatActivity {
    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lci_exemplos);

        recyclerPostagem = (RecyclerView) findViewById(R.id.recyclerview4);
        //definindo layout
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);


        //definir o adapter
        prepararPostagens();
        PostagemAdapter adapter= new PostagemAdapter(postagens);

        recyclerPostagem.setAdapter(adapter);


    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Santander","R$: 100.00","10.000",R.drawable.verde,"Risco: Baixo","12% a.a");
        this.postagens.add(p);
        p = new Postagem("Inter","R$: 100.00","100.000",R.drawable.vermelho,"Risco: Baixo","12% a.a");
        this.postagens.add(p);
        p = new Postagem("Casas Bahia","R$: 100.00","100.000",R.drawable.amarelo,"Risco: Baixo","12% a.a");
        this.postagens.add(p);
        p = new Postagem("Caixa Economica","R$: 100.00","100.000",R.drawable.vermelho,"Risco: Baixo","12% a.a");
        this.postagens.add(p);

    }
}
