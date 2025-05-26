package dc2;

import a7.g1;
import a7.i0;
import ac2.f1;
import ac2.m0;
import ac2.n0;
import ac2.s;
import ac2.s0;
import ac2.t0;
import ac2.y0;
import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import com.pinterest.video.PoolStats;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k8.y;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lh0.k4;
import m60.f0;
import m60.z0;
import m7.l0;
import m7.n;
import m7.v;
import m7.w;
import m7.x;
import n7.c0;
import tb0.p;

/* loaded from: classes2.dex */
public final class m implements ac2.l {

    /* renamed from: a, reason: collision with root package name */
    public final e f54424a;

    /* renamed from: b, reason: collision with root package name */
    public final pb0.a f54425b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f54426c;

    /* renamed from: d, reason: collision with root package name */
    public final hc2.g f54427d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f54428e;

    /* renamed from: f, reason: collision with root package name */
    public final q f54429f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f54430g;

    /* renamed from: h, reason: collision with root package name */
    public final PoolStats f54431h;

    /* renamed from: i, reason: collision with root package name */
    public int f54432i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f54433j;

    public m(e playerFactory, pb0.a clock, n0 playerPoolConfig, hc2.g fastDashConfig, f1 subtitlesManager, q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(playerFactory, "playerFactory");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(playerPoolConfig, "playerPoolConfig");
        Intrinsics.checkNotNullParameter(fastDashConfig, "fastDashConfig");
        Intrinsics.checkNotNullParameter(subtitlesManager, "subtitlesManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f54424a = playerFactory;
        this.f54425b = clock;
        this.f54426c = playerPoolConfig;
        this.f54427d = fastDashConfig;
        this.f54428e = subtitlesManager;
        this.f54429f = prefsManagerPersisted;
        this.f54430g = new ArrayList();
        this.f54431h = new PoolStats(0, 0, 0, null, null, null, 63, null);
        f0.u0(this);
    }

    public static void a() {
        vb0.j.f125466a.P("PlayerPool", p.VIDEO_PLAYER);
    }

    public final void b() {
        a();
        ArrayList arrayList = this.f54430g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((s0) next).f2055c.b()) {
                arrayList2.add(next);
            }
        }
        i(0, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    public final k c(String str) {
        Object obj;
        s0 s0Var;
        s0 s0Var2;
        List e13 = e();
        if (e13.isEmpty()) {
            s0Var2 = null;
        } else {
            nc2.i g13 = se.l.g(str);
            if (g13 == nc2.i.UNKNOWN) {
                s0Var2 = (s0) CollectionsKt.firstOrNull(e13);
            } else {
                List list = e13;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((s0) obj).f2056d.a() == g13) {
                        break;
                    }
                }
                s0 s0Var3 = (s0) obj;
                if (s0Var3 == null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            s0Var = 0;
                            break;
                        }
                        s0Var = it2.next();
                        if (((s0) s0Var).f2056d.a() == null) {
                            break;
                        }
                    }
                    s0Var3 = s0Var;
                    if (s0Var3 == null) {
                        s0Var2 = (s0) CollectionsKt.firstOrNull(e13);
                    }
                }
                s0Var2 = s0Var3;
            }
        }
        if (s0Var2 != null) {
            return new k(s0Var2, false);
        }
        e eVar = this.f54424a;
        m7.q qVar = new m7.q(eVar.f54393a);
        qVar.f86358b.f53787a = 1;
        n e14 = eVar.e(false);
        c0 c0Var = new c0(d7.e.f53809a);
        s sVar = (s) eVar.f54395c.get();
        y h10 = eVar.h();
        boolean z13 = h10 instanceof mc2.a;
        k4 k4Var = eVar.f54398f;
        mc2.c cVar = z13 ? new mc2.c((mc2.a) h10, null, k4Var) : new mc2.c(null, (k8.q) h10, k4Var);
        Intrinsics.f(sVar);
        hc2.l a13 = eVar.a(sVar);
        a13.g(cVar);
        x xVar = new x(eVar.f54393a);
        xVar.f(qVar);
        xVar.d(e14);
        xVar.c((l8.e) eVar.f54394b.get());
        bf.b.t(!xVar.f86473v);
        xVar.f86459h = new w(c0Var, 0);
        xVar.e(a13);
        bf.b.t(!xVar.f86473v);
        xVar.f86456e = new v(h10, 2);
        bf.b.t(!xVar.f86473v);
        xVar.f86476y = false;
        xVar.b(eVar.c());
        Intrinsics.checkNotNullExpressionValue(xVar, "experimentalSetDynamicSchedulingEnabled(...)");
        l0 a14 = xVar.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        a14.f86272k0 = sVar;
        a14.C0(eVar.b());
        sVar.f2052k.getClass();
        mc2.a aVar = z13 ? (mc2.a) h10 : null;
        if (aVar != null) {
            aVar.n(a14.f86253b);
        }
        z0 z0Var = ff0.a.f62099a;
        WeakReference weakReference = new WeakReference(a14);
        q qVar2 = this.f54429f;
        pb0.a aVar2 = this.f54425b;
        PoolStats poolStats = this.f54431h;
        s0 s0Var4 = new s0(aVar2, weakReference, poolStats, qVar2);
        this.f54430g.add(s0Var4);
        poolStats.getPlayerCounter().onCreated();
        return new k(s0Var4, true);
    }

    public final int d() {
        ArrayList arrayList = this.f54430g;
        int i13 = 0;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((s0) it.next()).f2055c.b() && (i13 = i13 + 1) < 0) {
                    kotlin.collections.f0.o();
                    throw null;
                }
            }
        }
        return i13;
    }

    public final List e() {
        ArrayList arrayList = this.f54430g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            s0 s0Var = (s0) next;
            y0 y0Var = s0Var.f2055c;
            y0Var.getClass();
            if ((y0Var instanceof t0) && s0Var.f2053a.get() != null && s0Var.f2057e == null && !s0Var.f2058f) {
                arrayList2.add(next);
            }
        }
        return dl2.b.K2(arrayList2);
    }

    public final void f(s0 s0Var, String str, String str2, boolean z13, int i13, int i14, bc2.q qVar, bc2.m mVar) {
        hc2.j jVar = qVar != null ? new hc2.j(qVar, mVar, qVar.f22673b.f22668e, -1) : null;
        a7.v vVar = new a7.v();
        vVar.f1218b = str2 != null ? Uri.parse(str2) : null;
        str.getClass();
        vVar.f1217a = str;
        vVar.f1225i = jVar;
        Intrinsics.checkNotNullExpressionValue(vVar, "setTag(...)");
        this.f54428e.d(vVar, qVar, mVar);
        i0 a13 = vVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        l0 l0Var = (l0) s0Var.a();
        l0Var.L0();
        y yVar = l0Var.f86269j;
        if (yVar instanceof mc2.a) {
            if (mVar.isCloseup()) {
                mc2.a aVar = (mc2.a) yVar;
                g1 a14 = aVar.a();
                Intrinsics.checkNotNullExpressionValue(a14, "getParameters(...)");
                aVar.i(f1.e(a14, qVar, mVar));
                aVar.l(a13);
            } else {
                ((mc2.a) yVar).m(a13, z13, i13);
            }
        } else {
            if (!(yVar instanceof k8.q)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            k8.q qVar2 = (k8.q) yVar;
            qVar2.f78572i = str2;
            k8.j a15 = qVar2.a();
            a15.getClass();
            k8.i iVar = new k8.i(a15);
            iVar.f994a = i13;
            iVar.f995b = i14;
            iVar.d(!z13);
            qVar2.i(new k8.j(iVar));
            k8.j a16 = qVar2.a();
            Intrinsics.checkNotNullExpressionValue(a16, "getParameters(...)");
            g1 e13 = f1.e(a16, qVar, mVar);
            Intrinsics.g(e13, "null cannot be cast to non-null type androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters");
            qVar2.i((k8.j) e13);
        }
        m0.a(s0Var.a(), a13);
    }

    public final l0 g() {
        e eVar = this.f54424a;
        m7.q qVar = new m7.q(eVar.f54393a);
        qVar.f86362f = true;
        n e13 = eVar.e(true);
        s sVar = (s) eVar.f54395c.get();
        y h10 = eVar.h();
        boolean z13 = h10 instanceof mc2.a;
        k4 k4Var = eVar.f54398f;
        mc2.c cVar = z13 ? new mc2.c((mc2.a) h10, null, k4Var) : new mc2.c(null, (k8.q) h10, k4Var);
        Intrinsics.f(sVar);
        hc2.l a13 = eVar.a(sVar);
        a13.g(cVar);
        x xVar = new x(eVar.f54393a);
        xVar.f(qVar);
        xVar.d(e13);
        xVar.c((l8.e) eVar.f54394b.get());
        xVar.e(a13);
        bf.b.t(!xVar.f86473v);
        xVar.f86456e = new v(h10, 2);
        bf.b.t(!xVar.f86473v);
        xVar.f86476y = false;
        xVar.b(eVar.c());
        Intrinsics.checkNotNullExpressionValue(xVar, "experimentalSetDynamicSchedulingEnabled(...)");
        l0 a14 = xVar.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        a14.f86272k0 = sVar;
        a14.C0(eVar.b());
        sVar.f2052k.getClass();
        mc2.a aVar = z13 ? (mc2.a) h10 : null;
        if (aVar != null) {
            aVar.n(a14.f86253b);
        }
        return a14;
    }

    public final void h() {
        List e13 = e();
        this.f54426c.getClass();
        i(4, e13);
        ArrayList arrayList = this.f54430g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            s0 s0Var = (s0) next;
            if (!s0Var.f2055c.b() && (s0Var.f2057e != null || s0Var.f2058f)) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.size();
            i(0, arrayList2);
        }
    }

    public final void i(int i13, List list) {
        int size = list.size() - i13;
        if (size <= 0) {
            return;
        }
        for (s0 s0Var : CollectionsKt.z0(size, list)) {
            this.f54430g.remove(s0Var);
            Objects.toString(s0Var);
            s0Var.d(false);
            ExoPlayer exoPlayer = (ExoPlayer) s0Var.f2053a.get();
            if (exoPlayer != null) {
                ((l0) exoPlayer).a();
            }
            this.f54431h.getPlayerCounter().onReleased();
        }
    }

    public final void j() {
        a();
        if (!e().isEmpty()) {
            return;
        }
        int[] E0 = CollectionsKt.E0(ac2.g1.f1964a);
        Intrinsics.checkNotNullParameter(E0, "<this>");
        double d2 = 0.0d;
        int i13 = 0;
        for (int i14 : E0) {
            d2 += i14;
            i13++;
        }
        double d13 = i13 == 0 ? Double.NaN : d2 / i13;
        String str = (String) d7.b.F(d13 <= 0.5d ? kotlin.collections.f0.j("https://v1.pinimg.com/_/_/vwarm/warm.mp4", "https://v1.pinimg.com/_/_/vwarm/warm.mp4") : d13 <= 1.5d ? kotlin.collections.f0.j("https://v1.pinimg.com/_/_/vwarm/warm.mp4", "https://v1.pinimg.com/_/_/vwarm/warm.mpd") : kotlin.collections.f0.j("https://v1.pinimg.com/_/_/vwarm/warm.mpd", "https://v1.pinimg.com/_/_/vwarm/warm.mpd"));
        ac2.g1.f1965b = false;
        ac2.g1.f1966c = 0;
        k c13 = c(str);
        n0 n0Var = this.f54426c;
        n0Var.getClass();
        boolean d14 = this.f54424a.d(n0Var);
        s0 s0Var = c13.f54420a;
        s0Var.d(d14);
        f(s0Var, "", str, false, 0, 0, null, bc2.m.OTHER);
        ((l0) s0Var.a()).stop();
    }
}
