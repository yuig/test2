package ao2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20191a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f20193c;

    public /* synthetic */ p2(String str, AtomicInteger atomicInteger) {
        this.f20192b = str;
        this.f20193c = atomicInteger;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i13 = this.f20191a;
        String str = this.f20192b;
        if (i13 != 1) {
            str = str + '-' + this.f20193c.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
