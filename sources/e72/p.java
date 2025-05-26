package e72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.j1;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class p implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f57683a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f57684b;

    static {
        p pVar = new p();
        f57683a = pVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.pinterest.RichMetadataEntity", pVar, 1);
        y0Var.k("title", true);
        f57684b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f57684b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        r value = (r) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f57684b;
        po2.b b13 = encoder.b(y0Var);
        if (b13.j(y0Var) || value.f57685a != null) {
            b13.A(y0Var, 0, j1.f104576a, value.f57685a);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{f0.h.J(j1.f104576a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f57684b;
        po2.a b13 = decoder.b(y0Var);
        String str = null;
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
                str = (String) b13.v(y0Var, 0, j1.f104576a, str);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new r(i13, str);
    }
}
