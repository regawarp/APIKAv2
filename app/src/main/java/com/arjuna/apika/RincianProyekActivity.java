package com.arjuna.apika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RincianProyekActivity extends AppCompatActivity {

    private TextView nama,deskripsi,kualifikasi,harga,batasTawar,mulai,akhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian_proyek);
        Intent i = getIntent();

        nama = findViewById(R.id.rincian_judul_proyek);
        deskripsi = findViewById(R.id.rincian_deskripsi_proyek);
        kualifikasi = findViewById(R.id.rincian_kualifikas_proyek);
        harga = findViewById(R.id.rincian_harga_proyek);
        batasTawar = findViewById(R.id.rincian_batas_penawaran);
        mulai = findViewById(R.id.rincian_mulai_proyek);
        akhir = findViewById(R.id.rincian_akhir_proyek);

        nama.setText(i.getExtras().getString("nama"));
        deskripsi.setText(i.getExtras().getString("deskripsi"));
        kualifikasi.setText(i.getExtras().getString("kualifikasi"));
        harga.setText("Rp " + i.getExtras().getString("harga"));
        batasTawar.setText(i.getExtras().getString("batas_tawar"));
        mulai.setText(i.getExtras().getString("mulai"));
        akhir.setText(i.getExtras().getString("akhir"));
    }
}
