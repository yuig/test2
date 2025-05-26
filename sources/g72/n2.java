package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class n2 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n2 f64056a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64057b;

    static {
        n2 n2Var = new n2();
        f64056a = n2Var;
        qo2.y0 y0Var = new qo2.y0("echo", n2Var, 5);
        y0Var.k("timeSpeed", true);
        y0Var.k("distortion", true);
        y0Var.k("center", true);
        y0Var.k("timeDirection", true);
        y0Var.k("linearity", true);
        f64057b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64057b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        p2 value = (p2) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64057b;
        po2.b b13 = encoder.b(y0Var);
        o2 o2Var = p2.Companion;
        if (b13.j(y0Var) || value.f64075b != null) {
            b13.A(y0Var, 0, b1.f63929a, value.f64075b);
        }
        if (b13.j(y0Var) || value.f64076c != null) {
            b13.A(y0Var, 1, j0.f64023a, value.f64076c);
        }
        if (b13.j(y0Var) || value.f64077d != null) {
            b13.A(y0Var, 2, j0.f64023a, value.f64077d);
        }
        if (b13.j(y0Var) || value.f64078e != null) {
            b13.A(y0Var, 3, s.f64095a, value.f64078e);
        }
        if (b13.j(y0Var) || value.f64079f != null) {
            b13.A(y0Var, 4, s.f64095a, value.f64079f);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b J2 = f0.h.J(b1.f63929a);
        j0 j0Var = j0.f64023a;
        no2.b J3 = f0.h.J(j0Var);
        no2.b J4 = f0.h.J(j0Var);
        s sVar = s.f64095a;
        return new no2.b[]{J2, J3, J4, f0.h.J(sVar), f0.h.J(sVar)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64057b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        g1 g1Var = null;
        o0 o0Var = null;
        o0 o0Var2 = null;
        x xVar = null;
        x xVar2 = null;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                g1Var = (g1) b13.v(y0Var, 0, b1.f63929a, g1Var);
                i13 |= 1;
            } else if (o13 == 1) {
                o0Var = (o0) b13.v(y0Var, 1, j0.f64023a, o0Var);
                i13 |= 2;
            } else if (o13 == 2) {
                o0Var2 = (o0) b13.v(y0Var, 2, j0.f64023a, o0Var2);
                i13 |= 4;
            } else if (o13 == 3) {
                xVar = (x) b13.v(y0Var, 3, s.f64095a, xVar);
                i13 |= 8;
            } else {
                if (o13 != 4) {
                    throw new UnknownFieldException(o13);
                }
                xVar2 = (x) b13.v(y0Var, 4, s.f64095a, xVar2);
                i13 |= 16;
            }
        }
        b13.a(y0Var);
        return new p2(i13, g1Var, o0Var, o0Var2, xVar, xVar2);
    }
}
