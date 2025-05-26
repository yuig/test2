package com.pinterest.ads.feature.owc.view.base;

import ac2.m;
import ac2.o1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ao2.e2;
import ao2.m2;
import ao2.v0;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.ads.onetap.view.SwipeAwareScrollView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import cu.a;
import cu.f;
import cu.i;
import cu.n;
import cu.o;
import cu.p;
import df.j1;
import fu.c;
import h32.d4;
import hf0.b;
import iv.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kh2.k3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import lh0.a4;
import lh0.g;
import lh0.g1;
import lh0.z3;
import m60.q0;
import m60.u;
import m60.w;
import nt.c2;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import ps.q;
import ps.r;
import sp.d;
import xk2.v;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/base/BaseAdsScrollingModule;", "Lcom/pinterest/ads/onetap/view/SwipeAwareScrollView;", "Lcu/a;", "Landroid/view/View$OnTouchListener;", "Lue0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class BaseAdsScrollingModule extends SwipeAwareScrollView implements a, View.OnTouchListener, ue0.a {
    public static final /* synthetic */ int D0 = 0;
    public final boolean A0;
    public final v B0;
    public final v C0;
    public final AdsTabletLandscapeDetailView S;
    public final CloseupCarouselView T;
    public final View U;
    public final View V;
    public final v W;

    /* renamed from: a0, reason: collision with root package name */
    public float f35314a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f35315b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f35316c0;

    /* renamed from: d0, reason: collision with root package name */
    public AdsCarouselIndexModule f35317d0;

    /* renamed from: e0, reason: collision with root package name */
    public AdsToolbarModule f35318e0;

    /* renamed from: f0, reason: collision with root package name */
    public m f35319f0;

    /* renamed from: g0, reason: collision with root package name */
    public Set f35320g0;

    /* renamed from: h0, reason: collision with root package name */
    public i f35321h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f35322i0;

    /* renamed from: j0, reason: collision with root package name */
    public final w f35323j0;

    /* renamed from: k0, reason: collision with root package name */
    public final FrameLayout f35324k0;

    /* renamed from: l0, reason: collision with root package name */
    public f30 f35325l0;

    /* renamed from: m0, reason: collision with root package name */
    public a8.v f35326m0;

    /* renamed from: n0, reason: collision with root package name */
    public c f35327n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f35328o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f35329p0;

    /* renamed from: q0, reason: collision with root package name */
    public final e2 f35330q0;

    /* renamed from: r0, reason: collision with root package name */
    public final m2 f35331r0;

    /* renamed from: s0, reason: collision with root package name */
    public final v f35332s0;

    /* renamed from: t0, reason: collision with root package name */
    public final v f35333t0;

    /* renamed from: u0, reason: collision with root package name */
    public final v f35334u0;

    /* renamed from: v0, reason: collision with root package name */
    public final v f35335v0;

    /* renamed from: w0, reason: collision with root package name */
    public final v f35336w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f35337x0;

    /* renamed from: y0, reason: collision with root package name */
    public final v f35338y0;

    /* renamed from: z0, reason: collision with root package name */
    public final v f35339z0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseAdsScrollingModule(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void H0() {
        ViewGroup.LayoutParams layoutParams;
        g S0 = S0();
        S0.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) S0.f83348a;
        boolean z13 = false;
        if (g1Var.o("ad_closeup_ui_no_bars", "enabled", z3Var) || g1Var.l("ad_closeup_ui_no_bars") ? n1().f35422i > b.g(getContext()) * 0.7f : n1().f35422i > (this.f35322i0 - P0()) - (L0() * 2)) {
            z13 = true;
        }
        if (y1() && z13) {
            int P0 = (int) ((this.f35322i0 - P0()) - n1().f35422i);
            Integer num = null;
            FrameLayout frameLayout = this.f35324k0;
            ViewGroup.LayoutParams layoutParams2 = frameLayout != null ? frameLayout.getLayoutParams() : null;
            if (layoutParams2 != null) {
                if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
                    num = Integer.valueOf(layoutParams.height + P0);
                }
                layoutParams2.height = num.intValue();
            }
            K0().L(Integer.valueOf(P0), K0().m() + P0);
            i K0 = K0();
            K0.C(K0.j() + P0);
            this.f35322i0 -= P0;
        }
    }

    public final void H1(int i13) {
        CloseupCarouselView n13 = n1();
        n13.getPinterestRecyclerView().f52535e.M0(i13);
        n13.f35424k = i13;
    }

    public void I0() {
        K0().q();
    }

    public final void J1(float f13) {
        Set set = this.f35320g0;
        if (set == null) {
            Intrinsics.r("obstructionViews");
            throw null;
        }
        set.add(K0());
        if (((Boolean) this.f35335v0.getValue()).booleanValue()) {
            AdsCarouselIndexModule adsCarouselIndexModule = this.f35317d0;
            if (adsCarouselIndexModule == null) {
                Intrinsics.r("carouselIndexModule");
                throw null;
            }
            adsCarouselIndexModule.setAlpha(1 - f13);
        }
        AdsToolbarModule adsToolbarModule = this.f35318e0;
        if (adsToolbarModule == null) {
            Intrinsics.r("toolbarModule");
            throw null;
        }
        float f14 = 1;
        adsToolbarModule.setAlpha(f14 - f13);
        if (f13 == 1.0f) {
            AdsToolbarModule adsToolbarModule2 = this.f35318e0;
            if (adsToolbarModule2 == null) {
                Intrinsics.r("toolbarModule");
                throw null;
            }
            bs1.c.X0(adsToolbarModule2);
        }
        if (f13 < 1.0f) {
            AdsToolbarModule adsToolbarModule3 = this.f35318e0;
            if (adsToolbarModule3 == null) {
                Intrinsics.r("toolbarModule");
                throw null;
            }
            bs1.c.U1(adsToolbarModule3);
        }
        float f15 = 5 * f13;
        this.V.setAlpha(Math.min(f15, 0.6f));
        K0().f53208j.setAlpha(Math.max((-f15) + f14, 0.0f));
        K0().Z(Math.min(f15, 1.0f));
        d2();
    }

    public final i K0() {
        i iVar = this.f35321h0;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.r("bottomSheet");
        throw null;
    }

    public void K1() {
        K0().e();
    }

    public final int L0() {
        return ((Number) this.f35333t0.getValue()).intValue();
    }

    public void M1(int i13) {
        if (y1()) {
            return;
        }
        CloseupCarouselView n13 = n1();
        d2();
        n13.s(i13);
    }

    public void O1() {
    }

    public final int P0() {
        return ((Number) this.f35332s0.getValue()).intValue();
    }

    public final void R1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<set-?>");
        this.f35325l0 = f30Var;
    }

    public final g S0() {
        return (g) this.W.getValue();
    }

    public final int T0() {
        if (y1()) {
            return 0;
        }
        float f13 = n1().f35422i - this.f35322i0;
        Float valueOf = Float.valueOf(f13);
        if (f13 <= 0.0f) {
            valueOf = null;
        }
        if (valueOf != null) {
            return (int) (valueOf.floatValue() * 0.7f);
        }
        return 0;
    }

    public void U1() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (bs1.c.c1(context)) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.f35322i0 = b.i(bs1.c.k0(context2)) - K0().j();
        }
    }

    public void V1() {
        a0.k1(this.U, K0().j());
    }

    public void X1(AdsCarouselIndexModule carouselIndexModule, AdsToolbarModule toolbarModule, m videoManager, HashSet obstructionViews) {
        Intrinsics.checkNotNullParameter(carouselIndexModule, "carouselIndexModule");
        Intrinsics.checkNotNullParameter(toolbarModule, "toolbarModule");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(obstructionViews, "obstructionViews");
        Intrinsics.checkNotNullParameter(videoManager, "<set-?>");
        this.f35319f0 = videoManager;
        Intrinsics.checkNotNullParameter(carouselIndexModule, "<set-?>");
        this.f35317d0 = carouselIndexModule;
        Intrinsics.checkNotNullParameter(toolbarModule, "<set-?>");
        this.f35318e0 = toolbarModule;
        Intrinsics.checkNotNullParameter(obstructionViews, "<set-?>");
        this.f35320g0 = obstructionViews;
        V1();
        U1();
    }

    public final f30 Y0() {
        f30 f30Var = this.f35325l0;
        if (f30Var != null) {
            return f30Var;
        }
        Intrinsics.r("pin");
        throw null;
    }

    @Override // cu.a
    public void a() {
        c cVar = this.f35327n0;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void a2() {
        AdsTabletLandscapeDetailView adsTabletLandscapeDetailView = this.S;
        if (adsTabletLandscapeDetailView != null) {
            String z63 = Y0().z6();
            String c43 = Y0().c4();
            wy0 n13 = b40.n(Y0());
            String j13 = n13 != null ? dl2.b.j1(n13) : null;
            wy0 n14 = b40.n(Y0());
            Integer V2 = n14 != null ? n14.V2() : null;
            wy0 n15 = b40.n(Y0());
            String s03 = n15 != null ? dl2.b.s0(n15) : null;
            String i43 = Y0().i4();
            a0.p(adsTabletLandscapeDetailView.f35298a, String.valueOf(z63));
            a0.p(adsTabletLandscapeDetailView.f35299b, String.valueOf(c43));
            a0.p(adsTabletLandscapeDetailView.f35300c, String.valueOf(j13));
            int intValue = V2 != null ? V2.intValue() : 0;
            Resources resources = adsTabletLandscapeDetailView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Intrinsics.checkNotNullParameter(resources, "resources");
            String quantityString = resources.getQuantityString(r.plural_followers, intValue);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            a0.p(adsTabletLandscapeDetailView.f35301d, j1.Y(quantityString, new Object[]{Integer.valueOf(intValue)}, null, 6));
            adsTabletLandscapeDetailView.f35302e.V1(s03, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(Color.parseColor(i43)), (r18 & 64) != 0 ? null : null, null);
        }
    }

    @Override // ue0.a
    public final void b() {
        kg.a.E(n1().getScaleX(), 1.0f, 100L, n1()).start();
    }

    /* renamed from: b1, reason: from getter */
    public final FrameLayout getF35324k0() {
        return this.f35324k0;
    }

    public void b2() {
        if (y1()) {
            boolean z13 = z1();
            FrameLayout frameLayout = this.f35324k0;
            if (z13) {
                if (frameLayout != null) {
                    Context context = getContext();
                    int i13 = q0.dark_gray;
                    Object obj = d5.a.f53679a;
                    frameLayout.setBackgroundColor(context.getColor(i13));
                }
            } else if (!z13 && frameLayout != null) {
                frameLayout.setBackgroundColor(this.f35328o0);
            }
            if (frameLayout != null) {
                a0.k1(frameLayout, this.f35322i0 - P0());
            }
        }
    }

    public void c2() {
        SimplePlayerControlView simplePlayerControlView;
        CloseupCarouselView n13 = n1();
        d2();
        if (y1()) {
            FrameLayout parent = this.f35324k0;
            if (parent != null) {
                Intrinsics.checkNotNullParameter(parent, "viewGroup");
                com.pinterest.feature.pincarouselads.view.a0 b13 = n13.b();
                if (b13 != null) {
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    PinterestVideoView pinterestVideoView = b13.f47367l;
                    if (pinterestVideoView != null && (simplePlayerControlView = pinterestVideoView.F) != null) {
                        k3.M1(simplePlayerControlView, parent);
                    }
                    Unit unit = Unit.f80348a;
                }
                n13.n(this.f35322i0 - P0());
                return;
            }
            return;
        }
        n13.n(L0() + this.f35322i0);
        Context context = n13.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i13 = eo1.b.color_black_900;
        int i14 = eo1.b.sema_color_background_transparent;
        Intrinsics.checkNotNullParameter(context, "<this>");
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        Object obj = d5.a.f53679a;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{context.getColor(i13), context.getColor(i14)});
        Resources resources = n13.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a0.K(72, resources);
        L0();
        n13.m(gradientDrawable);
        n13.o(L0());
        L0();
        n13.b();
    }

    public final void d2() {
        m mVar = this.f35319f0;
        if (mVar != null) {
            ((o1) mVar).w();
        } else {
            Intrinsics.r("videoManager");
            throw null;
        }
    }

    @Override // ue0.a
    public final void e(float f13, float f14) {
        if (f13 > 0.0f) {
            float min = Math.min(1.4f, ((f14 / b.g(getContext())) * 0.4f) + 1.0f);
            CloseupCarouselView n13 = n1();
            n13.setScaleX(min);
            n13.setScaleY(min);
        }
    }

    @Override // ue0.a
    public final void g() {
    }

    @Override // cu.a
    public void j() {
        a8.v vVar = this.f35326m0;
        if (vVar != null) {
            cu.m this$0 = (cu.m) vVar.f1465b;
            int i13 = cu.m.f53224u0;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            boolean z13 = dl2.b.z1(this$0.getContext(), "com.android.chrome");
            at.a aVar = this$0.f53232l0;
            if (aVar != null) {
                aVar.e0(null, z13);
            }
        }
        c cVar = this.f35327n0;
        if (cVar != null) {
            cVar.j();
        }
    }

    public final CloseupCarouselView n1() {
        CloseupCarouselView closeupCarouselView = this.T;
        if (closeupCarouselView != null) {
            return closeupCarouselView;
        }
        Intrinsics.r("pinMediaView");
        throw null;
    }

    @Override // com.pinterest.ui.scrollview.ObservableScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35331r0.cancel((CancellationException) null);
    }

    @Override // com.pinterest.ads.onetap.view.SwipeAwareScrollView, com.pinterest.ui.scrollview.ObservableScrollView, androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() == 0) {
            this.f35314a0 = event.getRawY() - ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
        return super.onInterceptTouchEvent(event);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r4 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            cu.i r4 = r3.K0()
            int r4 = r4.j()
            int r0 = r5.getActionMasked()
            r1 = 1
            if (r0 == r1) goto L73
            r2 = 2
            if (r0 == r2) goto L21
            r1 = 3
            if (r0 == r1) goto L73
            goto L94
        L21:
            float r0 = r5.getRawY()
            float r2 = r3.f35314a0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r0 = r1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            r3.f35316c0 = r0
            boolean r0 = r3.canScrollVertically(r1)
            if (r0 != 0) goto L65
            boolean r0 = r3.getA0()
            if (r0 == 0) goto L65
            float r0 = r5.getRawY()
            float r2 = r3.f35314a0
            float r0 = r0 - r2
            int r0 = (int) r0
            int r0 = r4 - r0
            int r0 = java.lang.Math.max(r4, r0)
            r3.f35315b0 = r0
            cu.i r0 = r3.K0()
            int r2 = r3.f35315b0
            r0.C(r2)
            int r0 = r3.f35315b0
            int r0 = r0 - r4
            float r0 = (float) r0
            int r2 = r3.f35322i0
            float r2 = (float) r2
            float r0 = r0 / r2
            r3.J1(r0)
            int r0 = r3.f35315b0
            if (r0 == r4) goto L94
            return r1
        L65:
            boolean r4 = r3.canScrollVertically(r1)
            r4 = r4 ^ r1
            r3.f35337x0 = r4
            float r4 = r5.getRawY()
            r3.f35314a0 = r4
            goto L94
        L73:
            int r0 = r3.f35315b0
            int r0 = r0 - r4
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 <= r1) goto L82
            cu.i r4 = r3.K0()
            r4.e()
            goto L94
        L82:
            cu.i r0 = r3.K0()
            r0.C(r4)
            cu.i r4 = r3.K0()
            r4.b()
            r4 = 0
            r3.J1(r4)
        L94:
            boolean r4 = r3.onTouchEvent(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public int p1() {
        return b.n() ? q.ads_closeup_scrolling_module_landscape_tablet : q.ads_closeup_scrolling_module;
    }

    public aa2.c r1() {
        return (aa2.c) this.B0.getValue();
    }

    /* renamed from: s1, reason: from getter */
    public boolean getA0() {
        return this.A0;
    }

    public void t1(List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        CloseupCarouselView n13 = n1();
        boolean z13 = true;
        n13.f35420g = true;
        n13.f35426m = (View.OnClickListener) this.C0.getValue();
        n13.f35427n = new d(4, n13, this);
        if (pe.i.O0(Y0())) {
            n13.f35433t = new e(z13, 8);
        }
        if (((Boolean) this.f35336w0.getValue()).booleanValue()) {
            n13.f35433t = new e(false, 7);
        }
        CloseupCarouselView.k(n13, images, d4.ONE_TAP_V3_BROWSER, h32.a4.BROWSER, ((es.c) as.c.a()).q(Y0(), f.f53192m), false, 16);
    }

    public void w1(i bottomSheet, AdsCarouselIndexModule carouselIndexModule, AdsToolbarModule toolbarModule, m videoManager, HashSet obstructionViews) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        Intrinsics.checkNotNullParameter(carouselIndexModule, "carouselIndexModule");
        Intrinsics.checkNotNullParameter(toolbarModule, "toolbarModule");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(obstructionViews, "obstructionViews");
        Intrinsics.checkNotNullParameter(bottomSheet, "<set-?>");
        this.f35321h0 = bottomSheet;
        I0();
        X1(carouselIndexModule, toolbarModule, videoManager, obstructionViews);
        FrameLayout frameLayout = this.f35324k0;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new n(this, 0));
        }
        K0().f53211m = this;
        setOnTouchListener(this);
        aa2.c r13 = r1();
        ArrayList arrayList = this.F;
        if (!arrayList.contains(r13)) {
            arrayList.add(r13);
        }
        this.Q = new ue0.b(getContext(), this);
        H0();
        b2();
        if (z1()) {
            postDelayed(new c2(this, 1), 750L);
        }
        if (b.n()) {
            a2();
        }
        if (b.p()) {
            kh2.m2.o0(this);
        }
        if (((Boolean) this.f35339z0.getValue()).booleanValue()) {
            m2 m2Var = this.f35331r0;
            m2Var.getClass();
            j.z(dl2.b.b(kotlin.coroutines.g.d(this.f35330q0, m2Var)), null, null, new p(this, null), 3);
        }
    }

    public boolean y1() {
        return ((Boolean) this.f35338y0.getValue()).booleanValue();
    }

    public final boolean z1() {
        return ((Boolean) this.f35334u0.getValue()).booleanValue();
    }

    public /* synthetic */ BaseAdsScrollingModule(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdsScrollingModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.W = xk2.m.b(f.f53191l);
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f35323j0 = wVar;
        ko2.f fVar = v0.f20219a;
        this.f35330q0 = ho2.q.f69782a;
        this.f35331r0 = ue.c.b();
        this.f35332s0 = xk2.m.b(new o(this, 1));
        this.f35333t0 = xk2.m.b(new o(this, 0));
        this.f35334u0 = xk2.m.b(new o(this, 6));
        this.f35335v0 = xk2.m.b(new o(this, 2));
        this.f35336w0 = xk2.m.b(new o(this, 5));
        this.f35338y0 = xk2.m.b(new o(this, 4));
        this.f35339z0 = xk2.m.b(new o(this, 3));
        this.A0 = true;
        this.B0 = xk2.m.b(new o(this, 8));
        this.C0 = xk2.m.b(new o(this, 7));
        View.inflate(context, p1(), this);
        this.f35324k0 = (FrameLayout) findViewById(ps.p.opaque_one_tap_pin_media_container);
        this.S = (AdsTabletLandscapeDetailView) findViewById(ps.p.detail_view_landscape_tablet);
        View findViewById = findViewById(ps.p.opaque_one_tap_carousel_view);
        CloseupCarouselView closeupCarouselView = (CloseupCarouselView) findViewById;
        closeupCarouselView.f35416J = true;
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        Intrinsics.checkNotNullParameter(closeupCarouselView, "<set-?>");
        this.T = closeupCarouselView;
        View findViewById2 = findViewById(ps.p.opaque_one_tap_shadow_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.V = findViewById2;
        View findViewById3 = findViewById(ps.p.opaque_one_tap_scroll_helper_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.U = findViewById3;
        setId(ps.p.opaque_one_tap_scrollview);
    }
}
