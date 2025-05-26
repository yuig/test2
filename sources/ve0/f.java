package ve0;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f125687a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f125688b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f125689c;

    /* renamed from: d, reason: collision with root package name */
    public b f125690d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125691e = false;

    /* renamed from: f, reason: collision with root package name */
    public float f125692f;

    /* renamed from: g, reason: collision with root package name */
    public final d f125693g;

    /* renamed from: h, reason: collision with root package name */
    public e f125694h;

    public f(int i13, d dVar, int i14) {
        this.f125692f = 0.0f;
        this.f125693g = dVar;
        Paint paint = new Paint(1);
        this.f125687a = paint;
        paint.setColor(i13);
        Paint paint2 = new Paint(1);
        this.f125688b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dVar.f125678b);
        paint2.setColor(i14);
        paint2.setStrokeCap(Paint.Cap.BUTT);
        this.f125689c = new Rect();
        this.f125690d = b.TOP_LEFT;
        this.f125692f = dVar.f125677a;
        this.f125694h = null;
    }

    public boolean a(Drawable drawable) {
        return false;
    }

    public abstract void b(Rect rect);

    public void c(b bVar) {
        this.f125690d = bVar;
    }

    public final void d(int i13) {
        this.f125687a.setColor(i13);
    }

    public final void e(Context context, int i13, int i14, int i15, int i16) {
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        Rect rect = this.f125689c;
        if (layoutDirection == 1) {
            rect.set(i15, i14, i13, i16);
        } else {
            rect.set(i13, i14, i15, i16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f125687a.getAlpha() == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        rect.set(this.f125689c);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f125687a.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i13, int i14, int i15, int i16) {
        int i17;
        if (i15 < i13) {
            i15 = i13;
        }
        if (i16 < i14) {
            i16 = i14;
        }
        if (this.f125693g.f125679c && i16 - i14 > (i17 = i15 - i13)) {
            i16 = i14 + i17;
        }
        super.setBounds(i13, i14, i15, i16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f125687a.setColorFilter(colorFilter);
    }
}
