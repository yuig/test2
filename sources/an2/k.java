package an2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final k f15803i = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b0 withOptions = (b0) obj;
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.k(a0.ALL_EXCEPT_ANNOTATIONS);
        return Unit.f80348a;
    }
}
