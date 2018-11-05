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
        p = new Postagem("Banco BTG Pactual S/A","Investimento R$: 5.000","Montate: 40.000",R.drawable.verde,"Risco: Baixo","Taxa: 7.65% a.a");
        this.postagens.add(p);

        p = new Postagem("Banco PAN S.A.","Investimento R$: 5.000","Montate: 40.000",R.drawable.amarelo,"Risco: Medio","Taxa: 115.00% do CDI%");
        this.postagens.add(p);
        p = new Postagem("Banco Caixa Geral","Investimento R$: 100.000","Montate: 250.000",R.drawable.amarelo,"Risco: Medio","Taxa: 8.75% a.a.");
        this.postagens.add(p);

        p = new Postagem("Banco Haitong","Investimento R$: 50.000","Montate: 250.000",R.drawable.amarelo,"Risco: Medio","Taxa: 105.00% do CDI");
        this.postagens.add(p);

        p = new Postagem("Banco Haitong","Investimento R$: 50.000","Montate: 250.000",R.drawable.amarelo,"Risco: Medio","Taxa: 104.50% do CDI");
        this.postagens.add(p);

        p = new Postagem("Banco Caixa Geral","Investimento R$: 100.000","Montate: 250.000",R.drawable.amarelo,"Risco: Medio","Taxa: 9.54% a.a.");
        this.postagens.add(p);

        p = new Postagem("Banco Pine","Investimento Mínimo R$: 20.000","Montate: 40.000",R.drawable.vermelho,"Risco: Alto","Taxa: 119.00% do CDI");
        this.postagens.add(p);

        p = new Postagem("Banco Pine","Investimento Mínimo R$: 20.000","Montate: 40.000",R.drawable.vermelho,"Risco: Alto","Taxa: 120.00% do CDI");
        this.postagens.add(p);

    }
}
