package ko2;

import ao2.m0;
import ho2.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f80315h = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f80316i = AtomicLongFieldUpdater.newUpdater(d.class, "controlState$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80317j = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final fi.b f80318k = new fi.b("NOT_IN_STACK", 4);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f80319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80320b;

    /* renamed from: c, reason: collision with root package name */
    public final long f80321c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f80322d;

    /* renamed from: e, reason: collision with root package name */
    public final g f80323e;

    /* renamed from: f, reason: collision with root package name */
    public final g f80324f;

    /* renamed from: g, reason: collision with root package name */
    public final t f80325g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public d(long j13, String str, int i13, int i14) {
        this.f80319a = i13;
        this.f80320b = i14;
        this.f80321c = j13;
        this.f80322d = str;
        if (i13 < 1) {
            throw new IllegalArgumentException(a.a.e("Core pool size ", i13, " should be at least 1").toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(a.a.f("Max pool size ", i14, " should be greater than or equals to core pool size ", i13).toString());
        }
        if (i14 > 2097150) {
            throw new IllegalArgumentException(a.a.e("Max pool size ", i14, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j13 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j13 + " must be positive").toString());
        }
        this.f80323e = new g();
        this.f80324f = new g();
        this.f80325g = new t((i13 + 1) * 2);
        this.controlState$volatile = i13 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void d(d dVar, Runnable runnable, boolean z13, int i13) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        dVar.c(runnable, false, z13);
    }

    public final int a() {
        synchronized (this.f80325g) {
            try {
                if (f80317j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f80316i;
                long j13 = atomicLongFieldUpdater.get(this);
                int i13 = (int) (j13 & 2097151);
                int i14 = i13 - ((int) ((j13 & 4398044413952L) >> 21));
                if (i14 < 0) {
                    i14 = 0;
                }
                if (i14 >= this.f80319a) {
                    return 0;
                }
                if (i13 >= this.f80320b) {
                    return 0;
                }
                int i15 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i15 <= 0 || this.f80325g.b(i15) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                b bVar = new b(this, i15);
                this.f80325g.c(i15, bVar);
                if (i15 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i16 = i14 + 1;
                bVar.start();
                return i16;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(Runnable runnable, boolean z13, boolean z14) {
        j kVar;
        c cVar;
        l.f80339f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof j) {
            kVar = (j) runnable;
            kVar.f80331a = nanoTime;
            kVar.f80332b = z13;
        } else {
            kVar = new k(nanoTime, runnable, z13);
        }
        boolean z15 = kVar.f80332b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f80316i;
        long addAndGet = z15 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        b bVar = currentThread instanceof b ? (b) currentThread : null;
        if (bVar == null || !Intrinsics.d(bVar.f80314h, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f80309c) != c.TERMINATED && (kVar.f80332b || cVar != c.BLOCKING)) {
            bVar.f80313g = true;
            n nVar = bVar.f80307a;
            if (z14) {
                kVar = nVar.a(kVar);
            } else {
                nVar.getClass();
                j jVar = (j) n.f80341b.getAndSet(nVar, kVar);
                kVar = jVar == null ? null : nVar.a(jVar);
            }
        }
        if (kVar != null) {
            if (!(kVar.f80332b ? this.f80324f.a(kVar) : this.f80323e.a(kVar))) {
                throw new RejectedExecutionException(a.a.p(new StringBuilder(), this.f80322d, " was terminated"));
            }
        }
        boolean z16 = z14 && bVar != null;
        if (z15) {
            if (z16 || h() || g(addAndGet)) {
                return;
            }
            h();
            return;
        }
        if (z16 || h() || g(atomicLongFieldUpdater.get(this))) {
            return;
        }
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        if (r1 == null) goto L44;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ko2.d.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, false, 6);
    }

    public final void f(b bVar, int i13, int i14) {
        while (true) {
            long j13 = f80315h.get(this);
            int i15 = (int) (2097151 & j13);
            long j14 = (2097152 + j13) & (-2097152);
            if (i15 == i13) {
                if (i14 == 0) {
                    Object d2 = bVar.d();
                    while (true) {
                        if (d2 == f80318k) {
                            i15 = -1;
                            break;
                        }
                        if (d2 == null) {
                            i15 = 0;
                            break;
                        }
                        b bVar2 = (b) d2;
                        int c13 = bVar2.c();
                        if (c13 != 0) {
                            i15 = c13;
                            break;
                        }
                        d2 = bVar2.d();
                    }
                } else {
                    i15 = i14;
                }
            }
            if (i15 >= 0) {
                if (f80315h.compareAndSet(this, j13, i15 | j14)) {
                    return;
                }
            }
        }
    }

    public final boolean g(long j13) {
        int i13 = ((int) (2097151 & j13)) - ((int) ((j13 & 4398044413952L) >> 21));
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = this.f80319a;
        if (i13 < i14) {
            int a13 = a();
            if (a13 == 1 && i14 > 1) {
                a();
            }
            if (a13 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        fi.b bVar;
        int i13;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f80315h;
            long j13 = atomicLongFieldUpdater.get(this);
            b bVar2 = (b) this.f80325g.b((int) (2097151 & j13));
            if (bVar2 == null) {
                bVar2 = null;
            } else {
                long j14 = (2097152 + j13) & (-2097152);
                Object d2 = bVar2.d();
                while (true) {
                    bVar = f80318k;
                    if (d2 == bVar) {
                        i13 = -1;
                        break;
                    }
                    if (d2 == null) {
                        i13 = 0;
                        break;
                    }
                    b bVar3 = (b) d2;
                    i13 = bVar3.c();
                    if (i13 != 0) {
                        break;
                    }
                    d2 = bVar3.d();
                }
                if (i13 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j13, j14 | i13)) {
                    bVar2.h(bVar);
                }
            }
            if (bVar2 == null) {
                return false;
            }
            if (b.f80306i.compareAndSet(bVar2, -1, 0)) {
                LockSupport.unpark(bVar2);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        t tVar = this.f80325g;
        int a13 = tVar.a();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 1; i18 < a13; i18++) {
            b bVar = (b) tVar.b(i18);
            if (bVar != null) {
                n nVar = bVar.f80307a;
                nVar.getClass();
                int i19 = n.f80341b.get(nVar) != null ? (n.f80342c.get(nVar) - n.f80343d.get(nVar)) + 1 : n.f80342c.get(nVar) - n.f80343d.get(nVar);
                int i23 = a.f80305a[bVar.f80309c.ordinal()];
                if (i23 == 1) {
                    i15++;
                } else if (i23 == 2) {
                    i14++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i19);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (i23 == 3) {
                    i13++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i19);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                } else if (i23 == 4) {
                    i16++;
                    if (i19 > 0) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(i19);
                        sb5.append('d');
                        arrayList.add(sb5.toString());
                    }
                } else {
                    if (i23 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i17++;
                }
            }
        }
        long j13 = f80316i.get(this);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f80322d);
        sb6.append('@');
        sb6.append(m0.y(this));
        sb6.append("[Pool Size {core = ");
        int i24 = this.f80319a;
        sb6.append(i24);
        sb6.append(", max = ");
        a.a.z(sb6, this.f80320b, "}, Worker States {CPU = ", i13, ", blocking = ");
        a.a.z(sb6, i14, ", parked = ", i15, ", dormant = ");
        a.a.z(sb6, i16, ", terminated = ", i17, "}, running workers queues = ");
        sb6.append(arrayList);
        sb6.append(", global CPU queue size = ");
        sb6.append(this.f80323e.b());
        sb6.append(", global blocking queue size = ");
        sb6.append(this.f80324f.b());
        sb6.append(", Control State {created workers= ");
        sb6.append((int) (2097151 & j13));
        sb6.append(", blocking tasks = ");
        sb6.append((int) ((4398044413952L & j13) >> 21));
        sb6.append(", CPUs acquired = ");
        sb6.append(i24 - ((int) ((j13 & 9223367638808264704L) >> 42)));
        sb6.append("}]");
        return sb6.toString();
    }
}
