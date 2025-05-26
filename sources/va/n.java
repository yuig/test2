package va;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f125080a;

    /* renamed from: b, reason: collision with root package name */
    public m f125081b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f125082c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f125083d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125084e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f125085f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f125086g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f125087h;

    /* renamed from: i, reason: collision with root package name */
    public int f125088i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f125089j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f125090k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f125091l;

    public n(n nVar) {
        this.f125082c = null;
        this.f125083d = p.f125093j;
        if (nVar != null) {
            this.f125080a = nVar.f125080a;
            m mVar = new m(nVar.f125081b);
            this.f125081b = mVar;
            if (nVar.f125081b.f125069e != null) {
                mVar.f125069e = new Paint(nVar.f125081b.f125069e);
            }
            if (nVar.f125081b.f125068d != null) {
                this.f125081b.f125068d = new Paint(nVar.f125081b.f125068d);
            }
            this.f125082c = nVar.f125082c;
            this.f125083d = nVar.f125083d;
            this.f125084e = nVar.f125084e;
        }
    }

    public final boolean a() {
        return !this.f125090k && this.f125086g == this.f125082c && this.f125087h == this.f125083d && this.f125089j == this.f125084e && this.f125088i == this.f125081b.getRootAlpha();
    }

    public final void b(int i13, int i14) {
        Bitmap bitmap = this.f125085f;
        if (bitmap != null && i13 == bitmap.getWidth() && i14 == this.f125085f.getHeight()) {
            return;
        }
        this.f125085f = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        this.f125090k = true;
    }

    public final void c(Canvas canvas, ColorFilter colorFilter, Rect rect) {
        Paint paint;
        if (this.f125081b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (this.f125091l == null) {
                Paint paint2 = new Paint();
                this.f125091l = paint2;
                paint2.setFilterBitmap(true);
            }
            this.f125091l.setAlpha(this.f125081b.getRootAlpha());
            this.f125091l.setColorFilter(colorFilter);
            paint = this.f125091l;
        }
        canvas.drawBitmap(this.f125085f, (Rect) null, rect, paint);
    }

    public final boolean d() {
        m mVar = this.f125081b;
        if (mVar.f125078n == null) {
            mVar.f125078n = Boolean.valueOf(mVar.f125071g.a());
        }
        return mVar.f125078n.booleanValue();
    }

    public final boolean e(int[] iArr) {
        boolean b13 = this.f125081b.f125071g.b(iArr);
        this.f125090k |= b13;
        return b13;
    }

    public final void f() {
        this.f125086g = this.f125082c;
        this.f125087h = this.f125083d;
        this.f125088i = this.f125081b.getRootAlpha();
        this.f125089j = this.f125084e;
        this.f125090k = false;
    }

    public final void g(int i13, int i14) {
        this.f125085f.eraseColor(0);
        Canvas canvas = new Canvas(this.f125085f);
        m mVar = this.f125081b;
        mVar.a(mVar.f125071g, m.f125064p, canvas, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f125080a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }

    public n() {
        this.f125082c = null;
        this.f125083d = p.f125093j;
        this.f125081b = new m();
    }
}
