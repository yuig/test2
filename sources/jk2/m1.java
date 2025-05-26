package jk2;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes4.dex */
public final class m1 implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76586a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76587b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f76588c;

    /* renamed from: d, reason: collision with root package name */
    public final bk2.a f76589d = new bk2.a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f76590e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f76591f;

    public m1(uj2.v vVar, ak2.f fVar, boolean z13) {
        this.f76586a = vVar;
        this.f76587b = fVar;
        this.f76588c = z13;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76591f) {
            return;
        }
        this.f76591f = true;
        this.f76590e = true;
        this.f76586a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.a aVar = this.f76589d;
        aVar.getClass();
        bk2.c.replace(aVar, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76591f) {
            return;
        }
        this.f76586a.c(obj);
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        boolean z13 = this.f76590e;
        uj2.v vVar = this.f76586a;
        if (z13) {
            if (this.f76591f) {
                lb.l0.R0(th3);
                return;
            } else {
                vVar.onError(th3);
                return;
            }
        }
        this.f76590e = true;
        if (this.f76588c && !(th3 instanceof Exception)) {
            vVar.onError(th3);
            return;
        }
        try {
            uj2.t tVar = (uj2.t) this.f76587b.apply(th3);
            if (tVar != null) {
                tVar.d(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th3);
            vVar.onError(nullPointerException);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            vVar.onError(new CompositeException(th3, th4));
        }
    }
}
