package en0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f59646a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f59647b = Executors.defaultThreadFactory();

    public d(String str) {
        this.f59646a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Thread newThread = this.f59647b.newThread(task);
        newThread.setName(this.f59646a);
        Intrinsics.checkNotNullExpressionValue(newThread, "apply(...)");
        return newThread;
    }
}
