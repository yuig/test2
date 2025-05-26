package fs0;

import android.view.View;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import h32.c1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import jk2.e0;
import jk2.n0;
import k1.b0;
import kotlin.jvm.internal.Intrinsics;
import lh0.l1;
import lh0.s2;
import lh0.z3;
import lq0.g1;
import nx.d0;
import nx.d1;
import so.b9;
import so.x;
import so.y;
import ta0.f0;
import x02.i2;
import x02.v1;
import x02.x0;
import x02.x2;

/* loaded from: classes5.dex */
public final class w extends yk1.c implements cs0.f {
    public final y A;
    public final androidx.camera.core.impl.j B;
    public final f0 C;
    public final b9 D;
    public final es.a E;
    public final s2 F;
    public g0 G;
    public c1 H;
    public String I;

    /* renamed from: J, reason: collision with root package name */
    public String f62901J;
    public String K;
    public String L;
    public String M;
    public wy0 N;
    public wy0 O;
    public String P;
    public Boolean Q;
    public as0.a R;
    public HashMap S;
    public final js0.a T;

    /* renamed from: a, reason: collision with root package name */
    public final i2 f62902a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f62903b;

    /* renamed from: c, reason: collision with root package name */
    public final v1 f62904c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f62905d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f62906e;

    /* renamed from: f, reason: collision with root package name */
    public final bs0.c f62907f;

    /* renamed from: g, reason: collision with root package name */
    public final yk1.v f62908g;

    /* renamed from: h, reason: collision with root package name */
    public final mo1.d f62909h;

    /* renamed from: i, reason: collision with root package name */
    public final js0.a f62910i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f62911j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f62912k;

    /* renamed from: l, reason: collision with root package name */
    public final nu1.a f62913l;

    /* renamed from: m, reason: collision with root package name */
    public final i92.k f62914m;

    /* renamed from: n, reason: collision with root package name */
    public final il1.a f62915n;

    /* renamed from: o, reason: collision with root package name */
    public final wk2.a f62916o;

    /* renamed from: p, reason: collision with root package name */
    public final x10.b f62917p;

    /* renamed from: q, reason: collision with root package name */
    public final k22.m f62918q;

    /* renamed from: r, reason: collision with root package name */
    public final x f62919r;

    /* renamed from: s, reason: collision with root package name */
    public final so.v f62920s;

    /* renamed from: t, reason: collision with root package name */
    public final nk1.l f62921t;

    /* renamed from: u, reason: collision with root package name */
    public final z70.m f62922u;

    /* renamed from: v, reason: collision with root package name */
    public final com.pinterest.feature.pin.r f62923v;

    /* renamed from: w, reason: collision with root package name */
    public final View f62924w;

    /* renamed from: x, reason: collision with root package name */
    public final k11.p f62925x;

    /* renamed from: y, reason: collision with root package name */
    public final l1 f62926y;

