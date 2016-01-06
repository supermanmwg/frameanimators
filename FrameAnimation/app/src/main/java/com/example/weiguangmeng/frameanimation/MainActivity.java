package com.example.weiguangmeng.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.facebook.common.util.UriUtil;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        ImageView chickenFire = (ImageView) findViewById(R.id.chicken_fire);
        chickenFire.setBackgroundResource(R.drawable.fire);
        AnimationDrawable chicken = (AnimationDrawable) chickenFire.getBackground();
        chicken.start();
       /* SimpleDraweeView chickenGif = (SimpleDraweeView) findViewById(R.id.chicken_gif);
        Uri uri = new Uri.Builder()
                .scheme(UriUtil.LOCAL_RESOURCE_SCHEME) // "res"
                .path(String.valueOf(R.drawable.chicken))
                .build();
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .build();
        chickenGif.setController(controller);*/

    }
}
