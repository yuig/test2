package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class q2 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q2 f64083a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64084b;

    static {
        q2 q2Var = new q2();
        f64083a = q2Var;
        qo2.y0 y0Var = new qo2.y0("echoNew", q2Var, 5);
        y0Var.k("timeSpeed", true);
        y0Var.k("intensity", true);
        y0Var.k("center", true);
        y0Var.k("timeDirection", true);
        y0Var.k("linearity", true);
        f64084b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64084b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        s2 value = (s2) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64084b;
        po2.b b13 = encoder.b(y0Var);
        r2 r2Var = s2.Companion;
        if (b13.j(y0Var) || value.f64102b != null) {
            b13.A(y0Var, 0, b1.f63929a, value.f64102b);
        }
        if (b13.j(y0Var) || value.f64103c != null) {
            b13.A(y0Var, 1, b1.f63929a, value.f64103c);
        }
        if (b13.j(y0Var) || value.f64104d != null) {
            b13.A(y0Var, 2, j0.f64023a, value.f64104d);
        }
        if (b13.j(y0Var) || value.f64105e != null) {
            b13.A(y0Var, 3, s.f64095a, value.f64105e);
        }
        if (b13.j(y0Var) || value.f64106f != null) {
            b13.A(y0Var, 4, s.f64095a, value.f64106f);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        b1 b1Var = b1.f63929a;
        no2.b J2 = f0.h.J(b1Var);
        no2.b J3 = f0.h.J(b1Var);
        no2.b J4 = f0.h.J(j0.f64023a);
        s sVar = s.f64095a;
        return new no2.b[]{J2, J3, J4, f0.h.J(sVar), f0.h.J(sVar)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64084b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        g1 g1Var = null;
        g1 g1Var2 = null;
        o0 o0Var = null;
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
                g1Var2 = (g1) b13.v(y0Var, 1, b1.f63929a, g1Var2);
                i13 |= 2;
            } else if (o13 == 2) {
                o0Var = (o0) b13.v(y0Var, 2, j0.f64023a, o0Var);
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
        return new s2(i13, g1Var, g1Var2, o0Var, xVar, xVar2);
    }
}
