package gk2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class f3 extends AtomicInteger implements xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65408a;

    /* renamed from: b, reason: collision with root package name */
    public final g3[] f65409b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65410c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f65411d;

    /* renamed from: e, reason: collision with root package name */
    public final pk2.c f65412e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65413f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f65414g;

    /* renamed from: h, reason: collision with root package name */
    public final Object[] f65415h;

    public f3(int i13, int i14, ak2.f fVar, xp2.b bVar, boolean z13) {
        this.f65408a = bVar;
        this.f65410c = fVar;
        this.f65413f = z13;
        g3[] g3VarArr = new g3[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            g3VarArr[i15] = new g3(this, i14);
        }
        this.f65415h = new Object[i13];
        this.f65409b = g3VarArr;
        this.f65411d = new AtomicLong();
        this.f65412e = new pk2.c();
    }

    public final void a() {
        for (g3 g3Var : this.f65409b) {
            g3Var.getClass();
            ok2.g.cancel(g3Var);
        }
    }

    public final void b() {
        boolean z13;
        Object poll;
        boolean z14;
        if (getAndIncrement() != 0) {
            return;
        }
        xp2.b bVar = this.f65408a;
        g3[] g3VarArr = this.f65409b;
        int length = g3VarArr.length;
        Object[] objArr = this.f65415h;
        int i13 = 1;
        do {
            long j13 = this.f65411d.get();
            long j14 = 0;
            while (j13 != j14) {
                if (this.f65414g) {
                    return;
                }
                if (!this.f65413f && this.f65412e.get() != null) {
                    a();
                    pk2.c cVar = this.f65412e;
                    cVar.getClass();
                    bVar.onError(pk2.h.b(cVar));
                    return;
                }
                boolean z15 = false;
                for (int i14 = 0; i14 < length; i14++) {
                    g3 g3Var = g3VarArr[i14];
                    if (objArr[i14] == null) {
                        try {
                            z13 = g3Var.f65427f;
                            dk2.i iVar = g3Var.f65425d;
                            poll = iVar != null ? iVar.poll() : null;
                            z14 = poll == null;
                        } catch (Throwable th3) {
                            bp1.h.H(th3);
                            pk2.c cVar2 = this.f65412e;
                            cVar2.getClass();
                            pk2.h.a(cVar2, th3);
                            if (!this.f65413f) {
                                a();
                                pk2.c cVar3 = this.f65412e;
                                cVar3.getClass();
                                bVar.onError(pk2.h.b(cVar3));
                                return;
                            }
                        }
                        if (z13 && z14) {
                            a();
                            if (((Throwable) this.f65412e.get()) == null) {
                                bVar.a();
                                return;
                            }
                            pk2.c cVar4 = this.f65412e;
                            cVar4.getClass();
                            bVar.onError(pk2.h.b(cVar4));
                            return;
                        }
                        if (!z14) {
                            objArr[i14] = poll;
                        }
                        z15 = true;
                    }
                }
                if (z15) {
                    break;
                }
                try {
                    Object apply = this.f65410c.apply(objArr.clone());
                    ck2.i.b(apply, "The zipper returned a null value");
                    bVar.c(apply);
                    j14++;
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    a();
                    pk2.c cVar5 = this.f65412e;
                    cVar5.getClass();
                    pk2.h.a(cVar5, th4);
                    pk2.c cVar6 = this.f65412e;
                    cVar6.getClass();
                    bVar.onError(pk2.h.b(cVar6));
                    return;
                }
            }
            if (j13 == j14) {
                if (this.f65414g) {
                    return;
                }
                if (!this.f65413f && this.f65412e.get() != null) {
                    a();
                    pk2.c cVar7 = this.f65412e;
                    cVar7.getClass();
                    bVar.onError(pk2.h.b(cVar7));
                    return;
                }
                for (int i15 = 0; i15 < length; i15++) {
                    g3 g3Var2 = g3VarArr[i15];
                    if (objArr[i15] == null) {
                        try {
                            boolean z16 = g3Var2.f65427f;
                            dk2.i iVar2 = g3Var2.f65425d;
                            Object poll2 = iVar2 != null ? iVar2.poll() : null;
                            boolean z17 = poll2 == null;
                            if (z16 && z17) {
                                a();
                                if (((Throwable) this.f65412e.get()) == null) {
                                    bVar.a();
                                    return;
                                }
                                pk2.c cVar8 = this.f65412e;
                                cVar8.getClass();
                                bVar.onError(pk2.h.b(cVar8));
                                return;
                            }
                            if (!z17) {
                                objArr[i15] = poll2;
                            }
                        } catch (Throwable th5) {
                            bp1.h.H(th5);
                            pk2.c cVar9 = this.f65412e;
                            cVar9.getClass();
                            pk2.h.a(cVar9, th5);
                            if (!this.f65413f) {
                                a();
                                pk2.c cVar10 = this.f65412e;
                                cVar10.getClass();
                                bVar.onError(pk2.h.b(cVar10));
                                return;
                            }
                        }
                    }
                }
            }
            if (j14 != 0) {
                for (g3 g3Var3 : g3VarArr) {
                    g3Var3.request(j14);
                }
                if (j13 != Long.MAX_VALUE) {
                    this.f65411d.addAndGet(-j14);
                }
            }
            i13 = addAndGet(-i13);
        } while (i13 != 0);
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f65414g) {
            return;
        }
        this.f65414g = true;
        a();
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this.f65411d, j13);
            b();
        }
    }
}
