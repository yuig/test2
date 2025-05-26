package gk2;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l0 extends AtomicInteger implements uj2.k, xp2.c {

    /* renamed from: r, reason: collision with root package name */
    public static final k0[] f65492r = new k0[0];

    /* renamed from: s, reason: collision with root package name */
    public static final k0[] f65493s = new k0[0];

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65494a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f65495b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65496c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65497d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65498e;

    /* renamed from: f, reason: collision with root package name */
    public volatile dk2.h f65499f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f65500g;

    /* renamed from: h, reason: collision with root package name */
    public final pk2.c f65501h = new pk2.c();

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f65502i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f65503j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f65504k;

    /* renamed from: l, reason: collision with root package name */
    public xp2.c f65505l;

    /* renamed from: m, reason: collision with root package name */
    public long f65506m;

    /* renamed from: n, reason: collision with root package name */
    public long f65507n;

    /* renamed from: o, reason: collision with root package name */
    public int f65508o;

    /* renamed from: p, reason: collision with root package name */
    public int f65509p;

    /* renamed from: q, reason: collision with root package name */
    public final int f65510q;

    public l0(int i13, int i14, ak2.f fVar, xp2.b bVar, boolean z13) {
        AtomicReference atomicReference = new AtomicReference();
        this.f65503j = atomicReference;
        this.f65504k = new AtomicLong();
        this.f65494a = bVar;
        this.f65495b = fVar;
        this.f65496c = z13;
        this.f65497d = i13;
        this.f65498e = i14;
        this.f65510q = Math.max(1, i13 >> 1);
        atomicReference.lazySet(f65492r);
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65500g) {
            return;
        }
        this.f65500g = true;
        e();
    }

    public final boolean b() {
        if (this.f65502i) {
            dk2.h hVar = this.f65499f;
            if (hVar != null) {
                hVar.clear();
            }
            return true;
        }
        if (this.f65496c || this.f65501h.get() == null) {
            return false;
        }
        dk2.h hVar2 = this.f65499f;
        if (hVar2 != null) {
            hVar2.clear();
        }
        pk2.c cVar = this.f65501h;
        cVar.getClass();
        Throwable b13 = pk2.h.b(cVar);
        if (b13 != pk2.h.f100547a) {
            this.f65494a.onError(b13);
        }
        return true;
    }

    @Override // xp2.b
    public final void c(Object obj) {
        AtomicReference atomicReference;
        k0[] k0VarArr;
        k0[] k0VarArr2;
        if (this.f65500g) {
            return;
        }
        try {
            Object apply = this.f65495b.apply(obj);
            ck2.i.b(apply, "The mapper returned a null Publisher");
            xp2.a aVar = (xp2.a) apply;
            if (!(aVar instanceof Callable)) {
                long j13 = this.f65506m;
                this.f65506m = 1 + j13;
                k0 k0Var = new k0(this, j13);
                do {
                    atomicReference = this.f65503j;
                    k0VarArr = (k0[]) atomicReference.get();
                    if (k0VarArr == f65493s) {
                        ok2.g.cancel(k0Var);
                        return;
                    }
                    int length = k0VarArr.length;
                    k0VarArr2 = new k0[length + 1];
                    System.arraycopy(k0VarArr, 0, k0VarArr2, 0, length);
                    k0VarArr2[length] = k0Var;
                } while (!d7.g.A(atomicReference, k0VarArr, k0VarArr2));
                aVar.b(k0Var);
                return;
            }
            try {
                Object call = ((Callable) aVar).call();
                if (call == null) {
                    if (this.f65497d == Integer.MAX_VALUE || this.f65502i) {
                        return;
                    }
                    int i13 = this.f65509p + 1;
                    this.f65509p = i13;
                    int i14 = this.f65510q;
                    if (i13 == i14) {
                        this.f65509p = 0;
                        this.f65505l.request(i14);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j14 = this.f65504k.get();
                    dk2.h hVar = this.f65499f;
                    if (j14 == 0 || !(hVar == null || hVar.isEmpty())) {
                        if (hVar == null) {
                            hVar = h();
                        }
                        if (!hVar.offer(call)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        }
                    } else {
                        this.f65494a.c(call);
                        if (j14 != Long.MAX_VALUE) {
                            this.f65504k.decrementAndGet();
                        }
                        if (this.f65497d != Integer.MAX_VALUE && !this.f65502i) {
                            int i15 = this.f65509p + 1;
                            this.f65509p = i15;
                            int i16 = this.f65510q;
                            if (i15 == i16) {
                                this.f65509p = 0;
                                this.f65505l.request(i16);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!h().offer(call)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                g();
            } catch (Throwable th3) {
                bp1.h.H(th3);
                pk2.c cVar = this.f65501h;
                cVar.getClass();
                pk2.h.a(cVar, th3);
                e();
            }
        } catch (Throwable th4) {
            bp1.h.H(th4);
            this.f65505l.cancel();
            onError(th4);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        dk2.h hVar;
        k0[] k0VarArr;
        if (this.f65502i) {
            return;
        }
        this.f65502i = true;
        this.f65505l.cancel();
        AtomicReference atomicReference = this.f65503j;
        k0[] k0VarArr2 = (k0[]) atomicReference.get();
        k0[] k0VarArr3 = f65493s;
        if (k0VarArr2 != k0VarArr3 && (k0VarArr = (k0[]) atomicReference.getAndSet(k0VarArr3)) != k0VarArr3) {
            for (k0 k0Var : k0VarArr) {
                k0Var.dispose();
            }
            pk2.c cVar = this.f65501h;
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            if (b13 != null && b13 != pk2.h.f100547a) {
                lb.l0.R0(b13);
            }
        }
        if (getAndIncrement() != 0 || (hVar = this.f65499f) == null) {
            return;
        }
        hVar.clear();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65505l, cVar)) {
            this.f65505l = cVar;
            this.f65494a.d(this);
            if (this.f65502i) {
                return;
            }
            int i13 = this.f65497d;
            if (i13 == Integer.MAX_VALUE) {
                cVar.request(Long.MAX_VALUE);
            } else {
                cVar.request(i13);
            }
        }
    }

    public final void e() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0199, code lost:
    
        r24.f65508o = r3;
        r24.f65507n = r8[r3].f65476a;
        r3 = r16;
        r5 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gk2.l0.g():void");
    }

    public final dk2.h h() {
        dk2.h hVar = this.f65499f;
        if (hVar == null) {
            hVar = this.f65497d == Integer.MAX_VALUE ? new lk2.c(this.f65498e) : new lk2.b(this.f65497d);
            this.f65499f = hVar;
        }
        return hVar;
    }

    public final void i(k0 k0Var) {
        AtomicReference atomicReference;
        k0[] k0VarArr;
        k0[] k0VarArr2;
        do {
            atomicReference = this.f65503j;
            k0VarArr = (k0[]) atomicReference.get();
            int length = k0VarArr.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (k0VarArr[i13] == k0Var) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length == 1) {
                k0VarArr2 = f65492r;
            } else {
                k0[] k0VarArr3 = new k0[length - 1];
                System.arraycopy(k0VarArr, 0, k0VarArr3, 0, i13);
                System.arraycopy(k0VarArr, i13 + 1, k0VarArr3, i13, (length - i13) - 1);
                k0VarArr2 = k0VarArr3;
            }
        } while (!d7.g.A(atomicReference, k0VarArr, k0VarArr2));
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65500g) {
            lb.l0.R0(th3);
            return;
        }
        pk2.c cVar = this.f65501h;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        this.f65500g = true;
        if (!this.f65496c) {
            for (k0 k0Var : (k0[]) this.f65503j.getAndSet(f65493s)) {
                k0Var.getClass();
                ok2.g.cancel(k0Var);
            }
        }
        e();
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this.f65504k, j13);
            e();
        }
    }
}
