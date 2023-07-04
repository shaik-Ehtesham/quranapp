package com.example.al_furqan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;

public class prophetindex extends AppCompatActivity implements prophetsinterface{
    private RecyclerView prophetrecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prophetindex);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        prophetrecycler = findViewById(R.id.prophetrecucler);
        ArrayList<prophetsdata> list = new ArrayList<>();


        list.add(new prophetsdata("Adam AS"));
        list.add(new prophetsdata("Idris AS"));
        list.add(new prophetsdata("Nuh AS"));
        list.add(new prophetsdata("Hud AS"));
        list.add(new prophetsdata("Salih AS"));
        list.add(new prophetsdata("Ibrahim AS"));
        list.add(new prophetsdata("Ismail AS"));
        list.add(new prophetsdata("Ishaq AS"));
        list.add(new prophetsdata("Yaqub AS"));
        list.add(new prophetsdata("Lut AS"));
        list.add(new prophetsdata("Shuaib AS"));
        list.add(new prophetsdata("Yusuf AS"));
        list.add(new prophetsdata("Ayyub AS"));
        list.add(new prophetsdata("Dhul-Kifl AS"));
        list.add(new prophetsdata("Yunus AS"));
        list.add(new prophetsdata("Musa AS"));
        list.add(new prophetsdata("Harun AS"));
        list.add(new prophetsdata("Hizqeel AS"));
        list.add(new prophetsdata("Elyas AS"));
        list.add(new prophetsdata("Shammil AS"));
        list.add(new prophetsdata("Dawood AS"));
        list.add(new prophetsdata("Sulaiman AS"));
        list.add(new prophetsdata("Shia AS"));
        list.add(new prophetsdata("Aramaya AS"));
        list.add(new prophetsdata("Daniel AS"));
        list.add(new prophetsdata("Uzair AS"));
        list.add(new prophetsdata("Zakariyah AS"));
        list.add(new prophetsdata("Yahya AS"));
        list.add(new prophetsdata("Isa AS"));
        list.add(new prophetsdata("Muhammad(PBUH)"));





        prophetrecycler.setLayoutManager(new GridLayoutManager(this,2));
        prophetsadapter pa = new prophetsadapter(list,this,this);
        prophetrecycler.setAdapter(pa);


    }

    @Override
    public void onItemClick(int position) {

            switch (position)
            {

                case 0:startActivity(new Intent(this,adam.class));break;
                case 1:startActivity(new Intent(this,idris.class));break;
                case 2:startActivity(new Intent(this,nuh.class));break;
                case 3:startActivity(new Intent(this,hud.class));break;
                case 4:startActivity(new Intent(this,salih.class));break;
                case 5:startActivity(new Intent(this,ibrahim.class));break;
                case 6:startActivity(new Intent(this,ismail.class));break;
                case 7:startActivity(new Intent(this,ishaq.class));break;
                case 8:startActivity(new Intent(this,yaqub.class));break;
                case 9:startActivity(new Intent(this,lut.class));break;
                case 10:startActivity(new Intent(this,shuaib.class));break;
                case 11:startActivity(new Intent(this,yusuf.class));break;
                case 12:startActivity(new Intent(this,ayyub.class));break;
                case 13:startActivity(new Intent(this,dhulkifl.class));break;
                case 14:startActivity(new Intent(this,yunus.class));break;
                case 15:startActivity(new Intent(this,musa.class));break;
                case 16:startActivity(new Intent(this,harun.class));break;
                case 17:startActivity(new Intent(this,hizqeel.class));break;
                case 18:startActivity(new Intent(this,elyas.class));break;
                case 19:startActivity(new Intent(this,shammil.class));break;
                case 20:startActivity(new Intent(this,dawood.class));break;
                case 21:startActivity(new Intent(this,sulaiman.class));break;
                case 22:startActivity(new Intent(this,shia.class));break;
                case 23:startActivity(new Intent(this,aramaya.class));break;
                case 24:startActivity(new Intent(this,daniel.class));break;
                case 25:startActivity(new Intent(this,uzair.class));break;
                case 26:startActivity(new Intent(this,zakariah.class));break;
                case 27:startActivity(new Intent(this,yahya.class));break;
                case 28:startActivity(new Intent(this,isa.class));break;
                case 29:startActivity(new Intent(this,m.class));break;

            }

    }
}