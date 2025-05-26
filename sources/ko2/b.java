package ko2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class b extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80306i = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final n f80307a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f80308b;

    /* renamed from: c, reason: collision with root package name */
    public c f80309c;

    /* renamed from: d, reason: collision with root package name */
    public long f80310d;

    /* renamed from: e, reason: collision with root package name */
    public long f80311e;

    /* renamed from: f, reason: collision with root package name */
    public int f80312f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f80313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f80314h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public b(d dVar, int i13) {
        this.f80314h = dVar;
        setDaemon(true);
        setContextClassLoader(dVar.getClass().getClassLoader());
        this.f80307a = new n();
        this.f80308b = new j0();
        this.f80309c = c.DORMANT;
        this.nextParkedWorker = d.f80318k;
        int nanoTime = (int) System.nanoTime();
        this.f80312f = nanoTime == 0 ? 42 : nanoTime;
        g(i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ko2.j a() {
        /*
            r6 = this;
            ko2.n r0 = r6.f80307a
            r0.getClass()
        L5:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = ko2.n.f80341b
            java.lang.Object r2 = r1.get(r0)
            ko2.j r2 = (ko2.j) r2
            r3 = 1
            if (r2 != 0) goto L11
            goto L1c
        L11:
            boolean r4 = r2.f80332b
            if (r4 != r3) goto L1c
            boolean r1 = jq.b.C(r1, r0, r2)
            if (r1 == 0) goto L5
            goto L3e
        L1c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = ko2.n.f80343d
            int r1 = r1.get(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = ko2.n.f80342c
            int r2 = r2.get(r0)
        L28:
            r4 = 0
            if (r1 == r2) goto L33
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = ko2.n.f80344e
            int r5 = r5.get(r0)
            if (r5 != 0) goto L35
        L33:
            r2 = r4
            goto L3e
        L35:
            int r2 = r2 + (-1)
            ko2.j r4 = r0.f(r2, r3)
            if (r4 == 0) goto L28
            goto L33
        L3e:
            if (r2 != 0) goto L51
            ko2.d r0 = r6.f80314h
            ko2.g r0 = r0.f80324f
            java.lang.Object r0 = r0.c()
            r2 = r0
            ko2.j r2 = (ko2.j) r2
            if (r2 != 0) goto L51
            ko2.j r2 = r6.j(r3)
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ko2.b.a():ko2.j");
    }

    public final j b(boolean z13) {
        j f13;
        j f14;
        d dVar;
        long j13;
        if (this.f80309c != c.CPU_ACQUIRED) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d.f80316i;
            do {
                dVar = this.f80314h;
                j13 = atomicLongFieldUpdater.get(dVar);
                if (((int) ((9223367638808264704L & j13) >> 42)) == 0) {
                    return a();
                }
            } while (!d.f80316i.compareAndSet(dVar, j13, j13 - 4398046511104L));
            this.f80309c = c.CPU_ACQUIRED;
        }
        if (z13) {
            boolean z14 = e(this.f80314h.f80319a * 2) == 0;
            if (z14 && (f14 = f()) != null) {
                return f14;
            }
            n nVar = this.f80307a;
            nVar.getClass();
            j jVar = (j) n.f80341b.getAndSet(nVar, null);
            j d2 = jVar == null ? nVar.d() : jVar;
            if (d2 != null) {
                return d2;
            }
            if (!z14 && (f13 = f()) != null) {
                return f13;
            }
        } else {
            j f15 = f();
            if (f15 != null) {
                return f15;
            }
        }
        return j(3);
    }

    public final int c() {
        return this.indexInArray;
    }

    public final Object d() {
        return this.nextParkedWorker;
    }

    public final int e(int i13) {
        int i14 = this.f80312f;
        int i15 = i14 ^ (i14 << 13);
        int i16 = i15 ^ (i15 >> 17);
        int i17 = i16 ^ (i16 << 5);
        this.f80312f = i17;
        int i18 = i13 - 1;
        return (i18 & i13) == 0 ? i17 & i18 : (i17 & Integer.MAX_VALUE) % i13;
    }

    public final j f() {
        int e13 = e(2);
        d dVar = this.f80314h;
        if (e13 == 0) {
            j jVar = (j) dVar.f80323e.c();
            return jVar != null ? jVar : (j) dVar.f80324f.c();
        }
        j jVar2 = (j) dVar.f80324f.c();
        return jVar2 != null ? jVar2 : (j) dVar.f80323e.c();
    }

    public final void g(int i13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f80314h.f80322d);
        sb3.append("-worker-");
        sb3.append(i13 == 0 ? "TERMINATED" : String.valueOf(i13));
        setName(sb3.toString());
        this.indexInArray = i13;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(c cVar) {
        c cVar2 = this.f80309c;
        boolean z13 = cVar2 == c.CPU_ACQUIRED;
        if (z13) {
            d.f80316i.addAndGet(this.f80314h, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.f80309c = cVar;
        }
        return z13;
    }

    public final j j(int i13) {
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d.f80316i;
        d dVar = this.f80314h;
        int i14 = (int) (atomicLongFieldUpdater.get(dVar) & 2097151);
        if (i14 < 2) {
            return null;
        }
        int e13 = e(i14);
        long j15 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < i14; i15++) {
            e13++;
            if (e13 > i14) {
                e13 = 1;
            }
            b bVar = (b) dVar.f80325g.b(e13);
            if (bVar != null && bVar != this) {
                n nVar = bVar.f80307a;
                j d2 = i13 == 3 ? nVar.d() : nVar.e(i13);
                j0 j0Var = this.f80308b;
                if (d2 != null) {
                    j0Var.f80434a = d2;
                    j14 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f80341b;
                        j jVar = (j) atomicReferenceFieldUpdater.get(nVar);
                        j13 = -2;
                        if (jVar == null) {
                            break;
                        }
                        if (((jVar.f80332b ? 1 : 2) & i13) != 0) {
                            l.f80339f.getClass();
                            long nanoTime = System.nanoTime() - jVar.f80331a;
                            long j16 = l.f80335b;
                            if (nanoTime >= j16) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(nVar, jVar, null)) {
                                    if (atomicReferenceFieldUpdater.get(nVar) != jVar) {
                                        break;
                                    }
                                }
                                j0Var.f80434a = jVar;
                                j13 = -1;
                                break;
                            }
                            j13 = j16 - nanoTime;
                            break;
                        }
                        break;
                    }
                    j14 = j13;
                }
                if (j14 == -1) {
                    j jVar2 = (j) j0Var.f80434a;
                    j0Var.f80434a = null;
                    return jVar2;
                }
                if (j14 > 0) {
                    j15 = Math.min(j15, j14);
                }
            }
        }
        if (j15 == Long.MAX_VALUE) {
            j15 = 0;
        }
        this.f80311e = j15;
        return null;
    }

    public final void k() {
        d dVar = this.f80314h;
        synchronized (dVar.f80325g) {
            try {
                if (d.f80317j.get(dVar) != 0) {
                    return;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = d.f80316i;
                if (((int) (atomicLongFieldUpdater.get(dVar) & 2097151)) <= dVar.f80319a) {
                    return;
                }
                if (f80306i.compareAndSet(this, -1, 1)) {
                    int i13 = this.indexInArray;
                    g(0);
                    dVar.f(this, i13, 0);
                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(dVar) & 2097151);
                    if (andDecrement != i13) {
                        Object b13 = dVar.f80325g.b(andDecrement);
                        Intrinsics.f(b13);
                        b bVar = (b) b13;
                        dVar.f80325g.c(i13, bVar);
                        bVar.g(i13);
                        dVar.f(bVar, andDecrement, i13);
                    }
                    dVar.f80325g.c(andDecrement, null);
                    Unit unit = Unit.f80348a;
                    this.f80309c = c.TERMINATED;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        int i13;
        loop0: while (true) {
            boolean z13 = false;
            while (true) {
                d dVar = this.f80314h;
                dVar.getClass();
                if (d.f80317j.get(dVar) == 0) {
                    c cVar = this.f80309c;
                    c cVar2 = c.TERMINATED;
                    if (cVar == cVar2) {
                        break loop0;
                    }
                    j b13 = b(this.f80313g);
                    if (b13 != null) {
                        this.f80311e = 0L;
                        this.f80310d = 0L;
                        if (this.f80309c == c.PARKING) {
                            this.f80309c = c.BLOCKING;
                        }
                        if (b13.f80332b) {
                            if (i(c.BLOCKING) && !dVar.h() && !dVar.g(d.f80316i.get(dVar))) {
                                dVar.h();
                            }
                            try {
                                b13.run();
                            } catch (Throwable th3) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th3);
                            }
                            d.f80316i.addAndGet(dVar, -2097152L);
                            if (this.f80309c != cVar2) {
                                this.f80309c = c.DORMANT;
                            }
                        } else {
                            try {
                                b13.run();
                            } catch (Throwable th4) {
                                Thread currentThread2 = Thread.currentThread();
                                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th4);
                            }
                        }
                    } else {
                        this.f80313g = false;
                        if (this.f80311e == 0) {
                            Object obj = this.nextParkedWorker;
                            fi.b bVar = d.f80318k;
                            if (obj != bVar) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80306i;
                                atomicIntegerFieldUpdater.set(this, -1);
                                while (this.nextParkedWorker != d.f80318k && atomicIntegerFieldUpdater.get(this) == -1 && d.f80317j.get(dVar) == 0 && this.f80309c != c.TERMINATED) {
                                    i(c.PARKING);
                                    Thread.interrupted();
                                    long j14 = this.f80310d;
                                    long j15 = dVar.f80321c;
                                    if (j14 == 0) {
                                        this.f80310d = System.nanoTime() + j15;
                                    }
                                    LockSupport.parkNanos(j15);
                                    if (System.nanoTime() - this.f80310d >= 0) {
                                        this.f80310d = 0L;
                                        k();
                                    }
                                }
                            } else if (this.nextParkedWorker == bVar) {
                                do {
                                    atomicLongFieldUpdater = d.f80315h;
                                    j13 = atomicLongFieldUpdater.get(dVar);
                                    i13 = this.indexInArray;
                                    this.nextParkedWorker = dVar.f80325g.b((int) (2097151 & j13));
                                } while (!atomicLongFieldUpdater.compareAndSet(dVar, j13, ((2097152 + j13) & (-2097152)) | i13));
                            }
                        } else {
                            if (z13) {
                                i(c.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f80311e);
                                this.f80311e = 0L;
                                break;
                            }
                            z13 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        i(c.TERMINATED);
    }
}
