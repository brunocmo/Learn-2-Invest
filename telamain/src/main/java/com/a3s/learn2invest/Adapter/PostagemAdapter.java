package com.a3s.learn2invest.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.a3s.learn2invest.R;

public class PostagemAdapter extends RecyclerView.Adapter <PostagemAdapter.MyViewHolder>{


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemlista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cdb_items,viewGroup,false);

        return new MyViewHolder(itemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.nome.setText("banco A");
        myViewHolder.valorMinimo.setText("1200");
        myViewHolder.nome.setText("banco B");
        myViewHolder.valorMinimo.setText("1200");
        myViewHolder.nome.setText("banco C");
        myViewHolder.valorMinimo.setText("1200");
        myViewHolder.nome.setText("banco D");
        myViewHolder.valorMinimo.setText("1200");


    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nome;
        private TextView valorMinimo;
        //private TextView taxa;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.nome);
            valorMinimo = itemView.findViewById(R.id.valor);

        }
    }
}
