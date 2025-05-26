package an2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final o f15807i = new o(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b0 withOptions = (b0) obj;
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.l(c.f15764a);
        withOptions.n(j0.ONLY_NON_SYNTHESIZED);
        return Unit.f80348a;
    }
}
