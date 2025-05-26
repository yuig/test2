package tq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import rq.n0;
import rq.o0;
import rq.r1;
import so.fb;
import so.jb;
import so.oa;
import so.s8;
import so.w8;
import x02.i2;

/* loaded from: classes3.dex */
public final class n extends r1 implements i, sq.f {
    public static final /* synthetic */ int E = 0;
    public final l A;
    public final xk2.v B;
    public j21.f C;
    public ArrayList D;

    /* renamed from: b, reason: collision with root package name */
    public boolean f118892b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f118893c;

    /* renamed from: d, reason: collision with root package name */
    public final sq.g f118894d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.q f118895e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f118896f;

    /* renamed from: g, reason: collision with root package name */
    public final yk1.j f118897g;

    /* renamed from: h, reason: collision with root package name */
    public fb f118898h;

    /* renamed from: i, reason: collision with root package name */
    public gs0.k f118899i;

    /* renamed from: j, reason: collision with root package name */
    public b60.b f118900j;

    /* renamed from: k, reason: collision with root package name */
    public lh0.a0 f118901k;

    /* renamed from: l, reason: collision with root package name */
    public m60.w f118902l;

    /* renamed from: m, reason: collision with root package name */
    public xr.a f118903m;

    /* renamed from: n, reason: collision with root package name */
    public i21.c f118904n;

    /* renamed from: o, reason: collision with root package name */
    public ur.a f118905o;

    /* renamed from: p, reason: collision with root package name */
    public es.a f118906p;

    /* renamed from: q, reason: collision with root package name */
    public is1.f f118907q;

    /* renamed from: r, reason: collision with root package name */
    public PdpCloseupCarouselView f118908r;

    /* renamed from: s, reason: collision with root package name */
    public pq.d f118909s;

    /* renamed from: t, reason: collision with root package name */
    public final o f118910t;

    /* renamed from: u, reason: collision with root package name */
    public List f118911u;

    /* renamed from: v, reason: collision with root package name */
    public h f118912v;

    /* renamed from: w, reason: collision with root package name */
    public FrameLayout f118913w;

    /* renamed from: x, reason: collision with root package name */
    public GestaltIconButton f118914x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f118915y;

