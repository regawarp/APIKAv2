package com.arjuna.apika;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arjuna.apika.adapter.ProgramAdapter;
import com.arjuna.apika.adapter.ProyekAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProgramFragment extends Fragment {

    private RecyclerView rvProgram;
    List<ProgramSubmission> programSubmissionList;

    public ProgramFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_program, container, false);

        rvProgram = view.findViewById(R.id.rv_program_anda);
        initializeData();
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getContext());
        rvProgram.setLayoutManager(layoutManager1);
        ProgramAdapter programAdapter = new ProgramAdapter(programSubmissionList);
        rvProgram.setAdapter(programAdapter);

        return view;
    }

    private void initializeData() {
        Date c = Calendar.getInstance().getTime();
        programSubmissionList = new ArrayList<>();
        programSubmissionList.add(new ProgramSubmission(1,"Program 1",20000000,c));
        programSubmissionList.add(new ProgramSubmission(2,"Program 2",200230000,c));
        programSubmissionList.add(new ProgramSubmission(3,"Program 3",423121000,c));
    }

}
