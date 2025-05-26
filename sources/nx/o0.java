package nx;

import com.pinterest.api.model.f30;
import h32.d4;
import h32.z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes.dex */
public final class o0 implements e0 {

    /* renamed from: i, reason: collision with root package name */
    public static final o0 f92437i = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f92438a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f92439b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final s0 f92440c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f92441d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f92442e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f92443f;

    /* renamed from: g, reason: collision with root package name */
    public m0 f92444g;

    /* renamed from: h, reason: collision with root package name */
    public lh0.m f92445h;

    public o0() {
        s0 s0Var = new s0(this);
        this.f92440c = s0Var;
        this.f92441d = new ArrayList();
        this.f92442e = new ArrayList();
        this.f92443f = new ArrayList();
        s0Var.g();
    }

    public static void b(ArrayList arrayList, n0 n0Var) {
        arrayList.size();
        arrayList.clear();
    }

    public static boolean e(h32.w0 w0Var) {
        d4 d4Var;
        h32.i0 i0Var = w0Var.f67330h;
        if (i0Var == null || (d4Var = i0Var.f67081a) == null) {
            return false;
        }
        h32.f1 f1Var = h32.f1.TIMED_PAIR_BEGIN;
        h32.f1 f1Var2 = w0Var.f67324b;
        return (f1Var2 == f1Var || f1Var2 == h32.f1.TIMED_PAIR_END) && d4Var == d4.OFF_PINTEREST;
    }

    public static boolean f(h32.w0 w0Var) {
        h32.f1 f1Var = h32.f1.STORY_PIN_CREATE;
        h32.f1 f1Var2 = w0Var.f67324b;
        return f1Var2 == f1Var || f1Var2 == h32.f1.STORY_PIN_CREATE_FAILURE || f1Var2 == h32.f1.STORY_PIN_CREATE_CANCELLED || f1Var2 == h32.f1.STORY_PIN_EDIT || f1Var2 == h32.f1.STORY_PIN_EDIT_FAILURE || f1Var2 == h32.f1.STORY_PIN_EDIT_CANCELLED;
    }

    public static boolean j(h32.w0 w0Var) {
        return f(w0Var) || e(w0Var);
    }

    public static void l(d0 pinalytics, d1 trackingParamAttacher, List items) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.isEmpty()) {
            return;
        }
        for (Object obj : items) {
            if (obj instanceof f30) {
                trackingParamAttacher.h(pinalytics, (f30) obj);
            }
        }
    }

    public final void a(z1 z1Var) {
        String str = z1Var.f67482c;
        if (str == null || str.length() == 0) {
            return;
        }
        ArrayList arrayList = this.f92441d;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final synchronized void c() {
        this.f92440c.f92464i = true;
        hb0.g gVar = hb0.f.f68518a;
        Timer timer = gVar.f68521c;
        if (timer != null) {
            timer.schedule(new hb0.e(gVar, (Object) null), 0L);
        }
    }

    public final a d() {
        ArrayList arrayList = this.f92438a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (a) arrayList.get(0);
    }

    public final void g(ArrayList boardImpressions) {
        Intrinsics.checkNotNullParameter(boardImpressions, "boardImpressions");
        Iterator it = boardImpressions.iterator();
        while (it.hasNext()) {
            String str = ((h32.t) it.next()).f67244a;
            if (str != null && str.length() != 0) {
                this.f92442e.remove(str);
            }
        }
    }

    public final void h(z1 z1Var) {
        String str = z1Var.f67482c;
        if (str == null || str.length() == 0) {
            return;
        }
        ArrayList arrayList = this.f92441d;
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        }
    }

    public final boolean i(h32.w0 w0Var) {
        h32.i0 i0Var;
        lh0.m mVar = this.f92445h;
        if (mVar != null) {
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) mVar.f83420a;
            if (g1Var.o("cli_fast_flush_events", "enabled", z3Var) || g1Var.l("cli_fast_flush_events")) {
                return jk.v.d0(w0Var);
            }
        }
        return (w0Var.f67324b == h32.f1.VIEW && (i0Var = w0Var.f67330h) != null && i0Var.f67081a == d4.PIN) || f(w0Var) || e(w0Var);
    }

    public final h32.w0 k(h32.w0 source) {
        Intrinsics.checkNotNullParameter(source, "event");
        Intrinsics.checkNotNullParameter(source, "source");
        kotlin.collections.z0.d();
        Long l13 = source.f67323a;
        h32.f1 f1Var = source.f67324b;
        h32.w0 w0Var = new h32.w0(l13, f1Var, source.f67325c, source.f67326d, source.f67327e, source.f67328f, source.f67329g, source.f67330h, source.f67331i, source.f67332j, source.f67333k, source.f67334l, source.f67335m, source.f67336n, source.f67337o, source.f67338p, source.f67339q, source.f67340r, source.f67341s, source.f67342t, source.f67343u, source.f67344v, source.f67345w, source.f67346x, source.f67347y, source.f67348z, source.A, source.B, source.C, source.D, source.E, UUID.randomUUID().toString(), source.G, source.H, source.I, source.f67322J, source.K);
        synchronized (this) {
            try {
                this.f92439b.add(w0Var);
                m0 m0Var = this.f92444g;
                if (m0Var != null) {
                    ((vx.d) m0Var).a(w0Var);
                }
                if (i(w0Var)) {
                    if (j(w0Var)) {
                        this.f92440c.e();
                    } else {
                        this.f92440c.f92464i = true;
                        hb0.g gVar = hb0.f.f68518a;
                        Timer timer = gVar.f68521c;
                        if (timer != null) {
                            timer.schedule(new hb0.e(gVar, (Object) null), 0L);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        String T = df.j1.T("Event: %s", f1Var != null ? f1Var.toString() : "");
        try {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.h(T);
        } catch (Exception unused) {
        }
        return w0Var;
    }
}
