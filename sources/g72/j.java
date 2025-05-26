package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class j implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j f64021a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64022b;

    static {
        j jVar = new j();
        f64021a = jVar;
        qo2.y0 y0Var = new qo2.y0("fadeGradient", jVar, 1);
        y0Var.k("gradientLine", true);
        f64022b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64022b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        l value = (l) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64022b;
        po2.b b13 = encoder.b(y0Var);
        k kVar = l.Companion;
        if (b13.j(y0Var) || value.f64044b != null) {
            b13.A(y0Var, 0, p0.f64070a, value.f64044b);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{f0.h.J(p0.f64070a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64022b;
        po2.a b13 = decoder.b(y0Var);
        u0 u0Var = null;
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
                u0Var = (u0) b13.v(y0Var, 0, p0.f64070a, u0Var);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new l(i13, u0Var);
    }
}
