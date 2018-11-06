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

        p   = new Postagem("Banco BTG Pactual S/A","Investimento Mínimo R$: 10.000","Montate: 40.000",R.drawable.verde,"Risco: Baixo","Taxa: 6.80% a.a");
        this.postagens.add(p);

        p  = new Postagem("Banco Ribeirao Preto S/A","Investimento Mínimo R$: 100.000","Montate: 250.000",R.drawable.verde,"Risco: Baixo","Taxa: 7.29% a.a");
        this.postagens.add(p);

        p = new Postagem("Banco Ribeirao Preto S/A","Investimento Mínimo R$: 50.000","Montate: 250.000",R.drawable.verde,"Risco: Baixo","Taxa: 7.75% a.a");
        this.postagens.add(p);

        p = new Postagem("Modal Mais (Pós-fixado)","Investimento: R$ 1.000","Montante: 1.012,90", R.drawable.verde,"Risco: Baixo","Taxa: 85% do CDI","Prazo: 91 dias");
        this.postagens.add(p);

        p = new Postagem("Modal Mais (Pré-fixado)","Investimento: R$ 1.000","Montante: 1.011,67", R.drawable.verde,"Risco: Baixo","Taxa: 4,91 a.a.","Prazo: 91 dias");
        this.postagens.add(p);

        p = new Postagem("BTG Pactual S/A (Pré-fixado)","Investimento: R$ 1.000","Montante: 1.029,71", R.drawable.verde,"Risco: Baixo","Taxa: 6,0% a.a.","Prazo: 180 dias");
        this.postagens.add(p);

        p = new Postagem("Barigui Financeira","Investimento: R$ 10.000","Montante: 14.346,94", R.drawable.verde,"Risco: Baixo","Taxa: 11,04% a.a.","Prazo: 1445 dias");
        this.postagens.add(p);

        p = new Postagem("ABRK Financeira","Investimento: R$ 10.000","Montante: 13.847,10", R.drawable.verde,"Risco: Baixo","Taxa: 11,64% a.a.","Prazo: 1085 dias");
        this.postagens.add(p);

        p = new Postagem("Avista Financeira","Investimento: R$ 10.000","Montante: 15.889,32", R.drawable.amarelo,"Risco: Médio","Taxa: 12,48% a.a.","Prazo: 1445 dias");
        this.postagens.add(p);

        p = new Postagem("Facta Financeira (Pós-fixado)","Investimento: R$ 10.000","Montante: 12.039,41", R.drawable.amarelo,"Risco: Médio","Taxa: 9,87% a.a.","Prazo: 725 dias");
        this.postagens.add(p);

        p = new Postagem("Barigui Cia Hipotecária","Investimento: R$ 10.000","Montante: R$ 11.993,53", R.drawable.amarelo,"Risco: Médio","Taxa: 19,9% a.a.","Prazo: 720 dias");
        this.postagens.add(p);

        p = new Postagem("Barigui Cia Hipotecária","Investimento: R$ 5.000,00","Montante: 5.996,77", R.drawable.amarelo,"Risco: Médio","Taxa: 19,9% a.a.","Prazo: 720 dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$: 1.000","Montate: 1.011,67",R.drawable.amarelo,"Risco: Médio","Taxa: 4.91% a.a","Prazo: 91 Dias");
        this.postagens.add(p);

        p = new Postagem("BTG Pactual S/A (Pré-fixado)","Investimento: R$ 10.000","Montante: 10.680,26", R.drawable.vermelho,"Risco: Alto","Taxa: 6,8 a.a.","Prazo: 360 dias");
        this.postagens.add(p);

        p = new Postagem("Banco Ribeirão Preto (Pré-fixado)","Investimento: R$ 10.000","Montante: 14.857,07", R.drawable.vermelho,"Risco: Alto","Taxa: 6,84% a.a.","Prazo: 1800 dias");
        this.postagens.add(p);

        p = new Postagem("Modal (Pré-fixado)","Investimento R$: 1.000","Montate: 1.012,90",R.drawable.vermelho,"Risco: Alto","Taxa: 85% do CDI","Prazo: 91 Dias");
        this.postagens.add(p);





    }
}
