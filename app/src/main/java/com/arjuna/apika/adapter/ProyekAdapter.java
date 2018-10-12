package com.arjuna.apika.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arjuna.apika.Agenda;
import com.arjuna.apika.Proyek;
import com.arjuna.apika.R;
import com.arjuna.apika.RincianProyekActivity;

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
    public void onBindViewHolder(ProyekViewHolder holder, final int position) {
        holder.name.setText(proyekList.get(position).getProjectName());
        holder.price.setText(String.valueOf(proyekList.get(position).getProjectPrice()) + " - ");
        holder.due.setText(DateFormat.format("MMM", proyekList.get(position).getProjectDueBid()) + " - ");
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, RincianProyekActivity.class);
                i.putExtra("nama",proyekList.get(position).getProjectName());
//                i.putExtra("kategori",proyekList.get(position).get());
                i.putExtra("kualifikasi",proyekList.get(position).getProjectQualification());
                i.putExtra("harga",String.valueOf(proyekList.get(position).getProjectPrice()));
                i.putExtra("batas_tawar",DateFormat.format("dd MMMM yyyy", proyekList.get(position).getProjectDueBid()));
                i.putExtra("mulai",DateFormat.format("dd MMMM yyyy", proyekList.get(position).getProjectStart()));
                i.putExtra("akhir",DateFormat.format("dd MMMM yyyy", proyekList.get(position).getProjectFinish()));
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return proyekList.size();
    }

    public static class ProyekViewHolder extends RecyclerView.ViewHolder{
        protected TextView name,price,due;
        protected LinearLayout linearLayout;
        public ProyekViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.project_name);
            price =itemView.findViewById(R.id.project_price);
            due = itemView.findViewById(R.id.project_due);
            linearLayout = itemView.findViewById(R.id.ln_proyek_view);
        }
    }
}
