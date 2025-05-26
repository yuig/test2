package tq;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.w0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.ads.feature.owc.view.quiz.QuizCarouselIndexView;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ge0;
import com.pinterest.api.model.ld0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z90;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.error.ServerError;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.g1;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import h32.a4;
import h32.c1;
import h32.d4;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kh2.m2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.x0;
import ns.p0;
import nt.e1;
import rr.a1;
import rr.o0;
import rr.q0;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118797i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f118798j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, int i13) {
        super(1);
        this.f118797i = i13;
        this.f118798j = obj;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f118797i;
        Object obj = this.f118798j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.CENTER_VERTICAL), kotlin.collections.e0.b(vn1.e.BOLD), ((c0) obj).f118818f ? vn1.g.BODY_100 : vn1.g.BODY_200, 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096963);
            case 1:
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                return rn1.a.y(it, bs1.c.j2(new String[0], ((e1) obj).f92022e), vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = ((cr.b) obj).f53069b.f41279b;
                Intrinsics.checkNotNullExpressionValue(str, "getDisplay(...)");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.DARK, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
        }
    }

    public final void e(f30 f30Var) {
        yb0.n nVar;
        int i13 = this.f118797i;
        Object obj = this.f118798j;
        switch (i13) {
            case 3:
                Intrinsics.f(f30Var);
                if (b40.Q0(f30Var)) {
                    MainActivity mainActivity = (MainActivity) obj;
                    lr.r rVar = new lr.r(0, new zp.j0(9, mainActivity, f30Var));
                    bk.f fVar = MainActivity.N0;
                    mainActivity.showToast(rVar);
                    mainActivity.getEventManager().d(new ld0(b40.i(f30Var)));
                    nVar = null;
                } else {
                    MainActivity mainActivity2 = (MainActivity) obj;
                    nVar = new yb0.n(mainActivity2);
                    String string = mainActivity2.getString(x0.homefeed_partner_trending_pin_nag_non_qp_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    nVar.w(string);
                    nVar.u(mainActivity2.getString(x0.homefeed_partner_trending_pin_nag_non_qp_sub_title));
                    String string2 = mainActivity2.getString(x0.done);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    nVar.q(string2);
                    String string3 = mainActivity2.getString(x0.homefeed_partner_trending_pin_nag_secondary_text_see_pin);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    nVar.m(string3);
                    nVar.f138514k = new co.a(20, mainActivity2, f30Var);
                }
                AlertContainer alertContainer = ((MainActivity) obj).f35181j;
                if (alertContainer == null) {
                    Intrinsics.r("alertContainer");
                    throw null;
                }
                alertContainer.c(nVar);
                if (nVar instanceof xf1.a) {
                    ((xf1.a) nVar).performHapticFeedback(16);
                    return;
                }
                return;
            case 23:
                Intrinsics.f(f30Var);
                ((st.b) obj).v3(f30Var);
                return;
            default:
                Boolean e53 = f30Var.e5();
                Intrinsics.checkNotNullExpressionValue(e53, "getIsRepin(...)");
                if (e53.booleanValue()) {
                    st.d dVar = (st.d) obj;
                    String z43 = f30Var.z4();
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    Long h03 = StringsKt.h0(uid);
                    Integer num = dVar.f115158e;
                    Short valueOf = num != null ? Short.valueOf((short) num.intValue()) : null;
                    f30 f30Var2 = dVar.f115156c;
                    String uid2 = f30Var2 != null ? f30Var2.getUid() : null;
                    String r53 = f30Var.r5();
                    h32.a0 a0Var = new h32.a0(h03, z43, null, valueOf, uid2, r53 != null ? StringsKt.h0(r53) : null);
                    Boolean bool = Boolean.FALSE;
                    dVar.getPinalytics().u(f1.COLLECTION_ITEM_REPIN, f30Var.getUid(), new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
                    return;
                }
                return;
        }
    }

    public final void f(wy0 wy0Var) {
        int i13 = this.f118797i;
        Object obj = this.f118798j;
        switch (i13) {
            case 8:
                Boolean Z3 = wy0Var.Z3();
                Intrinsics.checkNotNullExpressionValue(Z3, "getPartnershipOptIn(...)");
                ((rr.z) obj).f109723a.m(Z3.booleanValue() ? Navigation.w1((ScreenLocation) g1.f50817g.getValue()) : Navigation.w1((ScreenLocation) g1.f50816f.getValue()));
                return;
            default:
                et.b bVar = (et.b) ((ut.b) obj).getView();
                String profileId = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(profileId, "getUid(...)");
                ku.c cVar = (ku.c) bVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(profileId, "profileId");
                kt.a aVar = cVar.B0;
                if (aVar == null) {
                    Intrinsics.r("screenFactory");
                    throw null;
                }
                nl1.d b13 = aVar.b();
                NavigationImpl c13 = r41.k.c(r41.k.f106176a, profileId, r41.b.AdsProfile, null, null, 28);
                c13.Y1("PROFILE_SHOULD_ADD_BACKGROUND", true);
                c13.Y1("PROFILE_SHOULD_DISMISS_AS_OVERLAY", true);
                b13.R7(c13);
                w0 childFragmentManager = cVar.getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
                Intrinsics.checkNotNullExpressionValue(aVar2, "beginTransaction(...)");
                mo1.c.a(aVar2, mo1.a.DEFAULT);
                aVar2.g(ps.p.opaque_one_tap_bottom_sheet_module_container, b13, null, 1);
                aVar2.e(false);
                b13.Q7(true);
                return;
        }
    }

    public final void h(do1.x bind) {
        int i13 = this.f118797i;
        Object obj = this.f118798j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                lr.a aVar = (lr.a) obj;
                u50.i0 text = aVar.f84467g;
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f55704a = text;
                String str = aVar.f84468h;
                if (str != null) {
                    bind.f55705b = new do1.j(str);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String string = ((PinterestToastContainer) obj).getResources().getString(x0.board_invite_accepted_msg);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                u50.f0 text2 = bs1.c.h2(string);
                bind.getClass();
                Intrinsics.checkNotNullParameter(text2, "text");
                bind.f55704a = text2;
                bind.f55705b = new do1.l(new rm1.f(rm1.q.CHECK_CIRCLE, rm1.i.XL));
                bind.f55709f = 5000;
                u50.i0 text3 = bind.f55704a;
                do1.n variant = bind.f55707d;
                Intrinsics.checkNotNullParameter(text3, "text");
                Intrinsics.checkNotNullParameter(variant, "variant");
                break;
        }
    }

    public final void i(Throwable it) {
        int i13 = this.f118797i;
        Object obj = this.f118798j;
        switch (i13) {
            case 6:
                ServerError serverError = it instanceof ServerError ? (ServerError) it : null;
                v.f1 f1Var = serverError != null ? serverError.f45043a : null;
                if ((f1Var != null && f1Var.f123449b == 50) || (f1Var != null && f1Var.f123449b == 404)) {
                    ((qr.h) ((pd.s) obj).f99747a).t(null);
                    break;
                } else {
                    ((qr.h) ((pd.s) obj).f99747a).q();
                    break;
                }
                break;
            case 7:
                ((rr.d) obj).g();
                break;
            case 8:
            default:
                ((sr.i) obj).a(null);
                break;
            case 9:
                rr.b0 b0Var = (rr.b0) obj;
                b0Var.f109707i.i(rr.b0.g(b0Var, x0.oops_something_went_wrong));
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(it, "Error when getting work info list", tb0.p.IDEA_PINS_CREATION);
                break;
            case 10:
                o0 o0Var = (o0) obj;
                o0Var.f109796l.i(o0.g(o0Var, x0.oops_something_went_wrong));
                HashSet hashSet2 = tb0.h.f117076w;
                tb0.g.f117075a.q(it, "Error when getting work info list", tb0.p.IDEA_PINS_CREATION);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                ((q0) obj).f109723a.l(null);
                break;
            case 12:
                ((a1) obj).f109723a.q();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yk1.i iVar;
        int i13 = this.f118797i;
        int i14 = 4;
        Object obj2 = this.f118798j;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                DynamicFeed it = (DynamicFeed) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List a13 = it.a();
                Intrinsics.checkNotNullExpressionValue(a13, "getItems(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : a13) {
                    if (obj3 instanceof f30) {
                        arrayList.add(obj3);
                    }
                }
                ((ar.b) obj2).getClass();
                return new ar.c(CollectionsKt.y0(arrayList, 4));
            case 2:
                return b((rn1.a) obj);
            case 3:
                e((f30) obj);
                return Unit.f80348a;
            case 4:
                h((do1.x) obj);
                return Unit.f80348a;
            case 5:
                h((do1.x) obj);
                return Unit.f80348a;
            case 6:
                i((Throwable) obj);
                return Unit.f80348a;
            case 7:
                i((Throwable) obj);
                return Unit.f80348a;
            case 8:
                f((wy0) obj);
                return Unit.f80348a;
            case 9:
                i((Throwable) obj);
                return Unit.f80348a;
            case 10:
                i((Throwable) obj);
                return Unit.f80348a;
            case 11:
                i((Throwable) obj);
                return Unit.f80348a;
            case 12:
                i((Throwable) obj);
                return Unit.f80348a;
            case 13:
                i((Throwable) obj);
                return Unit.f80348a;
            case 14:
                ns.c it2 = (ns.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ns.d dVar = (ns.d) ((ns.h) obj2);
                return ns.c.e(it2, false, true, dVar.f91905a, dVar.f91906b, null, null, 49);
            case 15:
                j((l82.n) obj);
                return Unit.f80348a;
            case 16:
                ln1.l bind = (ln1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                se0.e eVar = se0.f.Companion;
                se0.f loadingState = ((vs.f) ((vs.h) obj2).f126484a).f126480a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(loadingState, "loadingState");
                int i15 = se0.d.f112382b[loadingState.ordinal()];
                if (i15 == 1) {
                    iVar = yk1.i.LOADING;
                } else if (i15 == 2) {
                    iVar = yk1.i.LOADED;
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = yk1.i.ERROR;
                }
                bind.b(iVar);
                bind.d(fm1.c.VISIBLE);
                return Unit.f80348a;
            case 17:
                j((l82.n) obj);
                return Unit.f80348a;
            case 18:
                j((l82.n) obj);
                return Unit.f80348a;
            case 19:
                j((l82.n) obj);
                return Unit.f80348a;
            case 20:
                return b((rn1.a) obj);
            case 21:
                xn1.j it3 = (xn1.j) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof xn1.a) {
                    ((co2.y) ((co2.z) obj2)).g(String.valueOf(((xn1.a) it3).f135436c));
                }
                return Unit.f80348a;
            case 22:
                v7 board = (v7) obj;
                bt.b bVar = (bt.b) ((rt.b) obj2).getView();
                Intrinsics.f(board);
                du.d dVar2 = (du.d) bVar;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(board, "board");
                g70.h hVar = dVar2.C0;
                if (hVar == null) {
                    Intrinsics.r("boardNavigator");
                    throw null;
                }
                du.c applyExtras = du.c.f56265i;
                wt.c customNavigation = new wt.c(dVar2, i14);
                g70.b override = g70.b.NONE;
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(override, "override");
                Intrinsics.checkNotNullParameter(applyExtras, "applyExtras");
                Intrinsics.checkNotNullParameter(customNavigation, "customNavigation");
                NavigationImpl c13 = hVar.c(board, override);
                applyExtras.invoke(c13);
                customNavigation.invoke(c13);
                return Unit.f80348a;
            case 23:
                e((f30) obj);
                return Unit.f80348a;
            case 24:
                e((f30) obj);
                return Unit.f80348a;
            case 25:
                f((wy0) obj);
                return Unit.f80348a;
            case 26:
                l((vt.r) obj);
                return Unit.f80348a;
            case 27:
                l((vt.r) obj);
                return Unit.f80348a;
            case 28:
                l((vt.r) obj);
                return Unit.f80348a;
            default:
                l((vt.r) obj);
                return Unit.f80348a;
        }
    }

    public final void j(l82.n start) {
        int i13 = this.f118797i;
        Object obj = this.f118798j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                p0 p0Var = (p0) obj;
                mb0.a aVar = (mb0.a) p0Var.f91951e.f63225b;
                start.a(aVar, new ns.o0(0), aVar.a());
                k92.l lVar = p0Var.f91949c;
                start.a(lVar, new ns.o0(1), lVar.a());
                zy.d0 d0Var = p0Var.f91950d;
                start.a(d0Var, new ns.o0(2), d0Var.a());
                break;
            case 16:
            default:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                mt.s sVar = (mt.s) obj;
                l82.n.b(start, sVar.f88125c);
                nu.b bVar = sVar.f88127e;
                start.a(bVar, new ns.o0(6), bVar.a());
                nt.q0 q0Var = sVar.f88126d;
                start.a(q0Var, new ns.o0(7), q0Var.a());
                sy.a a13 = sVar.f88128f.a(s92.i.PIN_CLOSEUP, s92.l.USER_NAVIGATION, d4.UNKNOWN_VIEW, null, true);
                start.a(a13, new ns.o0(8), a13.a());
                break;
            case 17:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, ((vs.h0) obj).f126486c);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                ws.a0 a0Var = (ws.a0) obj;
                l82.n.b(start, a0Var.f131038c);
                nu.b bVar2 = a0Var.f131040e;
                start.a(bVar2, new ns.o0(3), bVar2.a());
                xs.d0 d0Var2 = a0Var.f131039d;
                start.a(d0Var2, new ns.o0(4), d0Var2.a());
                sy.a a14 = a0Var.f131042g.a(s92.i.PIN_CLOSEUP, s92.l.USER_NAVIGATION, d4.UNKNOWN_VIEW, null, true);
                start.a(a14, new ns.o0(5), a14.a());
                break;
        }
    }

    public final void l(vt.r viewState) {
        InAppBrowserView inAppBrowserView;
        boolean z13;
        int i13;
        int i14;
        int i15 = 6;
        int i16 = this.f118797i;
        final int i17 = 1;
        final int i18 = 0;
        Object obj = this.f118798j;
        switch (i16) {
            case 26:
                Intrinsics.f(viewState);
                lu.f fVar = (lu.f) ((ft.a) obj);
                fVar.getClass();
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                boolean z14 = viewState instanceof vt.n;
                LinearLayout linearLayout = fVar.f53208j;
                if (!z14) {
                    if (viewState instanceof vt.p) {
                        fVar.z0(((vt.p) viewState).f126630f);
                        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new lu.e(fVar, 0));
                        return;
                    }
                    if (viewState instanceof vt.l) {
                        fVar.z0(((vt.l) viewState).f126613l);
                        fVar.f84890z = new q5.j(fVar.getContext(), new c1.a(fVar, 1));
                        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new lu.e(fVar, 0));
                        return;
                    } else if (viewState instanceof vt.m) {
                        fVar.z0(((vt.m) viewState).f126618d);
                        fVar.C(0);
                        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new lu.e(fVar, 1));
                        return;
                    } else {
                        if (!(viewState instanceof vt.q) || (inAppBrowserView = fVar.f35366r) == null) {
                            return;
                        }
                        inAppBrowserView.i(true);
                        return;
                    }
                }
                vt.n nVar = (vt.n) viewState;
                fVar.z0(nVar.f126623e);
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new lu.e(fVar, 0));
                Context context = fVar.getContext();
                FrameLayout frameLayout = fVar.f53200b;
                if (context == null || !pk.a0.q0(context)) {
                    d7.b.A0(frameLayout.getBackground(), nVar.f126619a);
                } else {
                    frameLayout.setBackground(bs1.c.f0(fVar, le0.c.ads_bottom_sheet_background_dark, null, null, 6));
                }
                Context context2 = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (m2.u1(context2)) {
                    z13 = false;
                } else {
                    z13 = false;
                    fVar.C(0);
                }
                InAppBrowserView inAppBrowserView2 = fVar.f35366r;
                if (inAppBrowserView2 != null) {
                    inAppBrowserView2.i(z13);
                    return;
                }
                return;
            case 27:
                Intrinsics.f(viewState);
                lu.n nVar2 = (lu.n) ((ft.d) obj);
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                vt.e adsQuizManager = nVar2.f84913c;
                if (b40.w0(adsQuizManager.f126577d)) {
                    lh0.g gVar = nVar2.f84916f;
                    if (gVar == null) {
                        Intrinsics.r("experiments");
                        throw null;
                    }
                    if (gVar.c()) {
                        nVar2.f84923m = ps.s.ads_sponsored_by;
                    }
                }
                boolean z15 = viewState instanceof vt.l;
                QuizCarouselIndexView quizCarouselIndexView = nVar2.f84921k;
                GestaltIconButton gestaltIconButton = nVar2.f84918h;
                ViewPager2 viewPager2 = nVar2.f84920j;
                if (z15) {
                    com.bumptech.glide.c.d0(gestaltIconButton);
                    bs1.c.X0(quizCarouselIndexView);
                    bs1.c.X0(viewPager2);
                    return;
                }
                boolean z16 = viewState instanceof vt.p;
                GestaltText gestaltText = nVar2.f84922l;
                if (z16) {
                    com.bumptech.glide.c.u1(gestaltIconButton);
                    quizCarouselIndexView.setVisibility(0);
                    viewPager2.setVisibility(0);
                    Context context3 = nVar2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    vt.p pVar = (vt.p) viewState;
                    pk.a0.q(gestaltText, bs1.c.h2(m2.C0(context3, nVar2.f84923m, pVar.f126628d)));
                    quizCarouselIndexView.f35382b = pVar.f126625a;
                    quizCarouselIndexView.invalidate();
                    int i19 = pVar.f126627c;
                    quizCarouselIndexView.a(i19);
                    viewPager2.i(i19, true);
                    if (i19 == 0) {
                        com.bumptech.glide.c.n0(gestaltIconButton);
                        return;
                    }
                    return;
                }
                if (Intrinsics.d(viewState, vt.o.f126624a)) {
                    com.bumptech.glide.c.d0(gestaltIconButton);
                    bs1.c.X0(quizCarouselIndexView);
                    bs1.c.X0(viewPager2);
                    return;
                }
                if (viewState instanceof vt.n) {
                    Context context4 = nVar2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    vt.n nVar3 = (vt.n) viewState;
                    pk.a0.q(gestaltText, bs1.c.h2(m2.C0(context4, nVar2.f84923m, nVar3.f126621c)));
                    bs1.c.U1(quizCarouselIndexView);
                    List answerOptions = nVar3.f126620b;
                    quizCarouselIndexView.f35382b = answerOptions.size();
                    quizCarouselIndexView.invalidate();
                    quizCarouselIndexView.a(0);
                    viewPager2.k(answerOptions.size());
                    Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
                    Intrinsics.checkNotNullParameter(answerOptions, "answerOptions");
                    lu.i0 i0Var = new lu.i0();
                    i0Var.f84906d = adsQuizManager;
                    i0Var.f84907e = answerOptions;
                    Intrinsics.checkNotNullParameter(i0Var, "<set-?>");
                    nVar2.f84919i = i0Var;
                    viewPager2.h(i0Var);
                    viewPager2.m(false);
                    viewPager2.setClipToPadding(false);
                    viewPager2.i(0, true);
                    lu.i0 i0Var2 = nVar2.f84919i;
                    if (i0Var2 == null) {
                        Intrinsics.r("adapter");
                        throw null;
                    }
                    lu.m radioButtonListener = new lu.m(nVar2);
                    Intrinsics.checkNotNullParameter(radioButtonListener, "radioButtonListener");
                    i0Var2.f84908f = radioButtonListener;
                    gestaltIconButton.u(new xo.k(nVar2, 21));
                    return;
                }
                return;
            case 28:
                Intrinsics.f(viewState);
                final lu.s sVar = (lu.s) ((ft.e) obj);
                sVar.getClass();
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                boolean z17 = viewState instanceof vt.l;
                PinterestVideoView pinterestVideoView = sVar.f84946r;
                WebImageView webImageView = sVar.f84941m;
                MaterialCardView materialCardView = sVar.f84940l;
                if (!z17) {
                    if (!(viewState instanceof vt.q) && !(viewState instanceof vt.m)) {
                        bs1.c.X0(webImageView);
                        if (materialCardView.indexOfChild(pinterestVideoView) != -1) {
                            materialCardView.removeView(pinterestVideoView);
                            pinterestVideoView.q0().u(pinterestVideoView);
                            return;
                        }
                        return;
                    }
                    bs1.c.X0(webImageView);
                    if (materialCardView.indexOfChild(pinterestVideoView) != -1) {
                        sVar.f84948t = pinterestVideoView.getB();
                        sVar.f84947s = pinterestVideoView.f();
                        materialCardView.removeView(pinterestVideoView);
                        pinterestVideoView.q0().u(pinterestVideoView);
                        return;
                    }
                    return;
                }
                vt.l lVar = (vt.l) viewState;
                vt.e eVar = sVar.f84932d;
                int i23 = lVar.f126609h;
                int i24 = lVar.f126610i;
                bc2.q videoTracks = lVar.f126611j;
                if (videoTracks != null) {
                    int j13 = hf0.b.j(sVar.getContext()) - bs1.c.W(sVar, ps.n.ads_quiz_small_devices_padding);
                    if (i24 == 0 || i23 == 0) {
                        i13 = j13;
                        i14 = i13;
                    } else if (i23 >= i24) {
                        i14 = (i24 * j13) / i23;
                        i13 = j13;
                    } else {
                        i13 = (i23 * j13) / i24;
                        i14 = j13;
                    }
                    ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = i14;
                    layoutParams.height = i13;
                    materialCardView.setLayoutParams(layoutParams);
                    materialCardView.addView(pinterestVideoView);
                    pinterestVideoView.q0().o(pinterestVideoView);
                    h32.i0 p13 = eVar.f126574a.p();
                    String uid = lVar.f126602a;
                    if (uid == null) {
                        uid = "ads-quiz";
                    }
                    d4 d4Var = p13 != null ? p13.f67081a : null;
                    a4 a4Var = p13 != null ? p13.f67082b : null;
                    Intrinsics.checkNotNullParameter(uid, "uid");
                    Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
                    oc2.i.g(sVar.f84946r, new bc2.k(uid, videoTracks.a(), d4Var, a4Var, videoTracks, null), null, 6);
                    pinterestVideoView.R(true);
                    pinterestVideoView.setClickable(true);
                    bf.b.w(pinterestVideoView.f18945j);
                    pinterestVideoView.f18955t = true;
                    pinterestVideoView.G();
                    pinterestVideoView.O(true);
                    pinterestVideoView.P(sVar.f84948t);
                    if (sVar.f84947s) {
                        pinterestVideoView.play();
                    } else {
                        oc2.i.a(pinterestVideoView);
                    }
                    bs1.c.U1(pinterestVideoView);
                    SimplePlayerControlView simplePlayerControlView = pinterestVideoView.F;
                    if (simplePlayerControlView != null) {
                        bs1.c.b1(simplePlayerControlView.f52785h0);
                        bs1.c.b1(simplePlayerControlView.f52786i0);
                        bs1.c.b1(simplePlayerControlView.f52787j0);
                    }
                } else {
                    double j14 = i24 / hf0.b.j(sVar.getContext());
                    if (i24 >= hf0.b.j(sVar.getContext())) {
                        i24 = hf0.b.j(sVar.getContext()) - bs1.c.W(sVar, ps.n.ads_quiz_small_devices_padding);
                        i23 = (int) ((i23 / j14) - bs1.c.W(sVar, ps.n.ads_quiz_small_devices_padding));
                    }
                    bs1.c.U1(webImageView);
                    ViewGroup.LayoutParams layoutParams2 = materialCardView.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.width = i24;
                    layoutParams2.height = i23;
                    materialCardView.setLayoutParams(layoutParams2);
                    webImageView.loadUrl(lVar.f126607f);
                    webImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }
                GestaltIconButton gestaltIconButton2 = sVar.f84937i;
                com.bumptech.glide.c.u1(gestaltIconButton2);
                sVar.f84938j.i(lu.a.f84853t);
                if (b40.w0(eVar.f126577d)) {
                    lh0.g gVar2 = sVar.f84935g;
                    if (gVar2 == null) {
                        Intrinsics.r("experiments");
                        throw null;
                    }
                    if (gVar2.c()) {
                        sVar.f84949u = ps.s.ads_sponsored_by;
                    }
                }
                sVar.f84945q.i(new lu.q(sVar, viewState));
                webImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                GestaltText gestaltText2 = sVar.f84942n;
                String str = lVar.f126605d;
                if (str == null || str.length() == 0) {
                    pk.a0.k0(gestaltText2);
                } else {
                    gestaltText2.i(new lu.r(viewState, 0));
                }
                GestaltText gestaltText3 = sVar.f84943o;
                String str2 = lVar.f126606e;
                if (str2 == null || str2.length() == 0) {
                    pk.a0.k0(gestaltText3);
                    gestaltText2.i(lu.a.f84854u);
                } else {
                    gestaltText3.i(new lu.r(viewState, 1));
                }
                lu.q qVar = new lu.q(viewState, sVar);
                GestaltButton gestaltButton = sVar.f84944p;
                gestaltButton.d(qVar);
                final int i25 = 0;
                gestaltIconButton2.u(new gm1.a() { // from class: lu.p
                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        vt.i iVar;
                        vt.i iVar2;
                        vt.e eVar2;
                        f30 f30Var;
                        z90 Z5;
                        List g13;
                        ge0 ge0Var;
                        String g14;
                        f30 f30Var2;
                        vt.i iVar3;
                        vt.c cVar;
                        z90 Z52;
                        List g15;
                        ge0 ge0Var2;
                        int i26 = i25;
                        s this$0 = sVar;
                        switch (i26) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (iVar = this$0.f84936h) != null) {
                                    iVar.f126600a.d();
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (iVar2 = this$0.f84936h) != null && (f30Var = (eVar2 = iVar2.f126600a).f126577d) != null && (Z5 = f30Var.Z5()) != null && (g13 = Z5.g()) != null && (ge0Var = (ge0) g13.get(eVar2.f126590q)) != null && (g14 = ge0Var.g()) != null && (f30Var2 = (f30) eVar2.f126576c.get(g14)) != null) {
                                    eVar2.f126583j.c(f30Var2);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof xl1.a) && (iVar3 = this$0.f84936h) != null) {
                                    vt.e eVar3 = iVar3.f126600a;
                                    f30 f30Var3 = eVar3.f126577d;
                                    String str3 = null;
                                    String f13 = (f30Var3 == null || (Z52 = f30Var3.Z5()) == null || (g15 = Z52.g()) == null || (ge0Var2 = (ge0) g15.get(eVar3.f126590q)) == null) ? null : ge0Var2.f();
                                    List list = eVar3.f126578e;
                                    String str4 = (list == null || (cVar = (vt.c) list.get(eVar3.f126590q)) == null) ? null : cVar.f126572h;
                                    if (vt.e.h(f13)) {
                                        str3 = f13;
                                    } else if (vt.e.h(str4)) {
                                        str3 = str4;
                                    } else {
                                        f30 f30Var4 = eVar3.f126577d;
                                        if (f30Var4 != null) {
                                            str3 = f30Var4.y4();
                                        }
                                    }
                                    eVar3.j(new vt.q(str3, eVar3.f()));
                                    vt.l lVar2 = eVar3.f126591r;
                                    if (lVar2 != null) {
                                        f30 f30Var5 = eVar3.f126577d;
                                        if (f30Var5 != null) {
                                            nc2.h hVar = nc2.h.f90405a;
                                            String uid2 = f30Var5.getUid();
                                            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                            lVar2.f126612k = nc2.h.a(uid2).f90409a;
                                            lVar2.f126614m = true;
                                        }
                                        eVar3.j(lVar2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                final int i26 = 1;
                sVar.f84939k.u(new gm1.a() { // from class: lu.p
                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        vt.i iVar;
                        vt.i iVar2;
                        vt.e eVar2;
                        f30 f30Var;
                        z90 Z5;
                        List g13;
                        ge0 ge0Var;
                        String g14;
                        f30 f30Var2;
                        vt.i iVar3;
                        vt.c cVar;
                        z90 Z52;
                        List g15;
                        ge0 ge0Var2;
                        int i262 = i26;
                        s this$0 = sVar;
                        switch (i262) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (iVar = this$0.f84936h) != null) {
                                    iVar.f126600a.d();
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (iVar2 = this$0.f84936h) != null && (f30Var = (eVar2 = iVar2.f126600a).f126577d) != null && (Z5 = f30Var.Z5()) != null && (g13 = Z5.g()) != null && (ge0Var = (ge0) g13.get(eVar2.f126590q)) != null && (g14 = ge0Var.g()) != null && (f30Var2 = (f30) eVar2.f126576c.get(g14)) != null) {
                                    eVar2.f126583j.c(f30Var2);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof xl1.a) && (iVar3 = this$0.f84936h) != null) {
                                    vt.e eVar3 = iVar3.f126600a;
                                    f30 f30Var3 = eVar3.f126577d;
                                    String str3 = null;
                                    String f13 = (f30Var3 == null || (Z52 = f30Var3.Z5()) == null || (g15 = Z52.g()) == null || (ge0Var2 = (ge0) g15.get(eVar3.f126590q)) == null) ? null : ge0Var2.f();
                                    List list = eVar3.f126578e;
                                    String str4 = (list == null || (cVar = (vt.c) list.get(eVar3.f126590q)) == null) ? null : cVar.f126572h;
                                    if (vt.e.h(f13)) {
                                        str3 = f13;
                                    } else if (vt.e.h(str4)) {
                                        str3 = str4;
                                    } else {
                                        f30 f30Var4 = eVar3.f126577d;
                                        if (f30Var4 != null) {
                                            str3 = f30Var4.y4();
                                        }
                                    }
                                    eVar3.j(new vt.q(str3, eVar3.f()));
                                    vt.l lVar2 = eVar3.f126591r;
                                    if (lVar2 != null) {
                                        f30 f30Var5 = eVar3.f126577d;
                                        if (f30Var5 != null) {
                                            nc2.h hVar = nc2.h.f90405a;
                                            String uid2 = f30Var5.getUid();
                                            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                            lVar2.f126612k = nc2.h.a(uid2).f90409a;
                                            lVar2.f126614m = true;
                                        }
                                        eVar3.j(lVar2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                final int i27 = 2;
                gestaltButton.e(new gm1.a() { // from class: lu.p
                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        vt.i iVar;
                        vt.i iVar2;
                        vt.e eVar2;
                        f30 f30Var;
                        z90 Z5;
                        List g13;
                        ge0 ge0Var;
                        String g14;
                        f30 f30Var2;
                        vt.i iVar3;
                        vt.c cVar;
                        z90 Z52;
                        List g15;
                        ge0 ge0Var2;
                        int i262 = i27;
                        s this$0 = sVar;
                        switch (i262) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (iVar = this$0.f84936h) != null) {
                                    iVar.f126600a.d();
                                    break;
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof om1.l) && (iVar2 = this$0.f84936h) != null && (f30Var = (eVar2 = iVar2.f126600a).f126577d) != null && (Z5 = f30Var.Z5()) != null && (g13 = Z5.g()) != null && (ge0Var = (ge0) g13.get(eVar2.f126590q)) != null && (g14 = ge0Var.g()) != null && (f30Var2 = (f30) eVar2.f126576c.get(g14)) != null) {
                                    eVar2.f126583j.c(f30Var2);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((it instanceof xl1.a) && (iVar3 = this$0.f84936h) != null) {
                                    vt.e eVar3 = iVar3.f126600a;
                                    f30 f30Var3 = eVar3.f126577d;
                                    String str3 = null;
                                    String f13 = (f30Var3 == null || (Z52 = f30Var3.Z5()) == null || (g15 = Z52.g()) == null || (ge0Var2 = (ge0) g15.get(eVar3.f126590q)) == null) ? null : ge0Var2.f();
                                    List list = eVar3.f126578e;
                                    String str4 = (list == null || (cVar = (vt.c) list.get(eVar3.f126590q)) == null) ? null : cVar.f126572h;
                                    if (vt.e.h(f13)) {
                                        str3 = f13;
                                    } else if (vt.e.h(str4)) {
                                        str3 = str4;
                                    } else {
                                        f30 f30Var4 = eVar3.f126577d;
                                        if (f30Var4 != null) {
                                            str3 = f30Var4.y4();
                                        }
                                    }
                                    eVar3.j(new vt.q(str3, eVar3.f()));
                                    vt.l lVar2 = eVar3.f126591r;
                                    if (lVar2 != null) {
                                        f30 f30Var5 = eVar3.f126577d;
                                        if (f30Var5 != null) {
                                            nc2.h hVar = nc2.h.f90405a;
                                            String uid2 = f30Var5.getUid();
                                            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                            lVar2.f126612k = nc2.h.a(uid2).f90409a;
                                            lVar2.f126614m = true;
                                        }
                                        eVar3.j(lVar2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                return;
            default:
                Intrinsics.f(viewState);
                final lu.v vVar = (lu.v) ((ft.f) obj);
                vVar.getClass();
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                if (viewState instanceof vt.m) {
                    GestaltIconButton gestaltIconButton3 = vVar.f84959h;
                    com.bumptech.glide.c.u1(gestaltIconButton3);
                    gestaltIconButton3.u(new gm1.a() { // from class: lu.u
                        @Override // gm1.a
                        public final void h3(gm1.c it) {
                            vt.j jVar;
                            vt.j jVar2;
                            int i28 = i18;
                            v this$0 = vVar;
                            switch (i28) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if ((it instanceof om1.l) && (jVar = this$0.f84958g) != null) {
                                        jVar.f126601a.a();
                                        break;
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if ((it instanceof xl1.a) && (jVar2 = this$0.f84958g) != null) {
                                        vt.e eVar2 = jVar2.f126601a;
                                        if (eVar2.f126591r == null) {
                                            eVar2.k();
                                            break;
                                        } else {
                                            eVar2.b(h32.g0.AD_QUIZ_PIN_RESULT, u0.QUIZ_PIN_RESULT, f1.QUIZ_PIN_RESULT_OPEN);
                                            vt.l lVar2 = eVar2.f126591r;
                                            if (lVar2 != null) {
                                                f30 f30Var = eVar2.f126577d;
                                                if (f30Var != null) {
                                                    nc2.h hVar = nc2.h.f90405a;
                                                    String uid2 = f30Var.getUid();
                                                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                                    lVar2.f126612k = nc2.h.a(uid2).f90409a;
                                                    lVar2.f126614m = false;
                                                }
                                                eVar2.j(lVar2);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    QuizCarouselIndexView quizCarouselIndexView2 = vVar.f84960i;
                    bs1.c.U1(quizCarouselIndexView2);
                    int i28 = ((vt.m) viewState).f126615a;
                    quizCarouselIndexView2.f35382b = i28;
                    quizCarouselIndexView2.invalidate();
                    quizCarouselIndexView2.a(i28);
                    GestaltText gestaltText4 = vVar.f84963l;
                    pk.a0.k0(gestaltText4);
                    if (b40.w0(vVar.f84954c.f126577d)) {
                        lh0.g gVar3 = vVar.f84957f;
                        if (gVar3 == null) {
                            Intrinsics.r("experiments");
                            throw null;
                        }
                        if (gVar3.c()) {
                            vVar.f84964m = ps.s.ads_sponsored_by;
                        }
                    }
                    gestaltText4.i(new hs.a(13, vVar, viewState));
                    vVar.f84961j.i(new wt.c(vVar, i15));
                    GestaltButton gestaltButton2 = vVar.f84962k;
                    pk.a0.v1(gestaltButton2);
                    gestaltButton2.e(new gm1.a() { // from class: lu.u
                        @Override // gm1.a
                        public final void h3(gm1.c it) {
                            vt.j jVar;
                            vt.j jVar2;
                            int i282 = i17;
                            v this$0 = vVar;
                            switch (i282) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if ((it instanceof om1.l) && (jVar = this$0.f84958g) != null) {
                                        jVar.f126601a.a();
                                        break;
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if ((it instanceof xl1.a) && (jVar2 = this$0.f84958g) != null) {
                                        vt.e eVar2 = jVar2.f126601a;
                                        if (eVar2.f126591r == null) {
                                            eVar2.k();
                                            break;
                                        } else {
                                            eVar2.b(h32.g0.AD_QUIZ_PIN_RESULT, u0.QUIZ_PIN_RESULT, f1.QUIZ_PIN_RESULT_OPEN);
                                            vt.l lVar2 = eVar2.f126591r;
                                            if (lVar2 != null) {
                                                f30 f30Var = eVar2.f126577d;
                                                if (f30Var != null) {
                                                    nc2.h hVar = nc2.h.f90405a;
                                                    String uid2 = f30Var.getUid();
                                                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                                    lVar2.f126612k = nc2.h.a(uid2).f90409a;
                                                    lVar2.f126614m = false;
                                                }
                                                eVar2.j(lVar2);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }
}
