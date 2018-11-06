package com.a3s.learn2invest.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.a3s.learn2invest.Postagem;
import com.a3s.learn2invest.R;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter <PostagemAdapter.MyViewHolder>{

    private List<Postagem>postagems;
    public PostagemAdapter(List<Postagem> p) {
        this.postagems =p;

    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View itemlista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cdb_items,viewGroup,false);

        return new MyViewHolder(itemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Postagem postagem = postagems.get(i);
        myViewHolder.nome.setText(postagem.getNome());
        myViewHolder.montante.setText(postagem.getMontante());
        myViewHolder.valorMinimo.setText(postagem.getInvestimentoMinimo());
        myViewHolder.risco.setText(postagem.getRisco());
        myViewHolder.imagem.setImageResource(postagem.getImagem());
        myViewHolder.taxa.setText(postagem.getTaxa());
        myViewHolder.prazo.setText(postagem.getPrazo());
    }

    @Override
    public int getItemCount() {
        return postagems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nome;
        private TextView valorMinimo;
        private TextView risco;
        private ImageView imagem;
        private TextView montante;
        private TextView taxa;
        private TextView prazo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.nome);
            valorMinimo = itemView.findViewById(R.id.investimentoMinimo);
            risco = itemView.findViewById(R.id.risco);
            imagem = itemView.findViewById(R.id.imagem);
            taxa = itemView.findViewById(R.id.taxa);
            montante = itemView.findViewById(R.id.montante);
            prazo = itemView.findViewById(R.id.prazo);



        }
    }
}
