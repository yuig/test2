package ct0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final x f53171i = new x(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        c0 subResult = (c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new bt0.r(subResult, 2));
        createLens.h(new bt0.r(subResult, 3));
        a.c.x(subResult, 9, createLens);
        return Unit.f80348a;
    }
}
