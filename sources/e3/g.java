package e3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.ViewGroup;
import b3.s0;
import b3.u;
import b3.w;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.s2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class g implements f {
    public static final AtomicBoolean A = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final h1.b f57030b;

    /* renamed from: c, reason: collision with root package name */
    public final d3.c f57031c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f57032d;

    /* renamed from: e, reason: collision with root package name */
    public long f57033e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f57034f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f57035g;

    /* renamed from: h, reason: collision with root package name */
    public long f57036h;

    /* renamed from: i, reason: collision with root package name */
    public int f57037i;

    /* renamed from: j, reason: collision with root package name */
    public final int f57038j;

    /* renamed from: k, reason: collision with root package name */
    public float f57039k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f57040l;

    /* renamed from: m, reason: collision with root package name */
    public float f57041m;

    /* renamed from: n, reason: collision with root package name */
    public float f57042n;

    /* renamed from: o, reason: collision with root package name */
    public float f57043o;

    /* renamed from: p, reason: collision with root package name */
    public float f57044p;

    /* renamed from: q, reason: collision with root package name */
    public float f57045q;

    /* renamed from: r, reason: collision with root package name */
    public long f57046r;

    /* renamed from: s, reason: collision with root package name */
    public long f57047s;

    /* renamed from: t, reason: collision with root package name */
    public float f57048t;

    /* renamed from: u, reason: collision with root package name */
    public float f57049u;

    /* renamed from: v, reason: collision with root package name */
    public float f57050v;

    /* renamed from: w, reason: collision with root package name */
    public float f57051w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f57052x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f57053y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f57054z;

    public g(ViewGroup viewGroup, h1.b bVar, d3.c cVar) {
        this.f57030b = bVar;
        this.f57031c = cVar;
        RenderNode create = RenderNode.create("Compose", viewGroup);
        this.f57032d = create;
        this.f57033e = 0L;
        this.f57036h = 0L;
        if (A.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                n nVar = n.f57106a;
                nVar.c(create, nVar.a(create));
                nVar.d(create, nVar.b(create));
            }
            m.f57105a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        j(0);
        this.f57037i = 0;
        this.f57038j = 3;
        this.f57039k = 1.0f;
        this.f57041m = 1.0f;
        this.f57042n = 1.0f;
        int i13 = w.f21391o;
        this.f57046r = am.d.d();
        this.f57047s = am.d.d();
        this.f57051w = 8.0f;
    }

    @Override // e3.f
    public final Matrix A() {
        Matrix matrix = this.f57034f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f57034f = matrix;
        }
        this.f57032d.getMatrix(matrix);
        return matrix;
    }

    @Override // e3.f
    public final int B() {
        return this.f57038j;
    }

    @Override // e3.f
    public final float C() {
        return this.f57041m;
    }

    @Override // e3.f
    public final void D(float f13) {
        this.f57045q = f13;
        this.f57032d.setElevation(f13);
    }

    @Override // e3.f
    public final void E(Outline outline, long j13) {
        this.f57036h = j13;
        this.f57032d.setOutline(outline);
        this.f57035g = outline != null;
        i();
    }

    @Override // e3.f
    public final void F(long j13) {
        boolean z03 = com.bumptech.glide.c.z0(j13);
        RenderNode renderNode = this.f57032d;
        if (z03) {
            this.f57040l = true;
            renderNode.setPivotX(n4.j.c(this.f57033e) / 2.0f);
            renderNode.setPivotY(n4.j.b(this.f57033e) / 2.0f);
        } else {
            this.f57040l = false;
            renderNode.setPivotX(a3.c.d(j13));
            renderNode.setPivotY(a3.c.e(j13));
        }
    }

    @Override // e3.f
    public final void G(u uVar) {
        DisplayListCanvas b13 = b3.e.b(uVar);
        Intrinsics.g(b13, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        b13.drawRenderNode(this.f57032d);
    }

    @Override // e3.f
    public final float H() {
        return this.f57044p;
    }

    @Override // e3.f
    public final float I() {
        return this.f57043o;
    }

    @Override // e3.f
    public final float J() {
        return this.f57048t;
    }

    @Override // e3.f
    public final void K(int i13) {
        this.f57037i = i13;
        if (tb.f.H(i13, 1) || !s0.a(this.f57038j, 3)) {
            j(1);
        } else {
            j(this.f57037i);
        }
    }

    @Override // e3.f
    public final float L() {
        return this.f57045q;
    }

    @Override // e3.f
    public final float M() {
        return this.f57042n;
    }

    @Override // e3.f
    public final float a() {
        return this.f57039k;
    }

    @Override // e3.f
    public final void b(float f13) {
        this.f57044p = f13;
        this.f57032d.setTranslationY(f13);
    }

    @Override // e3.f
    public final void c() {
        m.f57105a.a(this.f57032d);
    }

    @Override // e3.f
    public final boolean d() {
        return this.f57032d.isValid();
    }

    @Override // e3.f
    public final void e(float f13) {
        this.f57041m = f13;
        this.f57032d.setScaleX(f13);
    }

    @Override // e3.f
    public final void f(float f13) {
        this.f57051w = f13;
        this.f57032d.setCameraDistance(-f13);
    }

    @Override // e3.f
    public final void g(float f13) {
        this.f57048t = f13;
        this.f57032d.setRotationX(f13);
    }

    @Override // e3.f
    public final void h(float f13) {
        this.f57049u = f13;
        this.f57032d.setRotationY(f13);
    }

    public final void i() {
        boolean z13 = this.f57052x;
        boolean z14 = false;
        boolean z15 = z13 && !this.f57035g;
        if (z13 && this.f57035g) {
            z14 = true;
        }
        boolean z16 = this.f57053y;
        RenderNode renderNode = this.f57032d;
        if (z15 != z16) {
            this.f57053y = z15;
            renderNode.setClipToBounds(z15);
        }
        if (z14 != this.f57054z) {
            this.f57054z = z14;
            renderNode.setClipToOutline(z14);
        }
    }

    public final void j(int i13) {
        boolean H = tb.f.H(i13, 1);
        RenderNode renderNode = this.f57032d;
        if (H) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (tb.f.H(i13, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // e3.f
    public final void k() {
    }

    @Override // e3.f
    public final void l(float f13) {
        this.f57050v = f13;
        this.f57032d.setRotation(f13);
    }

    @Override // e3.f
    public final void m(float f13) {
        this.f57042n = f13;
        this.f57032d.setScaleY(f13);
    }

    @Override // e3.f
    public final void n(float f13) {
        this.f57039k = f13;
        this.f57032d.setAlpha(f13);
    }

    @Override // e3.f
    public final void o(float f13) {
        this.f57043o = f13;
        this.f57032d.setTranslationX(f13);
    }

    @Override // e3.f
    public final int p() {
        return this.f57037i;
    }

    @Override // e3.f
    public final void q(int i13, int i14, long j13) {
        int c13 = n4.j.c(j13) + i13;
        int b13 = n4.j.b(j13) + i14;
        RenderNode renderNode = this.f57032d;
        renderNode.setLeftTopRightBottom(i13, i14, c13, b13);
        if (n4.j.a(this.f57033e, j13)) {
            return;
        }
        if (this.f57040l) {
            renderNode.setPivotX(n4.j.c(j13) / 2.0f);
            renderNode.setPivotY(n4.j.b(j13) / 2.0f);
        }
        this.f57033e = j13;
    }

    @Override // e3.f
    public final float r() {
        return this.f57049u;
    }

    @Override // e3.f
    public final float s() {
        return this.f57050v;
    }

    @Override // e3.f
    public final long t() {
        return this.f57046r;
    }

    @Override // e3.f
    public final void u(n4.b bVar, n4.k kVar, d dVar, s2 s2Var) {
        int max = Math.max(n4.j.c(this.f57033e), n4.j.c(this.f57036h));
        int max2 = Math.max(n4.j.b(this.f57033e), n4.j.b(this.f57036h));
        RenderNode renderNode = this.f57032d;
        Canvas start = renderNode.start(max, max2);
        try {
            h1.b bVar2 = this.f57030b;
            Canvas t13 = bVar2.b().t();
            bVar2.b().u(start);
            b3.d b13 = bVar2.b();
            d3.c cVar = this.f57031c;
            long y13 = l0.y1(this.f57033e);
            n4.b b14 = cVar.p0().b();
            n4.k d2 = cVar.p0().d();
            u a13 = cVar.p0().a();
            long e13 = cVar.p0().e();
            d c13 = cVar.p0().c();
            d3.b p03 = cVar.p0();
            p03.g(bVar);
            p03.i(kVar);
            p03.f(b13);
            p03.j(y13);
            p03.h(dVar);
            b13.j();
            try {
                s2Var.invoke(cVar);
                b13.restore();
                d3.b p04 = cVar.p0();
                p04.g(b14);
                p04.i(d2);
                p04.f(a13);
                p04.j(e13);
                p04.h(c13);
                bVar2.b().u(t13);
            } catch (Throwable th3) {
                b13.restore();
                d3.b p05 = cVar.p0();
                p05.g(b14);
                p05.i(d2);
                p05.f(a13);
                p05.j(e13);
                p05.h(c13);
                throw th3;
            }
        } finally {
            renderNode.end(start);
        }
    }

    @Override // e3.f
    public final long v() {
        return this.f57047s;
    }

    @Override // e3.f
    public final void w(long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57046r = j13;
            n.f57106a.c(this.f57032d, androidx.compose.ui.graphics.a.u(j13));
        }
    }

    @Override // e3.f
    public final float x() {
        return this.f57051w;
    }

    @Override // e3.f
    public final void y(boolean z13) {
        this.f57052x = z13;
        i();
    }

    @Override // e3.f
    public final void z(long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f57047s = j13;
            n.f57106a.d(this.f57032d, androidx.compose.ui.graphics.a.u(j13));
        }
    }
}
