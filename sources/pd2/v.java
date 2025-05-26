package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class v implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v f99877a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99878b;

    static {
        v vVar = new v();
        f99877a = vVar;
        y0 y0Var = new y0("BoolValue", vVar, 1);
        y0Var.k("value", false);
        f99878b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99878b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        x value = (x) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99878b;
        po2.b b13 = encoder.b(y0Var);
        b13.E(y0Var, 0, value.f99879b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{qo2.g.f104555a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99878b;
        po2.a b13 = decoder.b(y0Var);
        boolean z13 = true;
        int i13 = 0;
        boolean z14 = false;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else {
                if (o13 != 0) {
                    throw new UnknownFieldException(o13);
                }
                z14 = b13.h(y0Var, 0);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, y0Var);
            throw null;
        }
        x xVar = new x();
        xVar.f99879b = z14;
        return xVar;
    }
}
