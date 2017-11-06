package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.RED);
        canvas.drawArc(new RectF(200, 50, 800, 650), -180, 100, true, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(new RectF(210, 60, 810, 660), -80, 66, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(new RectF(210, 60, 810, 660), -12, 62, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(new RectF(210, 60, 810, 660), 52, 128, true, paint);

        paint.setColor(Color.GRAY);
        paint.setTextSize(50);
        canvas.drawText("Lollipop", 30, 50, paint);

        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(200, 50);
        path.lineTo(300, 50);
        path.lineTo(350, 100);
        canvas.drawPath(path, paint);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
