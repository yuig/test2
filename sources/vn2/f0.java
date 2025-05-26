package vn2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f0 f126319i = new f0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xl2.l lVar = (xl2.l) obj;
        Intrinsics.checkNotNullParameter(lVar, "$this$null");
        pn2.h0 x13 = lVar.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getUnitType(...)");
        return x13;
    }
}
