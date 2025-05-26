package gk2;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class c0 extends ok2.c implements uj2.k {

    /* renamed from: c, reason: collision with root package name */
    public final long f65353c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f65354d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65355e;

    /* renamed from: f, reason: collision with root package name */
    public xp2.c f65356f;

    /* renamed from: g, reason: collision with root package name */
    public long f65357g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f65358h;

    public c0(xp2.b bVar, long j13, Object obj, boolean z13) {
        super(bVar);
        this.f65353c = j13;
        this.f65354d = obj;
        this.f65355e = z13;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65358h) {
            return;
        }
        this.f65358h = true;
        Object obj = this.f65354d;
        if (obj != null) {
            e(obj);
            return;
        }
        boolean z13 = this.f65355e;
        xp2.b bVar = this.f95468a;
        if (z13) {
            bVar.onError(new NoSuchElementException());
        } else {
            bVar.a();
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65358h) {
            return;
        }
        long j13 = this.f65357g;
        if (j13 != this.f65353c) {
            this.f65357g = j13 + 1;
            return;
        }
        this.f65358h = true;
        this.f65356f.cancel();
        e(obj);
    }

    @Override // xp2.c
    public final void cancel() {
        set(4);
        this.f95469b = null;
        this.f65356f.cancel();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65356f, cVar)) {
            this.f65356f = cVar;
            this.f95468a.d(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65358h) {
            lb.l0.R0(th3);
        } else {
            this.f65358h = true;
            this.f95468a.onError(th3);
        }
    }
}
