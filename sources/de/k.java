package de;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.s;
import com.bumptech.glide.load.engine.GlideException;
import he.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kh2.a1;
import pd.g0;
import pd.t;
import pd.w;

/* loaded from: classes.dex */
public final class k implements c, ee.h, i {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;

    /* renamed from: a, reason: collision with root package name */
    public final String f54515a;

    /* renamed from: b, reason: collision with root package name */
    public final ie.e f54516b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54517c;

    /* renamed from: d, reason: collision with root package name */
    public final g f54518d;

    /* renamed from: e, reason: collision with root package name */
    public final e f54519e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f54520f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.f f54521g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f54522h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f54523i;

    /* renamed from: j, reason: collision with root package name */
    public final a f54524j;

    /* renamed from: k, reason: collision with root package name */
    public final int f54525k;

    /* renamed from: l, reason: collision with root package name */
    public final int f54526l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.h f54527m;

    /* renamed from: n, reason: collision with root package name */
    public final ee.i f54528n;

    /* renamed from: o, reason: collision with root package name */
    public final List f54529o;

    /* renamed from: p, reason: collision with root package name */
    public final fe.e f54530p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f54531q;

    /* renamed from: r, reason: collision with root package name */
    public g0 f54532r;

    /* renamed from: s, reason: collision with root package name */
    public pd.l f54533s;

    /* renamed from: t, reason: collision with root package name */
    public long f54534t;

    /* renamed from: u, reason: collision with root package name */
    public volatile t f54535u;

    /* renamed from: v, reason: collision with root package name */
    public j f54536v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f54537w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f54538x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f54539y;

    /* renamed from: z, reason: collision with root package name */
    public int f54540z;

