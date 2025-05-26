package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class h1 extends ok2.a implements uj2.k, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.z f65433a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65435c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65436d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f65437e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public xp2.c f65438f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.i f65439g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f65440h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f65441i;

    /* renamed from: j, reason: collision with root package name */
    public Throwable f65442j;

    /* renamed from: k, reason: collision with root package name */
    public int f65443k;

    /* renamed from: l, reason: collision with root package name */
    public long f65444l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f65445m;

    public h1(uj2.z zVar, boolean z13, int i13) {
        this.f65433a = zVar;
        this.f65434b = z13;
        this.f65435c = i13;
        this.f65436d = i13 - (i13 >> 2);
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65441i) {
            return;
        }
        this.f65441i = true;
        j();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65441i) {
            return;
        }
        if (this.f65443k == 2) {
            j();
            return;
        }
        if (!this.f65439g.offer(obj)) {
            this.f65438f.cancel();
            this.f65442j = new MissingBackpressureException("Queue is full?!");
            this.f65441i = true;
        }
        j();
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f65440h) {
            return;
        }
        this.f65440h = true;
        this.f65438f.cancel();
        this.f65433a.dispose();
        if (this.f65445m || getAndIncrement() != 0) {
            return;
        }
        this.f65439g.clear();
    }

    @Override // dk2.i
    public final void clear() {
        this.f65439g.clear();
    }

    public final boolean e(boolean z13, boolean z14, xp2.b bVar) {
        if (this.f65440h) {
            clear();
            return true;
        }
        if (!z13) {
            return false;
        }
        if (this.f65434b) {
            if (!z14) {
                return false;
            }
            this.f65440h = true;
            Throwable th3 = this.f65442j;
            if (th3 != null) {
                bVar.onError(th3);
            } else {
                bVar.a();
            }
            this.f65433a.dispose();
            return true;
        }
        Throwable th4 = this.f65442j;
        if (th4 != null) {
            this.f65440h = true;
            clear();
            bVar.onError(th4);
            this.f65433a.dispose();
            return true;
        }
        if (!z14) {
            return false;
        }
        this.f65440h = true;
        bVar.a();
        this.f65433a.dispose();
        return true;
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f65439g.isEmpty();
    }

    public final void j() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f65433a.b(this);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65441i) {
            lb.l0.R0(th3);
            return;
        }
        this.f65442j = th3;
        this.f65441i = true;
        j();
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this.f65437e, j13);
            j();
        }
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        this.f65445m = true;
        return 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f65445m) {
            h();
        } else if (this.f65443k == 1) {
            i();
        } else {
            g();
        }
    }
}
