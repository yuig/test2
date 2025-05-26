package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class j0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f64023a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64024b;

    static {
        j0 j0Var = new j0();
        f64023a = j0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.Float2ValueConfig", j0Var, 3);
        y0Var.k("float2", false);
        y0Var.k("unique", true);
        y0Var.k("value", true);
        f64024b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64024b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        o0 value = (o0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64024b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, l0.f64045a, value.f64062a);
        boolean j13 = b13.j(y0Var);
        boolean z13 = value.f64063b;
        if (j13 || z13) {
            b13.E(y0Var, 1, z13);
        }
        boolean j14 = b13.j(y0Var);
        float[] fArr = value.f64064c;
        if (j14 || !Intrinsics.d(fArr, value.f64062a.f64054a)) {
            b13.u(y0Var, 2, qo2.y.f104655c, fArr);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{l0.f64045a, qo2.g.f104555a, qo2.y.f104655c};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64024b;
        po2.a b13 = decoder.b(y0Var);
        n0 n0Var = null;
        boolean z13 = true;
        float[] fArr = null;
        int i13 = 0;
        boolean z14 = false;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                n0Var = (n0) b13.C(y0Var, 0, l0.f64045a, n0Var);
                i13 |= 1;
            } else if (o13 == 1) {
                z14 = b13.h(y0Var, 1);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                fArr = (float[]) b13.C(y0Var, 2, qo2.y.f104655c, fArr);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new o0(i13, n0Var, z14, fArr);
    }
}
