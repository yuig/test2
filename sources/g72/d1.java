package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class d1 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f63963a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f63964b;

    static {
        d1 d1Var = new d1();
        f63963a = d1Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.FloatValueConfig.FloatValue", d1Var, 1);
        y0Var.k("_0", false);
        f63964b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f63964b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        f1 value = (f1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f63964b;
        po2.b b13 = encoder.b(y0Var);
        b13.v(y0Var, 0, value.f63982a);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{qo2.z.f104669a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f63964b;
        po2.a b13 = decoder.b(y0Var);
        float f13 = 0.0f;
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
                f13 = b13.n(y0Var, 0);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new f1(i13, f13);
    }
}
