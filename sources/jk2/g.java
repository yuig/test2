package jk2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class g extends AtomicInteger implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76464a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76465b;

    /* renamed from: c, reason: collision with root package name */
    public final f[] f76466c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f76467d;

    /* renamed from: e, reason: collision with root package name */
    public final lk2.c f76468e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f76469f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f76470g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f76471h;

    /* renamed from: i, reason: collision with root package name */
    public final pk2.c f76472i = new pk2.c();

    /* renamed from: j, reason: collision with root package name */
    public int f76473j;

    /* renamed from: k, reason: collision with root package name */
    public int f76474k;

    public g(int i13, int i14, uj2.v vVar, ak2.f fVar, boolean z13) {
        this.f76464a = vVar;
        this.f76465b = fVar;
        this.f76469f = z13;
        this.f76467d = new Object[i13];
        f[] fVarArr = new f[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            fVarArr[i15] = new f(this, i15);
        }
        this.f76466c = fVarArr;
        this.f76468e = new lk2.c(i14);
    }

    public final void a() {
        for (f fVar : this.f76466c) {
            fVar.getClass();
            bk2.c.dispose(fVar);
        }
    }

    public final void b(lk2.c cVar) {
        synchronized (this) {
            this.f76467d = null;
        }
        cVar.clear();
    }

    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        lk2.c cVar = this.f76468e;
        uj2.v vVar = this.f76464a;
        boolean z13 = this.f76469f;
        int i13 = 1;
        while (!this.f76470g) {
            if (!z13 && this.f76472i.get() != null) {
                a();
                b(cVar);
                pk2.c cVar2 = this.f76472i;
                cVar2.getClass();
                vVar.onError(pk2.h.b(cVar2));
                return;
            }
            boolean z14 = this.f76471h;
            Object[] objArr = (Object[]) cVar.poll();
            boolean z15 = objArr == null;
            if (z14 && z15) {
                b(cVar);
                pk2.c cVar3 = this.f76472i;
                cVar3.getClass();
                Throwable b13 = pk2.h.b(cVar3);
                if (b13 == null) {
                    vVar.a();
                    return;
                } else {
                    vVar.onError(b13);
                    return;
                }
            }
            if (z15) {
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            } else {
                try {
                    Object apply = this.f76465b.apply(objArr);
                    ck2.i.b(apply, "The combiner returned a null value");
                    vVar.c(apply);
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    pk2.c cVar4 = this.f76472i;
                    cVar4.getClass();
                    pk2.h.a(cVar4, th3);
                    a();
                    b(cVar);
                    pk2.c cVar5 = this.f76472i;
                    cVar5.getClass();
                    vVar.onError(pk2.h.b(cVar5));
                    return;
                }
            }
        }
        b(cVar);
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f76470g) {
            return;
        }
        this.f76470g = true;
        a();
        if (getAndIncrement() == 0) {
            b(this.f76468e);
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76470g;
    }
}