    /* renamed from: z, reason: collision with root package name */
    public final m f118916z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, nx.d0 pinalytics, sq.g impressionLoggingParams, uj2.q networkStateStream, i2 pinRepository) {
        super(context);
        yk1.j mvpBinder = yk1.j.a();
        Intrinsics.checkNotNullExpressionValue(mvpBinder, "getInstance(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(impressionLoggingParams, "impressionLoggingParams");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        inject();
        this.f118893c = pinalytics;
        this.f118894d = impressionLoggingParams;
        this.f118895e = networkStateStream;
        this.f118896f = pinRepository;
        this.f118897g = mvpBinder;
        fb fbVar = this.f118898h;
        if (fbVar == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) getPresenterPinalyticsFactory()).f(pinalytics, "");
        w8 w8Var = fbVar.f113421a;
        uj2.q qVar = (uj2.q) w8Var.f114689b.f113947u9.get();
        oa oaVar = w8Var.f114689b;
        this.f118910t = new o(f13, qVar, (j80.b) oaVar.O6.get(), w8Var.f114690c.j5(), (nx.b0) oaVar.R8.get());
        this.f118915y = new int[2];
        this.f118916z = new m(this);
        this.A = new l(this);
        this.B = xk2.m.b(new db.m(this, 21));
    }

    public final PdpCloseupCarouselView b() {
        PdpCloseupCarouselView pdpCloseupCarouselView = this.f118908r;
        if (pdpCloseupCarouselView != null) {
            return pdpCloseupCarouselView;
        }
        Intrinsics.r("carouselView");
        throw null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        View.inflate(getContext(), n80.d.pdp_carousel_module, this);
        setOrientation(1);
        View findViewById = findViewById(n80.c.carouselView);
        PdpCloseupCarouselView pdpCloseupCarouselView = (PdpCloseupCarouselView) findViewById;
        pdpCloseupCarouselView.f35052i = new j(this, 0);
        pdpCloseupCarouselView.f35053j = new n0(this, 1);
        pdpCloseupCarouselView.f35055l = this.A;
        pdpCloseupCarouselView.f35054k = new o0(1, this, pdpCloseupCarouselView);
        ViewGroup.LayoutParams layoutParams = pdpCloseupCarouselView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 1;
        pdpCloseupCarouselView.setLayoutParams(layoutParams2);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        Intrinsics.checkNotNullParameter(pdpCloseupCarouselView, "<set-?>");
        this.f118908r = pdpCloseupCarouselView;
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById(n80.c.carousel_overflow_menu_button);
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new xo.k(this, 15));
        } else {
            gestaltIconButton = null;
        }
        this.f118914x = gestaltIconButton;
        this.f118913w = (FrameLayout) findViewById(n80.c.carouselContainer);
        bs1.c.X0(findViewById(n80.c.gradientView));
        GestaltIconButton gestaltIconButton2 = this.f118914x;
        if (gestaltIconButton2 != null) {
            com.bumptech.glide.c.d0(gestaltIconButton2);
        }
        setBackgroundColor(bs1.c.B(this, eo1.b.color_background_default));
    }

    public final m60.w e() {
        m60.w wVar = this.f118902l;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final lh0.a0 g() {
        lh0.a0 a0Var = this.f118901k;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // sq.f
    public final xk2.k getCloseupImpressionHelper() {
        return this.B;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PINNER_CAROUSEL;
    }

    @Override // sq.f
    /* renamed from: getImpressionParams */
    public final sq.g getImpressionLoggingParams() {
        return this.f118894d;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    public final pq.d i() {
        pq.d dVar = this.f118909s;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("mediaActionsContainer");
        throw null;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f118892b) {
            return;
        }
        this.f118892b = true;
        jb jbVar = (jb) ((p) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f118898h = (fb) jbVar.f113493k.get();
        this.f118899i = oaVar.w2();
        this.f118900j = (b60.b) oaVar.f113850p0.get();
        this.f118901k = s8Var.j5();
        this.f118902l = (m60.w) oaVar.f113885r0.get();
        this.f118903m = (xr.a) oaVar.f113756jc.get();
        this.f118904n = (i21.c) jbVar.f113492j.get();
        this.f118905o = (ur.a) oaVar.Kb.get();
        this.f118906p = (es.a) oaVar.P6.get();
        this.f118907q = (is1.f) oaVar.f113758je.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        if (r9.l("android_visual_search_unified_entry_point_row") == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tq.n.onAttachedToWindow():void");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e().j(this.f118916z);
        super.onDetachedFromWindow();
    }

    @Override // jq.a
    public final void openPinOverflowMenuModal(boolean z13) {
        ArrayList arrayList;
        m21.a aVar;
        f30 pin = getPin();
        nx.d0 viewPinalytics = getViewPinalytics();
        if (pin == null || viewPinalytics == null) {
            return;
        }
        f1 f1Var = f1.TAP;
        u0 u0Var = u0.PIN_CLOSEUP_PRODUCT_MORE_OPTIONS;
        HashMap hashMap = new HashMap();
        getPinAuxHelper().c(pin, hashMap);
        Unit unit = Unit.f80348a;
        viewPinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        gs0.k kVar = this.f118899i;
        String str = null;
        if (kVar == null) {
            Intrinsics.r("pinOverflowMenuModalProvider");
            throw null;
        }
        jo1.a aVar2 = jo1.a.RELATED_PINS;
        o oVar = this.f118910t;
        if (oVar != null && (arrayList = oVar.f118921e) != null && (aVar = (m21.a) arrayList.get(oVar.f118922f)) != null) {
            str = aVar.a();
        }
        gs0.k.a(kVar, pin, aVar2, true, false, null, null, false, null, null, false, null, null, false, null, str, null, false, false, false, false, null, null, false, 8372216).showFeedBack();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // jq.a
    public final void showLoadingSpinner(boolean z13) {
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateActive(boolean z13) {
        super.updateActive(z13);
        lh0.a0 g13 = g();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) g13.f83294a;
        if ((g1Var.o("android_ctx_customized_icon_animation", "enabled", z3Var) || g1Var.l("android_ctx_customized_icon_animation")) && this.f118909s != null) {
            if (z13) {
                i().b();
                return;
            }
            s71.l lVar = i().f100979l;
            if (!(lVar instanceof s71.l)) {
                lVar = null;
            }
            if (lVar == null || !lVar.f111382k) {
                return;
            }
            if (lVar.f111383l) {
                lVar.c().d();
            } else {
                lVar.b().f2();
            }
        }
    }

    @Override // rq.r1
    public final void updateMediaViewSize(int i13) {
        m21.a aVar;
        List list = this.f118911u;
        if (list == null || (aVar = (m21.a) CollectionsKt.firstOrNull(list)) == null || b().getLayoutParams().height <= i13) {
            return;
        }
        int b03 = c0.d.b0((aVar.j() * 1.0f) / aVar.i(), i13);
        getLayoutParams().height = i13;
        b().getLayoutParams().height = i13;
        f30 pin = getPin();
        if (pin == null || kg.t.Q(pin)) {
            return;
        }
        b().getLayoutParams().width = b03;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        o oVar;
        super.updateView();
        f30 pin = getPin();
        if (pin == null || (oVar = this.f118910t) == null) {
            return;
        }
        oVar.q3(pin);
    }
}
