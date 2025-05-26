package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class h1 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f63999a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64000b;

    static {
        h1 h1Var = new h1();
        f63999a = h1Var;
        qo2.y0 y0Var = new qo2.y0("border", h1Var, 2);
        y0Var.k("width", true);
        y0Var.k("color", true);
        f64000b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64000b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        j1 value = (j1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64000b;
        po2.b b13 = encoder.b(y0Var);
        i1 i1Var = j1.Companion;
        if (b13.j(y0Var) || value.f64026b != null) {
            b13.A(y0Var, 0, b1.f63929a, value.f64026b);
        }
        if (b13.j(y0Var) || value.f64027c != null) {
            b13.A(y0Var, 1, v0.f64126a, value.f64027c);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{f0.h.J(b1.f63929a), f0.h.J(v0.f64126a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64000b;
        po2.a b13 = decoder.b(y0Var);
        g1 g1Var = null;
        boolean z13 = true;
        a1 a1Var = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                g1Var = (g1) b13.v(y0Var, 0, b1.f63929a, g1Var);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                a1Var = (a1) b13.v(y0Var, 1, v0.f64126a, a1Var);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new j1(i13, g1Var, a1Var);
    }
}
