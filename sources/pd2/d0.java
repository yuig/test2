package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class d0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f99833a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99834b;

    static {
        d0 d0Var = new d0();
        f99833a = d0Var;
        y0 y0Var = new y0("FloatValue", d0Var, 1);
        y0Var.k("value", false);
        f99834b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99834b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        f0 value = (f0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99834b;
        po2.b b13 = encoder.b(y0Var);
        b13.v(y0Var, 0, value.f99839b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{qo2.z.f104669a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99834b;
        po2.a b13 = decoder.b(y0Var);
        float f13 = 0.0f;
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
                f13 = b13.n(y0Var, 0);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, y0Var);
            throw null;
        }
        f0 f0Var = new f0();
        f0Var.f99839b = f13;
        return f0Var;
    }
}
