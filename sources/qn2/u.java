package qn2;

import kotlin.jvm.internal.Intrinsics;
import pn2.v1;

/* loaded from: classes4.dex */
public final class u extends v {
    @Override // qn2.v
    public final v combine(v1 nextType) {
        Intrinsics.checkNotNullParameter(nextType, "nextType");
        v resultNullability = getResultNullability(nextType);
        return resultNullability == v.ACCEPT_NULL ? this : resultNullability;
    }
}
