package f72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class d implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f61240a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61241b;

    static {
        d dVar = new d();
        f61240a = dVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ImageAttributesEntity", dVar, 3);
        y0Var.k("url", false);
        y0Var.k("width", false);
        y0Var.k("height", false);
        f61241b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61241b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        f value = (f) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61241b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61245a, y0Var);
        b13.D(1, value.f61246b, y0Var);
        b13.D(2, value.f61247c, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.f0 f0Var = qo2.f0.f104550a;
        return new no2.b[]{qo2.j1.f104576a, f0Var, f0Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61241b;
        po2.a b13 = decoder.b(y0Var);
        String str = null;
        boolean z13 = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                str = b13.k(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                i14 = b13.D(y0Var, 1);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                i15 = b13.D(y0Var, 2);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new f(i13, str, i14, i15);
    }
}
