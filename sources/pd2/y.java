package pd2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class y implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f99880a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f99881b;

    static {
        y yVar = new y();
        f99880a = yVar;
        y0 y0Var = new y0("ColorValue", yVar, 1);
        y0Var.k("value", false);
        f99881b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f99881b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        a0 value = (a0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f99881b;
        po2.b b13 = encoder.b(y0Var);
        z zVar = a0.Companion;
        b13.u(y0Var, 0, id2.a.f72188a, value.f99825b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{id2.a.f72188a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f99881b;
        po2.a b13 = decoder.b(y0Var);
        id2.c cVar = null;
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
                cVar = (id2.c) b13.C(y0Var, 0, id2.a.f72188a, cVar);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, y0Var);
            throw null;
        }
        a0 a0Var = new a0();
        a0Var.f99825b = cVar;
        return a0Var;
    }
}
