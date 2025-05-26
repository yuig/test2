package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class r4 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r4 f64093a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64094b;

    static {
        r4 r4Var = new r4();
        f64093a = r4Var;
        qo2.y0 y0Var = new qo2.y0("wobbly", r4Var, 3);
        y0Var.k("timeSpeed", true);
        y0Var.k("intensity", true);
        y0Var.k("direction", true);
        f64094b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64094b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        t4 value = (t4) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64094b;
        po2.b b13 = encoder.b(y0Var);
        s4 s4Var = t4.Companion;
        if (b13.j(y0Var) || value.f64118b != null) {
            b13.A(y0Var, 0, b1.f63929a, value.f64118b);
        }
        if (b13.j(y0Var) || value.f64119c != null) {
            b13.A(y0Var, 1, b1.f63929a, value.f64119c);
        }
        if (b13.j(y0Var) || value.f64120d != null) {
            b13.A(y0Var, 2, j0.f64023a, value.f64120d);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        b1 b1Var = b1.f63929a;
        return new no2.b[]{f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(j0.f64023a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64094b;
        po2.a b13 = decoder.b(y0Var);
        g1 g1Var = null;
        boolean z13 = true;
        g1 g1Var2 = null;
        o0 o0Var = null;
        int i13 = 0;
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
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                o0Var = (o0) b13.v(y0Var, 2, j0.f64023a, o0Var);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new t4(i13, g1Var, g1Var2, o0Var);
    }
}
