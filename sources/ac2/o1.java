package ac2;

import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.BaseVideoView;
import ey.k3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import lh0.a4;
import lh0.k4;
import lh0.z3;

/* loaded from: classes2.dex */
public final class o1 implements m {
    public final LinkedHashMap A;
    public final xk2.v B;
    public j1 C;

    /* renamed from: a, reason: collision with root package name */
    public final l8.e f1998a;

    /* renamed from: b, reason: collision with root package name */
    public final vy.m f1999b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f2000c;

    /* renamed from: d, reason: collision with root package name */
    public final qc2.a f2001d;

    /* renamed from: e, reason: collision with root package name */
    public final k4 f2002e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2003f;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f2004g;

    /* renamed from: h, reason: collision with root package name */
    public final nc2.f f2005h;

    /* renamed from: i, reason: collision with root package name */
    public final dc2.m f2006i;

    /* renamed from: j, reason: collision with root package name */
    public final hc2.d f2007j;

    /* renamed from: k, reason: collision with root package name */
    public final jc2.c f2008k;

    /* renamed from: l, reason: collision with root package name */
    public final k3 f2009l;

    /* renamed from: m, reason: collision with root package name */
    public final lb0.q f2010m;

    /* renamed from: n, reason: collision with root package name */
    public final hc2.g f2011n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f2012o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f2013p;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f2014q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f2015r;

    /* renamed from: s, reason: collision with root package name */
    public final n1 f2016s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f2017t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f2018u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2019v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f2020w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2021x;

    /* renamed from: y, reason: collision with root package name */
    public final fl.q f2022y;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f2023z;

