package qd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.f0;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class m implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f103597a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f103598b;

    static {
        m mVar = new m();
        f103597a = mVar;
        y0 y0Var = new y0("IntValueBounds", mVar, 2);
        y0Var.k("min", false);
        y0Var.k("max", false);
        f103598b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f103598b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        o value = (o) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f103598b;
        po2.b b13 = encoder.b(y0Var);
        b13.D(0, value.f103599c, y0Var);
        b13.D(1, value.f103600d, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        f0 f0Var = f0.f104550a;
        return new no2.b[]{f0Var, f0Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f103598b;
        po2.a b13 = decoder.b(y0Var);
        boolean z13 = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                i14 = b13.D(y0Var, 0);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                i15 = b13.D(y0Var, 1);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new o(i13, i14, i15);
    }
}
