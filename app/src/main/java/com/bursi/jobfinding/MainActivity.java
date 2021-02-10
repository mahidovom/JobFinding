package com.bursi.jobfinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=(ImageView)findViewById(R.id.img);
        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.logo);
        ImageHelper imageHelper=new ImageHelper();
        img.setImageBitmap(imageHelper.getRoundedCornerBitmap(largeIcon,50));
        Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animzoomin);
        a.reset();
        img.clearAnimation();
        img.startAnimation(a);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
            }
        },5000);


    }
}