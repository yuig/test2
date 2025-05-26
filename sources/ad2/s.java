package ad2;

import com.pinterest.feature.unauth.sba.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import x91.g0;

/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final s f2113i = new s(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        c0 subResult = (c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new g0(subResult, 19));
        createLens.h(new g0(subResult, 20));
        createLens.c(new m0(subResult, 3));
        return Unit.f80348a;
    }
}
