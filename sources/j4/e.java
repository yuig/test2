package j4;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import b3.s;
import b3.s0;
import b3.v0;
import b3.w0;
import b3.z0;
import e0.t;
import i2.o0;
import kotlin.jvm.internal.Intrinsics;
import s3.u0;

/* loaded from: classes3.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public b3.i f74571a;

    /* renamed from: b, reason: collision with root package name */
    public m4.k f74572b;

    /* renamed from: c, reason: collision with root package name */
    public int f74573c;

    /* renamed from: d, reason: collision with root package name */
    public w0 f74574d;

    /* renamed from: e, reason: collision with root package name */
    public s f74575e;

    /* renamed from: f, reason: collision with root package name */
    public o0 f74576f;

    /* renamed from: g, reason: collision with root package name */
    public a3.f f74577g;

    /* renamed from: h, reason: collision with root package name */
    public d3.i f74578h;

    public final b3.i a() {
        b3.i iVar = this.f74571a;
        if (iVar != null) {
            return iVar;
        }
        b3.i iVar2 = new b3.i(this);
        this.f74571a = iVar2;
        return iVar2;
    }

    public final void b(int i13) {
        if (s0.a(i13, this.f74573c)) {
            return;
        }
        a().d(i13);
        this.f74573c = i13;
    }

    public final void c(s sVar, long j13, float f13) {
        a3.f fVar;
        if (sVar == null) {
            this.f74576f = null;
            this.f74575e = null;
            this.f74577g = null;
            setShader(null);
            return;
        }
        if (sVar instanceof z0) {
            d(bp1.h.x(((z0) sVar).f21414a, f13));
            return;
        }
        if (sVar instanceof v0) {
            if ((!Intrinsics.d(this.f74575e, sVar) || (fVar = this.f74577g) == null || !a3.f.a(fVar.f497a, j13)) && j13 != y2.h.f136670b) {
                this.f74575e = sVar;
                this.f74577g = new a3.f(j13);
                this.f74576f = bs1.c.S(new u0(sVar, j13, 1));
            }
            b3.i a13 = a();
            o0 o0Var = this.f74576f;
            a13.i(o0Var != null ? (Shader) o0Var.getValue() : null);
            t.Q0(this, f13);
        }
    }

    public final void d(long j13) {
        if (j13 != 16) {
            setColor(androidx.compose.ui.graphics.a.u(j13));
            this.f74576f = null;
            this.f74575e = null;
            this.f74577g = null;
            setShader(null);
        }
    }

    public final void e(d3.i iVar) {
        if (iVar == null || Intrinsics.d(this.f74578h, iVar)) {
            return;
        }
        this.f74578h = iVar;
        if (Intrinsics.d(iVar, d3.k.f53660a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (iVar instanceof d3.l) {
            a().m(1);
            d3.l lVar = (d3.l) iVar;
            a().l(lVar.f53661a);
            a().f21325a.setStrokeMiter(lVar.f53662b);
            a().k(lVar.f53664d);
            a().j(lVar.f53663c);
            a().h(lVar.f53665e);
        }
    }

    public final void f(w0 w0Var) {
        if (w0Var == null || Intrinsics.d(this.f74574d, w0Var)) {
            return;
        }
        this.f74574d = w0Var;
        if (Intrinsics.d(w0Var, w0.f21393d)) {
            clearShadowLayer();
            return;
        }
        w0 w0Var2 = this.f74574d;
        float f13 = w0Var2.f21396c;
        if (f13 == 0.0f) {
            f13 = Float.MIN_VALUE;
        }
        setShadowLayer(f13, a3.c.d(w0Var2.f21395b), a3.c.e(this.f74574d.f21395b), androidx.compose.ui.graphics.a.u(this.f74574d.f21394a));
    }

    public final void g(m4.k kVar) {
        if (kVar == null || Intrinsics.d(this.f74572b, kVar)) {
            return;
        }
        this.f74572b = kVar;
        setUnderlineText(kVar.a(m4.k.f85799c));
        setStrikeThruText(this.f74572b.a(m4.k.f85800d));
    }
}
