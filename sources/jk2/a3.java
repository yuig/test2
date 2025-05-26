package jk2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class a3 extends AtomicInteger implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76389a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76390b;

    /* renamed from: c, reason: collision with root package name */
    public final b3[] f76391c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f76392d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76393e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f76394f;

    public a3(int i13, uj2.v vVar, ak2.f fVar, boolean z13) {
        this.f76389a = vVar;
        this.f76390b = fVar;
        this.f76391c = new b3[i13];
        this.f76392d = new Object[i13];
        this.f76393e = z13;
    }

    public final void a() {
        b3[] b3VarArr = this.f76391c;
        for (b3 b3Var : b3VarArr) {
            b3Var.f76414b.clear();
        }
        for (b3 b3Var2 : b3VarArr) {
            bk2.c.dispose(b3Var2.f76417e);
        }
    }

    public final void b() {
        Throwable th3;
        if (getAndIncrement() != 0) {
            return;
        }
        b3[] b3VarArr = this.f76391c;
        uj2.v vVar = this.f76389a;
        Object[] objArr = this.f76392d;
        boolean z13 = this.f76393e;
        int i13 = 1;
        while (true) {
            int i14 = 0;
            int i15 = 0;
            for (b3 b3Var : b3VarArr) {
                if (objArr[i15] == null) {
                    boolean z14 = b3Var.f76415c;
                    Object poll = b3Var.f76414b.poll();
                    boolean z15 = poll == null;
                    if (this.f76394f) {
                        a();
                        return;
                    }
                    if (z14) {
                        if (!z13) {
                            Throwable th4 = b3Var.f76416d;
                            if (th4 != null) {
                                this.f76394f = true;
                                a();
                                vVar.onError(th4);
                                return;
                            } else if (z15) {
                                this.f76394f = true;
                                a();
                                vVar.a();
                                return;
                            }
                        } else if (z15) {
                            Throwable th5 = b3Var.f76416d;
                            this.f76394f = true;
                            a();
                            if (th5 != null) {
                                vVar.onError(th5);
                                return;
                            } else {
                                vVar.a();
                                return;
                            }
                        }
                    }
                    if (z15) {
                        i14++;
                    } else {
                        objArr[i15] = poll;
                    }
                } else if (b3Var.f76415c && !z13 && (th3 = b3Var.f76416d) != null) {
                    this.f76394f = true;
                    a();
                    vVar.onError(th3);
                    return;
                }
                i15++;
            }
            if (i14 != 0) {
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            } else {
                try {
                    Object apply = this.f76390b.apply(objArr.clone());
                    ck2.i.b(apply, "The zipper returned a null value");
                    vVar.c(apply);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th6) {
                    bp1.h.H(th6);
                    a();
                    vVar.onError(th6);
                    return;
                }
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f76394f) {
            return;
        }
        this.f76394f = true;
        for (b3 b3Var : this.f76391c) {
            bk2.c.dispose(b3Var.f76417e);
        }
        if (getAndIncrement() == 0) {
            for (b3 b3Var2 : this.f76391c) {
                b3Var2.f76414b.clear();
            }
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76394f;
    }
}
