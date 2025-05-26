package fk2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lb.l0;

/* loaded from: classes4.dex */
public final class d extends AtomicInteger implements uj2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62422a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.d f62423b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f62424c;

    /* renamed from: d, reason: collision with root package name */
    public final xj2.c f62425d;

    public d(uj2.d dVar, Iterator it) {
        this.f62422a = 0;
        this.f62423b = dVar;
        this.f62424c = it;
        this.f62425d = new bk2.a();
    }

    @Override // uj2.d
    public final void a() {
        switch (this.f62422a) {
            case 0:
                c();
                break;
            default:
                if (decrementAndGet() == 0 && ((AtomicBoolean) this.f62424c).compareAndSet(false, true)) {
                    this.f62423b.a();
                    break;
                }
                break;
        }
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        int i13 = this.f62422a;
        xj2.c cVar2 = this.f62425d;
        switch (i13) {
            case 0:
                bk2.a aVar = (bk2.a) cVar2;
                aVar.getClass();
                bk2.c.replace(aVar, cVar);
                break;
            default:
                ((xj2.b) cVar2).a(cVar);
                break;
        }
    }

    public final void c() {
        uj2.d dVar = this.f62423b;
        bk2.a aVar = (bk2.a) this.f62425d;
        if (!aVar.isDisposed() && getAndIncrement() == 0) {
            Iterator it = (Iterator) this.f62424c;
            while (!aVar.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        dVar.a();
                        return;
                    }
                    try {
                        Object next = it.next();
                        ck2.i.b(next, "The CompletableSource returned is null");
                        ((uj2.b) ((uj2.f) next)).j(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        dVar.onError(th3);
                        return;
                    }
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    dVar.onError(th4);
                    return;
                }
            }
        }
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        int i13 = this.f62422a;
        uj2.d dVar = this.f62423b;
        switch (i13) {
            case 0:
                dVar.onError(th3);
                break;
            default:
                ((xj2.b) this.f62425d).dispose();
                if (!((AtomicBoolean) this.f62424c).compareAndSet(false, true)) {
                    l0.R0(th3);
                    break;
                } else {
                    dVar.onError(th3);
                    break;
                }
        }
    }

    public d(uj2.d dVar, AtomicBoolean atomicBoolean, xj2.b bVar, int i13) {
        this.f62422a = 1;
        this.f62423b = dVar;
        this.f62424c = atomicBoolean;
        this.f62425d = bVar;
        lazySet(i13);
    }
}
