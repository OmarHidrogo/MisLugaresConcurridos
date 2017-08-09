package com.omar_hidrogo_local.mislugaresconcurridos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Ubicaciones> ubicaciones;
   // private ImageButton img1, img2, img3, img4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarUbicaciones();

       /* img1 = (ImageButton) findViewById(R.id.img1);
        img2 = (ImageButton) findViewById(R.id.img2);
        img3 = (ImageButton) findViewById(R.id.img3);
        img4 = (ImageButton) findViewById(R.id.img4);*/

    }

    public void irMapa1(View v){
        Intent i = new Intent(this, MapsActivity.class);
            i.putExtra("nombre",ubicaciones.get(0).getNombre());
            i.putExtra("lat", ubicaciones.get(0).getLat());
            i.putExtra("lng",ubicaciones.get(0).getLng());
            i.putExtra("title", ubicaciones.get(0).getTitle());
            i.putExtra("msj", ubicaciones.get(0).getMsj());
            startActivity(i);
    }
    public void irMapa2(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("nombre",ubicaciones.get(1).getNombre());
        i.putExtra("lat", ubicaciones.get(1).getLat());
        i.putExtra("lng",ubicaciones.get(1).getLng());
        i.putExtra("title", ubicaciones.get(1).getTitle());
        i.putExtra("msj", ubicaciones.get(1).getMsj());
        startActivity(i);
    }
    public void irMapa3(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("nombre",ubicaciones.get(2).getNombre());
        i.putExtra("lat", ubicaciones.get(2).getLat());
        i.putExtra("lng",ubicaciones.get(2).getLng());
        i.putExtra("title", ubicaciones.get(2).getTitle());
        i.putExtra("msj", ubicaciones.get(2).getMsj());
        startActivity(i);
    }

    public void irMapa4(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("nombre",ubicaciones.get(3).getNombre());
        i.putExtra("lat", ubicaciones.get(3).getLat());
        i.putExtra("lng",ubicaciones.get(3).getLng());
        i.putExtra("title", ubicaciones.get(3).getTitle());
        i.putExtra("msj", ubicaciones.get(3).getMsj());
        startActivity(i);
    }

    public void inicializarUbicaciones(){
        ubicaciones = new ArrayList<Ubicaciones>();

        ubicaciones.add(new Ubicaciones("Cristo de las Noas",25.525249882682324,-103.45596150901952,"Cristo de las Noas","Lugar numero 1"));
        ubicaciones.add(new Ubicaciones("Plaza de Armas",25.53863886171653,-103.46217886951604,"Plaza de Armas","Lugar numero 2"));
        ubicaciones.add(new Ubicaciones("Bosque Urbano",25.55178435845306,-103.3902742102448,"Bosque Urbano","Lugar numero 3"));
        ubicaciones.add(new Ubicaciones("Plaza Mayor",25.54086537271796,-103.45323638466039,"Plaza de Armas","Lugar numero 4"));

    }
}
