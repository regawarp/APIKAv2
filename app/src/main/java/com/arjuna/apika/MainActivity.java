package com.arjuna.apika;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.arjuna.apika.helper.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {
    private BerandaFragment berandaFragment;
    private AgendaFragment agendaFragment;
    private ProyekFragment proyekFragment;
    private ProgramFragment programFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        berandaFragment = new BerandaFragment();
        agendaFragment = new AgendaFragment();
        proyekFragment = new ProyekFragment();
        programFragment = new ProgramFragment();

        Toolbar toolbar = findViewById(R.id.main_toolbar);

        BottomNavigationView mMainNav = findViewById(R.id.main_nav);
        setFragment(berandaFragment);
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_beranda:
                        setFragment(berandaFragment);
                        return true;
                    case R.id.nav_agenda:
                        setFragment(agendaFragment);
                        return true;
                    case R.id.nav_proyek:
                        setFragment(proyekFragment);
                        return true;
                    case R.id.nav_program:
                        setFragment(programFragment);
                        return true;
                }
                return false;
            }
        });

        // Disable shift animaion on bottomnavigation
        BottomNavigationViewHelper.removeShiftMode(mMainNav);
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }
}
