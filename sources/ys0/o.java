package ys0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final o f140123i = new o(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        c0 subResult = (c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new il0.r(subResult, 28));
        createLens.h(new il0.r(subResult, 29));
        a.c.x(subResult, 7, createLens);
        return Unit.f80348a;
    }
}
