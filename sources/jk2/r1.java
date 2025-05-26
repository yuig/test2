package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r1 extends AtomicReference implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76675a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.v f76676b;

    /* renamed from: c, reason: collision with root package name */
    public Object f76677c;

    public r1(uj2.v vVar, int i13) {
        this.f76675a = i13;
        if (i13 != 1) {
            this.f76676b = vVar;
        } else {
            this.f76676b = vVar;
            this.f76677c = new AtomicReference();
        }
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f76675a;
        uj2.v vVar = this.f76676b;
        switch (i13) {
            case 0:
                bk2.c.dispose(this);
                vVar.a();
                break;
            default:
                vVar.a();
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        switch (this.f76675a) {
            case 0:
                if (bk2.c.validate((xj2.c) this.f76677c, cVar)) {
                    this.f76677c = cVar;
                    this.f76676b.b(this);
                    break;
                }
                break;
            default:
                bk2.c.setOnce((AtomicReference) this.f76677c, cVar);
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f76675a;
        uj2.v vVar = this.f76676b;
        switch (i13) {
            case 0:
                vVar.c(obj);
                break;
            default:
                vVar.c(obj);
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f76675a) {
            case 0:
                ((xj2.c) this.f76677c).dispose();
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose((AtomicReference) this.f76677c);
                bk2.c.dispose(this);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f76675a) {
            case 0:
                return ((xj2.c) this.f76677c).isDisposed();
            default:
                return bk2.c.isDisposed((xj2.c) get());
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f76675a;
        uj2.v vVar = this.f76676b;
        switch (i13) {
            case 0:
                bk2.c.dispose(this);
                vVar.onError(th3);
                break;
            default:
                vVar.onError(th3);
                break;
        }
    }
}
