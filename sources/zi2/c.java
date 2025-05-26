package zi2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh2.e3;
import r0.p0;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f142036e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f142037f;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f142038a = null;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f142039b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f142040c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f142041d = new Object();

    static {
        c cVar = new c();
        cVar.d();
        f142036e = cVar;
        c cVar2 = new c();
        cVar2.a(null);
        f142037f = cVar2;
    }

    public static c c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f142036e;
        }
        c cVar = new c();
        AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AtomicReference atomicReference = new AtomicReference();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            cVar2.e(new p0(cVar2, atomicBoolean, atomicReference, atomicInteger, cVar, 7));
        }
        return cVar;
    }

    public final void a(Throwable th3) {
        synchronized (this.f142041d) {
            try {
                if (this.f142038a == null) {
                    this.f142038a = Boolean.FALSE;
                    this.f142039b = th3;
                    Iterator it = this.f142040c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void b(TimeUnit timeUnit) {
        boolean z13;
        synchronized (this.f142041d) {
            z13 = this.f142038a != null;
        }
        if (z13) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        e(new e3(countDownLatch, 4));
        try {
            countDownLatch.await(10L, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void d() {
        synchronized (this.f142041d) {
            try {
                if (this.f142038a == null) {
                    this.f142038a = Boolean.TRUE;
                    Iterator it = this.f142040c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(Runnable runnable) {
        boolean z13;
        synchronized (this.f142041d) {
            if (this.f142038a != null) {
                z13 = true;
            } else {
                this.f142040c.add(runnable);
                z13 = false;
            }
        }
        if (z13) {
            runnable.run();
        }
    }
}
