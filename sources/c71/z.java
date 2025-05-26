package c71;

import android.os.Bundle;
import android.os.Handler;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.px0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.results.view.n0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.u3;
import de1.c0;
import de1.d0;
import de1.h0;
import df.j1;
import ey.a1;
import ey.j3;
import ey.k3;
import ey.q1;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.g1;
import lh0.g3;
import lh0.z3;
import m60.m0;
import nx.d1;
import nx.f0;
import so.n6;
import x02.a2;
import x02.i2;
import x02.x2;
import zd1.e0;
import zy.q0;

/* loaded from: classes5.dex */
public final class z extends wk1.n implements t, h61.j, i01.a, eq0.m, de1.d, c0, ov1.d, ee1.f, xd1.a, n0, gm1.a, ca2.b, h61.i, ta2.a {
    public final oa2.p A;
    public boolean A0;
    public final d1 B;
    public boolean B0;
    public final q0 C;
    public final x C0;
    public final cz.e D;
    public final m60.w D0;
    public final f0 E;
    public final xk2.v E0;
    public final wk1.d F;
    public boolean F0;
    public final ni0.e G;
    public final a71.c G0;
    public final ew.l H;
    public final y H0;
    public final ds.a I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f26835J;
    public final boolean K;
    public final y61.a L;
    public final g70.h M;
    public final String N;
    public final h61.h O;
    public final boolean P;
    public b0 Q;
    public String R;
    public boolean S;
    public final l11.f T;
    public boolean U;
    public boolean V;
    public List W;
    public final HashSet X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final c91.f f26836a;

    /* renamed from: a0, reason: collision with root package name */
    public int f26837a0;

    /* renamed from: b, reason: collision with root package name */
    public final z61.b f26838b;

    /* renamed from: b0, reason: collision with root package name */
    public List f26839b0;

    /* renamed from: c, reason: collision with root package name */
    public final pr0.g f26840c;

    /* renamed from: c0, reason: collision with root package name */
    public List f26841c0;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f26842d;

    /* renamed from: d0, reason: collision with root package name */
    public List f26843d0;

    /* renamed from: e, reason: collision with root package name */
    public final uk2.f f26844e;

    /* renamed from: e0, reason: collision with root package name */
    public b71.d f26845e0;

    /* renamed from: f, reason: collision with root package name */
    public final String f26846f;

    /* renamed from: f0, reason: collision with root package name */
    public String f26847f0;

    /* renamed from: g, reason: collision with root package name */
    public final eq0.n f26848g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f26849g0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26850h;

    /* renamed from: h0, reason: collision with root package name */
    public e71.a f26851h0;

    /* renamed from: i, reason: collision with root package name */
    public final wk1.c f26852i;

    /* renamed from: i0, reason: collision with root package name */
    public v61.a f26853i0;

    /* renamed from: j, reason: collision with root package name */
    public final sq0.f f26854j;

    /* renamed from: j0, reason: collision with root package name */
    public final String f26855j0;

    /* renamed from: k, reason: collision with root package name */
    public final k81.k f26856k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f26857k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f26858l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f26859l0;

    /* renamed from: m, reason: collision with root package name */
    public final lb0.o f26860m;

    /* renamed from: m0, reason: collision with root package name */
    public lh0 f26861m0;

    /* renamed from: n, reason: collision with root package name */
    public final lb0.q f26862n;

    /* renamed from: n0, reason: collision with root package name */
    public String f26863n0;

    /* renamed from: o, reason: collision with root package name */
    public final yk1.v f26864o;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f26865o0;

    /* renamed from: p, reason: collision with root package name */
    public final ku1.l f26866p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f26867p0;

    /* renamed from: q, reason: collision with root package name */
    public final nu1.a f26868q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f26869q0;

    /* renamed from: r, reason: collision with root package name */
    public final x2 f26870r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f26871r0;

    /* renamed from: s, reason: collision with root package name */
    public final dz0.d f26872s;

    /* renamed from: s0, reason: collision with root package name */
    public e61.a f26873s0;

    /* renamed from: t, reason: collision with root package name */
    public final g3 f26874t;

    /* renamed from: t0, reason: collision with root package name */
    public k61.h f26875t0;

    /* renamed from: u, reason: collision with root package name */
    public final i2 f26876u;

    /* renamed from: u0, reason: collision with root package name */
    public k61.h f26877u0;

    /* renamed from: v, reason: collision with root package name */
    public final pb0.d f26878v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f26879v0;

    /* renamed from: w, reason: collision with root package name */
    public final nr0.m f26880w;

    /* renamed from: w0, reason: collision with root package name */
    public List f26881w0;

    /* renamed from: x, reason: collision with root package name */
    public final b60.b f26882x;

    /* renamed from: x0, reason: collision with root package name */
    public d0 f26883x0;

    /* renamed from: y, reason: collision with root package name */
    public final oc.c f26884y;

    /* renamed from: y0, reason: collision with root package name */
    public final xk2.v f26885y0;

    /* renamed from: z, reason: collision with root package name */
    public final no1.e f26886z;

