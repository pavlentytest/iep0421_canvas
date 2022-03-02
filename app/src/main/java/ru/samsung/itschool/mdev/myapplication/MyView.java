package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint pen = new Paint();
        pen.setColor(Color.RED);
        //pen.setColor(Color.parseColor("#000000"));
        //pen.setColor(Color.rgb(200,200,100));
        pen.setStrokeWidth(20);
        pen.setStyle(Paint.Style.FILL); // тип заливки
        pen.setAntiAlias(true); //  сглаживание
        canvas.drawColor(Color.YELLOW); // фон canvas
        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,300,pen);

        Path path = new Path();
        path.moveTo(100,100);
        path.lineTo(200,200);
        
    }
}
