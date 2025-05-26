package ek2;

import lb.l0;
import uj2.d0;
import uj2.v;

/* loaded from: classes2.dex */
public final class h implements v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59427a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f59428b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f59429c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f59430d;

    /* renamed from: e, reason: collision with root package name */
    public Object f59431e;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i13) {
        this.f59427a = i13;
        this.f59429c = obj;
        this.f59430d = obj2;
        this.f59431e = obj3;
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f59427a;
        Object obj = this.f59429c;
        switch (i13) {
            case 0:
                xj2.c cVar = this.f59428b;
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (cVar != cVar2) {
                    this.f59428b = cVar2;
                    ((v) obj).a();
                    break;
                }
                break;
            default:
                Object obj2 = this.f59431e;
                if (obj2 != null) {
                    this.f59431e = null;
                    ((d0) obj).onSuccess(obj2);
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        int i13 = this.f59427a;
        Object obj = this.f59429c;
        switch (i13) {
            case 0:
                try {
                    ((ak2.e) this.f59430d).accept(cVar);
                    if (bk2.c.validate(this.f59428b, cVar)) {
                        this.f59428b = cVar;
                        ((v) obj).b(this);
                        break;
                    }
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    cVar.dispose();
                    this.f59428b = bk2.c.DISPOSED;
                    bk2.d.error(th3, (v) obj);
                    return;
                }
                break;
            default:
                if (bk2.c.validate(this.f59428b, cVar)) {
                    this.f59428b = cVar;
                    ((d0) obj).b(this);
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        switch (this.f59427a) {
            case 0:
                ((v) this.f59429c).c(obj);
                break;
            default:
                Object obj2 = this.f59431e;
                if (obj2 != null) {
                    try {
                        Object apply = ((ak2.c) this.f59430d).apply(obj2, obj);
                        ck2.i.b(apply, "The reducer returned a null value");
                        this.f59431e = apply;
                        break;
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        this.f59428b.dispose();
                        onError(th3);
                    }
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f59427a) {
            case 0:
                xj2.c cVar = this.f59428b;
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (cVar != cVar2) {
                    this.f59428b = cVar2;
                    try {
                        ((ak2.a) this.f59431e).run();
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        l0.R0(th3);
                    }
                    cVar.dispose();
                    break;
                }
                break;
            default:
                this.f59428b.dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f59427a) {
        }
        return this.f59428b.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f59427a;
        Object obj = this.f59429c;
        switch (i13) {
            case 0:
                xj2.c cVar = this.f59428b;
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (cVar == cVar2) {
                    l0.R0(th3);
                    break;
                } else {
                    this.f59428b = cVar2;
                    ((v) obj).onError(th3);
                    break;
                }
            default:
                if (this.f59431e == null) {
                    l0.R0(th3);
                    break;
                } else {
                    this.f59431e = null;
                    ((d0) obj).onError(th3);
                    break;
                }
        }
    }
}
