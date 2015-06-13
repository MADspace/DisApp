package fr.clemencealthabegoity.dis;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
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

        float size = 40.0f;
        ScaleAnimation animation = new ScaleAnimation(1.0f, size, 1.0f, size, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(30000);
        animation.setFillAfter(true);
        findViewById(R.id.sun).startAnimation(animation);

        AlphaAnimation text_animation = new AlphaAnimation(1, 0);
        text_animation.setStartOffset(2000);
        text_animation.setDuration(2000);
        text_animation.setFillAfter(true);
        findViewById(R.id.disconnected_text).startAnimation(text_animation);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        startActivity(new Intent(this, FakeResultActivity.class));
        finish();
        return true;
    }
}
