package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class z2 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z2 f64168a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64169b;

    static {
        z2 z2Var = new z2();
        f64168a = z2Var;
        qo2.y0 y0Var = new qo2.y0("glitch", z2Var, 7);
        y0Var.k("timeSpeed", true);
        y0Var.k("glitch_signal", true);
        y0Var.k("drop_scale", true);
        y0Var.k("glitch_aberration_radial", true);
        y0Var.k("glitch_drops", true);
        y0Var.k("glitch_dist_1", true);
        y0Var.k("glitch_lines", true);
        f64169b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64169b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        b3 value = (b3) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64169b;
        po2.b b13 = encoder.b(y0Var);
        a3 a3Var = b3.Companion;
        if (b13.j(y0Var) || value.f63938b != null) {
            b13.A(y0Var, 0, b1.f63929a, value.f63938b);
        }
        if (b13.j(y0Var) || value.f63939c != null) {
            b13.A(y0Var, 1, s.f64095a, value.f63939c);
        }
        if (b13.j(y0Var) || value.f63940d != null) {
            b13.A(y0Var, 2, j0.f64023a, value.f63940d);
        }
        if (b13.j(y0Var) || value.f63941e != null) {
            b13.A(y0Var, 3, j0.f64023a, value.f63941e);
        }
        if (b13.j(y0Var) || value.f63942f != null) {
            b13.A(y0Var, 4, j0.f64023a, value.f63942f);
        }
        if (b13.j(y0Var) || value.f63943g != null) {
            b13.A(y0Var, 5, j0.f64023a, value.f63943g);
        }
        if (b13.j(y0Var) || value.f63944h != null) {
            b13.A(y0Var, 6, j0.f64023a, value.f63944h);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b J2 = f0.h.J(b1.f63929a);
        no2.b J3 = f0.h.J(s.f64095a);
        j0 j0Var = j0.f64023a;
        return new no2.b[]{J2, J3, f0.h.J(j0Var), f0.h.J(j0Var), f0.h.J(j0Var), f0.h.J(j0Var), f0.h.J(j0Var)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64169b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        g1 g1Var = null;
        x xVar = null;
        o0 o0Var = null;
        o0 o0Var2 = null;
        o0 o0Var3 = null;
        o0 o0Var4 = null;
        o0 o0Var5 = null;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    g1Var = (g1) b13.v(y0Var, 0, b1.f63929a, g1Var);
                    i13 |= 1;
                    break;
                case 1:
                    xVar = (x) b13.v(y0Var, 1, s.f64095a, xVar);
                    i13 |= 2;
                    break;
                case 2:
                    o0Var = (o0) b13.v(y0Var, 2, j0.f64023a, o0Var);
                    i13 |= 4;
                    break;
                case 3:
                    o0Var2 = (o0) b13.v(y0Var, 3, j0.f64023a, o0Var2);
                    i13 |= 8;
                    break;
                case 4:
                    o0Var3 = (o0) b13.v(y0Var, 4, j0.f64023a, o0Var3);
                    i13 |= 16;
                    break;
                case 5:
                    o0Var4 = (o0) b13.v(y0Var, 5, j0.f64023a, o0Var4);
                    i13 |= 32;
                    break;
                case 6:
                    o0Var5 = (o0) b13.v(y0Var, 6, j0.f64023a, o0Var5);
                    i13 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new b3(i13, g1Var, xVar, o0Var, o0Var2, o0Var3, o0Var4, o0Var5);
    }
}
