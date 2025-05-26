package com.pinterest.design.progress;

import af0.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import le0.c;

/* loaded from: classes5.dex */
public class SmallLoadingView extends View {

    /* renamed from: c, reason: collision with root package name */
    public static final int f44933c = c.loading;

    /* renamed from: a, reason: collision with root package name */
    public a f44934a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f44935b;

    public SmallLoadingView(Context context) {
        super(context);
        this.f44935b = true;
        a(context);
    }

    public final void a(Context context) {
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(f44933c);
        a aVar = new a();
        aVar.f15073a = null;
        if (drawable instanceof BitmapDrawable) {
            aVar.f15077e = ((BitmapDrawable) drawable).getBitmap();
        }
        if (aVar.f15078f == null) {
            Paint paint = new Paint();
            aVar.f15078f = paint;
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
        }
        this.f44934a = aVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.f44935b && getVisibility() == 0) {
            a aVar = this.f44934a;
            int measuredWidth = getMeasuredWidth();
            getMeasuredHeight();
            Bitmap bitmap = aVar.f15077e;
            if (bitmap != null && (paint = aVar.f15078f) != null) {
                int max = Math.max(0, aVar.f15074b * 2);
                int max2 = Math.max(0, aVar.f15075c * 2);
                if (measuredWidth <= 0) {
                    measuredWidth = bitmap.getWidth();
                }
                if (aVar.f15073a == null) {
                    aVar.f15073a = new Matrix();
                    aVar.f15074b = bitmap.getWidth() / 2;
                    aVar.f15075c = bitmap.getHeight() / 2;
                    aVar.f15076d = measuredWidth / bitmap.getWidth();
                }
                aVar.f15073a.postRotate(12.0f, aVar.f15074b, aVar.f15075c);
                canvas.save();
                float f13 = aVar.f15076d;
                canvas.scale(f13, f13);
                canvas.translate((max / 2) - aVar.f15074b, (max2 / 2) - aVar.f15075c);
                canvas.drawBitmap(bitmap, aVar.f15073a, paint);
                canvas.restore();
                postInvalidateDelayed(33);
            }
        }
        super.onDraw(canvas);
    }

    public SmallLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmallLoadingView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f44935b = true;
        a(context);
    }
}
