package qd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class d implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f103587a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f103588b;

    static {
        d dVar = new d();
        f103587a = dVar;
        y0 y0Var = new y0("FloatValueBounds", dVar, 2);
        y0Var.k("min", false);
        y0Var.k("max", false);
        f103588b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f103588b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        f value = (f) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f103588b;
        po2.b b13 = encoder.b(y0Var);
        b13.v(y0Var, 0, value.f103589c);
        b13.v(y0Var, 1, value.f103590d);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.z zVar = qo2.z.f104669a;
        return new no2.b[]{zVar, zVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f103588b;
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
        return new f(i13, f13, f14);
    }
}
