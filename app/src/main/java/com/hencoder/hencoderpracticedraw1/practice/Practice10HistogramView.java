package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawLine(100, 100, 100, 500, paint);
        canvas.drawLine(100, 500, 1000, 500, paint);

        for (int i = 0; i < 7; i++) {
            paint.setColor(Color.GREEN);
            canvas.drawRect(new Rect(120 * (i + 1), (int) (Math.random() * 500), 120 * (i + 1) + 100, 500), paint);
        }


    }
}
