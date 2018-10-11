package com.arjuna.apika.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjuna.apika.Loker;
import com.arjuna.apika.R;

import java.util.List;

/**
 * Created by Regawa on 10/11/2018.
 */

public class LokerAdapter extends RecyclerView.Adapter<LokerAdapter.LokerViewHolder>{
    List<Loker> lokerList;
    Context context;

    public LokerAdapter(List<Loker> lokerList) {
        this.lokerList = lokerList;
    }

    @Override
    public LokerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.loker_view,parent,false);
        LokerAdapter.LokerViewHolder lokerViewHolder = new LokerViewHolder(v);
        return lokerViewHolder;
    }

    @Override
    public void onBindViewHolder(LokerViewHolder holder, int position) {
        holder.position.setText(lokerList.get(position).getLokerPosition());
        holder.company.setText(lokerList.get(position).getLokerCompany() + " - ");
        holder.due.setText(DateFormat.format("MMM", lokerList.get(position).getLokerDue()) + " - ");
        holder.quota.setText(String.valueOf(lokerList.get(position).getLokerQuota()));
    }

    @Override
    public int getItemCount() {
        return lokerList.size();
    }

    public static class LokerViewHolder extends RecyclerView.ViewHolder {
        protected TextView position,company,due,quota;
        public LokerViewHolder(View itemView) {
            super(itemView);
            position = itemView.findViewById(R.id.loker_position);
            company = itemView.findViewById(R.id.loker_company);
            due = itemView.findViewById(R.id.loker_due);
            quota = itemView.findViewById(R.id.loker_quota);
        }
    }
}
