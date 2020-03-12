package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.net.PasswordAuthentication;

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

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX()
        Paint paint = new Paint();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            paint.setColor(Color.YELLOW);
            // 圆饼图
            canvas.drawArc(200,100,800,700,-65,62,true,paint);

            paint.setColor(Color.CYAN);
            canvas.drawArc(200,100,800,700,1,10,true,paint);

            paint.setColor(Color.GRAY);
            canvas.drawArc(200,100,800,700,13,5,true,paint);

            paint.setColor(Color.GREEN);
            canvas.drawArc(200,100,800,700,18,60,true,paint);

            paint.setColor(Color.BLUE);
            canvas.drawArc(200,100,800,700,80,100,true,paint);

            paint.setColor(Color.RED);
            canvas.drawArc(180,80,780,680,185,110,true,paint);

            // 标签
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(Color.WHITE);
            Path path = new Path();
            path.moveTo(670,150);
            path.lineTo(800,80);
            path.rLineTo(100,0);
            canvas.drawPath(path,paint);

            paint.setTextSize(20);
            canvas.drawText("描述信息",900,80,paint);
        }
    }
}
