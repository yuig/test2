package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class q3 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q3 f64085a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64086b;

    static {
        q3 q3Var = new q3();
        f64085a = q3Var;
        qo2.y0 y0Var = new qo2.y0("scaly", q3Var, 1);
        y0Var.k("timeSpeed", true);
        f64086b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64086b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        s3 value = (s3) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64086b;
        po2.b b13 = encoder.b(y0Var);
        r3 r3Var = s3.Companion;
        if (b13.j(y0Var) || value.f64107b != null) {
            b13.A(y0Var, 0, b1.f63929a, value.f64107b);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{f0.h.J(b1.f63929a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64086b;
        po2.a b13 = decoder.b(y0Var);
        g1 g1Var = null;
        boolean z13 = true;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else {
                if (o13 != 0) {
                    throw new UnknownFieldException(o13);
                }
                g1Var = (g1) b13.v(y0Var, 0, b1.f63929a, g1Var);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new s3(i13, g1Var);
    }
}
