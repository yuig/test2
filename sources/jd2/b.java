package jd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.a0;
import qo2.w0;
import qo2.y0;
import qo2.z;

/* loaded from: classes4.dex */
public final class b implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f75542a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f75543b;

    static {
        b bVar = new b();
        f75542a = bVar;
        y0 y0Var = new y0("com.pinterest.xrenderer.common.serialization.PointSurrogate", bVar, 2);
        y0Var.k("x", false);
        y0Var.k("y", false);
        f75543b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f75543b;
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
        y0 y0Var = f75543b;
        po2.b b13 = encoder.b(y0Var);
        b13.v(y0Var, 0, value.f75544a);
        b13.v(y0Var, 1, value.f75545b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        z zVar = z.f104669a;
        return new no2.b[]{zVar, zVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f75543b;
        po2.a b13 = decoder.b(y0Var);
        float f13 = 0.0f;
        boolean z13 = true;
        int i13 = 0;
        float f14 = 0.0f;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                f13 = b13.n(y0Var, 0);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                f14 = b13.n(y0Var, 1);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new d(i13, f13, f14);
    }
}
