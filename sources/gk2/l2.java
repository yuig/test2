package gk2;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class l2 extends ok2.c implements uj2.k {

    /* renamed from: c, reason: collision with root package name */
    public final Object f65521c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65522d;

    /* renamed from: e, reason: collision with root package name */
    public xp2.c f65523e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65524f;

    public l2(xp2.b bVar, Object obj, boolean z13) {
        super(bVar);
        this.f65521c = obj;
        this.f65522d = z13;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65524f) {
            return;
        }
        this.f65524f = true;
        Object obj = this.f95469b;
        this.f95469b = null;
        if (obj == null) {
            obj = this.f65521c;
        }
        if (obj != null) {
            e(obj);
            return;
        }
        boolean z13 = this.f65522d;
        xp2.b bVar = this.f95468a;
        if (z13) {
            bVar.onError(new NoSuchElementException());
        } else {
            bVar.a();
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65524f) {
            return;
        }
        if (this.f95469b == null) {
            this.f95469b = obj;
            return;
        }
        this.f65524f = true;
        this.f65523e.cancel();
        this.f95468a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // xp2.c
    public final void cancel() {
        set(4);
        this.f95469b = null;
        this.f65523e.cancel();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65523e, cVar)) {
            this.f65523e = cVar;
            this.f95468a.d(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65524f) {
            lb.l0.R0(th3);
        } else {
            this.f65524f = true;
            this.f95468a.onError(th3);
        }
    }
}
