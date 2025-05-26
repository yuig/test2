package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class j0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f99846a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99847b;

    static {
        j0 j0Var = new j0();
        f99846a = j0Var;
        y0 y0Var = new y0("LineValue", j0Var, 1);
        y0Var.k("value", false);
        f99847b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99847b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        l0 value = (l0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99847b;
        po2.b b13 = encoder.b(y0Var);
        k0 k0Var = l0.Companion;
        b13.u(y0Var, 0, hd2.d.f68920a, value.f99854b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{hd2.d.f68920a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99847b;
        po2.a b13 = decoder.b(y0Var);
        hd2.f fVar = null;
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
                fVar = (hd2.f) b13.C(y0Var, 0, hd2.d.f68920a, fVar);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, y0Var);
            throw null;
        }
        l0 l0Var = new l0();
        l0Var.f99854b = fVar;
        return l0Var;
    }
}
