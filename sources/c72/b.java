package c72;

import g72.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class b implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26890a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f26891b;

    static {
        b bVar = new b();
        f26890a = bVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.EffectDataEntityToPinterestWrapper", bVar, 1);
        y0Var.k("effect_data", false);
        f26891b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f26891b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        d value = (d) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f26891b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, f0.f63980b, value.f26894a);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{f0.f63980b};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f26891b;
        po2.a b13 = decoder.b(y0Var);
        g72.a0 a0Var = null;
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
                a0Var = (g72.a0) b13.C(y0Var, 0, f0.f63980b, a0Var);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new d(i13, a0Var);
    }
}
