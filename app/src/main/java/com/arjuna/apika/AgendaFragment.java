package com.arjuna.apika;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arjuna.apika.adapter.AgendaBaruAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AgendaFragment extends Fragment {

    List<Agenda> agendaList;

    private RecyclerView recyclerView;

    public AgendaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_agenda, container, false);

//        recyclerView = view.findViewById(R.id.rv_agenda_baru);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
//        recyclerView.setLayoutManager(layoutManager);
//        initializeData();
//        AgendaBaruAdapter agendaBaruAdapter = new AgendaBaruAdapter(agendaList);
//        recyclerView.setAdapter(agendaBaruAdapter);
        return view;
    }

    private void initializeData() {
        Date c = Calendar.getInstance().getTime();
        agendaList = new ArrayList<>();
        agendaList.add(new Agenda(1, "Futsal", c, "20.00", 2, "Bandung", "Free Drink", c, true, 0));
        agendaList.add(new Agenda(2, "Futsal", c, "20.00", 2, "Bandung", "Free Drink", c, true, 0));
    }

}
