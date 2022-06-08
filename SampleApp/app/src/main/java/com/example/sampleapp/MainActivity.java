package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.microsoft.maps.MapRenderMode;
import com.microsoft.maps.MapView;

public class MainActivity extends AppCompatActivity {
    private MapView mMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMapView = new MapView(this, MapRenderMode.VECTOR);  // or use MapRenderMode.RASTER for 2D map
        mMapView.setCredentialsKey(BuildConfig.CREDENTIALS_KEY);
        ((FrameLayout)findViewById(R.id.map_view)).addView(mMapView);
        mMapView.onCreate(savedInstanceState);
    }
}

//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.FrameLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.microsoft.maps.Geopoint;
//import com.microsoft.maps.MapAnimationKind;
//import com.microsoft.maps.MapElementLayer;
//import com.microsoft.maps.MapIcon;
//import com.microsoft.maps.MapImage;
//import com.microsoft.maps.MapRenderMode;
//import com.microsoft.maps.MapScene;
//import com.microsoft.maps.MapServices;
//import com.microsoft.maps.MapTappedEventArgs;
//import com.microsoft.maps.MapView;
//import com.microsoft.maps.OnMapTappedListener;

//public class MainActivity extends AppCompatActivity {
//
//    private MapElementLayer mPinLayer;
//    private MapView mMapView;
//    private static final Geopoint INC_AIRPORT = new Geopoint(37.45683766873818, 126.44357045478996);
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mMapView = new MapView(this, MapRenderMode.VECTOR);  // or use MapRenderMode.RASTER for 2D map
//        mMapView.setCredentialsKey(BuildConfig.CREDENTIALS_KEY);
//        ((FrameLayout)findViewById(R.id.map_view)).addView(mMapView);
//        mMapView.setLanguage("ko");
//        mMapView.onCreate(savedInstanceState);
//
//        mMapView.setScene(
//                MapScene.createFromLocationAndZoomLevel(INC_AIRPORT, 11),
//                MapAnimationKind.NONE);
//
//        mPinLayer = new MapElementLayer();
//        mMapView.getLayers().add(mPinLayer);
//
//        String title = "Go go go!";          // title to be shown next to the pin
//
////        Bitmap pinBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_marker);
//
//        MapIcon pushpin = new MapIcon();
//        pushpin.setLocation(INC_AIRPORT);
//        pushpin.setTitle(title);
////        pushpin.setImage(new MapImage(pinBitmap));
//
//        mPinLayer.getElements().add(pushpin);
//
//        //check tapped location
//        mMapView.addOnMapTappedListener(new OnMapTappedListener() {
//            @Override
//            public boolean onMapTapped(MapTappedEventArgs mapTappedEventArgs) {
//                Geopoint location = mMapView.getLocationFromOffset(mapTappedEventArgs.position);
//
//                Log.e("****", location.getPosition().toString());
//                return false;
//            }
//        });
//    }
//}