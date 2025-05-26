package lb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l f82717i = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th3 = (Throwable) obj;
        ob0.a aVar = ob0.b.f93978b;
        if (aVar == null) {
            Intrinsics.r("crashReporter");
            throw null;
        }
        Intrinsics.f(th3);
        ((tb0.h) aVar).o("Failed to save SharedPreferences", th3);
        return Unit.f80348a;
    }
}
