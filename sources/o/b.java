package o;

import android.os.Looper;

/* loaded from: classes.dex */
public final class b extends so.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f92734c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f92735d = new a(1);

    /* renamed from: b, reason: collision with root package name */
    public final e f92736b = new e();

    public static b l() {
        if (f92734c != null) {
            return f92734c;
        }
        synchronized (b.class) {
            try {
                if (f92734c == null) {
                    f92734c = new b();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f92734c;
    }

    public final boolean m() {
        this.f92736b.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void n(Runnable runnable) {
        e eVar = this.f92736b;
        if (eVar.f92742d == null) {
            synchronized (eVar.f92740b) {
                try {
                    if (eVar.f92742d == null) {
                        eVar.f92742d = e.l(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        eVar.f92742d.post(runnable);
    }
}
