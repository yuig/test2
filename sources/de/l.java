package de;

/* loaded from: classes3.dex */
public final class l implements e, c {

    /* renamed from: a, reason: collision with root package name */
    public final e f54541a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f54542b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f54543c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f54544d;

    /* renamed from: e, reason: collision with root package name */
    public d f54545e;

    /* renamed from: f, reason: collision with root package name */
    public d f54546f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54547g;

    public l(Object obj, e eVar) {
        d dVar = d.CLEARED;
        this.f54545e = dVar;
        this.f54546f = dVar;
        this.f54542b = obj;
        this.f54541a = eVar;
    }

    @Override // de.e, de.c
    public final boolean a() {
        boolean z13;
        synchronized (this.f54542b) {
            try {
                z13 = this.f54544d.a() || this.f54543c.a();
            } finally {
            }
        }
        return z13;
    }

    @Override // de.e
    public final void b(c cVar) {
        synchronized (this.f54542b) {
            try {
                if (!cVar.equals(this.f54543c)) {
                    this.f54546f = d.FAILED;
                    return;
                }
                this.f54545e = d.FAILED;
                e eVar = this.f54541a;
                if (eVar != null) {
                    eVar.b(this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // de.c
    public final boolean c(c cVar) {
        if (!(cVar instanceof l)) {
            return false;
        }
        l lVar = (l) cVar;
        if (this.f54543c == null) {
            if (lVar.f54543c != null) {
                return false;
            }
        } else if (!this.f54543c.c(lVar.f54543c)) {
            return false;
        }
        if (this.f54544d == null) {
            if (lVar.f54544d != null) {
                return false;
            }
        } else if (!this.f54544d.c(lVar.f54544d)) {
            return false;
        }
        return true;
    }

    @Override // de.c
    public final void clear() {
        synchronized (this.f54542b) {
            this.f54547g = false;
            d dVar = d.CLEARED;
            this.f54545e = dVar;
            this.f54546f = dVar;
            this.f54544d.clear();
            this.f54543c.clear();
        }
    }

    @Override // de.e
    public final boolean d(c cVar) {
        boolean z13;
        synchronized (this.f54542b) {
            try {
                e eVar = this.f54541a;
                z13 = (eVar == null || eVar.d(this)) && (cVar.equals(this.f54543c) || this.f54545e != d.SUCCESS);
            } finally {
            }
        }
        return z13;
    }

    @Override // de.e
    public final e e() {
        e e13;
        synchronized (this.f54542b) {
            try {
                e eVar = this.f54541a;
                e13 = eVar != null ? eVar.e() : this;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return e13;
    }

    @Override // de.e
    public final void f(c cVar) {
        synchronized (this.f54542b) {
            try {
                if (cVar.equals(this.f54544d)) {
                    this.f54546f = d.SUCCESS;
                    return;
                }
                this.f54545e = d.SUCCESS;
                e eVar = this.f54541a;
                if (eVar != null) {
                    eVar.f(this);
                }
                if (!this.f54546f.isComplete()) {
                    this.f54544d.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // de.e
    public final boolean g(c cVar) {
        boolean z13;
        synchronized (this.f54542b) {
            try {
                e eVar = this.f54541a;
                z13 = (eVar == null || eVar.g(this)) && cVar.equals(this.f54543c) && this.f54545e != d.PAUSED;
            } finally {
            }
        }
        return z13;
    }

    @Override // de.c
    public final boolean h() {
        boolean z13;
        synchronized (this.f54542b) {
            z13 = this.f54545e == d.CLEARED;
        }
        return z13;
    }

    @Override // de.c
    public final boolean i() {
        boolean z13;
        synchronized (this.f54542b) {
            z13 = this.f54545e == d.SUCCESS;
        }
        return z13;
    }

    @Override // de.c
    public final boolean isRunning() {
        boolean z13;
        synchronized (this.f54542b) {
            z13 = this.f54545e == d.RUNNING;
        }
        return z13;
    }

    @Override // de.c
    public final void j() {
        synchronized (this.f54542b) {
            try {
                this.f54547g = true;
                try {
                    if (this.f54545e != d.SUCCESS) {
                        d dVar = this.f54546f;
                        d dVar2 = d.RUNNING;
                        if (dVar != dVar2) {
                            this.f54546f = dVar2;
                            this.f54544d.j();
                        }
                    }
                    if (this.f54547g) {
                        d dVar3 = this.f54545e;
                        d dVar4 = d.RUNNING;
                        if (dVar3 != dVar4) {
                            this.f54545e = dVar4;
                            this.f54543c.j();
                        }
                    }
                    this.f54547g = false;
                } catch (Throwable th3) {
                    this.f54547g = false;
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // de.e
    public final boolean k(c cVar) {
        boolean z13;
        synchronized (this.f54542b) {
            try {
                e eVar = this.f54541a;
                z13 = (eVar == null || eVar.k(this)) && cVar.equals(this.f54543c) && !a();
            } finally {
            }
        }
        return z13;
    }

    @Override // de.c
    public final void pause() {
        synchronized (this.f54542b) {
            try {
                if (!this.f54546f.isComplete()) {
                    this.f54546f = d.PAUSED;
                    this.f54544d.pause();
                }
                if (!this.f54545e.isComplete()) {
                    this.f54545e = d.PAUSED;
                    this.f54543c.pause();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
