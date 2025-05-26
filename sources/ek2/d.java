package ek2;

import java.util.concurrent.CountDownLatch;
import uj2.v;

/* loaded from: classes2.dex */
public final class d extends CountDownLatch implements v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f59415a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f59416b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f59417c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f59418d;

    @Override // uj2.v
    public final void a() {
        countDown();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        this.f59417c = cVar;
        if (this.f59418d) {
            cVar.dispose();
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f59415a == null) {
            this.f59415a = obj;
            this.f59417c.dispose();
            countDown();
        }
    }

    public final Object d() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e13) {
                dispose();
                throw pk2.h.d(e13);
            }
        }
        Throwable th3 = this.f59416b;
        if (th3 == null) {
            return this.f59415a;
        }
        throw pk2.h.d(th3);
    }

    @Override // xj2.c
    public final void dispose() {
        this.f59418d = true;
        xj2.c cVar = this.f59417c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f59418d;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f59415a == null) {
            this.f59416b = th3;
        }
        countDown();
    }
}
