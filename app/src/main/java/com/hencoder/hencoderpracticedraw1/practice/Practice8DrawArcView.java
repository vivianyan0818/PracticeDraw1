package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        p.setStyle(Paint.Style.FILL);

        canvas.drawArc(new RectF(200, 200, 600, 400), -110, 100, true, p);
        canvas.drawArc(new RectF(200, 200, 600, 400), 20, 140, false, p);

        p.setStyle(Paint.Style.STROKE);
        canvas.drawArc(new RectF(200, 200, 600, 400), 180, 60, false, p);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