    public k(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class cls, a aVar, int i13, int i14, com.bumptech.glide.h hVar, ee.i iVar, f fVar2, ArrayList arrayList, e eVar, t tVar, fe.e eVar2, s sVar) {
        this.f54515a = D ? String.valueOf(hashCode()) : null;
        this.f54516b = new ie.e();
        this.f54517c = obj;
        this.f54520f = context;
        this.f54521g = fVar;
        this.f54522h = obj2;
        this.f54523i = cls;
        this.f54524j = aVar;
        this.f54525k = i13;
        this.f54526l = i14;
        this.f54527m = hVar;
        this.f54528n = iVar;
        this.f54518d = fVar2;
        this.f54529o = arrayList;
        this.f54519e = eVar;
        this.f54535u = tVar;
        this.f54530p = eVar2;
        this.f54531q = sVar;
        this.f54536v = j.PENDING;
        if (this.C == null && fVar.f29774h.f75176a.containsKey(com.bumptech.glide.d.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // de.c
    public final boolean a() {
        boolean z13;
        synchronized (this.f54517c) {
            z13 = this.f54536v == j.COMPLETE;
        }
        return z13;
    }

    public final void b() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f54516b.a();
        this.f54528n.g(this);
        pd.l lVar = this.f54533s;
        if (lVar != null) {
            synchronized (((t) lVar.f99711c)) {
                ((w) lVar.f99709a).h((i) lVar.f99710b);
            }
            this.f54533s = null;
        }
    }

    @Override // de.c
    public final boolean c(c cVar) {
        int i13;
        int i14;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i15;
        int i16;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(cVar instanceof k)) {
            return false;
        }
        synchronized (this.f54517c) {
            try {
                i13 = this.f54525k;
                i14 = this.f54526l;
                obj = this.f54522h;
                cls = this.f54523i;
                aVar = this.f54524j;
                hVar = this.f54527m;
                List list = this.f54529o;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        k kVar = (k) cVar;
        synchronized (kVar.f54517c) {
            try {
                i15 = kVar.f54525k;
                i16 = kVar.f54526l;
                obj2 = kVar.f54522h;
                cls2 = kVar.f54523i;
                aVar2 = kVar.f54524j;
                hVar2 = kVar.f54527m;
                List list2 = kVar.f54529o;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i13 == i15 && i14 == i16) {
            char[] cArr = n.f68959a;
            if (obj != null ? obj.equals(obj2) : obj2 == null) {
                if (cls.equals(cls2) && (aVar != null ? aVar.j(aVar2) : aVar2 == null) && hVar == hVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // de.c
    public final void clear() {
        synchronized (this.f54517c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f54516b.a();
                j jVar = this.f54536v;
                j jVar2 = j.CLEARED;
                if (jVar == jVar2) {
                    return;
                }
                b();
                g0 g0Var = this.f54532r;
                if (g0Var != null) {
                    this.f54532r = null;
                } else {
                    g0Var = null;
                }
                e eVar = this.f54519e;
                if (eVar == null || eVar.g(this)) {
                    this.f54528n.m(e());
                }
                this.f54536v = jVar2;
                if (g0Var != null) {
                    this.f54535u.getClass();
                    t.f(g0Var);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Drawable d() {
        int i13;
        if (this.f54539y == null) {
            a aVar = this.f54524j;
            Drawable drawable = aVar.f54489o;
            this.f54539y = drawable;
            if (drawable == null && (i13 = aVar.f54490p) > 0) {
                this.f54539y = g(i13);
            }
        }
        return this.f54539y;
    }

    public final Drawable e() {
        int i13;
        if (this.f54538x == null) {
            a aVar = this.f54524j;
            Drawable drawable = aVar.f54481g;
            this.f54538x = drawable;
            if (drawable == null && (i13 = aVar.f54482h) > 0) {
                this.f54538x = g(i13);
            }
        }
        return this.f54538x;
    }

    public final boolean f() {
        e eVar = this.f54519e;
        return eVar == null || !eVar.e().a();
    }

    public final Drawable g(int i13) {
        Resources.Theme theme = this.f54524j.f54495u;
        Context context = this.f54520f;
        if (theme == null) {
            theme = context.getTheme();
        }
        return a1.B(context, i13, theme);
    }

    @Override // de.c
    public final boolean h() {
        boolean z13;
        synchronized (this.f54517c) {
            z13 = this.f54536v == j.CLEARED;
        }
        return z13;
    }

    @Override // de.c
    public final boolean i() {
        boolean z13;
        synchronized (this.f54517c) {
            z13 = this.f54536v == j.COMPLETE;
        }
        return z13;
    }

    @Override // de.c
    public final boolean isRunning() {
        boolean z13;
        synchronized (this.f54517c) {
            try {
                j jVar = this.f54536v;
                z13 = jVar == j.RUNNING || jVar == j.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z13;
    }

    @Override // de.c
    public final void j() {
        e eVar;
        synchronized (this.f54517c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f54516b.a();
                int i13 = he.i.f68949b;
                this.f54534t = SystemClock.elapsedRealtimeNanos();
                if (this.f54522h == null) {
                    if (n.j(this.f54525k, this.f54526l)) {
                        this.f54540z = this.f54525k;
                        this.A = this.f54526l;
                    }
                    m(new GlideException("Received null model"), d() == null ? 5 : 3);
                    return;
                }
                j jVar = this.f54536v;
                if (jVar == j.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (jVar == j.COMPLETE) {
                    o(this.f54532r, nd.a.MEMORY_CACHE, false);
                    return;
                }
                List<g> list = this.f54529o;
                if (list != null) {
                    for (g gVar : list) {
                    }
                }
                j jVar2 = j.WAITING_FOR_SIZE;
                this.f54536v = jVar2;
                if (n.j(this.f54525k, this.f54526l)) {
                    p(this.f54525k, this.f54526l);
                } else {
                    this.f54528n.k(this);
                }
                j jVar3 = this.f54536v;
                if ((jVar3 == j.RUNNING || jVar3 == jVar2) && ((eVar = this.f54519e) == null || eVar.k(this))) {
                    this.f54528n.j(e());
                }
                if (D) {
                    k("finished run method in " + he.i.a(this.f54534t));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(String str) {
        StringBuilder D2 = ep.b.D(str, " this: ");
        D2.append(this.f54515a);
        Log.v("GlideRequest", D2.toString());
    }

    public final void l(GlideException glideException) {
        m(glideException, 5);
    }

    public final void m(GlideException glideException, int i13) {
        int i14;
        this.f54516b.a();
        synchronized (this.f54517c) {
            try {
                glideException.getClass();
                int i15 = this.f54521g.f29775i;
                if (i15 <= i13) {
                    Log.w("Glide", "Load failed for [" + this.f54522h + "] with dimensions [" + this.f54540z + "x" + this.A + "]", glideException);
                    if (i15 <= 4) {
                        glideException.e();
                    }
                }
                this.f54533s = null;
                this.f54536v = j.FAILED;
                e eVar = this.f54519e;
                if (eVar != null) {
                    eVar.b(this);
                }
                this.B = true;
                try {
                    List<g> list = this.f54529o;
                    if (list != null) {
                        for (g gVar : list) {
                            ee.i iVar = this.f54528n;
                            f();
                            gVar.a(glideException, iVar);
                        }
                    }
                    g gVar2 = this.f54518d;
                    if (gVar2 != null) {
                        ee.i iVar2 = this.f54528n;
                        f();
                        gVar2.a(glideException, iVar2);
                    }
                    e eVar2 = this.f54519e;
                    if (eVar2 == null || eVar2.k(this)) {
                        Drawable d2 = this.f54522h == null ? d() : null;
                        if (d2 == null) {
                            if (this.f54537w == null) {
                                a aVar = this.f54524j;
                                Drawable drawable = aVar.f54479e;
                                this.f54537w = drawable;
                                if (drawable == null && (i14 = aVar.f54480f) > 0) {
                                    this.f54537w = g(i14);
                                }
                            }
                            d2 = this.f54537w;
                        }
                        if (d2 == null) {
                            d2 = e();
                        }
                        this.f54528n.s(d2);
                    }
                    this.B = false;
                } catch (Throwable th3) {
                    this.B = false;
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void n(g0 g0Var, Object obj, nd.a aVar) {
        boolean f13 = f();
        this.f54536v = j.COMPLETE;
        this.f54532r = g0Var;
        if (this.f54521g.f29775i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f54522h + " with size [" + this.f54540z + "x" + this.A + "] in " + he.i.a(this.f54534t) + " ms");
        }
        e eVar = this.f54519e;
        if (eVar != null) {
            eVar.f(this);
        }
        this.B = true;
        try {
            List list = this.f54529o;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).c(obj, this.f54522h, this.f54528n, aVar, f13);
                }
            }
            g gVar = this.f54518d;
            if (gVar != null) {
                gVar.c(obj, this.f54522h, this.f54528n, aVar, f13);
            }
            this.f54528n.z(obj, this.f54530p.a(aVar));
            this.B = false;
        } catch (Throwable th3) {
            this.B = false;
            throw th3;
        }
    }

    public final void o(g0 g0Var, nd.a aVar, boolean z13) {
        this.f54516b.a();
        g0 g0Var2 = null;
        try {
            synchronized (this.f54517c) {
                try {
                    this.f54533s = null;
                    if (g0Var == null) {
                        l(new GlideException("Expected to receive a Resource<R> with an object of " + this.f54523i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = g0Var.get();
                    try {
                        if (obj != null && this.f54523i.isAssignableFrom(obj.getClass())) {
                            e eVar = this.f54519e;
                            if (eVar == null || eVar.d(this)) {
                                n(g0Var, obj, aVar);
                                return;
                            }
                            this.f54532r = null;
                            this.f54536v = j.COMPLETE;
                            this.f54535u.getClass();
                            t.f(g0Var);
                            return;
                        }
                        this.f54532r = null;
                        StringBuilder sb3 = new StringBuilder("Expected to receive an object of ");
                        sb3.append(this.f54523i);
                        sb3.append(" but instead got ");
                        sb3.append(obj != null ? obj.getClass() : "");
                        sb3.append("{");
                        sb3.append(obj);
                        sb3.append("} inside Resource{");
                        sb3.append(g0Var);
                        sb3.append("}.");
                        sb3.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        l(new GlideException(sb3.toString()));
                        this.f54535u.getClass();
                        t.f(g0Var);
                    } catch (Throwable th3) {
                        g0Var2 = g0Var;
                        th = th3;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            if (g0Var2 != null) {
                this.f54535u.getClass();
                t.f(g0Var2);
            }
            throw th5;
        }
    }

    public final void p(int i13, int i14) {
        Object obj;
        int i15 = i13;
        this.f54516b.a();
        Object obj2 = this.f54517c;
        synchronized (obj2) {
            try {
                try {
                    boolean z13 = D;
                    if (z13) {
                        k("Got onSizeReady in " + he.i.a(this.f54534t));
                    }
                    if (this.f54536v == j.WAITING_FOR_SIZE) {
                        j jVar = j.RUNNING;
                        this.f54536v = jVar;
                        float f13 = this.f54524j.f54476b;
                        if (i15 != Integer.MIN_VALUE) {
                            i15 = Math.round(i15 * f13);
                        }
                        this.f54540z = i15;
                        this.A = i14 == Integer.MIN_VALUE ? i14 : Math.round(f13 * i14);
                        if (z13) {
                            k("finished setup for calling load in " + he.i.a(this.f54534t));
                        }
                        t tVar = this.f54535u;
                        com.bumptech.glide.f fVar = this.f54521g;
                        Object obj3 = this.f54522h;
                        a aVar = this.f54524j;
                        try {
                            obj = obj2;
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                        try {
                            this.f54533s = tVar.a(fVar, obj3, aVar.f54486l, this.f54540z, this.A, aVar.f54493s, this.f54523i, this.f54527m, aVar.f54477c, aVar.f54492r, aVar.f54487m, aVar.f54499y, aVar.f54491q, aVar.f54483i, aVar.f54497w, aVar.f54500z, aVar.f54498x, this, this.f54531q);
                            if (this.f54536v != jVar) {
                                this.f54533s = null;
                            }
                            if (z13) {
                                k("finished onSizeReady in " + he.i.a(this.f54534t));
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    obj = obj2;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    @Override // de.c
    public final void pause() {
        synchronized (this.f54517c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f54517c) {
            obj = this.f54522h;
            cls = this.f54523i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
