package pd2;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class r implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r f99870a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99871b;

    static {
        r rVar = new r();
        f99870a = rVar;
        y0 y0Var = new y0("PointParamSpec", rVar, 3);
        y0Var.k("defaultValue", false);
        y0Var.k("limits", true);
        y0Var.k("default", true);
        f99871b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99871b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99871b;
        po2.b b13 = encoder.b(y0Var);
        s sVar = t.Companion;
        b13.u(y0Var, 0, jd2.a.f75540a, value.f99873b);
        boolean j13 = b13.j(y0Var);
        qd2.a0 a0Var = value.f99874c;
        if (j13 || a0Var != null) {
            b13.A(y0Var, 1, qd2.y.f103610a, a0Var);
        }
        boolean j14 = b13.j(y0Var);
        o0 o0Var = value.f99875d;
        if (j14 || !Intrinsics.d(o0Var, new o0(value.f99873b))) {
            b13.u(y0Var, 2, m0.f99855a, o0Var);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{jd2.a.f75540a, f0.h.J(qd2.y.f103610a), m0.f99855a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99871b;
        po2.a b13 = decoder.b(y0Var);
        PointF pointF = null;
        boolean z13 = true;
        qd2.a0 a0Var = null;
        o0 o0Var = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                pointF = (PointF) b13.C(y0Var, 0, jd2.a.f75540a, pointF);
                i13 |= 1;
            } else if (o13 == 1) {
                a0Var = (qd2.a0) b13.v(y0Var, 1, qd2.y.f103610a, a0Var);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                o0Var = (o0) b13.C(y0Var, 2, m0.f99855a, o0Var);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new t(i13, pointF, a0Var, o0Var);
    }
}
