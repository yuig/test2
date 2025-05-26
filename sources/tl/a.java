package tl;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f118019e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f118020a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f118021b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118022c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f118023d;

    public a(String str, int i13, StrictMode.ThreadPolicy threadPolicy) {
        this.f118021b = str;
        this.f118022c = i13;
        this.f118023d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f118019e.newThread(new e5.k(21, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f118021b + " Thread #" + this.f118020a.getAndIncrement());
        return newThread;
    }
}
