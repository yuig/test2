package bm1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23491a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23492b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23493c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23494d;

    /* renamed from: e, reason: collision with root package name */
    public float f23495e;

    /* renamed from: f, reason: collision with root package name */
    public float f23496f;

    /* renamed from: g, reason: collision with root package name */
    public float f23497g;

    /* renamed from: h, reason: collision with root package name */
    public float f23498h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f23499i = new Paint(1);

    /* renamed from: j, reason: collision with root package name */
    public final Paint f23500j = new Paint(1);

    /* renamed from: k, reason: collision with root package name */
    public final Paint f23501k = new Paint(1);

    /* renamed from: l, reason: collision with root package name */
    public final Paint f23502l = new Paint(1);

    /* renamed from: m, reason: collision with root package name */
    public final Paint f23503m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f23504n;

    public c0(boolean z13, int i13, float f13, float f14, float f15, int i14) {
        this.f23491a = z13;
        this.f23492b = f13;
        this.f23493c = f14;
        this.f23494d = f15;
        Paint paint = new Paint(1);
        paint.setColor(i13);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f13);
        this.f23503m = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(i14);
        paint2.setStyle(style);
        paint2.setStrokeWidth(f15);
        this.f23504n = paint2;
    }

    public static Path a(c0 c0Var, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, int i13) {
        if ((i13 & 16) != 0) {
            f17 = 0.0f;
        }
        if ((i13 & 32) != 0) {
            f18 = 0.0f;
        }
        if ((i13 & 64) != 0) {
            f19 = 0.0f;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            f23 = 0.0f;
        }
        c0Var.getClass();
        Path path = new Path();
        path.addRoundRect(new RectF(f13, f14, f15, f16), new float[]{f17, f17, f18, f18, f19, f19, f23, f23}, Path.Direction.CW);
        path.close();
        return path;
    }

    public final void b() {
        this.f23495e = (getBounds().width() / 2.0f) + getBounds().left;
        this.f23496f = (getBounds().height() / 2.0f) + getBounds().top;
        this.f23497g = getBounds().width() + getBounds().left;
        this.f23498h = getBounds().height() + getBounds().top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f13 = 1;
        canvas.drawPath(a(this, getBounds().left, getBounds().top, this.f23495e + f13, this.f23496f, this.f23493c, 0.0f, 0.0f, 0.0f, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL), this.f23501k);
        canvas.drawPath(a(this, this.f23495e, getBounds().top, this.f23497g, this.f23496f, 0.0f, this.f23493c, 0.0f, 0.0f, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION), this.f23502l);
        canvas.drawPath(a(this, getBounds().left, this.f23496f, this.f23495e + f13, this.f23498h, 0.0f, 0.0f, 0.0f, this.f23493c, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), this.f23500j);
        canvas.drawPath(a(this, this.f23495e, this.f23496f, this.f23497g, this.f23498h, 0.0f, 0.0f, this.f23493c, 0.0f, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN), this.f23499i);
        if (this.f23491a) {
            RectF rectF = new RectF(getBounds());
            Paint paint = this.f23503m;
            float f14 = this.f23493c;
            canvas.drawRoundRect(rectF, f14, f14, paint);
            if (this.f23494d > 0.0f) {
                float f15 = getBounds().left;
                float f16 = this.f23492b;
                float f17 = f14 - f16;
                canvas.drawRoundRect(new RectF(f15 + f16, getBounds().top + f16, getBounds().right - f16, getBounds().bottom - f16), f17, f17, this.f23504n);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        int i17 = (int) (this.f23492b / 2);
        super.setBounds(i13 + i17, i14 + i17, i15 - i17, i16 - i17);
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.setBounds(bounds);
        b();
    }
}
