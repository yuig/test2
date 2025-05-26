package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class r0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f64091a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64092b;

    static {
        r0 r0Var = new r0();
        f64091a = r0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.Float2x2ValueConfig.Float2x2Value", r0Var, 2);
        y0Var.k("_0", false);
        y0Var.k("_1", false);
        f64092b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64092b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        t0 value = (t0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64092b;
        po2.b b13 = encoder.b(y0Var);
        qo2.y yVar = qo2.y.f104655c;
        b13.u(y0Var, 0, yVar, value.f64110a);
        b13.u(y0Var, 1, yVar, value.f64111b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.y yVar = qo2.y.f104655c;
        return new no2.b[]{yVar, yVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64092b;
        po2.a b13 = decoder.b(y0Var);
        float[] fArr = null;
        boolean z13 = true;
        float[] fArr2 = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                fArr = (float[]) b13.C(y0Var, 0, qo2.y.f104655c, fArr);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                fArr2 = (float[]) b13.C(y0Var, 1, qo2.y.f104655c, fArr2);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new t0(i13, fArr, fArr2);
    }
}
