package hs1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class b extends BitmapDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final long f70029a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f70030b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70031c;

    static {
        new Paint();
    }

    public b(Context context, Bitmap bitmap, x xVar) {
        super(context.getResources(), bitmap);
        this.f70031c = 255;
        float f13 = context.getResources().getDisplayMetrics().density;
        if (xVar != x.MEMORY) {
            this.f70030b = true;
            this.f70029a = SystemClock.uptimeMillis();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.f70030b) {
            super.draw(canvas);
            return;
        }
        float uptimeMillis = (SystemClock.uptimeMillis() - this.f70029a) / 200.0f;
        if (uptimeMillis >= 1.0f) {
            this.f70030b = false;
            super.draw(canvas);
        } else {
            int i13 = this.f70031c;
            super.setAlpha((int) (i13 * uptimeMillis));
            super.draw(canvas);
            super.setAlpha(i13);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        super.setAlpha(i13);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }
}
