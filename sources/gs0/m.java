package gs0;

import android.view.View;
import ao2.m2;
import ao2.v0;
import cb2.r;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.ym;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.q1;
import e0.t;
import fs0.s;
import fs0.u;
import fs0.w;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import java.util.HashMap;
import jc0.v;
import kh2.c3;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import x02.a2;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f66052b;

    public /* synthetic */ m(o oVar, int i13) {
        this.f66051a = i13;
        this.f66052b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cs0.f fVar;
        String c13;
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        int i13 = 10;
        int i14 = this.f66051a;
        int i15 = 15;
        int i16 = 14;
        int i17 = 25;
        int i18 = 11;
        int i19 = 1;
        o this$0 = this.f66052b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar2 = this$0.f66072t;
                if (fVar2 != null) {
                    ((w) fVar2).z3();
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar3 = this$0.f66072t;
                if (fVar3 != null) {
                    ((w) fVar3).F3(null, null);
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar4 = this$0.f66072t;
                if (fVar4 != null) {
                    w wVar = (w) fVar4;
                    wVar.u3();
                    ScreenLocation screenLocation = (ScreenLocation) q1.f51223a.getValue();
                    String str = wVar.K;
                    if (str != null) {
                        wVar.f62906e.d(Navigation.L(screenLocation, str, ml1.b.MODAL_TRANSITION.getValue()));
                        return;
                    } else {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar5 = this$0.f66072t;
                if (fVar5 != null) {
                    ((w) fVar5).z3();
                    return;
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar6 = this$0.f66072t;
                if (fVar6 != null) {
                    w wVar2 = (w) fVar6;
                    wVar2.u3();
                    String str2 = wVar2.K;
                    if (str2 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    xj2.c F = wVar2.f62902a.P(str2).F(new fs0.o(20, new s(wVar2, 6)), new fs0.o(21, new s(wVar2, 7)), cVar, a2Var);
                    if (wVar2.isBound()) {
                        wVar2.addDisposable(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar7 = this$0.f66072t;
                if (fVar7 != null) {
                    ((w) fVar7).B3();
                    return;
                }
                return;
            case 6:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ym genAiTopic = this$0.f66059g.H;
                if (genAiTopic == null || (fVar = this$0.f66072t) == null) {
                    return;
                }
                if (this$0.f66056d == jo1.a.HOMEFEED) {
                    boolean z13 = this$0.f66058f;
                }
                w wVar3 = (w) fVar;
                Intrinsics.checkNotNullParameter(genAiTopic, "genAiTopic");
                String d2 = genAiTopic.d();
                if (d2 == null || (c13 = genAiTopic.c()) == null) {
                    return;
                }
                wVar3.getPinalytics().h(g0.OVERFLOW_MENU, u0.PIN_SEE_LESS_GEN_AI_TOPIC_BUTTON, bs1.c.o(new Pair("interest_id", c13), new Pair("pin_interest_name", d2)));
                wVar3.addDisposable(wVar3.f62918q.C(e0.b(c13)).l(tk2.e.f118017c).h(wj2.c.a()).i(new fs0.p(wVar3, 2), new fs0.o(26, new s(wVar3, 16))));
                return;
            case 7:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar8 = this$0.f66072t;
                if (fVar8 != null) {
                    w wVar4 = (w) fVar8;
                    d0 pinalytics = wVar4.getPinalytics();
                    u0 u0Var = u0.WEBSITE_BUTTON;
                    g0 g0Var = g0.OVERFLOW_MENU;
                    String str3 = wVar4.K;
                    if (str3 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics.b0(u0Var, g0Var, str3, false);
                    wVar4.u3();
                    String str4 = wVar4.K;
                    if (str4 != null) {
                        wVar4.f62906e.d(new ls1.s(str4));
                        return;
                    } else {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                }
                return;
            case 8:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar9 = this$0.f66072t;
                if (fVar9 != null) {
                    w wVar5 = (w) fVar9;
                    d0 pinalytics2 = wVar5.getPinalytics();
                    u0 u0Var2 = u0.PIN_REACTION_BUTTON;
                    g0 g0Var2 = g0.OVERFLOW_MENU;
                    String str5 = wVar5.K;
                    if (str5 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics2.b0(u0Var2, g0Var2, str5, false);
                    wVar5.u3();
                    String str6 = wVar5.K;
                    if (str6 != null) {
                        wVar5.f62906e.d(new r(str6));
                        return;
                    } else {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                }
                return;
            case 9:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar10 = this$0.f66072t;
                if (fVar10 != null) {
                    w wVar6 = (w) fVar10;
                    wVar6.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.CLICK, (r18 & 2) != 0 ? null : u0.PROMOTE_BUTTON, (r18 & 4) != 0 ? null : g0.MODAL_PIN, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    String str7 = wVar6.K;
                    if (str7 != null) {
                        c3.h0(wVar6.f62913l, str7);
                        return;
                    } else {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                }
                return;
            case 10:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar11 = this$0.f66072t;
                if (fVar11 != null) {
                    w wVar7 = (w) fVar11;
                    String str8 = wVar7.K;
                    if (str8 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    ek2.f i23 = wVar7.f62917p.n(str8).l(tk2.e.f118017c).h(wj2.c.a()).i(new fs0.p(wVar7, i19), new fs0.o(19, new u(wVar7, i18)));
                    Intrinsics.checkNotNullExpressionValue(i23, "subscribe(...)");
                    wVar7.addDisposable(i23);
                    return;
                }
                return;
            case 11:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar12 = this$0.f66072t;
                if (fVar12 != null) {
                    w wVar8 = (w) fVar12;
                    jo1.a baseFragmentType = this$0.f66056d;
                    Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
                    d0 pinalytics3 = wVar8.getPinalytics();
                    u0 u0Var3 = u0.PIN_REPIN_BUTTON;
                    g0 g0Var3 = g0.OVERFLOW_MENU;
                    String str9 = wVar8.K;
                    if (str9 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics3.b0(u0Var3, g0Var3, str9, false);
                    String str10 = wVar8.K;
                    if (str10 != null) {
                        wVar8.v3(str10, baseFragmentType, this$0.f66057e);
                        return;
                    } else {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                }
                return;
            case 12:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f66057e) {
                    t.f56747e = y32.f.CLOSEOUP_OVERFLOW.getValue();
                }
                cs0.f fVar13 = this$0.f66072t;
                if (fVar13 != null) {
                    w wVar9 = (w) fVar13;
                    d0 pinalytics4 = wVar9.getPinalytics();
                    u0 u0Var4 = u0.PIN_SEND_BUTTON;
                    g0 g0Var4 = g0.OVERFLOW_MENU;
                    String str11 = wVar9.K;
                    if (str11 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics4.b0(u0Var4, g0Var4, str11, false);
                    String str12 = wVar9.K;
                    if (str12 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    xj2.c F2 = wVar9.f62902a.P(str12).F(new fs0.o(14, new s(wVar9, i17)), new fs0.o(15, new s(wVar9, 26)), cVar, a2Var);
                    if (wVar9.isBound()) {
                        wVar9.addDisposable(F2);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar14 = this$0.f66072t;
                if (fVar14 != null) {
                    w wVar10 = (w) fVar14;
                    wVar10.u3();
                    String str13 = wVar10.K;
                    if (str13 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    xj2.c F3 = wVar10.f62902a.P(str13).F(new fs0.o(6, new s(wVar10, 19)), new fs0.o(7, new s(wVar10, 20)), cVar, a2Var);
                    if (wVar10.isBound()) {
                        wVar10.addDisposable(F3);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar15 = this$0.f66072t;
                if (fVar15 != null) {
                    ((w) fVar15).B3();
                    return;
                }
                return;
            case 15:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar16 = this$0.f66072t;
                if (fVar16 != null) {
                    ((w) fVar16).D3();
                    return;
                }
                return;
            case 16:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar17 = this$0.f66072t;
                if (fVar17 != null) {
                    u0 elementType = u0.PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_BOARD;
                    w wVar11 = (w) fVar17;
                    Intrinsics.checkNotNullParameter(elementType, "elementType");
                    d0 pinalytics5 = wVar11.getPinalytics();
                    u0 u0Var5 = u0.PIN_FEEDBACK_BUTTON_PFY;
                    g0 g0Var5 = g0.PIN_FEEDBACK_DIALOG_PFY;
                    String str14 = wVar11.K;
                    if (str14 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics5.b0(u0Var5, g0Var5, str14, false);
                    xj2.c F4 = wVar11.w3(l32.c.BLOCK_PFY_THROUGH_BOARD).F(new fs0.o(8, new s(wVar11, i16)), new fs0.o(9, new s(wVar11, i15)), cVar, a2Var);
                    if (wVar11.isBound()) {
                        wVar11.addDisposable(F4);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar18 = this$0.f66072t;
                if (fVar18 != null) {
                    ((w) fVar18).D3();
                    return;
                }
                return;
            case 18:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar19 = this$0.f66072t;
                if (fVar19 != null) {
                    w wVar12 = (w) fVar19;
                    jo1.a baseFragmentType2 = this$0.f66056d;
                    Intrinsics.checkNotNullParameter(baseFragmentType2, "baseFragmentType");
                    d0 pinalytics6 = wVar12.getPinalytics();
                    f1 f1Var = f1.IDEA_PIN_PRODUCT_TAG_REPIN;
                    String str15 = wVar12.K;
                    if (str15 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics6.u(f1Var, str15, wVar12.H, null, false);
                    String str16 = wVar12.K;
                    if (str16 != null) {
                        wVar12.v3(str16, baseFragmentType2, this$0.f66057e);
                        return;
                    } else {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                }
                return;
            case 19:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar20 = this$0.f66072t;
                if (fVar20 != null) {
                    w wVar13 = (w) fVar20;
                    wVar13.u3();
                    String str17 = wVar13.K;
                    if (str17 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    xj2.c F5 = wVar13.f62902a.P(str17).F(new fs0.o(22, new s(wVar13, 4)), new fs0.o(23, new s(wVar13, 5)), cVar, a2Var);
                    if (wVar13.isBound()) {
                        wVar13.addDisposable(F5);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar21 = this$0.f66072t;
                if (fVar21 != null) {
                    w wVar14 = (w) fVar21;
                    wVar14.u3();
                    wy0 wy0Var = wVar14.N;
                    if (wy0Var == null) {
                        return;
                    }
                    boolean z14 = !wy0Var.R2().booleanValue();
                    String uid = wy0Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    u0 u0Var6 = z14 ? u0.FOLLOW_USER_OPTION : u0.UNFOLLOW_USER_OPTION;
                    g0 g0Var6 = g0.OVERFLOW_MENU;
                    String str18 = wVar14.K;
                    if (str18 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    HashMap hashMap = new HashMap(y0.b(new Pair("pin_id", str18)));
                    wVar14.getPinalytics().f0(u0Var6, g0Var6, uid, hashMap, false);
                    kk2.l f13 = oe.f.f1(new ok1.f(new nk1.g(wVar14.getPinalytics(), new i0(null, null, null, g0Var6, null, u0Var6), uid, hashMap, null, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), wVar14.f62903b, null, false, null, 60), wy0Var, null, wVar14.f62921t.a(false), 10);
                    if (wVar14.isBound()) {
                        wVar14.addDisposable(f13);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar22 = this$0.f66072t;
                if (fVar22 != null) {
                    w wVar15 = (w) fVar22;
                    d0 pinalytics7 = wVar15.getPinalytics();
                    u0 u0Var7 = u0.AD_LIMIT_WEIGHT_LOSS;
                    g0 g0Var7 = g0.OVERFLOW_MENU;
                    String str19 = wVar15.K;
                    if (str19 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    pinalytics7.b0(u0Var7, g0Var7, str19, false);
                    wVar15.u3();
                    String str20 = wVar15.K;
                    if (str20 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    d4 j13 = wVar15.getPresenterPinalytics().j();
                    a4 i24 = wVar15.getPresenterPinalytics().i();
                    wVar15.D.f113350a.f114744b.f113620c.getClass();
                    m2 b13 = ue.c.b();
                    ko2.f fVar23 = v0.f20219a;
                    wVar15.f62906e.d(new v(new li1.g(i24, j13, str20, dl2.b.b(kotlin.coroutines.g.d(((bo2.e) ho2.q.f69782a).f23612f, b13).plus(new ao2.i0("WeightLossOptOutModal")))), false, 0L, 30));
                    return;
                }
                return;
            case 22:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar24 = this$0.f66072t;
                if (fVar24 != null) {
                    w wVar16 = (w) fVar24;
                    String str21 = wVar16.K;
                    if (str21 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    xj2.c o13 = wVar16.f62902a.L(str21).s().o(new fs0.o(24, new s(wVar16, i13)), new fs0.o(25, new s(wVar16, i18)));
                    Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                    if (wVar16.isBound()) {
                        wVar16.addDisposable(o13);
                        return;
                    }
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                cs0.f fVar25 = this$0.f66072t;
                if (fVar25 != null) {
                    w wVar17 = (w) fVar25;
                    wVar17.u3();
                    String str22 = wVar17.K;
                    if (str22 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    xj2.c F6 = wVar17.f62902a.P(str22).F(new fs0.o(12, new s(wVar17, 17)), new fs0.o(13, new s(wVar17, 18)), cVar, a2Var);
                    if (wVar17.isBound()) {
                        wVar17.addDisposable(F6);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
