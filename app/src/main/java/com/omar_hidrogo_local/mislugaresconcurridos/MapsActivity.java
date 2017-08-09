package com.omar_hidrogo_local.mislugaresconcurridos;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String v_nombre = "";
    private static double v_lat = 0;
    private static double v_lng = 0;
    private static String v_title = "";
    private static String v_msj = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bundle extras = getIntent().getExtras();
        v_nombre = extras.getString("nombre");
        v_lat = extras.getDouble("lat");
        v_lng = extras.getDouble("lng");
        v_title = extras.getString("title");
        v_msj = extras.getString("msj");
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        LatLng v_nombre = new LatLng(v_lat, v_lng);

        mMap.addMarker(new MarkerOptions().position(v_nombre)
                                          .title(v_title)
                                           .snippet(v_msj)
                                            .anchor(0.0f, 1.0f)
                                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.flag)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(v_nombre, 13));
    }

    public void map(View v){
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }
    public void hybrid(View v){
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
    public void satellite(View v){
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
}
