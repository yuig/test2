package g90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ns.f0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final z f64569i = new z(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        l82.c0 subResult = (l82.c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new f0(subResult, 15));
        createLens.h(new f0(subResult, 16));
        d7.g.y(subResult, 7, createLens);
        return Unit.f80348a;
    }
}
