package c72;

import g72.v4;
import g72.x4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class x implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x f26932a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f26933b;

    static {
        x xVar = new x();
        f26932a = xVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.ShuffleEffectDataEntityToPinterestWrapper", xVar, 1);
        y0Var.k("effect_data", false);
        f26933b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f26933b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        z value = (z) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f26933b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, v4.f64131a, value.f26934a);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{v4.f64131a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f26933b;
        po2.a b13 = decoder.b(y0Var);
        x4 x4Var = null;
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
                x4Var = (x4) b13.C(y0Var, 0, v4.f64131a, x4Var);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new z(i13, x4Var);
    }
}
