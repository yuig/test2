package pd2;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class m0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f99855a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99856b;

    static {
        m0 m0Var = new m0();
        f99855a = m0Var;
        y0 y0Var = new y0("PointValue", m0Var, 1);
        y0Var.k("value", false);
        f99856b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99856b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        o0 value = (o0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99856b;
        po2.b b13 = encoder.b(y0Var);
        n0 n0Var = o0.Companion;
        b13.u(y0Var, 0, jd2.a.f75540a, value.f99863b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{jd2.a.f75540a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99856b;
        po2.a b13 = decoder.b(y0Var);
        PointF pointF = null;
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
                pointF = (PointF) b13.C(y0Var, 0, jd2.a.f75540a, pointF);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, y0Var);
            throw null;
        }
        o0 o0Var = new o0();
        o0Var.f99863b = pointF;
        return o0Var;
    }
}
