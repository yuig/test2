package pd;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o implements g, Runnable, Comparable, ie.b {
    public nd.a A;
    public com.bumptech.glide.load.data.e B;
    public volatile h C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public final ih.g f99715d;

    /* renamed from: e, reason: collision with root package name */
    public final p5.d f99716e;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.f f99719h;

    /* renamed from: i, reason: collision with root package name */
    public nd.h f99720i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.h f99721j;

    /* renamed from: k, reason: collision with root package name */
    public y f99722k;

    /* renamed from: l, reason: collision with root package name */
    public int f99723l;

    /* renamed from: m, reason: collision with root package name */
    public int f99724m;

    /* renamed from: n, reason: collision with root package name */
    public r f99725n;

    /* renamed from: o, reason: collision with root package name */
    public nd.l f99726o;

    /* renamed from: p, reason: collision with root package name */
    public k f99727p;

    /* renamed from: q, reason: collision with root package name */
    public int f99728q;

    /* renamed from: r, reason: collision with root package name */
    public n f99729r;

    /* renamed from: s, reason: collision with root package name */
    public m f99730s;

    /* renamed from: t, reason: collision with root package name */
    public long f99731t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f99732u;

    /* renamed from: v, reason: collision with root package name */
    public Object f99733v;

    /* renamed from: w, reason: collision with root package name */
    public Thread f99734w;

    /* renamed from: x, reason: collision with root package name */
    public nd.h f99735x;

    /* renamed from: y, reason: collision with root package name */
    public nd.h f99736y;

    /* renamed from: z, reason: collision with root package name */
    public Object f99737z;

    /* renamed from: a, reason: collision with root package name */
    public final i f99712a = new i();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f99713b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ie.e f99714c = new ie.e();

    /* renamed from: f, reason: collision with root package name */
    public final l f99717f = new l();

    /* renamed from: g, reason: collision with root package name */
    public final o7.f f99718g = new o7.f();

    public o(ih.g gVar, p5.d dVar) {
        this.f99715d = gVar;
        this.f99716e = dVar;
    }

    @Override // pd.g
    public final void a(nd.h hVar, Exception exc, com.bumptech.glide.load.data.e eVar, nd.a aVar) {
        eVar.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class a13 = eVar.a();
        glideException.f29822b = hVar;
        glideException.f29823c = aVar;
        glideException.f29824d = a13;
        this.f99713b.add(glideException);
        if (Thread.currentThread() != this.f99734w) {
            n(m.SWITCH_TO_SOURCE_SERVICE);
        } else {
            o();
        }
    }

    @Override // ie.b
    public final ie.e b() {
        return this.f99714c;
    }

    @Override // pd.g
    public final void c(nd.h hVar, Object obj, com.bumptech.glide.load.data.e eVar, nd.a aVar, nd.h hVar2) {
        this.f99735x = hVar;
        this.f99737z = obj;
        this.B = eVar;
        this.A = aVar;
        this.f99736y = hVar2;
        this.F = hVar != this.f99712a.a().get(0);
        if (Thread.currentThread() != this.f99734w) {
            n(m.DECODE_DATA);
        } else {
            g();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int ordinal = this.f99721j.ordinal() - oVar.f99721j.ordinal();
        return ordinal == 0 ? this.f99728q - oVar.f99728q : ordinal;
    }

    @Override // pd.g
    public final void d() {
        n(m.SWITCH_TO_SOURCE_SERVICE);
    }

    public final g0 e(com.bumptech.glide.load.data.e eVar, Object obj, nd.a aVar) {
        if (obj == null) {
            return null;
        }
        try {
            int i13 = he.i.f68949b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            g0 f13 = f(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j(elapsedRealtimeNanos, "Decoded result " + f13, null);
            }
            return f13;
        } finally {
            eVar.b();
        }
    }

    public final g0 f(Object obj, nd.a aVar) {
        Class<?> cls = obj.getClass();
        i iVar = this.f99712a;
        e0 c13 = iVar.c(cls);
        nd.l lVar = this.f99726o;
        boolean z13 = aVar == nd.a.RESOURCE_DISK_CACHE || iVar.f99689r;
        nd.k kVar = wd.o.f129193i;
        Boolean bool = (Boolean) lVar.c(kVar);
        if (bool == null || (bool.booleanValue() && !z13)) {
            lVar = new nd.l();
            he.d dVar = this.f99726o.f90422b;
            he.d dVar2 = lVar.f90422b;
            dVar2.g(dVar);
            dVar2.put(kVar, Boolean.valueOf(z13));
        }
        nd.l lVar2 = lVar;
        com.bumptech.glide.load.data.g f13 = this.f99719h.a().f(obj);
        try {
            return c13.a(this.f99723l, this.f99724m, lVar2, f13, new qq2.c(this, aVar));
        } finally {
            f13.b();
        }
    }

    public final void g() {
        g0 g0Var;
        boolean b13;
        if (Log.isLoggable("DecodeJob", 2)) {
            j(this.f99731t, "Retrieved data", "data: " + this.f99737z + ", cache key: " + this.f99735x + ", fetcher: " + this.B);
        }
        f0 f0Var = null;
        try {
            g0Var = e(this.B, this.f99737z, this.A);
        } catch (GlideException e13) {
            e13.g(this.f99736y, this.A);
            this.f99713b.add(e13);
            g0Var = null;
        }
        if (g0Var == null) {
            o();
            return;
        }
        nd.a aVar = this.A;
        boolean z13 = this.F;
        if (g0Var instanceof c0) {
            ((c0) g0Var).b();
        }
        if (((f0) this.f99717f.f99711c) != null) {
            f0Var = f0.e(g0Var);
            g0Var = f0Var;
        }
        k(g0Var, aVar, z13);
        this.f99729r = n.ENCODE;
        try {
            l lVar = this.f99717f;
            if (((f0) lVar.f99711c) != null) {
                lVar.b(this.f99715d, this.f99726o);
            }
            o7.f fVar = this.f99718g;
            synchronized (fVar) {
                fVar.f93047b = true;
                b13 = fVar.b();
            }
            if (b13) {
                m();
            }
        } finally {
            if (f0Var != null) {
                f0Var.f();
            }
        }
    }

    public final h h() {
        int i13 = j.f99700b[this.f99729r.ordinal()];
        i iVar = this.f99712a;
        if (i13 == 1) {
            return new h0(iVar, this);
        }
        if (i13 == 2) {
            return new e(iVar.a(), iVar, this);
        }
        if (i13 == 3) {
            return new k0(iVar, this);
        }
        if (i13 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f99729r);
    }

    public final n i(n nVar) {
        int i13 = j.f99700b[nVar.ordinal()];
        if (i13 == 1) {
            switch (((q) this.f99725n).f99743d) {
                case 1:
                    return i(n.DATA_CACHE);
                default:
                    return n.DATA_CACHE;
            }
        }
        if (i13 == 2) {
            return this.f99732u ? n.FINISHED : n.SOURCE;
        }
        if (i13 == 3 || i13 == 4) {
            return n.FINISHED;
        }
        if (i13 == 5) {
            switch (((q) this.f99725n).f99743d) {
                case 1:
                case 2:
                    return i(n.RESOURCE_CACHE);
                default:
                    return n.RESOURCE_CACHE;
            }
        }
        throw new IllegalArgumentException("Unrecognized stage: " + nVar);
    }

    public final void j(long j13, String str, String str2) {
        StringBuilder D = ep.b.D(str, " in ");
        D.append(he.i.a(j13));
        D.append(", load key: ");
        D.append(this.f99722k);
        D.append(str2 != null ? ", ".concat(str2) : "");
        D.append(", thread: ");
        D.append(Thread.currentThread().getName());
        Log.v("DecodeJob", D.toString());
    }

    public final void k(g0 g0Var, nd.a aVar, boolean z13) {
        q();
        w wVar = (w) this.f99727p;
        synchronized (wVar) {
            wVar.f99783q = g0Var;
            wVar.f99784r = aVar;
            wVar.f99791y = z13;
        }
        synchronized (wVar) {
            try {
                wVar.f99768b.a();
                if (wVar.f99790x) {
                    wVar.f99783q.c();
                    wVar.g();
                    return;
                }
                if (wVar.f99767a.f99765a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (wVar.f99785s) {
                    throw new IllegalStateException("Already have resource");
                }
                wc.j jVar = wVar.f99771e;
                g0 g0Var2 = wVar.f99783q;
                boolean z14 = wVar.f99779m;
                nd.h hVar = wVar.f99778l;
                z zVar = wVar.f99769c;
                jVar.getClass();
                wVar.f99788v = new a0(g0Var2, z14, true, hVar, zVar);
                wVar.f99785s = true;
                v vVar = wVar.f99767a;
                vVar.getClass();
                ArrayList<u> arrayList = new ArrayList(vVar.f99765a);
                wVar.e(arrayList.size() + 1);
                ((t) wVar.f99772f).d(wVar, wVar.f99778l, wVar.f99788v);
                for (u uVar : arrayList) {
                    uVar.f99764b.execute(new lb.x(4, wVar, uVar.f99763a));
                }
                wVar.d();
            } finally {
            }
        }
    }

    public final void l() {
        boolean b13;
        q();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f99713b));
        w wVar = (w) this.f99727p;
        synchronized (wVar) {
            wVar.f99786t = glideException;
        }
        synchronized (wVar) {
            try {
                wVar.f99768b.a();
                if (wVar.f99790x) {
                    wVar.g();
                } else {
                    if (wVar.f99767a.f99765a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (wVar.f99787u) {
                        throw new IllegalStateException("Already failed once");
                    }
                    wVar.f99787u = true;
                    nd.h hVar = wVar.f99778l;
                    v vVar = wVar.f99767a;
                    vVar.getClass();
                    ArrayList<u> arrayList = new ArrayList(vVar.f99765a);
                    wVar.e(arrayList.size() + 1);
                    ((t) wVar.f99772f).d(wVar, hVar, null);
                    for (u uVar : arrayList) {
                        uVar.f99764b.execute(new androidx.appcompat.widget.j(15, wVar, uVar.f99763a));
                    }
                    wVar.d();
                }
            } finally {
            }
        }
        o7.f fVar = this.f99718g;
        synchronized (fVar) {
            fVar.f93048c = true;
            b13 = fVar.b();
        }
        if (b13) {
            m();
        }
    }

    public final void m() {
        o7.f fVar = this.f99718g;
        synchronized (fVar) {
            fVar.f93047b = false;
            fVar.f93046a = false;
            fVar.f93048c = false;
        }
        l lVar = this.f99717f;
        lVar.f99709a = null;
        lVar.f99710b = null;
        lVar.f99711c = null;
        i iVar = this.f99712a;
        iVar.f99674c = null;
        iVar.f99675d = null;
        iVar.f99685n = null;
        iVar.f99678g = null;
        iVar.f99682k = null;
        iVar.f99680i = null;
        iVar.f99686o = null;
        iVar.f99681j = null;
        iVar.f99687p = null;
        iVar.f99672a.clear();
        iVar.f99683l = false;
        iVar.f99673b.clear();
        iVar.f99684m = false;
        this.D = false;
        this.f99719h = null;
        this.f99720i = null;
        this.f99726o = null;
        this.f99721j = null;
        this.f99722k = null;
        this.f99727p = null;
        this.f99729r = null;
        this.C = null;
        this.f99734w = null;
        this.f99735x = null;
        this.f99737z = null;
        this.A = null;
        this.B = null;
        this.f99731t = 0L;
        this.E = false;
        this.f99713b.clear();
        this.f99716e.a(this);
    }

    public final void n(m mVar) {
        this.f99730s = mVar;
        w wVar = (w) this.f99727p;
        (wVar.f99780n ? wVar.f99775i : wVar.f99781o ? wVar.f99776j : wVar.f99774h).execute(this);
    }

    public final void o() {
        this.f99734w = Thread.currentThread();
        int i13 = he.i.f68949b;
        this.f99731t = SystemClock.elapsedRealtimeNanos();
        boolean z13 = false;
        while (!this.E && this.C != null && !(z13 = this.C.b())) {
            this.f99729r = i(this.f99729r);
            this.C = h();
            if (this.f99729r == n.SOURCE) {
                n(m.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f99729r == n.FINISHED || this.E) && !z13) {
            l();
        }
    }

    public final void p() {
        int i13 = j.f99699a[this.f99730s.ordinal()];
        if (i13 == 1) {
            this.f99729r = i(n.INITIALIZE);
            this.C = h();
            o();
        } else if (i13 == 2) {
            o();
        } else if (i13 == 3) {
            g();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f99730s);
        }
    }

    public final void q() {
        this.f99714c.a();
        if (this.D) {
            throw new IllegalStateException("Already notified", this.f99713b.isEmpty() ? null : (Throwable) ep.b.h(this.f99713b, 1));
        }
        this.D = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.B;
        try {
            try {
                try {
                    if (this.E) {
                        l();
                        if (eVar != null) {
                            eVar.b();
                            return;
                        }
                        return;
                    }
                    p();
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (d e13) {
                    throw e13;
                }
            } catch (Throwable th3) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + this.f99729r, th3);
                }
                if (this.f99729r != n.ENCODE) {
                    this.f99713b.add(th3);
                    l();
                }
                if (!this.E) {
                    throw th3;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            if (eVar != null) {
                eVar.b();
            }
            throw th4;
        }
    }
}
