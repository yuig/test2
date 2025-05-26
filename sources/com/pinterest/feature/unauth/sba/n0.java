package com.pinterest.feature.unauth.sba;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final n0 f48842i = new n0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        l82.c0 subResult = (l82.c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new x91.g0(subResult, 9));
        createLens.h(new x91.g0(subResult, 10));
        createLens.c(new m0(subResult, 0));
        return Unit.f80348a;
    }
}
