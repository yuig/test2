package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class w3 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w3 f64137a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64138b;

    static {
        w3 w3Var = new w3();
        f64137a = w3Var;
        qo2.y0 y0Var = new qo2.y0("simpleGlitch", w3Var, 6);
        y0Var.k("timeSpeed", true);
        y0Var.k("glitch_signal", true);
        y0Var.k("glitch_dist_2", true);
        y0Var.k("glitch_lines", true);
        y0Var.k("glitch_aberration_radial", true);
        y0Var.k("drop_scale", true);
        f64138b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64138b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        y3 value = (y3) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64138b;
        po2.b b13 = encoder.b(y0Var);
        x3 x3Var = y3.Companion;
        if (b13.j(y0Var) || value.f64159b != null) {
            b13.A(y0Var, 0, b1.f63929a, value.f64159b);
        }
        if (b13.j(y0Var) || value.f64160c != null) {
            b13.A(y0Var, 1, s.f64095a, value.f64160c);
        }
        if (b13.j(y0Var) || value.f64161d != null) {
            b13.A(y0Var, 2, b1.f63929a, value.f64161d);
        }
        if (b13.j(y0Var) || value.f64162e != null) {
            b13.A(y0Var, 3, b1.f63929a, value.f64162e);
        }
        if (b13.j(y0Var) || value.f64163f != null) {
            b13.A(y0Var, 4, b1.f63929a, value.f64163f);
        }
        if (b13.j(y0Var) || value.f64164g != null) {
            b13.A(y0Var, 5, b1.f63929a, value.f64164g);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        b1 b1Var = b1.f63929a;
        return new no2.b[]{f0.h.J(b1Var), f0.h.J(s.f64095a), f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(b1Var)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64138b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        g1 g1Var = null;
        x xVar = null;
        g1 g1Var2 = null;
        g1 g1Var3 = null;
        g1 g1Var4 = null;
        g1 g1Var5 = null;
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
                    g1Var2 = (g1) b13.v(y0Var, 2, b1.f63929a, g1Var2);
                    i13 |= 4;
                    break;
                case 3:
                    g1Var3 = (g1) b13.v(y0Var, 3, b1.f63929a, g1Var3);
                    i13 |= 8;
                    break;
                case 4:
                    g1Var4 = (g1) b13.v(y0Var, 4, b1.f63929a, g1Var4);
                    i13 |= 16;
                    break;
                case 5:
                    g1Var5 = (g1) b13.v(y0Var, 5, b1.f63929a, g1Var5);
                    i13 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new y3(i13, g1Var, xVar, g1Var2, g1Var3, g1Var4, g1Var5);
    }
}
