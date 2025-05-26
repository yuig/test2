package jk2;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes4.dex */
public final class t0 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76695a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.v f76696b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f76697c;

    /* renamed from: d, reason: collision with root package name */
    public xj2.c f76698d;

    public /* synthetic */ t0(uj2.v vVar, ak2.f fVar, int i13) {
        this.f76695a = i13;
        this.f76696b = vVar;
        this.f76697c = fVar;
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f76695a;
        uj2.v vVar = this.f76696b;
        switch (i13) {
            case 0:
                xj2.c cVar = this.f76698d;
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (cVar != cVar2) {
                    this.f76698d = cVar2;
                    vVar.a();
                    break;
                }
                break;
            default:
                vVar.a();
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        int i13 = this.f76695a;
        uj2.v vVar = this.f76696b;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f76698d, cVar)) {
                    this.f76698d = cVar;
                    vVar.b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f76698d, cVar)) {
                    this.f76698d = cVar;
                    vVar.b(this);
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f76695a;
        uj2.v vVar = this.f76696b;
        switch (i13) {
            case 0:
                if (this.f76698d != bk2.c.DISPOSED) {
                    try {
                        for (Object obj2 : (Iterable) this.f76697c.apply(obj)) {
                            try {
                                try {
                                    ck2.i.b(obj2, "The iterator returned a null value");
                                    vVar.c(obj2);
                                } catch (Throwable th3) {
                                    bp1.h.H(th3);
                                    this.f76698d.dispose();
                                    onError(th3);
                                    return;
                                }
                            } catch (Throwable th4) {
                                bp1.h.H(th4);
                                this.f76698d.dispose();
                                onError(th4);
                                return;
                            }
                        }
                        break;
                    } catch (Throwable th5) {
                        bp1.h.H(th5);
                        this.f76698d.dispose();
                        onError(th5);
                        return;
                    }
                }
                break;
            default:
                vVar.c(obj);
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f76695a) {
            case 0:
                this.f76698d.dispose();
                this.f76698d = bk2.c.DISPOSED;
                break;
            default:
                this.f76698d.dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f76695a) {
        }
        return this.f76698d.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f76695a;
        uj2.v vVar = this.f76696b;
        switch (i13) {
            case 0:
                xj2.c cVar = this.f76698d;
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (cVar != cVar2) {
                    this.f76698d = cVar2;
                    vVar.onError(th3);
                    break;
                } else {
                    lb.l0.R0(th3);
                    break;
                }
            default:
                try {
                    Object apply = this.f76697c.apply(th3);
                    if (apply != null) {
                        vVar.c(apply);
                        vVar.a();
                        break;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th3);
                        vVar.onError(nullPointerException);
                        break;
                    }
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    vVar.onError(new CompositeException(th3, th4));
                    return;
                }
        }
    }
}
