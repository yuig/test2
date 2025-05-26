package dm;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55307a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f55308b;

    public c(int i13) {
        this.f55307a = i13;
        if (i13 == 1) {
            this.f55308b = new AtomicInteger(1);
        } else if (i13 != 2) {
            this.f55308b = new AtomicInteger(1);
        } else {
            this.f55308b = new AtomicInteger(1);
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r13) {
        switch (this.f55307a) {
            case 0:
                return new Thread(r13, String.format("firebase-installations-executor-%d", Integer.valueOf(((AtomicInteger) this.f55308b).getAndIncrement())));
            case 1:
                Intrinsics.checkNotNullParameter(r13, "r");
                return new Thread(r13, a.a.d("High Priority Thread factory #", ((AtomicInteger) this.f55308b).getAndIncrement()));
            case 2:
                Intrinsics.checkNotNullParameter(r13, "r");
                return new Thread(r13, a.a.d("Thread factory #", ((AtomicInteger) this.f55308b).getAndIncrement()));
            default:
                Thread newThread = ((ThreadFactory) this.f55308b).newThread(r13);
                newThread.setName("ScionFrontendApi");
                return newThread;
        }
    }

    public c() {
        this.f55307a = 3;
        this.f55308b = Executors.defaultThreadFactory();
    }
}
