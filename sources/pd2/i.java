package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class i implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f99843a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99844b;

    static {
        i iVar = new i();
        f99843a = iVar;
        y0 y0Var = new y0("FloatParamSpec", iVar, 3);
        y0Var.k("defaultValue", false);
        y0Var.k("limits", true);
        y0Var.k("default", true);
        f99844b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99844b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        k value = (k) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99844b;
        po2.b b13 = encoder.b(y0Var);
        b13.v(y0Var, 0, value.f99849b);
        boolean j13 = b13.j(y0Var);
        qd2.l lVar = value.f99850c;
        if (j13 || lVar != null) {
            b13.A(y0Var, 1, k.f99848e[1], lVar);
        }
        boolean j14 = b13.j(y0Var);
        f0 f0Var = value.f99851d;
        if (j14 || !Intrinsics.d(f0Var, new f0(value.f99849b))) {
            b13.u(y0Var, 2, d0.f99833a, f0Var);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{qo2.z.f104669a, f0.h.J(k.f99848e[1]), d0.f99833a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99844b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = k.f99848e;
        qd2.l lVar = null;
        boolean z13 = true;
        int i13 = 0;
        float f13 = 0.0f;
        f0 f0Var = null;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                f13 = b13.n(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                lVar = (qd2.l) b13.v(y0Var, 1, bVarArr[1], lVar);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                f0Var = (f0) b13.C(y0Var, 2, d0.f99833a, f0Var);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new k(i13, f13, lVar, f0Var);
    }
}
