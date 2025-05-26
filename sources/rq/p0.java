package rq;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.grid.PinterestRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import so.eb;
import so.jb;
import so.oa;
import so.s8;
import so.w8;

/* loaded from: classes3.dex */
public final class p0 extends r1 implements rs.b, rs.a, sq.f {
    public static final /* synthetic */ int F = 0;
    public boolean A;
    public ArrayList B;
    public ss.b C;
    public GestaltIconButton D;
    public final xk2.v E;

    /* renamed from: b, reason: collision with root package name */
    public boolean f109434b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f109435c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.q f109436d;

    /* renamed from: e, reason: collision with root package name */
    public final x02.i2 f109437e;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f109438f;

    /* renamed from: g, reason: collision with root package name */
    public final sq.g f109439g;

    /* renamed from: h, reason: collision with root package name */
    public final String f109440h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f109441i;

    /* renamed from: j, reason: collision with root package name */
    public eb f109442j;

    /* renamed from: k, reason: collision with root package name */
    public gs0.k f109443k;

    /* renamed from: l, reason: collision with root package name */
    public lh0.a0 f109444l;

    /* renamed from: m, reason: collision with root package name */
    public xr.a f109445m;

    /* renamed from: n, reason: collision with root package name */
    public i21.c f109446n;

    /* renamed from: o, reason: collision with root package name */
    public ur.a f109447o;

    /* renamed from: p, reason: collision with root package name */
    public es.a f109448p;

    /* renamed from: q, reason: collision with root package name */
    public final ss.b f109449q;

    /* renamed from: r, reason: collision with root package name */
    public List f109450r;

    /* renamed from: s, reason: collision with root package name */
    public final yk1.j f109451s;

    /* renamed from: t, reason: collision with root package name */
    public CloseupCarouselView f109452t;

    /* renamed from: u, reason: collision with root package name */
    public View f109453u;

    /* renamed from: v, reason: collision with root package name */
    public TextSwitcher f109454v;

    /* renamed from: w, reason: collision with root package name */
    public TextSwitcher f109455w;

    /* renamed from: x, reason: collision with root package name */
    public CarouselIndexView f109456x;

    /* renamed from: y, reason: collision with root package name */
    public j21.f f109457y;

