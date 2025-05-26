package hk2;

import io.reactivex.exceptions.CompositeException;
import lb.l0;

/* loaded from: classes2.dex */
public final class g implements uj2.m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69406a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.m f69407b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f69408c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f69409d;

    public /* synthetic */ g(uj2.m mVar, Object obj, int i13) {
        this.f69406a = i13;
        this.f69407b = mVar;
        this.f69409d = obj;
    }

    @Override // uj2.m
    public final void a() {
        int i13 = this.f69406a;
        uj2.m mVar = this.f69407b;
        switch (i13) {
            case 0:
                mVar.a();
                break;
            case 1:
                mVar.a();
                break;
            default:
                xj2.c cVar = this.f69408c;
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (cVar != cVar2) {
                    try {
                        ((z) this.f69409d).f69453e.run();
                        this.f69408c = cVar2;
                        mVar.a();
                        c();
                        break;
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        d(th3);
                    }
                }
                break;
        }
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        int i13 = this.f69406a;
        uj2.m mVar = this.f69407b;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f69408c, cVar)) {
                    this.f69408c = cVar;
                    mVar.b(this);
                    break;
                }
                break;
            case 1:
                if (bk2.c.validate(this.f69408c, cVar)) {
                    this.f69408c = cVar;
                    mVar.b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f69408c, cVar)) {
                    try {
                        ((z) this.f69409d).f69450b.accept(cVar);
                        this.f69408c = cVar;
                        mVar.b(this);
                        break;
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        cVar.dispose();
                        this.f69408c = bk2.c.DISPOSED;
                        bk2.d.error(th3, mVar);
                    }
                }
                break;
        }
    }

    public final void c() {
        try {
            ((z) this.f69409d).getClass();
        } catch (Throwable th3) {
            bp1.h.H(th3);
            l0.R0(th3);
        }
    }

    public final void d(Throwable th3) {
        try {
            ((z) this.f69409d).f69452d.accept(th3);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            th3 = new CompositeException(th3, th4);
        }
        this.f69408c = bk2.c.DISPOSED;
        this.f69407b.onError(th3);
        c();
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f69406a) {
            case 0:
                this.f69408c.dispose();
                break;
            case 1:
                xj2.c cVar = this.f69408c;
                this.f69408c = bk2.c.DISPOSED;
                cVar.dispose();
                break;
            default:
                try {
                    ((z) this.f69409d).getClass();
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    l0.R0(th3);
                }
                this.f69408c.dispose();
                this.f69408c = bk2.c.DISPOSED;
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f69406a) {
        }
        return this.f69408c.isDisposed();
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        int i13 = this.f69406a;
        uj2.m mVar = this.f69407b;
        switch (i13) {
            case 0:
                mVar.onError(th3);
                break;
            case 1:
                mVar.onError(th3);
                break;
            default:
                if (this.f69408c != bk2.c.DISPOSED) {
                    d(th3);
                    break;
                } else {
                    l0.R0(th3);
                    break;
                }
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        int i13 = this.f69406a;
        uj2.m mVar = this.f69407b;
        Object obj2 = this.f69409d;
        switch (i13) {
            case 0:
                mVar.onSuccess(obj);
                try {
                    ((ak2.e) obj2).accept(obj);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    l0.R0(th3);
                    return;
                }
            case 1:
                try {
                    Object apply = ((ak2.f) obj2).apply(obj);
                    ck2.i.b(apply, "The mapper returned a null item");
                    mVar.onSuccess(apply);
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    mVar.onError(th4);
                    return;
                }
            default:
                xj2.c cVar = this.f69408c;
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (cVar != cVar2) {
                    try {
                        ((z) obj2).f69451c.accept(obj);
                        this.f69408c = cVar2;
                        mVar.onSuccess(obj);
                        c();
                        break;
                    } catch (Throwable th5) {
                        bp1.h.H(th5);
                        d(th5);
                    }
                }
                break;
        }
    }
}
