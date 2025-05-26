package om0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface b0 {
    static o a(b0 b0Var, int i13, int i14) {
        u50.i0 j0Var;
        b0Var.getClass();
        p pVar = (p) b0Var;
        u50.j0 b13 = pVar.b(i13);
        if (i14 <= 0) {
            j0Var = u50.h0.f120562a;
        } else {
            int i15 = d70.f.plural_sections_string;
            ((qb0.a) pVar.f96556a).getClass();
            List formatArgs = kotlin.collections.e0.b(qb0.j.b(i14));
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            j0Var = new u50.j0(i15, i14, formatArgs);
        }
        return new o(b13, j0Var, 4);
    }
}
