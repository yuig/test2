package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class l implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l f99852a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99853b;

    static {
        l lVar = new l();
        f99852a = lVar;
        y0 y0Var = new y0("IntParamSpec", lVar, 3);
        y0Var.k("defaultValue", false);
        y0Var.k("limits", true);
        y0Var.k("default", true);
        f99853b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99853b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        n value = (n) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99853b;
        po2.b b13 = encoder.b(y0Var);
        b13.D(0, value.f99858b, y0Var);
        boolean j13 = b13.j(y0Var);
        qd2.u uVar = value.f99859c;
        if (j13 || uVar != null) {
            b13.A(y0Var, 1, n.f99857e[1], uVar);
        }
        boolean j14 = b13.j(y0Var);
        i0 i0Var = value.f99860d;
        if (j14 || !Intrinsics.d(i0Var, new i0(value.f99858b))) {
            b13.u(y0Var, 2, g0.f99841a, i0Var);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{qo2.f0.f104550a, f0.h.J(n.f99857e[1]), g0.f99841a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99853b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = n.f99857e;
        qd2.u uVar = null;
        boolean z13 = true;
        i0 i0Var = null;
        int i13 = 0;
        int i14 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                i14 = b13.D(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                uVar = (qd2.u) b13.v(y0Var, 1, bVarArr[1], uVar);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                i0Var = (i0) b13.C(y0Var, 2, g0.f99841a, i0Var);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new n(i13, i14, uVar, i0Var);
    }
}
