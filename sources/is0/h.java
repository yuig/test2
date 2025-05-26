package is0;

import bv0.k;
import ck2.i;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.oc0;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.y1;
import dl1.t;
import h32.g0;
import h32.u0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jk2.j1;
import jk2.x;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import lh0.m1;
import lq0.g1;
import m60.w;
import nx.d0;
import nx.d1;
import uj2.q;
import wa2.p;
import x02.a2;
import x02.i2;
import x02.v1;
import x02.x0;
import x02.x2;
import yk1.r;
import yk1.v;

/* loaded from: classes5.dex */
public final class h extends yk1.c implements hs0.a {
    public static final Set B = h1.f(p.STATE_UNFOLLOWED_USER, p.STATE_UNFOLLOWED_INTEREST, p.STATE_UNFOLLOWED_BOARD, p.STATE_FILTER_BOARD_PINS, p.STATE_FILTER_PIN);
    public final Set A;

    /* renamed from: a, reason: collision with root package name */
    public final w f73543a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f73544b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f73545c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f73546d;

    /* renamed from: e, reason: collision with root package name */
    public final t f73547e;

    /* renamed from: f, reason: collision with root package name */
    public final v f73548f;

    /* renamed from: g, reason: collision with root package name */
    public final jo1.a f73549g;

    /* renamed from: h, reason: collision with root package name */
    public final com.pinterest.hairball.network.e f73550h;

    /* renamed from: i, reason: collision with root package name */
    public final x10.b f73551i;

    /* renamed from: j, reason: collision with root package name */
    public final js0.c f73552j;

    /* renamed from: k, reason: collision with root package name */
    public final js0.a f73553k;

    /* renamed from: l, reason: collision with root package name */
    public final js0.a f73554l;

    /* renamed from: m, reason: collision with root package name */
    public final js0.a f73555m;

    /* renamed from: n, reason: collision with root package name */
    public final js0.a f73556n;

    /* renamed from: o, reason: collision with root package name */
    public final js0.a f73557o;

    /* renamed from: p, reason: collision with root package name */
    public final js0.a f73558p;

    /* renamed from: q, reason: collision with root package name */
    public final Map f73559q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f73560r;

    /* renamed from: s, reason: collision with root package name */
    public final d1 f73561s;

    /* renamed from: t, reason: collision with root package name */
    public final es.a f73562t;

    /* renamed from: u, reason: collision with root package name */
    public final m1 f73563u;

    /* renamed from: v, reason: collision with root package name */
    public ls0.f f73564v;

    /* renamed from: w, reason: collision with root package name */
    public p f73565w;

    /* renamed from: x, reason: collision with root package name */
    public f30 f73566x;

    /* renamed from: y, reason: collision with root package name */
    public final a f73567y;

