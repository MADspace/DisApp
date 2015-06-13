package fr.clemencealthabegoity.dis;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by docent on 13-06-15.
 */
public class TimerView extends View {

    private float degreesFilled = 0.0f;
    public TimerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float padding = 7.0f;
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(padding*2);
        paint.setARGB(255, 251, 255, 212);


        canvas.drawArc(new RectF(padding, padding, canvas.getWidth() - padding, canvas.getHeight() - padding), -90.0f, degreesFilled, false, paint);
    }

    public void setDegreesFilled(float degreesFilled) {
        this.degreesFilled = degreesFilled;
        invalidate();
    }
}
