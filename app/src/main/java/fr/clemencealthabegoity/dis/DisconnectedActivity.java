package fr.clemencealthabegoity.dis;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/**
 * Created by docent on 13-06-15.
 */
public class DisconnectedActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disconnected);

        ScaleAnimation animation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(5000);
        animation.setFillAfter(true);
        findViewById(R.id.sun).startAnimation(animation);
    }
}
