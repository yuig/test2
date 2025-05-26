package i2;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o2 extends w {

    /* renamed from: v, reason: collision with root package name */
    public static final do2.t2 f71206v = do2.u2.a(o2.b.f92792e);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f71207w = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final j f71208a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f71209b;

    /* renamed from: c, reason: collision with root package name */
    public ao2.o1 f71210c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f71211d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f71212e;

    /* renamed from: f, reason: collision with root package name */
    public List f71213f;

    /* renamed from: g, reason: collision with root package name */
    public g1.g0 f71214g;

    /* renamed from: h, reason: collision with root package name */
    public final k2.e f71215h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f71216i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f71217j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f71218k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f71219l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f71220m;

    /* renamed from: n, reason: collision with root package name */
    public Set f71221n;

    /* renamed from: o, reason: collision with root package name */
    public ao2.m f71222o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.appcompat.app.x0 f71223p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f71224q;

    /* renamed from: r, reason: collision with root package name */
    public final do2.t2 f71225r;

    /* renamed from: s, reason: collision with root package name */
    public final ao2.p1 f71226s;

    /* renamed from: t, reason: collision with root package name */
    public final CoroutineContext f71227t;

    /* renamed from: u, reason: collision with root package name */
    public final h1.b f71228u;

    public o2(CoroutineContext coroutineContext) {
        int i13 = 4;
        j jVar = new j(new androidx.activity.a0(this, i13));
        this.f71208a = jVar;
        this.f71209b = new Object();
        this.f71212e = new ArrayList();
        this.f71214g = new g1.g0();
        this.f71215h = new k2.e(new i0[16]);
        this.f71216i = new ArrayList();
        this.f71217j = new ArrayList();
        this.f71218k = new LinkedHashMap();
        this.f71219l = new LinkedHashMap();
        this.f71225r = do2.u2.a(h2.Inactive);
        ao2.p1 p1Var = new ao2.p1((ao2.o1) coroutineContext.get(ao2.g0.f20154b));
        p1Var.invokeOnCompletion(new k1.s2(this, i13));
        this.f71226s = p1Var;
        this.f71227t = coroutineContext.plus(jVar).plus(p1Var);
        this.f71228u = new h1.b(this, 1);
    }

    public static final void C(ArrayList arrayList, o2 o2Var, i0 i0Var) {
        arrayList.clear();
        synchronized (o2Var.f71209b) {
            try {
                Iterator it = o2Var.f71217j.iterator();
                while (it.hasNext()) {
                    k1 k1Var = (k1) it.next();
                    k1Var.getClass();
                    if (Intrinsics.d(null, i0Var)) {
                        arrayList.add(k1Var);
                        it.remove();
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static /* synthetic */ void F(o2 o2Var, Exception exc, boolean z13, int i13) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        o2Var.E(exc, null, z13);
    }

    public static final i0 s(o2 o2Var, i0 i0Var, g1.g0 g0Var) {
        s2.c D;
        z zVar = (z) i0Var;
        if (zVar.f71419s.E || zVar.f71421u) {
            return null;
        }
        Set set = o2Var.f71221n;
        int i13 = 1;
        if (set != null && set.contains(i0Var)) {
            return null;
        }
        k1.s2 s2Var = new k1.s2(i0Var, 5);
        i iVar = new i(i13, i0Var, g0Var);
        s2.i k13 = s2.p.k();
        s2.c cVar = k13 instanceof s2.c ? (s2.c) k13 : null;
        if (cVar == null || (D = cVar.D(s2Var, iVar)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            s2.i j13 = D.j();
            try {
                if (g0Var.c()) {
                    j2 j2Var = new j2(0, g0Var, i0Var);
                    s sVar = ((z) i0Var).f71419s;
                    if (!(!sVar.E)) {
                        u.i("Preparing a composition while composing is not supported");
                        throw null;
                    }
                    sVar.E = true;
                    try {
                        j2Var.invoke();
                        sVar.E = false;
                    } catch (Throwable th3) {
                        sVar.E = false;
                        throw th3;
                    }
                }
                boolean y13 = ((z) i0Var).y();
                s2.i.p(j13);
                if (!y13) {
                    i0Var = null;
                }
                return i0Var;
            } catch (Throwable th4) {
                s2.i.p(j13);
                throw th4;
            }
        } finally {
            u(D);
        }
    }

    public static final boolean t(o2 o2Var) {
        boolean z13;
        List A;
        synchronized (o2Var.f71209b) {
            z13 = true;
            if (!o2Var.f71214g.b()) {
                k2.g gVar = new k2.g(o2Var.f71214g);
                o2Var.f71214g = new g1.g0();
                synchronized (o2Var.f71209b) {
                    A = o2Var.A();
                }
                try {
                    int size = A.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((z) ((i0) A.get(i13))).z(gVar);
                        if (((h2) o2Var.f71225r.getValue()).compareTo(h2.ShuttingDown) <= 0) {
                            break;
                        }
                    }
                    synchronized (o2Var.f71209b) {
                        o2Var.f71214g = new g1.g0();
                        Unit unit = Unit.f80348a;
                    }
                    synchronized (o2Var.f71209b) {
                        if (o2Var.x() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                        if (!o2Var.f71215h.m() && !o2Var.y()) {
                            z13 = false;
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (o2Var.f71209b) {
                        o2Var.f71214g.e(gVar);
                        throw th3;
                    }
                }
            } else if (!o2Var.f71215h.m() && !o2Var.y()) {
                z13 = false;
            }
        }
        return z13;
    }

    public static void u(s2.c cVar) {
        try {
            if (cVar.w() instanceof s2.j) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            cVar.c();
        }
    }

    public final List A() {
        List list = this.f71213f;
        if (list == null) {
            ArrayList arrayList = this.f71212e;
            list = arrayList.isEmpty() ? kotlin.collections.q0.f80391a : new ArrayList(arrayList);
            this.f71213f = list;
        }
        return list;
    }

    public final void B(i0 i0Var) {
        synchronized (this.f71209b) {
            ArrayList arrayList = this.f71217j;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (Intrinsics.d(((k1) arrayList.get(i13)).a(), i0Var)) {
                    Unit unit = Unit.f80348a;
                    ArrayList arrayList2 = new ArrayList();
                    C(arrayList2, this, i0Var);
                    while (!arrayList2.isEmpty()) {
                        D(arrayList2, null);
                        C(arrayList2, this, i0Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
    
        r1 = r7.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (r6 >= r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        if (((kotlin.Pair) r7.get(r6)).f80347b == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        if (r8 >= r6) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        r9 = (kotlin.Pair) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (r9.f80347b != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        r9 = (i2.k1) r9.f80346a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
    
        r6 = r13.f71209b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        kotlin.collections.k0.u(r1, r13.f71217j);
        r1 = kotlin.Unit.f80348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
    
        if (r8 >= r6) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r9 = r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (((kotlin.Pair) r9).f80347b == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0127, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List D(java.util.List r14, g1.g0 r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.o2.D(java.util.List, g1.g0):java.util.List");
    }

    public final void E(Exception exc, i0 i0Var, boolean z13) {
        if (!((Boolean) f71207w.get()).booleanValue() || (exc instanceof ComposeRuntimeError)) {
            synchronized (this.f71209b) {
                androidx.appcompat.app.x0 x0Var = this.f71223p;
                if (x0Var != null) {
                    throw x0Var.e();
                }
                this.f71223p = new androidx.appcompat.app.x0(false, (Serializable) exc);
                Unit unit = Unit.f80348a;
            }
            throw exc;
        }
        synchronized (this.f71209b) {
            try {
                int i13 = c.f71081b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f71216i.clear();
                this.f71215h.h();
                this.f71214g = new g1.g0();
                this.f71217j.clear();
                this.f71218k.clear();
                this.f71219l.clear();
                this.f71223p = new androidx.appcompat.app.x0(z13, exc);
                if (i0Var != null) {
                    G(i0Var);
                }
                x();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void G(i0 i0Var) {
        ArrayList arrayList = this.f71220m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f71220m = arrayList;
        }
        if (!arrayList.contains(i0Var)) {
            arrayList.add(i0Var);
        }
        this.f71212e.remove(i0Var);
        this.f71213f = null;
    }

    @Override // i2.w
    public final void a(i0 i0Var, q2.h hVar) {
        s2.c D;
        boolean z13 = ((z) i0Var).f71419s.E;
        int i13 = 1;
        try {
            k1.s2 s2Var = new k1.s2(i0Var, 5);
            i iVar = new i(i13, i0Var, null);
            s2.i k13 = s2.p.k();
            s2.c cVar = k13 instanceof s2.c ? (s2.c) k13 : null;
            if (cVar == null || (D = cVar.D(s2Var, iVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                s2.i j13 = D.j();
                try {
                    z zVar = (z) i0Var;
                    zVar.m(hVar);
                    Unit unit = Unit.f80348a;
                    if (!z13) {
                        s2.p.k().m();
                    }
                    synchronized (this.f71209b) {
                        if (((h2) this.f71225r.getValue()).compareTo(h2.ShuttingDown) > 0 && !A().contains(i0Var)) {
                            this.f71212e.add(i0Var);
                            this.f71213f = null;
                        }
                    }
                    try {
                        B(i0Var);
                        try {
                            zVar.h();
                            zVar.j();
                            if (z13) {
                                return;
                            }
                            s2.p.k().m();
                        } catch (Exception e13) {
                            F(this, e13, false, 6);
                        }
                    } catch (Exception e14) {
                        E(e14, i0Var, true);
                    }
                } finally {
                    s2.i.p(j13);
                }
            } finally {
                u(D);
            }
        } catch (Exception e15) {
            E(e15, i0Var, true);
        }
    }

    @Override // i2.w
    public final boolean c() {
        return ((Boolean) f71207w.get()).booleanValue();
    }

    @Override // i2.w
    public final boolean d() {
        return false;
    }

    @Override // i2.w
    public final boolean e() {
        return false;
    }

    @Override // i2.w
    public final int g() {
        return 1000;
    }

    @Override // i2.w
    public final CoroutineContext h() {
        return this.f71227t;
    }

    @Override // i2.w
    public final void i(i0 i0Var) {
        ao2.m mVar;
        synchronized (this.f71209b) {
            if (this.f71215h.i(i0Var)) {
                mVar = null;
            } else {
                this.f71215h.b(i0Var);
                mVar = x();
            }
        }
        if (mVar != null) {
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(Unit.f80348a);
        }
    }

    @Override // i2.w
    public final j1 j(k1 k1Var) {
        j1 j1Var;
        synchronized (this.f71209b) {
            j1Var = (j1) this.f71219l.remove(k1Var);
        }
        return j1Var;
    }

    @Override // i2.w
    public final void k(Set set) {
    }

    @Override // i2.w
    public final void m(i0 i0Var) {
        synchronized (this.f71209b) {
            try {
                Set set = this.f71221n;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f71221n = set;
                }
                set.add(i0Var);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // i2.w
    public final void p(i0 i0Var) {
        synchronized (this.f71209b) {
            this.f71212e.remove(i0Var);
            this.f71213f = null;
            this.f71215h.n(i0Var);
            this.f71216i.remove(i0Var);
            Unit unit = Unit.f80348a;
        }
    }

    public final void v() {
        synchronized (this.f71209b) {
            try {
                if (((h2) this.f71225r.getValue()).compareTo(h2.Idle) >= 0) {
                    this.f71225r.i(h2.ShuttingDown);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f71226s.cancel((CancellationException) null);
    }

    public final void w() {
        this.f71212e.clear();
        this.f71213f = kotlin.collections.q0.f80391a;
    }

    public final ao2.m x() {
        h2 h2Var;
        do2.t2 t2Var = this.f71225r;
        int compareTo = ((h2) t2Var.getValue()).compareTo(h2.ShuttingDown);
        ArrayList arrayList = this.f71217j;
        ArrayList arrayList2 = this.f71216i;
        k2.e eVar = this.f71215h;
        if (compareTo <= 0) {
            w();
            this.f71214g = new g1.g0();
            eVar.h();
            arrayList2.clear();
            arrayList.clear();
            this.f71220m = null;
            ao2.m mVar = this.f71222o;
            if (mVar != null) {
                mVar.cancel(null);
            }
            this.f71222o = null;
            this.f71223p = null;
            return null;
        }
        if (this.f71223p != null) {
            h2Var = h2.Inactive;
        } else if (this.f71210c == null) {
            this.f71214g = new g1.g0();
            eVar.h();
            h2Var = y() ? h2.InactivePendingWork : h2.Inactive;
        } else {
            h2Var = (eVar.m() || this.f71214g.c() || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || y()) ? h2.PendingWork : h2.Idle;
        }
        t2Var.i(h2Var);
        if (h2Var != h2.PendingWork) {
            return null;
        }
        ao2.m mVar2 = this.f71222o;
        this.f71222o = null;
        return mVar2;
    }

    public final boolean y() {
        return (this.f71224q || this.f71208a.f71137f.get() == 0) ? false : true;
    }

    public final boolean z() {
        boolean z13;
        synchronized (this.f71209b) {
            if (!this.f71214g.c() && !this.f71215h.m()) {
                z13 = y();
            }
        }
        return z13;
    }
}