    /* renamed from: z0, reason: collision with root package name */
    public final boolean f26887z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 searchParameters, c91.f onDemandModuleController, z61.b searchPWTManager, pr0.g feedPWTLoggingEventListener, e0 e0Var, uk2.f productFilterAppliedCountSubject, String str, eq0.n nVar, boolean z13, wk1.c parameters, sq0.f imagePrefetcher, k81.k remoteRequestListenerWrapper, int i13, lb0.o preferencesManager, lb0.q prefsManagerPersisted, yk1.v viewResources, ku1.l uriNavigator, nu1.a inAppNavigator, x2 userRepository, dz0.d oneTapUtils, g3 searchExperiments, i2 pinRepository, pb0.d fuzzyDateFormatter, nr0.m dynamicGridViewBinderDelegateFactory, b60.b activeUserManager, oc.c apolloClient, no1.e conversationRemoteDataSource, oa2.p legoUserRepPresenterFactory, d1 trackingParamAttacher, q0 unscopedPinalyticsSEPFactory, cz.e anketManager, f0 pinalyticsFactory, wk1.d getViewForFeedback, ni0.e adsCarouselPresenterFactory, ew.l adsGmaHeaderManager, ds.a adNetwork, boolean z14, boolean z15, y61.a searchIntentTracker, g70.h boardNavigator) {
        super(parameters);
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        Intrinsics.checkNotNullParameter(onDemandModuleController, "onDemandModuleController");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(feedPWTLoggingEventListener, "feedPWTLoggingEventListener");
        Intrinsics.checkNotNullParameter(productFilterAppliedCountSubject, "productFilterAppliedCountSubject");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        Intrinsics.checkNotNullParameter(remoteRequestListenerWrapper, "remoteRequestListenerWrapper");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(oneTapUtils, "oneTapUtils");
        Intrinsics.checkNotNullParameter(searchExperiments, "searchExperiments");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(getViewForFeedback, "getViewForFeedback");
        Intrinsics.checkNotNullParameter(adsCarouselPresenterFactory, "adsCarouselPresenterFactory");
        Intrinsics.checkNotNullParameter(adsGmaHeaderManager, "adsGmaHeaderManager");
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(searchIntentTracker, "searchIntentTracker");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f26836a = onDemandModuleController;
        this.f26838b = searchPWTManager;
        this.f26840c = feedPWTLoggingEventListener;
        this.f26842d = e0Var;
        this.f26844e = productFilterAppliedCountSubject;
        this.f26846f = str;
        this.f26848g = nVar;
        this.f26850h = z13;
        this.f26852i = parameters;
        this.f26854j = imagePrefetcher;
        this.f26856k = remoteRequestListenerWrapper;
        this.f26858l = i13;
        this.f26860m = preferencesManager;
        this.f26862n = prefsManagerPersisted;
        this.f26864o = viewResources;
        this.f26866p = uriNavigator;
        this.f26868q = inAppNavigator;
        this.f26870r = userRepository;
        this.f26872s = oneTapUtils;
        this.f26874t = searchExperiments;
        this.f26876u = pinRepository;
        this.f26878v = fuzzyDateFormatter;
        this.f26880w = dynamicGridViewBinderDelegateFactory;
        this.f26882x = activeUserManager;
        this.f26884y = apolloClient;
        this.f26886z = conversationRemoteDataSource;
        this.A = legoUserRepPresenterFactory;
        this.B = trackingParamAttacher;
        this.C = unscopedPinalyticsSEPFactory;
        this.D = anketManager;
        this.E = pinalyticsFactory;
        this.F = getViewForFeedback;
        this.G = adsCarouselPresenterFactory;
        this.H = adsGmaHeaderManager;
        this.I = adNetwork;
        this.f26835J = z14;
        this.K = z15;
        this.L = searchIntentTracker;
        this.M = boardNavigator;
        this.N = searchParameters.f26730b;
        this.O = searchParameters.f26728a;
        String str2 = searchParameters.P;
        this.P = !(str2 == null || kotlin.text.z.j(str2));
        this.Q = searchParameters;
        this.R = "";
        this.T = new l11.f();
        this.X = new HashSet();
        boolean l13 = searchExperiments.l();
        this.f26865o0 = l13;
        this.f26867p0 = l13;
        this.f26869q0 = l13;
        this.f26885y0 = xk2.m.b(new v(this, 3));
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) searchExperiments.f83374a;
        this.f26887z0 = g1Var.o("android_search_sticky_guides_iterated_entered_query", "enabled", z3Var) || g1Var.l("android_search_sticky_guides_iterated_entered_query");
        this.C0 = new x();
        this.D0 = parameters.f130134e;
        this.E0 = xk2.m.b(g.f26767n);
        this.G0 = new a71.c(getPinalytics());
        S3();
        R3();
        String str3 = this.Q.f26749u;
        str3 = str3 == null ? pe.i.v(prefsManagerPersisted) : str3;
        if (str3 != null) {
            this.f26855j0 = str3;
            Q3(b0.a(this.Q, null, null, null, null, null, null, false, null, null, str3, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 2097151));
        }
        this.H0 = new y(this, searchParameters);
    }

    public final b71.d B3() {
        b71.d dVar = this.f26845e0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("searchTypo");
        throw null;
    }

    @Override // h61.i
    public final void C1(String str) {
        ((h61.k) getView()).x6(str);
        nx.d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        nx.d0.B(d0Var, f1.JOURNEY_BACK_BUTTON_CLICK, null, null, null, 30);
    }

    @Override // ta2.a
    public final ta2.b D() {
        b0 b0Var = this.Q;
        if ((!v3().isEmpty()) && j1.U0(b0Var.f26748t)) {
            return ta2.b.HAIR_PATTERN;
        }
        if ((!D3().isEmpty()) && j1.U0(b0Var.f26747s)) {
            return ta2.b.SKIN_TONE;
        }
        if (this.F0 && j1.U0(b0Var.f26749u)) {
            return ta2.b.BODY_TYPE;
        }
        return null;
    }

    public final List D3() {
        List list = this.f26839b0;
        if (list != null) {
            return list;
        }
        Intrinsics.r("skinToneFilters");
        throw null;
    }

    public final boolean F3() {
        return pe.i.P0(com.bumptech.glide.d.E(), new v(this, 2), this.O, this.P);
    }

    public final boolean G3() {
        return ((Boolean) this.f26885y0.getValue()).booleanValue();
    }

    @Override // ee1.f
    public final void H2(t32.f fVar, int i13) {
        e0 e0Var;
        Pair c13;
        ArrayList arrayList;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            if (de1.q0.f54637c[fVar.ordinal()] == 1 && (e0Var = this.f26842d) != null && (c13 = e0Var.c(fVar.toString())) != null && (arrayList = (ArrayList) c13.f80346a) != null) {
                ph.a.H0(false, arrayList);
            }
        }
        d0 d0Var = this.f26883x0;
        if (d0Var != null) {
            d0.b3(d0Var, new ArrayList(), i13, de1.a.CLEAR, true, fVar, 32);
        }
    }

    public final boolean H3() {
        return this.Q.f26728a == h61.h.MY_PINS;
    }

    public final void I3(b0 b0Var) {
        f1 f1Var;
        switch (u.f26827a[b0Var.f26728a.ordinal()]) {
            case 1:
                f1Var = f1.SEARCH_PINS;
                break;
            case 2:
                f1Var = f1.SEARCH_PINS_BUYABLE;
                break;
            case 3:
                f1Var = f1.SEARCH_USERS;
                break;
            case 4:
                f1Var = f1.SEARCH_BOARDS;
                break;
            case 5:
                f1Var = f1.SEARCH_VIDEOS;
                break;
            case 6:
                f1Var = f1.SEARCH_MY_PINS;
                break;
            default:
                f1Var = null;
                break;
        }
        if (f1Var != null) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("query", b0Var.f26730b);
            hashMap.put("commerce_only", String.valueOf(b0Var.n()));
            String str = b0Var.f26739k;
            hashMap.put("rs", str);
            if (Intrinsics.d(str, "shop_tab_bubble")) {
                bs1.c.G1("entered_query", b0Var.f26731c, hashMap);
                bs1.c.G1("story_id", b0Var.f26737i, hashMap);
            }
            getPinalytics().g(f1Var, "0", hashMap, false);
        }
    }

    @Override // c71.t
    public final e0 J2() {
        return this.f26842d;
    }

    public final void J3(Object obj, String str) {
        HashMap hashMap = new HashMap();
        String str2 = this.Q.S;
        if (str2 != null) {
            hashMap.put("pinner_displayed_query", str2);
        }
        String str3 = this.Q.f26731c;
        if (str3 != null) {
            hashMap.put("entered_query", str3);
        }
        hashMap.put("rs", this.Q.f26739k);
        hashMap.put("filter_type", str);
        if (obj != null) {
            hashMap.put("filter_value", obj.toString());
        }
        getPinalytics().Z(u0.SEARCH_FILTER_APPLY, hashMap);
    }

    public final void K3() {
        List list;
        List list2 = this.W;
        if (list2 == null || list2.isEmpty()) {
            h61.k kVar = (h61.k) getViewIfBound();
            if (kVar != null) {
                kVar.S4(false);
                return;
            }
            return;
        }
        if (this.Y || (list = this.W) == null) {
            return;
        }
        h61.k kVar2 = (h61.k) getViewIfBound();
        if (kVar2 != null) {
            kVar2.Q0(this.f26837a0, this.Q.f26730b, this.f26855j0, list);
        }
        this.Y = true;
    }

    @Override // c71.t
    public final void L1() {
        this.U = true;
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: L3, reason: merged with bridge method [inline-methods] */
    public final void r3(h61.k view) {
        d0 unifiedInlineFilterUpdateListener;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        int i13 = 0;
        byte b13 = 0;
        byte b14 = 0;
        if (this.Z) {
            this.Z = false;
            this.Y = false;
            K3();
        }
        int i14 = 14;
        if (F3() && (e0Var = this.f26842d) != null && !e0Var.f()) {
            ((Handler) this.E0.getValue()).post(new v.k(this, e0Var.b(), i14));
        }
        if (H3()) {
            view.p4();
        }
        boolean z13 = this.P;
        int i15 = 2;
        int i16 = 3;
        int i17 = 4;
        int i18 = 1;
        if (z13) {
            view.S4(true);
            view.E3(false);
            view.p4();
        } else if (F3()) {
            h61.h hVar = this.Q.f26728a;
            int i19 = hVar == null ? -1 : u.f26827a[hVar.ordinal()];
            if ((i19 == 1 || i19 == 2 || i19 == 3 || i19 == 4 || i19 == 5) && !z13) {
                b0 b0Var = this.Q;
                if (b0Var.N == null && !Intrinsics.d(b0Var.f26739k, "hs")) {
                    de1.f j03 = j0();
                    if (j03 != null) {
                        j03.g2();
                    }
                    de1.f j04 = j0();
                    if (j04 != null) {
                        j04.B4(true);
                    }
                }
            }
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        q gridFilterUpdater = new q(this, i13);
        h61.k kVar = (h61.k) getViewIfBound();
        if (kVar != null) {
            if (this.f26865o0) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                unifiedInlineFilterUpdateListener = new s(this, kVar);
            } else {
                Intrinsics.checkNotNullParameter(this, "<this>");
                Intrinsics.checkNotNullParameter(gridFilterUpdater, "gridFilterUpdater");
                unifiedInlineFilterUpdateListener = new r(kVar, gridFilterUpdater, this);
            }
            de1.f j05 = j0();
            if (j05 != null) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                Intrinsics.checkNotNullParameter(unifiedInlineFilterUpdateListener, "unifiedInlineFilterUpdateListener");
                j05.H2(new p(view, this, unifiedInlineFilterUpdateListener));
            }
        } else {
            unifiedInlineFilterUpdateListener = null;
        }
        this.f26883x0 = unifiedInlineFilterUpdateListener;
        T3();
        view.M(this);
        view.V2(this);
        view.r(this);
        view.A3(this);
        view.k3(this);
        view.J0(this);
        view.N0(this);
        view.G4(this.N);
        if (this.f26835J) {
            view.v1();
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.SEARCH_BOX_VOICE_INPUT, (r18 & 4) != 0 ? null : g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        view.B6(this);
        view.p6(new v(this, i17));
        this.D0.h(this.C0);
        gb2.f fVar = gb2.f.f64747a;
        mk2.k kVar2 = gl1.c.f65741g;
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(14, l.f26781q);
        dVar.getClass();
        jk2.x xVar = new jk2.x(new jk2.j1(new jk2.j1(pk2.f.j(new jk2.j1(dVar, aVar, 0), new qt.b(14, l.f26782r), 2, "filter(...)"), new f5.g(b14 == true ? 1 : 0, i15), 0), new qt.a(14, new w(this, i18)), 0), new qt.b(14, l.f26783s), i15);
        if (kVar2 != null) {
            xVar.A(kVar2);
        }
        rr.c cVar = new rr.c(4, new w(this, i15));
        a2 a2Var = ck2.i.f27925e;
        ck2.c cVar2 = ck2.i.f27923c;
        a2 a2Var2 = ck2.i.f27924d;
        xj2.c F = xVar.F(cVar, a2Var, cVar2, a2Var2);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        i2 i2Var = this.f26876u;
        xj2.c F2 = i2Var.z().F(new u51.b(10, new w(this, i16)), new u51.b(11, l.f26784t), cVar2, a2Var2);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        addDisposable(F2);
        xj2.c F3 = this.f26870r.B().F(new u51.b(12, new w(this, i17)), new u51.b(13, l.f26785u), cVar2, a2Var2);
        Intrinsics.checkNotNullExpressionValue(F3, "subscribe(...)");
        addDisposable(F3);
        String str = this.Q.F;
        if (str != null && kotlin.text.z.p(str, "paid_app", false)) {
            HashMap hashMap = new HashMap();
            bs1.c.G1("utm_source", this.Q.G, hashMap);
            bs1.c.G1("utm_medium", this.Q.F, hashMap);
            hashMap.put("query", this.Q.f26730b);
            nx.d0.B(getPinalytics(), f1.PAID_SEARCH_LAND, null, null, hashMap, 22);
        }
        if (this.Q.f26728a == h61.h.BOARDS && (!kotlin.text.z.j(r2.f26730b))) {
            ((g1) this.f26874t.f83374a).c("android_boards_gg_unification");
        }
        String str2 = this.Q.W;
        if (str2 != null) {
            addDisposable(nl.b.m(i2Var.L(str2), "Error getting pin for updating Hybrid Search header", new w(this, b13 == true ? 1 : 0)));
        }
    }

    @Override // ca2.b
    public final void M0(String str) {
        ((h61.k) getView()).C3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (kotlin.text.z.i(r5.f26733e, r5.f26730b, true) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M3(boolean r4, boolean r5) {
        /*
            r3 = this;
            c71.b0 r0 = r3.Q
            java.lang.String r0 = r0.f26730b
            java.lang.String r1 = r3.R
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r0)
            if (r1 == 0) goto L44
            if (r5 != 0) goto L44
            c71.b0 r5 = r3.Q
            java.lang.String r1 = r5.f26739k
            java.lang.String r2 = "typo_auto_original"
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto L26
            java.lang.String r1 = r5.f26730b
            r2 = 1
            java.lang.String r5 = r5.f26733e
            boolean r5 = kotlin.text.z.i(r5, r1, r2)
            if (r5 != 0) goto L26
            goto L44
        L26:
            k61.h r5 = r3.z3()
            java.util.List r5 = r5.d()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L35
            goto L44
        L35:
            r3.N3()
            yk1.n r4 = r3.getView()
            h61.k r4 = (h61.k) r4
            boolean r5 = r3.B0
            r4.g1(r5)
            goto L8d
        L44:
            yk1.n r5 = r3.getView()
            h61.k r5 = (h61.k) r5
            r5.i6()
            r5 = 0
            r3.Y = r5
            r3.loadData()
            yk1.n r5 = r3.getView()
            yk1.r r5 = (yk1.r) r5
            r3.rebindPinalytics(r5)
            c71.b0 r5 = r3.Q
            r3.I3(r5)
            e71.a r5 = r3.f26851h0
            if (r5 == 0) goto L72
            h61.c r1 = h61.c.SKIN_TONE
            java.lang.String r1 = r1.toString()
            java.lang.Integer r5 = r5.getId()
            r3.J3(r5, r1)
        L72:
            if (r4 != 0) goto L7c
            nx.d0 r4 = r3.getPinalytics()
            r5 = 0
            r4.z(r5)
        L7c:
            r3.R = r0
            k61.h r4 = r3.f26875t0
            if (r4 == 0) goto L8d
            k61.h r4 = r3.z3()
            java.lang.String r5 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            r4.L = r0
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.z.M3(boolean, boolean):void");
    }

    public final void N3() {
        String str;
        List list;
        String tone;
        int i13 = 1;
        if (!H3()) {
            if (!this.f26857k0) {
                if (!v3().isEmpty()) {
                    ((h61.k) getView()).S1(v3(), this.f26853i0);
                } else if (!D3().isEmpty()) {
                    ((h61.k) getView()).N1(D3(), this.f26851h0);
                    e71.a aVar = this.f26851h0;
                    if (aVar != null) {
                        if (h1.f("filter", "autocomplete", "bottom_inclusive_filter", "pin_closeup_search_filter").contains(this.Q.f26739k) && (tone = aVar.getTerm()) != null) {
                            lb0.q qVar = this.f26862n;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            Intrinsics.checkNotNullParameter(tone, "tone");
                            qVar.b("PERSISTENT_SKIN_TONE_PER_SESSION", tone);
                        }
                    }
                } else {
                    ((h61.k) getView()).l3();
                }
            }
            K3();
            if (!D3().isEmpty()) {
                list = new ArrayList();
            } else {
                list = this.f26843d0;
                if (list == null) {
                    Intrinsics.r("relatedQueries");
                    throw null;
                }
            }
            if (!list.isEmpty()) {
                yk1.n view = getView();
                Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
                h61.k.J((h61.k) view, list, this.Q.f26730b, null, 12);
            }
        }
        b0 b0Var = this.Q;
        if (j1.U0(b0Var != null ? b0Var.f26731c : null)) {
            b0 b0Var2 = this.Q;
            if (b0Var2 == null || (str = b0Var2.f26731c) == null) {
                str = "";
            }
        } else {
            b0 b0Var3 = this.Q;
            str = b0Var3 != null ? b0Var3.f26730b : null;
        }
        HashMap o13 = ep.b.o("entered_query", str);
        String str2 = this.f26863n0;
        if (str2 != null) {
        }
        lh0 lh0Var = this.f26861m0;
        if (lh0Var != null) {
            if (lh0Var.i()) {
                o13.put("advisory_level", String.valueOf(lh0Var.h().intValue()));
            }
            boolean[] zArr = lh0Var.f39770h;
            if (zArr.length > 5 && zArr[5]) {
                o13.put("severity_level", String.valueOf(lh0Var.m().intValue()));
            }
            boolean[] zArr2 = lh0Var.f39770h;
            if (zArr2.length > 1 && zArr2[1]) {
                o13.put("advisory_type", String.valueOf(lh0Var.j()));
            }
            boolean[] zArr3 = lh0Var.f39770h;
            if (zArr3.length > 4 && zArr3[4]) {
                o13.put("resource_country", String.valueOf(lh0Var.l()));
            }
        }
        lh0 lh0Var2 = this.f26861m0;
        if (lh0Var2 != null) {
            boolean[] zArr4 = lh0Var2.f39770h;
            if (zArr4.length > 3 && zArr4[3]) {
                Intrinsics.f(lh0Var2);
                Intrinsics.f(lh0Var2.k());
                if ((!r3.isEmpty()) && !x3().u()) {
                    e61.a x33 = x3();
                    lh0 lh0Var3 = this.f26861m0;
                    Intrinsics.f(lh0Var3);
                    x33.j2(new k61.j(lh0Var3, o13));
                }
            }
        }
        if (Intrinsics.d(this.Q.f26739k, "hs")) {
            return;
        }
        if (!B3().f22092a) {
            Intrinsics.checkNotNullExpressionValue(B3().f22093b, "getCorrectedQuery(...)");
            if (!(!kotlin.text.z.j(r3))) {
                if (this.f26847f0 == null) {
                    Intrinsics.r("searchMessage");
                    throw null;
                }
                if (!(!kotlin.text.z.j(r3))) {
                    return;
                }
            }
        }
        if (x3().u()) {
            return;
        }
        Iterator it = x3().d().iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!(((dl1.s) it.next()) instanceof k61.a)) {
                i14++;
            } else if (i14 > -1) {
                return;
            }
        }
        e61.a x34 = x3();
        b71.d B3 = B3();
        String str3 = this.f26847f0;
        if (str3 != null) {
            x34.j2(new k61.a(B3, str3, new x61.e(this, i13), o13));
        } else {
            Intrinsics.r("searchMessage");
            throw null;
        }
    }

    @Override // c71.t
    public final HashSet O1() {
        return this.X;
    }

    public final void Q3(b0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z13 = value.f26728a != this.Q.f26728a;
        this.Q = value;
        if (this.f26875t0 != null) {
            z3().o0(value);
        }
        if (z13) {
            T3();
        }
    }

    public final void R3() {
        String str = this.Q.f26748t;
        if (str == null) {
            str = pe.i.y(this.f26862n);
        }
        if (str != null) {
            v61.a aVar = v61.a.f124201i;
            this.f26853i0 = kg.p.p(str);
        }
        v61.a aVar2 = this.f26853i0;
        if (aVar2 != null) {
            Q3(b0.a(this.Q, null, null, null, null, null, null, false, null, aVar2.a(), null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2097151));
        }
    }

    @Override // h61.j
    public final void S0() {
        h61.k kVar = (h61.k) getViewIfBound();
        if (kVar != null) {
            kVar.O0();
        }
    }

    public final void S3() {
        String str = this.Q.f26747s;
        if (str == null) {
            str = pe.i.H(this.f26862n);
        }
        String term = str;
        if (term != null) {
            List list = e71.a.f57616f;
            Intrinsics.checkNotNullParameter(term, "term");
            List V = StringsKt.V(term, new char[]{':'});
            this.f26851h0 = V.size() > 1 ? new e71.a(term, Integer.valueOf(Integer.parseInt((String) V.get(1))), null, false, null, 28, null) : null;
        }
        e71.a aVar = this.f26851h0;
        if (aVar != null) {
            Q3(b0.a(this.Q, null, null, null, null, null, null, false, aVar.getTerm(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 2097151));
        }
    }

    @Override // h61.j
    public final void T0() {
        I3(this.Q);
    }

    public final void T3() {
        h32.a4 a4Var;
        h61.h hVar = this.Q.f26728a;
        int[] iArr = u.f26827a;
        d4 d4Var = iArr[hVar.ordinal()] == 6 ? d4.USER : d4.SEARCH;
        int i13 = iArr[hVar.ordinal()];
        if (i13 == 2) {
            a4Var = Intrinsics.d(this.Q.E, "personal_boutique") ? h32.a4.PERSONAL_BOUTIQUE_SEARCH : h32.a4.SEARCH_BUYABLE;
        } else if (i13 == 3) {
            a4Var = h32.a4.SEARCH_USERS;
        } else if (i13 == 4) {
            a4Var = h32.a4.SEARCH_BOARDS;
        } else if (i13 != 6) {
            String str = this.Q.f26739k;
            int hashCode = str.hashCode();
            if (hashCode == -1387975912) {
                if (str.equals("style_summary")) {
                    a4Var = h32.a4.PEAR_STYLE_SUMMARY_SEARCH_PINS;
                }
                a4Var = h32.a4.SEARCH_PINS;
            } else if (hashCode != 3339) {
                a4Var = hashCode != 495286286 ? h32.a4.SEARCH_BUBBLES : h32.a4.SEARCH_BUBBLES;
            } else {
                if (str.equals("hs")) {
                    a4Var = h32.a4.SEARCH_HYBRID;
                }
                a4Var = h32.a4.SEARCH_PINS;
            }
        } else {
            a4Var = h32.a4.SEARCH_MY_PINS;
        }
        ((h61.k) getView()).b0(d4Var, a4Var);
    }

    @Override // h61.j
    public final void V1(e71.a skinTone) {
        Intrinsics.checkNotNullParameter(skinTone, "skinTone");
        g3 g3Var = this.f26874t;
        g3Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) g3Var.f83374a;
        if (g1Var.o("android_inclusive_autoscroll", "enabled", z3Var) || g1Var.l("android_inclusive_autoscroll")) {
            ((h61.k) getView()).q4(0L);
            this.f26849g0 = true;
        }
        boolean z13 = this.f26865o0;
        if (z13) {
            S3();
        }
        this.f26851h0 = skinTone;
        this.f26867p0 = true;
        b0 a13 = b0.a(this.Q, null, null, null, "filter", null, null, false, skinTone.getTerm(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -787457, 2097151);
        ((h61.k) getView()).p4();
        ((sq0.e) ((h61.k) getView())).N8(true);
        if (z13) {
            uk1.c cVar = (h61.k) getViewIfBound();
            if (cVar != null) {
                ((nl1.d) cVar).M1(a13.b(kh2.j.q2(this.Q.f26728a), 1));
            }
        } else {
            Q3(b0.a(this.Q, null, null, null, "filter", null, null, false, skinTone.getTerm(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -787457, 2097151));
            z3().Z();
            if (this.f26859l0) {
                this.Y = false;
                K3();
            }
            loadData();
        }
        J3(skinTone.getId(), h61.c.SKIN_TONE.toString());
        I3(this.Q);
    }

    @Override // c71.t
    public final b0 X2() {
        return this.Q;
    }

    @Override // eq0.m
    public final void Y0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (isBound()) {
            yk1.n view = getView();
            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
            String str = this.f26846f;
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            eq0.k kVar = eq0.k.SEARCH_PIN;
            String uid2 = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            eq0.c.c((nr0.e) view, str, uid, kVar, this.D0, this.f26886z, this.f26884y, this.B.c(uid2), this.f26848g, pin);
        }
    }

    @Override // h61.j
    public final boolean Y1(int i13) {
        sq0.o r13 = getDataSourceRegistry().r(i13);
        if (r13 != null) {
            wk1.e eVar = (wk1.e) r13.f115027a;
            nr0.j jVar = eVar instanceof nr0.j ? (nr0.j) eVar : null;
            Boolean valueOf = jVar != null ? Boolean.valueOf(jVar.n0(r13.f115028b)) : null;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return false;
    }

    @Override // c71.t
    public final void Y2(boolean z13) {
        this.f26871r0 = z13;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        nx.d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        e61.a aVar = new e61.a(d0Var);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f26873s0 = aVar;
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(aVar);
        k61.h u33 = u3(this.Q, g.f26766m);
        Intrinsics.checkNotNullParameter(u33, "<set-?>");
        this.f26875t0 = u33;
        u33.f78412e0 = this.F;
        iVar.b(u33);
        if (H3()) {
            k61.h u34 = u3(b0.a(this.Q, h61.h.PINS, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8194, 2097151), new v(this, 0));
            Intrinsics.checkNotNullParameter(u34, "<set-?>");
            this.f26877u0 = u34;
            u34.f78410c0 = false;
            iVar.b(u34);
        }
    }

    @Override // h61.j
    public final void d1(boolean z13) {
        h61.k kVar = (h61.k) getViewIfBound();
        if (kVar != null) {
            kVar.E3(z13);
        }
        de1.f j03 = j0();
        if (j03 != null) {
            j03.B4(z13);
        }
    }

    @Override // ov1.d
    public final void f2() {
        Q3(b0.a(this.Q, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2096895));
    }

    @Override // h61.j
    public final void g() {
        this.f26853i0 = null;
        b0 a13 = b0.a(this.Q, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2097151);
        if (this.f26865o0) {
            uk1.c cVar = (h61.k) getViewIfBound();
            if (cVar != null) {
                ((nl1.d) cVar).M1(a13.b(kh2.j.q2(this.Q.f26728a), 1));
            }
        } else {
            z3().Z();
            Q3(b0.a(this.Q, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2097151));
            ((h61.k) getView()).p4();
            ((sq0.e) ((h61.k) getView())).N8(true);
            if (this.f26859l0) {
                this.Y = false;
                K3();
            }
        }
        loadData();
        I3(this.Q);
    }

    @Override // xd1.a
    /* renamed from: getShouldParseResponse */
    public final boolean getShouldParseDynamicHeights() {
        return this.f26879v0;
    }

    @Override // yk1.p
    public final String getUniqueViewKey() {
        return this.Q.f26730b;
    }

    @Override // c71.t
    public final boolean h1() {
        return this.f26871r0;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f26850h) {
            return;
        }
        if (event instanceof cn1.s) {
            p0();
            return;
        }
        if (event instanceof cn1.u) {
            if (!this.f26835J) {
                l();
                return;
            }
            NavigationImpl w13 = Navigation.w1(w3());
            w13.Y1("com.pinterest.EXTRA_START_VOICE_SEARCH", true);
            this.D0.d(w13);
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEARCH_BOX_VOICE_INPUT, (r18 & 4) != 0 ? null : g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // c71.t
    public final de1.f j0() {
        yk1.n viewIfBound = getViewIfBound();
        if (viewIfBound instanceof de1.f) {
            return (de1.f) viewIfBound;
        }
        return null;
    }

    @Override // com.pinterest.feature.search.results.view.n0
    public final void l() {
        getPinalytics().F(g0.SEARCH_BOX, u0.FLASHLIGHT_CAMERA_BUTTON);
        this.D0.d(Navigation.w1((ScreenLocation) u3.f51430a.getValue()));
    }

    @Override // wk1.q
    public final void loadData() {
        z3().f78408a0 = null;
        h61.h searchType = this.Q.f26728a;
        ((h61.k) getView()).b4();
        boolean isEmpty = z3().d().isEmpty();
        int i13 = u.f26827a[searchType.ordinal()];
        boolean z13 = false;
        boolean z14 = i13 == 1 || i13 == 2 || i13 == 3;
        if (isEmpty && z14) {
            this.f26838b.getClass();
            Intrinsics.checkNotNullParameter(searchType, "searchType");
            q1 pwtSearchType = searchType.toPWTSearchType();
            Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
            new ey.h1(pwtSearchType).i();
            b0 b0Var = this.Q;
            Intrinsics.checkNotNullParameter(searchType, "searchType");
            q1 pWTSearchType = searchType.toPWTSearchType();
            new ey.d1(pWTSearchType).i();
            new a1().i();
            j3 j3Var = j3.f60510a;
            int i14 = at1.d.f20439o;
            n60.s i15 = ((m0) nl.b.e()).i();
            Intrinsics.g(i15, "null cannot be cast to non-null type com.pinterest.base.application.EarlyAppInitImpl");
            Object obj = ((bf2.b) i15.j()).get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Q3(b0.a(b0Var, null, null, null, null, null, null, false, null, null, null, j3.g((k3) obj, pWTSearchType.getSpanName(), null, null).f60495b, null, null, null, null, null, null, null, null, null, null, null, -4194305, 2097151));
        }
        boolean z15 = this.Q.f26728a == h61.h.PRODUCTS;
        wk1.c cVar = this.f26852i;
        if (z15) {
            wa2.i iVar = cVar.f130131b.f103320a;
            iVar.f128795s = true;
            this.f26879v0 = true;
            iVar.f128764c0 = new wa2.g0(false, false, false, false, false, false, null, null, null, false, false, false, false, 0, true, true, false, false, false, false, false, true, 16580583);
            if (isBound()) {
                ((h61.k) getView()).n2(this);
            }
        }
        z3().o0(this.Q);
        super.loadData();
        if (this.S) {
            return;
        }
        ((h61.k) getView()).c6();
        ((h61.k) getView()).m4();
        ((h61.k) getView()).e2();
        String str = this.Q.f26730b;
        qa2.n nVar = cVar.f130131b;
        if (str.length() > 0) {
            String obj2 = StringsKt.i0(str).toString();
            Matcher matcher = com.pinterest.ui.text.e.f52660a.matcher(obj2);
            if (matcher.find()) {
                z13 = matcher.end() - matcher.start() == obj2.length();
            }
        }
        nVar.f103320a.f128787o = z13;
    }

    @Override // h61.j
    public final void n() {
        this.f26851h0 = null;
        b0 a13 = b0.a(this.Q, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 2097151);
        lb0.q qVar = this.f26862n;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.remove("PREF_SKIN_TONE_SELECTION");
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.remove("PERSISTENT_SKIN_TONE_PER_SESSION");
        if (this.f26865o0) {
            uk1.c cVar = (h61.k) getViewIfBound();
            if (cVar != null) {
                ((nl1.d) cVar).M1(a13.b(kh2.j.q2(this.Q.f26728a), 1));
            }
        } else {
            z3().Z();
            Q3(b0.a(this.Q, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 2097151));
            ((h61.k) getView()).p4();
            ((sq0.e) ((h61.k) getView())).N8(true);
            if (this.f26859l0) {
                this.Y = false;
                K3();
            }
        }
        loadData();
        I3(this.Q);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        de1.f j03;
        p3();
        if (z3().f49127q.size() == 0 && !this.Y) {
            if (isBound() && z3().t0()) {
                ((yq0.t) ((h61.k) getView())).setLoadState(yk1.i.LOADING);
            }
            this.f26840c.f101178m = true;
            M3(true, false);
        }
        if (!isBound() || (j03 = j0()) == null) {
            return;
        }
        j03.i2(this);
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        super.onDeactivate();
        h61.h hVar = this.Q.f26728a;
        this.f26838b.c(this.f26858l, hVar);
    }

    @Override // i01.a
    public final void onPinClicked(int i13) {
    }

    @Override // wk1.q, sq0.a0
    public final void onRecyclerRefresh() {
        b0 b0Var = this.Q;
        if (b0Var.f26742n) {
            Q3(b0.a(b0Var, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 2097151));
        }
        if (z3().f78408a0 == null) {
            h61.h hVar = this.Q.f26728a;
            h61.h hVar2 = h61.h.PINS;
            if (hVar == hVar2) {
                k61.h z33 = z3();
                b0 a13 = b0.a(this.Q, null, null, null, "pull_to_refresh", "FRESH", null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3073, 2097151);
                if (a13.f26728a == hVar2) {
                    z33.f78408a0 = a13;
                }
            }
        }
        b0 b0Var2 = z3().f78408a0;
        if (b0Var2 == null) {
            b0Var2 = this.Q;
        }
        I3(b0Var2);
        super.onRecyclerRefresh();
    }

    @Override // wk1.q, yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        this.Z = true;
        super.onRestoreInstanceState(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4 != null ? r4.G2() : null, "US") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0200, code lost:
    
        if (r3.f26849g0 != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0202, code lost:
    
        r4 = getView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "<get-view>(...)");
        ((h61.k) r4).q4(1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0219, code lost:
    
        if (F3() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021b, code lost:
    
        r4 = r3.f26842d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x021d, code lost:
    
        if (r4 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0223, code lost:
    
        if (r4.f() != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0225, code lost:
    
        ((android.os.Handler) r3.E0.getValue()).post(new v.k(r3, r0, 14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0213, code lost:
    
        r3.f26849g0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01fc, code lost:
    
        if (hf0.b.q() == false) goto L99;
     */
    @Override // wk1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStateUpdated(wt1.c0 r4, wt1.d0 r5) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.z.onStateUpdated(wt1.c0, wt1.d0):void");
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.D0.j(this.C0);
        e0 e0Var = this.f26842d;
        if (e0Var != null) {
            e0Var.f141709d.clear();
        }
        super.onUnbind();
    }

    @Override // com.pinterest.feature.search.results.view.n0
    public final void p0() {
        h61.h hVar = this.Q.f26728a;
        this.f26838b.c(hashCode(), hVar);
        NavigationImpl w13 = Navigation.w1(w3());
        if (this.f26887z0) {
            w13.m0("com.pinterest.EXTRA_SEARCH_PREFILLED_QUERY", this.Q.f26730b);
        } else {
            w13.m0("com.pinterest.EXTRA_SEARCH_PREFILLED_QUERY", this.N);
        }
        w13.m0("com.pinterest.EXTRA_SEARCH_TYPE", this.O.toString());
        String str = this.Q.E;
        if (str != null) {
            w13.m0("com.pinterest.EXTRA_SHOP_SOURCE", str);
        }
        this.D0.d(w13);
    }

    @Override // c71.t
    public final List q1() {
        return this.f26881w0;
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // ov1.d
    public final void t1(List selectedOneBarModules) {
        k00 q13;
        Map w13;
        k00 q14;
        Map w14;
        Object obj;
        o00 v13;
        Map u13;
        Object obj2;
        k00 q15;
        Intrinsics.checkNotNullParameter(selectedOneBarModules, "selectedOneBarModules");
        if (Intrinsics.d(this.Q.f26739k, "hs")) {
            ((h61.k) getView()).p4();
            g00 g00Var = (g00) CollectionsKt.firstOrNull(selectedOneBarModules);
            z3().Z();
            b0 b0Var = this.Q;
            String y13 = (g00Var == null || (q15 = g00Var.q()) == null) ? null : q15.y();
            if (y13 == null) {
                y13 = "";
            }
            String str = y13;
            String obj3 = (g00Var == null || (u13 = g00Var.u()) == null || (obj2 = u13.get("hybrid_search_params")) == null) ? null : obj2.toString();
            String p13 = (g00Var == null || (v13 = g00Var.v()) == null) ? null : v13.p();
            String obj4 = (g00Var == null || (q14 = g00Var.q()) == null || (w14 = q14.w()) == null || (obj = w14.get("source_module_id")) == null) ? null : obj.toString();
            Object obj5 = (g00Var == null || (q13 = g00Var.q()) == null || (w13 = q13.w()) == null) ? null : w13.get("journey_depth");
            Double d2 = obj5 instanceof Double ? (Double) obj5 : null;
            Q3(b0.a(b0Var, null, str, null, null, null, null, false, null, null, null, null, null, null, d2 != null ? Integer.valueOf((int) d2.doubleValue()).toString() : null, obj4, p13, null, obj3, null, null, null, null, -3, 2060191));
            String str2 = this.Q.W;
            if (str2 != null) {
                addDisposable(nl.b.m(this.f26876u.L(str2), "Error getting pin for updating Hybrid Search header", new w(this, 0)));
            }
            loadData();
            I3(this.Q);
        }
    }

    @Override // ta2.a
    public final HashMap t6() {
        String str;
        String str2;
        ta2.b D = D();
        if (D == null) {
            return null;
        }
        int i13 = u.f26828b[D.ordinal()];
        if (i13 == 1) {
            String str3 = this.Q.f26748t;
            str = str3 != null ? str3 : "";
            str2 = "hair_pattern_filters";
        } else if (i13 == 2) {
            String str4 = this.Q.f26747s;
            str = str4 != null ? str4 : "";
            str2 = "skin_tone_filters";
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            String str5 = this.Q.f26749u;
            str = str5 != null ? str5 : "";
            str2 = "body_type_filters";
        }
        Map g13 = z0.g(new Pair("story_type", str2), new Pair("filter_value", str), new Pair("query", this.Q.f26730b));
        nx.d dVar = new nx.d();
        dVar.putAll(g13);
        return dVar;
    }

    public final k61.h u3(b0 b0Var, Function0 function0) {
        String str = this.R;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        uj2.q<Boolean> networkStateStream = getNetworkStateStream();
        wk1.c cVar = this.f26852i;
        wa2.i iVar = cVar.f130131b.f103320a;
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        qa2.n nVar = cVar.f130131b;
        nr0.l a13 = ((n6) this.f26880w).a(presenterPinalytics2, nVar.f103320a, nVar, cVar.f130137h);
        ol1.d dVar = new ol1.d(this.D0);
        k81.k kVar = this.f26856k;
        kVar.a(this.H0);
        Unit unit = Unit.f80348a;
        return new k61.h(b0Var, str, function0, this.f26850h, presenterPinalytics, networkStateStream, this.D0, this.f26874t, iVar, this.f26864o, a13, this.f26854j, cVar.f130139j, dVar, this.f26866p, this.f26868q, this.f26836a, this.f26876u, this.f26870r, kVar, this.f26872s, this, this.f26878v, this.f26882x, this.A, this.D, this.E, this.G, this.H, this.I, this.C, this.f26842d, this, getPinalytics(), new v(this, 1), this.L, this.M);
    }

    @Override // xd1.a
    public final void updateFixedHeightImageSpec(bb2.e fixedHeightImageSpec) {
        Intrinsics.checkNotNullParameter(fixedHeightImageSpec, "fixedHeightImageSpec");
        ((Handler) this.E0.getValue()).post(new a11.p(6, this, fixedHeightImageSpec));
    }

    @Override // h61.j
    public final void v(v61.a hairPattern) {
        Intrinsics.checkNotNullParameter(hairPattern, "hairPattern");
        g3 g3Var = this.f26874t;
        g3Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) g3Var.f83374a;
        if (g1Var.o("android_inclusive_autoscroll", "enabled", z3Var) || g1Var.l("android_inclusive_autoscroll")) {
            ((h61.k) getView()).q4(0L);
            this.f26849g0 = true;
        }
        boolean z13 = this.f26865o0;
        if (z13) {
            R3();
        }
        this.f26853i0 = hairPattern;
        this.f26869q0 = true;
        b0 b0Var = this.Q;
        String a13 = hairPattern.a();
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        b0 a14 = b0.a(b0Var, null, null, null, "filter", null, null, false, null, a13, null, null, q0Var, null, null, null, null, null, null, null, null, null, null, -9176065, 2097151);
        ((h61.k) getView()).p4();
        ((sq0.e) ((h61.k) getView())).N8(true);
        if (z13) {
            uk1.c cVar = (h61.k) getViewIfBound();
            if (cVar != null) {
                ((nl1.d) cVar).M1(a14.b(kh2.j.q2(this.Q.f26728a), 1));
            }
        } else {
            z3().Z();
            Q3(b0.a(this.Q, null, null, null, "filter", null, null, false, null, hairPattern.a(), null, null, q0Var, null, null, null, null, null, null, null, null, null, null, -9176065, 2097151));
            if (this.f26859l0) {
                this.Y = false;
                K3();
            }
            loadData();
        }
        yk1.v viewResources = this.f26864o;
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        String str = hairPattern.f124214g;
        if (str == null) {
            str = ((yk1.a) viewResources).f139224a.getString(hairPattern.f124208a);
        }
        J3(str, h61.c.HAIR_PATTERN.toString());
        I3(this.Q);
    }

    public final List v3() {
        List list = this.f26841c0;
        if (list != null) {
            return list;
        }
        Intrinsics.r("hairPatternFilters");
        throw null;
    }

    @Override // de1.c0
    public final void w1(String productFilterType, boolean z13, h0 unifiedInlineFilterDataModel) {
        String str;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        Intrinsics.checkNotNullParameter(unifiedInlineFilterDataModel, "unifiedInlineFilterDataModel");
        px0 px0Var = null;
        e0 e0Var = this.f26842d;
        Pair c13 = e0Var != null ? e0Var.c(productFilterType) : null;
        if (z13) {
            if (c13 != null && (arrayList = (ArrayList) c13.f80346a) != null) {
                boolean z14 = !unifiedInlineFilterDataModel.f54579h;
                de1.a aVar = (z14 || e0Var == null || e0Var.f141708c.size() != 1) ? de1.a.APPLY : de1.a.CLEAR;
                ph.a.H0(z14, arrayList);
                d0 d0Var = this.f26883x0;
                if (d0Var != null) {
                    t32.d dVar = t32.f.Companion;
                    int parseInt = Integer.parseInt(productFilterType);
                    dVar.getClass();
                    d0.b3(d0Var, arrayList, 1, aVar, true, t32.d.a(parseInt), 32);
                }
            }
        } else if (c13 != null) {
            if (e0Var != null && (linkedHashMap = e0Var.f141706a) != null) {
                px0Var = (px0) linkedHashMap.get(productFilterType);
            }
            px0 px0Var2 = px0Var;
            de1.f j03 = j0();
            if (j03 != null) {
                if (px0Var2 == null || (str = px0Var2.p()) == null) {
                    str = "";
                }
                j03.g4(h0.a(unifiedInlineFilterDataModel, px0Var2, str, (ArrayList) c13.f80346a, ((Boolean) c13.f80347b).booleanValue(), productFilterType, 480));
            }
        }
        if (c13 == null) {
            this.G0.e(a71.a.ONE_BAR_SHOP_FILTER_MODULE_NO_DATA, this.O, productFilterType, true);
        }
    }

    public final ScreenLocation w3() {
        int i13 = u.f26827a[this.Q.f26728a.ordinal()];
        return i13 != 2 ? i13 != 6 ? i13 != 7 ? (ScreenLocation) u3.f51433d.getValue() : (ScreenLocation) u3.f51432c.getValue() : (ScreenLocation) u3.f51434e.getValue() : Intrinsics.d(this.Q.E, "personal_boutique") ? (ScreenLocation) u3.f51432c.getValue() : (ScreenLocation) u3.f51433d.getValue();
    }

    @Override // de1.d
    public final void x() {
        e0 e0Var;
        if (!isBound() || (e0Var = this.f26842d) == null) {
            return;
        }
        ArrayList a13 = e0Var.a(false);
        if (a13.isEmpty() && !this.V) {
            this.G0.e(a71.a.FILTER_MODULE_NO_DATA, this.O, ph.a.c0(t32.f.PRODUCT_CONTENT_TYPE), e0Var.f141707b.size() > 0);
        }
        de1.f j03 = j0();
        if (j03 != null) {
            j03.X4(!this.V, a13);
        }
        this.V = a13.isEmpty();
    }

    public final e61.a x3() {
        e61.a aVar = this.f26873s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("searchGridHeaderList");
        throw null;
    }

    @Override // ee1.f
    public final void y0() {
        e0 e0Var = this.f26842d;
        if (e0Var != null) {
            e0Var.f141708c.clear();
        }
        d0 d0Var = this.f26883x0;
        if (d0Var != null) {
            d0.b3(d0Var, new ArrayList(), 0, de1.a.CLEAR, false, null, 56);
        }
    }

    public final k61.h z3() {
        k61.h hVar = this.f26875t0;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("searchGridPagedList");
        throw null;
    }
}
