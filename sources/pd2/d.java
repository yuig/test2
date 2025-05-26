package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class d implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f99831a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99832b;

    static {
        d dVar = new d();
        f99831a = dVar;
        y0 y0Var = new y0("ColorParamSpec", dVar, 3);
        y0Var.k("defaultValue", false);
        y0Var.k("default", true);
        y0Var.k("limits", true);
        f99832b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99832b;
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
        y0 y0Var = f99832b;
        po2.b b13 = encoder.b(y0Var);
        e eVar = f.Companion;
        b13.u(y0Var, 0, id2.a.f72188a, value.f99836b);
        boolean j13 = b13.j(y0Var);
        a0 a0Var = value.f99837c;
        if (j13 || !Intrinsics.d(a0Var, new a0(value.f99836b))) {
            b13.u(y0Var, 1, y.f99880a, a0Var);
        }
        boolean j14 = b13.j(y0Var);
        qd2.c cVar = value.f99838d;
        if (j14 || cVar != null) {
            b13.A(y0Var, 2, f.f99835e[2], cVar);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{id2.a.f72188a, y.f99880a, f0.h.J(f.f99835e[2])};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99832b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = f.f99835e;
        id2.c cVar = null;
        boolean z13 = true;
        a0 a0Var = null;
        qd2.c cVar2 = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                cVar = (id2.c) b13.C(y0Var, 0, id2.a.f72188a, cVar);
                i13 |= 1;
            } else if (o13 == 1) {
                a0Var = (a0) b13.C(y0Var, 1, y.f99880a, a0Var);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                cVar2 = (qd2.c) b13.v(y0Var, 2, bVarArr[2], cVar2);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new f(i13, cVar, a0Var, cVar2);
    }
}
