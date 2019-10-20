package com.yosuajuliando.uts_tekber_yosuajuliando;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.YosViewHolder>{

    private Context mContex;
    private List<Buku> mData;

    public RecyclerViewAdapter(Context mContex, List<Buku> mData) {
        this.mContex = mContex;
        this.mData = mData;
    }
    @NonNull
    @Override
    public YosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContex);
        view = mInflater.inflate(R.layout.item_cardview_buku,parent, false);

        return new YosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YosViewHolder holder, final int position){

        holder.tv_judul_buku.setText(mData.get(position).getJudul());
        holder.iv_thumbnail.setImageResource(mData.get(position).getThumbnail());
        //klik
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //untuk mem-passing data dari activity_main(recycler_view) ke detail
                Intent intent = new Intent(mContex, Detail.class);
                intent.putExtra("Judul", mData.get(position).getJudul());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                intent.putExtra("Deskripsi", mData.get(position).getDeskripsi());
                intent.putExtra("Kategori", mData.get(position).getKategori());
                //dikirim ke
                mContex.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class YosViewHolder extends RecyclerView.ViewHolder{


        TextView tv_judul_buku;
        ImageView iv_thumbnail;
        CardView cv;


        public YosViewHolder(@NonNull View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.list_buku_id);
            tv_judul_buku = (TextView) itemView.findViewById(R.id.judul_buku_id);
            iv_thumbnail = (ImageView) itemView.findViewById(R.id.gambar_buku_id);


        }
    }
}
