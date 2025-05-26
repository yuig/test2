package de;

/* loaded from: classes3.dex */
public final class b implements e, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f54501a;

    /* renamed from: b, reason: collision with root package name */
    public final e f54502b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f54503c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f54504d;

    /* renamed from: e, reason: collision with root package name */
    public d f54505e;

    /* renamed from: f, reason: collision with root package name */
    public d f54506f;

    public b(Object obj, e eVar) {
        d dVar = d.CLEARED;
        this.f54505e = dVar;
        this.f54506f = dVar;
        this.f54501a = obj;
        this.f54502b = eVar;
    }

    @Override // de.e, de.c
    public final boolean a() {
        boolean z13;
        synchronized (this.f54501a) {
            try {
                z13 = this.f54503c.a() || this.f54504d.a();
            } finally {
            }
        }
        return z13;
    }

    @Override // de.e
    public final void b(c cVar) {
        synchronized (this.f54501a) {
            try {
                if (cVar.equals(this.f54504d)) {
                    this.f54506f = d.FAILED;
                    e eVar = this.f54502b;
                    if (eVar != null) {
                        eVar.b(this);
                    }
                    return;
                }
                this.f54505e = d.FAILED;
                d dVar = this.f54506f;
                d dVar2 = d.RUNNING;
                if (dVar != dVar2) {
                    this.f54506f = dVar2;
                    this.f54504d.j();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // de.c
    public final boolean c(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f54503c.c(bVar.f54503c) && this.f54504d.c(bVar.f54504d);
    }

    @Override // de.c
    public final void clear() {
        synchronized (this.f54501a) {
            try {
                d dVar = d.CLEARED;
                this.f54505e = dVar;
                this.f54503c.clear();
                if (this.f54506f != dVar) {
                    this.f54506f = dVar;
                    this.f54504d.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // de.e
    public final boolean d(c cVar) {
        boolean z13;
        synchronized (this.f54501a) {
            e eVar = this.f54502b;
            z13 = eVar == null || eVar.d(this);
        }
        return z13;
    }

    @Override // de.e
    public final e e() {
        e e13;
        synchronized (this.f54501a) {
            try {
                e eVar = this.f54502b;
                e13 = eVar != null ? eVar.e() : this;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return e13;
    }

    @Override // de.e
    public final void f(c cVar) {
        synchronized (this.f54501a) {
            try {
                if (cVar.equals(this.f54503c)) {
                    this.f54505e = d.SUCCESS;
                } else if (cVar.equals(this.f54504d)) {
                    this.f54506f = d.SUCCESS;
                }
                e eVar = this.f54502b;
                if (eVar != null) {
                    eVar.f(this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // de.e
    public final boolean g(c cVar) {
        boolean z13;
        synchronized (this.f54501a) {
            e eVar = this.f54502b;
            z13 = (eVar == null || eVar.g(this)) && cVar.equals(this.f54503c);
        }
        return z13;
    }

    @Override // de.c
    public final boolean h() {
        boolean z13;
        synchronized (this.f54501a) {
            try {
                d dVar = this.f54505e;
                d dVar2 = d.CLEARED;
                z13 = dVar == dVar2 && this.f54506f == dVar2;
            } finally {
            }
        }
        return z13;
    }

    @Override // de.c
    public final boolean i() {
        boolean z13;
        synchronized (this.f54501a) {
            try {
                d dVar = this.f54505e;
                d dVar2 = d.SUCCESS;
                z13 = dVar == dVar2 || this.f54506f == dVar2;
            } finally {
            }
        }
        return z13;
    }

    @Override // de.c
    public final boolean isRunning() {
        boolean z13;
        synchronized (this.f54501a) {
            try {
                d dVar = this.f54505e;
                d dVar2 = d.RUNNING;
                z13 = dVar == dVar2 || this.f54506f == dVar2;
            } finally {
            }
        }
        return z13;
    }

    @Override // de.c
    public final void j() {
        synchronized (this.f54501a) {
            try {
                d dVar = this.f54505e;
                d dVar2 = d.RUNNING;
                if (dVar != dVar2) {
                    this.f54505e = dVar2;
                    this.f54503c.j();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if (r4 == r2) goto L18;
     */
    @Override // de.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(de.c r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f54501a
            monitor-enter(r0)
            de.e r1 = r3.f54502b     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto Ld
            boolean r1 = r1.k(r3)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L2e
        Ld:
            de.d r1 = r3.f54505e     // Catch: java.lang.Throwable -> L31
            de.d r2 = de.d.FAILED     // Catch: java.lang.Throwable -> L31
            if (r1 == r2) goto L1c
            de.c r1 = r3.f54503c     // Catch: java.lang.Throwable -> L31
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L2e
            goto L2c
        L1c:
            de.c r1 = r3.f54504d     // Catch: java.lang.Throwable -> L31
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L2e
            de.d r4 = r3.f54506f     // Catch: java.lang.Throwable -> L31
            de.d r1 = de.d.SUCCESS     // Catch: java.lang.Throwable -> L31
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L2e
        L2c:
            r4 = 1
            goto L2f
        L2e:
            r4 = 0
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return r4
        L31:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: de.b.k(de.c):boolean");
    }

    @Override // de.c
    public final void pause() {
        synchronized (this.f54501a) {
            try {
                d dVar = this.f54505e;
                d dVar2 = d.RUNNING;
                if (dVar == dVar2) {
                    this.f54505e = d.PAUSED;
                    this.f54503c.pause();
                }
                if (this.f54506f == dVar2) {
                    this.f54506f = d.PAUSED;
                    this.f54504d.pause();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