    /* renamed from: z, reason: collision with root package name */
    public final Set f73568z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uk1.d presenterPinalytics, q networkStateStream, w eventManager, i2 pinRepository, x2 userRepository, x0 boardRepository, v1 interestRepository, v resources, jo1.a fragmentType, com.pinterest.hairball.network.e undoHideSearchRequest, x10.b pinApiService, boolean z13, d1 trackingParamAttacher, es.a adFormats, m1 gridActionsParamsExperiments) {
        super(presenterPinalytics, networkStateStream);
        js0.c undoHidePfyPin = new js0.c(pinApiService);
        js0.a undoHidePromotedPin = new js0.a(pinApiService, 5);
        js0.a unhideRelatedPin = new js0.a(pinApiService, 7);
        js0.a undoHideThirdPartyAd = new js0.a(pinApiService, 6);
        js0.a notForMeFeedback = new js0.a(pinApiService, 3);
        js0.a lowQualityFeedback = new js0.a(pinApiService, 2);
        js0.a promotedPinHideFeedback = new js0.a(pinApiService, 4);
        LinkedHashMap pinFeedbackStateUpdates = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(interestRepository, "interestRepository");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(fragmentType, "fragmentType");
        Intrinsics.checkNotNullParameter(undoHideSearchRequest, "undoHideSearchRequest");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(undoHidePfyPin, "undoHidePfyPin");
        Intrinsics.checkNotNullParameter(undoHidePromotedPin, "undoHidePromotedPin");
        Intrinsics.checkNotNullParameter(unhideRelatedPin, "unhideRelatedPin");
        Intrinsics.checkNotNullParameter(undoHideThirdPartyAd, "undoHideThirdPartyAd");
        Intrinsics.checkNotNullParameter(notForMeFeedback, "notForMeFeedback");
        Intrinsics.checkNotNullParameter(lowQualityFeedback, "lowQualityFeedback");
        Intrinsics.checkNotNullParameter(promotedPinHideFeedback, "promotedPinHideFeedback");
        Intrinsics.checkNotNullParameter(pinFeedbackStateUpdates, "pinFeedbackStateUpdates");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(gridActionsParamsExperiments, "gridActionsParamsExperiments");
        this.f73543a = eventManager;
        this.f73544b = pinRepository;
        this.f73545c = userRepository;
        this.f73546d = boardRepository;
        this.f73547e = interestRepository;
        this.f73548f = resources;
        this.f73549g = fragmentType;
        this.f73550h = undoHideSearchRequest;
        this.f73551i = pinApiService;
        this.f73552j = undoHidePfyPin;
        this.f73553k = undoHidePromotedPin;
        this.f73554l = unhideRelatedPin;
        this.f73555m = undoHideThirdPartyAd;
        this.f73556n = notForMeFeedback;
        this.f73557o = lowQualityFeedback;
        this.f73558p = promotedPinHideFeedback;
        this.f73559q = pinFeedbackStateUpdates;
        this.f73560r = z13;
        this.f73561s = trackingParamAttacher;
        this.f73562t = adFormats;
        this.f73563u = gridActionsParamsExperiments;
        this.f73565w = p.STATE_REPORTED;
        this.f73567y = new a(this, 1);
        this.f73568z = h1.f(ls0.g.UNFOLLOW_BOARD, ls0.g.UNFOLLOW_BOARD_USER, ls0.g.UNFOLLOW_TOPIC, ls0.g.UNFOLLOW_USER);
        this.A = h1.f(ls0.g.REPORTED, ls0.g.FOLLOW_INTEREST_FEEDBACK_NOT_FOR_ME, ls0.g.FEEDBACK_LOW_QUALITY, ls0.g.FEEDBACK_NOT_FOR_ME, ls0.g.FEEDBACK_REPETITIVE_AD, ls0.g.FEEDBACK_LOW_QUALITY_AD, ls0.g.FEEDBACK_NOT_FOR_ME_AD, ls0.g.SEE_FEWER_WEIGHT_LOSS_ADS, ls0.g.GEN_AI_TOPIC_OPT_OUT);
    }

    public static final void q3(h hVar, u0 u0Var) {
        d0 pinalytics = hVar.getPinalytics();
        g0 g0Var = g0.FLOWED_PIN;
        f30 f30Var = hVar.f73566x;
        pinalytics.b0(u0Var, g0Var, f30Var != null ? f30Var.getUid() : null, false);
    }

    public static final void r3(h hVar, f30 f30Var, l32.c cVar, l32.f fVar) {
        hVar.getClass();
        com.pinterest.hairball.network.d prepare = hVar.f73558p.prepare(f30Var.getUid(), cVar, fVar);
        a2 a2Var = i.f27924d;
        Intrinsics.checkNotNullExpressionValue(a2Var, "emptyConsumer(...)");
        hVar.addDisposable(prepare.execute((ak2.e) a2Var, (ak2.e) hVar.f73567y));
    }

    public static final void s3(h hVar, f30 f30Var, l32.c cVar) {
        hVar.getClass();
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        int value = cVar.getValue();
        String z13 = dn.c.z(f30Var);
        oc0 d63 = f30Var.d6();
        String j13 = d63 != null ? d63.j() : null;
        if (j13 == null) {
            j13 = "";
        }
        com.pinterest.hairball.network.f b13 = hVar.f73552j.b(new js0.d(uid, value, z13, b40.R(j13), hVar.f73561s.b(f30Var)));
        a2 a2Var = i.f27924d;
        Intrinsics.checkNotNullExpressionValue(a2Var, "emptyConsumer(...)");
        hVar.addDisposable(b13.execute((ak2.e) a2Var, (ak2.e) hVar.f73567y));
    }

    public static final void t3(h hVar, f30 f30Var, boolean z13) {
        hVar.getClass();
        e30 R6 = f30Var.R6();
        R6.n0(Boolean.valueOf(z13));
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        hVar.f73544b.W(a13);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B3(com.pinterest.api.model.f30 r15) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: is0.h.B3(com.pinterest.api.model.f30):void");
    }

    public final void u3() {
        f30 f30Var;
        String uid;
        f30 f30Var2 = this.f73566x;
        if ((f30Var2 != null && Intrinsics.d(f30Var2.i5(), Boolean.TRUE)) || ((f30Var = this.f73566x) != null && Intrinsics.d(f30Var.T5(), Boolean.TRUE))) {
            f30 f30Var3 = this.f73566x;
            if (f30Var3 != null) {
                B3(f30Var3);
                return;
            }
            return;
        }
        f30 f30Var4 = this.f73566x;
        if (f30Var4 == null || (uid = f30Var4.getUid()) == null) {
            return;
        }
        xj2.c F = this.f73544b.S(uid).F(new fs0.q(19, new e(this, 0)), new fs0.q(20, f.f73535j), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // yk1.p
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public final void r3(hs0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((PinGridHideView) view).f45740s = this;
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(11, f.f73536k);
        dVar.getClass();
        xj2.c F = new x(pk2.f.j(new j1(dVar, aVar, 0), new qt.b(11, f.f73537l), 2, "filter(...)"), new k(17, f.f73538m), 2).F(new fs0.q(14, new e(this, 1)), new fs0.q(15, f.f73539n), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        u3();
    }

    public final void w3(b feedbackType) {
        String uid;
        Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        f30 f30Var = this.f73566x;
        if (f30Var == null || (uid = f30Var.getUid()) == null) {
            return;
        }
        xj2.c o13 = this.f73544b.L(uid).s().o(new fs0.q(16, new g1(12, feedbackType, this)), new fs0.q(17, new e(this, 2)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void x3() {
        getPinalytics().X(u0.HOME_FEED_CONTROL_PANEL_PIN_FEEDBACK_BUTTON);
        this.f73543a.d(Navigation.w1((ScreenLocation) y1.f51581b.getValue()));
    }

    public final void z3() {
        f30 f30Var;
        String uid;
        if (this.f73564v == null || (f30Var = this.f73566x) == null || (uid = f30Var.getUid()) == null) {
            return;
        }
        getPinalytics().F(g0.FLOWED_PIN, u0.UNDO_BUTTON);
        jk2.g0 s13 = this.f73544b.L(uid).s();
        mn0.d dVar = new mn0.d(1, uid, this);
        s13.p(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribeWith(...)");
        addDisposable(dVar);
    }
}
