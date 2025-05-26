package hc2;

import a7.a0;
import a7.c0;
import a7.d0;
import a7.e0;
import a7.i0;
import a7.w;
import a7.y;
import a7.z;
import android.net.Uri;
import android.util.Size;
import androidx.media3.exoplayer.ExoPlayer;
import ey.b0;
import ey.t4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.k4;
import m7.l0;
import pk.v2;
import tu1.u;
import xk2.v;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ac2.l f68741a;

    /* renamed from: b, reason: collision with root package name */
    public final b20.c f68742b;

    /* renamed from: c, reason: collision with root package name */
    public final p f68743c;

    /* renamed from: d, reason: collision with root package name */
    public final k4 f68744d;

    /* renamed from: e, reason: collision with root package name */
    public l0 f68745e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f68746f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f68747g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f68748h;

    /* renamed from: i, reason: collision with root package name */
    public i f68749i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f68750j;

    /* renamed from: k, reason: collision with root package name */
    public final v f68751k;

    public d(ac2.l playerPool, b20.c prefetchConfig, p prefetchTracker, k4 videoExperiments) {
        Intrinsics.checkNotNullParameter(playerPool, "playerPool");
        Intrinsics.checkNotNullParameter(prefetchConfig, "prefetchConfig");
        Intrinsics.checkNotNullParameter(prefetchTracker, "prefetchTracker");
        Intrinsics.checkNotNullParameter(videoExperiments, "videoExperiments");
        this.f68741a = playerPool;
        this.f68742b = prefetchConfig;
        this.f68743c = prefetchTracker;
        this.f68744d = videoExperiments;
        this.f68746f = new LinkedHashMap();
        this.f68747g = new LinkedHashMap();
        this.f68748h = new ArrayList();
        this.f68751k = xk2.m.b(new u(this, 11));
        a();
        sq0.a aVar = new sq0.a(this, 9);
        new t4(80, ((Boolean) ((xk2.k) prefetchConfig.f21278a).getValue()).booleanValue() ? 10000L : 5000L, b0.TAG_VIDEO_PREFETCH, aVar, true, true, false, false).c();
    }

    public static void a() {
        vb0.j.f125466a.P("cachingPrefetcher", tb0.p.VIDEO_PLAYER);
    }

    public final a b() {
        boolean c13 = c();
        ArrayList arrayList = this.f68748h;
        int i13 = 0;
        if (!c13) {
            if (arrayList.isEmpty()) {
                return null;
            }
            return new a(0, (c) arrayList.get(0));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i14 = i13 + 1;
            c cVar = (c) it.next();
            bc2.j V = d7.b.V(cVar.f());
            LinkedHashMap linkedHashMap = this.f68747g;
            if (!linkedHashMap.containsKey(V)) {
                return new a(i13, cVar);
            }
            if (linkedHashMap.containsKey(V) && linkedHashMap.get(V) == null) {
                return new a(i13, cVar);
            }
            i13 = i14;
        }
        return null;
    }

    public final boolean c() {
        return ((Boolean) this.f68751k.getValue()).booleanValue();
    }

    public final ExoPlayer d(c cVar) {
        a();
        boolean c13 = c();
        ac2.l lVar = this.f68741a;
        if (!c13) {
            l0 l0Var = this.f68745e;
            if (l0Var != null) {
                return l0Var;
            }
            l0 g13 = ((dc2.m) lVar).g();
            this.f68745e = g13;
            return g13;
        }
        bc2.j V = d7.b.V(cVar.f());
        LinkedHashMap linkedHashMap = this.f68746f;
        if (linkedHashMap.containsKey(V) && linkedHashMap.get(V) != null) {
            return (ExoPlayer) z0.e(V, linkedHashMap);
        }
        l0 g14 = ((dc2.m) lVar).g();
        linkedHashMap.put(V, g14);
        return g14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        a7.b0 b0Var;
        d0 d0Var;
        a();
        ArrayList arrayList = this.f68748h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (!c()) {
            if (this.f68749i != null || !this.f68750j) {
                return;
            }
            this.f68742b.getClass();
            if (!b20.c.p()) {
                return;
            }
        }
        a b13 = b();
        if ((b13 != null ? b13.b() : null) == null) {
            return;
        }
        c b14 = b13.b();
        arrayList.remove(b13.a());
        b14.f();
        q e13 = b14.e();
        Size a13 = b14.a();
        Objects.toString(e13);
        Objects.toString(a13);
        j jVar = new j(b14.g(), bc2.m.GRID, b14.g().f22673b.f22668e, -1);
        ExoPlayer d2 = d(b14);
        i iVar = new i(b14, d2, this.f68743c, new b(this));
        if (c()) {
            bc2.j V = d7.b.V(b14.f());
            LinkedHashMap linkedHashMap = this.f68747g;
            if (!(!linkedHashMap.containsKey(V))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            linkedHashMap.put(V, iVar);
        } else {
            this.f68749i = iVar;
        }
        w wVar = new w();
        z zVar = new z();
        List emptyList = Collections.emptyList();
        v2 v2Var = v2.f100502e;
        a7.b0 b0Var2 = new a7.b0();
        e0 e0Var = e0.f982d;
        String f13 = b14.f();
        Uri parse = f13 == null ? null : Uri.parse(f13);
        String b15 = b14.b();
        b15.getClass();
        bf.b.t(zVar.f1244b == null || zVar.f1243a != null);
        if (parse != null) {
            a0 a14 = zVar.f1243a != null ? zVar.a() : null;
            b0Var = b0Var2;
            d0Var = new d0(parse, null, a14, emptyList, null, v2Var, jVar, -9223372036854775807L);
        } else {
            b0Var = b0Var2;
            d0Var = null;
        }
        i0 i0Var = new i0(b15, new y(wVar), d0Var, new c0(b0Var), a7.l0.I, e0Var);
        Intrinsics.checkNotNullExpressionValue(i0Var, "build(...)");
        l0 l0Var = (l0) d2;
        l0Var.L0();
        k8.y yVar = l0Var.f86269j;
        if (yVar instanceof mc2.a) {
            if (b14.e() == q.GRID_PREFETCH) {
                ((mc2.a) yVar).m(i0Var, b14.d(), b14.a().getWidth());
            } else {
                ((mc2.a) yVar).l(i0Var);
            }
        } else {
            if (!(yVar instanceof k8.q)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            k8.q qVar = (k8.q) yVar;
            qVar.f78572i = b14.f();
            k8.j a15 = qVar.a();
            a15.getClass();
            k8.i iVar2 = new k8.i(a15);
            int width = b14.a().getWidth();
            int height = b14.a().getHeight();
            iVar2.f994a = width;
            iVar2.f995b = height;
            iVar2.d(!b14.d());
            qVar.i(new k8.j(iVar2));
        }
        ((a7.h) d2).e0(i0Var);
        l0Var.b();
    }

    public final void f() {
        a();
        this.f68748h.clear();
        if (c()) {
            LinkedHashMap linkedHashMap = this.f68747g;
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((i) ((Map.Entry) it.next()).getValue()).a();
            }
            linkedHashMap.clear();
            Iterator it2 = this.f68746f.entrySet().iterator();
            while (it2.hasNext()) {
                l0 l0Var = (l0) ((ExoPlayer) ((Map.Entry) it2.next()).getValue());
                l0Var.stop();
                l0Var.e();
            }
            return;
        }
        i iVar = this.f68749i;
        if (iVar != null) {
            iVar.a();
        }
        this.f68749i = null;
        l0 l0Var2 = this.f68745e;
        if (l0Var2 != null) {
            l0Var2.stop();
        }
        l0 l0Var3 = this.f68745e;
        if (l0Var3 != null) {
            l0Var3.e();
        }
    }
}
