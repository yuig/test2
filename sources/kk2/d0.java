package kk2;

import java.util.concurrent.atomic.AtomicInteger;
import lb.l0;

/* loaded from: classes2.dex */
public final class d0 extends AtomicInteger implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79928a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f79929b;

    /* renamed from: c, reason: collision with root package name */
    public final e0[] f79930c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f79931d;

    public d0(uj2.d0 d0Var, int i13, ak2.f fVar) {
        super(i13);
        this.f79928a = d0Var;
        this.f79929b = fVar;
        e0[] e0VarArr = new e0[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            e0VarArr[i14] = new e0(this, i14);
        }
        this.f79930c = e0VarArr;
        this.f79931d = new Object[i13];
    }

    public final void a(int i13, Throwable th3) {
        if (getAndSet(0) <= 0) {
            l0.R0(th3);
            return;
        }
        e0[] e0VarArr = this.f79930c;
        int length = e0VarArr.length;
        for (int i14 = 0; i14 < i13; i14++) {
            e0 e0Var = e0VarArr[i14];
            e0Var.getClass();
            bk2.c.dispose(e0Var);
        }
        while (true) {
            i13++;
            if (i13 >= length) {
                this.f79928a.onError(th3);
                return;
            } else {
                e0 e0Var2 = e0VarArr[i13];
                e0Var2.getClass();
                bk2.c.dispose(e0Var2);
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (e0 e0Var : this.f79930c) {
                e0Var.getClass();
                bk2.c.dispose(e0Var);
            }
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() <= 0;
    }
}
