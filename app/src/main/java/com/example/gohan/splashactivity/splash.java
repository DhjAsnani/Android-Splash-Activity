package com.example.gohan.splashactivity;

import android.app.Activity;
import android.content.Intent;
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
        // fadeout
        final Animation animation2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);

        // start animation
        iv.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(animation2);
                finish();
                Intent i = new Intent(splash.this,MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
