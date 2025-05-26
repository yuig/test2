package jk2;

/* loaded from: classes2.dex */
public final class k1 extends ek2.b implements uj2.v, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76549a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.z f76550b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f76551c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76552d;

    /* renamed from: e, reason: collision with root package name */
    public dk2.i f76553e;

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f76554f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f76555g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f76556h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f76557i;

    /* renamed from: j, reason: collision with root package name */
    public int f76558j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f76559k;

    public k1(uj2.v vVar, uj2.z zVar, boolean z13, int i13) {
        this.f76549a = vVar;
        this.f76550b = zVar;
        this.f76551c = z13;
        this.f76552d = i13;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76556h) {
            return;
        }
        this.f76556h = true;
        if (getAndIncrement() == 0) {
            this.f76550b.b(this);
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76554f, cVar)) {
            this.f76554f = cVar;
            if (cVar instanceof dk2.d) {
                dk2.d dVar = (dk2.d) cVar;
                int requestFusion = dVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f76558j = requestFusion;
                    this.f76553e = dVar;
                    this.f76556h = true;
                    this.f76549a.b(this);
                    if (getAndIncrement() == 0) {
                        this.f76550b.b(this);
                        return;
                    }
                    return;
                }
                if (requestFusion == 2) {
                    this.f76558j = requestFusion;
                    this.f76553e = dVar;
                    this.f76549a.b(this);
                    return;
                }
            }
            this.f76553e = new lk2.c(this.f76552d);
            this.f76549a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76556h) {
            return;
        }
        if (this.f76558j != 2) {
            this.f76553e.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f76550b.b(this);
        }
    }

    @Override // dk2.i
    public final void clear() {
        this.f76553e.clear();
    }

    public final boolean d(boolean z13, boolean z14, uj2.v vVar) {
        if (this.f76557i) {
            this.f76553e.clear();
            return true;
        }
        if (!z13) {
            return false;
        }
        Throwable th3 = this.f76555g;
        if (this.f76551c) {
            if (!z14) {
                return false;
            }
            this.f76557i = true;
            if (th3 != null) {
                vVar.onError(th3);
            } else {
                vVar.a();
            }
            this.f76550b.dispose();
            return true;
        }
        if (th3 != null) {
            this.f76557i = true;
            this.f76553e.clear();
            vVar.onError(th3);
            this.f76550b.dispose();
            return true;
        }
        if (!z14) {
            return false;
        }
        this.f76557i = true;
        vVar.a();
        this.f76550b.dispose();
        return true;
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f76557i) {
            return;
        }
        this.f76557i = true;
        this.f76554f.dispose();
        this.f76550b.dispose();
        if (this.f76559k || getAndIncrement() != 0) {
            return;
        }
        this.f76553e.clear();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76557i;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f76553e.isEmpty();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76556h) {
            lb.l0.R0(th3);
            return;
        }
        this.f76555g = th3;
        this.f76556h = true;
        if (getAndIncrement() == 0) {
            this.f76550b.b(this);
        }
    }

    @Override // dk2.i
    public final Object poll() {
        return this.f76553e.poll();
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        this.f76559k = true;
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r3 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.f76559k
            r1 = 1
            if (r0 == 0) goto L4f
            r0 = r1
        L6:
            boolean r2 = r7.f76557i
            if (r2 == 0) goto Lc
            goto L97
        Lc:
            boolean r2 = r7.f76556h
            java.lang.Throwable r3 = r7.f76555g
            boolean r4 = r7.f76551c
            if (r4 != 0) goto L28
            if (r2 == 0) goto L28
            if (r3 == 0) goto L28
            r7.f76557i = r1
            uj2.v r0 = r7.f76549a
            java.lang.Throwable r1 = r7.f76555g
            r0.onError(r1)
            uj2.z r0 = r7.f76550b
            r0.dispose()
            goto L97
        L28:
            uj2.v r3 = r7.f76549a
            r4 = 0
            r3.c(r4)
            if (r2 == 0) goto L47
            r7.f76557i = r1
            java.lang.Throwable r0 = r7.f76555g
            if (r0 == 0) goto L3c
            uj2.v r1 = r7.f76549a
            r1.onError(r0)
            goto L41
        L3c:
            uj2.v r0 = r7.f76549a
            r0.a()
        L41:
            uj2.z r0 = r7.f76550b
            r0.dispose()
            goto L97
        L47:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L97
        L4f:
            dk2.i r0 = r7.f76553e
            uj2.v r2 = r7.f76549a
            r3 = r1
        L54:
            boolean r4 = r7.f76556h
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.d(r4, r5, r2)
            if (r4 == 0) goto L61
            goto L97
        L61:
            boolean r4 = r7.f76556h
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L81
            if (r5 != 0) goto L6b
            r6 = r1
            goto L6c
        L6b:
            r6 = 0
        L6c:
            boolean r4 = r7.d(r4, r6, r2)
            if (r4 == 0) goto L73
            goto L97
        L73:
            if (r6 == 0) goto L7d
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L54
            goto L97
        L7d:
            r2.c(r5)
            goto L61
        L81:
            r3 = move-exception
            bp1.h.H(r3)
            r7.f76557i = r1
            xj2.c r1 = r7.f76554f
            r1.dispose()
            r0.clear()
            r2.onError(r3)
            uj2.z r0 = r7.f76550b
            r0.dispose()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jk2.k1.run():void");
    }
}
