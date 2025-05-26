package ki2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f79809a;

    public e(ExecutorService impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f79809a = impl;
    }

    public final Future a(Runnable runnable, Object obj) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Any");
        Future<?> submit = this.f79809a.submit(new b(runnable, obj));
        Intrinsics.checkNotNullExpressionValue(submit, "impl.submit(PriorityRunn…tyInfo as Any, runnable))");
        return submit;
    }
}
