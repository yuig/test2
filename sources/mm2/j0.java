package mm2;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class j0 extends c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(rg.a c13) {
        super(c13, null);
        Intrinsics.checkNotNullParameter(c13, "c");
    }

    @Override // mm2.c0
    public void n(ArrayList result, ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // mm2.c0
    public final dm2.d p() {
        return null;
    }

    @Override // mm2.c0
    public final x s(gm2.z method, ArrayList methodTypeParameters, pn2.b0 returnType, List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        return new x(valueParameters, methodTypeParameters, q0.f80391a, returnType, false);
    }
}
