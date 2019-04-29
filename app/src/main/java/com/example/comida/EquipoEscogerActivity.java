package com.example.comida;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.comida.adapter.EquipoEscogerAdapter;
import com.example.comida.model.equipos;

import java.util.ArrayList;
import java.util.List;

public class EquipoEscogerActivity extends AppCompatActivity {
    private Context mContext;
    private ListView equipos;
    private EquipoEscogerAdapter equiposAdapter;
    private List<equipos> equipoArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos_escoger);
        mContext=this;
        equipoArray.add(new equipos(1,"alitas" ,R.drawable.alitas ));
        equipoArray.add(new equipos(2,"bife" ,R.drawable.bife ));
        equipoArray.add(new equipos(3,"cevice" ,R.drawable.ceviche ));
        equipoArray.add(new equipos(4,"costillas" ,R.drawable.costillas ));
        equipoArray.add(new equipos(5,"homburguesa" ,R.drawable.hamburguesa ));
        equipoArray.add(new equipos(6,"hotdog " ,R.drawable.fricase ));
        equipoArray.add(new equipos(7,"hotdog " ,R.drawable.chairo ));
        equipoArray.add(new equipos(8,"hotdog " ,R.drawable.silpancho ));
        equipoArray.add(new equipos(9,"hotdog " ,R.drawable.hotdog ));

        initViews();
        addEvents();
    }
    private void initViews() {
        equipos = findViewById(R.id.evento);

        equiposAdapter = new EquipoEscogerAdapter(mContext, equipoArray);
        equipos.setAdapter(equiposAdapter);
    }

    private void addEvents() {
    }
}
