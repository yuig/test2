package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class i2 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i2 f64017a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64018b;

    static {
        i2 i2Var = new i2();
        f64017a = i2Var;
        qo2.y0 y0Var = new qo2.y0("carousel", i2Var, 7);
        y0Var.k("timeSpeed", true);
        y0Var.k("scale", true);
        y0Var.k("direction", true);
        y0Var.k("spacing", true);
        y0Var.k("spacingX", true);
        y0Var.k("spacingY", true);
        y0Var.k("mirror", true);
        f64018b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64018b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        k2 value = (k2) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64018b;
        po2.b b13 = encoder.b(y0Var);
        j2 j2Var = k2.Companion;
        if (b13.j(y0Var) || value.f64033b != null) {
            b13.A(y0Var, 0, b1.f63929a, value.f64033b);
        }
        if (b13.j(y0Var) || value.f64034c != null) {
            b13.A(y0Var, 1, b1.f63929a, value.f64034c);
        }
        if (b13.j(y0Var) || value.f64035d != null) {
            b13.A(y0Var, 2, j0.f64023a, value.f64035d);
        }
        if (b13.j(y0Var) || value.f64036e != null) {
            b13.A(y0Var, 3, j0.f64023a, value.f64036e);
        }
        if (b13.j(y0Var) || value.f64037f != null) {
            b13.A(y0Var, 4, b1.f63929a, value.f64037f);
        }
        if (b13.j(y0Var) || value.f64038g != null) {
            b13.A(y0Var, 5, b1.f63929a, value.f64038g);
        }
        if (b13.j(y0Var) || value.f64039h != null) {
            b13.A(y0Var, 6, s.f64095a, value.f64039h);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        b1 b1Var = b1.f63929a;
        no2.b J2 = f0.h.J(b1Var);
        no2.b J3 = f0.h.J(b1Var);
        j0 j0Var = j0.f64023a;
        return new no2.b[]{J2, J3, f0.h.J(j0Var), f0.h.J(j0Var), f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(s.f64095a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64018b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        g1 g1Var = null;
        g1 g1Var2 = null;
        o0 o0Var = null;
        o0 o0Var2 = null;
        g1 g1Var3 = null;
        g1 g1Var4 = null;
        x xVar = null;
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
                    g1Var2 = (g1) b13.v(y0Var, 1, b1.f63929a, g1Var2);
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
                    g1Var3 = (g1) b13.v(y0Var, 4, b1.f63929a, g1Var3);
                    i13 |= 16;
                    break;
                case 5:
                    g1Var4 = (g1) b13.v(y0Var, 5, b1.f63929a, g1Var4);
                    i13 |= 32;
                    break;
                case 6:
                    xVar = (x) b13.v(y0Var, 6, s.f64095a, xVar);
                    i13 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new k2(i13, g1Var, g1Var2, o0Var, o0Var2, g1Var3, g1Var4, xVar);
    }
}
