package com.a3s.learn2invest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.a3s.learn2invest.Adapter.PostagemAdapter;

import java.util.ArrayList;
import java.util.List;

public class lciExemplos extends AppCompatActivity {

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

    Postagem p = new Postagem();

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.011,67",R.drawable.amarelo,"Risco: Médio","Taxa: 4.91% a.a","Prazo: 91 Dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$:1.000","Montate:1.012,90",R.drawable.vermelho,"Risco: Alto","Taxa: 85% do CDI","Prazo: 91 Dias");
        this.postagens.add(p);



    }
}
