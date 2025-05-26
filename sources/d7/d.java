package d7;

import android.os.Looper;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f53797a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f53798b;

    /* renamed from: c, reason: collision with root package name */
    public final c f53799c;

    /* renamed from: d, reason: collision with root package name */
    public Object f53800d;

    /* renamed from: e, reason: collision with root package name */
    public Object f53801e;

    /* renamed from: f, reason: collision with root package name */
    public int f53802f;

    public d(Object obj, Looper looper, Looper looper2, e eVar, c cVar) {
        g0 g0Var = (g0) eVar;
        this.f53797a = g0Var.a(looper, null);
        this.f53798b = g0Var.a(looper2, null);
        this.f53800d = obj;
        this.f53801e = obj;
        this.f53799c = cVar;
    }

    public final void a(Runnable runnable) {
        this.f53797a.d(runnable);
    }

    public final void b(Object obj) {
        this.f53801e = obj;
        this.f53798b.d(new e5.k(3, this, obj));
    }
}
