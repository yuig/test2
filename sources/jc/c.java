package jc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f75374d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f75375a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f75376b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f75377c;

    public c() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f75375a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f75377c = "lottie-" + f75374d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f75375a, runnable, this.f75377c + this.f75376b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
