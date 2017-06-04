package com.example.clair.appmkt.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.
import com.example.clair.appmkt.Modelo.Categorias;
import com.example.clair.appmkt.R;

import java.util.List;

/**
 * Created by Clair on 03/06/2017.
 */

public class CategoriasAdapter extends RecyclerView.Adapter<CategoriasAdapter.MyViewHolder>{

    private Context mContext;
    private List<Categorias> albumList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.categoriacard, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Categorias album = albumList.get(position);
        holder.title.setText(album.getNombre());
        holder.description.setText(album.getDescripcion() + " ");

        //cargando el album utilizando la libreria de Glide
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description;
        public ImageView thumbnail;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }

    public CategoriasAdapter(Context mContext, List<Categorias> albumList){
        this.mContext = mContext;
        this.albumList = albumList;
    }


}
