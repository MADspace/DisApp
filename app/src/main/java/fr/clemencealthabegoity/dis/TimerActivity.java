package fr.clemencealthabegoity.dis;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class TimerActivity extends Activity implements View.OnTouchListener {


    TimerView timerView;
    TextView timerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        findViewById(R.id.timer).setOnTouchListener(this);
        timerView = (TimerView)findViewById(R.id.timer);
        timerView.setOnTouchListener(this);
        timerView.setDegreesFilled(180.0f);

        timerText = (TextView)findViewById(R.id.timer_text);
    }

    int i = 0;
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        float x = event.getX() - v.getWidth() / 2.0f;
        float y = event.getY() - v.getHeight() / 2.0f;

        double angle = Math.atan2(y, x);
        double degrees = angle / (Math.PI) * 180.0 + 90.0;
        if(degrees < 0)
            degrees += 360;

        timerView.setDegreesFilled((float) degrees);

        int minutes = (int)(degrees / 360.0 * 60.0);
        timerText.setText(minutes + "m");
        return true;
    }
}
