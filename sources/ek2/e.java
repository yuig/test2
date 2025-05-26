package ek2;

import java.util.concurrent.CountDownLatch;
import uj2.d0;
import uj2.m;

/* loaded from: classes2.dex */
public final class e extends CountDownLatch implements d0, uj2.d, m {

    /* renamed from: a, reason: collision with root package name */
    public Object f59419a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f59420b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f59421c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f59422d;

    @Override // uj2.d
    public final void a() {
        countDown();
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        this.f59421c = cVar;
        if (this.f59422d) {
            cVar.dispose();
        }
    }

    public final Object c() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e13) {
                d();
                throw pk2.h.d(e13);
            }
        }
        Throwable th3 = this.f59420b;
        if (th3 == null) {
            return this.f59419a;
        }
        throw pk2.h.d(th3);
    }

    public final void d() {
        this.f59422d = true;
        xj2.c cVar = this.f59421c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f59420b = th3;
        countDown();
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f59419a = obj;
        countDown();
    }
}
