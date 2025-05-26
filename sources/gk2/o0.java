package gk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class o0 extends AtomicInteger implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65553a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65555c;

    /* renamed from: h, reason: collision with root package name */
    public final ak2.f f65560h;

    /* renamed from: j, reason: collision with root package name */
    public xp2.c f65562j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f65563k;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f65556d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final xj2.b f65557e = new xj2.b();

    /* renamed from: g, reason: collision with root package name */
    public final pk2.c f65559g = new pk2.c();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f65558f = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f65561i = new AtomicReference();

    public o0(int i13, ak2.f fVar, xp2.b bVar, boolean z13) {
        this.f65553a = bVar;
        this.f65560h = fVar;
        this.f65554b = z13;
        this.f65555c = i13;
    }

    @Override // xp2.b
    public final void a() {
        this.f65558f.decrementAndGet();
        if (getAndIncrement() == 0) {
            e();
        }
    }

    public final void b() {
        lk2.c cVar = (lk2.c) this.f65561i.get();
        if (cVar != null) {
            cVar.clear();
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        try {
            Object apply = this.f65560h.apply(obj);
            ck2.i.b(apply, "The mapper returned a null MaybeSource");
            uj2.n nVar = (uj2.n) apply;
            this.f65558f.getAndIncrement();
            n0 n0Var = new n0(this, 0);
            if (this.f65563k || !this.f65557e.a(n0Var)) {
                return;
            }
            ((uj2.l) nVar).f(n0Var);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f65562j.cancel();
            onError(th3);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65563k = true;
        this.f65562j.cancel();
        this.f65557e.dispose();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65562j, cVar)) {
            this.f65562j = cVar;
            this.f65553a.d(this);
            int i13 = this.f65555c;
            if (i13 == Integer.MAX_VALUE) {
                cVar.request(Long.MAX_VALUE);
            } else {
                cVar.request(i13);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r10 != r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r17.f65563k == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r17.f65554b != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        if (((java.lang.Throwable) r17.f65559g.get()) == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        r2 = r17.f65559g;
        r2.getClass();
        r2 = pk2.h.b(r2);
        b();
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r2.get() != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ab, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        r7 = (lk2.c) r3.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r7 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        if (r7.isEmpty() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (r6 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        if (r13 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
    
        r2 = r17.f65559g;
        r2.getClass();
        r2 = pk2.h.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
    
        if (r2 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
    
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d0, code lost:
    
        r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0083, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0086, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        if (r10 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        d7.b.l0(r17.f65556d, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e2, code lost:
    
        if (r17.f65555c == Integer.MAX_VALUE) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e4, code lost:
    
        r17.f65562j.request(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
    
        r5 = addAndGet(-r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gk2.o0.e():void");
    }

    public final lk2.c g() {
        while (true) {
            AtomicReference atomicReference = this.f65561i;
            lk2.c cVar = (lk2.c) atomicReference.get();
            if (cVar != null) {
                return cVar;
            }
            lk2.c cVar2 = new lk2.c(uj2.h.f122339a);
            while (!atomicReference.compareAndSet(null, cVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return cVar2;
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f65558f.decrementAndGet();
        pk2.c cVar = this.f65559g;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        if (!this.f65554b) {
            this.f65557e.dispose();
        }
        if (getAndIncrement() == 0) {
            e();
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this.f65556d, j13);
            if (getAndIncrement() == 0) {
                e();
            }
        }
    }
}
