package com.example.comida.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.comida.R;
import com.example.comida.model.equipos;

import java.util.List;

public class EquipoEscogerAdapter extends BaseAdapter {
    private Context context;
    private List<equipos> items;

    public EquipoEscogerAdapter(Context context, List<equipos> items){
        this.context = context;
        this.items = items;
    }
    @Override
    public int getCount() {return items.size();}

    @Override
    public equipos getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {return items.get(position).getId();}
    @Override
    public View getView(int position, View vista, ViewGroup parent){
        ViewHolder viewHolder;
        if(vista == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vista = inflater.inflate(R.layout.layout_equipos_escoger,null);

            viewHolder.logo = vista.findViewById(R.id.logo);
            viewHolder.equipo = vista.findViewById(R.id.equipo);
            vista.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) vista.getTag();
        }
        equipos equipoActual = items.get(position);
        viewHolder.logo.setImageResource(equipoActual.getLogo());
        viewHolder.equipo.setText(equipoActual.getEquipo());
        return vista;
    }

    static class ViewHolder {
        ImageView logo;
        TextView equipo;

    }


}
