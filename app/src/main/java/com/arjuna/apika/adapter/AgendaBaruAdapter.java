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
 * Created by Regawa on 10/10/2018.
 */

public class AgendaBaruAdapter extends RecyclerView.Adapter<AgendaBaruAdapter.AgendaBaruViewHolder> {
    List<Agenda> agendaList;
    Context context;

    public AgendaBaruAdapter(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    @Override
    public AgendaBaruViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.agenda_baru_view,parent,false);
        AgendaBaruViewHolder agendaBaruViewHolder = new AgendaBaruViewHolder(v);
        return agendaBaruViewHolder;
    }

    @Override
    public void onBindViewHolder(AgendaBaruViewHolder holder, int position) {
        holder.day.setText(DateFormat.format("dd", agendaList.get(position).getEventDate()));
        holder.month.setText(DateFormat.format("MMM", agendaList.get(position).getEventDate()));
        holder.eventName.setText(agendaList.get(position).getEventName());
        holder.eventTime.setText(agendaList.get(position).getEventTime());
    }

    @Override
    public int getItemCount() {
        return agendaList.size();
    }

    public static class AgendaBaruViewHolder extends RecyclerView.ViewHolder{
        protected TextView day,month,eventName,eventTime;
        public AgendaBaruViewHolder(View itemView) {
            super(itemView);
            day = itemView.findViewById(R.id.day);
            month = itemView.findViewById(R.id.month);
            eventName = itemView.findViewById(R.id.event_name);
            eventTime = itemView.findViewById(R.id.event_time);
        }
    }
}
