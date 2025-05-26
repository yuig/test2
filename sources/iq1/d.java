package iq1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import x02.x2;

/* loaded from: classes5.dex */
public final /* synthetic */ class d extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p03 = (String) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return ((x2) this.receiver).P(p03);
    }
}
