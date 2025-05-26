package jk2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class p1 extends AtomicReference implements uj2.v, xj2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final o1[] f76633e = new o1[0];

    /* renamed from: f, reason: collision with root package name */
    public static final o1[] f76634f = new o1[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f76636b;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f76638d;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f76635a = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f76637c = new AtomicReference();

    public p1(AtomicReference atomicReference) {
        this.f76636b = atomicReference;
        lazySet(f76633e);
    }

    @Override // uj2.v
    public final void a() {
        this.f76637c.lazySet(bk2.c.DISPOSED);
        for (o1 o1Var : (o1[]) getAndSet(f76634f)) {
            o1Var.f76619a.a();
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this.f76637c, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        for (o1 o1Var : (o1[]) get()) {
            o1Var.f76619a.c(obj);
        }
    }

    public final void d(o1 o1Var) {
        o1[] o1VarArr;
        o1[] o1VarArr2;
        do {
            o1VarArr = (o1[]) get();
            int length = o1VarArr.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (o1VarArr[i13] == o1Var) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            o1VarArr2 = f76633e;
            if (length != 1) {
                o1VarArr2 = new o1[length - 1];
                System.arraycopy(o1VarArr, 0, o1VarArr2, 0, i13);
                System.arraycopy(o1VarArr, i13 + 1, o1VarArr2, i13, (length - i13) - 1);
            }
        } while (!compareAndSet(o1VarArr, o1VarArr2));
    }

    @Override // xj2.c
    public final void dispose() {
        AtomicReference atomicReference;
        getAndSet(f76634f);
        do {
            atomicReference = this.f76636b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        bk2.c.dispose(this.f76637c);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == f76634f;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f76638d = th3;
        this.f76637c.lazySet(bk2.c.DISPOSED);
        for (o1 o1Var : (o1[]) getAndSet(f76634f)) {
            o1Var.f76619a.onError(th3);
        }
    }
}
