package lh0;

import android.os.Looper;
import android.util.Pair;
import com.pinterest.error.NetworkResponseError;
import ey.t4;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import so.na;

/* loaded from: classes.dex */
public final class g1 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final m60.e f83350b;

    /* renamed from: c, reason: collision with root package name */
    public final lb0.g f83351c;

    /* renamed from: d, reason: collision with root package name */
    public final wk2.a f83352d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f83353e;

    /* renamed from: f, reason: collision with root package name */
    public final tb0.h f83354f;

    /* renamed from: g, reason: collision with root package name */
    public final bk.f f83355g;

    /* renamed from: h, reason: collision with root package name */
    public final wk2.a f83356h;

    /* renamed from: i, reason: collision with root package name */
    public final i92.a f83357i;

    /* renamed from: j, reason: collision with root package name */
    public final Function2 f83358j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f83359k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f83360l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f83361m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f83362n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f83363o;

    /* renamed from: p, reason: collision with root package name */
    public final nh0.a f83364p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f83365q;

    /* renamed from: r, reason: collision with root package name */
    public final ConcurrentHashMap f83366r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f83367s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f83368t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f83369u;

    public g1(g4.b pinnerExperimentsOverrides, m60.e applicationInfo, lb0.g diskCache, na experimentsApiProvider, m60.w eventManager, tb0.h crashReporting, bk.f headSpinOverridable, na preferencesProvider, i92.a baseToastUtils, p1.p1 onExperimentActivated) {
        String str;
        Intrinsics.checkNotNullParameter(pinnerExperimentsOverrides, "pinnerExperimentsOverrides");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        Intrinsics.checkNotNullParameter(experimentsApiProvider, "experimentsApiProvider");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(headSpinOverridable, "headSpinOverridable");
        Intrinsics.checkNotNullParameter(preferencesProvider, "preferencesProvider");
        Intrinsics.checkNotNullParameter(baseToastUtils, "baseToastUtils");
        Intrinsics.checkNotNullParameter(onExperimentActivated, "onExperimentActivated");
        this.f83350b = applicationInfo;
        this.f83351c = diskCache;
        this.f83352d = experimentsApiProvider;
        this.f83353e = eventManager;
        this.f83354f = crashReporting;
        this.f83355g = headSpinOverridable;
        this.f83356h = preferencesProvider;
        this.f83357i = baseToastUtils;
        ((m60.d) applicationInfo).g();
        boolean b13 = ff0.j.b();
        this.f83359k = b13;
        this.f83360l = xk2.m.b(new c1(this, 0));
        xk2.v b14 = xk2.m.b(new c1(this, 1));
        this.f83362n = new HashSet();
        this.f83363o = new Object();
        this.f83364p = new nh0.a();
        this.f83365q = new HashSet();
        this.f83366r = new ConcurrentHashMap();
        HashMap hashMap = new HashMap();
        this.f83367s = hashMap;
        new HashMap();
        this.f83368t = new HashMap();
        this.f83369u = new AtomicBoolean(false);
        if (!ff0.j.b() && Looper.getMainLooper() != null && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.".toString());
        }
        diskCache.getClass();
        vd0.c e13 = lb0.g.e("MY_EXPERIMENTS");
        if (e13 != null) {
            m(nh0.b.a(e13), a1.DISK_CACHE);
        }
        if (b13) {
            Object value = b14.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            if (((lb0.b) ((lb0.o) value)).e("PREF_EXPERIMENT_OVERRIDE_IS_PERSISTENT", true)) {
                Object f13 = lb0.g.f("OVERRIDDEN_EXPERIMENTS");
                if (f13 != null) {
                    hashMap.clear();
                    hashMap.putAll((HashMap) f13);
                }
                Object value2 = b14.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                this.f83361m = ((lb0.b) ((lb0.o) value2)).e("PREF_ALL_EXPERIMENTS_DISABLED", false);
            } else {
                lb0.g.a("OVERRIDDEN_EXPERIMENTS");
            }
            if (b13) {
                if (this.f83361m) {
                    str = "All Experiments Disabled";
                } else if (!hashMap.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder("Overridden Experiments:");
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append("<br/>• " + entry.getKey() + " = " + entry.getValue());
                    }
                    str = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    i92.a.a(this.f83357i, str, true, 2);
                }
            }
        }
        ((m60.d) this.f83350b).f85896f.getClass();
        ((m60.d) this.f83350b).f85896f.getClass();
        ((m60.d) this.f83350b).g();
        ((m60.d) this.f83350b).f85896f.getClass();
    }

    public static final void a(g1 g1Var, Throwable throwable) {
        g1Var.getClass();
        boolean z13 = throwable instanceof NetworkResponseError;
        tb0.h hVar = g1Var.f83354f;
        if (z13) {
            v.f1 f1Var = ((NetworkResponseError) throwable).f45043a;
            if (f1Var != null) {
                tb0.k kVar = new tb0.k();
                kVar.c("ResponseCode", String.valueOf(f1Var.f123449b));
                hVar.k("ExperimentsGateKeeperLoadFailure", kVar.f117102a);
            }
        } else if (rl2.g0.Y(throwable)) {
            tb0.k kVar2 = new tb0.k();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            kVar2.a(null, null, throwable);
            hVar.k("ExperimentsGatekeeperParseFailure", kVar2.f117102a);
        }
        g1Var.f83353e.d(new b1());
    }

    public static final void b(g1 g1Var, nh0.a aVar) {
        g1Var.getClass();
        g1Var.m(aVar, a1.NETWORK);
        g1Var.f83353e.d(new b1());
    }

    public final void c(String experimentName) {
        Intrinsics.checkNotNullParameter(experimentName, "experiment");
        ((m60.d) this.f83350b).g();
        if (e(experimentName)) {
            oh0.g i13 = i();
            i13.getClass();
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            synchronized (i13.f94473d) {
                i13.f94473d.add(experimentName);
            }
            if (i13.f94474e.compareAndSet(false, true)) {
                int i14 = 48;
                new t4(i14, ey.b0.TAG_ACTIVATE_EXPERIMENTS, new androidx.activity.d(i13, 29), false, true).c();
            } else if (i13.f94475f.get()) {
                xj2.c cVar = i13.f94476g;
                if (cVar != null) {
                    cVar.dispose();
                }
                i13.f94476g = i13.f94477h.m(4L, TimeUnit.SECONDS, tk2.e.f118016b).F(new ug0.d(10, new oh0.f(i13, 2)), new ug0.d(11, new oh0.f(i13, 3)), ck2.i.f27923c, ck2.i.f27924d);
                i13.f94477h.c(Unit.f80348a);
            }
            jk2.q0 q0Var = new jk2.q0(i13.f94472c.I(1L), new ir.j(19, oh0.e.f94467i));
            Intrinsics.checkNotNullExpressionValue(q0Var, "flatMapCompletable(...)");
            fk2.c l13 = q0Var.l(tk2.e.f118017c);
            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
            nl.b.r(l13, null, new i2.i(17, this, experimentName), 1);
        }
    }

    public final void d(String experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        ((m60.d) this.f83350b).g();
        if (e(experiment)) {
            fk2.c l13 = i().a(experiment).l(tk2.e.f118017c);
            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
            nl.b.r(l13, null, new gd0.c(14, this, experiment), 1);
        }
    }

    public final boolean e(String str) {
        synchronized (this.f83363o) {
            if (!this.f83362n.contains(str)) {
                z0.f83518a.getClass();
                if (g(str, y0.f83512b) != null) {
                    this.f83362n.add(str);
                    return true;
                }
            }
            return false;
        }
    }

    public final fk2.g f() {
        oh0.g i13 = i();
        i13.getClass();
        fk2.g i14 = new kk2.g(new kk2.g((c60.d.b() ? i13.f94470a : i13.f94471b).b().r(tk2.e.f118017c).l(wj2.c.a()), new dh0.a(6, new d1(this, 0)), 3), new dh0.a(7, new d1(this, 1)), 1).i();
        Intrinsics.checkNotNullExpressionValue(i14, "ignoreElement(...)");
        return i14;
    }

    public final String g(String experiment, z3 activate) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return h(experiment, activate);
    }

    public final String h(String experiment, z3 activate) {
        boolean z13;
        String str;
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(activate, "activate");
        boolean z14 = this.f83359k;
        if (z14) {
            if (this.f83361m) {
                return null;
            }
            if (ff0.j.b()) {
                return (String) this.f83368t.get(experiment);
            }
        }
        this.f83355g.getClass();
        boolean z15 = ff0.j.f62103a;
        HashMap hashMap = z14 ? this.f83367s : null;
        String str2 = hashMap != null ? (String) hashMap.get(experiment) : null;
        boolean z16 = true;
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = null;
            }
            str = str2;
            z13 = true;
        } else {
            z13 = false;
            str = null;
        }
        ConcurrentHashMap concurrentHashMap = this.f83366r;
        String str3 = (String) concurrentHashMap.get(experiment);
        String str4 = "";
        if (z13 || str3 == null) {
            z16 = z13;
        } else {
            str = Intrinsics.d("", str3) ? null : str3;
        }
        if (!z16) {
            str = (String) this.f83364p.get(experiment);
            concurrentHashMap.put(experiment, str == null ? "" : str);
        }
        z0.f83518a.getClass();
        if (activate == y0.f83513c) {
            ((m60.d) this.f83350b).g();
            if (str != null) {
                c(experiment);
                str4 = "_activated";
            }
        }
        if (str != null && str.length() != 0) {
            this.f83354f.n(experiment, str.concat(str4));
        }
        return str;
    }

    public final oh0.g i() {
        Object value = this.f83360l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (oh0.g) value;
    }

    public final AbstractMap j() {
        HashMap hashMap = this.f83359k ? this.f83367s : null;
        nh0.a aVar = this.f83364p;
        return hashMap != null ? kotlin.collections.z0.j(aVar, hashMap) : aVar;
    }

    public final boolean k(String experiment, String group, z3 activate) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        String g13 = g(experiment, activate);
        return g13 != null && kotlin.text.z.i(g13, group, true);
    }

    public final boolean l(String experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        z0.f83518a.getClass();
        z3 z3Var = y0.f83512b;
        return k(experiment, "employees", z3Var) || k(experiment, "employee", z3Var);
    }

    public final void m(nh0.a upcomingUserExperiments, a1 source) {
        Intrinsics.checkNotNullParameter(upcomingUserExperiments, "upcomingUserExperiments");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!ff0.j.b() && Looper.getMainLooper() != null && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.".toString());
        }
        a1 a1Var = a1.NETWORK;
        if (source != a1Var && this.f83365q.contains(a1Var)) {
            this.f83354f.h(df.j1.W("Ignoring experiments data from source %d because server data has already returned.", Integer.valueOf(source.ordinal())));
            return;
        }
        if (source == a1.DISK_CACHE) {
            this.f83354f.m("ExperimentsLoadFromCache", kotlin.collections.e0.b(new Pair("num_experiments", String.valueOf(upcomingUserExperiments.size()))), 0.001f);
        }
        this.f83365q.add(source);
        this.f83354f.s("ExperimentsLastDataSource", source.toString());
        this.f83364p.clear();
        this.f83364p.putAll(upcomingUserExperiments);
        if (source == a1Var) {
            this.f83369u.set(true);
            n00.b.f88765b = true;
        }
    }

    public final void n() {
        oh0.g i13 = i();
        i13.getClass();
        (c60.d.b() ? i13.f94470a : i13.f94471b).b().r(tk2.e.f118017c).l(wj2.c.a()).o(new ug0.d(8, new e1(this, 0)), new ug0.d(9, new e1(this, 1)));
    }

    public final boolean o(String experiment, String group, z3 activate) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        String g13 = g(experiment, activate);
        return g13 != null && kotlin.text.z.p(g13, group, false);
    }
}
