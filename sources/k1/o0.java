package k1;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class o0 extends t3.w2 implements y2.f {

    /* renamed from: c, reason: collision with root package name */
    public final n f77953c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f77954d;

    /* renamed from: e, reason: collision with root package name */
    public RenderNode f77955e;

    public o0(n nVar, p0 p0Var) {
        super(t3.p.f116119m);
        this.f77953c = nVar;
        this.f77954d = p0Var;
    }

    public static boolean l(EdgeEffect edgeEffect, Canvas canvas) {
        return p(180.0f, edgeEffect, canvas);
    }

    public static boolean m(EdgeEffect edgeEffect, Canvas canvas) {
        return p(270.0f, edgeEffect, canvas);
    }

    public static boolean n(EdgeEffect edgeEffect, Canvas canvas) {
        return p(90.0f, edgeEffect, canvas);
    }

    public static boolean o(EdgeEffect edgeEffect, Canvas canvas) {
        return p(0.0f, edgeEffect, canvas);
    }

    public static boolean p(float f13, EdgeEffect edgeEffect, Canvas canvas) {
        if (f13 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f13);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // y2.f
    public final void f(d3.e eVar) {
        RecordingCanvas beginRecording;
        boolean z13;
        s3.m0 m0Var = (s3.m0) eVar;
        long g13 = m0Var.f110840a.g();
        n nVar = this.f77953c;
        nVar.l(g13);
        d3.c cVar = m0Var.f110840a;
        if (a3.f.e(cVar.g())) {
            m0Var.a();
            return;
        }
        nVar.f77934c.getValue();
        float l03 = m0Var.l0(g0.f77865a);
        Canvas b13 = b3.e.b(cVar.f53652b.a());
        p0 p0Var = this.f77954d;
        boolean z14 = p0.j(p0Var.f77965d) || p0.n(p0Var.f77969h) || p0.j(p0Var.f77966e) || p0.n(p0Var.f77970i);
        boolean z15 = p0.j(p0Var.f77967f) || p0.n(p0Var.f77971j) || p0.j(p0Var.f77968g) || p0.n(p0Var.f77972k);
        if (z14 && z15) {
            q().setPosition(0, 0, b13.getWidth(), b13.getHeight());
        } else if (z14) {
            q().setPosition(0, 0, (ml2.c.c(l03) * 2) + b13.getWidth(), b13.getHeight());
        } else {
            if (!z15) {
                m0Var.a();
                return;
            }
            q().setPosition(0, 0, b13.getWidth(), (ml2.c.c(l03) * 2) + b13.getHeight());
        }
        beginRecording = q().beginRecording();
        if (p0.n(p0Var.f77971j)) {
            EdgeEffect e13 = p0Var.e();
            n(e13, beginRecording);
            e13.finish();
        }
        if (p0.j(p0Var.f77967f)) {
            EdgeEffect d2 = p0Var.d();
            z13 = p(270.0f, d2, beginRecording);
            if (p0Var.l()) {
                lp2.b.n(p0Var.e(), lp2.b.h(d2), 1 - a3.c.e(nVar.f()));
            }
        } else {
            z13 = false;
        }
        if (p0.n(p0Var.f77969h)) {
            EdgeEffect i13 = p0Var.i();
            l(i13, beginRecording);
            i13.finish();
        }
        if (p0.j(p0Var.f77965d)) {
            EdgeEffect h10 = p0Var.h();
            z13 = p(0.0f, h10, beginRecording) || z13;
            if (p0Var.o()) {
                lp2.b.n(p0Var.i(), lp2.b.h(h10), a3.c.d(nVar.f()));
            }
        }
        if (p0.n(p0Var.f77972k)) {
            EdgeEffect g14 = p0Var.g();
            m(g14, beginRecording);
            g14.finish();
        }
        if (p0.j(p0Var.f77968g)) {
            EdgeEffect f13 = p0Var.f();
            z13 = p(90.0f, f13, beginRecording) || z13;
            if (p0Var.m()) {
                lp2.b.n(p0Var.g(), lp2.b.h(f13), a3.c.e(nVar.f()));
            }
        }
        if (p0.n(p0Var.f77970i)) {
            EdgeEffect c13 = p0Var.c();
            o(c13, beginRecording);
            c13.finish();
        }
        if (p0.j(p0Var.f77966e)) {
            EdgeEffect b14 = p0Var.b();
            boolean z16 = p(180.0f, b14, beginRecording) || z13;
            if (p0Var.k()) {
                lp2.b.n(p0Var.c(), lp2.b.h(b14), 1 - a3.c.d(nVar.f()));
            }
            z13 = z16;
        }
        if (z13) {
            nVar.g();
        }
        float f14 = z15 ? 0.0f : l03;
        if (z14) {
            l03 = 0.0f;
        }
        n4.k layoutDirection = m0Var.getLayoutDirection();
        b3.d a13 = b3.e.a(beginRecording);
        long g15 = cVar.g();
        n4.b b15 = m0Var.f110840a.f53652b.b();
        d3.c cVar2 = ((s3.m0) eVar).f110840a;
        n4.k d13 = cVar2.f53652b.d();
        b3.u a14 = cVar2.f53652b.a();
        long e14 = cVar2.f53652b.e();
        d3.b bVar = cVar2.f53652b;
        e3.d dVar = bVar.f53649b;
        bVar.g(eVar);
        bVar.i(layoutDirection);
        bVar.f(a13);
        bVar.j(g15);
        bVar.f53649b = null;
        a13.j();
        try {
            ((s3.m0) eVar).f110840a.f53652b.f53648a.d(f14, l03);
            try {
                m0Var.a();
                float f15 = -f14;
                float f16 = -l03;
                ((s3.m0) eVar).f110840a.f53652b.f53648a.d(f15, f16);
                a13.restore();
                d3.b bVar2 = cVar2.f53652b;
                bVar2.g(b15);
                bVar2.i(d13);
                bVar2.f(a14);
                bVar2.j(e14);
                bVar2.f53649b = dVar;
                q().endRecording();
                int save = b13.save();
                b13.translate(f15, f16);
                b13.drawRenderNode(q());
                b13.restoreToCount(save);
            } catch (Throwable th3) {
                ((s3.m0) eVar).f110840a.f53652b.f53648a.d(-f14, -l03);
                throw th3;
            }
        } catch (Throwable th4) {
            a13.restore();
            d3.b bVar3 = cVar2.f53652b;
            bVar3.g(b15);
            bVar3.i(d13);
            bVar3.f(a14);
            bVar3.j(e14);
            bVar3.f53649b = dVar;
            throw th4;
        }
    }

    public final RenderNode q() {
        RenderNode renderNode = this.f77955e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode e13 = d4.c.e();
        this.f77955e = e13;
        return e13;
    }
}
