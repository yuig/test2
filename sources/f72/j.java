package f72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class j implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j f61284a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61285b;

    static {
        j jVar = new j();
        f61284a = jVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.PriceFilterEntity", jVar, 4);
        y0Var.k("currency_type", false);
        y0Var.k("min_value", false);
        y0Var.k("max_value", false);
        y0Var.k("suggested_max_value", false);
        f61285b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61285b;
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
        qo2.y0 y0Var = f61285b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61294a, y0Var);
        b13.v(y0Var, 1, value.f61295b);
        b13.v(y0Var, 2, value.f61296c);
        b13.v(y0Var, 3, value.f61297d);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.z zVar = qo2.z.f104669a;
        return new no2.b[]{qo2.j1.f104576a, zVar, zVar, zVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61285b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        String str = null;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                str = b13.k(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                f13 = b13.n(y0Var, 1);
                i13 |= 2;
            } else if (o13 == 2) {
                f14 = b13.n(y0Var, 2);
                i13 |= 4;
            } else {
                if (o13 != 3) {
                    throw new UnknownFieldException(o13);
                }
                f15 = b13.n(y0Var, 3);
                i13 |= 8;
            }
        }
        b13.a(y0Var);
        return new l(i13, str, f13, f14, f15);
    }
}
