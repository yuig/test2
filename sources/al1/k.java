package al1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final k f15489i = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ku1.k screenNavigator = (ku1.k) obj;
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        screenNavigator.D5();
        return Unit.f80348a;
    }
}
