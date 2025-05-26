package hk2;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import uj2.f0;

/* loaded from: classes2.dex */
public final class m extends AtomicReference implements uj2.m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69422a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69423b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69424c;

    public m(uj2.m mVar) {
        this.f69422a = 1;
        this.f69424c = mVar;
        this.f69423b = new bk2.a();
    }

    @Override // uj2.m
    public final void a() {
        switch (this.f69422a) {
            case 0:
                ((uj2.d0) this.f69423b).onError(new NoSuchElementException());
                break;
            default:
                ((uj2.m) this.f69424c).a();
                break;
        }
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        switch (this.f69422a) {
            case 0:
                if (bk2.c.setOnce(this, cVar)) {
                    ((uj2.d0) this.f69423b).b(this);
                    break;
                }
                break;
            default:
                bk2.c.setOnce(this, cVar);
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f69422a) {
            case 0:
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose(this);
                ((bk2.a) this.f69423b).dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f69422a) {
        }
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        switch (this.f69422a) {
            case 0:
                ((uj2.d0) this.f69423b).onError(th3);
                break;
            default:
                ((uj2.m) this.f69424c).onError(th3);
                break;
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        int i13 = this.f69422a;
        Object obj2 = this.f69424c;
        switch (i13) {
            case 0:
                try {
                    Object apply = ((ak2.f) obj2).apply(obj);
                    ck2.i.b(apply, "The mapper returned a null SingleSource");
                    f0 f0Var = (f0) apply;
                    if (!isDisposed()) {
                        ((uj2.b0) f0Var).p(new n(this, (uj2.d0) this.f69423b));
                        break;
                    }
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    onError(th3);
                    return;
                }
                break;
            default:
                ((uj2.m) obj2).onSuccess(obj);
                break;
        }
    }

    public m(uj2.d0 d0Var, ak2.f fVar) {
        this.f69422a = 0;
        this.f69423b = d0Var;
        this.f69424c = fVar;
    }
}
