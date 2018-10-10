package com.arjuna.apika;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arjuna.apika.adapter.AgendaBaruAdapter;
import com.arjuna.apika.adapter.ProyekAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {

    List<Agenda> agendaList;
    List<Proyek> proyekList;

    private RecyclerView recyclerView,rvRekProyek;

    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_beranda, container, false);

        recyclerView = view.findViewById(R.id.rv_agenda_baru);
        rvRekProyek = view.findViewById(R.id.rv_rek_proyek);

        initializeData();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        layoutManager.setReverseLayout(false);
        recyclerView.setLayoutManager(layoutManager);
        AgendaBaruAdapter agendaBaruAdapter = new AgendaBaruAdapter(agendaList);
        recyclerView.setAdapter(agendaBaruAdapter);

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getContext());
        rvRekProyek.setLayoutManager(layoutManager1);
        ProyekAdapter proyekAdapter = new ProyekAdapter(proyekList);
        rvRekProyek.setAdapter(proyekAdapter);

        return view;
    }

    private void initializeData() {
        Date c = Calendar.getInstance().getTime();
        agendaList = new ArrayList<>();
        agendaList.add(new Agenda(1, "Futsal1", c, "20.00", 2, "Bandung", "Free Drink", c, true, 0));
        agendaList.add(new Agenda(2, "Futsal2", c, "20.00", 2, "Bandung", "Free Drink", c, true, 0));
        agendaList.add(new Agenda(3, "Futsal3", c, "20.00", 2, "Bandung", "Free Drink", c, true, 0));
        agendaList.add(new Agenda(4, "Futsal4", c, "20.00", 2, "Bandung", "Free Drink", c, true, 0));

        proyekList = new ArrayList<>();
        proyekList.add(new Proyek(1, "Proyek 1", "Ahli PC", 5000000, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(2, "Proyek 2", "Ahli PC", 500023100, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(3, "Proyek 3", "Ahli PC", 500000120, "Jawa", c, c, c, 2));
    }

}
