package gk2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class m extends l {

    /* renamed from: c, reason: collision with root package name */
    public final lk2.c f65525c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f65526d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f65527e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f65528f;

    public m(xp2.b bVar, int i13) {
        super(bVar);
        this.f65525c = new lk2.c(i13);
        this.f65528f = new AtomicInteger();
    }

    @Override // gk2.l, uj2.i
    public final boolean a(Throwable th3) {
        if (this.f65527e || this.f65491b.isDisposed()) {
            return false;
        }
        if (th3 == null) {
            th3 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.f65526d = th3;
        this.f65527e = true;
        h();
        return true;
    }

    @Override // uj2.g
    public final void c(Object obj) {
        if (this.f65527e || this.f65491b.isDisposed()) {
            return;
        }
        if (obj == null) {
            e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f65525c.offer(obj);
            h();
        }
    }

    @Override // gk2.l
    public final void f() {
        h();
    }

    @Override // gk2.l
    public final void g() {
        if (this.f65528f.getAndIncrement() == 0) {
            this.f65525c.clear();
        }
    }

    public final void h() {
        if (this.f65528f.getAndIncrement() != 0) {
            return;
        }
        xp2.b bVar = this.f65490a;
        lk2.c cVar = this.f65525c;
        int i13 = 1;
        do {
            long j13 = get();
            long j14 = 0;
            while (j14 != j13) {
                if (this.f65491b.isDisposed()) {
                    cVar.clear();
                    return;
                }
                boolean z13 = this.f65527e;
                Object poll = cVar.poll();
                boolean z14 = poll == null;
                if (z13 && z14) {
                    Throwable th3 = this.f65526d;
                    if (th3 != null) {
                        d(th3);
                        return;
                    } else {
                        b();
                        return;
                    }
                }
                if (z14) {
                    break;
                }
                bVar.c(poll);
                j14++;
            }
            if (j14 == j13) {
                if (this.f65491b.isDisposed()) {
                    cVar.clear();
                    return;
                }
                boolean z15 = this.f65527e;
                boolean isEmpty = cVar.isEmpty();
                if (z15 && isEmpty) {
                    Throwable th4 = this.f65526d;
                    if (th4 != null) {
                        d(th4);
                        return;
                    } else {
                        b();
                        return;
                    }
                }
            }
            if (j14 != 0) {
                d7.b.l0(this, j14);
            }
            i13 = this.f65528f.addAndGet(-i13);
        } while (i13 != 0);
    }
}
