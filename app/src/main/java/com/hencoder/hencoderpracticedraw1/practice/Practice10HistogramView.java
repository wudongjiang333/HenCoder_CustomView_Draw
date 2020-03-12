package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

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
        paint.setAntiAlias(true);
        // 1. 先画坐标
        canvas.drawLine(100,50,100,650,paint);
        canvas.drawLine(100,650,1050,650,paint);

        // 2.勾勒直方图
        int startX = 125;
        Random random = new Random();
        for (int i = 0;i < 7;i++){
            paint.setColor(Color.GREEN);
            canvas.drawRect(startX,random.nextInt(600),startX+100,650,paint);

            // 3.填写标签
            paint.setColor(Color.WHITE);
            paint.setTextSize(30);
            canvas.drawText("标签"+i,startX+25,650+50,paint);

            startX+=100+25;//下一个直方图的x起始点
        }

    }
}