    /* renamed from: z, reason: collision with root package name */
    public int f109458z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Context context, nx.d0 pinalytics, uj2.q networkStateStream, b60.b activeUserManager, x02.i2 pinRepository, r0 params, sq.g impressionLoggingParams, String navigationSource, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(impressionLoggingParams, "impressionLoggingParams");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        inject();
        this.f109435c = pinalytics;
        this.f109436d = networkStateStream;
        this.f109437e = pinRepository;
        this.f109438f = params;
        this.f109439g = impressionLoggingParams;
        this.f109440h = navigationSource;
        this.f109441i = z13;
        eb ebVar = this.f109442j;
        if (ebVar == null) {
            Intrinsics.r("pinCloseupCarouselPresenterFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) getPresenterPinalyticsFactory()).f(pinalytics, "");
        w8 w8Var = ebVar.f113406a;
        uj2.q qVar = (uj2.q) w8Var.f114689b.f113947u9.get();
        oa oaVar = w8Var.f114689b;
        this.f109449q = new ss.b(f13, qVar, (m60.w) oaVar.f113885r0.get(), (j80.b) oaVar.O6.get(), w8Var.f114690c.j5());
        yk1.j a13 = yk1.j.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.f109451s = a13;
        this.E = xk2.m.b(new db.m(this, 12));
    }

    public final HashMap b(int i13, int i14) {
        HashMap auxData = new HashMap();
        nm.u uVar = new nm.u();
        uVar.s(Integer.valueOf(i13), "image_index");
        uVar.s(Integer.valueOf(i14), "image_count");
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        auxData.put("commerce_data", sVar);
        f30 pin = getPin();
        if (pin == null) {
            return new HashMap();
        }
        nx.b0 pinAuxHelper = getPinAuxHelper();
        nx.q commerceData = new nx.q();
        pinAuxHelper.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        HashMap n13 = pinAuxHelper.n(pin, -1, null, auxData, commerceData);
        Intrinsics.g(n13, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ com.pinterest.analytics.AuxDataKt.AuxData }");
        return n13;
    }

    @Override // rs.a
    public final void b2(int i13) {
        h32.g0 g0Var = h32.g0.PIN_THUMBNAIL_CAROUSEL;
        h32.u0 u0Var = h32.u0.PIN_THUMBNAIL_CAROUSEL_CELL;
        List list = this.f109450r;
        if (list == null) {
            Intrinsics.r("carouselData");
            throw null;
        }
        this.f109435c.h(g0Var, u0Var, b(i13, list.size()));
        CloseupCarouselView closeupCarouselView = this.f109452t;
        if (closeupCarouselView == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        closeupCarouselView.getPinterestRecyclerView().f52535e.M0(i13);
        closeupCarouselView.f35424k = i13;
        e(i13);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        GestaltIconButton gestaltIconButton;
        View.inflate(getContext(), n80.d.pin_closeup_carousel_view_lego, this);
        Context context = getContext();
        int i13 = eo1.b.color_background_default;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i13));
        View findViewById = findViewById(n80.c.carouselView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f109452t = (CloseupCarouselView) findViewById;
        View findViewById2 = findViewById(n80.c.gradientView);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f109453u = findViewById2;
        View findViewById3 = findViewById(n80.c.carouselTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f109454v = (TextSwitcher) findViewById3;
        View findViewById4 = findViewById(n80.c.carouselDesc);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f109455w = (TextSwitcher) findViewById4;
        View findViewById5 = findViewById(n80.c.carouselContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        View findViewById6 = findViewById(n80.c.carouselIndexTrackerView);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f109456x = (CarouselIndexView) findViewById6;
        final int i14 = 1;
        setOrientation(1);
        GestaltIconButton gestaltIconButton2 = null;
        if (g()) {
            TextSwitcher textSwitcher = this.f109454v;
            if (textSwitcher == null) {
                Intrinsics.r("carouselTitle");
                throw null;
            }
            bs1.c.X0(textSwitcher);
            TextSwitcher textSwitcher2 = this.f109455w;
            if (textSwitcher2 == null) {
                Intrinsics.r("carouselDesc");
                throw null;
            }
            bs1.c.X0(textSwitcher2);
        }
        r0 r0Var = this.f109438f;
        if (r0Var.f109501a) {
            CarouselIndexView carouselIndexView = this.f109456x;
            if (carouselIndexView == null) {
                Intrinsics.r("indexTrackerView");
                throw null;
            }
            bs1.c.X0(carouselIndexView);
            View view = this.f109453u;
            if (view == null) {
                Intrinsics.r("gradientView");
                throw null;
            }
            bs1.c.X0(view);
        }
        CloseupCarouselView closeupCarouselView = this.f109452t;
        if (closeupCarouselView == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        closeupCarouselView.f35420g = true;
        f30 pin = getPin();
        String uid = pin != null ? pin.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        closeupCarouselView.I = uid;
        CloseupCarouselView closeupCarouselView2 = this.f109452t;
        if (closeupCarouselView2 == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        f30 pin2 = getPin();
        ur.a aVar = this.f109447o;
        if (aVar == null) {
            Intrinsics.r("adsCoreDependencies");
            throw null;
        }
        closeupCarouselView2.K = bs1.c.q0(pin2, aVar);
        CarouselIndexView carouselIndexView2 = this.f109456x;
        if (carouselIndexView2 == null) {
            Intrinsics.r("indexTrackerView");
            throw null;
        }
        carouselIndexView2.c(eo1.b.color_white_0, pq1.a.color_carousel_index_unselected);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextSwitcher textSwitcher3 = this.f109454v;
        if (textSwitcher3 == null) {
            Intrinsics.r("carouselTitle");
            throw null;
        }
        kg.a.m(context2, textSwitcher3);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        TextSwitcher textSwitcher4 = this.f109455w;
        if (textSwitcher4 == null) {
            Intrinsics.r("carouselDesc");
            throw null;
        }
        kg.a.m(context3, textSwitcher4);
        CloseupCarouselView closeupCarouselView3 = this.f109452t;
        if (closeupCarouselView3 == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        closeupCarouselView3.setPinalytics(this.f109435c);
        final int i15 = 0;
        closeupCarouselView3.f35426m = new View.OnClickListener(this) { // from class: rq.m0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f109368b;

            {
                this.f109368b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                p0 this$0 = this.f109368b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ss.b bVar = this$0.C;
                        if (bVar != null) {
                            CloseupCarouselView closeupCarouselView4 = this$0.f109452t;
                            String str = null;
                            if (closeupCarouselView4 == null) {
                                Intrinsics.r("carouselView");
                                throw null;
                            }
                            int i17 = closeupCarouselView4.f35424k;
                            rs.b bVar2 = (rs.b) bVar.getView();
                            ArrayList arrayList = bVar.f115133e;
                            if (arrayList != null && i17 >= 0 && i17 < arrayList.size()) {
                                str = ((m21.a) arrayList.get(i17)).d();
                            }
                            p0 p0Var = (p0) bVar2;
                            p0Var.getClass();
                            PinCloseupBaseModule.handleWebsiteClicked$default(p0Var, str, null, null, 6, null);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ss.b bVar3 = this$0.C;
                        if (bVar3 != null) {
                            nx.d0 d0Var = bVar3.getPresenterPinalytics().f122379a;
                            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                            nx.d0.B(d0Var, h32.f1.TAP, h32.g0.PIN_CLOSEUP_PRODUCT_VIDEO, null, null, 28);
                            return;
                        }
                        return;
                }
            }
        };
        closeupCarouselView3.f35427n = new n0(this, i15);
        closeupCarouselView3.f35428o = new View.OnClickListener(this) { // from class: rq.m0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f109368b;

            {
                this.f109368b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i14;
                p0 this$0 = this.f109368b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ss.b bVar = this$0.C;
                        if (bVar != null) {
                            CloseupCarouselView closeupCarouselView4 = this$0.f109452t;
                            String str = null;
                            if (closeupCarouselView4 == null) {
                                Intrinsics.r("carouselView");
                                throw null;
                            }
                            int i17 = closeupCarouselView4.f35424k;
                            rs.b bVar2 = (rs.b) bVar.getView();
                            ArrayList arrayList = bVar.f115133e;
                            if (arrayList != null && i17 >= 0 && i17 < arrayList.size()) {
                                str = ((m21.a) arrayList.get(i17)).d();
                            }
                            p0 p0Var = (p0) bVar2;
                            p0Var.getClass();
                            PinCloseupBaseModule.handleWebsiteClicked$default(p0Var, str, null, null, 6, null);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ss.b bVar3 = this$0.C;
                        if (bVar3 != null) {
                            nx.d0 d0Var = bVar3.getPresenterPinalytics().f122379a;
                            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                            nx.d0.B(d0Var, h32.f1.TAP, h32.g0.PIN_CLOSEUP_PRODUCT_VIDEO, null, null, 28);
                            return;
                        }
                        return;
                }
            }
        };
        closeupCarouselView3.f35425l = new o0(0, this, closeupCarouselView3);
        boolean z13 = r0Var.f109505e;
        if (z13) {
            ViewGroup.LayoutParams layoutParams = closeupCarouselView3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 1;
            closeupCarouselView3.setLayoutParams(layoutParams2);
            View view2 = this.f109453u;
            if (view2 == null) {
                Intrinsics.r("gradientView");
                throw null;
            }
            bs1.c.X0(view2);
        }
        TextSwitcher textSwitcher5 = this.f109454v;
        if (textSwitcher5 == null) {
            Intrinsics.r("carouselTitle");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = textSwitcher5.getLayoutParams();
        Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMarginStart(0);
        layoutParams4.setMarginEnd(0);
        TextSwitcher textSwitcher6 = this.f109455w;
        if (textSwitcher6 == null) {
            Intrinsics.r("carouselDesc");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams5 = textSwitcher6.getLayoutParams();
        Intrinsics.g(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.setMarginStart(0);
        layoutParams6.setMarginEnd(0);
        if (!r0Var.f109504d) {
            GestaltIconButton gestaltIconButton3 = (GestaltIconButton) findViewById(n80.c.carousel_overflow_menu_button);
            if (gestaltIconButton3 != null) {
                com.bumptech.glide.c.u1(gestaltIconButton3);
                gestaltIconButton3.u(new xo.k(this, 9));
                gestaltIconButton2 = gestaltIconButton3;
            }
            this.D = gestaltIconButton2;
        }
        if (!z13 || (gestaltIconButton = this.D) == null) {
            return;
        }
        bs1.c.X0(gestaltIconButton);
    }

    public final void e(int i13) {
        PinterestRecyclerView pinterestRecyclerView;
        int i14;
        androidx.recyclerview.widget.b2 b2Var;
        if (i13 == this.f109458z) {
            return;
        }
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            int i15 = 0;
            for (Object obj : arrayList) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                ((h21.a) obj).f66544c = i15 == i13;
                i15 = i16;
            }
        }
        j21.f fVar = this.f109457y;
        if (fVar == null || (pinterestRecyclerView = fVar.getPinterestRecyclerView()) == null) {
            return;
        }
        RecyclerView recyclerView = pinterestRecyclerView.f52531a;
        if (recyclerView != null && (b2Var = recyclerView.f19240m) != null) {
            b2Var.h();
        }
        int i17 = this.f109458z;
        List list = this.f109450r;
        if (list == null) {
            Intrinsics.r("carouselData");
            throw null;
        }
        int size = list.size();
        if (i13 > i17) {
            if (i13 <= size - 2) {
                i14 = i13 + 1;
            }
            i14 = i13;
        } else {
            if (i13 != 0) {
                i14 = i13 - 1;
            }
            i14 = i13;
        }
        pinterestRecyclerView.h(i14, true);
        this.f109458z = i13;
    }

    public final boolean g() {
        if (!this.f109438f.f109501a) {
            ur.a aVar = this.f109447o;
            if (aVar == null) {
                Intrinsics.r("adsCoreDependencies");
                throw null;
            }
            if (((es.c) ((ur.b) aVar).f123058a).M(getPin())) {
                return false;
            }
        }
        return true;
    }

    @Override // sq.f
    public final xk2.k getCloseupImpressionHelper() {
        return this.E;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PINNER_CAROUSEL;
    }

    @Override // sq.f
    /* renamed from: getImpressionParams */
    public final sq.g getImpressionLoggingParams() {
        return this.f109439g;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109434b) {
            return;
        }
        this.f109434b = true;
        jb jbVar = (jb) ((q0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109442j = (eb) jbVar.f113491i.get();
        this.f109443k = oaVar.w2();
        this.f109444l = s8Var.j5();
        this.f109445m = (xr.a) oaVar.f113756jc.get();
        this.f109446n = (i21.c) jbVar.f113492j.get();
        s8Var.a6();
        this.f109447o = (ur.a) oaVar.Kb.get();
        this.f109448p = (es.a) oaVar.P6.get();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ss.b bVar = this.f109449q;
        this.f109451s.d(this, bVar);
        f30 pin = getPin();
        if (pin != null && bVar != null) {
            bVar.q3(pin);
        }
        CloseupCarouselView closeupCarouselView = this.f109452t;
        if (closeupCarouselView == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        CarouselIndexView carouselIndexView = this.f109456x;
        if (carouselIndexView == null) {
            Intrinsics.r("indexTrackerView");
            throw null;
        }
        int i13 = carouselIndexView.f47324c;
        closeupCarouselView.getPinterestRecyclerView().f52535e.M0(i13);
        closeupCarouselView.f35424k = i13;
    }

    @Override // jq.a
    public final void openPinOverflowMenuModal(boolean z13) {
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        gs0.k kVar = this.f109443k;
        if (kVar != null) {
            gs0.k.a(kVar, pin, jo1.a.RELATED_PINS, true, false, null, null, false, null, null, this.f109441i, this.f109440h, null, false, null, null, null, false, false, false, false, null, null, false, 8387064).showFeedBack();
        } else {
            Intrinsics.r("pinOverflowMenuModalProvider");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void renderLandscapeConfiguration() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_spacing_horizontal_large);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.lego_spacing_between_elements);
        TextSwitcher textSwitcher = this.f109454v;
        if (textSwitcher == null) {
            Intrinsics.r("carouselTitle");
            throw null;
        }
        textSwitcher.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        TextSwitcher textSwitcher2 = this.f109454v;
        if (textSwitcher2 == null) {
            Intrinsics.r("carouselTitle");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = textSwitcher2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        textSwitcher2.setLayoutParams(layoutParams2);
        TextSwitcher textSwitcher3 = this.f109455w;
        if (textSwitcher3 == null) {
            Intrinsics.r("carouselDesc");
            throw null;
        }
        textSwitcher3.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize2);
        TextSwitcher textSwitcher4 = this.f109455w;
        if (textSwitcher4 == null) {
            Intrinsics.r("carouselDesc");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = textSwitcher4.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.gravity = 17;
        textSwitcher4.setLayoutParams(layoutParams4);
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
        List list;
        super.updateActive(z13);
        if (!z13 || this.f109457y == null || this.A || (list = this.f109450r) == null) {
            return;
        }
        HashMap b13 = b(0, list.size());
        f30 pin = getPin();
        String uid = pin != null ? pin.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        b13.put("pin_id", uid);
        nx.d0.B(this.f109435c, h32.f1.RENDER, h32.g0.PIN_THUMBNAIL_CAROUSEL, null, b13, 20);
        this.A = true;
    }

    @Override // rq.r1
    public final void updateMediaViewSize(int i13) {
        CloseupCarouselView closeupCarouselView = this.f109452t;
        if (closeupCarouselView == null) {
            Intrinsics.r("carouselView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = closeupCarouselView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i13;
        closeupCarouselView.setLayoutParams(layoutParams);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        f30 pin;
        super.updateView();
        r0 r0Var = this.f109438f;
        if (r0Var.f109501a && (pin = getPin()) != null && df.j1.B0(pin)) {
            f30 pin2 = getPin();
            ss.b bVar = this.f109449q;
            if (!r0Var.f109503c) {
                if (pin2 != null) {
                    bVar.q3(pin2);
                    return;
                }
                return;
            }
            if (this.f109457y != null || pin2 == null) {
                return;
            }
            bVar.q3(pin2);
            ArrayList models = ph.a.L(pin2);
            if (models != null) {
                uk1.d g13 = ((uk1.a) getPresenterPinalyticsFactory()).g();
                g13.d(h32.d4.PIN, h32.a4.PIN_OTHER, null, h32.g0.PINNER_CAROUSEL, null);
                h32.u0 u0Var = h32.u0.PIN_THUMBNAIL_CAROUSEL_CELL;
                HashMap hashMap = new HashMap();
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.margin_half);
                re0.a aVar = re0.a.XXLARGE;
                Resources resources = getResources();
                hf0.b.q();
                int Q = kh2.r.Q(aVar, resources);
                i21.c cVar = this.f109446n;
                if (cVar == null) {
                    Intrinsics.r("pinCarouselPresenterFactory");
                    throw null;
                }
                i21.b a13 = i21.c.a(cVar, new g21.e(null, null, null), new h21.f(null, 0, 13), new np0.e(this.f109437e), "shop_feed", new g21.b(kotlin.collections.z0.f(new Pair("source", "shop_feed"), new Pair("search_query", r0Var.f109502b)), 1), g13, u0Var, hashMap, Q, Q, 2304);
                nx.d0 d0Var = g13.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                j21.f fVar = new j21.f(context, d0Var, this.f109436d, new j21.b(0, 0, 0, 0), "medium", this, eo1.c.margin_half, true, 32);
                fVar.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset / 2);
                yk1.j.a().d(fVar, a13);
                Intrinsics.checkNotNullParameter(models, "models");
                a13.x3(models);
                addView(fVar);
                this.f109457y = fVar;
            } else {
                models = null;
            }
            this.B = models;
        }
    }
}
