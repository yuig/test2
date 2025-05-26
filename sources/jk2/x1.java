package jk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class x1 extends AtomicInteger implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76745a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.v f76746b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f76747c;

    /* renamed from: d, reason: collision with root package name */
    public final pk2.c f76748d;

    /* renamed from: e, reason: collision with root package name */
    public final uk2.p f76749e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f76750f;

    /* renamed from: g, reason: collision with root package name */
    public final uj2.t f76751g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f76752h;

    /* renamed from: i, reason: collision with root package name */
    public final w1 f76753i;

    public x1(uj2.v vVar, uk2.p pVar, uj2.t tVar, int i13) {
        this.f76745a = i13;
        if (i13 != 1) {
            this.f76746b = vVar;
            this.f76749e = pVar;
            this.f76751g = tVar;
            this.f76747c = new AtomicInteger();
            this.f76748d = new pk2.c();
            this.f76753i = new w1(this, 0);
            this.f76750f = new AtomicReference();
            return;
        }
        this.f76746b = vVar;
        this.f76749e = pVar;
        this.f76751g = tVar;
        this.f76747c = new AtomicInteger();
        this.f76748d = new pk2.c();
        this.f76753i = new w1(this, 1);
        this.f76750f = new AtomicReference();
    }

    @Override // uj2.v
    public final void a() {
        switch (this.f76745a) {
            case 0:
                bk2.c.replace(this.f76750f, null);
                this.f76752h = false;
                this.f76749e.c(0);
                break;
            default:
                bk2.c.dispose(this.f76753i);
                dl2.b.e2(this.f76746b, this, this.f76748d);
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        AtomicReference atomicReference = this.f76750f;
        switch (this.f76745a) {
            case 0:
                bk2.c.setOnce(atomicReference, cVar);
                break;
            default:
                bk2.c.replace(atomicReference, cVar);
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f76745a;
        pk2.c cVar = this.f76748d;
        uj2.v vVar = this.f76746b;
        switch (i13) {
            case 0:
                dl2.b.i2(vVar, obj, this, cVar);
                break;
            default:
                dl2.b.i2(vVar, obj, this, cVar);
                break;
        }
    }

    public final void d() {
        switch (this.f76745a) {
            case 0:
                if (this.f76747c.getAndIncrement() == 0) {
                    while (!isDisposed()) {
                        if (!this.f76752h) {
                            this.f76752h = true;
                            this.f76751g.d(this);
                        }
                        if (this.f76747c.decrementAndGet() == 0) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                if (this.f76747c.getAndIncrement() == 0) {
                    while (!isDisposed()) {
                        if (!this.f76752h) {
                            this.f76752h = true;
                            this.f76751g.d(this);
                        }
                        if (this.f76747c.decrementAndGet() == 0) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        AtomicReference atomicReference = this.f76750f;
        int i13 = this.f76745a;
        w1 w1Var = this.f76753i;
        switch (i13) {
            case 0:
                bk2.c.dispose(atomicReference);
                bk2.c.dispose(w1Var);
                break;
            default:
                bk2.c.dispose(atomicReference);
                bk2.c.dispose(w1Var);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        AtomicReference atomicReference = this.f76750f;
        switch (this.f76745a) {
        }
        return bk2.c.isDisposed((xj2.c) atomicReference.get());
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        switch (this.f76745a) {
            case 0:
                bk2.c.dispose(this.f76753i);
                dl2.b.g2(this.f76746b, th3, this, this.f76748d);
                break;
            default:
                bk2.c.replace(this.f76750f, null);
                this.f76752h = false;
                this.f76749e.c(th3);
                break;
        }
    }
}
