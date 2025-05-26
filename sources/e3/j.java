package e3;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import b3.s0;
import b3.u;
import b3.w;
import k1.s2;

/* loaded from: classes2.dex */
public final class j implements f {
    public static final i A = new i();

    /* renamed from: b, reason: collision with root package name */
    public final f3.a f57078b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f57079c;

    /* renamed from: d, reason: collision with root package name */
    public final q f57080d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f57081e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f57082f;

    /* renamed from: g, reason: collision with root package name */
    public int f57083g;

    /* renamed from: h, reason: collision with root package name */
    public int f57084h;

    /* renamed from: i, reason: collision with root package name */
    public long f57085i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f57086j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f57087k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f57088l;

    /* renamed from: m, reason: collision with root package name */
    public final int f57089m;

    /* renamed from: n, reason: collision with root package name */
    public int f57090n;

    /* renamed from: o, reason: collision with root package name */
    public float f57091o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f57092p;

    /* renamed from: q, reason: collision with root package name */
    public float f57093q;

    /* renamed from: r, reason: collision with root package name */
    public float f57094r;

    /* renamed from: s, reason: collision with root package name */
    public float f57095s;

    /* renamed from: t, reason: collision with root package name */
    public float f57096t;

    /* renamed from: u, reason: collision with root package name */
    public float f57097u;

    /* renamed from: v, reason: collision with root package name */
    public long f57098v;

    /* renamed from: w, reason: collision with root package name */
    public long f57099w;

    /* renamed from: x, reason: collision with root package name */
    public float f57100x;

    /* renamed from: y, reason: collision with root package name */
    public float f57101y;

    /* renamed from: z, reason: collision with root package name */
    public float f57102z;

    public j(f3.a aVar) {
        h1.b bVar = new h1.b(2);
        d3.c cVar = new d3.c();
        this.f57078b = aVar;
        this.f57079c = bVar;
        q qVar = new q(aVar, bVar, cVar);
        this.f57080d = qVar;
        this.f57081e = aVar.getResources();
        this.f57082f = new Rect();
        aVar.addView(qVar);
        qVar.setClipBounds(null);
        this.f57085i = 0L;
        View.generateViewId();
        this.f57089m = 3;
        this.f57090n = 0;
        this.f57091o = 1.0f;
        this.f57093q = 1.0f;
        this.f57094r = 1.0f;
        long j13 = w.f21378b;
        this.f57098v = j13;
        this.f57099w = j13;
    }

    @Override // e3.f
    public final Matrix A() {
        return this.f57080d.getMatrix();
    }

    @Override // e3.f
    public final int B() {
        return this.f57089m;
    }

    @Override // e3.f
    public final float C() {
        return this.f57093q;
    }

    @Override // e3.f
    public final void D(float f13) {
        this.f57097u = f13;
        this.f57080d.setElevation(f13);
    }

    @Override // e3.f
    public final void E(Outline outline, long j13) {
        q qVar = this.f57080d;
        qVar.f57113d = outline;
        qVar.invalidateOutline();
        if (j() && outline != null) {
            this.f57080d.setClipToOutline(true);
            if (this.f57088l) {
                this.f57088l = false;
                this.f57086j = true;
            }
        }
        this.f57087k = outline != null;
    }

