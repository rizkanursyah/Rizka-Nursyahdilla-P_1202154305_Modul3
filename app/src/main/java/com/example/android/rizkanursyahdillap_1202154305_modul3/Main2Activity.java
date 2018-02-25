package com.example.android.rizkanursyahdillap_1202154305_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Main2Activity extends AppCompatActivity {

    private final LinkedList<String> njudul = new LinkedList<>(); //atribut judul
    private final LinkedList<String> ndesc = new LinkedList<>(); //atribut deskripsi
    private final LinkedList<Integer> nimage = new LinkedList<>(); //atribut image

    private RecyclerView recycler; //atribut recyclerview
    private ListAir list; //atribut untuk menghubungkan data listair


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list();

        recycler=(RecyclerView)findViewById(R.id.recyclerview); //untuk implementasi recyclerview
        list = new ListAir(this,njudul,ndesc,nimage);//implementsi untuk list yaitu judul deskripsi dan image
        recycler.setAdapter(list);//untuk koneksi
        recycler.setLayoutManager(new LinearLayoutManager(this));//set untuk layout
    }

    private void list(){ //untuk memasukan list pada recyclerview
        njudul.add("Ades");
        njudul.add("Amidis");
        njudul.add("Aqua");
        njudul.add("Cleo");
        njudul.add("Club");
        njudul.add("Equil");
        njudul.add("Le minerale");
        njudul.add("Nestle");
        njudul.add("Pristine");
        njudul.add("Vit");

        ndesc.add("Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia.");
        ndesc.add("AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius.");
        ndesc.add("Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.");
        ndesc.add("Cleo sangat bermanfaatuntuk menyegarkan tubuh kita karena sel-sel tubuh dapat lebih cepat menyerap nutrisi secara menyeluruh. Air murni dengan oksigen Cleo sangat berbeda dengan air minum dalam kemasan lainnya.");
        ndesc.add("Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur.");
        ndesc.add("Equil mungkin masih asing di telinga kebanyakan masyarakat Indonesia. Namun merk air mineral murni ini sudah cukup dikenal kalangan menengah atas dan ekspatriat.");
        ndesc.add("Le Minerale dibikin oleh PT Tirta Frisindo Jaya, yang merupakan anak usaha Mayora Indah yang bergerak di bidang produksi minuman.");
        ndesc.add("Nama besar Nestle menjadi modal kuat bagi produk air mineral mereka, Nestle Pure Life. Ketimbang jor-joran di kampanye marketing, Pure Life pun lebih nyaman memperkuat channel distribution.");
        ndesc.add("Pristine 8+ merupakan Air minum Alkaline dengan kandungan pH 8+ (Melebihi 8) yang memberikan manfaat detoxifikasi bagi tubuh kita.");
        ndesc.add("VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta.");

        nimage.add(R.drawable.ades);
        nimage.add(R.drawable.amidis);
        nimage.add(R.drawable.aqua);
        nimage.add(R.drawable.cleo);
        nimage.add(R.drawable.club);
        nimage.add(R.drawable.equil);
        nimage.add(R.drawable.leminerale);
        nimage.add(R.drawable.nestle);
        nimage.add(R.drawable.pristine);
        nimage.add(R.drawable.vit);
    }


}
