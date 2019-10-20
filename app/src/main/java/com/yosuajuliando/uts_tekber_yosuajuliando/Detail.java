package com.yosuajuliando.uts_tekber_yosuajuliando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private TextView tvjudul, tvdeskripsi, tvkategori;
    private ImageView ivthumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        tvjudul = (TextView) findViewById(R.id.tx_buku_id);
        tvdeskripsi = (TextView) findViewById(R.id.tx_deskripsi_id);
        tvkategori = (TextView) findViewById(R.id.tx_kategori_id);
        ivthumbnail = (ImageView) findViewById(R.id.thumbnail_buku);


        Intent intent = getIntent();
        String Judul = intent.getExtras().getString("Judul");
        String Kategori = intent.getExtras().getString("Kategori");
        String Deskripsi = intent.getExtras().getString("Deskripsi");
        int Gambar = intent.getExtras().getInt("Thumbnail");


        tvjudul.setText(Judul);
        tvkategori.setText(Kategori);
        tvdeskripsi.setText(Deskripsi);
        ivthumbnail.setImageResource(Gambar);
    }
}
