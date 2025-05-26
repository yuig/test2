package e3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import b3.s0;
import b3.u;
import b3.w;
import k1.s2;
import lb.l0;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    public final h1.b f57055b;

    /* renamed from: c, reason: collision with root package name */
    public final d3.c f57056c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f57057d;

    /* renamed from: e, reason: collision with root package name */
    public long f57058e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f57059f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f57060g;

    /* renamed from: h, reason: collision with root package name */
    public float f57061h;

    /* renamed from: i, reason: collision with root package name */
    public final int f57062i;

    /* renamed from: j, reason: collision with root package name */
    public float f57063j;

    /* renamed from: k, reason: collision with root package name */
    public float f57064k;

    /* renamed from: l, reason: collision with root package name */
    public float f57065l;

    /* renamed from: m, reason: collision with root package name */
    public float f57066m;

    /* renamed from: n, reason: collision with root package name */
    public float f57067n;

    /* renamed from: o, reason: collision with root package name */
    public long f57068o;

    /* renamed from: p, reason: collision with root package name */
    public long f57069p;

    /* renamed from: q, reason: collision with root package name */
    public float f57070q;

    /* renamed from: r, reason: collision with root package name */
    public float f57071r;

    /* renamed from: s, reason: collision with root package name */
    public float f57072s;

    /* renamed from: t, reason: collision with root package name */
    public float f57073t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f57074u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f57075v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f57076w;

    /* renamed from: x, reason: collision with root package name */
    public int f57077x;

    public h() {
        h1.b bVar = new h1.b(2);
        d3.c cVar = new d3.c();
        this.f57055b = bVar;
        this.f57056c = cVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f57057d = renderNode;
        this.f57058e = 0L;
        renderNode.setClipToBounds(false);
        j(renderNode, 0);
        this.f57061h = 1.0f;
        this.f57062i = 3;
        this.f57063j = 1.0f;
        this.f57064k = 1.0f;
        long j13 = w.f21378b;
        this.f57068o = j13;
        this.f57069p = j13;
        this.f57073t = 8.0f;
        this.f57077x = 0;
    }

    public static void j(RenderNode renderNode, int i13) {
        if (tb.f.H(i13, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (tb.f.H(i13, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // e3.f
    public final Matrix A() {
        Matrix matrix = this.f57059f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f57059f = matrix;
        }
        this.f57057d.getMatrix(matrix);
        return matrix;
    }

    @Override // e3.f
    public final int B() {
        return this.f57062i;
    }

    @Override // e3.f
    public final float C() {
        return this.f57063j;
    }

    @Override // e3.f
    public final void D(float f13) {
        this.f57067n = f13;
        this.f57057d.setElevation(f13);
    }

    @Override // e3.f
    public final void E(Outline outline, long j13) {
        this.f57057d.setOutline(outline);
        this.f57060g = outline != null;
        i();
    }

    @Override // e3.f
    public final void F(long j13) {
        boolean z03 = com.bumptech.glide.c.z0(j13);
        RenderNode renderNode = this.f57057d;
        if (z03) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(a3.c.d(j13));
            renderNode.setPivotY(a3.c.e(j13));
        }
    }

    @Override // e3.f
    public final void G(u uVar) {
        b3.e.b(uVar).drawRenderNode(this.f57057d);
    }

    @Override // e3.f
    public final float H() {
        return this.f57066m;
    }

    @Override // e3.f
    public final float I() {
        return this.f57065l;
    }

    @Override // e3.f
    public final float J() {
        return this.f57070q;
    }

    @Override // e3.f
    public final void K(int i13) {
        this.f57077x = i13;
        boolean H = tb.f.H(i13, 1);
        RenderNode renderNode = this.f57057d;
        if (H || (!s0.a(this.f57062i, 3))) {
            j(renderNode, 1);
        } else {
            j(renderNode, this.f57077x);
        }
    }

    @Override // e3.f
    public final float L() {
        return this.f57067n;
    }

    @Override // e3.f
    public final float M() {
        return this.f57064k;
    }

    @Override // e3.f
    public final float a() {
        return this.f57061h;
    }

    @Override // e3.f
    public final void b(float f13) {
        this.f57066m = f13;
        this.f57057d.setTranslationY(f13);
    }

    @Override // e3.f
    public final void c() {
        this.f57057d.discardDisplayList();
    }

    @Override // e3.f
    public final boolean d() {
        boolean hasDisplayList;
        hasDisplayList = this.f57057d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // e3.f
    public final void e(float f13) {
        this.f57063j = f13;
        this.f57057d.setScaleX(f13);
    }

    @Override // e3.f
    public final void f(float f13) {
        this.f57073t = f13;
        this.f57057d.setCameraDistance(f13);
    }

    @Override // e3.f
    public final void g(float f13) {
        this.f57070q = f13;
        this.f57057d.setRotationX(f13);
    }

    @Override // e3.f
    public final void h(float f13) {
        this.f57071r = f13;
        this.f57057d.setRotationY(f13);
    }

    public final void i() {
        boolean z13 = this.f57074u;
        boolean z14 = false;
        boolean z15 = z13 && !this.f57060g;
        if (z13 && this.f57060g) {
            z14 = true;
        }
        boolean z16 = this.f57075v;
        RenderNode renderNode = this.f57057d;
        if (z15 != z16) {
            this.f57075v = z15;
            renderNode.setClipToBounds(z15);
        }
        if (z14 != this.f57076w) {
            this.f57076w = z14;
            renderNode.setClipToOutline(z14);
        }
    }

    @Override // e3.f
    public final void k() {
        if (Build.VERSION.SDK_INT >= 31) {
            o.f57107a.a(this.f57057d, null);
        }
    }

    @Override // e3.f
    public final void l(float f13) {
        this.f57072s = f13;
        this.f57057d.setRotationZ(f13);
    }

    @Override // e3.f
    public final void m(float f13) {
        this.f57064k = f13;
        this.f57057d.setScaleY(f13);
    }

    @Override // e3.f
    public final void n(float f13) {
        this.f57061h = f13;
        this.f57057d.setAlpha(f13);
    }

    @Override // e3.f
    public final void o(float f13) {
        this.f57065l = f13;
        this.f57057d.setTranslationX(f13);
    }

    @Override // e3.f
    public final int p() {
        return this.f57077x;
    }

    @Override // e3.f
    public final void q(int i13, int i14, long j13) {
        this.f57057d.setPosition(i13, i14, ((int) (j13 >> 32)) + i13, ((int) (4294967295L & j13)) + i14);
        this.f57058e = l0.y1(j13);
    }

    @Override // e3.f
    public final float r() {
        return this.f57071r;
    }

    @Override // e3.f
    public final float s() {
        return this.f57072s;
    }

    @Override // e3.f
    public final long t() {
        return this.f57068o;
    }

    @Override // e3.f
    public final void u(n4.b bVar, n4.k kVar, d dVar, s2 s2Var) {
        RecordingCanvas beginRecording;
        d3.c cVar = this.f57056c;
        RenderNode renderNode = this.f57057d;
        beginRecording = renderNode.beginRecording();
        try {
            h1.b bVar2 = this.f57055b;
            Object obj = bVar2.f66449b;
            Canvas canvas = ((b3.d) obj).f21309a;
            ((b3.d) obj).f21309a = beginRecording;
            d3.b bVar3 = cVar.f53652b;
            bVar3.g(bVar);
            bVar3.i(kVar);
            bVar3.f53649b = dVar;
            bVar3.j(this.f57058e);
            bVar3.f((b3.d) obj);
            s2Var.invoke(cVar);
            ((b3.d) bVar2.f66449b).f21309a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    @Override // e3.f
    public final long v() {
        return this.f57069p;
    }

    @Override // e3.f
    public final void w(long j13) {
        this.f57068o = j13;
        this.f57057d.setAmbientShadowColor(androidx.compose.ui.graphics.a.u(j13));
    }

    @Override // e3.f
    public final float x() {
        return this.f57073t;
    }

    @Override // e3.f
    public final void y(boolean z13) {
        this.f57074u = z13;
        i();
    }

    @Override // e3.f
    public final void z(long j13) {
        this.f57069p = j13;
        this.f57057d.setSpotShadowColor(androidx.compose.ui.graphics.a.u(j13));
    }
}
