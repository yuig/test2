package u91;

import a.cb;
import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.g0;
import h32.u0;
import java.util.List;
import jc0.v;
import kk2.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.g1;
import m60.w;
import m60.x0;
import p91.y;
import qv0.d0;
import s91.j;
import s91.k;
import s91.r;
import va1.f1;
import yb0.n;
import zp.t;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121219i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f121220j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f121219i = i13;
        this.f121220j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f121219i;
        h hVar = this.f121220j;
        switch (i13) {
            case 0:
                f1 item = (f1) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                t91.e eVar = hVar.f121221z0;
                if (eVar != null) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    int i14 = 1;
                    if (item instanceof r) {
                        eVar.getPinalytics().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : u0.UNLINK_ACCOUNT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        m mVar = new m(eVar.f116838e.f82746a.B().r(tk2.e.f118017c).l(wj2.c.a()), new b22.f(23, lb2.b.f82744i), 2);
                        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
                        kk2.h hVar2 = new kk2.h(new kk2.g(mVar, new y(7, new t91.c(eVar, r6)), 2), new g51.h(eVar, 4), 1);
                        Intrinsics.checkNotNullExpressionValue(hVar2, "doFinally(...)");
                        nl.b.q(hVar2, new t91.c(eVar, i14), new t91.c(eVar, 2));
                    } else {
                        boolean z13 = item instanceof s91.e;
                        w wVar = eVar.f116835b;
                        if (z13) {
                            wVar.d(new v(new t(eVar.f116840g), false, 0L, 30));
                        } else {
                            NavigationImpl L = Navigation.L(item.j(), "", item.c());
                            if (item instanceof j) {
                                wy0 wy0Var = eVar.f116841h;
                                if (wy0Var == null) {
                                    Intrinsics.r("user");
                                    throw null;
                                }
                                L.y0(wy0Var.N2(), "com.pinterst.EXTRA_SETTINGS_EMAIL");
                            } else if (item instanceof s91.g) {
                                rq0.a aVar = ((s91.g) item).f112068g;
                                if (aVar.a()) {
                                    h hVar3 = (h) ((r91.c) eVar.getView());
                                    w f73 = hVar3.f7();
                                    Context requireContext = hVar3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                    n nVar = new n(requireContext);
                                    String string = hVar3.getString(b52.c.account_conversion_not_allowed_title);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    nVar.w(string);
                                    nVar.u(hVar3.getString(b52.c.account_conversion_linked_business_to_personal_not_allowed_description));
                                    String string2 = hVar3.getString(x0.cancel);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    nVar.m(string2);
                                    String string3 = hVar3.getString(x0.learn_more);
                                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                    nVar.q(string3);
                                    nVar.f138513j = new d0(24, hVar3, nVar);
                                    cb.x(nVar, f73);
                                } else if (!aVar.f109690b) {
                                    h hVar4 = (h) ((r91.c) eVar.getView());
                                    w f74 = hVar4.f7();
                                    Context requireContext2 = hVar4.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                    n nVar2 = new n(requireContext2);
                                    String string4 = hVar4.getString(b52.c.account_conversion_not_allowed_title);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    nVar2.w(string4);
                                    nVar2.u(hVar4.getString(b52.c.account_conversion_not_eligible_description));
                                    String string5 = hVar4.getString(x0.cancel);
                                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                    nVar2.m(string5);
                                    String string6 = hVar4.getString(b52.c.contact_support);
                                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                    nVar2.q(string6);
                                    nVar2.f138513j = new d(hVar4, 0);
                                    cb.x(nVar2, f74);
                                }
                            } else if (item instanceof s91.f) {
                                List u23 = ((s91.f) item).f112063g.f109689a.u2();
                                if ((((u23 == null || u23.isEmpty()) ? 1 : 0) ^ 1) != 0) {
                                    h hVar5 = (h) ((r91.c) eVar.getView());
                                    w f75 = hVar5.f7();
                                    Context requireContext3 = hVar5.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                    n nVar3 = new n(requireContext3);
                                    String string7 = hVar5.getString(b52.c.account_conversion_not_allowed_title);
                                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                                    nVar3.w(string7);
                                    nVar3.u(hVar5.getString(b52.c.account_conversion_not_allowed_description));
                                    String string8 = hVar5.getString(x0.cancel);
                                    Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                                    nVar3.m(string8);
                                    String string9 = hVar5.getString(x0.learn_more);
                                    Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                                    nVar3.q(string9);
                                    nVar3.f138513j = new d(hVar5, 1);
                                    cb.x(nVar3, f75);
                                }
                            } else if (item instanceof s91.m) {
                                wy0 wy0Var2 = eVar.f116841h;
                                if (wy0Var2 == null) {
                                    Intrinsics.r("user");
                                    throw null;
                                }
                                if (wy0Var2.f3()) {
                                    wy0 wy0Var3 = eVar.f116841h;
                                    if (wy0Var3 == null) {
                                        Intrinsics.r("user");
                                        throw null;
                                    }
                                    if (!wy0Var3.e3().booleanValue()) {
                                        L.y0(l91.f.CREATE, "extra_password_mode");
                                    }
                                }
                                L.y0(l91.f.UPDATE, "extra_password_mode");
                            } else if (item instanceof k) {
                                eVar.getPinalytics().X(u0.PARENTAL_PASSCODE_OPTION);
                                ((g1) eVar.f116839f.f83424a).c("android_passcode_summary_sba");
                                wy0 wy0Var4 = eVar.f116841h;
                                if (wy0Var4 == null) {
                                    Intrinsics.r("user");
                                    throw null;
                                }
                                Boolean F3 = wy0Var4.F3();
                                Intrinsics.checkNotNullExpressionValue(F3, "getIsParentalControlPass…eVerificationPending(...)");
                                if (F3.booleanValue()) {
                                    L.Y1("extra_passcode_holding_state", true);
                                }
                            }
                            wVar.d(L);
                        }
                    }
                }
                return Unit.f80348a;
            default:
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(url, "url");
                hVar.s7().F(g0.PARENTAL_PASSCODE_SETTINGS_VIEW, u0.EXTERNAL_LINK);
                Context context = hVar.getContext();
                if (context != null) {
                    lu1.b bVar = hVar.H0;
                    if (bVar == null) {
                        Intrinsics.r("baseActivityHelper");
                        throw null;
                    }
                    ((lu1.c) bVar).m(context, url);
                }
                return Unit.f80348a;
        }
    }
}
