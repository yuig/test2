package xo;

import android.app.Activity;
import android.widget.FrameLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingRetailerErrorView;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.feature.owc.view.collection.AdsProductView;
import com.pinterest.ads.feature.owc.view.shopping.AdsProductContentModule;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.adsCollageHeroCutout.container.HeroCutoutToolbarModule;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a1;
import com.pinterest.screens.i0;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nm1.s0;
import oq.x0;
import rq.j4;
import rq.m4;
import rq.p0;
import rq.r1;
import rq.r3;
import rq.u1;
import w01.m0;
import zp.g1;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135525b;

    public /* synthetic */ k(Object obj, int i13) {
        this.f135524a = i13;
        this.f135525b = obj;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        nx.d0 viewPinalytics;
        String str;
        f30 pin;
        String str2;
        f30 pin2;
        ArrayList arrayList;
        m21.a aVar;
        cu.a aVar2;
        vt.h hVar;
        String pinId;
        hv.e eVar;
        int i13 = this.f135524a;
        int i14 = 0;
        Unit unit = null;
        Unit unit2 = null;
        r9 = null;
        r9 = null;
        String str3 = null;
        Object obj = this.f135525b;
        switch (i13) {
            case 0:
                ((q) obj).getClass();
                m60.u.f85943a.d(new p());
                return;
            case 1:
                cp.u this$0 = (cp.u) obj;
                int i15 = cp.u.f52973h1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof cn1.s) {
                    nx.d0.v(this$0.s7(), f1.CONVERSATION_EMPTY_INBOX_SEARCH_BAR_TAP_TARGET, null, false, 12);
                    this$0.s7().X(u0.CONVERSATION_CREATE_BUTTON);
                    this$0.f7().d(Navigation.w1(a1.a()));
                    return;
                }
                return;
            case 2:
                mp.u this$02 = (mp.u) obj;
                int i16 = mp.u.f87887e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$02.getClass();
                NavigationImpl w13 = Navigation.w1((ScreenLocation) a1.f50496c.getValue());
                w13.y0(Boolean.TRUE, "com.pinterest.EXTRA_IS_CONTACT_REQUEST_ON_DETAILS_PAGE");
                m60.w wVar = this$02.f87890c;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar.d(new kp.j());
                m60.w wVar2 = this$02.f87890c;
                if (wVar2 != null) {
                    wVar2.d(w13);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 3:
                g1 this$03 = (g1) obj;
                int i17 = g1.f142408l;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                a.c.y(this$03.getEventManager());
                this$03.f142412d.c(null, null);
                return;
            case 4:
                rq.b this$04 = (rq.b) obj;
                int i18 = rq.b.f109104c;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof xl1.a) || (viewPinalytics = this$04.getViewPinalytics()) == null) {
                    return;
                }
                this$04.e().s3(viewPinalytics);
                return;
            case 5:
                rq.s this$05 = (rq.s) obj;
                int i19 = rq.s.f109527k;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    FrameLayout frameLayout = this$05.f109534j;
                    if (frameLayout == null) {
                        Intrinsics.r("visibilityTooltipContainer");
                        throw null;
                    }
                    if (frameLayout.getVisibility() == 0) {
                        FrameLayout frameLayout2 = this$05.f109534j;
                        if (frameLayout2 != null) {
                            frameLayout2.setVisibility(4);
                            return;
                        } else {
                            Intrinsics.r("visibilityTooltipContainer");
                            throw null;
                        }
                    }
                    FrameLayout frameLayout3 = this$05.f109534j;
                    if (frameLayout3 != null) {
                        frameLayout3.setVisibility(0);
                        return;
                    } else {
                        Intrinsics.r("visibilityTooltipContainer");
                        throw null;
                    }
                }
                return;
            case 6:
                rq.t this$06 = (rq.t) obj;
                int i23 = rq.t.f109546c;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                er0.d dVar = this$06.f109547a;
                dVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CONVERT_TO_BUSINESS_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                dVar.f59963b.d(Navigation.w1((ScreenLocation) i0.f50934l.getValue()));
                return;
            case 7:
                rq.u this$07 = (rq.u) obj;
                int i24 = rq.u.f109562l;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    FrameLayout frameLayout4 = this$07.f109566k;
                    if (frameLayout4 == null) {
                        Intrinsics.r("visibilityTooltipContainer");
                        throw null;
                    }
                    if (frameLayout4.getVisibility() == 0) {
                        FrameLayout frameLayout5 = this$07.f109566k;
                        if (frameLayout5 != null) {
                            frameLayout5.setVisibility(4);
                            return;
                        } else {
                            Intrinsics.r("visibilityTooltipContainer");
                            throw null;
                        }
                    }
                    FrameLayout frameLayout6 = this$07.f109566k;
                    if (frameLayout6 != null) {
                        frameLayout6.setVisibility(0);
                        return;
                    } else {
                        Intrinsics.r("visibilityTooltipContainer");
                        throw null;
                    }
                }
                return;
            case 8:
                rq.b0 this$08 = (rq.b0) obj;
                int i25 = rq.b0.f109107k;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof rn1.f) {
                    String str4 = this$08.f109114i;
                    if (str4 == null) {
                        f30 pin3 = this$08.getPin();
                        String D = pin3 != null ? com.bumptech.glide.c.D(pin3) : null;
                        if (D == null) {
                            return;
                        } else {
                            str = D;
                        }
                    } else {
                        str = str4;
                    }
                    PinCloseupBaseModule.handleWebsiteClicked$default(this$08, str, null, null, 6, null);
                    return;
                }
                return;
            case 9:
                p0 this$09 = (p0) obj;
                int i26 = p0.F;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (pin = this$09.getPin()) == null) {
                    return;
                }
                gs0.k kVar = this$09.f109443k;
                if (kVar != null) {
                    gs0.k.a(kVar, pin, jo1.a.RELATED_PINS, true, false, null, null, false, null, null, this$09.f109441i, this$09.f109440h, null, false, null, null, null, false, false, false, false, null, null, false, 8387064).showFeedBack();
                    return;
                } else {
                    Intrinsics.r("pinOverflowMenuModalProvider");
                    throw null;
                }
            case 10:
                gs0.j modal = (gs0.j) obj;
                int i27 = r1.f109506a;
                Intrinsics.checkNotNullParameter(modal, "$modal");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    modal.showFeedBack();
                    return;
                }
                return;
            case 11:
                u1 this$010 = (u1) obj;
                int i28 = u1.f109569l;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof rn1.f) {
                    ((x0) this$010.f109570c).S0();
                    return;
                }
                return;
            case 12:
                r3 this$011 = (r3) obj;
                int i29 = r3.f109509t;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$011.f109522o.onClick(this$011.f109515h);
                return;
            case 13:
                j4 this$012 = (j4) obj;
                int i33 = j4.f109300w;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                i01.q qVar = this$012.f109319s;
                if (qVar != null) {
                    m0 m0Var = (m0) qVar;
                    qh1.f fVar = m0Var.f127082v;
                    if (fVar != null) {
                        fVar.b("on_click_more_comments", null);
                    }
                    uk1.d dVar2 = m0Var.f127081u;
                    nx.d0 d0Var = dVar2.f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                    f1 f1Var = f1.TAP;
                    u0 u0Var = u0.COMMENT_COUNT;
                    g0 g0Var = g0.PIN_CLOSEUP_COMMENTS;
                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    nx.d0 d0Var2 = dVar2.f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                    f1 f1Var2 = f1.COMMUNITY_VIEW_INTENT;
                    u0 u0Var2 = u0.SEE_MORE_COMMENTS;
                    f30 f30Var = m0Var.f127062b;
                    String uid = f30Var != null ? f30Var.getUid() : null;
                    HashMap hashMap = new HashMap();
                    f30 f30Var2 = m0Var.f127062b;
                    if (f30Var2 == null || (str2 = f30Var2.getUid()) == null) {
                        str2 = "";
                    }
                    hashMap.put("pin_id", str2);
                    Unit unit3 = Unit.f80348a;
                    d0Var2.h0((r18 & 1) != 0 ? f1.TAP : f1Var2, (r18 & 2) != 0 ? null : u0Var2, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? m0Var.f127083w : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    m0.v3(m0Var, null, null, 31);
                    return;
                }
                return;
            case 14:
                m4 this$013 = (m4) obj;
                int i34 = m4.f109377p;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!(event instanceof rl1.t) || (pin2 = this$013.getPin()) == null) {
                    return;
                }
                nx.d0 viewPinalytics2 = this$013.getViewPinalytics();
                if (viewPinalytics2 != null) {
                    viewPinalytics2.F(g0.PIN_CLOSEUP_USER_BOARD_NOTE_ATTRIBUTION, u0.PIN_USER);
                }
                m60.w wVar3 = this$013.f109383f;
                if (wVar3 != null) {
                    wVar3.d(pe.i.x1(pin2, pin2.I5(), r41.b.PinCloseupUserBoardAttributionModule));
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 15:
                tq.n this$014 = (tq.n) obj;
                int i35 = tq.n.E;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    f30 pin4 = this$014.getPin();
                    nx.d0 viewPinalytics3 = this$014.getViewPinalytics();
                    if (pin4 == null || viewPinalytics3 == null) {
                        return;
                    }
                    f1 f1Var3 = f1.TAP;
                    u0 u0Var3 = u0.PIN_CLOSEUP_PRODUCT_MORE_OPTIONS;
                    HashMap hashMap2 = new HashMap();
                    this$014.getPinAuxHelper().c(pin4, hashMap2);
                    Unit unit4 = Unit.f80348a;
                    viewPinalytics3.h0((r18 & 1) != 0 ? f1.TAP : f1Var3, (r18 & 2) != 0 ? null : u0Var3, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap2, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    gs0.k kVar2 = this$014.f118899i;
                    if (kVar2 == null) {
                        Intrinsics.r("pinOverflowMenuModalProvider");
                        throw null;
                    }
                    jo1.a aVar3 = jo1.a.RELATED_PINS;
                    tq.o oVar = this$014.f118910t;
                    if (oVar != null && (arrayList = oVar.f118921e) != null && (aVar = (m21.a) arrayList.get(oVar.f118922f)) != null) {
                        str3 = aVar.a();
                    }
                    gs0.k.a(kVar2, pin4, aVar3, true, false, null, null, false, null, null, false, null, null, false, null, str3, null, false, false, false, false, null, null, false, 8372216).showFeedBack();
                    return;
                }
                return;
            case 16:
                int i36 = nr.d.f91838m0;
                ((nr.d) obj).N6(false, false);
                return;
            case 17:
                CartingRetailerErrorView this$015 = (CartingRetailerErrorView) obj;
                int i37 = CartingRetailerErrorView.f35267b;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof xl1.a) {
                    u50.r rVar = this$015.f35268a;
                    if (rVar != null) {
                        rVar.a(xs.o.f135751a);
                        return;
                    } else {
                        Intrinsics.r("eventIntake");
                        throw null;
                    }
                }
                return;
            case 18:
                lt.d this$016 = (lt.d) obj;
                int i38 = lt.d.f84734m0;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof om1.l) {
                    this$016.P7();
                    return;
                }
                return;
            case 19:
                cu.i this$017 = (cu.i) obj;
                int i39 = cu.i.f53198p;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof rn1.f) || (aVar2 = this$017.f53211m) == null) {
                    return;
                }
                int i43 = ps.p.pharma_disclosure;
                fu.c cVar = ((BaseAdsScrollingModule) aVar2).f35327n0;
                if (cVar != null) {
                    cVar.F5(i43);
                    return;
                }
                return;
            case 20:
                AdsProductView this$018 = (AdsProductView) obj;
                rl2.u[] uVarArr = AdsProductView.f35340s;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                GestaltText gestaltText = this$018.f35345h;
                if (gestaltText == null) {
                    Intrinsics.r("productTitle");
                    throw null;
                }
                Activity l03 = bs1.c.l0(gestaltText);
                MainActivity mainActivity = l03 instanceof MainActivity ? (MainActivity) l03 : null;
                nl1.d f34938d = mainActivity != null ? mainActivity.getF34938d() : null;
                gs0.k kVar3 = this$018.f35343f;
                if (kVar3 == null) {
                    Intrinsics.r("pinOverflowMenuModalProvider");
                    throw null;
                }
                f30 i44 = this$018.i();
                if (this$018.f35342e != null) {
                    gs0.k.a(kVar3, i44, jo1.c.a(f34938d), true, false, null, null, false, null, null, false, null, null, false, null, null, null, false, false, false, false, null, null, false, 8388600).showFeedBack();
                    return;
                } else {
                    Intrinsics.r("baseGridActionUtils");
                    throw null;
                }
            case 21:
                lu.n this$019 = (lu.n) obj;
                int i45 = lu.n.f84910o;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (hVar = this$019.f84917g) == null) {
                    return;
                }
                hVar.f126599a.a();
                return;
            case 22:
                AdsProductContentModule this$020 = (AdsProductContentModule) obj;
                int i46 = AdsProductContentModule.f35388j;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                vu.b bVar = this$020.f35397i;
                if (bVar != null) {
                    ((vu.k) bVar).f2();
                    return;
                }
                return;
            case 23:
                CloseupCarouselView this$021 = (CloseupCarouselView) obj;
                int i47 = CloseupCarouselView.O;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!(event instanceof om1.l) || (pinId = this$021.I) == null || (eVar = this$021.F) == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                eVar.D3(pinId, new hv.d(eVar, i14));
                return;
            case 24:
                sv.b0 b0Var = (sv.b0) obj;
                int i48 = HeroCutoutToolbarModule.f35455b;
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || b0Var == null) {
                    return;
                }
                sv.e eVar2 = (sv.e) b0Var;
                ScreenLocation screenLocation = (ScreenLocation) eVar2.f115279g0.getValue();
                if (screenLocation != null) {
                    kh2.j.x2((sv.g) eVar2.f115285m0.getValue(), new sv.n(screenLocation));
                    unit2 = Unit.f80348a;
                }
                if (unit2 == null) {
                    eVar2.P7();
                    return;
                }
                return;
            case 25:
                h80.l this$022 = (h80.l) obj;
                int i49 = h80.l.f68097m0;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$022.P7();
                return;
            case 26:
                g90.n this$023 = (g90.n) obj;
                int i53 = g90.n.f64537w0;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof om1.l) {
                    ScreenLocation screenLocation2 = (ScreenLocation) this$023.f64543l0.getValue();
                    if (screenLocation2 != null) {
                        kh2.j.x2((g90.c0) this$023.f64548q0.getValue(), new g90.b(screenLocation2));
                        unit = Unit.f80348a;
                    }
                    if (unit == null) {
                        this$023.D5();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                k90.c this$024 = (k90.c) obj;
                int i54 = k90.c.f78723v1;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    this$024.E9();
                    return;
                }
                return;
            case 28:
                ea0.t this$025 = (ea0.t) obj;
                int i55 = ea0.t.W0;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    kh2.j.x2(this$025.k9(), ea0.a.f57946a);
                    return;
                }
                return;
            default:
                pa0.c this$026 = (pa0.c) obj;
                int i56 = pa0.c.f99375x0;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof nm1.x0) {
                    pa0.e eVar3 = this$026.f99379u0;
                    if (eVar3 != null) {
                        eVar3.a(((nm1.x0) event).f91509d);
                        return;
                    }
                    return;
                }
                if (event instanceof s0) {
                    s0 s0Var = (s0) event;
                    if (s0Var.f91488c == nm1.u0.START && (s0Var.f91490e instanceof om1.l)) {
                        this$026.P7();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
