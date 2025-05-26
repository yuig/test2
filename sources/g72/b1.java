package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class b1 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f63929a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f63930b;

    static {
        b1 b1Var = new b1();
        f63929a = b1Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.FloatValueConfig", b1Var, 3);
        y0Var.k("float", false);
        y0Var.k("unique", true);
        y0Var.k("value", true);
        f63930b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f63930b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        g1 value = (g1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f63930b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, d1.f63963a, value.f63989a);
        boolean j13 = b13.j(y0Var);
        boolean z13 = value.f63990b;
        if (j13 || z13) {
            b13.E(y0Var, 1, z13);
        }
        boolean j14 = b13.j(y0Var);
        float f13 = value.f63991c;
        if (j14 || Float.compare(f13, value.f63989a.f63982a) != 0) {
            b13.v(y0Var, 2, f13);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{d1.f63963a, qo2.g.f104555a, qo2.z.f104669a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f63930b;
        po2.a b13 = decoder.b(y0Var);
        f1 f1Var = null;
        float f13 = 0.0f;
        boolean z13 = true;
        int i13 = 0;
        boolean z14 = false;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                f1Var = (f1) b13.C(y0Var, 0, d1.f63963a, f1Var);
                i13 |= 1;
            } else if (o13 == 1) {
                z14 = b13.h(y0Var, 1);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                f13 = b13.n(y0Var, 2);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new g1(i13, f1Var, z14, f13);
    }
}
