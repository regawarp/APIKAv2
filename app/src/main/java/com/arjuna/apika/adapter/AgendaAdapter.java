package com.arjuna.apika.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjuna.apika.Agenda;
import com.arjuna.apika.R;

import java.util.List;

/**
 * Created by Regawa on 10/11/2018.
 */

public class AgendaAdapter extends RecyclerView.Adapter<AgendaAdapter.AgendaViewHolder> {
    List<Agenda> agendaList;
    Context context;

    public AgendaAdapter(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    @Override
    public AgendaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.agenda_view,parent,false);
        AgendaViewHolder agendaBaruViewHolder = new AgendaViewHolder(v);
        return agendaBaruViewHolder;
    }

    @Override
    public void onBindViewHolder(AgendaViewHolder holder, int position) {
        holder.name.setText(agendaList.get(position).getEventName());
        holder.location.setText(agendaList.get(position).getEventLocation());
        holder.date.setText(DateFormat.format("MMMM dd", agendaList.get(position).getEventDate()));
    }

    @Override
    public int getItemCount() {
        return agendaList.size();
    }

    public static class AgendaViewHolder extends RecyclerView.ViewHolder{
        protected TextView name,location,date;
        public AgendaViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.agenda_name);
            location = itemView.findViewById(R.id.agenda_loc);
            date = itemView.findViewById(R.id.agenda_date);
        }
    }
}
