package dc2;

import ac2.f1;
import ac2.l1;
import ac2.n0;
import ac2.s;
import ac2.w;
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import g8.q;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.k4;
import lh0.z3;
import m60.b0;
import m60.z0;
import m7.l0;
import m7.x;
import m7.y;
import n7.c0;
import tu1.u;
import xk2.n;
import xk2.v;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f54393a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f54394b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f54395c;

    /* renamed from: d, reason: collision with root package name */
    public final hc2.g f54396d;

    /* renamed from: e, reason: collision with root package name */
    public final mc2.h f54397e;

    /* renamed from: f, reason: collision with root package name */
    public final k4 f54398f;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f54399g;

    /* renamed from: h, reason: collision with root package name */
    public final fc2.a f54400h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.k f54401i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.k f54402j;

    /* renamed from: k, reason: collision with root package name */
    public final v f54403k;

    /* renamed from: l, reason: collision with root package name */
    public final v f54404l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f54405m;

    public e(Context context, bf2.d bandwidthMeterProvider, bf2.d cronetDataSourceFactoryProvider, at1.d memoryEventDispatcher, b60.a activeUserManager, hc2.g fastDashConfig, mc2.h trackSelectionHistory, k4 videoExperiments, f1 subtitlesManager, fc2.a dashManifestEditor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bandwidthMeterProvider, "bandwidthMeterProvider");
        Intrinsics.checkNotNullParameter(cronetDataSourceFactoryProvider, "cronetDataSourceFactoryProvider");
        Intrinsics.checkNotNullParameter(memoryEventDispatcher, "memoryEventDispatcher");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(fastDashConfig, "fastDashConfig");
        Intrinsics.checkNotNullParameter(trackSelectionHistory, "trackSelectionHistory");
        Intrinsics.checkNotNullParameter(videoExperiments, "videoExperiments");
        Intrinsics.checkNotNullParameter(subtitlesManager, "subtitlesManager");
        Intrinsics.checkNotNullParameter(dashManifestEditor, "dashManifestEditor");
        this.f54393a = context;
        this.f54394b = bandwidthMeterProvider;
        this.f54395c = cronetDataSourceFactoryProvider;
        this.f54396d = fastDashConfig;
        this.f54397e = trackSelectionHistory;
        this.f54398f = videoExperiments;
        this.f54399g = subtitlesManager;
        this.f54400h = dashManifestEditor;
        n nVar = n.NONE;
        this.f54401i = xk2.m.a(nVar, new u(activeUserManager, 9));
        int i13 = 1;
        this.f54402j = xk2.m.a(nVar, new d(this, i13));
        this.f54403k = xk2.m.b(new d(this, 0));
        this.f54404l = xk2.m.b(new u(this, 10));
        l1 l1Var = new l1(this, i13);
        synchronized (d7.u.f53889a) {
            d7.u.f53890b = Integer.MAX_VALUE;
        }
        memoryEventDispatcher.f(l1Var);
    }

    public final hc2.l a(s httpDataSourceFactory) {
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        h7.d dVar = new h7.d();
        ac2.v vVar = w.f2066a;
        Context context = this.f54393a;
        dVar.f67863a = w.b(context);
        Intrinsics.checkNotNullExpressionValue(dVar, "setCache(...)");
        dVar.f67866d = 2;
        dVar.f67865c = new g7.j(context, httpDataSourceFactory);
        q qVar = new q(new g7.w(dVar, (i) this.f54401i.getValue()));
        k4 k4Var = this.f54398f;
        k4Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) k4Var.f83410a;
        if (g1Var.o("android_video_cmcd", "enabled", z3Var) || g1Var.l("android_video_cmcd")) {
            qVar.c(l8.f.Io);
        }
        return new hc2.l(qVar, dVar, this.f54396d, this.f54399g, this.f54400h);
    }

    public final y b() {
        return (y) this.f54402j.getValue();
    }

    public final boolean c() {
        return ((Boolean) this.f54403k.getValue()).booleanValue();
    }

    public final boolean d(n0 playerPoolConfig) {
        Intrinsics.checkNotNullParameter(playerPoolConfig, "playerPoolConfig");
        playerPoolConfig.getClass();
        return ((Number) ly1.d.f85161e.getValue()).intValue() >= 6 ? !this.f54405m : !this.f54405m && qb0.b.f() > 200;
    }

    public final m7.n e(boolean z13) {
        if (!z13) {
            m7.l lVar = new m7.l();
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            lVar.c(50000);
            m7.n a13 = lVar.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            return a13;
        }
        k4 k4Var = this.f54398f;
        if (k4Var.b("allocator")) {
            m7.l lVar2 = new m7.l();
            lVar2.c(2000);
            lVar2.d();
            lVar2.b(new l8.m(false));
            m7.n a14 = lVar2.a();
            Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
            return a14;
        }
        if (!k4Var.b("load_control")) {
            m7.l lVar3 = new m7.l();
            Intrinsics.checkNotNullParameter(lVar3, "<this>");
            lVar3.c(1000);
            m7.n a15 = lVar3.a();
            Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
            return a15;
        }
        bf.b.t(!false);
        m7.n.a("bufferForPlaybackMs", 500, 0, "0");
        m7.n.a("bufferForPlaybackAfterRebufferMs", 1000, 0, "0");
        m7.n.a("minBufferMs", 1000, 500, "bufferForPlaybackMs");
        m7.n.a("minBufferMs", 1000, 1000, "bufferForPlaybackAfterRebufferMs");
        m7.n.a("maxBufferMs", 2000, 1000, "minBufferMs");
        bf.b.t(!false);
        bf.b.t(!false);
        m7.n nVar = new m7.n(new l8.m(true), 1000, 2000, 500, 1000, true);
        Intrinsics.checkNotNullExpressionValue(nVar, "build(...)");
        return nVar;
    }

    public final l0 f() {
        Context context = this.f54393a;
        m7.q qVar = new m7.q(context);
        qVar.f86358b.f53787a = 1;
        Intrinsics.checkNotNullExpressionValue(qVar, "forceEnableMediaCodecAsynchronousQueueing(...)");
        s sVar = (s) this.f54395c.get();
        x xVar = new x(context);
        xVar.f(qVar);
        Intrinsics.f(sVar);
        h7.d dVar = new h7.d();
        dVar.f67863a = w.b(context);
        dVar.f67866d = 2;
        Intrinsics.checkNotNullExpressionValue(dVar, "setFlags(...)");
        dVar.f67865c = new g7.j(context, sVar);
        q qVar2 = new q(new g7.w(dVar, (i) this.f54401i.getValue()));
        k4 k4Var = this.f54398f;
        k4Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) k4Var.f83410a;
        if (g1Var.o("android_video_cmcd", "enabled", z3Var) || g1Var.l("android_video_cmcd")) {
            qVar2.c(l8.f.Io);
        }
        xVar.e(qVar2);
        m7.l lVar = new m7.l();
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.c(50000);
        m7.n a13 = lVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        xVar.d(a13);
        xVar.c((l8.e) this.f54394b.get());
        c0 c0Var = new c0(d7.e.f53809a);
        bf.b.t(!xVar.f86473v);
        xVar.f86459h = new m7.w(c0Var, 0);
        bf.b.t(!xVar.f86473v);
        xVar.f86476y = false;
        xVar.b(c());
        Intrinsics.checkNotNullExpressionValue(xVar, "experimentalSetDynamicSchedulingEnabled(...)");
        l0 a14 = xVar.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        a14.f86272k0 = sVar;
        a14.C0(b());
        sVar.f2052k.getClass();
        z0 z0Var = ff0.a.f62099a;
        return a14;
    }

    public final g g(cc2.b bVar, ic2.c playerEventListener, b0 backgroundDetector, ExoPlayer player) {
        Intrinsics.checkNotNullParameter(playerEventListener, "playerEventListener");
        Intrinsics.checkNotNullParameter(backgroundDetector, "backgroundDetector");
        Intrinsics.checkNotNullParameter(player, "player");
        g7.e eVar = ((l0) player).f86272k0;
        Intrinsics.g(eVar, "null cannot be cast to non-null type com.pinterest.video.PinterestCronetDataSourceFactory");
        s sVar = (s) eVar;
        sVar.d();
        if (bVar != null) {
            gc2.c videoTransferListener = sVar.f2052k;
            Intrinsics.checkNotNullParameter(videoTransferListener, "videoTransferListener");
            bVar.f27505x = videoTransferListener;
            cc2.a aVar = bVar.A;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(videoTransferListener, "<set-?>");
            aVar.Y = videoTransferListener;
        }
        return new g(player, playerEventListener, backgroundDetector, this.f54396d);
    }

    public final k8.y h() {
        if (!((Boolean) this.f54396d.f68754b.getValue()).booleanValue()) {
            return new k8.q(this.f54393a);
        }
        Object obj = this.f54394b.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new mc2.a((l8.e) obj, this.f54397e);
    }
}
