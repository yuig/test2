package gk2;

/* loaded from: classes2.dex */
public final class i1 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public final dk2.a f65461n;

    /* renamed from: o, reason: collision with root package name */
    public long f65462o;

    public i1(dk2.a aVar, uj2.z zVar, boolean z13, int i13) {
        super(zVar, z13, i13);
        this.f65461n = aVar;
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65438f, cVar)) {
            this.f65438f = cVar;
            if (cVar instanceof dk2.f) {
                dk2.f fVar = (dk2.f) cVar;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f65443k = 1;
                    this.f65439g = fVar;
                    this.f65441i = true;
                    this.f65461n.d(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.f65443k = 2;
                    this.f65439g = fVar;
                    this.f65461n.d(this);
                    cVar.request(this.f65435c);
                    return;
                }
            }
            this.f65439g = new lk2.b(this.f65435c);
            this.f65461n.d(this);
            cVar.request(this.f65435c);
        }
    }

    @Override // gk2.h1
    public final void g() {
        dk2.a aVar = this.f65461n;
        dk2.i iVar = this.f65439g;
        long j13 = this.f65444l;
        long j14 = this.f65462o;
        int i13 = 1;
        while (true) {
            long j15 = this.f65437e.get();
            while (j13 != j15) {
                boolean z13 = this.f65441i;
                try {
                    Object poll = iVar.poll();
                    boolean z14 = poll == null;
                    if (e(z13, z14, aVar)) {
                        return;
                    }
                    if (z14) {
                        break;
                    }
                    if (aVar.f(poll)) {
                        j13++;
                    }
                    j14++;
                    if (j14 == this.f65436d) {
                        this.f65438f.request(j14);
                        j14 = 0;
                    }
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    this.f65440h = true;
                    this.f65438f.cancel();
                    iVar.clear();
                    aVar.onError(th3);
                    this.f65433a.dispose();
                    return;
                }
            }
            if (j13 == j15 && e(this.f65441i, iVar.isEmpty(), aVar)) {
                return;
            }
            int i14 = get();
            if (i13 == i14) {
                this.f65444l = j13;
                this.f65462o = j14;
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            } else {
                i13 = i14;
            }
        }
    }

    @Override // gk2.h1
    public final void h() {
        int i13 = 1;
        while (!this.f65440h) {
            boolean z13 = this.f65441i;
            this.f65461n.c(null);
            if (z13) {
                this.f65440h = true;
                Throwable th3 = this.f65442j;
                if (th3 != null) {
                    this.f65461n.onError(th3);
                } else {
                    this.f65461n.a();
                }
                this.f65433a.dispose();
                return;
            }
            i13 = addAndGet(-i13);
            if (i13 == 0) {
                return;
            }
        }
    }

    @Override // gk2.h1
    public final void i() {
        dk2.a aVar = this.f65461n;
        dk2.i iVar = this.f65439g;
        long j13 = this.f65444l;
        int i13 = 1;
        while (true) {
            long j14 = this.f65437e.get();
            while (j13 != j14) {
                try {
                    Object poll = iVar.poll();
                    if (this.f65440h) {
                        return;
                    }
                    if (poll == null) {
                        this.f65440h = true;
                        aVar.a();
                        this.f65433a.dispose();
                        return;
                    } else if (aVar.f(poll)) {
                        j13++;
                    }
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    this.f65440h = true;
                    this.f65438f.cancel();
                    aVar.onError(th3);
                    this.f65433a.dispose();
                    return;
                }
            }
            if (this.f65440h) {
                return;
            }
            if (iVar.isEmpty()) {
                this.f65440h = true;
                aVar.a();
                this.f65433a.dispose();
                return;
            } else {
                int i14 = get();
                if (i13 == i14) {
                    this.f65444l = j13;
                    i13 = addAndGet(-i13);
                    if (i13 == 0) {
                        return;
                    }
                } else {
                    i13 = i14;
                }
            }
        }
    }

    @Override // dk2.i
    public final Object poll() {
        Object poll = this.f65439g.poll();
        if (poll != null && this.f65443k != 1) {
            long j13 = this.f65462o + 1;
            if (j13 == this.f65436d) {
                this.f65462o = 0L;
                this.f65438f.request(j13);
            } else {
                this.f65462o = j13;
            }
        }
        return poll;
    }
}
