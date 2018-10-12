package com.arjuna.apika;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arjuna.apika.adapter.ProyekAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProyekFragment extends Fragment {

    private RecyclerView rvProyek;
    private FloatingActionButton fabTambahProyek;
    List<Proyek> proyekList;

    public ProyekFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_proyek, container, false);

        fabTambahProyek = view.findViewById(R.id.fab_tambah_proyek);
        fabTambahProyek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),TambahProyekActivity.class);
                startActivity(i);
            }
        });

        rvProyek = view.findViewById(R.id.rv_proyek_anda);
        initializeData();
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getContext());
        rvProyek.setLayoutManager(layoutManager1);
        ProyekAdapter proyekAdapter = new ProyekAdapter(proyekList);
        rvProyek.setAdapter(proyekAdapter);

        return view;
    }

    private void initializeData() {
        Date c = Calendar.getInstance().getTime();
        proyekList = new ArrayList<>();
        proyekList.add(new Proyek(1, "Proyek 1", "Ahli PC", 5000000, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(2, "Proyek 2", "Ahli PC", 500023100, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(3, "Proyek 3", "Ahli PC", 500000120, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(1, "Proyek 1", "Ahli PC", 5000000, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(2, "Proyek 2", "Ahli PC", 500023100, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(3, "Proyek 3", "Ahli PC", 500000120, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(1, "Proyek 1", "Ahli PC", 5000000, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(2, "Proyek 2", "Ahli PC", 500023100, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(3, "Proyek 3", "Ahli PC", 500000120, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(1, "Proyek 1", "Ahli PC", 5000000, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(2, "Proyek 2", "Ahli PC", 500023100, "Jawa", c, c, c, 2));
        proyekList.add(new Proyek(3, "Proyek 3", "Ahli PC", 500000120, "Jawa", c, c, c, 2));
    }

}
