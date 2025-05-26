package m7;

import android.os.Looper;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f86374a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f86375b;

    /* renamed from: c, reason: collision with root package name */
    public int f86376c;

    /* renamed from: d, reason: collision with root package name */
    public Object f86377d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f86378e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86379f;

    public r1(u0 u0Var, q1 q1Var, a7.b1 b1Var, int i13, Looper looper) {
        this.f86375b = u0Var;
        this.f86374a = q1Var;
        this.f86378e = looper;
    }

    public final synchronized void a(boolean z13) {
        notifyAll();
    }

    public final void b() {
        bf.b.t(!this.f86379f);
        this.f86379f = true;
        u0 u0Var = (u0) this.f86375b;
        synchronized (u0Var) {
            if (!u0Var.G && u0Var.f86419j.getThread().isAlive()) {
                u0Var.f86417h.b(14, this).b();
                return;
            }
            d7.u.g("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
