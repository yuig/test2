package o;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import lg.h;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92737a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f92738b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f92739c;

    public c(String str) {
        this.f92737a = 1;
        this.f92739c = Executors.defaultThreadFactory();
        this.f92738b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i13 = this.f92737a;
        Serializable serializable = this.f92738b;
        switch (i13) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) serializable).getAndIncrement());
                return thread;
            default:
                Thread newThread = ((ThreadFactory) this.f92739c).newThread(new h(runnable, 0));
                newThread.setName((String) serializable);
                return newThread;
        }
    }

    public c(e eVar) {
        this.f92737a = 0;
        this.f92739c = eVar;
        this.f92738b = new AtomicInteger(0);
    }
}
