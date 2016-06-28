package com.example.gohan.splashactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Freeware Sys on 29-Jun-16.
 */
public class splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashh);
        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        // declaring animations
        final Animation animation = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);

        // start animation
        
    }
}
