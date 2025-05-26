package sd;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import lb.x;
import wc.j;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f112300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112301b;

    /* renamed from: c, reason: collision with root package name */
    public final c f112302c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f112303d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f112304e;

    public b(pd.a aVar, String str, boolean z13) {
        j jVar = c.To;
        this.f112304e = new AtomicInteger();
        this.f112300a = aVar;
        this.f112301b = str;
        this.f112302c = jVar;
        this.f112303d = z13;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f112300a.newThread(new x(5, this, runnable));
        newThread.setName("glide-" + this.f112301b + "-thread-" + this.f112304e.getAndIncrement());
        return newThread;
    }
}
