package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class o implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o f99861a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99862b;

    static {
        o oVar = new o();
        f99861a = oVar;
        y0 y0Var = new y0("LineParamSpec", oVar, 3);
        y0Var.k("defaultValue", false);
        y0Var.k("limits", true);
        y0Var.k("default", true);
        f99862b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99862b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        q value = (q) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99862b;
        po2.b b13 = encoder.b(y0Var);
        p pVar = q.Companion;
        b13.u(y0Var, 0, hd2.d.f68920a, value.f99865b);
        boolean j13 = b13.j(y0Var);
        qd2.x xVar = value.f99866c;
        if (j13 || xVar != null) {
            b13.A(y0Var, 1, qd2.v.f103607a, xVar);
        }
        boolean j14 = b13.j(y0Var);
        l0 l0Var = value.f99867d;
        if (j14 || !Intrinsics.d(l0Var, new l0(value.f99865b))) {
            b13.u(y0Var, 2, j0.f99846a, l0Var);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{hd2.d.f68920a, f0.h.J(qd2.v.f103607a), j0.f99846a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99862b;
        po2.a b13 = decoder.b(y0Var);
        hd2.f fVar = null;
        boolean z13 = true;
        qd2.x xVar = null;
        l0 l0Var = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                fVar = (hd2.f) b13.C(y0Var, 0, hd2.d.f68920a, fVar);
                i13 |= 1;
            } else if (o13 == 1) {
                xVar = (qd2.x) b13.v(y0Var, 1, qd2.v.f103607a, xVar);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                l0Var = (l0) b13.C(y0Var, 2, j0.f99846a, l0Var);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new q(i13, fVar, xVar, l0Var);
    }
}
