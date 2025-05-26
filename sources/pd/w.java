package pd;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class w implements k, ie.b {

    /* renamed from: z, reason: collision with root package name */
    public static final wc.j f99766z = new wc.j(3);

    /* renamed from: a, reason: collision with root package name */
    public final v f99767a;

    /* renamed from: b, reason: collision with root package name */
    public final ie.e f99768b;

    /* renamed from: c, reason: collision with root package name */
    public final z f99769c;

    /* renamed from: d, reason: collision with root package name */
    public final p5.d f99770d;

    /* renamed from: e, reason: collision with root package name */
    public final wc.j f99771e;

    /* renamed from: f, reason: collision with root package name */
    public final x f99772f;

    /* renamed from: g, reason: collision with root package name */
    public final sd.d f99773g;

    /* renamed from: h, reason: collision with root package name */
    public final sd.d f99774h;

    /* renamed from: i, reason: collision with root package name */
    public final sd.d f99775i;

    /* renamed from: j, reason: collision with root package name */
    public final sd.d f99776j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f99777k;

    /* renamed from: l, reason: collision with root package name */
    public nd.h f99778l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f99779m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f99780n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f99781o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f99782p;

    /* renamed from: q, reason: collision with root package name */
    public g0 f99783q;

    /* renamed from: r, reason: collision with root package name */
    public nd.a f99784r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f99785s;

    /* renamed from: t, reason: collision with root package name */
    public GlideException f99786t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f99787u;

    /* renamed from: v, reason: collision with root package name */
    public a0 f99788v;

    /* renamed from: w, reason: collision with root package name */
    public o f99789w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f99790x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f99791y;

    public w(sd.d dVar, sd.d dVar2, sd.d dVar3, sd.d dVar4, x xVar, z zVar, p5.d dVar5) {
        wc.j jVar = f99766z;
        this.f99767a = new v(new ArrayList(2));
        this.f99768b = new ie.e();
        this.f99777k = new AtomicInteger();
        this.f99773g = dVar;
        this.f99774h = dVar2;
        this.f99775i = dVar3;
        this.f99776j = dVar4;
        this.f99772f = xVar;
        this.f99769c = zVar;
        this.f99770d = dVar5;
        this.f99771e = jVar;
    }

    public final synchronized void a(de.i iVar, Executor executor) {
        try {
            this.f99768b.a();
            v vVar = this.f99767a;
            vVar.getClass();
            vVar.f99765a.add(new u(iVar, executor));
            if (this.f99785s) {
                e(1);
                executor.execute(new lb.x(4, this, iVar));
            } else if (this.f99787u) {
                e(1);
                executor.execute(new androidx.appcompat.widget.j(15, this, iVar));
            } else {
                d7.b.n("Cannot add callbacks to a cancelled EngineJob", !this.f99790x);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // ie.b
    public final ie.e b() {
        return this.f99768b;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.f99790x = true;
        o oVar = this.f99789w;
        oVar.E = true;
        h hVar = oVar.C;
        if (hVar != null) {
            hVar.cancel();
        }
        x xVar = this.f99772f;
        nd.h hVar2 = this.f99778l;
        t tVar = (t) xVar;
        synchronized (tVar) {
            d0 d0Var = tVar.f99755a;
            d0Var.getClass();
            Map map = this.f99782p ? d0Var.f99642b : d0Var.f99641a;
            if (equals(map.get(hVar2))) {
                map.remove(hVar2);
            }
        }
    }

    public final void d() {
        a0 a0Var;
        synchronized (this) {
            try {
                this.f99768b.a();
                d7.b.n("Not yet complete!", f());
                int decrementAndGet = this.f99777k.decrementAndGet();
                d7.b.n("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    a0Var = this.f99788v;
                    g();
                } else {
                    a0Var = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (a0Var != null) {
            a0Var.f();
        }
    }

    public final synchronized void e(int i13) {
        a0 a0Var;
        d7.b.n("Not yet complete!", f());
        if (this.f99777k.getAndAdd(i13) == 0 && (a0Var = this.f99788v) != null) {
            a0Var.b();
        }
    }

    public final boolean f() {
        return this.f99787u || this.f99785s || this.f99790x;
    }

    public final synchronized void g() {
        boolean b13;
        if (this.f99778l == null) {
            throw new IllegalArgumentException();
        }
        this.f99767a.f99765a.clear();
        this.f99778l = null;
        this.f99788v = null;
        this.f99783q = null;
        this.f99787u = false;
        this.f99790x = false;
        this.f99785s = false;
        this.f99791y = false;
        o oVar = this.f99789w;
        o7.f fVar = oVar.f99718g;
        synchronized (fVar) {
            fVar.f93046a = true;
            b13 = fVar.b();
        }
        if (b13) {
            oVar.m();
        }
        this.f99789w = null;
        this.f99786t = null;
        this.f99784r = null;
        this.f99770d.a(this);
    }

    public final synchronized void h(de.i iVar) {
        try {
            this.f99768b.a();
            v vVar = this.f99767a;
            vVar.f99765a.remove(new u(iVar, he.g.f68947b));
            if (this.f99767a.f99765a.isEmpty()) {
                c();
                if (!this.f99785s) {
                    if (this.f99787u) {
                    }
                }
                if (this.f99777k.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
