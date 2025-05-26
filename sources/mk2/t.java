package mk2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class t extends AtomicLong implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f87417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87418b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87419c;

    public t(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f87417a + '-' + incrementAndGet();
        Thread sVar = this.f87419c ? new s(runnable, str) : new Thread(runnable, str);
        sVar.setPriority(this.f87418b);
        sVar.setDaemon(true);
        return sVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return a.a.p(new StringBuilder("RxThreadFactory["), this.f87417a, "]");
    }

    public t(String str, int i13, boolean z13) {
        this.f87417a = str;
        this.f87418b = i13;
        this.f87419c = z13;
    }
}
