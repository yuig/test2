package jk2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76425a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f76426b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f76427c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f76428d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f76429e;

    /* renamed from: f, reason: collision with root package name */
    public Object f76430f;

    public d(uj2.d0 d0Var, Object obj) {
        this.f76429e = d0Var;
        this.f76426b = obj;
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f76425a;
        Object obj = this.f76429e;
        switch (i13) {
            case 0:
                if (!this.f76428d) {
                    this.f76428d = true;
                    ((uj2.d0) obj).onSuccess(this.f76426b);
                    break;
                }
                break;
            case 1:
                if (!this.f76428d) {
                    this.f76428d = true;
                    ((uj2.v) obj).a();
                    break;
                }
                break;
            default:
                if (!this.f76428d) {
                    this.f76428d = true;
                    Object obj2 = this.f76430f;
                    this.f76430f = null;
                    if (obj2 == null) {
                        obj2 = this.f76426b;
                    }
                    if (obj2 == null) {
                        ((uj2.d0) obj).onError(new NoSuchElementException());
                        break;
                    } else {
                        ((uj2.d0) obj).onSuccess(obj2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        int i13 = this.f76425a;
        Object obj = this.f76429e;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f76427c, cVar)) {
                    this.f76427c = cVar;
                    ((uj2.d0) obj).b(this);
                    break;
                }
                break;
            case 1:
                if (bk2.c.validate(this.f76427c, cVar)) {
                    this.f76427c = cVar;
                    uj2.v vVar = (uj2.v) obj;
                    vVar.b(this);
                    vVar.c(this.f76426b);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f76427c, cVar)) {
                    this.f76427c = cVar;
                    ((uj2.d0) obj).b(this);
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f76425a;
        Object obj2 = this.f76429e;
        switch (i13) {
            case 0:
                if (!this.f76428d) {
                    try {
                        ((ak2.b) this.f76430f).accept(this.f76426b, obj);
                        break;
                    } catch (Throwable th3) {
                        this.f76427c.dispose();
                        onError(th3);
                        return;
                    }
                }
                break;
            case 1:
                if (!this.f76428d) {
                    try {
                        Object apply = ((ak2.c) this.f76430f).apply(this.f76426b, obj);
                        ck2.i.b(apply, "The accumulator returned a null value");
                        this.f76426b = apply;
                        ((uj2.v) obj2).c(apply);
                        break;
                    } catch (Throwable th4) {
                        bp1.h.H(th4);
                        this.f76427c.dispose();
                        onError(th4);
                        return;
                    }
                }
                break;
            default:
                if (!this.f76428d) {
                    if (this.f76430f == null) {
                        this.f76430f = obj;
                        break;
                    } else {
                        this.f76428d = true;
                        this.f76427c.dispose();
                        ((uj2.d0) obj2).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        break;
                    }
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f76425a) {
            case 0:
                this.f76427c.dispose();
                break;
            case 1:
                this.f76427c.dispose();
                break;
            default:
                this.f76427c.dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f76425a) {
        }
        return this.f76427c.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f76425a;
        Object obj = this.f76429e;
        switch (i13) {
            case 0:
                if (!this.f76428d) {
                    this.f76428d = true;
                    ((uj2.d0) obj).onError(th3);
                    break;
                } else {
                    lb.l0.R0(th3);
                    break;
                }
            case 1:
                if (!this.f76428d) {
                    this.f76428d = true;
                    ((uj2.v) obj).onError(th3);
                    break;
                } else {
                    lb.l0.R0(th3);
                    break;
                }
            default:
                if (!this.f76428d) {
                    this.f76428d = true;
                    ((uj2.d0) obj).onError(th3);
                    break;
                } else {
                    lb.l0.R0(th3);
                    break;
                }
        }
    }

    public d(uj2.v vVar, ak2.c cVar, Object obj) {
        this.f76429e = vVar;
        this.f76430f = cVar;
        this.f76426b = obj;
    }

    public d(uj2.d0 d0Var, Object obj, ak2.b bVar) {
        this.f76429e = d0Var;
        this.f76430f = bVar;
        this.f76426b = obj;
    }
}
