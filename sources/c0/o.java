package c0;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class o implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24287a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f24288b;

    public o(int i13) {
        this.f24287a = i13;
        if (i13 != 1) {
            this.f24288b = new AtomicInteger(0);
        } else {
            this.f24288b = new AtomicInteger(1);
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f24288b;
        switch (this.f24287a) {
            case 0:
                Thread thread = new Thread(runnable);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + atomicInteger.getAndIncrement());
                return thread;
            default:
                return new Thread(runnable, a.a.d("CrAsyncTask #", atomicInteger.getAndIncrement()));
        }
    }
}
