package jd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.a0;
import qo2.w0;
import qo2.y0;
import qo2.z;

/* loaded from: classes4.dex */
public final class f implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f75548a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f75549b;

    static {
        f fVar = new f();
        f75548a = fVar;
        y0 y0Var = new y0("com.pinterest.xrenderer.common.serialization.RectSurrogate", fVar, 4);
        y0Var.k("left", false);
        y0Var.k("top", false);
        y0Var.k("right", false);
        y0Var.k("bottom", false);
        f75549b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f75549b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        h value = (h) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f75549b;
        po2.b b13 = encoder.b(y0Var);
        b13.v(y0Var, 0, value.f75550a);
        b13.v(y0Var, 1, value.f75551b);
        b13.v(y0Var, 2, value.f75552c);
        b13.v(y0Var, 3, value.f75553d);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        z zVar = z.f104669a;
        return new no2.b[]{zVar, zVar, zVar, zVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f75549b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                f13 = b13.n(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                f14 = b13.n(y0Var, 1);
                i13 |= 2;
            } else if (o13 == 2) {
                f15 = b13.n(y0Var, 2);
                i13 |= 4;
            } else {
                if (o13 != 3) {
                    throw new UnknownFieldException(o13);
                }
                f16 = b13.n(y0Var, 3);
                i13 |= 8;
            }
        }
        b13.a(y0Var);
        return new h(i13, f13, f14, f15, f16);
    }
}
