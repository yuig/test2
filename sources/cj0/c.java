package cj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        a3.d p13 = (a3.d) obj2;
        Intrinsics.checkNotNullParameter(p13, "p1");
        f fVar = (f) this.receiver;
        fVar.f27819g = intValue;
        fVar.f27820h = p13;
        return Unit.f80348a;
    }
}
