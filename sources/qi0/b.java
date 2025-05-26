package qi0;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.mv;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a1;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import e0.t;
import h32.b2;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.z1;
import hp0.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.r;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.r2;
import lh0.z3;
import lq0.q0;
import lq0.s0;
import ls1.q;
import m60.w;
import nx.d1;
import ps.m;
import qa2.d0;
import qa2.p;
import ua2.h0;
import ua2.i0;
import ua2.j0;
import ua2.k0;
import ua2.v0;
import va2.n;
import wa2.l;
import wa2.s;
import xk2.k;

/* loaded from: classes5.dex */
public final class b extends y92.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ af2.c f103970b;

    public b(af2.c cVar, int i13) {
        this.f103969a = i13;
        this.f103970b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y92.b
    public final boolean b(MotionEvent e13) {
        int i13 = this.f103969a;
        af2.c cVar = this.f103970b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                d dVar = (d) cVar;
                LegoPinGridCell legoPinGridCell = dVar.f103987p;
                Intrinsics.g(legoPinGridCell, "null cannot be cast to non-null type android.view.View");
                kg.a.c(legoPinGridCell);
                dVar.postInvalidateDelayed(dVar.f103988q);
                return true;
            case 4:
                Intrinsics.checkNotNullParameter(e13, "e");
                LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) cVar;
                h0 h0Var = null;
                legoPinGridCellImpl.U1 = null;
                if (legoPinGridCellImpl.I0) {
                    return false;
                }
                long j13 = LegoPinGridCellImpl.Z2;
                if (!legoPinGridCellImpl.isEnabled() || e13 == null) {
                    legoPinGridCellImpl.postInvalidateDelayed(j13);
                } else {
                    int x13 = (int) e13.getX();
                    int y13 = (int) e13.getY();
                    Iterator it = CollectionsKt.q0(legoPinGridCellImpl.f52424j0).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((h0) next).C(x13, y13)) {
                                h0Var = next;
                            }
                        }
                    }
                    h0Var = h0Var;
                }
                legoPinGridCellImpl.U0 = h0Var;
                if (h0Var != null && !(h0Var instanceof ua2.i) && legoPinGridCellImpl.getScaleX() >= 1.0f) {
                    r2 experiments = legoPinGridCellImpl.getExperiments();
                    z3 activate = a4.f83297a;
                    Intrinsics.checkNotNullParameter("enabled_no_long_click_press_animation", "group");
                    Intrinsics.checkNotNullParameter(activate, "activate");
                    if (!((g1) experiments.f83469a).k("visual_search_in_long_press_android", "enabled_no_long_click_press_animation", activate)) {
                        Rect rect = new Rect();
                        legoPinGridCellImpl.getGlobalVisibleRect(rect);
                        legoPinGridCellImpl.U1 = rect;
                        kg.a.c(legoPinGridCellImpl);
                    }
                }
                legoPinGridCellImpl.postInvalidateDelayed(LegoPinGridCellImpl.Z2);
                return true;
            default:
                Intrinsics.checkNotNullParameter(e13, "e");
                return false;
        }
    }

    @Override // y92.b
    public final void c(MotionEvent e13) {
        int i13;
        n nVar;
        Rect bounds;
        Rect rect;
        ArrayList L0;
        z1 z1Var;
        f30 f30Var;
        Rect rect2;
        l k13;
        Rect bounds2;
        int i14 = this.f103969a;
        af2.c cVar = this.f103970b;
        switch (i14) {
            case 3:
                Intrinsics.checkNotNullParameter(e13, "e");
                s0 s0Var = (s0) cVar;
                if (s0Var.f84427h) {
                    return;
                }
                s0Var.performLongClick();
                return;
            case 4:
                Intrinsics.checkNotNullParameter(e13, "e");
                LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) cVar;
                if (legoPinGridCellImpl.I0) {
                    return;
                }
                int x13 = (int) e13.getX();
                int y13 = (int) e13.getY();
                k0 k0Var = legoPinGridCellImpl.f52468u0;
                if (k0Var == null) {
                    Intrinsics.r("primaryMediaPiece");
                    throw null;
                }
                ArrayList arrayList = legoPinGridCellImpl.f52424j0;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof v0) {
                        arrayList2.add(next);
                    }
                }
                v0 v0Var = (v0) CollectionsKt.firstOrNull(arrayList2);
                cs.c a13 = ((es.c) legoPinGridCellImpl.getAdFormats()).a(legoPinGridCellImpl.C0);
                cs.c cVar2 = cs.c.TWO_BY_TWO;
                k kVar = legoPinGridCellImpl.P2;
                if (a13 == cVar2) {
                    rect = ((j0) kVar.getValue()).q();
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                } else {
                    s sVar = k0Var.f121531J;
                    int i15 = sVar.getBounds().left;
                    int i16 = sVar.getBounds().top;
                    int i17 = sVar.getBounds().right;
                    if (legoPinGridCellImpl.T1 && (L0 = legoPinGridCellImpl.L0()) != null && (!L0.isEmpty())) {
                        Rect q13 = ((j0) kVar.getValue()).q();
                        i13 = q13 != null ? q13.bottom : sVar.getBounds().bottom;
                    } else {
                        i13 = (v0Var == null || (nVar = v0Var.f121617n) == null || (bounds = nVar.getBounds()) == null) ? sVar.getBounds().bottom : bounds.bottom;
                    }
                    rect = new Rect(i15, i16, i17, i13);
                }
                if (rect.contains(x13, y13)) {
                    z1 source = legoPinGridCellImpl.E0;
                    if (source != null) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        List list = source.G;
                        ArrayList H0 = list != null ? CollectionsKt.H0(list) : new ArrayList();
                        H0.add(new b2(Integer.valueOf((int) e13.getRawX()), Integer.valueOf((int) e13.getRawY()), ep.b.f(1000000L)));
                        z1Var = new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, H0, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
                    } else {
                        z1Var = null;
                    }
                    legoPinGridCellImpl.E0 = z1Var;
                    int x14 = (int) e13.getX();
                    int y14 = (int) e13.getY();
                    ArrayList arrayList3 = legoPinGridCellImpl.f52424j0;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (next2 instanceof i0) {
                            arrayList4.add(next2);
                        }
                    }
                    i0 i0Var = (i0) CollectionsKt.firstOrNull(arrayList4);
                    boolean contains = (i0Var == null || (k13 = i0Var.k()) == null || (bounds2 = k13.getBounds()) == null) ? false : bounds2.contains(x14, y14);
                    k0 k0Var2 = legoPinGridCellImpl.f52468u0;
                    if (k0Var2 == null) {
                        Intrinsics.r("primaryMediaPiece");
                        throw null;
                    }
                    u0 u0Var = (k0Var2.f121531J.getBounds().contains(x14, y14) || contains) ? u0.PIN_SOURCE_IMAGE : u0.PIN_DESCRIPTION;
                    f30 f30Var2 = legoPinGridCellImpl.C0;
                    if (f30Var2 != null) {
                        e30 R6 = f30Var2.R6();
                        d1 d1Var = legoPinGridCellImpl.f52394b1;
                        if (d1Var == null) {
                            Intrinsics.r("trackingParamAttacher");
                            throw null;
                        }
                        R6.v2(d1Var.d(legoPinGridCellImpl.W1, f30Var2));
                        f30Var = R6.a();
                    } else {
                        f30Var = null;
                    }
                    legoPinGridCellImpl.C0 = f30Var;
                    f1 f1Var = f1.LONG_PRESS;
                    g0 Y = legoPinGridCellImpl.Y();
                    f30 f30Var3 = legoPinGridCellImpl.C0;
                    Intrinsics.f(f30Var3);
                    legoPinGridCellImpl.W1.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : Y, (r18 & 8) != 0 ? null : f30Var3.getUid(), (r18 & 32) != 0 ? null : legoPinGridCellImpl.I0(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    if (legoPinGridCellImpl.f52455r) {
                        return;
                    }
                    if (legoPinGridCellImpl.f52396c.f128870l) {
                        t.f56747e = y32.f.RELATED_PINS_LONGPRESS.getValue();
                    } else if (legoPinGridCellImpl instanceof q0) {
                        t.f56747e = y32.f.CONVERSATION_LONGPRESS.getValue();
                    } else {
                        y32.f fVar = legoPinGridCellImpl.F0;
                        if (fVar == null) {
                            fVar = y32.f.CLOSEUP_LONGPRESS;
                        }
                        t.f56747e = fVar.getValue();
                    }
                    w eventManager = legoPinGridCellImpl.getEventManager();
                    f30 f30Var4 = legoPinGridCellImpl.C0;
                    int i18 = legoPinGridCellImpl.Q0;
                    int i19 = legoPinGridCellImpl.f52448p0;
                    vn1.c cVar3 = legoPinGridCellImpl.f52452q0;
                    boolean z13 = legoPinGridCellImpl.f52456r0;
                    String str = legoPinGridCellImpl.f52393b0 ? legoPinGridCellImpl.f52397c0 : null;
                    wa2.a pinDrawable = legoPinGridCellImpl.getPinDrawable();
                    if (pinDrawable == null || (rect2 = pinDrawable.getBounds()) == null) {
                        rect2 = new Rect();
                    }
                    Rect rect3 = rect2;
                    Rect rect4 = legoPinGridCellImpl.U1;
                    ViewParent parent = legoPinGridCellImpl.getParent();
                    Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                    View O = r.O(parent);
                    Rect rect5 = new Rect();
                    if (O != null) {
                        O.getGlobalVisibleRect(rect5);
                    }
                    eventManager.d(new q(legoPinGridCellImpl, f30Var4, i18, i19, cVar3, z13, str, true, -1, rect3, rect4, rect5.top));
                    return;
                }
                return;
            default:
                super.c(e13);
                return;
        }
    }

    @Override // y92.b
    public final void e(MotionEvent e13) {
        int i13 = this.f103969a;
        af2.c cVar = this.f103970b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                ((d) cVar).L();
                break;
            case 4:
                Intrinsics.checkNotNullParameter(e13, "e");
                if (e13.getAction() == 1) {
                    LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) cVar;
                    legoPinGridCellImpl.U0 = null;
                    legoPinGridCellImpl.w2();
                    legoPinGridCellImpl.invalidate();
                    legoPinGridCellImpl.w2();
                    break;
                }
                break;
            default:
                super.e(e13);
                break;
        }
    }

    @Override // y92.b
    public final boolean f(MotionEvent e13, MotionEvent e23, float f13, float f14) {
        switch (this.f103969a) {
            case 1:
                Intrinsics.checkNotNullParameter(e13, "e1");
                Intrinsics.checkNotNullParameter(e23, "e2");
                float abs = Math.abs(f13);
                hp0.t tVar = (hp0.t) this.f103970b;
                if (abs > ((Number) tVar.f69882x0.getValue()).intValue() || Math.abs(f14) > ((Number) tVar.f69882x0.getValue()).intValue()) {
                }
                break;
            default:
                super.f(e13, e23, f13, f14);
                break;
        }
        return false;
    }

    @Override // y92.b
    public final boolean h(MotionEvent e13) {
        String str;
        int i13 = this.f103969a;
        af2.c cVar = this.f103970b;
        boolean z13 = false;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                d dVar = (d) cVar;
                dVar.L();
                String pinUid = dVar.f103987p.getPinUid();
                if (pinUid != null && (str = dVar.f103979h) != null) {
                    w wVar = dVar.f103983l;
                    if (wVar == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.e.f50673a.getValue(), str, ml1.b.NO_TRANSITION.getValue());
                    L.m0("EXTRA_BOTTOM_SHEET_SELECTED_ITEM_ID", pinUid);
                    wVar.d(L);
                    if (dVar.f103982k == null) {
                        Intrinsics.r("adsQcmAnalytics");
                        throw null;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", String.valueOf(dVar.f103976e));
                    hashMap.put("story_type", "related_pins_3p_ads_module_qcm");
                    hashMap.put("is_third_party_ad", "true");
                    d1 d1Var = dVar.f103981j;
                    if (d1Var == null) {
                        Intrinsics.r("trackingParamAttacher");
                        throw null;
                    }
                    dVar.f103975d.m(pinUid, hashMap, d1Var.c(pinUid), g0.PIN_CLOSEUP_ADS_QCM_MODULE, null);
                    Function0 function0 = dVar.f103991t;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return true;
            case 1:
                Intrinsics.checkNotNullParameter(e13, "e");
                hp0.t tVar = (hp0.t) cVar;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(e13, "e");
                jp0.b bVar = tVar.f69880v0;
                if (bVar == null) {
                    Intrinsics.r("carouselView");
                    throw null;
                }
                int top = bVar.getTop();
                jp0.b bVar2 = tVar.f69880v0;
                if (bVar2 == null) {
                    Intrinsics.r("carouselView");
                    throw null;
                }
                int bottom = bVar2.getBottom();
                jp0.b bVar3 = tVar.f69880v0;
                if (bVar3 == null) {
                    Intrinsics.r("carouselView");
                    throw null;
                }
                int width = (bVar3.getWidth() / 2) - (bs1.c.X(tVar, ps.n.ads_qcm_drawer_carousel_item_width) / 2);
                jp0.b bVar4 = tVar.f69880v0;
                if (bVar4 == null) {
                    Intrinsics.r("carouselView");
                    throw null;
                }
                float f13 = width;
                float X = (bs1.c.X(tVar, ps.n.ads_qcm_drawer_carousel_item_width) / 2) + (bVar4.getWidth() / 2);
                float x13 = e13.getX();
                if (f13 <= x13 && x13 <= X) {
                    float f14 = top;
                    float f15 = bottom;
                    float y13 = e13.getY();
                    if (f14 <= y13 && y13 <= f15) {
                        kh2.j.x2((f0) tVar.f69870l0.getValue(), hp0.f.f69833a);
                        jp0.b bVar5 = tVar.f69880v0;
                        if (bVar5 == null) {
                            Intrinsics.r("carouselView");
                            throw null;
                        }
                        bVar5.onDeactivated();
                    }
                }
                return false;
            case 2:
                Intrinsics.checkNotNullParameter(e13, "e");
                ConversationMessageItemView conversationMessageItemView = (ConversationMessageItemView) cVar;
                xj2.b bVar6 = conversationMessageItemView.K0;
                oo1.j jVar = oo1.j.f96854a;
                String str2 = conversationMessageItemView.f45552e0;
                if (str2 == null) {
                    str2 = "";
                }
                mv mvVar = conversationMessageItemView.f45546c0;
                if (mvVar == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                String V = kh2.j.V(mvVar);
                if (V == null) {
                    V = "";
                }
                mv mvVar2 = conversationMessageItemView.f45546c0;
                if (mvVar2 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                String T = kh2.j.T(mvVar2);
                String str3 = T != null ? T : "";
                oc.c cVar2 = conversationMessageItemView.T0;
                if (cVar2 == null) {
                    Intrinsics.r("apolloClient");
                    throw null;
                }
                bVar6.a(oo1.j.v(str2, V, str3, cVar2).l(tk2.e.f118017c).h(wj2.c.a()).i(new xo.b(22), new dq0.i(15, lq0.d.f84276q)));
                mv mvVar3 = conversationMessageItemView.f45546c0;
                if (mvVar3 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                String T2 = kh2.j.T(mvVar3);
                if (T2 != null) {
                    conversationMessageItemView.x().d(Navigation.z0((ScreenLocation) a1.f50505l.getValue(), T2));
                }
                return false;
            case 3:
            default:
                super.h(e13);
                return false;
            case 4:
                Intrinsics.checkNotNullParameter(e13, "e");
                LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) cVar;
                legoPinGridCellImpl.getEventManager().d(new ls1.d(legoPinGridCellImpl));
                if (legoPinGridCellImpl.r1()) {
                    legoPinGridCellImpl.getEventManager().f(new m(legoPinGridCellImpl.K0().a(), null));
                    legoPinGridCellImpl.K0().e();
                    legoPinGridCellImpl.K0().f101240c = 0;
                    legoPinGridCellImpl.D0 = null;
                }
                legoPinGridCellImpl.postDelayed(new p(legoPinGridCellImpl, 1), ((int) (e13.getDownTime() - e13.getEventTime())) < LegoPinGridCellImpl.Z2 ? r1 - r0 : LegoPinGridCellImpl.f52388a3);
                f30 f30Var = legoPinGridCellImpl.C0;
                Intrinsics.f(f30Var);
                h0 h0Var = legoPinGridCellImpl.U0;
                if (h0Var != null) {
                    if (legoPinGridCellImpl.f52396c.f128857e0) {
                        d0 d0Var = legoPinGridCellImpl.A0;
                        if (d0Var != null) {
                            d0Var.onOpenPinCloseup(f30Var);
                        }
                    } else {
                        z13 = h0Var.B();
                    }
                    Integer D = h0Var.D();
                    if (D != null) {
                        legoPinGridCellImpl.playSoundEffect(D.intValue());
                    }
                    if (h0Var.A()) {
                        LegoPinGridCellImpl.a(legoPinGridCellImpl, f30Var, e13, z13);
                    }
                } else {
                    boolean f23 = legoPinGridCellImpl.f2();
                    legoPinGridCellImpl.playSoundEffect(0);
                    LegoPinGridCellImpl.a(legoPinGridCellImpl, f30Var, e13, f23);
                }
                return true;
        }
    }
}
