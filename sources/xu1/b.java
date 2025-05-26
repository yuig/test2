package xu1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f135943i = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th3 = (Throwable) obj;
        f0 f0Var = vb0.j.f125466a;
        Intrinsics.f(th3);
        f0Var.E("AppBackgrounder Error : DefaultNetworkStateMonitor", th3);
        return Unit.f80348a;
    }
}
