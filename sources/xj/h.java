package xj;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import c0.s0;

/* loaded from: classes3.dex */
public final class h extends j {

    /* renamed from: q, reason: collision with root package name */
    public static final g f135101q = new g();

    /* renamed from: l, reason: collision with root package name */
    public final s0 f135102l;

    /* renamed from: m, reason: collision with root package name */
    public final g6.i f135103m;

    /* renamed from: n, reason: collision with root package name */
    public final g6.h f135104n;

    /* renamed from: o, reason: collision with root package name */
    public final k f135105o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f135106p;

    public h(Context context, c cVar, s0 s0Var) {
        super(context, cVar);
        this.f135106p = false;
        this.f135102l = s0Var;
        this.f135105o = new k();
        g6.i iVar = new g6.i();
        this.f135103m = iVar;
        iVar.f63682b = 1.0f;
        iVar.f63683c = false;
        iVar.f63681a = Math.sqrt(50.0f);
        iVar.f63683c = false;
        g6.h hVar = new g6.h(this);
        this.f135104n = hVar;
        hVar.f63678m = iVar;
        if (this.f135117h != 1.0f) {
            this.f135117h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // xj.j
    public final boolean d(boolean z13, boolean z14, boolean z15) {
        boolean d2 = super.d(z13, z14, z15);
        ContentResolver contentResolver = this.f135110a.getContentResolver();
        this.f135112c.getClass();
        float f13 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f13 == 0.0f) {
            this.f135106p = true;
        } else {
            this.f135106p = false;
            float f14 = 50.0f / f13;
            g6.i iVar = this.f135103m;
            iVar.getClass();
            if (f14 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            iVar.f63681a = Math.sqrt(f14);
            iVar.f63683c = false;
        }
        return d2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            s0 s0Var = this.f135102l;
            Rect bounds = getBounds();
            float b13 = b();
            ValueAnimator valueAnimator = this.f135113d;
            boolean z13 = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.f135114e;
            boolean z14 = valueAnimator2 != null && valueAnimator2.isRunning();
            ((c) s0Var.f24333a).a();
            s0Var.b(canvas, bounds, b13, z13, z14);
            Paint paint = this.f135118i;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            c cVar = this.f135111b;
            int i13 = cVar.f135076c[0];
            k kVar = this.f135105o;
            kVar.f135122c = i13;
            int i14 = cVar.f135080g;
            if (i14 > 0) {
                if (!(this.f135102l instanceof m)) {
                    i14 = (int) ((com.bumptech.glide.c.p(kVar.f135121b, 0.0f, 0.01f) * i14) / 0.01f);
                }
                this.f135102l.g(canvas, paint, kVar.f135121b, 1.0f, cVar.f135077d, this.f135119j, i14);
            } else {
                this.f135102l.g(canvas, paint, 0.0f, 1.0f, cVar.f135077d, this.f135119j, 0);
            }
            this.f135102l.f(canvas, paint, kVar, this.f135119j);
            this.f135102l.e(canvas, paint, cVar.f135076c[0], this.f135119j);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f135102l.h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f135102l.i();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f135104n.d();
        this.f135105o.f135121b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        boolean z13 = this.f135106p;
        k kVar = this.f135105o;
        g6.h hVar = this.f135104n;
        if (z13) {
            hVar.d();
            kVar.f135121b = i13 / 10000.0f;
            invalidateSelf();
        } else {
            hVar.f63667b = kVar.f135121b * 10000.0f;
            hVar.f63668c = true;
            float f13 = i13;
            if (hVar.f63671f) {
                hVar.f63679n = f13;
            } else {
                if (hVar.f63678m == null) {
                    hVar.f63678m = new g6.i(f13);
                }
                hVar.f63678m.f63689i = f13;
                hVar.e();
            }
        }
        return true;
    }
}
