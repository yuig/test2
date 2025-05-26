package k1;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* loaded from: classes2.dex */
public final class n0 extends t3.w2 implements y2.f {

    /* renamed from: c, reason: collision with root package name */
    public final n f77940c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f77941d;

    /* renamed from: e, reason: collision with root package name */
    public final b2 f77942e;

    public n0(n nVar, p0 p0Var, b2 b2Var) {
        super(t3.p.f116119m);
        this.f77940c = nVar;
        this.f77941d = p0Var;
        this.f77942e = b2Var;
    }

    public static boolean l(float f13, long j13, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f13);
        canvas.translate(a3.c.d(j13), a3.c.e(j13));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // y2.f
    public final void f(d3.e eVar) {
        boolean z13;
        s3.m0 m0Var = (s3.m0) eVar;
        long g13 = m0Var.f110840a.g();
        n nVar = this.f77940c;
        nVar.l(g13);
        d3.c cVar = m0Var.f110840a;
        if (a3.f.e(cVar.g())) {
            m0Var.a();
            return;
        }
        m0Var.a();
        nVar.f77934c.getValue();
        Canvas b13 = b3.e.b(cVar.f53652b.a());
        p0 p0Var = this.f77941d;
        boolean j13 = p0.j(p0Var.f77967f);
        b2 b2Var = this.f77942e;
        if (j13) {
            s3.m0 m0Var2 = (s3.m0) eVar;
            z13 = l(270.0f, com.bumptech.glide.c.d(-a3.f.b(m0Var.f110840a.g()), m0Var2.l0(b2Var.f77824b.c(m0Var2.getLayoutDirection()))), p0Var.d(), b13);
        } else {
            z13 = false;
        }
        if (p0.j(p0Var.f77965d)) {
            z13 = l(0.0f, com.bumptech.glide.c.d(0.0f, m0Var.l0(b2Var.f77824b.d())), p0Var.h(), b13) || z13;
        }
        if (p0.j(p0Var.f77968g)) {
            s3.m0 m0Var3 = (s3.m0) eVar;
            z13 = l(90.0f, com.bumptech.glide.c.d(0.0f, m0Var3.l0(b2Var.f77824b.b(m0Var3.getLayoutDirection())) + (-((float) ml2.c.c(a3.f.d(m0Var.f110840a.g()))))), p0Var.f(), b13) || z13;
        }
        if (p0.j(p0Var.f77966e)) {
            EdgeEffect b14 = p0Var.b();
            float l03 = m0Var.l0(b2Var.f77824b.a());
            d3.c cVar2 = m0Var.f110840a;
            if (!l(180.0f, com.bumptech.glide.c.d(-a3.f.d(cVar2.g()), (-a3.f.b(cVar2.g())) + l03), b14, b13) && !z13) {
                return;
            }
        } else if (!z13) {
            return;
        }
        nVar.g();
    }
}
