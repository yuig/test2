package rk2;

import g.i;
import lb.l0;
import pk2.l;
import uj2.v;

/* loaded from: classes2.dex */
public final class d implements v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final v f108506a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f108507b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f108508c;

    /* renamed from: d, reason: collision with root package name */
    public i f108509d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f108510e;

    public d(v vVar) {
        this.f108506a = vVar;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f108510e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f108510e) {
                    return;
                }
                if (!this.f108508c) {
                    this.f108510e = true;
                    this.f108508c = true;
                    this.f108506a.a();
                } else {
                    i iVar = this.f108509d;
                    if (iVar == null) {
                        iVar = new i();
                        this.f108509d = iVar;
                    }
                    iVar.h(l.complete());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f108507b, cVar)) {
            this.f108507b = cVar;
            this.f108506a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f108510e) {
            return;
        }
        if (obj == null) {
            this.f108507b.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f108510e) {
                    return;
                }
                if (this.f108508c) {
                    i iVar = this.f108509d;
                    if (iVar == null) {
                        iVar = new i();
                        this.f108509d = iVar;
                    }
                    iVar.h(l.next(obj));
                    return;
                }
                this.f108508c = true;
                this.f108506a.c(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            i iVar2 = this.f108509d;
                            if (iVar2 == null) {
                                this.f108508c = false;
                                return;
                            }
                            this.f108509d = null;
                            v vVar = this.f108506a;
                            int i13 = iVar2.f63178a;
                            for (Object[] objArr = (Object[]) iVar2.f63180c; objArr != null; objArr = objArr[i13]) {
                                for (int i14 = 0; i14 < i13; i14++) {
                                    Object[] objArr2 = objArr[i14];
                                    if (objArr2 == null) {
                                        break;
                                    } else {
                                        if (l.acceptFull(objArr2, vVar)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f108507b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f108507b.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f108510e) {
            l0.R0(th3);
            return;
        }
        synchronized (this) {
            try {
                boolean z13 = true;
                if (!this.f108510e) {
                    if (this.f108508c) {
                        this.f108510e = true;
                        i iVar = this.f108509d;
                        if (iVar == null) {
                            iVar = new i();
                            this.f108509d = iVar;
                        }
                        iVar.H(l.error(th3));
                        return;
                    }
                    this.f108510e = true;
                    this.f108508c = true;
                    z13 = false;
                }
                if (z13) {
                    l0.R0(th3);
                } else {
                    this.f108506a.onError(th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
