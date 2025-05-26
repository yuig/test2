package ads_mobile_sdk;

import ao2.g0;
import ao2.h0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ek0 extends kotlin.coroutines.a implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final a.j3 f4876a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(a.j3 traceLogger) {
        super(g0.f20153a);
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f4876a = traceLogger;
    }

    @Override // ao2.h0
    public final void handleException(CoroutineContext context, Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        ok.e0 e0Var = gk0.f5596a;
        gk0.d("Uncaught exception on context " + context + ": " + exception, null);
        ((ks2) this.f4876a).a(exception);
    }
}
