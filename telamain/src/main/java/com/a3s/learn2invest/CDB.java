package com.a3s.learn2invest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.a3s.learn2invest.Adapter.PostagemAdapter;

public class CDB extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdb);

        recyclerView = (RecyclerView) findViewById(R.id.recyclevVew);
        //definindo layout
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //definir o adapter
        PostagemAdapter adapter= new PostagemAdapter();

        recyclerView.setAdapter(adapter);


    }
}
