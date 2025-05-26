package rw1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import ay1.a0;
import ay1.d0;
import ay1.t;
import ay1.y;
import bx1.i;
import bx1.j;
import bx1.k;
import bx1.l;
import bx1.m;
import bx1.n;
import bx1.p;
import bx1.r;
import c92.o;
import c92.w;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.qrCodeLogin.QrCodeLoginLocation;
import com.pinterest.qrCodeLogin.f0;
import com.pinterest.qrCodeLogin.m0;
import com.pinterest.qrCodeLogin.u;
import com.pinterest.reportFlow.feature.rvc.model.LinkedBA;
import com.pinterest.screens.f5;
import h32.f1;
import h32.i0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jx1.q;
import kh2.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import la0.l1;
import u50.k0;
import u50.s;
import y52.b0;
import y52.g0;
import y52.h0;
import y52.v;
import y52.x;
import y52.z;

/* loaded from: classes4.dex */
public final class f extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f110117b;

    public /* synthetic */ f(int i13) {
        this.f110117b = i13;
    }

    public static f0 g() {
        return new f0(new al1.f(e0.b(QrCodeLoginLocation.QR_CODE_LOGIN)));
    }

    public static c0 h(w vmState) {
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return new c0(new o(new k0(x82.e.target_handshake_bottom_sheet_title), new k0(x82.e.target_handshake_bottom_sheet_header_title), new k0(x82.e.target_handshake_bottom_sheet_accept_button), new k0(x82.e.target_handshake_bottom_sheet_cancel_button), new ArrayList(), 16), vmState, q0.f80391a);
    }

    public static com.pinterest.qrCodeLogin.c0 i(i0 i0Var) {
        return new com.pinterest.qrCodeLogin.c0(new zy.e0(new zy.a(com.bumptech.glide.d.z0(i0Var, u.f50346s), f1.VIEW, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)));
    }

    public static HashMap j(y52.i0 i0Var, boolean z13) {
        HashMap hashMap = new HashMap();
        h0 h0Var = i0Var instanceof h0 ? (h0) i0Var : null;
        bs1.c.G1("board_link", h0Var != null ? h0Var.f137805d : null, hashMap);
        bs1.c.G1("template_id", i0Var.k().f137790e.f71799b, hashMap);
        if (z13) {
            h0 h0Var2 = i0Var instanceof h0 ? (h0) i0Var : null;
            bs1.c.G1("invite_code", h0Var2 != null ? h0Var2.f137806e : null, hashMap);
        }
        bs1.c.G1("board_id", i0Var.k().f137786a.d(), hashMap);
        return hashMap;
    }

    private static c0 k(s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        k event = (k) sVar;
        bx1.d priorDisplayState = (bx1.d) oVar;
        r priorVMState = (r) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof i) {
            i0 context = priorVMState.f24115a.f143086a;
            String metricType = ((i) event).f24107a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(metricType, "metricType");
            u0 element = u0.ANALYTICS_GRAPH_CLOSEUP_BUTTON;
            HashMap o13 = ep.b.o("analytics_next_value", metricType);
            Unit unit = Unit.f80348a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(element, "element");
            return new c0(priorDisplayState, priorVMState, kotlin.collections.f0.j(n.f24113c, new m(new zy.e0(new zy.a(com.bumptech.glide.d.z0(context, new l1(element, 9)), f1.TAP, null, o13, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)))));
        }
        if (event instanceof j) {
            return new c0(new bx1.c(), priorVMState, e0.b(p.f24114a));
        }
        if (event instanceof bx1.e) {
            return new c0(priorDisplayState, priorVMState, e0.b(l.f24109a));
        }
        if (Intrinsics.d(event, bx1.f.f24104a)) {
            return new c0(priorDisplayState, priorVMState);
        }
        if (event instanceof bx1.g) {
            return new c0(bx1.a.f24100a, priorVMState, q0.f80391a);
        }
        if (event instanceof bx1.h) {
            return new c0(new bx1.b(((bx1.h) event).f24106a), priorVMState, q0.f80391a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // l82.d
    public final c0 c(l82.i0 i0Var) {
        switch (this.f110117b) {
            case 0:
                g vmState = (g) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return new c0(a.f110115a, new g(), q0.f80391a);
            case 1:
                r vmState2 = (r) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                return new c0(new bx1.c(), new r(), q0.f80391a);
            case 2:
                jx1.s vmState3 = (jx1.s) i0Var;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                return new c0(jx1.b.f77678a, new jx1.s(), q0.f80391a);
            case 3:
                tx1.m vmState4 = (tx1.m) i0Var;
                Intrinsics.checkNotNullParameter(vmState4, "vmState");
                return new c0(tx1.a.f119684a, new tx1.m(), q0.f80391a);
            case 4:
                y vmState5 = (y) i0Var;
                Intrinsics.checkNotNullParameter(vmState5, "vmState");
                return new c0(new ay1.g(ay1.b.f20659a, a0.f20658a, ay1.d.f20661a, ay1.h0.f20673a, d0.f20662a), new y(), q0.f80391a);
            case 5:
                com.pinterest.qrCodeLogin.i0 vmState6 = (com.pinterest.qrCodeLogin.i0) i0Var;
                Intrinsics.checkNotNullParameter(vmState6, "vmState");
                return new c0(new com.pinterest.qrCodeLogin.j(ln1.e.LOADING, com.pinterest.qrCodeLogin.b.f50300g), vmState6, e0.b(new com.pinterest.qrCodeLogin.e0(vmState6.f50318b)));
            case 6:
                s02.h vmState7 = (s02.h) i0Var;
                Intrinsics.checkNotNullParameter(vmState7, "vmState");
                return new c0(new s02.a(null), vmState7, e0.b(s02.e.f110316a));
            case 7:
                s02.w vmState8 = (s02.w) i0Var;
                Intrinsics.checkNotNullParameter(vmState8, "vmState");
                return new c0(new s02.o(), vmState8, q0.f80391a);
            case 8:
                t02.n vmState9 = (t02.n) i0Var;
                Intrinsics.checkNotNullParameter(vmState9, "vmState");
                m02.b bVar = vmState9.f115733a;
                return new c0(new t02.b(bVar.f85274a, bVar.f85275b), vmState9, q0.f80391a);
            case 9:
                h42.f vmState10 = (h42.f) i0Var;
                Intrinsics.checkNotNullParameter(vmState10, "vmState");
                return l82.d.d(new h42.a(null, null, 15), vmState10).e();
            case 10:
                y52.i0 vmState11 = (y52.i0) i0Var;
                Intrinsics.checkNotNullParameter(vmState11, "vmState");
                y52.d dVar = ((g0) vmState11).f137798a;
                return new c0(new y52.e("", dVar.f137789d, vmState11.j() < 3), vmState11, e0.b(new y52.r(dVar)));
            case 11:
                return h((w) i0Var);
            case 12:
                zc2.r vmState12 = (zc2.r) i0Var;
                Intrinsics.checkNotNullParameter(vmState12, "vmState");
                return new c0(new zc2.b(null, null, false, false), vmState12, q0.f80391a);
            default:
                cd2.o vmState13 = (cd2.o) i0Var;
                Intrinsics.checkNotNullParameter(vmState13, "vmState");
                return new c0(new cd2.b(false), vmState13, q0.f80391a);
        }
    }

    @Override // l82.d
    public final c0 f(s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        u50.i0 k0Var;
        qz.d M;
        String e13;
        k0 k0Var2;
        c0 c0Var;
        c92.n lVar;
        al1.b bVar = al1.b.f15477a;
        int i13 = 0;
        switch (this.f110117b) {
            case 0:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(sVar);
                g priorVMState = (g) i0Var;
                Intrinsics.checkNotNullParameter(null, "event");
                Intrinsics.checkNotNullParameter((b) oVar, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                return new c0(a.f110115a, priorVMState, q0.f80391a);
            case 1:
                return k(sVar, oVar, i0Var, resultBuilder);
            case 2:
                jx1.l event = (jx1.l) sVar;
                jx1.e priorDisplayState = (jx1.e) oVar;
                jx1.s priorVMState2 = (jx1.s) i0Var;
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState2, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event instanceof jx1.h) {
                    jx1.h hVar = (jx1.h) event;
                    Float f13 = hVar.f77685a.f66287c.f66294c;
                    return new c0(new jx1.d(hVar.f77685a, f13 != null && f13.floatValue() > 0.0f), priorVMState2, q0.f80391a);
                }
                if (event instanceof jx1.f) {
                    return new c0(priorDisplayState, priorVMState2, e0.b(new jx1.m(((jx1.f) event).f77683a)));
                }
                if (event instanceof jx1.i) {
                    jx1.i iVar = (jx1.i) event;
                    return new c0(new jx1.c(iVar.f77686a, iVar.f77687b), priorVMState2, q0.f80391a);
                }
                if (event instanceof jx1.j) {
                    jx1.j jVar = (jx1.j) event;
                    return new c0(priorDisplayState, priorVMState2, e0.b(new q(jVar.f77688a, jVar.f77689b)));
                }
                if (!(event instanceof jx1.k)) {
                    if (Intrinsics.d(event, jx1.g.f77684a)) {
                        return new c0(priorDisplayState, priorVMState2, e0.b(jx1.o.f77693a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                i0 context = priorVMState2.f77696a.f143086a;
                ox1.a locationType = ((jx1.k) event).f77690a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(locationType, "locationType");
                return new c0(priorDisplayState, priorVMState2, e0.b(new jx1.n(kg.o.G(context, h32.g0.ANALYTICS_AUDIENCE_LOCATION_TABS, locationType == ox1.a.METROS ? u0.ANALYTICS_AUDIENCE_LOCATION_METROS_TAB : u0.ANALYTICS_AUDIENCE_LOCATION_COUNTRIES_TAB, null))));
            case 3:
                tx1.g event2 = (tx1.g) sVar;
                tx1.c priorDisplayState2 = (tx1.c) oVar;
                tx1.m priorVMState3 = (tx1.m) i0Var;
                Intrinsics.checkNotNullParameter(event2, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState2, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState3, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event2 instanceof tx1.f) {
                    i0 context2 = priorVMState3.f119692a.f143086a;
                    qx1.d tabPosition = ((tx1.f) event2).f119688a;
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(tabPosition, "tabPosition");
                    return new c0(tx1.b.f119685a, priorVMState3, e0.b(new tx1.h(pe.i.S0(context2, h32.g0.ANALYTICS_TABS, tabPosition.getElementType()))));
                }
                if (Intrinsics.d(event2, tx1.e.f119687a)) {
                    i0 context3 = priorVMState3.f119692a.f143086a;
                    Intrinsics.checkNotNullParameter(context3, "context");
                    return new c0(priorDisplayState2, priorVMState3, kotlin.collections.f0.j(tx1.j.f119691a, new tx1.h(pe.i.S0(context3, h32.g0.ANALYTICS_MOBILE_HEADER, u0.ANALYTICS_FILTER_MENU_BUTTON))));
                }
                if (Intrinsics.d(event2, tx1.d.f119686a)) {
                    return new c0(priorDisplayState2, priorVMState3, e0.b(tx1.i.f119690a));
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                ay1.q event3 = (ay1.q) sVar;
                ay1.g priorDisplayState3 = (ay1.g) oVar;
                y priorVMState4 = (y) i0Var;
                Intrinsics.checkNotNullParameter(event3, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState3, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState4, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event3 instanceof ay1.k) {
                    return new c0(priorDisplayState3, priorVMState4, e0.b(ay1.w.f20688a));
                }
                if (event3 instanceof ay1.h) {
                    return new c0(priorDisplayState3, priorVMState4, e0.b(new ay1.r(((ay1.h) event3).f20672a)));
                }
                if (Intrinsics.d(event3, ay1.i.f20674a)) {
                    return new c0(priorDisplayState3, priorVMState4, e0.b(t.f20686a));
                }
                if (event3 instanceof ay1.j) {
                    return new c0(priorDisplayState3, priorVMState4, e0.b(ay1.u.f20687a));
                }
                if (event3 instanceof ay1.m) {
                    return new c0(ay1.g.e(priorDisplayState3, null, null, ((ay1.m) event3).f20680a, null, null, 27), priorVMState4, q0.f80391a);
                }
                if (event3 instanceof ay1.l) {
                    return new c0(ay1.g.e(priorDisplayState3, ((ay1.l) event3).f20679a, null, null, null, null, 30), priorVMState4, q0.f80391a);
                }
                if (event3 instanceof ay1.n) {
                    return new c0(ay1.g.e(priorDisplayState3, null, ((ay1.n) event3).f20681a, null, null, null, 29), priorVMState4, q0.f80391a);
                }
                if (event3 instanceof ay1.o) {
                    return new c0(ay1.g.e(priorDisplayState3, null, null, null, null, ((ay1.o) event3).f20682a, 15), priorVMState4, q0.f80391a);
                }
                if (event3 instanceof ay1.p) {
                    return new c0(ay1.g.e(priorDisplayState3, null, null, null, ((ay1.p) event3).f20683a, null, 23), priorVMState4, q0.f80391a);
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                com.pinterest.qrCodeLogin.t event4 = (com.pinterest.qrCodeLogin.t) sVar;
                com.pinterest.qrCodeLogin.j priorDisplayState4 = (com.pinterest.qrCodeLogin.j) oVar;
                com.pinterest.qrCodeLogin.i0 priorVMState5 = (com.pinterest.qrCodeLogin.i0) i0Var;
                Intrinsics.checkNotNullParameter(event4, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState4, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState5, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event4 instanceof com.pinterest.qrCodeLogin.s) {
                    com.bumptech.glide.d.z0(priorVMState5.f50317a.f143086a, u.f50348u);
                    com.pinterest.qrCodeLogin.s sVar2 = (com.pinterest.qrCodeLogin.s) event4;
                    String str = sVar2.f50336c;
                    String str2 = sVar2.f50335b;
                    String str3 = sVar2.f50334a;
                    if (str == null || str.length() == 0) {
                        int i14 = m0.qr_login_description_without_location_pinterest;
                        String[] formatArgs = {str3, str2};
                        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                        ArrayList arrayList = new ArrayList(2);
                        for (int i15 = 0; i15 < 2; i15++) {
                            arrayList.add(new u50.f0(formatArgs[i15]));
                        }
                        k0Var2 = new k0(i14, arrayList);
                    } else {
                        int i16 = m0.qr_login_description_pinterest;
                        String[] formatArgs2 = {str3, str2, sVar2.f50336c};
                        Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                        ArrayList arrayList2 = new ArrayList(3);
                        for (int i17 = 0; i17 < 3; i17++) {
                            arrayList2.add(new u50.f0(formatArgs2[i17]));
                        }
                        k0Var2 = new k0(i16, arrayList2);
                    }
                    resultBuilder.f(new uv.b(k0Var2, 8));
                    resultBuilder.a(new com.pinterest.qrCodeLogin.c0(new zy.e0(new zy.a(priorVMState5.f50317a.f143086a, f1.VIEW, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event4, com.pinterest.qrCodeLogin.q.f50332a)) {
                    resultBuilder.f(u.f50349v);
                    resultBuilder.a(i(priorVMState5.f50317a.f143086a));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event4, com.pinterest.qrCodeLogin.m.f50328a)) {
                    Pair pair = priorDisplayState4.f50320b instanceof com.pinterest.qrCodeLogin.h ? new Pair(kotlin.collections.f0.j(new com.pinterest.qrCodeLogin.d0(priorVMState5.f50318b), new com.pinterest.qrCodeLogin.c0(new zy.e0(new zy.a(com.bumptech.glide.d.z0(priorVMState5.f50317a.f143086a, u.f50342o), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)))), ln1.e.LOADING) : new Pair(kotlin.collections.f0.j(new com.pinterest.qrCodeLogin.c0(new zy.e0(new zy.a(com.bumptech.glide.d.z0(priorVMState5.f50317a.f143086a, u.f50345r), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))), g()), ln1.e.NONE);
                    resultBuilder.f(new ex1.n(pair, 17));
                    resultBuilder.b((List) pair.f80346a);
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event4, com.pinterest.qrCodeLogin.r.f50333a)) {
                    resultBuilder.d(g(), new com.pinterest.qrCodeLogin.c0(new zy.e0(new zy.a(com.bumptech.glide.d.z0(priorVMState5.f50317a.f143086a, u.f50347t), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event4, com.pinterest.qrCodeLogin.k.f50326a)) {
                    resultBuilder.d(priorDisplayState4.f50320b instanceof com.pinterest.qrCodeLogin.g ? new com.pinterest.qrCodeLogin.c0(new zy.e0(new zy.a(com.bumptech.glide.d.z0(priorVMState5.f50317a.f143086a, u.f50344q), f1.DISMISS, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))) : new com.pinterest.qrCodeLogin.c0(new zy.e0(new zy.a(priorVMState5.f50317a.f143086a, f1.DISMISS, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))), g());
                    return resultBuilder.e();
                }
                if (event4 instanceof com.pinterest.qrCodeLogin.l) {
                    resultBuilder.f(u.f50350w);
                    resultBuilder.d(new com.pinterest.qrCodeLogin.c0(new zy.e0(new zy.a(com.bumptech.glide.d.z0(priorVMState5.f50317a.f143086a, u.f50343p), f1.VIEW, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))), g(), new com.pinterest.qrCodeLogin.g0(new k92.m(new xz1.b(), null)));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event4, com.pinterest.qrCodeLogin.p.f50331a)) {
                    resultBuilder.f(u.f50351x);
                    resultBuilder.a(i(priorVMState5.f50317a.f143086a));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event4, com.pinterest.qrCodeLogin.n.f50329a)) {
                    resultBuilder.f(u.f50352y);
                    resultBuilder.a(i(priorVMState5.f50317a.f143086a));
                    return resultBuilder.e();
                }
                if (!(event4 instanceof com.pinterest.qrCodeLogin.o)) {
                    throw new NoWhenBranchMatchedException();
                }
                v.f1 f1Var = ((com.pinterest.qrCodeLogin.o) event4).f50330a.f45043a;
                if (f1Var == null || (M = k3.M(f1Var)) == null || (e13 = M.e()) == null) {
                    int i18 = m0.qr_login_verification_failed;
                    Intrinsics.checkNotNullParameter(new String[0], "formatArgs");
                    k0Var = new k0(i18, new ArrayList(0));
                } else {
                    k0Var = ep.b.x(e13, "string", e13);
                }
                resultBuilder.f(new fx.e(18, k0Var));
                resultBuilder.a(i(priorVMState5.f50317a.f143086a));
                return resultBuilder.e();
            case 6:
                s02.d event5 = (s02.d) sVar;
                s02.a priorDisplayState5 = (s02.a) oVar;
                s02.h priorVMState6 = (s02.h) i0Var;
                Intrinsics.checkNotNullParameter(event5, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState5, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState6, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (!(event5 instanceof s02.b)) {
                    if (event5 instanceof s02.c) {
                        return new c0(priorDisplayState5, priorVMState6, e0.b(new s02.f(((s02.c) event5).f110315a)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List<LinkedBA> list = ((s02.b) event5).f110314a;
                ArrayList arrayList3 = new ArrayList();
                for (LinkedBA linkedBA : list) {
                    if (linkedBA != null) {
                        arrayList3.add(linkedBA);
                    }
                }
                priorDisplayState5.getClass();
                return new c0(new s02.a(arrayList3), priorVMState6, q0.f80391a);
            case 7:
                s02.r event6 = (s02.r) sVar;
                s02.o priorDisplayState6 = (s02.o) oVar;
                s02.w priorVMState7 = (s02.w) i0Var;
                Intrinsics.checkNotNullParameter(event6, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState6, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState7, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (!(event6 instanceof s02.q)) {
                    if (!(event6 instanceof s02.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s02.p pVar = (s02.p) event6;
                    return new c0(priorDisplayState6, priorVMState7, e0.b(new s02.s(pVar.f110339b, pVar.f110338a)));
                }
                f1 f1Var2 = f1.TAP;
                s02.q qVar = (s02.q) event6;
                i0 i0Var2 = qVar.f110346g;
                HashMap hashMap = new HashMap();
                hashMap.put("enforcement_action_id", qVar.f110341b);
                return new c0(priorDisplayState6, priorVMState7, CollectionsKt.l0(e0.b(new s02.u(new zy.e0(new zy.a(i0Var2, f1Var2, qVar.f110345f, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM)))), e0.b(new s02.t(qVar.f110346g, qVar.f110341b, qVar.f110342c, qVar.f110343d, qVar.f110344e, qVar.f110345f, qVar.f110340a))));
            case 8:
                t02.d event7 = (t02.d) sVar;
                Intrinsics.checkNotNullParameter(event7, "event");
                Intrinsics.checkNotNullParameter((t02.b) oVar, "priorDisplayState");
                Intrinsics.checkNotNullParameter((t02.n) i0Var, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event7 instanceof t02.c) {
                    resultBuilder.a(t02.l.f115732a);
                }
                return resultBuilder.e();
            case 9:
                h42.d event8 = (h42.d) sVar;
                Intrinsics.checkNotNullParameter(event8, "event");
                Intrinsics.checkNotNullParameter((h42.a) oVar, "priorDisplayState");
                Intrinsics.checkNotNullParameter((h42.f) i0Var, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event8 instanceof h42.c) {
                    resultBuilder.f(new s12.a(event8, 4));
                } else {
                    boolean z13 = event8 instanceof h42.b;
                }
                return resultBuilder.e();
            case 10:
                y52.o event9 = (y52.o) sVar;
                y52.e priorDisplayState7 = (y52.e) oVar;
                y52.i0 priorVMState8 = (y52.i0) i0Var;
                Intrinsics.checkNotNullParameter(event9, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState7, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState8, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event9 instanceof y52.k) {
                    y52.e eVar = (y52.e) resultBuilder.f82218a;
                    y52.k kVar = (y52.k) event9;
                    String link = kVar.f137821a;
                    String uriString = eVar.f137793b;
                    Intrinsics.checkNotNullParameter(link, "link");
                    Intrinsics.checkNotNullParameter(uriString, "uriString");
                    return new c0(new y52.e(link, uriString, eVar.f137794c), new h0(priorVMState8.k(), priorVMState8.h(), priorVMState8.j(), kVar.f137821a, kVar.f137822b, false, false), e0.b(new z(priorVMState8.h().f143086a, j(priorVMState8, true))));
                }
                boolean z14 = event9 instanceof y52.f;
                y52.c0 c0Var2 = y52.c0.f137785a;
                if (z14) {
                    if (!(priorVMState8 instanceof h0)) {
                        return resultBuilder.e();
                    }
                    h0 h0Var = (h0) priorVMState8;
                    c0Var = new c0(priorDisplayState7, h0.b(h0Var, true, false, 95), kotlin.collections.f0.j(c0Var2, new y52.p(h0Var.f137805d), new y52.u(priorVMState8.h().f143086a, j(priorVMState8, true))));
                } else {
                    if (event9 instanceof y52.j) {
                        return new c0(priorDisplayState7, priorVMState8, kotlin.collections.f0.j(new y52.q(priorVMState8.k().f137789d), new y52.t(priorVMState8.h().f143086a, j(priorVMState8, true))));
                    }
                    if (Intrinsics.d(event9, y52.g.f137797a)) {
                        return new c0(priorDisplayState7, priorVMState8, kotlin.collections.f0.j(new y52.e0(new al1.e("com.pinterest.EXTRA_BOARD_PREVIEW_VIDEO_RESULT_CODE", al1.n.b(new Pair("ARG_TEMPLATE_ID", priorVMState8.k().f137790e.f71799b)))), new y52.d0(priorVMState8.k().f137789d), new y52.s(priorVMState8.h().f143086a, j(priorVMState8, true))));
                    }
                    if (Intrinsics.d(event9, y52.i.f137809a)) {
                        ArrayList arrayList4 = new ArrayList();
                        if (priorVMState8 instanceof h0) {
                            arrayList4.add(new z(priorVMState8.h().f143086a, j(priorVMState8, true)));
                            if (((h0) priorVMState8).f137808g) {
                                arrayList4.add(new y52.e0(bVar));
                                arrayList4.add(new y52.d0(priorVMState8.k().f137789d));
                            }
                        }
                        Unit unit = Unit.f80348a;
                        return new c0(priorDisplayState7, priorVMState8, arrayList4);
                    }
                    if (Intrinsics.d(event9, y52.l.f137825a)) {
                        y52.i0 b13 = priorVMState8 instanceof h0 ? h0.b((h0) priorVMState8, false, true, 63) : priorVMState8;
                        i0 i0Var3 = priorVMState8.h().f143086a;
                        boolean z15 = priorVMState8 instanceof h0;
                        h0 h0Var2 = z15 ? (h0) priorVMState8 : null;
                        HashMap j13 = j(priorVMState8, h0Var2 != null ? h0Var2.f137807f : false);
                        y52.d k13 = priorVMState8.k();
                        h0 h0Var3 = z15 ? (h0) priorVMState8 : null;
                        return new c0(priorDisplayState7, b13, e0.b(new y52.w(i0Var3, j13, k13, h0Var3 != null ? h0Var3.f137806e : null)));
                    }
                    if (Intrinsics.d(event9, y52.n.f137829a)) {
                        return new c0(priorDisplayState7, priorVMState8, kotlin.collections.f0.j(new y52.y(priorVMState8.h().f143086a, j(priorVMState8, true)), new b0(priorVMState8.j() + 1)));
                    }
                    if (Intrinsics.d(event9, y52.m.f137826a)) {
                        return new c0(priorDisplayState7, priorVMState8, e0.b(new x(priorVMState8.h().f143086a, j(priorVMState8, true))));
                    }
                    if (!Intrinsics.d(event9, y52.h.f137801a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(priorVMState8 instanceof h0)) {
                        return resultBuilder.e();
                    }
                    h0 h0Var4 = (h0) priorVMState8;
                    c0Var = new c0(priorDisplayState7, h0.b(h0Var4, true, false, 95), kotlin.collections.f0.j(c0Var2, new y52.p(h0Var4.f137805d), new v(priorVMState8.h().f143086a, j(priorVMState8, true))));
                }
                return c0Var;
            case 11:
                c92.v event10 = (c92.v) sVar;
                o priorDisplayState8 = (o) oVar;
                w priorVMState9 = (w) i0Var;
                Intrinsics.checkNotNullParameter(event10, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState8, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState9, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event10 instanceof c92.t) {
                    return new c0(o.e(priorDisplayState8, kotlin.collections.f0.d(new c92.g())), w.b(priorVMState9, false), q0.f80391a);
                }
                if (event10 instanceof c92.r) {
                    return new c0(o.e(priorDisplayState8, kotlin.collections.f0.d(new c92.g())), w.b(priorVMState9, false), q0.f80391a);
                }
                if (event10 instanceof c92.u) {
                    return new c0(o.e(priorDisplayState8, kotlin.collections.f0.d(new c92.g())), w.b(priorVMState9, false), q0.f80391a);
                }
                if (event10 instanceof c92.p) {
                    return new c0(o.e(priorDisplayState8, kotlin.collections.f0.d(new c92.h())), w.b(priorVMState9, true), q0.f80391a);
                }
                if (event10 instanceof c92.s) {
                    return new c0(o.e(priorDisplayState8, new ArrayList()), priorVMState9, q0.f80391a);
                }
                if (!Intrinsics.d(event10, c92.q.f27026a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c92.k[] kVarArr = new c92.k[1];
                if (priorVMState9.f27031a) {
                    lVar = new c92.m(x82.d.target_handshake_bottom_sheet_variant_2, kotlin.collections.f0.j(new c92.b(), new c92.b(), new c92.b()));
                } else {
                    int i19 = x82.d.target_handshake_bottom_sheet_variant_1;
                    k0 k0Var3 = new k0(x82.e.target_handshake_bottom_sheet_content_title);
                    k0 k0Var4 = new k0(x82.e.target_handshake_bottom_sheet_content_first_benefit);
                    rm1.f fVar = new rm1.f(rm1.q.SHOPPING_BAG);
                    rm1.c cVar = rm1.c.DEFAULT;
                    lVar = new c92.l(i19, k0Var3, new c92.a(k0Var4, new rm1.d(fVar, cVar, null, 0, null, 28)), new c92.a(new k0(x82.e.target_handshake_bottom_sheet_content_second_benefit), new rm1.d(new rm1.f(rm1.q.TAG), cVar, null, 0, null, 28)), new k0(x82.e.target_handshake_bottom_sheet_content_info));
                }
                kVarArr[0] = new c92.i(lVar);
                return new c0(o.e(priorDisplayState8, kotlin.collections.f0.d(kVarArr)), priorVMState9, q0.f80391a);
            case 12:
                zc2.j event11 = (zc2.j) sVar;
                zc2.b priorDisplayState9 = (zc2.b) oVar;
                zc2.r priorVMState10 = (zc2.r) i0Var;
                Intrinsics.checkNotNullParameter(event11, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState9, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState10, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (Intrinsics.d(event11, zc2.c.f141619a)) {
                    resultBuilder.a(new com.pinterest.widget.configuration.p(bVar));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event11, zc2.d.f141620a)) {
                    if (priorDisplayState9.f141617c) {
                        int i23 = priorVMState10.f141642a;
                        com.pinterest.widget.configuration.r rVar = com.pinterest.widget.configuration.r.BOARD;
                        resultBuilder.d(new com.pinterest.widget.configuration.o(i23, rVar), new com.pinterest.widget.configuration.m(priorVMState10.f141642a, rVar));
                    }
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event11, zc2.e.f141621a)) {
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) f5.f50800b.getValue());
                    Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                    resultBuilder.a(new com.pinterest.widget.configuration.p(new al1.a(w13)));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event11, zc2.f.f141622a)) {
                    NavigationImpl w14 = Navigation.w1((ScreenLocation) f5.f50802d.getValue());
                    Intrinsics.checkNotNullExpressionValue(w14, "create(...)");
                    resultBuilder.a(new com.pinterest.widget.configuration.p(new al1.a(w14)));
                    return resultBuilder.e();
                }
                if (event11 instanceof zc2.g) {
                    resultBuilder.f(new ha2.j((zc2.g) event11, 25));
                    return resultBuilder.e();
                }
                if (event11 instanceof zc2.h) {
                    resultBuilder.f(new ha2.j((zc2.h) event11, 26));
                    return resultBuilder.e();
                }
                if (!(event11 instanceof zc2.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                zc2.i iVar2 = (zc2.i) event11;
                if (iVar2.f141625a instanceof com.pinterest.widget.configuration.f) {
                    resultBuilder.f(new ha2.j(iVar2, 27));
                }
                return resultBuilder.e();
            default:
                cd2.g event12 = (cd2.g) sVar;
                cd2.o priorVMState11 = (cd2.o) i0Var;
                Intrinsics.checkNotNullParameter(event12, "event");
                Intrinsics.checkNotNullParameter((cd2.b) oVar, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState11, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (Intrinsics.d(event12, cd2.c.f27552a)) {
                    NavigationImpl w15 = Navigation.w1((ScreenLocation) f5.f50799a.getValue());
                    Intrinsics.checkNotNullExpressionValue(w15, "create(...)");
                    resultBuilder.a(new com.pinterest.widget.configuration.p(new al1.a(w15)));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event12, cd2.d.f27553a)) {
                    int i24 = priorVMState11.f27569a;
                    com.pinterest.widget.configuration.r rVar2 = com.pinterest.widget.configuration.r.HOME_FEED;
                    resultBuilder.d(new com.pinterest.widget.configuration.o(i24, rVar2), new com.pinterest.widget.configuration.m(priorVMState11.f27569a, rVar2));
                    return resultBuilder.e();
                }
                if (Intrinsics.d(event12, cd2.e.f27554a)) {
                    resultBuilder.a(com.pinterest.widget.configuration.l.f52841a);
                    return resultBuilder.e();
                }
                if (!(event12 instanceof cd2.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((cd2.f) event12).f27555a instanceof com.pinterest.widget.configuration.f) {
                    resultBuilder.f(new cd2.n(event12, i13));
                }
                return resultBuilder.e();
        }
    }
}
