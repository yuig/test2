package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class a implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f99823a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99824b;

    static {
        a aVar = new a();
        f99823a = aVar;
        y0 y0Var = new y0("BoolParamSpec", aVar, 3);
        y0Var.k("defaultValue", false);
        y0Var.k("default", true);
        y0Var.k("limits", true);
        f99824b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99824b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        c value = (c) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99824b;
        po2.b b13 = encoder.b(y0Var);
        b13.E(y0Var, 0, value.f99828b);
        boolean j13 = b13.j(y0Var);
        x xVar = value.f99829c;
        if (j13 || !Intrinsics.d(xVar, new x(value.f99828b))) {
            b13.u(y0Var, 1, v.f99877a, xVar);
        }
        boolean j14 = b13.j(y0Var);
        qd2.c cVar = value.f99830d;
        if (j14 || cVar != null) {
            b13.A(y0Var, 2, c.f99827e[2], cVar);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{qo2.g.f104555a, v.f99877a, f0.h.J(c.f99827e[2])};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99824b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = c.f99827e;
        x xVar = null;
        boolean z13 = true;
        qd2.c cVar = null;
        int i13 = 0;
        boolean z14 = false;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                z14 = b13.h(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                xVar = (x) b13.C(y0Var, 1, v.f99877a, xVar);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                cVar = (qd2.c) b13.v(y0Var, 2, bVarArr[2], cVar);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new c(i13, z14, xVar, cVar);
    }
}