    @Override // e3.f
    public final void F(long j13) {
        boolean z03 = com.bumptech.glide.c.z0(j13);
        q qVar = this.f57080d;
        if (!z03) {
            this.f57092p = false;
            qVar.setPivotX(a3.c.d(j13));
            qVar.setPivotY(a3.c.e(j13));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                qVar.resetPivot();
                return;
            }
            this.f57092p = true;
            qVar.setPivotX(((int) (this.f57085i >> 32)) / 2.0f);
            qVar.setPivotY(((int) (this.f57085i & 4294967295L)) / 2.0f);
        }
    }

    @Override // e3.f
    public final void G(u uVar) {
        Rect rect;
        boolean z13 = this.f57086j;
        q qVar = this.f57080d;
        if (z13) {
            if (!j() || this.f57087k) {
                rect = null;
            } else {
                rect = this.f57082f;
                rect.left = 0;
                rect.top = 0;
                rect.right = qVar.getWidth();
                rect.bottom = qVar.getHeight();
            }
            qVar.setClipBounds(rect);
        }
        if (b3.e.b(uVar).isHardwareAccelerated()) {
            this.f57078b.a(uVar, qVar, qVar.getDrawingTime());
        }
    }

    @Override // e3.f
    public final float H() {
        return this.f57096t;
    }

    @Override // e3.f
    public final float I() {
        return this.f57095s;
    }

    @Override // e3.f
    public final float J() {
        return this.f57100x;
    }

    @Override // e3.f
    public final void K(int i13) {
        this.f57090n = i13;
        if (tb.f.H(i13, 1) || (!s0.a(this.f57089m, 3))) {
            i(1);
        } else {
            i(this.f57090n);
        }
    }

    @Override // e3.f
    public final float L() {
        return this.f57097u;
    }

    @Override // e3.f
    public final float M() {
        return this.f57094r;
    }

    @Override // e3.f
    public final float a() {
        return this.f57091o;
    }

    @Override // e3.f
    public final void b(float f13) {
        this.f57096t = f13;
        this.f57080d.setTranslationY(f13);
    }

    @Override // e3.f
    public final void c() {
        this.f57078b.removeViewInLayout(this.f57080d);
    }

    @Override // e3.f
    public final void e(float f13) {
        this.f57093q = f13;
        this.f57080d.setScaleX(f13);
    }

    @Override // e3.f
    public final void f(float f13) {
        this.f57080d.setCameraDistance(f13 * this.f57081e.getDisplayMetrics().densityDpi);
    }

    @Override // e3.f
    public final void g(float f13) {
        this.f57100x = f13;
        this.f57080d.setRotationX(f13);
    }

    @Override // e3.f
    public final void h(float f13) {
        this.f57101y = f13;
        this.f57080d.setRotationY(f13);
    }

    public final void i(int i13) {
        boolean z13 = true;
        boolean H = tb.f.H(i13, 1);
        q qVar = this.f57080d;
        if (H) {
            qVar.setLayerType(2, null);
        } else if (tb.f.H(i13, 2)) {
            qVar.setLayerType(0, null);
            z13 = false;
        } else {
            qVar.setLayerType(0, null);
        }
        if (qVar.f57114e != z13) {
            qVar.f57114e = z13;
            qVar.invalidate();
        }
    }

    public final boolean j() {
        return this.f57088l || this.f57080d.getClipToOutline();
    }

    @Override // e3.f
    public final void k() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f57080d.setRenderEffect(null);
        }
    }

    @Override // e3.f
    public final void l(float f13) {
        this.f57102z = f13;
        this.f57080d.setRotation(f13);
    }

    @Override // e3.f
    public final void m(float f13) {
        this.f57094r = f13;
        this.f57080d.setScaleY(f13);
    }

    @Override // e3.f
    public final void n(float f13) {
        this.f57091o = f13;
        this.f57080d.setAlpha(f13);
    }

    @Override // e3.f
    public final void o(float f13) {
        this.f57095s = f13;
        this.f57080d.setTranslationX(f13);
    }

    @Override // e3.f
    public final int p() {
        return this.f57090n;
    }

    @Override // e3.f
    public final void q(int i13, int i14, long j13) {
        boolean a13 = n4.j.a(this.f57085i, j13);
        q qVar = this.f57080d;
        if (a13) {
            int i15 = this.f57083g;
            if (i15 != i13) {
                qVar.offsetLeftAndRight(i13 - i15);
            }
            int i16 = this.f57084h;
            if (i16 != i14) {
                qVar.offsetTopAndBottom(i14 - i16);
            }
        } else {
            if (j()) {
                this.f57086j = true;
            }
            int i17 = (int) (j13 >> 32);
            int i18 = (int) (4294967295L & j13);
            qVar.layout(i13, i14, i13 + i17, i14 + i18);
            this.f57085i = j13;
            if (this.f57092p) {
                qVar.setPivotX(i17 / 2.0f);
                qVar.setPivotY(i18 / 2.0f);
            }
        }
        this.f57083g = i13;
        this.f57084h = i14;
    }

    @Override // e3.f
    public final float r() {
        return this.f57101y;
    }

    @Override // e3.f
    public final float s() {
        return this.f57102z;
    }

    @Override // e3.f
    public final long t() {
        return this.f57098v;
    }

    @Override // e3.f
    public final void u(n4.b bVar, n4.k kVar, d dVar, s2 s2Var) {
        q qVar = this.f57080d;
        ViewParent parent = qVar.getParent();
        f3.a aVar = this.f57078b;
        if (parent == null) {
            aVar.addView(qVar);
        }
        qVar.f57115f = bVar;
        qVar.f57116g = kVar;
        qVar.f57117h = s2Var;
        qVar.f57118i = dVar;
        if (qVar.isAttachedToWindow()) {
            qVar.setVisibility(4);
            qVar.setVisibility(0);
            try {
                h1.b bVar2 = this.f57079c;
                i iVar = A;
                Object obj = bVar2.f66449b;
                Canvas canvas = ((b3.d) obj).f21309a;
                ((b3.d) obj).f21309a = iVar;
                aVar.a((b3.d) obj, qVar, qVar.getDrawingTime());
                ((b3.d) bVar2.f66449b).f21309a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // e3.f
    public final long v() {
        return this.f57099w;
    }

    @Override // e3.f
    public final void w(long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57098v = j13;
            this.f57080d.setOutlineAmbientShadowColor(androidx.compose.ui.graphics.a.u(j13));
        }
    }

    @Override // e3.f
    public final float x() {
        return this.f57080d.getCameraDistance() / this.f57081e.getDisplayMetrics().densityDpi;
    }

    @Override // e3.f
    public final void y(boolean z13) {
        boolean z14 = false;
        this.f57088l = z13 && !this.f57087k;
        this.f57086j = true;
        if (z13 && this.f57087k) {
            z14 = true;
        }
        this.f57080d.setClipToOutline(z14);
    }

    @Override // e3.f
    public final void z(long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57099w = j13;
            this.f57080d.setOutlineSpotShadowColor(androidx.compose.ui.graphics.a.u(j13));
        }
    }
}
