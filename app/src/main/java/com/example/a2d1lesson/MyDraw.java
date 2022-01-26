package com.example.a2d1lesson;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyDraw extends View {
    public MyDraw (Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setSubpixelText(true);
        paint.setAntiAlias(true);

        Paint test_pain = new Paint();
        int colorForTest = Color.argb(100, 222, 222, 222);
        int colorParserTest = Color.parseColor("#FF0000FF");
        test_pain.setColor(colorForTest);
        // пример использования цветов через ресурсы.
        int tealColor = getResources().getColor(R.color.teal_700);
        // сам код

        Paint ppWork = new Paint();
        ppWork.setColor(getResources().getColor(R.color.white));
        canvas.drawPaint(ppWork);


        /*Bitmap alabama = BitmapFactory.decodeResource(getResources(), R.drawable.lesff);
        int xx =canvas.getWidth(), yy = canvas.getHeight();
        canvas.drawBitmap(alabama, xx - alabama.getWidth(), yy - alabama.getHeight(), ppWork);
        */

        ppWork.setAntiAlias(true);
        ppWork.setColor(Color.argb(100, 122, 122, 122));
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, 100, ppWork);

        ppWork.setAntiAlias(false);
        ppWork.setColor(Color.argb(100, 255, 0, 0));
        canvas.drawCircle(getWidth() / 3, getHeight() / 3, 100, ppWork);

        ppWork.setSubpixelText(true);
        ppWork.setColor(getResources().getColor(R.color.black));
        canvas.drawRect(0, 0, getWidth(), 200, ppWork);

        ppWork.setTextSize(30);
        canvas.drawText("Aboba", 50, 100, paint);

        // текст под углом
        float rotate_center_x = 200; //центр поворота холста по оси X
        float rotate_center_y = 200; // центр поворота холста по оси Y
        float rotate_angle = 45; //угол поворота

        // поворачиваем холст
        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);


        canvas.drawText("booba", 0, 450, ppWork);

        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        /*for (int i = 1; i <5; i ++)
            canvas.drawRect(100,100*i, 100*i,100+100*i , paint);
        */
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawRect(100, 50, 500, 450, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        canvas.drawCircle(300, 250, 50, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(50, 80, 400, 280, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(150, 150, 50, paint);

        // начало рисунка можно стереть всё ниже

        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);

        int limegreen = getResources().getColor(R.color.limegreen);
        int lightskyblue = getResources().getColor(R.color.lightskyblue);
        int gold = getResources().getColor(R.color.gold);
        int brown = getResources().getColor(R.color.brown);
        int DodgerBlue = getResources().getColor(R.color.DodgerBlue);
        int BurlyWood = getResources().getColor(R.color.BurlyWood);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setSubpixelText(true);
        paint.setAntiAlias(true);

        paint.setColor(lightskyblue);

        canvas.drawRect(0, 0, getWidth(), getHeight(), paint);

        paint.setColor(limegreen);

        canvas.drawRect(0, getHeight() / 1.5f, getWidth(), getHeight(), paint);

        paint.setColor(gold);

        canvas.drawCircle(getWidth() * 0.9f, getHeight() * 0.1f, 65, paint);

        paint.setColor(Color.BLACK);

        canvas.drawCircle(getWidth() * 0.88f, getHeight() * 0.09f, 3, paint);
        canvas.drawCircle(getWidth() * 0.92f, getHeight() * 0.09f, 3, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(getWidth() * 0.87f, getHeight() * 0.1f, getWidth() * 0.93f, getHeight() * 0.12f, 0, 180, false, paint);

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(brown);
        /*
        float sp[] = {100, 100, 200, 200, 200, 200, 400, 400, 400, 400, 123, 300, 123, 300, 100, 100};
        canvas.drawLines(sp, paint);*/

        Path path = new Path();
        path.moveTo(getWidth() * 0.18f,getHeight() * .55f);
        path.lineTo(getWidth() * 0.325f,getHeight() * .35f);
        path.lineTo(getWidth() * 0.47f,getHeight() * .55f);
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawRect(getWidth() * 0.2f, getHeight() * .55f, getWidth() * 0.45f, getHeight() * .75f, paint);

        paint.setColor(DodgerBlue);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(getWidth() * 0.325f, getHeight() * 0.48f, 40, paint);

        paint.setColor(Color.WHITE);
        canvas.drawLine(getWidth() * 0.325f, getHeight() * 0.453f,getWidth() * 0.325f, getHeight() * 0.508f, paint);
        canvas.drawLine(getWidth() * 0.283f, getHeight() * 0.48f,getWidth() * 0.367f, getHeight() * 0.48f, paint);

        paint.setColor(BurlyWood);
        canvas.drawRect(getWidth() * 0.27f, getHeight() * .60f, getWidth() * 0.38f, getHeight() * .75f, paint);

        paint.setColor(Color.BLACK);
        canvas.drawCircle(getWidth() * 0.37f, getHeight() * 0.68f, 6, paint);

        paint.setColor(BurlyWood);
        float kf_x = 0.45f;
        for (int i = 0; i < 7; i++) {
            canvas.drawRect(getWidth() * kf_x, getHeight() * .65f, getWidth() * (kf_x + 0.03f), getHeight() * .75f, paint);
            if (i != 6)canvas.drawRect(getWidth() * (kf_x+ 0.03f), getHeight() * .68f, getWidth() * (kf_x + 0.06f), getHeight() * .7f, paint);
            kf_x += 0.06f;

        }
        paint.setColor(Color.WHITE);

        canvas.drawCircle(getWidth() * 0.4f, getHeight() * 0.09f, 25, paint);
        canvas.drawCircle(getWidth() * 0.44f, getHeight() * 0.09f, 40, paint);
        canvas.drawCircle(getWidth() * 0.48f, getHeight() * 0.09f, 25, paint);

        canvas.drawCircle(getWidth() * 0.6f, getHeight() * 0.2f, 25, paint);
        canvas.drawCircle(getWidth() * 0.64f, getHeight() * 0.2f, 40, paint);
        canvas.drawCircle(getWidth() * 0.68f, getHeight() * 0.2f, 25, paint);

        canvas.drawCircle(getWidth() * 0.2f, getHeight() * 0.15f, 25, paint);
        canvas.drawCircle(getWidth() * 0.24f, getHeight() * 0.15f, 40, paint);
        canvas.drawCircle(getWidth() * 0.28f, getHeight() * 0.15f, 25, paint);


        Bitmap alabama = BitmapFactory.decodeResource(getResources(), R.drawable.grass);

        float kf_xg = 0f;
        float kf_yg=0f;
        for (int g = 0; g<6;g++) {
            kf_xg = 0f;
            for (int i = 0; i < 70; i++) {
                canvas.drawBitmap(alabama, kf_xg * getWidth(), getHeight() * (0.8f+kf_yg), paint);
                kf_xg += 0.03f;
            }kf_yg+=0.03f;
        }


    }
}
