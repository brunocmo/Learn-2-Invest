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
        Postagem p = new Postagem();
        p = new Postagem("Rico Pré-Fixado","Investimento R$ 100","Montante:320,00", R.drawable.verde,"Risco: Baixo","Taxa: 8,83% a.a.","Prazo: 3 anos");
        this.postagens.add(p);


        p = new Postagem("Rico Pré-Fixado","Investimento R$ 100","Montante:502,40", R.drawable.verde,"Risco: Baixo","Taxa: 8,83% a.a. ","Prazo: 5 anos");
        this.postagens.add(p);


        p = new Postagem("Rico Pré-fixado","Investimento R$ 1.000","Montante:1.507,23", R.drawable.verde,"Risco: Baixo","Taxa: 10,83% a.a. ","Prazo: 5 anos");
        this.postagens.add(p);

        p = new Postagem("RicoLTF Pós-Fixado","Investimento R$ 1.000","Montante:1.337,50", R.drawable.amarelo,"Risco: Médio","Taxa: 6,50 % a.a.","Prazo: 4 anos");
        this.postagens.add(p);


        p = new Postagem("Itaú Pós-Fixado","Investimento R$:100","Montante:194,13", R.drawable.amarelo,"Risco: Médio ","Taxa: 5,69% a.a.+inflação","Prazo: 8 anos");
        this.postagens.add(p);


        p = new Postagem("Itaú Pós-fixado","Investimento R$:1.000","Montante:1942,33", R.drawable.amarelo,"Risco: Médio","Taxa: 5,69% a.a.+inflação ","Prazo: 8 anos");
        this.postagens.add(p);


        p = new Postagem("Itaú Pós-Fixado ","Investimento R$:1.000","Montante:16.412,4", R.drawable.amarelo,"Risco: Médio","Taxa: 5,73% a.a.+inflação","Prazo: 32 anos");
        this.postagens.add(p)


        p = new Postagem(" Itaú Pós-Fixado","Investimento R$:100","Montante:164,03", R.drawable.amarelo,"Risco: Médio","Taxa:5,73% a.a.+inflação ","Prazo: 6 anos");
        this.postagens.add(p);


        p = new Postagem(" Itaú Pós-Fixado","Investimento R$:100","Montante:1.100", R.drawable.amarelo,"Risco: Médio","Taxa: 5,73% a.a.+inflação","Prazo:  17 anos");
        this.postagens.add(p);


    }
}
