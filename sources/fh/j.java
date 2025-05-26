package fh;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static j f62145b;

    /* renamed from: a, reason: collision with root package name */
    public final a f62146a;

    public j(Context context) {
        a a13 = a.a(context);
        this.f62146a = a13;
        a13.b();
        a13.c();
    }

    public static synchronized j a(Context context) {
        j jVar;
        synchronized (j.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (j.class) {
                jVar = f62145b;
                if (jVar == null) {
                    jVar = new j(applicationContext);
                    f62145b = jVar;
                }
            }
            return jVar;
        }
        return jVar;
    }

    public final synchronized void b() {
        a aVar = this.f62146a;
        ReentrantLock reentrantLock = aVar.f62133a;
        reentrantLock.lock();
        try {
            aVar.f62134b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
