package lt;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.net.Uri;
import c2.m4;
import com.pinterest.api.model.cc0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ia0;
import com.pinterest.api.model.la;
import com.pinterest.api.model.q30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pear.screen.PearLocation;
import com.pinterest.feature.settings.notifications.c1;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import fk0.t;
import fk0.v;
import fk0.w;
import h32.f1;
import h32.u0;
import h32.v2;
import h32.x3;
import h80.p;
import h80.r;
import hp0.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kh2.s0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import m60.x0;
import nx.v0;
import nx.y0;
import sk0.q;
import sk0.u;
import sk0.x;
import sk0.y;
import tk0.a0;
import tk0.b0;
import tk0.f0;
import tk0.g0;
import tk0.h0;
import tk0.z;
import u50.k0;
import u50.o;
import u50.s;
import zy.j0;
import zy.l0;

/* loaded from: classes3.dex */
public final class j extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84750b;

    public /* synthetic */ j(int i13) {
        this.f84750b = i13;
    }

    private static c0 A(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        h80.g event = (h80.g) sVar;
        h80.b priorDisplayState = (h80.b) oVar;
        r priorVMState = (r) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof h80.c) {
            h80.c cVar = (h80.c) event;
            return new c0(h80.b.e(priorDisplayState, cVar.f68084a, false, null, cVar.f68085b, 4), priorVMState, e0.b(new p(priorVMState.f68118d.f143086a, cVar.f68085b, true, priorVMState.f68116b)));
        }
        if (event instanceof h80.e) {
            return new c0(h80.b.e(priorDisplayState, "", true, null, null, 12), priorVMState, e0.b(new h80.n(priorVMState.f68116b, ((h80.e) event).f68087a)));
        }
        if (event instanceof h80.f) {
            return new c0(h80.b.e(priorDisplayState, null, false, ((h80.f) event).f68088a, null, 11), priorVMState, q0.f80391a);
        }
        if (event instanceof h80.d) {
            return new c0(h80.b.e(priorDisplayState, "https://i.pinimg.com/736x/6f/79/06/6f7906b97dd3089fdc485c8f3a3c6751.jpg", false, null, null, 12), priorVMState, e0.b(new p(priorVMState.f68118d.f143086a, ((h80.d) event).f68086a, false, priorVMState.f68116b)));
        }
        throw new NoWhenBranchMatchedException();
    }

    private static c0 B(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        int i13 = 1;
        int i14 = 0;
        fk0.g event = (fk0.g) sVar;
        fk0.a priorDisplayState = (fk0.a) oVar;
        w priorVMState = (w) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof fk0.b) {
            resultBuilder.h(new gd0.c(26, priorVMState, event));
            resultBuilder.f(new gd0.c(27, priorDisplayState, event));
        } else if (Intrinsics.d(event, fk0.f.f62279a)) {
            resultBuilder.h(new v(priorVMState, i14));
        } else if (Intrinsics.d(event, fk0.e.f62278a)) {
            resultBuilder.h(new v(priorVMState, i13));
        } else if (event instanceof fk0.d) {
            resultBuilder.a(new fk0.s(priorVMState.f62328a, priorVMState.f62329b));
        } else {
            if (!(event instanceof fk0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.n.f51137b.getValue());
            w13.m0("com.pinterest.EXTRA_BOARD_ID", ((fk0.c) event).f62276a);
            resultBuilder.d(new t(al1.b.f15477a), new t(new al1.a(w13)));
        }
        return resultBuilder.e();
    }

    private c0 C(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        u nVar;
        Object obj;
        Uri parse;
        Uri parse2;
        sk0.i event = (sk0.i) sVar;
        sk0.d priorDisplayState = (sk0.d) oVar;
        y priorVMState = (y) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        int i13 = 0;
        if (event instanceof sk0.g) {
            sk0.g gVar = (sk0.g) event;
            y yVar = (y) resultBuilder.f82219b;
            resultBuilder.a(new sk0.k(h32.i0.a(yVar.f113097h.f143086a, null, null, null, j(u(gVar.f113058a)), 95), r(yVar)));
            int i14 = sk0.v.f113083a[u(gVar.f113058a).ordinal()];
            if (i14 != 1) {
                String str = null;
                if (i14 == 2) {
                    y yVar2 = (y) resultBuilder.f82219b;
                    if ((j1.U0(yVar2.f113093d) ? yVar2.f113095f : yVar2.f113094e) > 0 || yVar2.f113096g > 1) {
                        resultBuilder.f(sk0.w.f113084j);
                    } else {
                        int i15 = d70.g.empty_board_add_pins;
                        String[] formatArgs = new String[0];
                        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                        resultBuilder.a(new sk0.t(new k92.n(new k92.c(new k0(i15, new ArrayList(0)), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                    }
                } else if (i14 == 3) {
                    y yVar3 = (y) resultBuilder.f82219b;
                    resultBuilder.a(new sk0.r(yVar3.f113091b, yVar3.f113093d));
                } else if (i14 == 4) {
                    resultBuilder.a(new sk0.o(((y) resultBuilder.f82219b).f113091b));
                } else {
                    if (i14 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it = ((y) resultBuilder.f82219b).f113090a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((la) obj).q().intValue() == z22.c.SHOP.getValue()) {
                            break;
                        }
                    }
                    la laVar = (la) obj;
                    if (laVar != null) {
                        u[] uVarArr = new u[1];
                        y yVar4 = (y) resultBuilder.f82219b;
                        String str2 = yVar4.f113091b;
                        String l13 = laVar.l();
                        String queryParameter = (l13 == null || (parse2 = Uri.parse(l13)) == null) ? null : parse2.getQueryParameter("title");
                        String l14 = laVar.l();
                        if (l14 != null && (parse = Uri.parse(l14)) != null) {
                            str = parse.getQueryParameter("subtitle");
                        }
                        uVarArr[0] = new q(str2, yVar4.f113092c, queryParameter, str);
                        resultBuilder.d(uVarArr);
                    }
                }
            } else {
                u[] uVarArr2 = new u[1];
                if (j1.U0(((y) resultBuilder.f82219b).f113093d)) {
                    y yVar5 = (y) resultBuilder.f82219b;
                    String str3 = yVar5.f113091b;
                    String str4 = yVar5.f113093d;
                    Intrinsics.f(str4);
                    nVar = new sk0.p(str3, str4);
                } else {
                    nVar = new sk0.n(((y) resultBuilder.f82219b).f113091b);
                }
                uVarArr2[0] = nVar;
                resultBuilder.d(uVarArr2);
            }
        } else if (event instanceof sk0.h) {
            y yVar6 = (y) resultBuilder.f82219b;
            resultBuilder.a(new sk0.l(h32.i0.a(yVar6.f113097h.f143086a, null, null, null, j(u(((sk0.h) event).f113059a)), 95), r(yVar6)));
        } else if (event instanceof sk0.f) {
            sk0.f fVar = (sk0.f) event;
            resultBuilder.f(new x(i13, this, fVar));
            resultBuilder.h(new hh0.a(fVar, 26));
        } else {
            if (!(event instanceof sk0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            resultBuilder.f(sk0.w.f113085k);
        }
        return resultBuilder.e();
    }

    private c0 D(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        f0 uVar;
        l82.h xVar;
        l82.h rVar;
        int i13 = 1;
        int i14 = 0;
        tk0.q event = (tk0.q) sVar;
        tk0.e priorDisplayState = (tk0.e) oVar;
        tk0.i0 priorVMState = (tk0.i0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        int i15 = 2;
        int i16 = 3;
        if (event instanceof tk0.o) {
            tk0.o oVar2 = (tk0.o) event;
            boolean isSelectAllBackendToggled = ((tk0.i0) resultBuilder.f82219b).f117976f.isSelectAllBackendToggled();
            resultBuilder.a(new b0(t(resultBuilder, q(oVar2.f117986a)), s(resultBuilder)));
            int i17 = g0.f117966a[q(oVar2.f117986a).ordinal()];
            if (i17 == 1) {
                if (isSelectAllBackendToggled) {
                    v7 v7Var = ((tk0.i0) resultBuilder.f82219b).f117974d;
                    Intrinsics.f(v7Var);
                    xVar = new tk0.w(v7Var, ((tk0.i0) resultBuilder.f82219b).f117973c, l(resultBuilder), CollectionsKt.F0(((tk0.i0) resultBuilder.f82219b).f117978h));
                } else {
                    v7 v7Var2 = ((tk0.i0) resultBuilder.f82219b).f117974d;
                    Intrinsics.f(v7Var2);
                    xVar = new tk0.x(v7Var2, ((tk0.i0) resultBuilder.f82219b).f117973c, l(resultBuilder));
                }
                resultBuilder.a(xVar);
            } else if (i17 == 2) {
                if (isSelectAllBackendToggled) {
                    tk0.i0 i0Var2 = (tk0.i0) resultBuilder.f82219b;
                    rVar = new tk0.s(i0Var2.f117972b, i0Var2.f117973c, l(resultBuilder), CollectionsKt.F0(((tk0.i0) resultBuilder.f82219b).f117978h));
                } else {
                    tk0.i0 i0Var3 = (tk0.i0) resultBuilder.f82219b;
                    rVar = new tk0.r(i0Var3.f117972b, i0Var3.f117973c, l(resultBuilder));
                }
                resultBuilder.a(rVar);
            } else {
                if (i17 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                resultBuilder.f(new h0(i14, resultBuilder));
            }
        } else if (event instanceof tk0.p) {
            resultBuilder.a(new tk0.c0(t(resultBuilder, q(((tk0.p) event).f117987a)), s(resultBuilder)));
        } else if (event instanceof tk0.h) {
            resultBuilder.f(new x(i15, this, resultBuilder));
            resultBuilder.d(new z(k(resultBuilder, u0.CANCEL_BUTTON), s(resultBuilder)));
        } else if (event instanceof tk0.m) {
            resultBuilder.a(new a0(k(resultBuilder, ((tk0.i0) resultBuilder.f82219b).f117976f.isSelectAllBackendToggled() ? u0.UNSELECT_ALL_BUTTON : u0.SELECT_ALL_BUTTON), s(resultBuilder)));
        } else if (event instanceof tk0.g) {
            tk0.g gVar = (tk0.g) event;
            resultBuilder.h(new hh0.a(gVar, 27));
            resultBuilder.f(new x(i13, this, gVar));
        } else if (event instanceof tk0.i) {
            f0[] f0VarArr = new f0[1];
            if (((tk0.i0) resultBuilder.f82219b).f117976f.isSelectAllBackendToggled()) {
                i0 i0Var4 = resultBuilder.f82219b;
                tk0.i0 i0Var5 = (tk0.i0) i0Var4;
                uVar = new tk0.t(i0Var5.f117972b, i0Var5.f117973c, CollectionsKt.F0(((tk0.i0) i0Var4).f117978h));
            } else {
                tk0.i0 i0Var6 = (tk0.i0) resultBuilder.f82219b;
                uVar = new tk0.u(i0Var6.f117972b, i0Var6.f117973c, l(resultBuilder));
            }
            f0VarArr[0] = uVar;
            resultBuilder.d(f0VarArr);
        } else if (event instanceof tk0.j) {
            resultBuilder.f(tk0.d.f117952k);
        } else if (event instanceof tk0.f) {
            resultBuilder.h(new x(i16, priorVMState, event));
        } else if (event instanceof tk0.l) {
            resultBuilder.f(tk0.d.f117953l);
        } else if (event instanceof tk0.n) {
            resultBuilder.f(new hh0.a(event, 28));
            tk0.n event2 = (tk0.n) event;
            int i18 = ((tk0.i0) resultBuilder.f82219b).f117979i;
            Intrinsics.checkNotNullParameter(event2, "event");
            resultBuilder.a(new tk0.e0(new k92.n(new k92.c(event2.f117985a ? bs1.c.i2(l70.c.deleted_pins_status_message, i18, String.valueOf(i18)) : bs1.c.j2(new String[0], x0.generic_error), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
        } else {
            if (!(event instanceof tk0.k)) {
                throw new NoWhenBranchMatchedException();
            }
            resultBuilder.f(new x(i15, this, resultBuilder));
        }
        return resultBuilder.e();
    }

    private static c0 E(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        f1 f1Var;
        int i13 = 0;
        hp0.h event = (hp0.h) sVar;
        hp0.b priorDisplayState = (hp0.b) oVar;
        hp0.e0 priorVMState = (hp0.e0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof hp0.e) {
            Iterator it = ((hp0.e) event).f69828a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (Intrinsics.d(((f30) it.next()).getUid(), priorVMState.f69830b)) {
                    break;
                }
                i13++;
            }
            if (i13 < 0) {
                p(resultBuilder, "CLICKED ON INVALID PIN FROM MODULE", priorVMState.f69829a.f143086a, priorVMState.f69831c);
            }
            resultBuilder.f(new m4(i13, event, 7));
        } else if (event instanceof hp0.g) {
            resultBuilder.a(new hp0.w(new al1.f(e0.b(((hp0.g) event).f69839a))));
        } else if (event instanceof hp0.d) {
            p(resultBuilder, "COULD NOT READ STORY FROM CACHE", priorVMState.f69829a.f143086a, priorVMState.f69831c);
        } else if (event instanceof hp0.c) {
            h32.i0 i0Var2 = priorVMState.f69829a.f143086a;
            int i14 = d0.f69827a[((hp0.c) event).f69825a.ordinal()];
            if (i14 == 1) {
                f1Var = f1.SWIPE_RIGHT;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f1Var = f1.SWIPE_LEFT;
            }
            f1 f1Var2 = f1Var;
            HashMap o13 = ep.b.o("story_type", "related_pins_3p_ads_module_qcm");
            Unit unit = Unit.f80348a;
            resultBuilder.d(new hp0.v(new zy.e0(new zy.a(i0Var2, f1Var2, priorVMState.f69831c, o13, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
        } else if (event instanceof hp0.f) {
            resultBuilder.d(new hp0.x(priorVMState.f69832d));
            resultBuilder.h(hp0.k.f69851p);
        }
        return resultBuilder.e();
    }

    private static c0 F(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        xs0.c event = (xs0.c) sVar;
        xs0.a priorDisplayState = (xs0.a) oVar;
        xs0.h priorVMState = (xs0.h) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (!(event instanceof xs0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        xs0.f[] fVarArr = new xs0.f[2];
        fVarArr[0] = new xs0.d(priorVMState.f135814a);
        h32.i0 a13 = h32.i0.a(priorVMState.f135817d.f143086a, null, null, null, u0.HOME_FEED_CONTROL_PANEL_BOARD_ITEM, 95);
        v7 v7Var = priorVMState.f135814a;
        Boolean z03 = v7Var.z0();
        Intrinsics.checkNotNullExpressionValue(z03, "getAllowHomefeedRecommendations(...)");
        fVarArr[1] = new xs0.e(new zy.e0(new zy.a(a13, z03.booleanValue() ? f1.TOGGLE_OFF : f1.TOGGLE_ON, v7Var.getUid(), null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER)));
        resultBuilder.d(fVarArr);
        return resultBuilder.e();
    }

    private static c0 G(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        yw0.i event = (yw0.i) sVar;
        yw0.g priorDisplayState = (yw0.g) oVar;
        yw0.m priorVMState = (yw0.m) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (!(event instanceof yw0.h)) {
            throw new NoWhenBranchMatchedException();
        }
        yw0.h hVar = (yw0.h) event;
        h32.i0 i0Var2 = hVar.f140301a;
        vh vhVar = priorVMState.f140304a;
        Integer num = priorVMState.f140307d;
        return new c0(new yw0.g(priorDisplayState.f140291a, priorDisplayState.f140292b, priorDisplayState.f140293c, priorDisplayState.f140294d, null, priorDisplayState.f140297g, false, priorDisplayState.f140300j, 48), priorVMState, e0.b(new yw0.j(new zy.e0(f0.h.O(i0Var2, vhVar, priorVMState.f140306c, hVar.f140302b, num)))));
    }

    private static c0 H(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        bx0.s event = (bx0.s) sVar;
        bx0.l priorDisplayState = (bx0.l) oVar;
        bx0.y priorVMState = (bx0.y) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof bx0.o) {
            bx0.o oVar2 = (bx0.o) event;
            return new c0(bx0.l.e(priorDisplayState, 0, false, 7807), priorVMState, e0.b(new bx0.u(new zy.e0(kh2.g0.y(oVar2.f24081a, priorVMState.f24091a, priorVMState.f24093c, oVar2.f24082b, priorVMState.f24094d)))));
        }
        if (event instanceof bx0.p) {
            bx0.p pVar = (bx0.p) event;
            return new c0(bx0.l.e(priorDisplayState, pVar.f24083a, true, 7743), priorVMState, e0.b(new bx0.v(pVar.f24083a)));
        }
        if (event instanceof bx0.q) {
            resultBuilder.a(new bx0.u(new zy.e0(new zy.a(((bx0.q) event).f24084a, f1.REFRESH, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
            return resultBuilder.e();
        }
        if (event instanceof bx0.m) {
            bx0.m mVar = (bx0.m) event;
            Context context = mVar.f24079b;
            String e13 = priorVMState.f24091a.f42857o.e();
            Intrinsics.checkNotNullExpressionValue(e13, "getActionDeepLink(...)");
            resultBuilder.d(new bx0.t(context, e13), new bx0.u(new zy.e0(new zy.a(mVar.f24078a, f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
            return resultBuilder.e();
        }
        if (!(event instanceof bx0.r)) {
            if (Intrinsics.d(event, bx0.n.f24080a)) {
                return resultBuilder.e();
            }
            throw new NoWhenBranchMatchedException();
        }
        bx0.r rVar = (bx0.r) event;
        Context context2 = rVar.f24085a;
        String e14 = priorVMState.f24091a.f42857o.e();
        Intrinsics.checkNotNullExpressionValue(e14, "getActionDeepLink(...)");
        resultBuilder.d(new bx0.t(context2, e14), new bx0.u(new zy.e0(new zy.a(rVar.f24086b, f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
        return resultBuilder.e();
    }

    private static c0 I(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        c0 c0Var;
        List q13;
        cc0 cc0Var;
        List q14;
        List q15;
        cc0 cc0Var2;
        String k13;
        fz0.g event = (fz0.g) sVar;
        fz0.b priorDisplayState = (fz0.b) oVar;
        fz0.t priorVMState = (fz0.t) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof fz0.d) {
            return new c0(new fz0.b(((fz0.d) event).f63120a, 0, 0, priorDisplayState.f63118d, 6), priorVMState, q0.f80391a);
        }
        if (event instanceof fz0.f) {
            return new c0(new fz0.b(priorDisplayState.f63115a, 0, 0, false, 14), priorVMState, q0.f80391a);
        }
        if (event instanceof fz0.c) {
            ia0 ia0Var = priorDisplayState.f63115a;
            int i13 = priorDisplayState.f63116b;
            if (ia0Var != null && (q15 = ia0Var.q()) != null && (cc0Var2 = (cc0) q15.get(i13)) != null && (k13 = cc0Var2.k()) != null) {
                priorVMState.f63152c.put(k13, Integer.valueOf(((fz0.c) event).f63119a));
            }
            int i14 = i13 + 1;
            ia0 ia0Var2 = priorDisplayState.f63115a;
            if (i14 >= ((ia0Var2 == null || (q14 = ia0Var2.q()) == null) ? 0 : q14.size())) {
                h32.i0 i0Var2 = priorVMState.f63154e.f143086a;
                HashMap hashMap = new HashMap();
                hashMap.put("depth", String.valueOf(i13));
                hashMap.put("grid_index", String.valueOf(((fz0.c) event).f63119a));
                String str = priorVMState.f63153d;
                hashMap.put("referrer", str);
                hashMap.put("team", "atg_products");
                Unit unit = Unit.f80348a;
                String str2 = priorVMState.f63150a;
                fz0.p pVar = new fz0.p(i0Var2, str2, hashMap);
                fz0.r rVar = new fz0.r(al1.b.f15477a);
                NavigationImpl w13 = Navigation.w1(PearLocation.PEAR_QUIZ_RESULT_V2);
                w13.m0("com.pinterest.EXTRA_QUIZ_ID", str2);
                w13.m0("com.pinterest.EXTRA_REFERRER", str);
                w13.m0("EXTRA_ANSWER_STRING", new nm.o().k(priorVMState.f63152c));
                Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                return new c0(priorDisplayState, priorVMState, kotlin.collections.f0.j(pVar, rVar, new fz0.r(new al1.a(w13))));
            }
            fz0.b bVar = new fz0.b(priorDisplayState.f63115a, i14, 0, false, 12);
            h32.i0 i0Var3 = priorVMState.f63154e.f143086a;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("depth", String.valueOf(i13));
            hashMap2.put("grid_index", String.valueOf(((fz0.c) event).f63119a));
            hashMap2.put("referrer", priorVMState.f63153d);
            hashMap2.put("team", "atg_products");
            Unit unit2 = Unit.f80348a;
            c0Var = new c0(bVar, priorVMState, e0.b(new fz0.p(i0Var3, priorVMState.f63150a, hashMap2)));
        } else {
            if (!(event instanceof fz0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            ia0 ia0Var3 = priorDisplayState.f63115a;
            int i15 = priorDisplayState.f63116b;
            int i16 = i15 - 1;
            fz0.b bVar2 = new fz0.b(ia0Var3, i16, ((Number) priorVMState.f63152c.getOrDefault((ia0Var3 == null || (q13 = ia0Var3.q()) == null || (cc0Var = (cc0) q13.get(i16)) == null) ? null : cc0Var.k(), -1)).intValue(), false, 8);
            h32.i0 i0Var4 = priorVMState.f63154e.f143086a;
            HashMap hashMap3 = new HashMap();
            hashMap3.put("depth", String.valueOf(i15));
            hashMap3.put("team", "atg_products");
            Unit unit3 = Unit.f80348a;
            c0Var = new c0(bVar2, priorVMState, e0.b(new fz0.o(i0Var4, hashMap3)));
        }
        return c0Var;
    }

    private static c0 J(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        z91.h event = (z91.h) sVar;
        z91.e priorDisplayState = (z91.e) oVar;
        z91.u priorVMState = (z91.u) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean d2 = Intrinsics.d(event, z91.f.f141368a);
        z91.d dVar = z91.a.f141359a;
        if (d2) {
            if (!priorDisplayState.f141366d) {
                dVar = new z91.b(new z91.z(new k0(b52.c.amazon_modal_title), new k0(b52.c.amazon_modal_info), new k0(b52.c.unlink), new k0(x0.cancel)));
            }
            return new c0(z91.e.e(priorDisplayState, false, dVar, 15), priorVMState, q0.f80391a);
        }
        if (Intrinsics.d(event, z91.f.f141369b)) {
            return new c0(z91.e.e(priorDisplayState, false, dVar, 15), priorVMState, q0.f80391a);
        }
        if (Intrinsics.d(event, z91.f.f141371d)) {
            return new c0(priorDisplayState, priorVMState, q0.f80391a);
        }
        if (Intrinsics.d(event, z91.f.f141372e)) {
            return new c0(z91.e.e(priorDisplayState, true, null, 23), priorVMState, e0.b(z91.s.f141400a));
        }
        boolean d13 = Intrinsics.d(event, z91.f.f141373f);
        z91.r rVar = z91.r.f141399a;
        if (d13) {
            return new c0(z91.e.e(priorDisplayState, false, new z91.c(new do1.d(new k0(b52.c.amazon_toast_success), null, null, null, 0, 3000, 0, null, false, 478), true), 7), priorVMState, e0.b(rVar));
        }
        if (Intrinsics.d(event, z91.f.f141370c)) {
            return new c0(priorDisplayState, priorVMState, e0.b(rVar));
        }
        if (!(event instanceof z91.g)) {
            throw new NoWhenBranchMatchedException();
        }
        return new c0(z91.e.e(priorDisplayState, false, new z91.c(new do1.d(new k0(x0.oops_something_went_wrong), null, null, do1.n.ERROR, 0, 3000, 0, null, false, 470), false), 7), priorVMState, q0.f80391a);
    }

    public static tk0.e g(tk0.i0 i0Var) {
        sk0.a aVar;
        List list = i0Var.f117971a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean z13 = true;
            if (!it.hasNext()) {
                return new tk0.e(arrayList, new xm0.a(z13, 5), new tk0.a(62), 8);
            }
            tk0.c cVar = (tk0.c) it.next();
            int i13 = g0.f117966a[cVar.ordinal()];
            if (i13 != 1) {
                int i14 = 16;
                if (i13 == 2) {
                    aVar = new sk0.a(bs1.c.j2(new String[0], d70.g.floating_tool_section), rm1.q.ADD_SECTION, cVar.getPosition(), i14);
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new sk0.a(bs1.c.j2(new String[0], d70.g.floating_tool_delete), rm1.q.TRASH_CAN, cVar.getPosition(), i14);
                }
            } else {
                aVar = new sk0.a(bs1.c.j2(new String[0], d70.g.floating_tool_move_to), rm1.q.ARROW_LEFT_CURVED, cVar.getPosition(), false, true);
            }
            arrayList.add(aVar);
        }
    }

    public static c0 h(pp1.v vmState) {
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return new c0(new pp1.n(new k0(sp1.e.handshake_bottom_sheet_title), new k0(sp1.e.handshake_bottom_sheet_header_title), new k0(sp1.e.handshake_bottom_sheet_accept_button), new k0(sp1.e.handshake_bottom_sheet_cancel_button), new ArrayList(), 16), vmState, q0.f80391a);
    }

    public static u0 j(sk0.c cVar) {
        int i13 = sk0.v.f113083a[cVar.ordinal()];
        if (i13 == 1) {
            return u0.BOARD_TOOL_MORE_IDEAS;
        }
        if (i13 == 2) {
            return u0.BOARD_TOOL_ORGANIZE;
        }
        if (i13 == 3) {
            return u0.ADD_BUTTON;
        }
        if (i13 == 4) {
            return u0.ROOM_REPAINTING_MODULE;
        }
        if (i13 == 5) {
            return u0.BOARD_TOOL_SHOP;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static h32.i0 k(l82.e eVar, u0 u0Var) {
        return u0Var != null ? h32.i0.a(((tk0.i0) eVar.f82219b).f117980j.f143086a, null, null, null, u0Var, 95) : ((tk0.i0) eVar.f82219b).f117980j.f143086a;
    }

    public static List l(l82.e eVar) {
        return CollectionsKt.F0(((tk0.i0) eVar.f82219b).f117977g);
    }

    public static String m(j jVar, q30 q30Var, int i13) {
        Map map;
        sr srVar;
        jVar.getClass();
        List q13 = q30Var.q();
        String j13 = (q13 == null || (map = (Map) CollectionsKt.U(i13, q13)) == null || (srVar = (sr) map.get("345x")) == null) ? null : srVar.j();
        return j13 == null ? "" : j13;
    }

    public static c0 n(com.pinterest.feature.settings.notifications.b bVar, com.pinterest.feature.settings.notifications.k0 k0Var, c1 c1Var, boolean z13) {
        String str;
        String str2;
        Boolean valueOf = c1Var == c1.PUSH ? Boolean.valueOf(z13) : bVar.f48171i;
        Boolean valueOf2 = c1Var == c1.EMAIL ? Boolean.valueOf(z13) : bVar.f48172j;
        Boolean valueOf3 = c1Var == c1.NEWS ? Boolean.valueOf(z13) : bVar.f48173k;
        com.pinterest.feature.settings.notifications.b e13 = com.pinterest.feature.settings.notifications.b.e(bVar, false, valueOf, valueOf2, valueOf3, 255);
        com.pinterest.feature.settings.notifications.k0 b13 = com.pinterest.feature.settings.notifications.k0.b(k0Var, null, false, null, null, null, null, null, null, null, valueOf, valueOf2, valueOf3, null, 294911);
        Boolean valueOf4 = Boolean.valueOf(k0Var.f48220e);
        int[] iArr = cb1.c.f27267a;
        int i13 = iArr[c1Var.ordinal()];
        if (i13 == 1) {
            str = k0Var.f48224i;
        } else if (i13 == 2) {
            str = k0Var.f48225j;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = k0Var.f48229n;
        }
        String str3 = str;
        int i14 = iArr[c1Var.ordinal()];
        if (i14 == 1) {
            str2 = k0Var.f48227l;
        } else if (i14 == 2) {
            str2 = k0Var.f48228m;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = k0Var.f48226k;
        }
        return new c0(e13, b13, e0.b(new com.pinterest.feature.settings.notifications.h0(k0Var.f48235t, valueOf4, c1Var, str3, str2, z13)));
    }

    public static c0 o(com.pinterest.feature.settings.notifications.b bVar, com.pinterest.feature.settings.notifications.k0 k0Var, c1 c1Var, boolean z13) {
        Boolean valueOf = c1Var == c1.PUSH ? Boolean.valueOf(!z13) : bVar.f48171i;
        Boolean valueOf2 = c1Var == c1.EMAIL ? Boolean.valueOf(!z13) : bVar.f48172j;
        Boolean valueOf3 = c1Var == c1.NEWS ? Boolean.valueOf(!z13) : bVar.f48173k;
        return new c0(com.pinterest.feature.settings.notifications.b.e(bVar, false, valueOf, valueOf2, valueOf3, 255), com.pinterest.feature.settings.notifications.k0.b(k0Var, null, false, null, null, null, null, null, null, null, valueOf, valueOf2, valueOf3, null, 294911), q0.f80391a);
    }

    public static void p(l82.e eVar, String str, h32.i0 i0Var, String str2) {
        f1 f1Var = f1.ADS_STL_ERROR;
        HashMap x13 = a.a.x("error_message", str, "story_type", "related_pins_3p_ads_module_qcm");
        Unit unit = Unit.f80348a;
        eVar.d(new hp0.v(new zy.e0(new zy.a(i0Var, f1Var, str2, x13, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
    }

    public static tk0.c q(int i13) {
        tk0.c cVar = tk0.c.MOVE_TO;
        if (i13 != cVar.getPosition()) {
            cVar = tk0.c.SECTION;
            if (i13 != cVar.getPosition()) {
                cVar = tk0.c.DELETE;
                if (i13 != cVar.getPosition()) {
                    throw new IllegalArgumentException(a.a.d("Invalid position: ", i13));
                }
            }
        }
        return cVar;
    }

    public static HashMap r(y yVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", yVar.f113091b);
        hashMap.put("board_pin_count", String.valueOf(yVar.f113095f));
        String R0 = dl2.b.R0(yVar.f113093d);
        if (R0 != null) {
        }
        String R02 = dl2.b.R0(yVar.f113092c);
        if (R02 != null) {
            hashMap.put("board_session_id", R02);
        }
        return hashMap;
    }

    public static HashMap s(l82.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", ((tk0.i0) eVar.f82219b).f117972b);
        String str = ((tk0.i0) eVar.f82219b).f117973c;
        if (str != null && str.length() != 0) {
            String str2 = ((tk0.i0) eVar.f82219b).f117973c;
            Intrinsics.f(str2);
            hashMap.put("board_section_id", str2);
        }
        return hashMap;
    }

    public static h32.i0 t(l82.e eVar, tk0.c cVar) {
        u0 u0Var;
        int i13 = g0.f117966a[cVar.ordinal()];
        if (i13 == 1) {
            u0Var = u0.MOVE_PINS_BUTTON;
        } else if (i13 == 2) {
            u0Var = u0.CREATE_SECTION_BUTTON;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            u0Var = u0.BULK_DELETE_PINS_BUTTON;
        }
        return k(eVar, u0Var);
    }

    public static sk0.c u(int i13) {
        sk0.c cVar = sk0.c.MORE_IDEAS;
        if (i13 != cVar.getPosition()) {
            cVar = sk0.c.ORGANIZE;
            if (i13 != cVar.getPosition()) {
                cVar = sk0.c.ADD;
                if (i13 != cVar.getPosition()) {
                    cVar = sk0.c.ROOM_REPAINT;
                    if (i13 != cVar.getPosition()) {
                        cVar = sk0.c.SHOP;
                        if (i13 != cVar.getPosition()) {
                            throw new IllegalArgumentException(a.a.d("Invalid position: ", i13));
                        }
                    }
                }
            }
        }
        return cVar;
    }

    private static void v(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(sVar);
        a priorDisplayState = (a) oVar;
        k priorVMState = (k) i0Var;
        Intrinsics.checkNotNullParameter(null, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        throw new NoWhenBranchMatchedException();
    }

    private static c0 w(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        Long l13;
        zy.l event = (zy.l) sVar;
        zy.b priorDisplayState = (zy.b) oVar;
        l0 priorVMState = (l0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof zy.i) {
            zy.i iVar = (zy.i) event;
            if (iVar instanceof zy.h) {
                resultBuilder.a(new zy.u(((zy.h) iVar).f143077a));
            } else if (iVar instanceof zy.g) {
                resultBuilder.a(new zy.t(((zy.g) iVar).f143074a));
            } else if (iVar instanceof zy.e) {
                resultBuilder.a(new zy.s(((zy.e) iVar).f143070a));
            } else if (iVar instanceof zy.d) {
                resultBuilder.a(new zy.r(((zy.d) iVar).f143063a));
            } else if (iVar instanceof zy.f) {
                l0 l0Var = (l0) resultBuilder.f82219b;
                resultBuilder.a(new zy.q(((zy.f) iVar).f143072a, l0Var.f143086a, l0Var.f143087b));
            }
        } else if (event instanceof zy.c) {
            zy.c cVar = (zy.c) event;
            if (cVar instanceof zy.c) {
                resultBuilder.b(cVar.f143060a.isEmpty() ^ true ? e0.b(new zy.p(new zy.n(((l0) resultBuilder.f82219b).f143086a, new nx.r(cVar.f143060a), f1.ARTICLE_IMPRESSION_ONE_PIXEL, null, null, 48))) : q0.f80391a);
            }
        } else if (event instanceof zy.k) {
            zy.k kVar = (zy.k) event;
            if (kVar instanceof zy.k) {
                y0 y0Var = kVar.f143084a;
                v2 v2Var = y0Var.f92481a;
                Long l14 = v2Var.f67312b;
                HashMap hashMap = y0Var.f92483c;
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                HashMap hashMap2 = hashMap;
                if (l14 != null && (l13 = v2Var.f67314d) != null) {
                    hashMap2.put("total_time", String.valueOf(l13.longValue() - l14.longValue()));
                }
                y0 y0Var2 = kVar.f143084a;
                HashMap hashMap3 = y0Var2.f92482b;
                if (hashMap3 != null) {
                    hashMap2.putAll(hashMap3);
                }
                resultBuilder.a(new zy.x(new zy.n(((l0) resultBuilder.f82219b).f143086a, new nx.u(y0Var2.f92481a), f1.STORY_IMPRESSION_ONE_PIXEL, kVar.f143085b, hashMap2, 32)));
            }
        } else if (event instanceof zy.j) {
            zy.j jVar = (zy.j) event;
            if (jVar instanceof zy.j) {
                h32.i0 i0Var2 = ((l0) resultBuilder.f82219b).f143086a;
                v0 v0Var = jVar.f143081a;
                nx.t tVar = new nx.t(v0Var.f92473a, v0Var.f92475c);
                f1 f1Var = f1.SHUFFLE_IMPRESSION_ONE_PIXEL;
                v0 v0Var2 = jVar.f143081a;
                resultBuilder.a(new zy.w(new zy.n(i0Var2, tVar, f1Var, v0Var2.f92474b, v0Var2.f92475c, 32)));
            }
        }
        return resultBuilder.e();
    }

    private static c0 x(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        ll1.d event = (ll1.d) sVar;
        zy.a0 priorDisplayState = (zy.a0) oVar;
        l0 priorVMState = (l0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (!(event instanceof ll1.b)) {
            if (event instanceof ll1.a) {
                ll1.a aVar = (ll1.a) event;
                return new c0(priorDisplayState, priorVMState, kotlin.collections.f0.j(new zy.g0(aVar.f83823a, aVar.f83826d), new zy.h0(aVar.f83824b, aVar.f83825c)));
            }
            if (event instanceof ll1.c) {
                return new c0(priorDisplayState, priorVMState, e0.b(zy.i0.f143080a));
            }
            throw new NoWhenBranchMatchedException();
        }
        h32.i0 i0Var2 = priorVMState.f143086a;
        String str = ((ll1.b) event).f83827a;
        l0 b13 = l0.b(priorVMState, com.bumptech.glide.d.z0(i0Var2, new wt.c((str == null || kotlin.text.z.j(str)) ? null : new x3(null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null), 21)));
        String str2 = priorDisplayState.f143057b;
        h32.i0 pinalyticsContext = b13.f143086a;
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        return new c0(new zy.a0(pinalyticsContext, str2), b13, e0.b(new j0(pinalyticsContext, b13.f143087b)));
    }

    private static c0 y(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        gz.h event = (gz.h) sVar;
        gz.d priorDisplayState = (gz.d) oVar;
        gz.o priorVMState = (gz.o) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof gz.e) {
            gz.e eVar = (gz.e) event;
            resultBuilder.a(new gz.k(eVar.f66337a, s0.U0(eVar.f66338b)));
            resultBuilder.f(new gz.n(event, 0));
        } else if (event instanceof gz.g) {
            resultBuilder.f(new gz.n(event, 1));
        } else {
            if (!(event instanceof gz.f)) {
                throw new NoWhenBranchMatchedException();
            }
            resultBuilder.a(new gz.l(((gz.f) event).f66339a));
        }
        return resultBuilder.e();
    }

    private static c0 z(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        h60.b event = (h60.b) sVar;
        h60.a priorDisplayState = (h60.a) oVar;
        h60.g priorVMState = (h60.g) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (!(event instanceof h60.b)) {
            throw new NoWhenBranchMatchedException();
        }
        h32.i0 i0Var2 = event.f67783b;
        f1 f1Var = f1.AUTO_CLUSTERS_IMPRESSION;
        HashMap hashMap = new HashMap();
        hashMap.put("content_ids", CollectionsKt.Z(event.f67782a, "|", null, null, 0, null, h60.f.f67795j, 30));
        String str = priorVMState.f67803f;
        if (str != null) {
            hashMap.put("navigation_source", str);
        }
        Unit unit = Unit.f80348a;
        return new c0(h60.a.e(priorDisplayState, 0, 31), h60.g.b(priorVMState, false, false, l0.b(priorVMState.f67802e, event.f67783b), 47), e0.b(new h60.e(new zy.e0(new zy.a(i0Var2, f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07a6  */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66, types: [kotlin.collections.q0] */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 c(l82.i0 r32) {
        /*
            Method dump skipped, instructions count: 2284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lt.j.c(l82.i0):l82.c0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0752, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.f48233r, java.lang.Boolean.valueOf(r5)) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:?, code lost:
    
        return new l82.c0(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0774, code lost:
    
        r1 = r4.f48220e;
        r2 = r2.f48288a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0778, code lost:
    
        if (r1 == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x077a, code lost:
    
        if (r5 != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x077e, code lost:
    
        if (r2 != com.pinterest.feature.settings.notifications.c1.PUSH) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0780, code lost:
    
        r1 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0782, code lost:
    
        r33 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x078a, code lost:
    
        if (r2 != com.pinterest.feature.settings.notifications.c1.EMAIL) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x078c, code lost:
    
        r1 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x078e, code lost:
    
        r34 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0796, code lost:
    
        if (r2 != com.pinterest.feature.settings.notifications.c1.NEWS) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0798, code lost:
    
        r1 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x079a, code lost:
    
        r35 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:?, code lost:
    
        return new l82.c0(com.pinterest.feature.settings.notifications.b.e(r3, false, r33, r34, r35, 255), com.pinterest.feature.settings.notifications.k0.b(r4, null, false, null, null, null, null, null, null, null, r33, r34, r35, new com.pinterest.feature.settings.notifications.j0(r2, r5), 32767), kotlin.collections.e0.b(new com.pinterest.feature.settings.notifications.g0(new zb0.j(new zb0.a(new u50.k0(e52.c.notif_settings_confirm_title), new u50.k0(e52.c.notif_settings_confirm_message), new u50.k0(e52.c.notif_settings_confirm_confirm), new u50.k0(e52.c.notif_settings_confirm_cancel), true), null))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x079d, code lost:
    
        r1 = r3.f48173k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0791, code lost:
    
        r1 = r3.f48172j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0785, code lost:
    
        r1 = r3.f48171i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:?, code lost:
    
        return n(r3, r4, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0765, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.f48232q, java.lang.Boolean.valueOf(r5)) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0772, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.f48231p, java.lang.Boolean.valueOf(r5)) == false) goto L175;
     */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r39, u50.o r40, l82.i0 r41, l82.e r42) {
        /*
            Method dump skipped, instructions count: 2998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lt.j.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }

    public final c0 i(l0 vmState) {
        switch (this.f84750b) {
            case 1:
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return new c0(zy.b.f143058a, vmState, q0.f80391a);
            default:
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return new c0(new zy.a0(vmState.f143086a, vmState.f143087b), vmState, q0.f80391a);
        }
    }
}
