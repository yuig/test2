package f0;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60723a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f60724b = new AtomicInteger(0);

    public b(int i13) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f60724b;
        switch (this.f60723a) {
            case 0:
                Thread thread = new Thread(new a(0, runnable));
                Locale locale = Locale.US;
                thread.setName("CameraX-camerax_audio_" + atomicInteger.getAndIncrement());
                return thread;
            default:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread2.setName("CameraX-camerax_io_" + atomicInteger.getAndIncrement());
                return thread2;
        }
    }

    public b() {
    }
}
