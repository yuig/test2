package rg0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final r0 f108086i = new r0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yb0.d reason = (yb0.d) obj;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (reason != yb0.d.CONFIRM_BUTTON_CLICK) {
            s0.f108088a.b();
        }
        return Unit.f80348a;
    }
}
