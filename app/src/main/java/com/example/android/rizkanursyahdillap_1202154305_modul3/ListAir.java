package com.example.android.rizkanursyahdillap_1202154305_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by asus on 2/24/2018.
 */

public class ListAir extends RecyclerView.Adapter<ListAir.airView> {
    
    private final LinkedList<String> judul; //menampung data di adaptor
    private final LinkedList<String> desc;
    private final LinkedList<Integer> image;
    
    private LayoutInflater inflater;//infalter untuk java objek dari layout

    //implementassi constactor untuk menyetel ke data yang diteruskan
    public ListAir(Main2Activity main2Activity, LinkedList<String> njudul, LinkedList<String> ndesc, LinkedList<Integer> nimage) {
        inflater = LayoutInflater.from(main2Activity);
        this.judul=njudul;
        this.desc=ndesc;
        this.image=nimage;
    }

    //mengembalikan holder tampilan dengan layout adapter
    @Override
    public airView onCreateViewHolder(ViewGroup parent, int viewType) { //parent margin layout
        View listView= inflater.inflate(R.layout.listair,parent,false);
        return new airView(listView,this);
    }

    //menghubungkan data ke data kita ke holder tampilan
    @Override
    public void onBindViewHolder(airView holder, int position) { //meletakan objek objek
        String Currentjudul = judul.get(position);
        String Currentdesc = desc.get(position);
        Integer Currentimage = image.get(position);

        holder.juduls.setText(Currentjudul);
        holder.descs.setText(Currentdesc);
        holder.images.setImageResource(Currentimage);
    }

    //mengisi method untuk mengembalikan ukuran
    @Override
    public int getItemCount() {
        return image.size();
    }

    public class airView extends RecyclerView.ViewHolder {//menyyimpan keseluruhan dari recyclerview
        private final TextView juduls;
        private final TextView descs;
        private final ImageView images;
        public airView(final View listView, ListAir listAir) {
            super(listView);//memamnggil constarctor

            juduls=(TextView)listView.findViewById(R.id.judul);//meletakan textview judul
            descs=(TextView)listView.findViewById(R.id.desc);//meletakan deskripsi
            images=(ImageView) listView.findViewById(R.id.gambar);//meletakan gambar

            images.setOnClickListener(new View.OnClickListener() { //agar gambar dapat diklik
                @Override
                public void onClick(View v) { //untuk pindah view
                    int position = getLayoutPosition();

                    String jdl = judul.get(position);
                    String desk = desc.get(position);
                    Integer img = image.get(position);

                    Intent intent = new Intent(listView.getContext(),DetailAir.class);//listview mengambil dari method airView

                    intent.putExtra("judul",jdl); //melemparkan data-datanya
                    intent.putExtra("Deskripsi",desk);
                    intent.putExtra("Gambar",img);

                    listView.getContext().startActivity(intent);
                }
            });
        }
    }
}
