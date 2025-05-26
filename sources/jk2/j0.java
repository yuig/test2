package jk2;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class j0 extends AtomicInteger implements xj2.c, uj2.v {

    /* renamed from: q, reason: collision with root package name */
    public static final i0[] f76519q = new i0[0];

    /* renamed from: r, reason: collision with root package name */
    public static final i0[] f76520r = new i0[0];

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76521a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76522b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f76523c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76524d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76525e;

    /* renamed from: f, reason: collision with root package name */
    public volatile dk2.h f76526f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f76527g;

    /* renamed from: h, reason: collision with root package name */
    public final pk2.c f76528h = new pk2.c();

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f76529i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f76530j;

    /* renamed from: k, reason: collision with root package name */
    public xj2.c f76531k;

    /* renamed from: l, reason: collision with root package name */
    public long f76532l;

    /* renamed from: m, reason: collision with root package name */
    public long f76533m;

    /* renamed from: n, reason: collision with root package name */
    public int f76534n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f76535o;

    /* renamed from: p, reason: collision with root package name */
    public int f76536p;

    public j0(int i13, int i14, uj2.v vVar, ak2.f fVar, boolean z13) {
        this.f76521a = vVar;
        this.f76522b = fVar;
        this.f76523c = z13;
        this.f76524d = i13;
        this.f76525e = i14;
        if (i13 != Integer.MAX_VALUE) {
            this.f76535o = new ArrayDeque(i13);
        }
        this.f76530j = new AtomicReference(f76519q);
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76527g) {
            return;
        }
        this.f76527g = true;
        f();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76531k, cVar)) {
            this.f76531k = cVar;
            this.f76521a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76527g) {
            return;
        }
        try {
            Object apply = this.f76522b.apply(obj);
            ck2.i.b(apply, "The mapper returned a null ObservableSource");
            uj2.t tVar = (uj2.t) apply;
            if (this.f76524d != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i13 = this.f76536p;
                        if (i13 == this.f76524d) {
                            this.f76535o.offer(tVar);
                            return;
                        }
                        this.f76536p = i13 + 1;
                    } finally {
                    }
                }
            }
            i(tVar);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f76531k.dispose();
            onError(th3);
        }
    }

    public final boolean d() {
        if (this.f76529i) {
            return true;
        }
        Throwable th3 = (Throwable) this.f76528h.get();
        if (this.f76523c || th3 == null) {
            return false;
        }
        e();
        pk2.c cVar = this.f76528h;
        cVar.getClass();
        Throwable b13 = pk2.h.b(cVar);
        if (b13 != pk2.h.f100547a) {
            this.f76521a.onError(b13);
        }
        return true;
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f76529i) {
            return;
        }
        this.f76529i = true;
        if (e()) {
            pk2.c cVar = this.f76528h;
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            if (b13 == null || b13 == pk2.h.f100547a) {
                return;
            }
            lb.l0.R0(b13);
        }
    }

    public final boolean e() {
        i0[] i0VarArr;
        this.f76531k.dispose();
        AtomicReference atomicReference = this.f76530j;
        i0[] i0VarArr2 = (i0[]) atomicReference.get();
        i0[] i0VarArr3 = f76520r;
        if (i0VarArr2 == i0VarArr3 || (i0VarArr = (i0[]) atomicReference.getAndSet(i0VarArr3)) == i0VarArr3) {
            return false;
        }
        for (i0 i0Var : i0VarArr) {
            i0Var.getClass();
            bk2.c.dispose(i0Var);
        }
        return true;
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    public final void g() {
        int i13;
        int i14;
        uj2.v vVar = this.f76521a;
        int i15 = 1;
        while (!d()) {
            dk2.h hVar = this.f76526f;
            int i16 = 0;
            if (hVar != null) {
                while (!d()) {
                    Object poll = hVar.poll();
                    if (poll != null) {
                        vVar.c(poll);
                        i16++;
                    }
                }
                return;
            }
            if (i16 == 0) {
                boolean z13 = this.f76527g;
                dk2.h hVar2 = this.f76526f;
                i0[] i0VarArr = (i0[]) this.f76530j.get();
                int length = i0VarArr.length;
                if (this.f76524d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i13 = this.f76535o.size();
                    }
                } else {
                    i13 = 0;
                }
                if (z13 && ((hVar2 == null || hVar2.isEmpty()) && length == 0 && i13 == 0)) {
                    pk2.c cVar = this.f76528h;
                    cVar.getClass();
                    Throwable b13 = pk2.h.b(cVar);
                    if (b13 != pk2.h.f100547a) {
                        if (b13 == null) {
                            vVar.a();
                            return;
                        } else {
                            vVar.onError(b13);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j13 = this.f76533m;
                    int i17 = this.f76534n;
                    if (length <= i17 || i0VarArr[i17].f76499a != j13) {
                        if (length <= i17) {
                            i17 = 0;
                        }
                        for (int i18 = 0; i18 < length && i0VarArr[i17].f76499a != j13; i18++) {
                            i17++;
                            if (i17 == length) {
                                i17 = 0;
                            }
                        }
                        this.f76534n = i17;
                        this.f76533m = i0VarArr[i17].f76499a;
                    }
                    for (0; i14 < length; i14 + 1) {
                        if (d()) {
                            return;
                        }
                        i0 i0Var = i0VarArr[i17];
                        dk2.i iVar = i0Var.f76502d;
                        if (iVar != null) {
                            do {
                                try {
                                    Object poll2 = iVar.poll();
                                    if (poll2 != null) {
                                        vVar.c(poll2);
                                    }
                                } catch (Throwable th3) {
                                    bp1.h.H(th3);
                                    i0Var.d();
                                    pk2.c cVar2 = this.f76528h;
                                    cVar2.getClass();
                                    pk2.h.a(cVar2, th3);
                                    if (d()) {
                                        return;
                                    }
                                    h(i0Var);
                                    i16++;
                                    i17++;
                                    if (i17 != length) {
                                    }
                                }
                            } while (!d());
                            return;
                        }
                        boolean z14 = i0Var.f76501c;
                        dk2.i iVar2 = i0Var.f76502d;
                        if (z14 && (iVar2 == null || iVar2.isEmpty())) {
                            h(i0Var);
                            if (d()) {
                                return;
                            } else {
                                i16++;
                            }
                        }
                        i17++;
                        i14 = i17 != length ? i14 + 1 : 0;
                        i17 = 0;
                    }
                    this.f76534n = i17;
                    this.f76533m = i0VarArr[i17].f76499a;
                }
                if (i16 == 0) {
                    i15 = addAndGet(-i15);
                    if (i15 == 0) {
                        return;
                    }
                } else if (this.f76524d != Integer.MAX_VALUE) {
                    j(i16);
                }
            } else if (this.f76524d != Integer.MAX_VALUE) {
                j(i16);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(i0 i0Var) {
        i0[] i0VarArr;
        while (true) {
            AtomicReference atomicReference = this.f76530j;
            i0[] i0VarArr2 = (i0[]) atomicReference.get();
            int length = i0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (i0VarArr2[i13] == i0Var) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length == 1) {
                i0VarArr = f76519q;
            } else {
                i0[] i0VarArr3 = new i0[length - 1];
                System.arraycopy(i0VarArr2, 0, i0VarArr3, 0, i13);
                System.arraycopy(i0VarArr2, i13 + 1, i0VarArr3, i13, (length - i13) - 1);
                i0VarArr = i0VarArr3;
            }
            while (!atomicReference.compareAndSet(i0VarArr2, i0VarArr)) {
                if (atomicReference.get() != i0VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(uj2.t tVar) {
        boolean z13;
        do {
            z13 = false;
            if (!(tVar instanceof Callable)) {
                long j13 = this.f76532l;
                this.f76532l = 1 + j13;
                i0 i0Var = new i0(this, j13);
                while (true) {
                    AtomicReference atomicReference = this.f76530j;
                    i0[] i0VarArr = (i0[]) atomicReference.get();
                    if (i0VarArr == f76520r) {
                        i0Var.d();
                        return;
                    }
                    int length = i0VarArr.length;
                    i0[] i0VarArr2 = new i0[length + 1];
                    System.arraycopy(i0VarArr, 0, i0VarArr2, 0, length);
                    i0VarArr2[length] = i0Var;
                    while (!atomicReference.compareAndSet(i0VarArr, i0VarArr2)) {
                        if (atomicReference.get() != i0VarArr) {
                            break;
                        }
                    }
                    tVar.d(i0Var);
                    return;
                }
            }
            if (!k((Callable) tVar) || this.f76524d == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    tVar = (uj2.t) this.f76535o.poll();
                    if (tVar == null) {
                        z13 = true;
                        this.f76536p--;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (!z13);
        f();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76529i;
    }

    public final void j(int i13) {
        while (true) {
            int i14 = i13 - 1;
            if (i13 == 0) {
                return;
            }
            synchronized (this) {
                try {
                    uj2.t tVar = (uj2.t) this.f76535o.poll();
                    if (tVar == null) {
                        this.f76536p--;
                    } else {
                        i(tVar);
                    }
                } finally {
                }
            }
            i13 = i14;
        }
    }

    public final boolean k(Callable callable) {
        try {
            Object call = callable.call();
            if (call == null) {
                return true;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f76521a.c(call);
                if (decrementAndGet() == 0) {
                    return true;
                }
            } else {
                dk2.h hVar = this.f76526f;
                if (hVar == null) {
                    hVar = this.f76524d == Integer.MAX_VALUE ? new lk2.c(this.f76525e) : new lk2.b(this.f76524d);
                    this.f76526f = hVar;
                }
                if (!hVar.offer(call)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return true;
                }
                if (getAndIncrement() != 0) {
                    return false;
                }
            }
            g();
            return true;
        } catch (Throwable th3) {
            bp1.h.H(th3);
            pk2.c cVar = this.f76528h;
            cVar.getClass();
            pk2.h.a(cVar, th3);
            f();
            return true;
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76527g) {
            lb.l0.R0(th3);
            return;
        }
        pk2.c cVar = this.f76528h;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
        } else {
            this.f76527g = true;
            f();
        }
    }
}
