package wr1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final w0 f131025i = new w0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        l82.c0 subResult = (l82.c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new x91.g0(subResult, 11));
        createLens.h(new x91.g0(subResult, 12));
        createLens.c(new com.pinterest.feature.unauth.sba.m0(subResult, 1));
        return Unit.f80348a;
    }
}
