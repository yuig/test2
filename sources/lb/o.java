package lb;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import v.c2;

/* loaded from: classes.dex */
public final class o implements sb.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f82636l = kb.b0.h("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f82638b;

    /* renamed from: c, reason: collision with root package name */
    public final kb.d f82639c;

    /* renamed from: d, reason: collision with root package name */
    public final vb.b f82640d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f82641e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f82643g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f82642f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f82645i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f82646j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f82637a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f82647k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f82644h = new HashMap();

    public o(Context context, kb.d dVar, vb.b bVar, WorkDatabase workDatabase) {
        this.f82638b = context;
        this.f82639c = dVar;
        this.f82640d = bVar;
        this.f82641e = workDatabase;
    }

    public static boolean d(String str, a1 a1Var, int i13) {
        String str2 = f82636l;
        if (a1Var == null) {
            kb.b0.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        a1Var.c(i13);
        kb.b0.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f82647k) {
            this.f82646j.add(cVar);
        }
    }

    public final a1 b(String str) {
        a1 a1Var = (a1) this.f82642f.remove(str);
        boolean z13 = a1Var != null;
        if (!z13) {
            a1Var = (a1) this.f82643g.remove(str);
        }
        this.f82644h.remove(str);
        if (z13) {
            h();
        }
        return a1Var;
    }

    public final a1 c(String str) {
        a1 a1Var = (a1) this.f82642f.get(str);
        return a1Var == null ? (a1) this.f82643g.get(str) : a1Var;
    }

    public final boolean e(String str) {
        boolean z13;
        synchronized (this.f82647k) {
            z13 = c(str) != null;
        }
        return z13;
    }

    public final void f(c cVar) {
        synchronized (this.f82647k) {
            this.f82646j.remove(cVar);
        }
    }

    public final boolean g(t tVar, x92.b bVar) {
        tb.j jVar = tVar.f82669a;
        String str = jVar.f116981a;
        ArrayList arrayList = new ArrayList();
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        tb.s sVar = (tb.s) this.f82641e.p(new n(this, arrayList, str, 0));
        int i13 = 3;
        if (sVar == null) {
            kb.b0.e().i(f82636l, "Didn't find WorkSpec for id " + jVar);
            this.f82640d.f125447d.execute(new c2((Object) this, (Object) jVar, (boolean) (b15 == true ? 1 : 0), i13));
            return false;
        }
        synchronized (this.f82647k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.f82644h.get(str);
                    if (((t) set.iterator().next()).f82669a.f116982b == jVar.f116982b) {
                        set.add(tVar);
                        kb.b0.e().a(f82636l, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        this.f82640d.f125447d.execute(new c2((Object) this, (Object) jVar, (boolean) (b14 == true ? 1 : 0), i13));
                    }
                    return false;
                }
                if (sVar.f117035t != jVar.f116982b) {
                    this.f82640d.f125447d.execute(new c2((Object) this, (Object) jVar, (boolean) (b13 == true ? 1 : 0), i13));
                    return false;
                }
                p0 p0Var = new p0(this.f82638b, this.f82639c, this.f82640d, this, this.f82641e, sVar, arrayList);
                if (bVar != null) {
                    p0Var.f82660i = bVar;
                }
                a1 a1Var = new a1(p0Var);
                r4.l S = tb.f.S(a1Var.f82562e.f125445b.plus(ao2.m0.b()), new w0(a1Var, null));
                S.f106128b.d(new h6.o(this, S, a1Var, 8), this.f82640d.f125447d);
                this.f82643g.put(str, a1Var);
                HashSet hashSet = new HashSet();
                hashSet.add(tVar);
                this.f82644h.put(str, hashSet);
                kb.b0.e().a(f82636l, o.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void h() {
        synchronized (this.f82647k) {
            try {
                if (!(!this.f82642f.isEmpty())) {
                    try {
                        this.f82638b.startService(sb.c.c(this.f82638b));
                    } catch (Throwable th3) {
                        kb.b0.e().d(f82636l, "Unable to stop foreground service", th3);
                    }
                    PowerManager.WakeLock wakeLock = this.f82637a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f82637a = null;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
