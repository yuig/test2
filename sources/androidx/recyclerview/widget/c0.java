package androidx.recyclerview.widget;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.tg0;
import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.settings.SettingsRoundHeaderView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes3.dex */
public final class c0 extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19340a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19341b;

    public c0(Object obj, int i13) {
        this.f19340a = i13;
        this.f19341b = obj;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        hx0.e eVar;
        int i14 = this.f19340a;
        Object obj = this.f19341b;
        switch (i14) {
            case 1:
                if (i13 == 1) {
                    hf0.b.k(((xo.q) obj).f135535d);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 1) {
                    hf0.b.k(((xo.d0) obj).f135475e);
                    break;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 0) {
                    PdpCloseupCarouselView pdpCloseupCarouselView = (PdpCloseupCarouselView) obj;
                    View h10 = pdpCloseupCarouselView.f35068y.h(recyclerView.f19242n);
                    if (h10 != null && recyclerView.f19242n != null) {
                        int Z = l2.Z(h10);
                        pdpCloseupCarouselView.f35051h = Z;
                        if (pdpCloseupCarouselView.f35069z) {
                            pdpCloseupCarouselView.f35069z = false;
                            tq.r rVar = pdpCloseupCarouselView.f35060q;
                            if (rVar != null) {
                                nx.d0 pinalytics = rVar.getPinalytics();
                                h32.f1 f1Var = h32.f1.SWIPE;
                                h32.g0 g0Var = h32.g0.PIN_CLOSEUP_PRODUCT_CAROUSEL;
                                HashMap hashMap = new HashMap();
                                f30 f30Var = rVar.f118929g;
                                if (f30Var != null) {
                                    rVar.f118930h.c(f30Var, hashMap);
                                }
                                hashMap.put("image_index", String.valueOf(Z));
                                Unit unit = Unit.f80348a;
                                nx.d0.B(pinalytics, f1Var, g0Var, null, hashMap, 20);
                            }
                        }
                        o2 o2Var = pdpCloseupCarouselView.f35054k;
                        if (o2Var != null) {
                            o2Var.g(recyclerView, i13);
                            break;
                        }
                    }
                } else if (i13 == 1) {
                    ((PdpCloseupCarouselView) obj).f35069z = true;
                    break;
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                o2 o2Var2 = ((CloseupCarouselView) obj).f35425l;
                if (o2Var2 != null) {
                    o2Var2.g(recyclerView, i13);
                    break;
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                aw.f fVar = (aw.f) obj;
                int i15 = aw.f.f20536w;
                if (fVar.Z() != null) {
                    fVar.t();
                    break;
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                cw.e eVar2 = (cw.e) obj;
                int i16 = cw.e.f53321w;
                if (eVar2.Z() != null) {
                    eVar2.t();
                    break;
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 0) {
                    l2 l2Var = recyclerView.f19242n;
                    Intrinsics.g(l2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int k13 = ((LinearLayoutManager) l2Var).k1();
                    yl1.k kVar = yl1.k.f139345j;
                    if (k13 <= 0) {
                        gg0.k0 k0Var = (gg0.k0) obj;
                        GestaltButton gestaltButton = k0Var.f64947g0;
                        if (gestaltButton != null) {
                            pk.a0.v1(gestaltButton);
                        }
                        GestaltButton gestaltButton2 = k0Var.f64948h0;
                        if (gestaltButton2 != null) {
                            Intrinsics.checkNotNullParameter(gestaltButton2, "<this>");
                            gestaltButton2.d(kVar);
                        }
                        k0Var.p7().h(hg0.c.f69063a);
                        k0Var.p7().h(hg0.f.f69066a);
                        break;
                    } else {
                        gg0.k0 k0Var2 = (gg0.k0) obj;
                        GestaltButton gestaltButton3 = k0Var2.f64947g0;
                        if (gestaltButton3 != null) {
                            Intrinsics.checkNotNullParameter(gestaltButton3, "<this>");
                            gestaltButton3.d(kVar);
                        }
                        GestaltButton gestaltButton4 = k0Var2.f64948h0;
                        if (gestaltButton4 != null) {
                            pk.a0.v1(gestaltButton4);
                        }
                        k0Var2.p7().h(hg0.d.f69064a);
                        k0Var2.p7().h(hg0.e.f69065a);
                        break;
                    }
                }
                break;
            case 15:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(1) && i13 == 0 && (eVar = ((kx0.o) obj).f81077b1) != null) {
                    lh0.h2 h2Var = eVar.f70512f;
                    h2Var.getClass();
                    z3 z3Var = a4.f83297a;
                    lh0.g1 g1Var = (lh0.g1) h2Var.f83382a;
                    if ((g1Var.o("android_news_hub_upsell_hf_m10n", "enabled", z3Var) || g1Var.l("android_news_hub_upsell_hf_m10n")) && !eVar.f70521o.f49190a.t0()) {
                        kx0.o oVar = (kx0.o) ((fx0.b) eVar.getView());
                        oVar.c7().f106352b = true;
                        oVar.c7().f106353c = true;
                        com.pinterest.framework.screens.s sVar = ((ku1.j) oVar.o7()).f80914l;
                        r70.a aVar = sVar != null ? sVar.f49234i : null;
                        r70.a aVar2 = aVar instanceof r70.a ? aVar : null;
                        if (aVar2 != null) {
                            aVar2.c(true);
                        }
                        kx0.o oVar2 = (kx0.o) ((fx0.b) eVar.getView());
                        oVar2.getClass();
                        ur0.g.d(i32.y0.ANDROID_NEWS_HUB_DETAIL_TAKEOVER, oVar2, null);
                        break;
                    }
                }
                break;
            case 19:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 0) {
                    ((z51.e) obj).V0 = false;
                    break;
                } else if (i13 == 1) {
                    ((z51.e) obj).V0 = true;
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        float f13;
        oq.x0 x0Var;
        oq.x0 x0Var2;
        f30 pin;
        f30 pin2;
        f30 pin3;
        f30 pin4;
        View z13;
        int Z;
        z51.f fVar;
        Date date;
        int i15 = this.f19340a;
        int i16 = -1;
        Object obj = this.f19341b;
        switch (i15) {
            case 0:
                f0 f0Var = (f0) obj;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = f0Var.f19395s.computeVerticalScrollRange();
                int i17 = f0Var.f19394r;
                int i18 = computeVerticalScrollRange - i17;
                int i19 = f0Var.f19377a;
                f0Var.f19396t = i18 > 0 && i17 >= i19;
                int computeHorizontalScrollRange = f0Var.f19395s.computeHorizontalScrollRange();
                int i23 = f0Var.f19393q;
                boolean z14 = computeHorizontalScrollRange - i23 > 0 && i23 >= i19;
                f0Var.f19397u = z14;
                boolean z15 = f0Var.f19396t;
                if (!z15 && !z14) {
                    if (f0Var.f19398v != 0) {
                        f0Var.l(0);
                        return;
                    }
                    return;
                }
                if (z15) {
                    float f14 = i17;
                    f0Var.f19388l = (int) ((((f14 / 2.0f) + computeVerticalScrollOffset) * f14) / computeVerticalScrollRange);
                    f0Var.f19387k = Math.min(i17, (i17 * i17) / computeVerticalScrollRange);
                }
                if (f0Var.f19397u) {
                    float f15 = computeHorizontalScrollOffset;
                    float f16 = i23;
                    f0Var.f19391o = (int) ((((f16 / 2.0f) + f15) * f16) / computeHorizontalScrollRange);
                    f0Var.f19390n = Math.min(i23, (i23 * i23) / computeHorizontalScrollRange);
                }
                int i24 = f0Var.f19398v;
                if (i24 == 0 || i24 == 1) {
                    f0Var.l(1);
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 7:
            case 15:
            case 25:
            default:
                return;
            case 4:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                CloseupCarouselView closeupCarouselView = (CloseupCarouselView) obj;
                boolean z16 = i13 > 0;
                int i25 = CloseupCarouselView.O;
                if (z16) {
                    int h13 = closeupCarouselView.getLinearLayoutManager().h1();
                    closeupCarouselView.f35424k = h13;
                    if (h13 == -1) {
                        closeupCarouselView.f35424k = closeupCarouselView.getLinearLayoutManager().k1();
                    }
                } else {
                    LinearLayoutManager linearLayoutManager = closeupCarouselView.getLinearLayoutManager();
                    View n13 = linearLayoutManager.n1(linearLayoutManager.E() - 1, -1, true, false);
                    int Z2 = n13 == null ? -1 : l2.Z(n13);
                    closeupCarouselView.f35424k = Z2;
                    if (Z2 == -1) {
                        closeupCarouselView.f35424k = closeupCarouselView.getLinearLayoutManager().l1();
                    }
                }
                boolean z17 = closeupCarouselView.f35424k == 0 && closeupCarouselView.L;
                if (!closeupCarouselView.f35416J && z17) {
                    r6 = true;
                }
                closeupCarouselView.L = r6;
                GestaltIconButton gestaltIconButton = closeupCarouselView.G;
                if (r6) {
                    com.bumptech.glide.c.u1(gestaltIconButton);
                } else {
                    com.bumptech.glide.c.d0(gestaltIconButton);
                }
                o2 o2Var = closeupCarouselView.f35425l;
                if (o2Var != null) {
                    o2Var.j(recyclerView, i13, i14);
                    return;
                }
                return;
            case 5:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                aw.f fVar2 = (aw.f) obj;
                int i26 = aw.f.f20536w;
                if (fVar2.Z() != null) {
                    fVar2.t();
                    return;
                }
                return;
            case 6:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                cw.e eVar = (cw.e) obj;
                int i27 = cw.e.f53321w;
                if (eVar.Z() != null) {
                    eVar.t();
                    return;
                }
                return;
            case 8:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                tj0.m mVar = (tj0.m) obj;
                CollapsingToolbarLayout collapsingToolbarLayout = mVar.f117883c1;
                if (collapsingToolbarLayout == null) {
                    Intrinsics.r("collapsingHeader");
                    throw null;
                }
                if (recyclerView.computeVerticalScrollOffset() > collapsingToolbarLayout.getMeasuredHeight()) {
                    fo1.a i73 = mVar.i7();
                    if (i73 != null) {
                        ((GestaltToolbarImpl) i73).Z(f62.e.board_view_content_more_ideas_title_updated, fm1.c.VISIBLE);
                        return;
                    }
                    return;
                }
                fo1.a i74 = mVar.i7();
                if (i74 != null) {
                    ((GestaltToolbarImpl) i74).Z(f62.e.board_view_content_more_ideas_title_updated, fm1.c.GONE);
                    return;
                }
                return;
            case 9:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i14 != 0) {
                    ((rk0.c) obj).f();
                    return;
                }
                return;
            case 10:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                boolean canScrollVertically = recyclerView.canScrollVertically(-1);
                qm0.p0 p0Var = (qm0.p0) obj;
                View view = p0Var.R0;
                if (view == null) {
                    Intrinsics.r("topBarShadow");
                    throw null;
                }
                if ((view.getVisibility() == 0) != canScrollVertically) {
                    View view2 = p0Var.R0;
                    if (view2 != null) {
                        bs1.c.R1(view2, canScrollVertically);
                        return;
                    } else {
                        Intrinsics.r("topBarShadow");
                        throw null;
                    }
                }
                return;
            case 11:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (recyclerView.canScrollVertically(-1)) {
                    ho0.d dVar = (ho0.d) obj;
                    dVar.h9().setElevation(dVar.getResources().getDimension(d70.b.lego_board_action_toolbar_elevation));
                } else {
                    ((ho0.d) obj).h9().setElevation(0.0f);
                }
                ho0.d dVar2 = (ho0.d) obj;
                if (dVar2.O0 != null) {
                    if (recyclerView.canScrollVertically(1)) {
                        View view3 = dVar2.O0;
                        Intrinsics.f(view3);
                        view3.setVisibility(0);
                        return;
                    } else {
                        View view4 = dVar2.O0;
                        Intrinsics.f(view4);
                        view4.setVisibility(8);
                        return;
                    }
                }
                return;
            case 12:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                ((Function0) obj).invoke();
                return;
            case 13:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                boolean canScrollVertically3 = recyclerView.canScrollVertically(1);
                if (canScrollVertically2) {
                    ev0.l lVar = (ev0.l) obj;
                    View view5 = lVar.E0;
                    if (view5 == null) {
                        Intrinsics.r("headerView");
                        throw null;
                    }
                    float floatValue = ((Number) lVar.D0.getValue()).floatValue();
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    q5.m0.l(view5, floatValue);
                } else {
                    View view6 = ((ev0.l) obj).E0;
                    if (view6 == null) {
                        Intrinsics.r("headerView");
                        throw null;
                    }
                    WeakHashMap weakHashMap2 = q5.v0.f102521a;
                    q5.m0.l(view6, 0.0f);
                }
                if (!canScrollVertically3) {
                    View view7 = ((ev0.l) obj).F0;
                    if (view7 != null) {
                        q5.m0.l(view7, 0.0f);
                        return;
                    } else {
                        Intrinsics.r("footerView");
                        throw null;
                    }
                }
                ev0.l lVar2 = (ev0.l) obj;
                View view8 = lVar2.F0;
                if (view8 != null) {
                    q5.m0.l(view8, ((Number) lVar2.D0.getValue()).floatValue());
                    return;
                } else {
                    Intrinsics.r("footerView");
                    throw null;
                }
            case 14:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                mv0.y yVar = (mv0.y) obj;
                if (recyclerView.computeVerticalScrollOffset() > 0) {
                    View view9 = yVar.P0;
                    if (view9 != null) {
                        bs1.c.U1(view9);
                        return;
                    } else {
                        Intrinsics.r("recyclerShadowView");
                        throw null;
                    }
                }
                View view10 = yVar.P0;
                if (view10 != null) {
                    bs1.c.X0(view10);
                    return;
                } else {
                    Intrinsics.r("recyclerShadowView");
                    throw null;
                }
            case 16:
                Intrinsics.checkNotNullParameter(recyclerView, "v");
                b01.l lVar3 = (b01.l) obj;
                int computeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset();
                int i28 = b01.l.f20744r1;
                boolean z18 = computeVerticalScrollOffset2 >= ((Number) lVar3.f20755k1.getValue()).intValue();
                boolean z19 = lVar3.f20753i1;
                if (z19 && z18) {
                    return;
                }
                if (z19 && !z18) {
                    lVar3.k9(false);
                    List list = lVar3.Y0;
                    if (list == null) {
                        Intrinsics.r("coverPinCarousels");
                        throw null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((AnimatedPinVerticalCarouselView) it.next()).c();
                    }
                } else if (!z19 && z18) {
                    lVar3.k9(true);
                    List list2 = lVar3.Y0;
                    if (list2 == null) {
                        Intrinsics.r("coverPinCarousels");
                        throw null;
                    }
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((AnimatedPinVerticalCarouselView) it2.next()).d();
                    }
                }
                lVar3.f20753i1 = z18;
                if (z18) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                    if (computeVerticalScrollOffset2 < ((Number) lVar3.f20755k1.getValue()).intValue()) {
                        f13 = 1.0f - (computeVerticalScrollOffset2 / ((Number) r2.getValue()).intValue());
                    }
                }
                List list3 = lVar3.Y0;
                if (list3 == null) {
                    Intrinsics.r("coverPinCarousels");
                    throw null;
                }
                List list4 = list3;
                View view11 = lVar3.Z0;
                if (view11 == null) {
                    Intrinsics.r("coverPinsTopOverlay");
                    throw null;
                }
                Iterator it3 = CollectionsKt.m0(view11, list4).iterator();
                while (it3.hasNext()) {
                    ((View) it3.next()).setAlpha(f13);
                }
                return;
            case 17:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView = (RelatedPinsFiltersCarouselView) obj;
                if (relatedPinsFiltersCarouselView.f46965f || i13 == 0) {
                    return;
                }
                relatedPinsFiltersCarouselView.f46965f = true;
                i01.d1 d1Var = relatedPinsFiltersCarouselView.f46964e;
                if (d1Var != null) {
                    d1Var.X0();
                    return;
                }
                return;
            case 18:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                l2 l2Var = recyclerView.f19242n;
                if (l2Var == null || (z13 = l2Var.z(0)) == null || z13.getTop() != 0) {
                    PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) obj;
                    if (!pinCloseupFragment.f46980c2 && ((Boolean) pinCloseupFragment.S2.getValue()).booleanValue()) {
                        pinCloseupFragment.f46980c2 = true;
                        pinCloseupFragment.triggerLoadMoreCheck();
                    }
                } else {
                    recyclerView.h3();
                }
                PinCloseupFragment pinCloseupFragment2 = (PinCloseupFragment) obj;
                oq.x0 x0Var3 = pinCloseupFragment2.f46997i2;
                PinCloseupFragment.m9(pinCloseupFragment2);
                oq.x0 x0Var4 = pinCloseupFragment2.f46997i2;
                if (x0Var4 != null) {
                    x0Var4.O1(pinCloseupFragment2.o9());
                }
                oq.x0 x0Var5 = pinCloseupFragment2.f46997i2;
                if (x0Var5 != null) {
                    x0Var5.J1(pinCloseupFragment2.o9());
                }
                oq.x0 x0Var6 = pinCloseupFragment2.f46997i2;
                if (x0Var6 != null) {
                    pinCloseupFragment2.o9();
                    x0Var6.z1();
                }
                oq.x0 x0Var7 = pinCloseupFragment2.f46997i2;
                if (x0Var7 != null) {
                    x0Var7.H1(pinCloseupFragment2.o9());
                }
                if (!pinCloseupFragment2.f46978b3 && pinCloseupFragment2.q9().h(z3.DO_NOT_ACTIVATE_EXPERIMENT) && (pin3 = pinCloseupFragment2.getPin()) != null && Intrinsics.d(pin3.P4(), Boolean.TRUE) && (pin4 = pinCloseupFragment2.getPin()) != null && Intrinsics.d(pin4.d5(), Boolean.FALSE) && pinCloseupFragment2.x9()) {
                    pinCloseupFragment2.q9().a();
                    pinCloseupFragment2.f46978b3 = true;
                }
                if (!pinCloseupFragment2.f46981c3 && pinCloseupFragment2.q9().i(z3.DO_NOT_ACTIVATE_EXPERIMENT) && (pin = pinCloseupFragment2.getPin()) != null && Intrinsics.d(pin.H4(), Boolean.TRUE) && (pin2 = pinCloseupFragment2.getPin()) != null && Intrinsics.d(pin2.d5(), Boolean.FALSE) && pinCloseupFragment2.x9()) {
                    pinCloseupFragment2.q9().d();
                    pinCloseupFragment2.f46981c3 = true;
                }
                f30 pin5 = pinCloseupFragment2.getPin();
                if (pin5 != null) {
                    Boolean n53 = pin5.n5();
                    Intrinsics.checkNotNullExpressionValue(n53, "getIsVirtualTryOn(...)");
                    if (n53.booleanValue()) {
                        oq.x0 x0Var8 = pinCloseupFragment2.f46997i2;
                        if (x0Var8 != null) {
                            x0Var8.M1(pinCloseupFragment2.f47003k2[1] - pinCloseupFragment2.c7().a());
                        }
                    } else if (kh2.b0.B1(pin5)) {
                        oq.x0 x0Var9 = pinCloseupFragment2.f46997i2;
                        if (x0Var9 != null) {
                            x0Var9.K1(pinCloseupFragment2.f47003k2[1] - pinCloseupFragment2.c7().a());
                        }
                    } else {
                        es.a aVar = pinCloseupFragment2.f47022t1;
                        if (aVar == null) {
                            Intrinsics.r("adFormats");
                            throw null;
                        }
                        if (((es.c) aVar).w(pin5, new b11.u(pinCloseupFragment2, 15)) && (x0Var2 = pinCloseupFragment2.f46997i2) != null) {
                            x0Var2.y1();
                        }
                    }
                }
                np0.m mVar2 = pinCloseupFragment2.U2;
                if (mVar2 != null) {
                    mVar2.a();
                }
                if (hf0.b.n() && (x0Var = pinCloseupFragment2.f46997i2) != null) {
                    x0Var.I0(i14);
                }
                if (recyclerView.canScrollVertically(1) || i14 <= 0 || !pinCloseupFragment2.u8()) {
                    return;
                }
                recyclerView.h3();
                return;
            case 19:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                ((r0.c0) obj).c();
                return;
            case 20:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                ((j51.d0) obj).f7().d(new gg0.i());
                return;
            case 21:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                z51.e eVar2 = (z51.e) obj;
                SimpleDateFormat simpleDateFormat = z51.e.f140868a1;
                eVar2.getClass();
                l2 l2Var2 = recyclerView.f19242n;
                if (l2Var2 != null) {
                    HashMap hashMap = new HashMap();
                    int E = l2Var2.E();
                    for (int i29 = 0; i29 < E; i29++) {
                        View D = l2Var2.D(i29);
                        if (D != null) {
                            float d2 = eVar2.P0.d(D, recyclerView, null);
                            hashMap.put(Integer.valueOf(i29), Float.valueOf(d2));
                            List x03 = CollectionsKt.x0(kotlin.collections.b1.t(hashMap), new sw0.u(5));
                            float floatValue2 = x03.size() > 1 ? ((Number) ((Pair) x03.get(1)).f80347b).floatValue() : 0.0f;
                            if (d2 == 100.0f && floatValue2 <= 50.0f) {
                                Z = l2.Z(D);
                                if (Z >= 0 || Z == eVar2.U0) {
                                    return;
                                }
                                eVar2.U0 = Z;
                                if (!eVar2.V0 || (fVar = eVar2.X0) == null) {
                                    return;
                                }
                                y51.c cVar = (y51.c) fVar;
                                dl1.s sVar = (dl1.s) CollectionsKt.U(Z, cVar.f137774d.d());
                                if (sVar == null) {
                                    return;
                                }
                                if (sVar instanceof kg0) {
                                    date = ig1.b.X0((kg0) sVar);
                                } else if (!(sVar instanceof tg0)) {
                                    return;
                                } else {
                                    date = ((tg0) sVar).f42207a;
                                }
                                Iterator it4 = cVar.f137772b.iterator();
                                int i33 = 0;
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (kh2.s0.D0((Date) it4.next(), date)) {
                                            i16 = i33;
                                        } else {
                                            i33++;
                                        }
                                    }
                                }
                                if (i16 >= 0) {
                                    z51.e eVar3 = (z51.e) ((z51.g) cVar.getView());
                                    eVar3.W0 = false;
                                    GestaltTabLayout gestaltTabLayout = eVar3.R0;
                                    if (gestaltTabLayout == null) {
                                        Intrinsics.r("tabLayout");
                                        throw null;
                                    }
                                    gestaltTabLayout.u(gestaltTabLayout.n(i16), true);
                                    eVar3.W0 = true;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                Z = -1;
                if (Z >= 0) {
                    return;
                } else {
                    return;
                }
            case 22:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(-1)) {
                    SettingsRoundHeaderView settingsRoundHeaderView = ((u91.h) obj).A0;
                    if (settingsRoundHeaderView == null) {
                        return;
                    }
                    settingsRoundHeaderView.setElevation(0.0f);
                    return;
                }
                u91.h hVar = (u91.h) obj;
                SettingsRoundHeaderView settingsRoundHeaderView2 = hVar.A0;
                if (settingsRoundHeaderView2 == null) {
                    return;
                }
                settingsRoundHeaderView2.setElevation(((Number) hVar.K0.getValue()).floatValue());
                return;
            case 23:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(-1)) {
                    SettingsRoundHeaderView settingsRoundHeaderView3 = ((ma1.n) obj).I0;
                    if (settingsRoundHeaderView3 != null) {
                        settingsRoundHeaderView3.setElevation(0.0f);
                        return;
                    } else {
                        Intrinsics.r("headerView");
                        throw null;
                    }
                }
                ma1.n nVar = (ma1.n) obj;
                SettingsRoundHeaderView settingsRoundHeaderView4 = nVar.I0;
                if (settingsRoundHeaderView4 != null) {
                    settingsRoundHeaderView4.setElevation(((Number) nVar.J0.getValue()).floatValue());
                    return;
                } else {
                    Intrinsics.r("headerView");
                    throw null;
                }
            case 24:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(-1)) {
                    SettingsRoundHeaderView settingsRoundHeaderView5 = ((ua1.d) obj).B0;
                    if (settingsRoundHeaderView5 == null) {
                        return;
                    }
                    settingsRoundHeaderView5.setElevation(0.0f);
                    return;
                }
                ua1.d dVar3 = (ua1.d) obj;
                SettingsRoundHeaderView settingsRoundHeaderView6 = dVar3.B0;
                if (settingsRoundHeaderView6 == null) {
                    return;
                }
                settingsRoundHeaderView6.setElevation(((Number) dVar3.D0.getValue()).floatValue());
                return;
            case 26:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (!recyclerView.canScrollVertically(-1)) {
                    SettingsRoundHeaderView settingsRoundHeaderView7 = ((rb1.k) obj).I0;
                    if (settingsRoundHeaderView7 == null) {
                        return;
                    }
                    settingsRoundHeaderView7.setElevation(0.0f);
                    return;
                }
                rb1.k kVar = (rb1.k) obj;
                SettingsRoundHeaderView settingsRoundHeaderView8 = kVar.I0;
                if (settingsRoundHeaderView8 == null) {
                    return;
                }
                settingsRoundHeaderView8.setElevation(((Number) kVar.J0.getValue()).floatValue());
                return;
        }
    }

    public c0(wr0.i onScrolledAction) {
        this.f19340a = 12;
        Intrinsics.checkNotNullParameter(onScrolledAction, "onScrolledAction");
        this.f19341b = onScrolledAction;
    }
}
