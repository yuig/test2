package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class v4 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v4 f64131a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64132b;

    static {
        v4 v4Var = new v4();
        f64131a = v4Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.ShuffleEffectDataEntity", v4Var, 3);
        y0Var.k("backgroundColor", true);
        y0Var.k("motionEffect", true);
        y0Var.k("keyframeAnimation", true);
        f64132b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64132b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        x4 value = (x4) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64132b;
        po2.b b13 = encoder.b(y0Var);
        w4 w4Var = x4.Companion;
        if (b13.j(y0Var) || value.f64145a != null) {
            b13.A(y0Var, 0, qo2.j1.f104576a, value.f64145a);
        }
        if (b13.j(y0Var) || value.f64146b != null) {
            b13.A(y0Var, 1, x4.f64144d[1], value.f64146b);
        }
        if (b13.j(y0Var) || value.f64147c != null) {
            b13.A(y0Var, 2, d2.f63965b, value.f64147c);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{f0.h.J(qo2.j1.f104576a), f0.h.J(x4.f64144d[1]), f0.h.J(d2.f63965b)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64132b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = x4.f64144d;
        String str = null;
        boolean z13 = true;
        f72.t0 t0Var = null;
        b2 b2Var = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                str = (String) b13.v(y0Var, 0, qo2.j1.f104576a, str);
                i13 |= 1;
            } else if (o13 == 1) {
                t0Var = (f72.t0) b13.v(y0Var, 1, bVarArr[1], t0Var);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                b2Var = (b2) b13.v(y0Var, 2, d2.f63965b, b2Var);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new x4(i13, str, t0Var, b2Var);
    }
}
