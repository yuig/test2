package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class v0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f64126a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64127b;

    static {
        v0 v0Var = new v0();
        f64126a = v0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.Float4ValueConfig", v0Var, 2);
        y0Var.k("float4", false);
        y0Var.k("value", true);
        f64127b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64127b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        a1 value = (a1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64127b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, x0.f64142a, value.f63925a);
        boolean j13 = b13.j(y0Var);
        float[] fArr = value.f63926b;
        if (j13 || !Intrinsics.d(fArr, value.f63925a.f64165a)) {
            b13.u(y0Var, 1, qo2.y.f104655c, fArr);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{x0.f64142a, qo2.y.f104655c};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64127b;
        po2.a b13 = decoder.b(y0Var);
        z0 z0Var = null;
        boolean z13 = true;
        float[] fArr = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                z0Var = (z0) b13.C(y0Var, 0, x0.f64142a, z0Var);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                fArr = (float[]) b13.C(y0Var, 1, qo2.y.f104655c, fArr);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new a1(i13, z0Var, fArr);
    }
}
