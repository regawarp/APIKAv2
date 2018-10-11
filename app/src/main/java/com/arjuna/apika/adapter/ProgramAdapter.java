package com.arjuna.apika.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arjuna.apika.ProgramSubmission;
import com.arjuna.apika.Proyek;
import com.arjuna.apika.R;

import java.util.List;

/**
 * Created by Regawa on 10/11/2018.
 */

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ProgramViewHolder>{
    List<ProgramSubmission> programSubmissionList;
    Context context;

    public ProgramAdapter(List<ProgramSubmission> programSubmissionList) {
        this.programSubmissionList = programSubmissionList;
    }

    @Override
    public ProgramAdapter.ProgramViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.program_view,parent,false);
        ProgramAdapter.ProgramViewHolder proyekViewHolder = new ProgramViewHolder(v);
        return proyekViewHolder;
    }

    @Override
    public void onBindViewHolder(ProgramAdapter.ProgramViewHolder holder, int position) {
        holder.name.setText(programSubmissionList.get(position).getProgSubName());
        holder.nominal.setText(String.valueOf(programSubmissionList.get(position).getProgSubNominal()) + " - ");
        holder.date.setText(DateFormat.format("MMM", programSubmissionList.get(position).getProgSubDate()));
    }

    @Override
    public int getItemCount() {
        return programSubmissionList.size();
    }

    public static class ProgramViewHolder extends RecyclerView.ViewHolder{
        protected TextView name,nominal,date;
        public ProgramViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.program_name);
            nominal =itemView.findViewById(R.id.program_nominal);
            date = itemView.findViewById(R.id.program_date);
        }
    }
}
