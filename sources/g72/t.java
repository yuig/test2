package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class t implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t f64108a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64109b;

    static {
        t tVar = new t();
        f64108a = tVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.BooleanValueConfig.BooleanValue", tVar, 1);
        y0Var.k("_0", false);
        f64109b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64109b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        v value = (v) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64109b;
        po2.b b13 = encoder.b(y0Var);
        b13.E(y0Var, 0, value.f64125a);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{qo2.g.f104555a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64109b;
        po2.a b13 = decoder.b(y0Var);
        boolean z13 = true;
        int i13 = 0;
        boolean z14 = false;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else {
                if (o13 != 0) {
                    throw new UnknownFieldException(o13);
                }
                z14 = b13.h(y0Var, 0);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new v(i13, z14);
    }
}