    /* renamed from: z, reason: collision with root package name */
    public final c2 f62927z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(uk1.d pinalytics, uj2.q networkStateStream, i2 pinRepository, x2 userRepository, v1 interestRepository, x0 boardRepository, m60.w eventManager, bs0.c hidePinInteractor, yk1.v resources, mo1.d intentHelper, js0.a hideRemoteRequest, boolean z13, d1 trackingParamAttacher, nu1.a inAppNavigator, i92.k toastUtils, il1.a fragmentFactory, bf2.d boardRouterProvider, x10.b pinApiService, k22.m userApiService, x pinFeedbackModalFactory, so.v inviteCodeHandlerFactory, nk1.l userFollowConfirmationProvider, z70.m chromeTabHelper, com.pinterest.feature.pin.r repinAnimationUtil, View view, k11.p repinUtils, l1 gridActionExperiments, c2 sharesheetUtils, y pinImageDownloaderFactory, androidx.camera.core.impl.j repinHelper, f0 collageDuplicateHelper, b9 weightLossOptOutModalFactory, es.a adFormats, s2 pinLibraryExperiments) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(interestRepository, "interestRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(hidePinInteractor, "hidePinInteractor");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        Intrinsics.checkNotNullParameter(hideRemoteRequest, "hideRemoteRequest");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(boardRouterProvider, "boardRouterProvider");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(userApiService, "userApiService");
        Intrinsics.checkNotNullParameter(pinFeedbackModalFactory, "pinFeedbackModalFactory");
        Intrinsics.checkNotNullParameter(inviteCodeHandlerFactory, "inviteCodeHandlerFactory");
        Intrinsics.checkNotNullParameter(userFollowConfirmationProvider, "userFollowConfirmationProvider");
        Intrinsics.checkNotNullParameter(chromeTabHelper, "chromeTabHelper");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(repinUtils, "repinUtils");
        Intrinsics.checkNotNullParameter(gridActionExperiments, "gridActionExperiments");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(pinImageDownloaderFactory, "pinImageDownloaderFactory");
        Intrinsics.checkNotNullParameter(repinHelper, "repinHelper");
        Intrinsics.checkNotNullParameter(collageDuplicateHelper, "collageDuplicateHelper");
        Intrinsics.checkNotNullParameter(weightLossOptOutModalFactory, "weightLossOptOutModalFactory");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinLibraryExperiments, "pinLibraryExperiments");
        this.f62902a = pinRepository;
        this.f62903b = userRepository;
        this.f62904c = interestRepository;
        this.f62905d = boardRepository;
        this.f62906e = eventManager;
        this.f62907f = hidePinInteractor;
        this.f62908g = resources;
        this.f62909h = intentHelper;
        this.f62910i = hideRemoteRequest;
        this.f62911j = z13;
        this.f62912k = trackingParamAttacher;
        this.f62913l = inAppNavigator;
        this.f62914m = toastUtils;
        this.f62915n = fragmentFactory;
        this.f62916o = boardRouterProvider;
        this.f62917p = pinApiService;
        this.f62918q = userApiService;
        this.f62919r = pinFeedbackModalFactory;
        this.f62920s = inviteCodeHandlerFactory;
        this.f62921t = userFollowConfirmationProvider;
        this.f62922u = chromeTabHelper;
        this.f62923v = repinAnimationUtil;
        this.f62924w = view;
        this.f62925x = repinUtils;
        this.f62926y = gridActionExperiments;
        this.f62927z = sharesheetUtils;
        this.A = pinImageDownloaderFactory;
        this.B = repinHelper;
        this.C = collageDuplicateHelper;
        this.D = weightLossOptOutModalFactory;
        this.E = adFormats;
        this.F = pinLibraryExperiments;
        this.T = new js0.a(pinApiService, 1);
    }

    public static final HashMap q3(w wVar, f30 f30Var) {
        HashMap o13 = ep.b.o("is_third_party_ad", "true");
        String e13 = ((es.c) wVar.E).e(f30Var);
        if (e13 != null) {
            o13.put("ad_unit_ids", e13);
        }
        return o13;
    }

    public static final void r3(w wVar) {
        wVar.f62914m.h(m60.x0.generic_error);
    }

    public static final void s3(w wVar, String str) {
        z70.m.f(wVar.f62922u, str, null, null, null, true, null, null, false, null, false, true, null, false, null, new t(wVar, 2), 15232);
    }

    public static final uj2.l t3(w wVar, f30 f30Var, boolean z13) {
        boolean booleanValue;
        boolean booleanValue2;
        wVar.getClass();
        String D = com.bumptech.glide.c.D(f30Var);
        if (D == null) {
            D = "";
        }
        String str = D;
        if (b40.t0(f30Var)) {
            booleanValue = !z13;
        } else {
            Boolean Q3 = f30Var.Q3();
            Intrinsics.checkNotNullExpressionValue(Q3, "getCommentsDisabled(...)");
            booleanValue = Q3.booleanValue();
        }
        if (b40.u0(f30Var)) {
            booleanValue2 = !z13;
        } else {
            Boolean e43 = f30Var.e4();
            Intrinsics.checkNotNullExpressionValue(e43, "getDidItDisabled(...)");
            booleanValue2 = e43.booleanValue();
        }
        return c0.d.L(wVar.f62902a, f30Var, str, booleanValue, booleanValue2, 7406);
    }

    public final void B3() {
        d0 pinalytics = getPinalytics();
        u0 u0Var = u0.PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST;
        g0 g0Var = g0.OVERFLOW_MENU;
        String str = this.K;
        if (str == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        int i13 = 0;
        byte b13 = 0;
        pinalytics.b0(u0Var, g0Var, str, false);
        clearDisposables();
        String str2 = this.K;
        if (str2 == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        uj2.q L = this.f62902a.L(str2);
        bv0.k kVar = new bv0.k(16, h.f62846o);
        int i14 = 2;
        xj2.c F = new n0(new jk2.x(L, kVar, i14), new wr0.l(7, new u(this, i13)), b13 == true ? 1 : 0, i14).F(new o(27, new u(this, 1)), new o(28, new u(this, i14)), ck2.i.f27923c, ck2.i.f27924d);
        if (isBound()) {
            addDisposable(F);
        }
    }

    public final void D3() {
        d0 pinalytics = getPinalytics();
        u0 u0Var = u0.PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER;
        g0 g0Var = g0.OVERFLOW_MENU;
        String str = this.K;
        if (str == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        pinalytics.b0(u0Var, g0Var, str, false);
        String str2 = this.K;
        if (str2 == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        xj2.c o13 = new kk2.m(new kk2.m(this.f62902a.P(str2).s(), new wr0.l(8, new u(this, 3)), 0), new wr0.l(9, new u(this, 4)), 0).o(new o(29, new u(this, 5)), new q(0, new u(this, 6)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        if (isBound()) {
            addDisposable(o13);
        }
    }

    public final void F3(l32.f fVar, u0 u0Var) {
        d0 pinalytics = getPinalytics();
        u0 u0Var2 = u0.PIN_HIDE_BUTTON;
        g0 g0Var = g0.OVERFLOW_MENU;
        String str = this.K;
        if (str == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        pinalytics.b0(u0Var2, g0Var, str, false);
        String str2 = this.K;
        if (str2 == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        ek2.f i13 = new ik2.f(this.f62902a.P(str2).H(tk2.e.f118017c).I(1L), new wr0.l(6, new u(this, 7))).h(wj2.c.a()).i(new xo.c(this, fVar, u0Var, 11), new o(3, new u(this, 8)));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        if (isBound()) {
            addDisposable(i13);
        }
    }

    public final void u3() {
        this.f62906e.d(new jc0.s(true, 0));
    }

    public final void v3(String str, jo1.a aVar, boolean z13) {
        h32.x2 x2Var;
        c1 c1Var = this.H;
        String str2 = null;
        if (c1Var != null && (x2Var = c1Var.H) != null && x2Var.f67392a != null) {
            String str3 = x2Var.f67393b;
            if (str3 != null) {
                if (str3.length() == 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    str2 = str3;
                }
            }
            Long l13 = x2Var.f67394c;
            if (l13 != null) {
                str2 = l13.toString();
            }
        }
        xj2.c o13 = this.f62902a.L(str).s().o(new o(17, new b0((Object) this, z13, (Object) aVar, str2, 6)), new o(18, new s(this, 0)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        if (isBound()) {
            addDisposable(o13);
        }
    }

    public final ik2.i w3(l32.c cVar) {
        String str = this.K;
        if (str == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        ik2.i iVar = new ik2.i(this.f62902a.L(str).n(), new wr0.l(11, new g1(6, this, cVar)));
        Intrinsics.checkNotNullExpressionValue(iVar, "switchMapSingle(...)");
        return iVar;
    }

    @Override // yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(cs0.g view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        gs0.o oVar = (gs0.o) view;
        jo1.a aVar = jo1.a.FOLLOWING_FEED;
        jo1.a aVar2 = oVar.f66056d;
        int i13 = 10;
        if (((aVar2 == aVar || aVar2 == jo1.a.HOMEFEED || aVar2 == jo1.a.PROMOTED_SPOTLIGHT) ? false : true) && Intrinsics.d(this.Q, Boolean.FALSE)) {
            String str = this.K;
            if (str == null) {
                Intrinsics.r("pinUid");
                throw null;
            }
            z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
            l1 l1Var = this.f62926y;
            boolean a13 = l1Var.a("enabled_5_boards", z3Var);
            yk1.v vVar = this.f62908g;
            kh2.j.y2(str, vVar, a13 ? 5 : l1Var.a("enabled_7_boards", z3Var) ? 7 : l1Var.a("enabled_10_boards", z3Var) ? 10 : l1Var.a("enabled_12_boards", z3Var) ? 12 : ((yk1.a) vVar).f139224a.getInteger(m60.u0.board_picker_page_count));
        }
        boolean D = oVar.D();
        ck2.c cVar = ck2.i.f27923c;
        if (D) {
            String str2 = this.K;
            if (str2 == null) {
                Intrinsics.r("pinUid");
                throw null;
            }
            xj2.c F = this.f62902a.P(str2).F(new q(5, new u(this, 9)), new q(6, new u(this, i13)), cVar, ck2.i.f27924d);
            if (isBound()) {
                addDisposable(F);
            }
        }
        String str3 = this.M;
        if (str3 != null) {
            e0 M = this.f62903b.M(str3);
            hk2.b bVar = new hk2.b(new uq0.c(29, new g1(7, this, view)), new o(0, h.f62843l), cVar);
            M.f(bVar);
            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
            addDisposable(bVar);
        }
    }

    public final void z3() {
        d0 pinalytics = getPinalytics();
        u0 u0Var = u0.PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD;
        g0 g0Var = g0.OVERFLOW_MENU;
        String str = this.K;
        if (str == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        pinalytics.b0(u0Var, g0Var, str, false);
        String str2 = this.K;
        if (str2 == null) {
            Intrinsics.r("pinUid");
            throw null;
        }
        xj2.c F = this.f62902a.L(str2).n().F(new o(4, new s(this, 28)), new o(5, new s(this, 29)), ck2.i.f27923c, ck2.i.f27924d);
        if (isBound()) {
            addDisposable(F);
        }
    }
}
