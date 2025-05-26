package yq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final y f139758i = new y(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.f(throwable);
        tb0.p productFlow = tb0.p.PLATFORM;
        vb0.j.f125466a.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter("Error while notifying recycler adapter", "detailedExceptionMessage");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        new AssertionError(throwable.getMessage(), throwable);
        return Unit.f80348a;
    }
}