    public o1(l8.e bandwidthMeter, vy.m analyticsApi, nx.d0 topLevelPinalytics, qc2.d viewabilityCalculator, k4 experiments, k audioManager, f1 subtitlesManager, m60.b0 commonBackgroundDetector, nc2.f playabilityTracker, dc2.m playerPool, at1.d memoryEventDispatcher, hc2.d cachingPrefetcher, jc2.c videoPrepareQueue, k3 perfLogger, lb0.q prefsManagerPersisted, hc2.g fastDashConfig, h1 videoExperimentsHelper) {
        f videoManagerUtil = f.f1945a;
        Intrinsics.checkNotNullParameter(bandwidthMeter, "bandwidthMeter");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        Intrinsics.checkNotNullParameter(viewabilityCalculator, "viewabilityCalculator");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(subtitlesManager, "subtitlesManager");
        Intrinsics.checkNotNullParameter(commonBackgroundDetector, "commonBackgroundDetector");
        Intrinsics.checkNotNullParameter(playabilityTracker, "playabilityTracker");
        Intrinsics.checkNotNullParameter(playerPool, "playerPool");
        Intrinsics.checkNotNullParameter(memoryEventDispatcher, "memoryEventDispatcher");
        Intrinsics.checkNotNullParameter(cachingPrefetcher, "cachingPrefetcher");
        Intrinsics.checkNotNullParameter(videoPrepareQueue, "videoPrepareQueue");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(fastDashConfig, "fastDashConfig");
        Intrinsics.checkNotNullParameter(videoExperimentsHelper, "videoExperimentsHelper");
        this.f1998a = bandwidthMeter;
        this.f1999b = analyticsApi;
        this.f2000c = topLevelPinalytics;
        this.f2001d = viewabilityCalculator;
        this.f2002e = experiments;
        this.f2003f = audioManager;
        this.f2004g = subtitlesManager;
        this.f2005h = playabilityTracker;
        this.f2006i = playerPool;
        this.f2007j = cachingPrefetcher;
        this.f2008k = videoPrepareQueue;
        this.f2009l = perfLogger;
        this.f2010m = prefsManagerPersisted;
        this.f2011n = fastDashConfig;
        this.f2012o = new LinkedHashMap();
        this.f2013p = new LinkedHashMap();
        this.f2014q = new LinkedHashMap();
        int i13 = 0;
        this.f2015r = xk2.m.b(new k1(this, i13));
        l1 l1Var = new l1(this, i13);
        this.f2016s = new n1(this);
        this.f2017t = new Rect();
        this.f2018u = new LinkedHashSet();
        this.f2019v = true;
        this.f2020w = new LinkedHashMap();
        this.f2022y = new fl.q(25);
        this.f2023z = new Handler(Looper.getMainLooper());
        this.A = new LinkedHashMap();
        this.B = xk2.m.b(new k1(this, 1));
        vb0.j.f125466a.P("VideoManager", tb0.p.VIDEO_PLAYER);
        m60.f0.u0(this);
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        x7.n.f134048l = true;
        commonBackgroundDetector.a().o().F(new e82.o(8, new e82.l(this, 6)), new e82.o(9, g0.f1960n), ck2.i.f27923c, ck2.i.f27924d);
        Context context = kb0.a.f79058b;
        Object systemService = m60.f0.X().getSystemService("connectivity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(new rb.h(this, 2));
        memoryEventDispatcher.f(l1Var);
        nx.d0.v(topLevelPinalytics, h32.f1.VIDEO_MANAGER_SETUP, null, false, 12);
    }

    public static s81.g b(hc2.m mVar) {
        return new s81.g(mVar, 22);
    }

    public static void i(dc2.g gVar) {
        m7.l0 l0Var = (m7.l0) gVar.f54407a;
        l0Var.L0();
        k8.y yVar = l0Var.f86269j;
        Intrinsics.g(yVar, "null cannot be cast to non-null type androidx.media3.exoplayer.trackselection.DefaultTrackSelector");
        dl2.b.W2((k8.q) yVar, true);
    }

    public final void a(int i13, View view, oc2.j jVar) {
        this.f2013p.put(Integer.valueOf(i13), new WeakReference(jVar));
        if (view != null) {
            LinkedHashMap linkedHashMap = this.f2012o;
            Iterator it = kotlin.collections.b1.t(linkedHashMap).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) ((Pair) it.next()).f80346a).intValue();
                KeyEvent.Callback findViewById = view.findViewById(intValue);
                if (findViewById instanceof oc2.i) {
                    BaseVideoView baseVideoView = (BaseVideoView) ((oc2.i) findViewById);
                    baseVideoView.getClass();
                    Intrinsics.checkNotNullParameter("register", "msg");
                    ((PinterestVideoView) baseVideoView).q0().o(baseVideoView);
                }
                linkedHashMap.remove(Integer.valueOf(intValue));
            }
        }
        Set set = (Set) this.f2014q.get(Integer.valueOf(i13));
        if (set != null) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                o((oc2.i) it2.next());
            }
        }
        w();
    }

    public final x62.c c(hc2.m mVar, s81.g gVar) {
        return new x62.c(mVar, this, gVar, 2);
    }

    public final void d(int i13) {
        this.f2013p.remove(Integer.valueOf(i13));
        nc2.f fVar = this.f2005h;
        fVar.f90403c.remove(Integer.valueOf(i13));
        fVar.f90404d.remove(Integer.valueOf(i13));
        fVar.f90402b.remove(Integer.valueOf(i13));
        Set set = (Set) this.f2014q.get(Integer.valueOf(i13));
        if (set != null) {
            Iterator it = new HashSet(set).iterator();
            while (it.hasNext()) {
                oc2.i iVar = (oc2.i) it.next();
                Intrinsics.f(iVar);
                f(iVar);
            }
        }
        this.f2007j.f();
    }

    public final void e(int i13) {
        this.f2013p.remove(Integer.valueOf(i13));
        nc2.f fVar = this.f2005h;
        fVar.f90403c.remove(Integer.valueOf(i13));
        fVar.f90404d.remove(Integer.valueOf(i13));
        fVar.f90402b.remove(Integer.valueOf(i13));
        Integer valueOf = Integer.valueOf(i13);
        LinkedHashMap linkedHashMap = this.f2014q;
        Set set = (Set) linkedHashMap.get(valueOf);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                p((oc2.i) it.next(), e0.Other);
            }
            set.clear();
        }
    }

    public final void f(oc2.i videoView) {
        String str;
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Objects.toString(videoView);
        BaseVideoView baseVideoView = (BaseVideoView) videoView;
        if (baseVideoView.L == null || !baseVideoView.f52774J) {
            return;
        }
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Objects.toString(videoView);
        nc2.f fVar = this.f2005h;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        bc2.k kVar = baseVideoView.L;
        if (kVar != null && (str = kVar.f22657a) != null) {
            List list = (List) fVar.f90403c.get(Integer.valueOf(baseVideoView.S));
            if (list != null) {
                list.remove(str);
            }
            List list2 = (List) fVar.f90404d.get(Integer.valueOf(baseVideoView.S));
            if (list2 != null) {
                list2.remove(str);
            }
            List list3 = (List) fVar.f90402b.get(Integer.valueOf(baseVideoView.S));
            if (list3 != null) {
                list3.remove(str);
            }
        }
        baseVideoView.h0(baseVideoView.O.getThreshold());
        baseVideoView.f52774J = false;
        hc2.m mVar = baseVideoView.Q;
        ExoPlayer exoPlayer = mVar != null ? ((dc2.g) mVar).f54407a : null;
        dc2.m mVar2 = this.f2006i;
        mVar2.getClass();
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Iterator it = mVar2.f54430g.iterator();
        while (true) {
            if (it.hasNext()) {
                y0 y0Var = ((s0) it.next()).f2055c;
                if (y0Var instanceof w0) {
                    w0 w0Var = (w0) y0Var;
                    if ((w0Var.f2071b instanceof p0) && Intrinsics.d(w0Var.d().get(), videoView)) {
                        videoView.toString();
                        oc2.i.a(videoView);
                        if (exoPlayer != null) {
                            ((m7.l0) exoPlayer).b();
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter("stop", "msg");
                baseVideoView.W(false);
                hc2.m mVar3 = baseVideoView.Q;
                if (mVar3 != null) {
                    ((m7.l0) ((dc2.g) mVar3).f54407a).stop();
                }
            }
        }
        if (exoPlayer != null) {
            this.f2008k.c(exoPlayer);
        }
    }

    public final boolean g() {
        return ((Boolean) this.f2015r.getValue()).booleanValue();
    }

    public final boolean h() {
        return ((b) this.f2003f).f1939e > 0;
    }

    public final void j(o surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Objects.toString(surface);
        a(((PinCloseupFragment) surface).hashCode(), ((PinCloseupFragment) surface).getView(), (oc2.j) surface);
    }

    public final void k(oc2.j jVar) {
        if (jVar instanceof o) {
            return;
        }
        Objects.toString(jVar);
        if (jVar != null) {
            a(jVar.hashCode(), jVar.p5(), jVar);
        }
    }

    public final void l(o surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Objects.toString(surface);
        d(((PinCloseupFragment) surface).hashCode());
        bk.f.Y(this.f1999b);
    }

    public final void m(o surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Objects.toString(surface);
        e(((PinCloseupFragment) surface).hashCode());
    }

    public final void n(String mediaUid, bc2.q videoTracks, Size dimensions, boolean z13, int i13, hc2.q trigger) {
        Intrinsics.checkNotNullParameter(mediaUid, "mediaUid");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        hc2.d dVar = this.f2007j;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(mediaUid, "mediaUid");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Objects.toString(videoTracks);
        Objects.toString(trigger);
        hc2.d.a();
        dVar.f68742b.getClass();
        if (b20.c.p()) {
            dVar.f68748h.add(new hc2.c(mediaUid, videoTracks, dimensions, z13, i13, trigger));
            dVar.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x08cd, code lost:
    
        if (r9.b(r1, null, null) != null) goto L357;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0794  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(oc2.i r46) {
        /*
            Method dump skipped, instructions count: 2691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.o1.o(oc2.i):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(oc2.i videoView, e0 playerDisconnectReason) {
        a7.d0 d0Var;
        Objects.toString(videoView);
        f(videoView);
        BaseVideoView baseVideoView = (BaseVideoView) videoView;
        baseVideoView.U(false);
        hc2.m mVar = baseVideoView.Q;
        if (mVar != null) {
            dc2.g gVar = (dc2.g) mVar;
            Intrinsics.checkNotNullParameter(playerDisconnectReason, "playerDisconnectReason");
            gVar.f54412f.dispose();
            ExoPlayer player = gVar.f54407a;
            a7.i0 i13 = ((a7.h) player).i();
            Object obj = null;
            Object obj2 = (i13 == null || (d0Var = i13.f1073b) == null) ? null : d0Var.f975g;
            ic2.d dVar = gVar.f54408b;
            if (obj2 != null && (obj2 instanceof hc2.j)) {
                String url = ((hc2.j) obj2).f68763a.f22673b.f22665b;
                hc2.g gVar2 = gVar.f54411e;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                if (d7.b.f0(url) && gVar2.f68753a.c("matching_logs") && (playerDisconnectReason == e0.GridToCloseupPlayerReuse || playerDisconnectReason == e0.CloseupToGridPlayerReuse)) {
                    ic2.c cVar = (ic2.c) dVar;
                    m7.l0 l0Var = (m7.l0) player;
                    long X = l0Var.X();
                    cVar.f72109c.r(1, true, X, cVar.f72112f.f72105f, new ic2.b(1, true, cVar, X));
                    cVar.f72109c.u(l0Var.X(), cVar.f72112f.f72105f);
                }
            }
            m7.l0 l0Var2 = (m7.l0) player;
            ((ic2.c) dVar).c0(l0Var2.X(), playerDisconnectReason);
            Intrinsics.checkNotNullParameter(playerDisconnectReason, "playerDisconnectReason");
            g7.e eVar = l0Var2.f86272k0;
            if (eVar instanceof s) {
                ((s) eVar).d();
            }
            l0Var2.u0(dVar);
            this.f2008k.c(player);
            baseVideoView.c0(null);
            dc2.m mVar2 = this.f2006i;
            mVar2.getClass();
            Intrinsics.checkNotNullParameter(videoView, "videoView");
            Intrinsics.checkNotNullParameter(player, "player");
            dc2.m.a();
            Iterator it = mVar2.f54430g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((s0) next).f2053a.get(), player)) {
                    obj = next;
                    break;
                }
            }
            s0 s0Var = (s0) obj;
            if (s0Var == null) {
                return;
            }
            Objects.toString(player);
            s0Var.toString();
            y0 y0Var = s0Var.f2055c;
            if (!y0Var.b()) {
                vb0.j.f125466a.F("Expected state USED or REUSED but was " + y0Var, tb0.p.VIDEO_PLAYER, new Object[0]);
            }
            if (!(y0Var instanceof u0) || Intrinsics.d(((u0) y0Var).f2060a.get(), videoView)) {
                if (!(y0Var instanceof w0) || Intrinsics.d(((w0) y0Var).f2070a.get(), videoView)) {
                    s0Var.c();
                    ExoPlayer exoPlayer = (ExoPlayer) s0Var.f2053a.get();
                    if (exoPlayer != null && ((m7.l0) exoPlayer).M) {
                        mVar2.f54426c.getClass();
                    }
                    mVar2.h();
                }
            }
        }
    }

    public final void q() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2014q.entrySet().iterator();
        while (it.hasNext()) {
            kotlin.collections.k0.u((Set) ((Map.Entry) it.next()).getValue(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            BaseVideoView baseVideoView = (BaseVideoView) ((oc2.i) obj);
            if (baseVideoView.V() && baseVideoView.f52774J) {
                break;
            }
        }
        if (obj == null) {
            b bVar = (b) this.f2003f;
            bVar.f1936b.abandonAudioFocus(bVar);
        }
    }

    public final void r() {
        b bVar = (b) this.f2003f;
        bVar.f1936b.requestAudioFocus(bVar, 3, 2);
    }

    public final void s(PinterestVideoView videoView, boolean z13) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        PinterestVideoView pinterestVideoView = videoView instanceof PinterestVideoView ? videoView : null;
        if (pinterestVideoView != null) {
            pinterestVideoView.P(z13);
        }
        nc2.h.f90406b = z13;
        if (z13) {
            b bVar = (b) this.f2003f;
            bVar.f1936b.abandonAudioFocus(bVar);
            return;
        }
        if (videoView.f()) {
            r();
        }
        Set<oc2.i> set = (Set) this.f2014q.getOrDefault(Integer.valueOf(videoView.S), null);
        if (set != null) {
            for (oc2.i iVar : set) {
                if (!Intrinsics.d(iVar, videoView)) {
                    PinterestVideoView pinterestVideoView2 = iVar instanceof PinterestVideoView ? (PinterestVideoView) iVar : null;
                    if (pinterestVideoView2 != null) {
                        pinterestVideoView2.P(true);
                    }
                }
            }
        }
    }

    public final boolean t(bc2.k kVar) {
        k4 k4Var = this.f2002e;
        if (!k4Var.a() && !kVar.f22661e.f22679h.isPromoted()) {
            z3 z3Var = a4.f83297a;
            lh0.g1 g1Var = (lh0.g1) k4Var.f83410a;
            if (!g1Var.o("android_video_mp4_track_selector_unpin", "enabled", z3Var) && !g1Var.l("android_video_mp4_track_selector_unpin") && !g()) {
                return true;
            }
        }
        return false;
    }

    public final void u(oc2.i videoView) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Objects.toString(videoView);
        if (((BaseVideoView) videoView).L == null) {
            return;
        }
        p(videoView, e0.Other);
        BaseVideoView baseVideoView = (BaseVideoView) videoView;
        this.f2012o.remove(Integer.valueOf(baseVideoView.getId()));
        Set set = (Set) this.f2014q.get(Integer.valueOf(baseVideoView.S));
        if (set != null) {
            set.remove(videoView);
        }
    }

    public final void v(boolean z13) {
        Sequence K = CollectionsKt.K(this.f2014q.values());
        Intrinsics.checkNotNullParameter(K, "<this>");
        yn2.t tVar = yn2.t.f139589i;
        yn2.h hVar = new yn2.h(yn2.c0.j(K instanceof yn2.h0 ? ((yn2.h0) K).c(tVar) : new yn2.k(K, yn2.u.f139590i, tVar), m1.f1996i));
        while (hVar.hasNext()) {
            BaseVideoView baseVideoView = (BaseVideoView) ((oc2.i) hVar.next());
            if (z13) {
                if (!z13) {
                    baseVideoView.getClass();
                } else if (baseVideoView.f52775a0) {
                }
            }
            baseVideoView.P(!z13);
            baseVideoView.W(z13);
        }
    }

    public final void w() {
        View T;
        Set set;
        Set<oc2.i> J0;
        View view;
        oc2.j jVar;
        Set S0;
        if (this.f2019v) {
            for (Map.Entry entry : this.f2013p.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                WeakReference weakReference = (WeakReference) entry.getValue();
                Integer valueOf = Integer.valueOf(intValue);
                LinkedHashMap linkedHashMap = this.f2014q;
                Set set2 = (Set) linkedHashMap.get(valueOf);
                if (set2 == null || !set2.isEmpty()) {
                    LinkedHashSet linkedHashSet = this.f2018u;
                    linkedHashSet.clear();
                    if (weakReference != null && (jVar = (oc2.j) weakReference.get()) != null && (S0 = jVar.S0()) != null) {
                        yn2.h hVar = new yn2.h(yn2.c0.j(CollectionsKt.K(S0), g0.f1962p));
                        while (hVar.hasNext()) {
                            View view2 = (View) hVar.next();
                            Rect rect = this.f2017t;
                            view2.getGlobalVisibleRect(rect);
                            linkedHashSet.add(new qc2.b(rect.left, rect.top, rect.right, rect.bottom));
                        }
                    }
                    oc2.j jVar2 = (oc2.j) weakReference.get();
                    if (jVar2 != null && (T = jVar2.T()) != null && (set = (Set) linkedHashMap.get(Integer.valueOf(intValue))) != null && (J0 = CollectionsKt.J0(set)) != null) {
                        for (oc2.i iVar : J0) {
                            k4 k4Var = this.f2002e;
                            k4Var.getClass();
                            z3 z3Var = a4.f83298b;
                            lh0.g1 g1Var = (lh0.g1) k4Var.f83410a;
                            if (g1Var.o("android_ads_short_video_letterbox", "enabled", z3Var) || g1Var.l("android_ads_short_video_letterbox")) {
                                PinterestVideoView pinterestVideoView = iVar instanceof PinterestVideoView ? (PinterestVideoView) iVar : null;
                                if (pinterestVideoView == null || !pinterestVideoView.f52776b0) {
                                    view = ((BaseVideoView) iVar).V;
                                } else {
                                    view = ((PinterestVideoView) iVar).f18939d;
                                    if (view == null) {
                                        view = ((BaseVideoView) iVar).V;
                                    }
                                    Intrinsics.f(view);
                                }
                            } else {
                                view = ((BaseVideoView) iVar).V;
                            }
                            float d2 = ((qc2.d) this.f2001d).d(view, T, linkedHashSet);
                            BaseVideoView baseVideoView = (BaseVideoView) iVar;
                            baseVideoView.P = d2;
                            baseVideoView.Z();
                            baseVideoView.h0((qc2.c) baseVideoView.O.getCalculate().invoke(Double.valueOf(d2)));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x016e, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019a, code lost:
    
        r1 = dl2.b.K2(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        if (r1.isEmpty() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a4, code lost:
    
        java.util.Objects.toString(r12);
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a9, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ac, code lost:
    
        r11 = (ac2.s0) r1.get(0);
        r10 = r11.f2055c;
        r13 = r10 instanceof ac2.w0;
        r3 = vb0.j.f125466a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        if (r13 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        kotlin.jvm.internal.Intrinsics.g(r10, "null cannot be cast to non-null type com.pinterest.video.PoolItemState.Used");
        r13 = new ac2.p0(r12);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, "<set-?>");
        ((ac2.w0) r10).f2071b = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ce, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0248, code lost:
    
        r1.size();
        r0 = r11.a();
        java.util.Objects.toString(r12);
        r0.toString();
        r0 = (m7.l0) r11.a();
        r0.L0();
        r0 = r0.f86269j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0264, code lost:
    
        if ((r0 instanceof mc2.a) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0268, code lost:
    
        if (r12 != ac2.o0.GRID_TO_CLOSEUP_TRANSITION) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x026a, code lost:
    
        r0 = (mc2.a) r0;
        r1 = r0.f86912f;
        r5 = (mc2.d) r1.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0274, code lost:
    
        if (r5 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0276, code lost:
    
        r3.F("onTransitionFromGridToCloseup, no existing metadata ", tb0.p.VIDEO_PLAYER, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0281, code lost:
    
        r1.set(new mc2.d(null, true, r5.b(), true));
        r0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0294, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "url");
        r0 = d7.b.f0(r4);
        r1 = ac2.q0.f2040e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a1, code lost:
    
        if (r0 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a4, code lost:
    
        r6.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "keyWord");
        lh0.z0.f83518a.getClass();
        r0 = lh0.y0.f83512b;
        r12 = r6.f83410a;
        r0 = ((lh0.g1) r12).h("android_video_player_reuse_abr", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ba, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02c3, code lost:
    
        if (kotlin.text.z.p(r0, "control", false) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02c9, code lost:
    
        if (kotlin.text.StringsKt.E(r0, "", false) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02cb, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ce, code lost:
    
        if (r10 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d0, code lost:
    
        ((lh0.g1) r12).c("android_video_player_reuse_abr");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02d5, code lost:
    
        if (r10 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d7, code lost:
    
        r0 = r11.f2055c;
        kotlin.jvm.internal.Intrinsics.g(r0, "null cannot be cast to non-null type com.pinterest.video.PoolItemState.Used");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<set-?>");
        ((ac2.w0) r0).f2071b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02cd, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02e5, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ec, code lost:
    
        if (d7.b.f0(r4) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ee, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x032d, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0334, code lost:
    
        if (r2.b(r4) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0336, code lost:
    
        r0 = r11.f2055c;
        kotlin.jvm.internal.Intrinsics.g(r0, "null cannot be cast to non-null type com.pinterest.video.PoolItemState.Used");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<set-?>");
        ((ac2.w0) r0).f2071b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0346, code lost:
    
        if (r2.b(r4) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0348, code lost:
    
        ((lh0.g1) r6.f83410a).c("android_video_reuse");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0356, code lost:
    
        if (r2.a(r4) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0358, code lost:
    
        ((lh0.g1) r6.f83410a).c("android_video_reuse");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x035f, code lost:
    
        r10 = true;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f0, code lost:
    
        r6.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "keyWord");
        lh0.z0.f83518a.getClass();
        r0 = lh0.y0.f83512b;
        r5 = r6.f83410a;
        r0 = ((lh0.g1) r5).h("android_video_player_reuse_abr", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0306, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0308, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030f, code lost:
    
        if (kotlin.text.z.p(r0, "enabled", false) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0317, code lost:
    
        if (kotlin.text.z.p(r0, "employee", false) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0322, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0323, code lost:
    
        if (r10 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0325, code lost:
    
        ((lh0.g1) r5).c("android_video_player_reuse_abr");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032a, code lost:
    
        if (r10 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x031d, code lost:
    
        if (kotlin.text.StringsKt.E(r0, "", false) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x031f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0321, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01d4, code lost:
    
        if ((r10 instanceof ac2.u0) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01d6, code lost:
    
        kotlin.jvm.internal.Intrinsics.g(r10, "null cannot be cast to non-null type com.pinterest.video.PoolItemState.Reused");
        r10 = (oc2.i) ((ac2.u0) r10).f2060a.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01e5, code lost:
    
        if (r10 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01e7, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "videoView");
        r11.f2055c = new ac2.w0(new java.lang.ref.WeakReference(r10));
        r11.f2056d.b();
        r0 = r11.f2055c;
        kotlin.jvm.internal.Intrinsics.g(r0, "null cannot be cast to non-null type com.pinterest.video.PoolItemState.Used");
        r10 = new ac2.p0(r12);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "<set-?>");
        ((ac2.w0) r0).f2071b = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0210, code lost:
    
        r17 = r5;
        r3.F("View bound to " + r11.f2055c + " was unexpectedly null", tb0.p.VIDEO_PLAYER, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0230, code lost:
    
        r17 = r5;
        r3.F("Unexpected pool-item state encountered when trying to mark most recent player for reuse. PoolItem state was " + r10, tb0.p.VIDEO_PLAYER, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0141, code lost:
    
        if (((lh0.g1) r6.f83410a).g("android_video_reuse", r12) != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
    
        if (((lh0.g1) r6.f83410a).g("android_video_player_reuse_abr", r12) != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0143, code lost:
    
        r12 = ac2.o0.GRID_TO_CLOSEUP_TRANSITION;
        r13 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
    
        if (r1.hasNext() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
    
        r11 = r1.next();
        r10 = (ac2.s0) r11;
        r17 = r1;
        r1 = (androidx.media3.exoplayer.ExoPlayer) r10.f2053a.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0167, code lost:
    
        r1 = ((a7.h) r1).i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0173, code lost:
    
        if ((r10.f2055c instanceof ac2.w0) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0175, code lost:
    
        if (r1 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
    
        r10 = r1.f1072a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r10, r19) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0181, code lost:
    
        r1 = r1.f1073b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0183, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0185, code lost:
    
        r1 = r1.f969a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0191, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(java.lang.String.valueOf(r1), r4) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0193, code lost:
    
        r13.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0196, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017a, code lost:
    
        r10 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.lang.String r19, bc2.q r20, bc2.m r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.o1.x(java.lang.String, bc2.q, bc2.m, boolean):void");
    }
}
