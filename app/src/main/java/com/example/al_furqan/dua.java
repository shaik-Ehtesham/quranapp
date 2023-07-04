package com.example.al_furqan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class dua extends AppCompatActivity implements duainterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RecyclerView re = findViewById(R.id.recycler);
        ArrayList<duasdata> list = new ArrayList<>();


        list.add(new duasdata("RAMADAN",R.drawable.prayer));
        list.add(new duasdata("MORNING",R.drawable.sun));
        list.add(new duasdata("EVENING",R.drawable.sunset));
        list.add(new duasdata("HOME",R.drawable.house));
        list.add(new duasdata("MOSQUE",R.drawable.mosque));
        list.add(new duasdata("TRAVELING",R.drawable.travel));
        list.add(new duasdata("GARMENTS",R.drawable.shirt));
        list.add(new duasdata("TOILET",R.drawable.toilet));
        list.add(new duasdata("FOOD",R.drawable.food));
        list.add(new duasdata("RAIN",R.drawable.rain));
        list.add(new duasdata("MARRIAGE",R.drawable.wedding));
        list.add(new duasdata("SLEEP",R.drawable.sleeping));
        list.add(new duasdata("ABLUTION",R.drawable.wadu));
        list.add(new duasdata("ANIMALS",R.drawable.cat));
        list.add(new duasdata("SICKNESS",R.drawable.coronavirus));
        list.add(new duasdata("FAMILY",R.drawable.family));
        list.add(new duasdata("ANGER",R.drawable.angry));
        list.add(new duasdata("SADNESS",R.drawable.sad));
        list.add(new duasdata("HAPPINESS",R.drawable.happiness));
        list.add(new duasdata("REPENTANCE",R.drawable.dua));
        list.add(new duasdata("WEALTH",R.drawable.salary));
        list.add(new duasdata("HAJJ/UMRAH",R.drawable.kaaba));
        list.add(new duasdata("PROTECTION",R.drawable.shield));
        list.add(new duasdata("TEMPTATION",R.drawable.devil));
        list.add(new duasdata("SOCIETY",R.drawable.society));
        list.add(new duasdata("CHILDREN",R.drawable.children));

        list.add(new duasdata("ANGRY", R.drawable.angry));
        list.add(new duasdata("BORED", R.drawable.bored));
        list.add(new duasdata("CONFIDENT", R.drawable.confidence));
        list.add(new duasdata("CONFUSED", R.drawable.confused));
        list.add(new duasdata("DEPRESSED", R.drawable.loneliness));
        list.add(new duasdata("DOUBTFUL", R.drawable.confused));
        list.add(new duasdata("GRATEFUL", R.drawable.thankyou));
        list.add(new duasdata("GREEDY", R.drawable.greedy));
        list.add(new duasdata("HURT", R.drawable.hurt));
        list.add(new duasdata("INDECISIVE", R.drawable.indecisive));
        list.add(new duasdata("JEALOUS", R.drawable.jealous));
        list.add(new duasdata("LAZY", R.drawable.lazy));
        list.add(new duasdata("LONELY", R.drawable.lonely));
        list.add(new duasdata("NERVOUS", R.drawable.nervous));
        list.add(new duasdata("OVERWHELMED", R.drawable.headache));
        list.add(new duasdata("REGRET", R.drawable.regret));
        list.add(new duasdata("SAD", R.drawable.sad));
        list.add(new duasdata("SCARED", R.drawable.scared));
        list.add(new duasdata("SUICIDAL", R.drawable.suicide));
        list.add(new duasdata("TIRED", R.drawable.fatigue));
        list.add(new duasdata("UNLOVED", R.drawable.h));
        list.add(new duasdata("WEAK", R.drawable.weakness));
        list.add(new duasdata("DEFEATED", R.drawable.defeated));
        list.add(new duasdata("DESIRE", R.drawable.desire));
        list.add(new duasdata("DESPERATE", R.drawable.abandon));
        list.add(new duasdata("ENVIOUS", R.drawable.envy));
        list.add(new duasdata("HUMILIATED", R.drawable.humiliate));
        list.add(new duasdata("IMPATIENT", R.drawable.wait));
        list.add(new duasdata("INSECURE", R.drawable.insecure));
        list.add(new duasdata("IRRITATED", R.drawable.irritable));
        list.add(new duasdata("LOVE", R.drawable.love));
        list.add(new duasdata("PEACEFUL", R.drawable.peace));
        list.add(new duasdata("RAGE", R.drawable.rage));
        list.add(new duasdata("SATISFIED", R.drawable.satisfied));




        re.setLayoutManager(new GridLayoutManager(this ,3));
        re.setHasFixedSize(true);
        duaadapter adapter = new duaadapter(this,list,this);
        re.setAdapter(adapter);

    }

    @Override
    public void onDuaClick(int position) {
        switch (position)
        {
            case 0:startActivity(new Intent(this,ramadan.class));
            break;
            case 1:startActivity(new Intent(this,morning.class));
            break;
            case 2:startActivity(new Intent(this,evening.class));break;
            case 3:startActivity(new Intent(this,home.class));break;
            case 4:startActivity(new Intent(this,mosque.class));break;
            case 5:startActivity(new Intent(this,travelling.class));break;
            case 6:startActivity(new Intent(this,garments.class));break;
            case 7:startActivity(new Intent(this,toilet.class));break;
            case 8:startActivity(new Intent(this,food.class));break;
            case 9:startActivity(new Intent(this,rain.class));break;
            case 10:startActivity(new Intent(this,marriage.class));break;
            case 11:startActivity(new Intent(this,sleep.class));break;
            case 12:startActivity(new Intent(this,ablution.class));break;
            case 13:startActivity(new Intent(this,animals.class));break;
            case 14:startActivity(new Intent(this,sickness.class));break;
            case 15:startActivity(new Intent(this,family.class));break;
            case 16:startActivity(new Intent(this,anger.class));break;
            case 17:startActivity(new Intent(this,sadness.class));break;
            case 18:startActivity(new Intent(this,happiness.class));break;
            case 19:startActivity(new Intent(this,repentance.class));break;
            case 20:startActivity(new Intent(this,wealth.class));break;
            case 21:startActivity(new Intent(this,hajj.class));break;
            case 22:startActivity(new Intent(this,protection.class));break;
            case 23:startActivity(new Intent(this,temptation.class));break;
            case 24:startActivity(new Intent(this,society.class));break;
            case 25:startActivity(new Intent(this,children.class));break;
            case 26:startActivity(new Intent(this,angry.class));break;
            case 27:startActivity(new Intent(this,bored.class));break;
            case 28:startActivity(new Intent(this,confident.class));break;
            case 29:startActivity(new Intent(this,confused.class));break;
            case 30:startActivity(new Intent(this,depressed.class));break;
            case 31:startActivity(new Intent(this,doubtfull.class));break;
            case 32:startActivity(new Intent(this,grateful.class));break;
            case 33:startActivity(new Intent(this,greedy.class));break;
            case 34:startActivity(new Intent(this,hurt.class));break;
            case 35:startActivity(new Intent(this,indecisive.class));break;
            case 36:startActivity(new Intent(this,jealous.class));break;
            case 37:startActivity(new Intent(this,lazy.class));break;
            case 38:startActivity(new Intent(this,lonely.class));break;
            case 39:startActivity(new Intent(this,nervous.class));break;
            case 40:startActivity(new Intent(this,overwh.class));break;
            case 41:startActivity(new Intent(this,regret.class));break;
            case 42:startActivity(new Intent(this,sad.class));break;
            case 43:startActivity(new Intent(this,scared.class));break;
            case 44:startActivity(new Intent(this,suicidal.class));break;
            case 45:startActivity(new Intent(this,tired.class));break;
            case 46:startActivity(new Intent(this,unloved.class));break;
            case 47:startActivity(new Intent(this,weak.class));break;
            case 48:startActivity(new Intent(this,defeated.class));break;
            case 49:startActivity(new Intent(this,desire.class));break;
            case 50:startActivity(new Intent(this,desperate.class));break;
            case 51:startActivity(new Intent(this,envious.class));break;
            case 52:startActivity(new Intent(this,humilated.class));break;
            case 53:startActivity(new Intent(this,impatient.class));break;
            case 54:startActivity(new Intent(this,insecure.class));break;
            case 55:startActivity(new Intent(this,irritated.class));break;
            case 56:startActivity(new Intent(this,love.class));break;
            case 57:startActivity(new Intent(this,peaceful.class));break;
            case 58:startActivity(new Intent(this,rage.class));break;
            case 59:startActivity(new Intent(this,satisfied.class));break;
        }
    }
}