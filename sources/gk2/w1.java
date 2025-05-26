package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class w1 extends AtomicInteger implements uj2.k, xj2.c {

    /* renamed from: k, reason: collision with root package name */
    public static final v1[] f65675k = new v1[0];

    /* renamed from: l, reason: collision with root package name */
    public static final v1[] f65676l = new v1[0];

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f65677a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f65678b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f65679c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f65680d = new AtomicReference(f65675k);

    /* renamed from: e, reason: collision with root package name */
    public final int f65681e;

    /* renamed from: f, reason: collision with root package name */
    public volatile dk2.i f65682f;

    /* renamed from: g, reason: collision with root package name */
    public int f65683g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f65684h;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f65685i;

    /* renamed from: j, reason: collision with root package name */
    public int f65686j;

    public w1(AtomicReference atomicReference, int i13) {
        this.f65677a = atomicReference;
        this.f65681e = i13;
    }

    @Override // xp2.b
    public final void a() {
        this.f65684h = true;
        e();
    }

    public final boolean b(boolean z13, boolean z14) {
        if (!z13 || !z14) {
            return false;
        }
        Throwable th3 = this.f65685i;
        if (th3 != null) {
            h(th3);
            return true;
        }
        for (v1 v1Var : (v1[]) this.f65680d.getAndSet(f65676l)) {
            if (!v1Var.a()) {
                v1Var.f65661a.a();
            }
        }
        return true;
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65683g != 0 || this.f65682f.offer(obj)) {
            e();
        } else {
            onError(new MissingBackpressureException("Prefetch queue is full?!"));
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.setOnce(this.f65678b, cVar)) {
            if (cVar instanceof dk2.f) {
                dk2.f fVar = (dk2.f) cVar;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f65683g = requestFusion;
                    this.f65682f = fVar;
                    this.f65684h = true;
                    e();
                    return;
                }
                if (requestFusion == 2) {
                    this.f65683g = requestFusion;
                    this.f65682f = fVar;
                    cVar.request(this.f65681e);
                    return;
                }
            }
            this.f65682f = new lk2.b(this.f65681e);
            cVar.request(this.f65681e);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        AtomicReference atomicReference;
        this.f65680d.getAndSet(f65676l);
        do {
            atomicReference = this.f65677a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        ok2.g.cancel(this.f65678b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        dk2.i iVar = this.f65682f;
        int i13 = this.f65686j;
        int i14 = this.f65681e;
        int i15 = i14 - (i14 >> 2);
        boolean z13 = this.f65683g != 1;
        int i16 = 1;
        dk2.i iVar2 = iVar;
        int i17 = i13;
        while (true) {
            if (iVar2 != null) {
                v1[] v1VarArr = (v1[]) this.f65680d.get();
                long j13 = Long.MAX_VALUE;
                boolean z14 = false;
                for (v1 v1Var : v1VarArr) {
                    long j14 = v1Var.get();
                    if (j14 != Long.MIN_VALUE) {
                        j13 = Math.min(j14 - v1Var.f65663c, j13);
                        z14 = true;
                    }
                }
                if (!z14) {
                    j13 = 0;
                }
                for (long j15 = 0; j13 != j15; j15 = 0) {
                    boolean z15 = this.f65684h;
                    try {
                        Object poll = iVar2.poll();
                        boolean z16 = poll == null;
                        if (b(z15, z16)) {
                            return;
                        }
                        if (z16) {
                            break;
                        }
                        for (v1 v1Var2 : v1VarArr) {
                            if (!v1Var2.a()) {
                                v1Var2.f65661a.c(poll);
                                v1Var2.f65663c++;
                            }
                        }
                        if (z13 && (i17 = i17 + 1) == i15) {
                            ((xp2.c) this.f65678b.get()).request(i15);
                            i17 = 0;
                        }
                        j13--;
                        if (v1VarArr != this.f65680d.get()) {
                            break;
                        }
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        ((xp2.c) this.f65678b.get()).cancel();
                        iVar2.clear();
                        this.f65684h = true;
                        h(th3);
                        return;
                    }
                }
                if (b(this.f65684h, iVar2.isEmpty())) {
                    return;
                }
            }
            this.f65686j = i17;
            i16 = addAndGet(-i16);
            if (i16 == 0) {
                return;
            }
            if (iVar2 == null) {
                iVar2 = this.f65682f;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(v1 v1Var) {
        v1[] v1VarArr;
        while (true) {
            AtomicReference atomicReference = this.f65680d;
            v1[] v1VarArr2 = (v1[]) atomicReference.get();
            int length = v1VarArr2.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (v1VarArr2[i13] == v1Var) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length == 1) {
                v1VarArr = f65675k;
            } else {
                v1[] v1VarArr3 = new v1[length - 1];
                System.arraycopy(v1VarArr2, 0, v1VarArr3, 0, i13);
                System.arraycopy(v1VarArr2, i13 + 1, v1VarArr3, i13, (length - i13) - 1);
                v1VarArr = v1VarArr3;
            }
            while (!atomicReference.compareAndSet(v1VarArr2, v1VarArr)) {
                if (atomicReference.get() != v1VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    public final void h(Throwable th3) {
        for (v1 v1Var : (v1[]) this.f65680d.getAndSet(f65676l)) {
            if (!v1Var.a()) {
                v1Var.f65661a.onError(th3);
            }
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f65680d.get() == f65676l;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65684h) {
            lb.l0.R0(th3);
            return;
        }
        this.f65685i = th3;
        this.f65684h = true;
        e();
    }
}
