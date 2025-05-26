package qn2;

import kotlin.jvm.internal.Intrinsics;
import pn2.v1;

/* loaded from: classes4.dex */
public final class r extends v {
    @Override // qn2.v
    public final v combine(v1 nextType) {
        Intrinsics.checkNotNullParameter(nextType, "nextType");
        return getResultNullability(nextType);
    }
}
