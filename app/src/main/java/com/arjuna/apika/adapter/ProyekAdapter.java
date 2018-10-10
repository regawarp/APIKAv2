package com.arjuna.apika.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjuna.apika.Agenda;
import com.arjuna.apika.Proyek;
import com.arjuna.apika.R;

import java.util.List;

/**
 * Created by Regawa on 10/10/2018.
 */

public class ProyekAdapter extends  RecyclerView.Adapter<ProyekAdapter.ProyekViewHolder>{
    List<Proyek> proyekList;
    Context context;

    public ProyekAdapter(List<Proyek> proyekList) {
        this.proyekList = proyekList;
    }

    @Override
    public ProyekViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.proyek_view,parent,false);
        ProyekViewHolder proyekViewHolder = new ProyekViewHolder(v);
        return proyekViewHolder;
    }

    @Override
    public void onBindViewHolder(ProyekViewHolder holder, int position) {
        holder.name.setText(proyekList.get(position).getProjectName());
        holder.price.setText(String.valueOf(proyekList.get(position).getProjectPrice()) + " - ");
        holder.due.setText(DateFormat.format("MMM", proyekList.get(position).getProjectDueBid()) + " - ");
    }

    @Override
    public int getItemCount() {
        return proyekList.size();
    }

    public static class ProyekViewHolder extends RecyclerView.ViewHolder{
        protected TextView name,price,due;
        public ProyekViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.project_name);
            price =itemView.findViewById(R.id.project_price);
            due = itemView.findViewById(R.id.project_due);
        }
    }
}
