package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class x0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f64142a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64143b;

    static {
        x0 x0Var = new x0();
        f64142a = x0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.Float4ValueConfig.Float4Value", x0Var, 1);
        y0Var.k("_0", false);
        f64143b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64143b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        z0 value = (z0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64143b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, qo2.y.f104655c, value.f64165a);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{qo2.y.f104655c};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64143b;
        po2.a b13 = decoder.b(y0Var);
        float[] fArr = null;
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
                fArr = (float[]) b13.C(y0Var, 0, qo2.y.f104655c, fArr);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new z0(i13, fArr);
    }
}
