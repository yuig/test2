package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class q0 extends ok2.a implements uj2.k {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65577a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f65578b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65579c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65580d;

    /* renamed from: f, reason: collision with root package name */
    public xp2.c f65582f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.i f65583g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f65584h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f65585i;

    /* renamed from: k, reason: collision with root package name */
    public Iterator f65587k;

    /* renamed from: l, reason: collision with root package name */
    public int f65588l;

    /* renamed from: m, reason: collision with root package name */
    public int f65589m;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f65586j = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f65581e = new AtomicLong();

    public q0(xp2.b bVar, ak2.f fVar, int i13) {
        this.f65577a = bVar;
        this.f65578b = fVar;
        this.f65579c = i13;
        this.f65580d = i13 - (i13 >> 2);
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65584h) {
            return;
        }
        this.f65584h = true;
        g();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65584h) {
            return;
        }
        if (this.f65589m != 0 || this.f65583g.offer(obj)) {
            g();
        } else {
            onError(new MissingBackpressureException("Queue is full?!"));
        }
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f65585i) {
            return;
        }
        this.f65585i = true;
        this.f65582f.cancel();
        if (getAndIncrement() == 0) {
            this.f65583g.clear();
        }
    }

    @Override // dk2.i
    public final void clear() {
        this.f65587k = null;
        this.f65583g.clear();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65582f, cVar)) {
            this.f65582f = cVar;
            if (cVar instanceof dk2.f) {
                dk2.f fVar = (dk2.f) cVar;
                int requestFusion = fVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.f65589m = requestFusion;
                    this.f65583g = fVar;
                    this.f65584h = true;
                    this.f65577a.d(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.f65589m = requestFusion;
                    this.f65583g = fVar;
                    this.f65577a.d(this);
                    cVar.request(this.f65579c);
                    return;
                }
            }
            this.f65583g = new lk2.b(this.f65579c);
            this.f65577a.d(this);
            cVar.request(this.f65579c);
        }
    }

    public final boolean e(boolean z13, boolean z14, xp2.b bVar, dk2.i iVar) {
        if (this.f65585i) {
            this.f65587k = null;
            iVar.clear();
            return true;
        }
        if (!z13) {
            return false;
        }
        if (((Throwable) this.f65586j.get()) == null) {
            if (!z14) {
                return false;
            }
            bVar.a();
            return true;
        }
        Throwable b13 = pk2.h.b(this.f65586j);
        this.f65587k = null;
        iVar.clear();
        bVar.onError(b13);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        if (r6 == null) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gk2.q0.g():void");
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f65587k == null && this.f65583g.isEmpty();
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65584h || !pk2.h.a(this.f65586j, th3)) {
            lb.l0.R0(th3);
        } else {
            this.f65584h = true;
            g();
        }
    }

    @Override // dk2.i
    public final Object poll() {
        Iterator it = this.f65587k;
        while (true) {
            if (it == null) {
                Object poll = this.f65583g.poll();
                if (poll != null) {
                    it = ((Iterable) this.f65578b.apply(poll)).iterator();
                    if (it.hasNext()) {
                        this.f65587k = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        ck2.i.b(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f65587k = null;
        }
        return next;
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this.f65581e, j13);
            g();
        }
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        return this.f65589m == 1 ? 1 : 0;
    }
}
