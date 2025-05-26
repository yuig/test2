package kb;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f78984a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f78985b;

    public e(boolean z13) {
        this.f78985b = z13;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        StringBuilder i13 = n60.o.i(this.f78985b ? "WM.task-" : "androidx.work-");
        i13.append(this.f78984a.incrementAndGet());
        return new Thread(runnable, i13.toString());
    }
}
