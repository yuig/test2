package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final v0 f138259i = new v0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l82.e createLens = (l82.e) obj;
        l82.c0 subResult = (l82.c0) obj2;
        Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        createLens.f(new u0(subResult, 0));
        createLens.h(new u0(subResult, 1));
        createLens.c(new w(subResult, 4));
        return Unit.f80348a;
    }
}
