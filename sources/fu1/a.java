package fu1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ts1.b;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f62990i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b withNavigationControllerOnMain = (b) obj;
        Intrinsics.checkNotNullParameter(withNavigationControllerOnMain, "$this$withNavigationControllerOnMain");
        b.a(withNavigationControllerOnMain, vs1.a.action_demoOneFragment_to_demoTwoFragment);
        return Unit.f80348a;
    }
}
