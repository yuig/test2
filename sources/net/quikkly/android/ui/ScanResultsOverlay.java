package net.quikkly.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import net.quikkly.android.R;
import net.quikkly.core.Point;
import net.quikkly.core.ScanResult;
import net.quikkly.core.Tag;

/* loaded from: classes4.dex */
public class ScanResultsOverlay extends View {
    Paint boxPaint;
    boolean drawBoxes;
    boolean drawData;
    Handler handler;
    int height;
    long lastDrawStartMillis;
    ScanResult result;
    int rotation;
    Point[] tempCorners;
    Paint textPaint;
    int width;

    public ScanResultsOverlay(Context context) {
        super(context);
        this.handler = new Handler();
        this.lastDrawStartMillis = 0L;
        this.result = null;
        this.drawBoxes = true;
        this.drawData = true;
        this.rotation = 0;
        this.tempCorners = new Point[]{new Point(), new Point(), new Point(), new Point()};
        init();
    }

    private void drawBox(Canvas canvas, Point[] pointArr, Paint paint) {
        if (pointArr != null) {
            int i13 = 0;
            while (i13 < 4) {
                Point point = pointArr[i13];
                float f13 = point.f90479x;
                float f14 = point.f90480y;
                i13++;
                Point point2 = pointArr[i13 % 4];
                canvas.drawLine(f13, f14, point2.f90479x, point2.f90480y, paint);
            }
        }
    }

    private void drawText(Canvas canvas, String str, Point[] pointArr, Paint paint) {
        float f13;
        float f14;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (pointArr != null) {
            float f15 = 0.0f;
            float f16 = 0.0f;
            for (Point point : pointArr) {
                f15 += point.f90479x;
                f16 += point.f90480y;
            }
            f13 = f15 / 4.0f;
            f14 = f16 / 4.0f;
        } else {
            f13 = this.width * 0.5f;
            f14 = this.height * 0.8f;
        }
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f13 - (r10.width() / 2), f14 - (r10.height() / 2), paint);
    }

    private void init() {
        Paint paint = new Paint(1);
        this.boxPaint = paint;
        paint.setStrokeWidth(8.0f);
        Paint paint2 = new Paint(1);
        this.textPaint = paint2;
        paint2.setTextSize(100.0f);
        this.boxPaint.setColor(getResources().getColor(R.color.quikkly_overlay_box, getContext().getTheme()));
        this.textPaint.setColor(getResources().getColor(R.color.quikkly_overlay_text, getContext().getTheme()));
    }

    public boolean getDrawBoxes() {
        return this.drawBoxes;
    }

    public boolean getDrawData() {
        return this.drawData;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ScanResult scanResult = this.result;
        if (scanResult != null) {
            if (this.drawBoxes || this.drawData) {
                for (Tag tag : scanResult.tags) {
                    Point[] scaledCorners = tag.getScaledCorners(this.width, this.height, this.rotation, this.tempCorners);
                    if (this.drawBoxes) {
                        drawBox(canvas, scaledCorners, this.boxPaint);
                    }
                    if (this.drawData) {
                        drawText(canvas, tag.getData().toString(), scaledCorners, this.textPaint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.width = i13;
        this.height = i14;
        invalidate();
    }

    public void setDrawBoxes(boolean z13) {
        this.drawBoxes = z13;
        invalidate();
    }

    public void setDrawData(boolean z13) {
        this.drawData = z13;
        invalidate();
    }

    public void setResult(ScanResult scanResult) {
        if (this.result == null && scanResult == null) {
            return;
        }
        this.result = scanResult;
        this.handler.post(new Runnable() { // from class: net.quikkly.android.ui.ScanResultsOverlay.1
            @Override // java.lang.Runnable
            public void run() {
                ScanResultsOverlay.this.invalidate();
            }
        });
    }

    public void setRotation(int i13) {
        this.rotation = i13;
    }

    public ScanResultsOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handler = new Handler();
        this.lastDrawStartMillis = 0L;
        this.result = null;
        this.drawBoxes = true;
        this.drawData = true;
        this.rotation = 0;
        this.tempCorners = new Point[]{new Point(), new Point(), new Point(), new Point()};
        init();
    }

    public ScanResultsOverlay(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.handler = new Handler();
        this.lastDrawStartMillis = 0L;
        this.result = null;
        this.drawBoxes = true;
        this.drawData = true;
        this.rotation = 0;
        this.tempCorners = new Point[]{new Point(), new Point(), new Point(), new Point()};
        init();
    }
}
