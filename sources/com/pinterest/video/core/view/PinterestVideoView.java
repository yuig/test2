package com.pinterest.video.core.view;

import a7.g1;
import a7.i0;
import a7.v0;
import ac2.e0;
import ac2.f;
import ac2.f1;
import ac2.m0;
import ac2.o1;
import ac2.s1;
import ac2.t1;
import ac2.u1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import at1.b;
import at1.k;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.view.BaseVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import dc2.e;
import df.j1;
import ec2.a;
import ec2.h;
import ec2.j;
import ec2.l;
import et1.r0;
import h32.g0;
import h32.h0;
import h32.u0;
import hc2.g;
import hc2.p;
import ic2.d;
import java.util.concurrent.locks.ReentrantLock;
import k8.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l5.i;
import lb0.q;
import lh0.a4;
import lh0.k4;
import lh0.z3;
import m60.b0;
import m60.f0;
import m60.w;
import m7.l0;
import n7.o0;
import nx.d0;
import nx.d1;
import nx.z0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pk.c1;
import pk.v2;
import qy.c;
import so.oa;
import xk2.m;
import xk2.n;
import xk2.v;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/video/core/view/PinterestVideoView;", "Lcom/pinterest/video/view/BaseVideoView;", "Lat1/k;", "Lqy/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bk/f", "video_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PinterestVideoView extends a implements k, c {

    /* renamed from: c1, reason: collision with root package name */
    public static final Integer[] f52749c1 = {2000, 2003, 2005, 2008, 3001, 3003};

    /* renamed from: d1, reason: collision with root package name */
    public static final xk2.k f52750d1 = m.a(n.NONE, h.f58453i);
    public ic2.c A0;
    public cc2.c B0;
    public final z0 C0;
    public g0 D0;
    public u0 E0;
    public String F0;
    public boolean G0;
    public boolean H0;
    public d I0;
    public final o0 J0;
    public final WebImageView K0;
    public boolean L0;
    public boolean M0;
    public Function0 N0;
    public boolean O0;
    public final v P0;
    public FrameLayout Q0;
    public final xk2.k R0;
    public final j S0;
    public xj2.c T0;
    public long U0;
    public final f V0;
    public d0 W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    public pc2.a f52751a1;

    /* renamed from: b1, reason: collision with root package name */
    public final boolean f52752b1;

    /* renamed from: h0, reason: collision with root package name */
    public b60.a f52753h0;

    /* renamed from: i0, reason: collision with root package name */
    public e f52754i0;

    /* renamed from: j0, reason: collision with root package name */
    public b0 f52755j0;

    /* renamed from: k0, reason: collision with root package name */
    public k4 f52756k0;

    /* renamed from: l0, reason: collision with root package name */
    public o1 f52757l0;

    /* renamed from: m0, reason: collision with root package name */
    public d1 f52758m0;

    /* renamed from: n0, reason: collision with root package name */
    public b f52759n0;

    /* renamed from: o0, reason: collision with root package name */
    public tb0.h f52760o0;

    /* renamed from: p0, reason: collision with root package name */
    public bc2.e f52761p0;

    /* renamed from: q0, reason: collision with root package name */
    public p f52762q0;

    /* renamed from: r0, reason: collision with root package name */
    public q f52763r0;

    /* renamed from: s0, reason: collision with root package name */
    public kc2.a f52764s0;

    /* renamed from: t0, reason: collision with root package name */
    public f1 f52765t0;

    /* renamed from: u0, reason: collision with root package name */
    public i f52766u0;

    /* renamed from: v0, reason: collision with root package name */
    public g f52767v0;

    /* renamed from: w0, reason: collision with root package name */
    public w f52768w0;

    /* renamed from: x0, reason: collision with root package name */
    public final v f52769x0;

    /* renamed from: y0, reason: collision with root package name */
    public cc2.b f52770y0;

    /* renamed from: z0, reason: collision with root package name */
    public cc2.e f52771z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinterestVideoView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f52769x0 = m.b(new ec2.k(this, 2));
        z0 z0Var = new z0();
        z0Var.b("is_closeup_video", "false");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        z0Var.b("os_version", RELEASE);
        this.C0 = z0Var;
        this.G0 = true;
        this.J0 = new o0();
        View view = this.C;
        Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.ui.imageview.WebImageView");
        this.K0 = (WebImageView) view;
        this.P0 = m.b(new ec2.k(this, 1));
        this.R0 = m.a(n.NONE, new ec2.k(this, 0));
        this.S0 = new j(this);
        this.U0 = 1000L;
        this.V0 = f.f1945a;
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.W0 = a13;
        this.X0 = nc2.h.f90406b;
        this.f52751a1 = new ec2.e(this);
        U(false);
        if (r0().f("PREF_VIDEO_DEBUG_OVERLAY", false)) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            f0(new oc2.f(context2, this.f52778d0));
            addView(this.f52777c0, -1, -1);
        }
        this.f52752b1 = true;
    }

    public final void A0(boolean z13) {
        hc2.m mVar;
        v0 v0Var;
        a7.h hVar;
        i0 i13;
        v0 v0Var2;
        i0 i14;
        a7.d0 d0Var;
        s0().f1953a.i("PREF_ENABLE_CLOSED_CAPTIONS", z13);
        if (z13 && k0(true) && (mVar = this.Q) != null && (v0Var = ((dc2.g) mVar).f54407a) != null) {
            bc2.k kVar = this.L;
            c1 c1Var = null;
            bc2.q qVar = kVar != null ? kVar.f22661e : null;
            l0 l0Var = (l0) v0Var;
            l0Var.L0();
            y yVar = l0Var.f86269j;
            if (yVar != null) {
                s0();
                g1 a13 = yVar.a();
                Intrinsics.checkNotNullExpressionValue(a13, "getParameters(...)");
                yVar.i(f1.f(a13, qVar, this.T));
            }
            hc2.m mVar2 = this.Q;
            if (mVar2 != null && (v0Var2 = ((dc2.g) mVar2).f54407a) != null && (i14 = ((a7.h) v0Var2).i()) != null && (d0Var = i14.f1073b) != null) {
                c1Var = d0Var.f974f;
            }
            if ((c1Var == null || c1Var.isEmpty()) && (i13 = (hVar = (a7.h) v0Var).i()) != null) {
                a7.v a14 = i13.a();
                Intrinsics.checkNotNullExpressionValue(a14, "buildUpon(...)");
                s0().d(a14, qVar, this.T);
                i0 a15 = a14.a();
                Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
                v2 v13 = c1.v(a15);
                l0 l0Var2 = (l0) hVar;
                l0Var2.L0();
                l0Var2.z0(l0Var2.j0(v13), false);
            }
        }
        SubtitleView subtitleView = this.f18942g;
        if (z13) {
            if (subtitleView != null) {
                bs1.c.U1(subtitleView);
            }
        } else if (subtitleView != null) {
            bs1.c.X0(subtitleView);
        }
    }

    public final nc2.g B0(bc2.k kVar, cc2.b bVar, cc2.c cVar) {
        String str = this.F0;
        String str2 = kVar.f22657a;
        String str3 = str == null ? str2 : str;
        b60.a m03 = m0();
        this.V0.getClass();
        String a13 = f.a(str2, m03);
        String path = Uri.parse(kVar.f22663g).getPath();
        if (path == null) {
            path = "";
        }
        String str4 = path;
        boolean b13 = kVar.f22661e.b();
        boolean f13 = s0().f1953a.f("PREF_ENABLE_CLOSED_CAPTIONS", false);
        Function0 function0 = this.N0;
        g gVar = this.f52767v0;
        if (gVar == null) {
            Intrinsics.r("fastDashConfig");
            throw null;
        }
        cc2.e eVar = new cc2.e(str3, a13, str4, cVar, bVar, this.f52778d0, b13, f13, function0, gVar);
        this.f52771z0 = eVar;
        return eVar;
    }

    @Override // com.pinterest.video.view.SimplePlayerView
    /* renamed from: K */
    public final boolean getB() {
        return this.X0 || this.Y0 || this.Z0;
    }

    @Override // com.pinterest.video.view.SimplePlayerView
    /* renamed from: L, reason: from getter */
    public final pc2.a getF52751a1() {
        return this.f52751a1;
    }

    @Override // com.pinterest.video.view.SimplePlayerView
    public final void P(boolean z13) {
        this.X0 = z13;
        T();
    }

    @Override // com.pinterest.video.view.BaseVideoView, com.pinterest.video.view.SimplePlayerView
    public final void T() {
        super.T();
        SimplePlayerControlView simplePlayerControlView = this.F;
        if (simplePlayerControlView != null) {
            simplePlayerControlView.p(!(this.Y0 || this.Z0));
        }
        d dVar = this.I0;
        if (dVar != null) {
            boolean X = X();
            hc2.m mVar = this.Q;
            dVar.o(X, mVar != null ? mVar.a() : 0L);
        }
    }

    @Override // com.pinterest.video.view.BaseVideoView
    public final void Z() {
        if (this.H0) {
            hc2.m mVar = this.Q;
            if ((mVar != null ? mVar.a() : 0L) == 0 || this.P != 0.0f) {
                return;
            }
            j(0L, false);
        }
    }

    @Override // com.pinterest.video.view.BaseVideoView
    public final void b0(bc2.k metadata, a0 a0Var, Function0 onFailure) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        if (a0Var == null) {
            a0Var = new ec2.g(0, bc2.j.OTHER, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
        }
        super.b0(metadata, a0Var, onFailure);
        boolean V = V();
        new ty.e(metadata.f22660d, metadata.f22659c, metadata.f22657a, metadata.f22663g, V).i();
    }

    @Override // com.pinterest.video.view.BaseVideoView, oc2.i
    public final void c(hc2.m playerWrapper) {
        ic2.c cVar;
        nc2.g gVar;
        Intrinsics.checkNotNullParameter(playerWrapper, "playerWrapper");
        if (!v0()) {
            Intrinsics.checkNotNullParameter(playerWrapper, "playerWrapper");
            c0(playerWrapper);
            return;
        }
        h32.i0 p13 = this.W0.p();
        h0 h0Var = p13 == null ? new h0() : new h0(p13);
        Unit unit = null;
        dc2.g gVar2 = playerWrapper instanceof dc2.g ? (dc2.g) playerWrapper : null;
        if (gVar2 != null && (cVar = (ic2.c) gVar2.f54408b) != null && (gVar = cVar.f72109c) != null) {
            h0Var.f67047f = this.E0;
            h0Var.f67045d = this.D0;
            gVar.M(h0Var.a());
            unit = Unit.f80348a;
        }
        if (unit == null) {
            n0().q(new RuntimeException("Unexpected PlayerWrapper implementation"), a.a.k("PlayerWrapper [", playerWrapper.getClass().getName(), "] will produce inaccurate logs. Use PinterestPlayerWrapper instead."), tb0.p.VIDEO_PLAYER);
        }
        Intrinsics.checkNotNullParameter(playerWrapper, "playerWrapper");
        c0(playerWrapper);
    }

    @Override // com.pinterest.video.view.BaseVideoView, oc2.i
    public final void h(float f13, qc2.c viewability, boolean z13, long j13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        d dVar = this.I0;
        if (dVar != null) {
            dVar.e0(f13, viewability, z14, this.O.isVisible(this.N), j13);
        }
        super.h(f13, viewability, z13, j13, z14, z15);
    }

    @Override // com.pinterest.video.view.BaseVideoView, oc2.i
    public final void j(long j13, boolean z13) {
        BaseVideoView.Y("setPlayerPosition, position: " + j13 + ", isUserAction: " + z13);
        cc2.b p03 = this.f52770y0 != null ? p0() : null;
        if (p03 != null) {
            p03.A.f27458c0 = z13;
        }
        super.j(j13, z13);
    }

    public final void j0() {
        SubtitleView subtitleView = this.f18942g;
        if (subtitleView != null) {
            subtitleView.f19005g = false;
            subtitleView.d();
            subtitleView.f19004f = false;
            subtitleView.d();
            Context context = subtitleView.getContext();
            float applyDimension = TypedValue.applyDimension(2, 16.0f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
            subtitleView.f19001c = 2;
            subtitleView.f19002d = applyDimension;
            subtitleView.d();
            subtitleView.f19000b = new androidx.media3.ui.b(-1, 0, f5.c.j(-16777216, RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY), 0, -1, Typeface.DEFAULT_BOLD);
            subtitleView.d();
        }
    }

    public final boolean k0(boolean z13) {
        s0();
        bc2.k kVar = this.L;
        return f1.a(kVar != null ? kVar.f22661e : null, this.T, z13);
    }

    public final dc2.g l0(ExoPlayer exoPlayer, bc2.k metadata, Long l13, hc2.q qVar, Long l14, ac2.a0 playerCreateReason) {
        cc2.c cVar;
        nc2.g gVar;
        ic2.c z03;
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(playerCreateReason, "playerCreateReason");
        ac2.a0 a0Var = ac2.a0.Other;
        cc2.b y03 = playerCreateReason == a0Var ? y0(metadata, l13, qVar, l14) : this.f52770y0 != null ? p0() : y0(metadata, l13, qVar, l14);
        z0 z0Var = this.C0;
        if (playerCreateReason == a0Var) {
            d0 d0Var = this.W0;
            d1 d1Var = this.f52758m0;
            if (d1Var == null) {
                Intrinsics.r("trackingParamAttacher");
                throw null;
            }
            cVar = new cc2.c(d0Var, z0Var, d1Var);
            this.B0 = cVar;
        } else {
            cVar = this.B0;
            if (cVar == null) {
                d0 d0Var2 = this.W0;
                d1 d1Var2 = this.f52758m0;
                if (d1Var2 == null) {
                    Intrinsics.r("trackingParamAttacher");
                    throw null;
                }
                cVar = new cc2.c(d0Var2, z0Var, d1Var2);
                this.B0 = cVar;
            } else if (cVar == null) {
                Intrinsics.r("pinalyticsVideoAnalytics");
                throw null;
            }
        }
        if (playerCreateReason == a0Var) {
            gVar = B0(metadata, y03, cVar);
        } else {
            gVar = this.f52771z0;
            if (gVar == null) {
                gVar = B0(metadata, y03, cVar);
            } else if (gVar == null) {
                Intrinsics.r("videoLogger");
                throw null;
            }
        }
        if (playerCreateReason == a0Var) {
            z03 = z0(metadata, gVar);
        } else {
            ic2.c cVar2 = this.A0;
            if (cVar2 == null) {
                z03 = z0(metadata, gVar);
            } else {
                if (cVar2 == null) {
                    Intrinsics.r("playerEventListener");
                    throw null;
                }
                z03 = cVar2;
            }
        }
        e eVar = this.f52754i0;
        if (eVar == null) {
            Intrinsics.r("pinterestPlayerFactory");
            throw null;
        }
        b0 b0Var = this.f52755j0;
        if (b0Var != null) {
            return eVar.g(y03, z03, b0Var, exoPlayer);
        }
        Intrinsics.r("commonBackgroundDetector");
        throw null;
    }

    public final b60.a m0() {
        b60.a aVar = this.f52753h0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activeUidProvider");
        throw null;
    }

    public final tb0.h n0() {
        tb0.h hVar = this.f52760o0;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("crashReporting");
        throw null;
    }

    public final w o0() {
        w wVar = this.f52768w0;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    @Override // com.pinterest.video.view.BaseVideoView, com.pinterest.video.view.SimplePlayerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        b bVar = this.f52759n0;
        if (bVar == null) {
            Intrinsics.r("memoryEventDispatcher");
            throw null;
        }
        ((at1.d) bVar).f(this);
        super.onAttachedToWindow();
    }

    @Override // com.pinterest.video.view.BaseVideoView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object applicationContext = getContext().getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type com.pinterest.managed.IMemoryEventDispatcher");
        at1.d dVar = (at1.d) ((b) applicationContext);
        Intrinsics.checkNotNullParameter(this, "listener");
        ReentrantLock reentrantLock = dVar.f20445j;
        reentrantLock.lock();
        try {
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // at1.k
    public final void onTrimMemory(int i13) {
        BaseVideoView.Y("onTrimMemory, level: " + i13);
        cc2.b p03 = this.f52770y0 != null ? p0() : null;
        if (p03 != null) {
            p03.f27492k.b("trim_memory_requested", "true");
        }
        q0().f2006i.b();
    }

    public final cc2.b p0() {
        cc2.b bVar = this.f52770y0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("performanceTracker");
        throw null;
    }

    @Override // com.pinterest.video.view.BaseVideoView, oc2.i
    public final void play() {
        BaseVideoView.Y("play, visiblePercent: " + this.P);
        if (!this.W) {
            this.W = true;
            v0 v0Var = this.f18946k;
            cc2.b p03 = this.f52770y0 != null ? p0() : null;
            if (v0Var != null && (v0Var instanceof ExoPlayer) && p03 != null && p03.c() == null && this.T == bc2.m.PIN_CLOSEUP) {
                long w13 = rl2.g0.w((ExoPlayer) v0Var);
                if (w13 > 0) {
                    p03.h(hc2.q.CLOSEUP_ADJACENT_UI_PAGE_PREFETCH, w13);
                }
            }
        }
        super.play();
    }

    public final o1 q0() {
        o1 o1Var = this.f52757l0;
        if (o1Var != null) {
            return o1Var;
        }
        Intrinsics.r("pinterestVideoManager");
        throw null;
    }

    public final q r0() {
        q qVar = this.f52763r0;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("prefsManagerPersisted");
        throw null;
    }

    public final f1 s0() {
        f1 f1Var = this.f52765t0;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.r("subtitlesManager");
        throw null;
    }

    public final void t0(boolean z13) {
        this.Y0 = z13;
        T();
    }

    public final void u0(d dVar) {
        xj2.c cVar = this.T0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.T0 = null;
        this.I0 = dVar;
    }

    @Override // androidx.media3.ui.LegacyPlayerView
    public final void v(AspectRatioFrameLayout aspectRatioFrameLayout, float f13) {
    }

    public final boolean v0() {
        k4 k4Var = this.f52756k0;
        if (k4Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) k4Var.f83410a;
        if (g1Var.o("android_video_ad_perf_logging_kill_switch", "enabled", z3Var) || g1Var.l("android_video_ad_perf_logging_kill_switch")) {
            return this.G0;
        }
        return true;
    }

    public final void w0() {
        SimplePlayerControlView simplePlayerControlView = this.F;
        if (simplePlayerControlView != null) {
            boolean z13 = !simplePlayerControlView.q();
            GestaltIconButton gestaltIconButton = simplePlayerControlView.f52784g0;
            if (gestaltIconButton != null) {
                gestaltIconButton.t(new fx1.d(z13, 25));
            }
            boolean q13 = simplePlayerControlView.q();
            A0(q13);
            this.W0.h0((r18 & 1) != 0 ? h32.f1.TAP : q13 ? h32.f1.TOGGLE_ON : h32.f1.TOGGLE_OFF, (r18 & 2) != 0 ? null : u0.CLOSED_CAPTIONS_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    public final void x0() {
        bc2.k kVar;
        bc2.q qVar;
        SimplePlayerControlView simplePlayerControlView = this.F;
        if (simplePlayerControlView == null || (kVar = this.L) == null || (qVar = kVar.f22661e) == null) {
            return;
        }
        boolean isPromoted = qVar.f22679h.isPromoted();
        GestaltIconButton gestaltIconButton = simplePlayerControlView.f52784g0;
        if (!isPromoted && !qVar.b()) {
            Context context = kb0.a.f79058b;
            if (!((Boolean) ((u1) ((t1) ((oa) ((s1) lb.l0.k0(f0.j0().getApplicationContext(), s1.class))).Sc.get())).f2063b.getValue()).booleanValue()) {
                if (gestaltIconButton != null) {
                    gestaltIconButton.t(oc2.a.f94061l);
                    return;
                }
                return;
            }
        }
        if (k0(false)) {
            if (gestaltIconButton != null) {
                gestaltIconButton.t(oc2.a.f94062m);
            }
            boolean f13 = s0().f1953a.f("PREF_ENABLE_CLOSED_CAPTIONS", false);
            A0(f13);
            GestaltIconButton gestaltIconButton2 = simplePlayerControlView.f52784g0;
            if (gestaltIconButton2 != null) {
                gestaltIconButton2.t(new fx1.d(f13, 25));
            }
        }
    }

    @Override // com.pinterest.video.view.SimplePlayerView, androidx.media3.ui.LegacyPlayerView
    public final void y(ExoPlayer exoPlayer) {
        v0 v0Var = this.f18946k;
        ExoPlayer exoPlayer2 = v0Var instanceof ExoPlayer ? (ExoPlayer) v0Var : null;
        BaseVideoView.Y("setPlayer, " + exoPlayer2 + " -> " + exoPlayer);
        StringBuilder sb3 = new StringBuilder("cleanupPlayer, oldPlayer: ");
        sb3.append(exoPlayer2);
        BaseVideoView.Y(sb3.toString());
        j jVar = this.S0;
        o0 o0Var = this.J0;
        if (exoPlayer2 != null) {
            l0 l0Var = (l0) exoPlayer2;
            l0Var.u0(o0Var);
            l0Var.u0(jVar);
        }
        xj2.c cVar = this.T0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.T0 = null;
        d dVar = this.I0;
        if (dVar != null) {
            dVar.c0(exoPlayer2 != null ? ((l0) exoPlayer2).X() : -1L, e0.Other);
            if (exoPlayer2 != null) {
                ((l0) exoPlayer2).u0(dVar);
            }
        }
        super.y(exoPlayer);
        if (!(exoPlayer instanceof ExoPlayer)) {
            exoPlayer = null;
        }
        if (exoPlayer == null) {
            return;
        }
        BaseVideoView.Y("setupPlayer, " + exoPlayer);
        l0 l0Var2 = (l0) exoPlayer;
        l0Var2.f0(o0Var);
        l0Var2.f0(jVar);
        xj2.c cVar2 = this.T0;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.T0 = null;
        d dVar2 = this.I0;
        if (dVar2 != null) {
            dVar2.f72114a = Integer.valueOf(l0Var2.L());
            dVar2.f72115b = Boolean.valueOf(l0Var2.z());
            l lVar = new l(dVar2, 0);
            l lVar2 = new l(dVar2, 1);
            l lVar3 = new l(dVar2, 2);
            b0 b0Var = this.f52755j0;
            if (b0Var == null) {
                Intrinsics.r("commonBackgroundDetector");
                throw null;
            }
            this.T0 = m0.c(l0Var2, lVar, lVar2, lVar3, b0Var, this.U0, 96);
            l0Var2.f0(dVar2);
        }
    }

    public final cc2.b y0(bc2.k kVar, Long l13, hc2.q qVar, Long l14) {
        String str = this.F0;
        String str2 = kVar.f22657a;
        String str3 = str == null ? str2 : str;
        b60.a m03 = m0();
        this.V0.getClass();
        String a13 = f.a(str2, m03);
        Context applicationContext = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        o1 q03 = q0();
        oc2.f fVar = this.f52777c0;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float y13 = j1.y1(context);
        qc2.f fVar2 = this.O;
        bc2.m mVar = this.T;
        z0 map = this.C0;
        Intrinsics.checkNotNullParameter(map, "map");
        z0 z0Var = new z0();
        z0Var.putAll(map);
        b60.a m04 = ((Boolean) this.f52769x0.getValue()).booleanValue() ? m0() : null;
        p pVar = this.f52762q0;
        if (pVar == null) {
            Intrinsics.r("prefetchTracker");
            throw null;
        }
        xk2.k kVar2 = vb0.f.f125456e;
        vb0.f d2 = vb0.e.d();
        Intrinsics.checkNotNullExpressionValue(qb0.d.f103396a, "getInstance(...)");
        double d13 = vb0.j.f125485t;
        q r03 = r0();
        kc2.a aVar = this.f52764s0;
        if (aVar == null) {
            Intrinsics.r("videoPreferences");
            throw null;
        }
        i iVar = this.f52766u0;
        if (iVar == null) {
            Intrinsics.r("playServicesDevicePerformance");
            throw null;
        }
        this.f52770y0 = new cc2.b(applicationContext, q03, this.J0, fVar, str3, a13, y13, fVar2, kVar, mVar, z0Var, m04, pVar, d2, this.f52778d0, l13, d13, r03, aVar, iVar, new r0(20, this, str2));
        cc2.b p03 = p0();
        p03.f27506y = this.O0;
        if (kVar.f22661e.f22673b.f22666c != null) {
            p03.A.f27474s = r3.intValue();
        }
        tk2.e.f118017c.b(new x62.c(getContext().getApplicationContext(), kVar.f22663g, p03, 3));
        if (qVar != null && l14 != null) {
            p03.h(qVar, l14.longValue());
        }
        return p0();
    }

    public final ic2.c z0(bc2.k kVar, nc2.g gVar) {
        q r03 = r0();
        g gVar2 = this.f52767v0;
        if (gVar2 == null) {
            Intrinsics.r("fastDashConfig");
            throw null;
        }
        ic2.c cVar = new ic2.c(r03, gVar, kVar.f22663g, gVar2);
        ec2.m videoStateListener = new ec2.m(kVar, this);
        Intrinsics.checkNotNullParameter(videoStateListener, "videoStateListener");
        cVar.f72113g = videoStateListener;
        this.A0 = cVar;
        return cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinterestVideoView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f52769x0 = m.b(new ec2.k(this, 2));
        z0 z0Var = new z0();
        z0Var.b("is_closeup_video", "false");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        z0Var.b("os_version", RELEASE);
        this.C0 = z0Var;
        this.G0 = true;
        this.J0 = new o0();
        View view = this.C;
        Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.ui.imageview.WebImageView");
        this.K0 = (WebImageView) view;
        this.P0 = m.b(new ec2.k(this, 1));
        this.R0 = m.a(n.NONE, new ec2.k(this, 0));
        this.S0 = new j(this);
        this.U0 = 1000L;
        this.V0 = f.f1945a;
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.W0 = a13;
        this.X0 = nc2.h.f90406b;
        this.f52751a1 = new ec2.e(this);
        U(false);
        if (r0().f("PREF_VIDEO_DEBUG_OVERLAY", false)) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            oc2.f fVar = new oc2.f(context2, this.f52778d0);
            this.f52777c0 = fVar;
            addView(fVar, -1, -1);
        }
        this.f52752b1 = true;
    }
}
