package ps0;

import android.animation.AnimatorSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.co;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import h32.f1;
import i32.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk2.j1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.p1;
import lh0.z0;
import lh0.z3;
import m60.u0;
import so.k6;
import x02.a2;
import x02.i2;

/* loaded from: classes.dex */
public final class r0 extends rr0.g implements mz.g, b, d, c {
    public final i2 A;
    public final gs1.a B;
    public final p1 C;
    public final m60.h0 D;
    public final m60.e E;
    public final zf0.f F;
    public final mr1.a G;
    public final tb0.h H;
    public final rg0.s I;

    /* renamed from: J, reason: collision with root package name */
    public final b60.b f101295J;
    public final z0 K;
    public final cz.e L;
    public final qs.g M;
    public final g1.g N;
    public final ar0.h O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Map T;
    public String U;
    public String V;
    public boolean W;
    public final f0 X;
    public final l0 Y;
    public final q0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final n0 f101296a0;

    /* renamed from: b0, reason: collision with root package name */
    public final g0 f101297b0;

    /* renamed from: c0, reason: collision with root package name */
    public final a0 f101298c0;

    /* renamed from: d0, reason: collision with root package name */
    public final h0 f101299d0;

    /* renamed from: e0, reason: collision with root package name */
    public final p0 f101300e0;

    /* renamed from: f0, reason: collision with root package name */
    public final j0 f101301f0;

    /* renamed from: g0, reason: collision with root package name */
    public final b0 f101302g0;

    /* renamed from: h0, reason: collision with root package name */
    public final e0 f101303h0;

    /* renamed from: i0, reason: collision with root package name */
    public final d0 f101304i0;

    /* renamed from: j0, reason: collision with root package name */
    public final m0 f101305j0;

    /* renamed from: x, reason: collision with root package name */
    public final rr0.h f101306x;

    /* renamed from: y, reason: collision with root package name */
    public final wk1.d f101307y;

    /* renamed from: z, reason: collision with root package name */
    public final uj2.q f101308z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(rr0.h parameters, wk1.d getViewForFeedback, ol1.d feedbackObservable, i2 pinRepository, gs1.a clipboardProvider, p1 experiments, m60.h0 pageSizeProvider, m60.e applicationInfoProvider, zf0.f educationHelper, mr1.a accountSwitcher, tb0.h crashReporting, rg0.s experiences, b60.b activeUserManager, z0 experimentsActivator, cz.e anketManager, ar0.i loadMoreThresholdTrackerFactory, nm.o gson, yk1.v resources, qs.g premiereSpotlightHFSlotIndexDebugLogger) {
        super(parameters);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(getViewForFeedback, "getViewForFeedback");
        Intrinsics.checkNotNullParameter(feedbackObservable, "feedbackObservable");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(clipboardProvider, "clipboardProvider");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        Intrinsics.checkNotNullParameter(loadMoreThresholdTrackerFactory, "loadMoreThresholdTrackerFactory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(premiereSpotlightHFSlotIndexDebugLogger, "premiereSpotlightHFSlotIndexDebugLogger");
        this.f101306x = parameters;
        this.f101307y = getViewForFeedback;
        this.f101308z = feedbackObservable;
        this.A = pinRepository;
        this.B = clipboardProvider;
        this.C = experiments;
        this.D = pageSizeProvider;
        this.E = applicationInfoProvider;
        this.F = educationHelper;
        this.G = accountSwitcher;
        this.H = crashReporting;
        this.I = experiences;
        this.f101295J = activeUserManager;
        this.K = experimentsActivator;
        this.L = anketManager;
        this.M = premiereSpotlightHFSlotIndexDebugLogger;
        this.N = new g1.g(0);
        this.O = new ar0.h("android_responsive_hf_page_tuning", (lh0.o) ((k6) loadMoreThresholdTrackerFactory).f113518a.f114090a.f113769k7.get());
        this.X = new f0(this);
        this.Y = new l0(this);
        this.Z = new q0(this);
        this.f101296a0 = new n0(this);
        this.f101297b0 = new g0(this);
        this.f101298c0 = new a0(this);
        this.f101299d0 = new h0(this);
        this.f101300e0 = new p0(this);
        this.f101301f0 = new j0(this);
        this.f101302g0 = new b0(this);
        this.f101303h0 = new e0(this);
        this.f101304i0 = new d0(this);
        this.f101305j0 = new m0(this);
        this.Q = true;
        this.f109902n = new np0.e(pinRepository);
    }

    public static void Z3(r0 r0Var, Throwable th3, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            th3 = null;
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        nx.d0 pinalytics = r0Var.getPinalytics();
        f1 f1Var = f1.HOME_FEED_INITIAL_LOAD_ERROR;
        HashMap hashMap = new HashMap();
        hashMap.put("is_empty", String.valueOf(z13));
        if (th3 != null) {
            hashMap.put("error_message", th3.toString());
        }
        Unit unit = Unit.f80348a;
        nx.d0.B(pinalytics, f1Var, null, null, hashMap, 22);
    }

    @Override // rr0.g, nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Object[] E = super.E(uid);
        Object obj = this.N.get(uid);
        if (obj != null) {
            if (E == null) {
                E = new gb2.l[]{obj};
            } else if (!kotlin.collections.c0.y(E, obj)) {
                E = kotlin.collections.z.t(E, obj);
            }
        }
        return (gb2.l[]) E;
    }

    @Override // rr0.g
    public final void H3(Throwable error) {
        ir.c h93;
        Intrinsics.checkNotNullParameter(error, "error");
        I3(error);
        Z3(this, error, false, 2);
        ((g1) this.K).d("hfp_empty_state_android");
        if (this.C.e()) {
            X3();
        }
        e W3 = W3();
        if (W3 != null) {
            HomeFeedFragment homeFeedFragment = (HomeFeedFragment) W3;
            if (!homeFeedFragment.I1 || (h93 = homeFeedFragment.h9()) == null) {
                return;
            }
            h93.d();
        }
    }

    @Override // rr0.g
    public final void J3(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        I3(error);
        Y3("error", error);
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0208  */
    @Override // rr0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K3(qr0.d r27) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ps0.r0.K3(qr0.d):void");
    }

    @Override // rr0.g
    public final void L3(qr0.d dVar) {
        qr0.e feed = (qr0.e) dVar;
        Intrinsics.checkNotNullParameter(feed, "feed");
        super.L3(feed);
        boolean isEmpty = feed.f104964a.isEmpty();
        String str = feed.f104966c;
        Intrinsics.checkNotNullExpressionValue(str, "<get-bookmark>(...)");
        boolean z13 = str.length() == 0;
        if (isEmpty || z13) {
            Y3(isEmpty ? "empty_response" : "empty_bookmark", null);
        }
        if (!this.W && this.f109911w > 2) {
            this.O.a();
        }
        this.W = false;
    }

    @Override // mz.g
    public final y2 M1(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f101307y.x(view);
    }

    @Override // rr0.g
    public final void R3(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        p1 p1Var = this.C;
        p1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) p1Var.f83456a;
        if (g1Var.o("android_ads_premiere_slot_index_logging", "enabled", z3Var) || g1Var.l("android_ads_premiere_slot_index_logging")) {
            Iterator it = items.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                dl1.s sVar = (dl1.s) it.next();
                if (sVar instanceof f30) {
                    Boolean b53 = ((f30) sVar).b5();
                    Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
                    if (b53.booleanValue()) {
                        break;
                    }
                }
                i13++;
            }
            if (i13 != -1) {
                String pinId = ((dl1.s) items.get(i13)).getUid();
                Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
                qs.g gVar = this.M;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                gVar.f105086c.put(pinId, Integer.valueOf(i13));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (true ^ (((dl1.s) obj) instanceof co)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            Z3(this, null, true, 1);
        }
        ((g1) this.K).d("hfp_empty_state_android");
        if (arrayList.isEmpty() && p1Var.e()) {
            X3();
        }
        S3(arrayList);
    }

    @Override // rr0.g
    public final void S3(List items) {
        AnimatorSet animatorSet;
        Intrinsics.checkNotNullParameter(items, "items");
        super.S3(items);
        e W3 = W3();
        if (W3 != null) {
            HomeFeedFragment homeFeedFragment = (HomeFeedFragment) W3;
            Intrinsics.checkNotNullParameter(items, "items");
            if (homeFeedFragment.I1) {
                ir.c h93 = homeFeedFragment.h9();
                if (h93 != null && (animatorSet = h93.f73452c) != null) {
                    animatorSet.cancel();
                }
                RecyclerView g83 = homeFeedFragment.g8();
                if (g83 != null && (!items.isEmpty())) {
                    if (g83.getChildCount() == 0) {
                        return;
                    }
                    homeFeedFragment.p9();
                } else {
                    ir.c h94 = homeFeedFragment.h9();
                    if (h94 != null) {
                        h94.e();
                    }
                }
            }
        }
    }

    public final void V3() {
        gs1.d dVar = (gs1.d) this.B;
        int i13 = 0;
        hk2.k e13 = new hk2.f(1, new hk2.b0(new hk2.f(1, dVar.f66080a == null ? uj2.b0.j("") : new kk2.c(new gs1.c(dVar, i13), 0), new gs1.b()), "", 1), new bv0.k(18, f.f101254l)).h(tk2.e.f118017c).e(wj2.c.a());
        hk2.b bVar = new hk2.b(new fs0.q(23, new c0(this, i13)), new fs0.q(24, f.f101255m), ck2.i.f27923c);
        e13.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        addDisposable(bVar);
    }

    public final e W3() {
        if (isBound()) {
            return (e) getView();
        }
        return null;
    }

    public final void X3() {
        nx.d0.B(getPinalytics(), f1.VIEW, h32.g0.HOME_FEED_EMPTY_STATE, null, null, 28);
    }

    public final void Y3(String str, Throwable th3) {
        nx.d0 pinalytics = getPinalytics();
        f1 f1Var = f1.END_OF_FEED;
        HashMap o13 = ep.b.o("end_of_feed_reason", str);
        o13.put("pin_count", String.valueOf(this.f109906r.size()));
        if (th3 != null) {
            o13.put("error_message", th3.toString());
        }
        Unit unit = Unit.f80348a;
        nx.d0.B(pinalytics, f1Var, null, null, o13, 22);
    }

    public final boolean a4() {
        rg0.n c13 = ((dh0.d) this.I).c(y0.ANDROID_GLOBAL_NAG);
        if (c13 == null) {
            return false;
        }
        if (c13.f108061c == i32.a0.CALLOUT.getValue()) {
            String id3 = c13.f108062d;
            if (!w3(id3)) {
                List items = d();
                Intrinsics.checkNotNullParameter(items, "items");
                if (!items.isEmpty()) {
                    List list = items;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String uid = ((dl1.s) it.next()).getUid();
                            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                            if (kotlin.text.z.p(uid, "experience", false)) {
                            }
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(id3, "id");
                    Intrinsics.checkNotNullParameter(id3, "experienceIdentifier");
                    vh vhVar = new vh(a.a.j("experience/callout/", id3));
                    vhVar.f42868z = z32.m0.EXPERIENCE_CALLOUT;
                    vhVar.D0(c13.f108073o);
                    vhVar.E0(c13.e());
                    N3(kotlin.collections.e0.b(vhVar));
                    if (c13.e()) {
                        Intrinsics.checkNotNullExpressionValue(id3, "id");
                        el.a.o2(id3);
                    }
                    e W3 = W3();
                    if (W3 == null) {
                        return true;
                    }
                    ((HomeFeedFragment) W3).v9();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rr0.g, vq0.e, qr0.d
    public final List d() {
        List unmodifiableList = Collections.unmodifiableList(this.f109906r);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "<get-items>(...)");
        return unmodifiableList;
    }

    @Override // rr0.g, vq0.g
    /* renamed from: d4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void r3(e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        HomeFeedFragment homeFeedFragment = (HomeFeedFragment) view;
        homeFeedFragment.f45770z1 = this;
        homeFeedFragment.f45768x1 = this;
        homeFeedFragment.f45769y1 = this;
        ns0.a aVar = homeFeedFragment.D1;
        if (aVar != null) {
            homeFeedFragment.A8(aVar);
        }
        ns0.a aVar2 = new ns0.a(homeFeedFragment, new j(homeFeedFragment));
        homeFeedFragment.b8(aVar2);
        homeFeedFragment.D1 = aVar2;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        uj2.q<Boolean> networkStateStream = getNetworkStateStream();
        m60.w wVar = this.f109896h;
        Intrinsics.checkNotNullExpressionValue(wVar, "getEventManager(...)");
        yk1.v vVar = this.f101306x.f109922k;
        Intrinsics.checkNotNullExpressionValue(vVar, "getViewResources(...)");
        ke1.e eVar = new ke1.e(presenterPinalytics, networkStateStream, true, wVar, vVar, null, ke1.b.HOMEFEED, null, 160);
        a7.o oVar = this.f126436a;
        oVar.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE, eVar);
        uj2.q<Boolean> networkStateStream2 = getNetworkStateStream();
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        cz.e eVar2 = this.L;
        oVar.j(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, new mz.f(eVar2, networkStateStream2, presenterPinalytics2, this));
        oVar.j(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, new mz.f(eVar2, getNetworkStateStream(), getPresenterPinalytics(), this));
        super.r3(view);
        u3(this.X);
        u3(this.f101296a0);
        u3(this.f101297b0);
        u3(this.f101298c0);
        u3(this.f101299d0);
        u3(this.f101300e0);
        u3(this.f101301f0);
        u3(this.Y);
        u3(this.f101302g0);
        u3(this.f101303h0);
        u3(this.f101304i0);
        u3(this.f101305j0);
        gb2.f fVar = gb2.f.f64747a;
        uj2.a0 a0Var = tk2.e.f118017c;
        mk2.k kVar = gl1.c.f65741g;
        uk2.d dVar = gb2.f.f64748b;
        int i13 = 0;
        i0 i0Var = new i0(0, s.f101312m);
        dVar.getClass();
        int i14 = 2;
        jk2.x xVar = new jk2.x(new j1(dVar, i0Var, i13), new ck2.a(0, s.f101313n), i14);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        jk2.x xVar2 = new jk2.x(new j1(new j1(xVar, new m60.f0(), i13), new i0(0, new o0(this, i13)), i13), new ck2.a(0, s.f101314o), i14);
        if (a0Var != null) {
            xVar2.H(a0Var);
        }
        if (kVar != null) {
            xVar2.A(kVar);
        }
        ck2.h hVar = new ck2.h(new o0(this, 1));
        a2 a2Var = ck2.i.f27925e;
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var2 = ck2.i.f27924d;
        xj2.c F = xVar2.F(hVar, a2Var, cVar, a2Var2);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        xj2.c F2 = this.A.D().F(new ug0.d(23, new o0(this, i14)), new ug0.d(24, s.f101315p), cVar, a2Var2);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        addDisposable(F2);
    }

    public final void e4() {
        e W3;
        if (!this.R || (W3 = W3()) == null) {
            return;
        }
        ((HomeFeedFragment) W3).r9(y0.ANDROID_HOME_FEED_TAKEOVER);
    }

    public final void f4(boolean z13) {
        e W3;
        if (((m60.d) this.E).f85891a.isBackgroundState()) {
            return;
        }
        if (isBound() && (W3 = W3()) != null) {
            ((HomeFeedFragment) W3).o9(u0.anim_speed_fastest);
        }
        if (isBound()) {
            ((HomeFeedFragment) ((e) getView())).l9();
        }
        e W32 = W3();
        if (W32 != null) {
            ((HomeFeedFragment) W32).E8(0, z13);
        }
        this.R = false;
        loadData();
    }

    @Override // rr0.g, sq0.e0
    public final int getItemViewType(int i13) {
        dl1.s item = getItem(i13);
        vh vhVar = item instanceof vh ? (vh) item : null;
        if (!Intrinsics.d(vhVar != null ? vhVar.q() : null, "anket_inline_survey")) {
            return Intrinsics.d(vhVar != null ? vhVar.q() : null, "shop_brand_story") ? RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE : ((vhVar == null || !vhVar.A()) && (vhVar == null || !vhVar.J()) && ((vhVar == null || !vhVar.V()) && !(vhVar != null && vhVar.M() && this.C.c()))) ? D3().getItemViewType(i13) : RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL;
        }
        kh e13 = ((vh) item).e();
        Integer l13 = e13 != null ? e13.l() : null;
        return (l13 != null && l13.intValue() == 1) ? RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW : RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN;
    }

    @Override // mz.g
    public final mz.b l0() {
        return new mz.b();
    }

    @Override // rr0.g, vq0.g
    public final void loadData() {
        super.loadData();
        this.Q = false;
        this.S = false;
        nl.b.k(((lb2.n) this.G).g(), "Failed to refresh accounts", is1.d.f73581k);
    }

    @Override // rr0.g, vq0.g, yk1.b
    public final void onActivate() {
        super.onActivate();
        wy0 f13 = ((b60.d) this.f101295J).f();
        if (f13 != null && Intrinsics.d(f13.u4(), Boolean.TRUE)) {
            V3();
        }
        u3(this.Z);
    }

    @Override // yk1.b
    public final void onDeactivate() {
        if (isBound()) {
            e W3 = W3();
            if (W3 != null) {
                HomeFeedFragment homeFeedFragment = (HomeFeedFragment) W3;
                se2.a aVar = homeFeedFragment.P0;
                if (aVar == null) {
                    Intrinsics.r("educationHelper");
                    throw null;
                }
                zf0.f fVar = (zf0.f) ((bf2.b) aVar).get();
                ur0.e eVar = homeFeedFragment.E1;
                fVar.getClass();
                zf0.f.a(eVar);
                homeFeedFragment.E1 = null;
                if (fVar.f141905b == i32.l.ANDROID_USM_HOMEFEED_PROMPTED_RENUX.getValue()) {
                    homeFeedFragment.f7().d(new dg0.c(dg0.b.DISMISS));
                }
            }
            e W32 = W3();
            if (W32 != null) {
                ((HomeFeedFragment) W32).u9();
            }
        }
        this.P = false;
        if (qb0.b.o(this.f109897i)) {
            return;
        }
        m60.w wVar = this.f109896h;
        q0 q0Var = this.Z;
        if (wVar.c(q0Var) && this.f109897i.remove(q0Var)) {
            wVar.j(q0Var);
        }
    }

    @Override // sq0.w
    public final void onLoadMoreSuppressed() {
    }

    @Override // rr0.g, vq0.g, sq0.a0
    public final void onRecyclerRefresh() {
        e W3 = W3();
        if (W3 != null) {
            ((HomeFeedFragment) W3).u9();
        }
        super.onRecyclerRefresh();
    }

    @Override // yk1.b
    public final void onRestore() {
        super.onRestore();
        this.P = true;
    }

    @Override // rr0.g, vq0.g, yk1.p, yk1.b
    public final void onUnbind() {
        e W3 = W3();
        if (W3 != null) {
            ((HomeFeedFragment) W3).f45770z1 = null;
        }
        e W32 = W3();
        if (W32 != null) {
            ((HomeFeedFragment) W32).f45768x1 = null;
        }
        super.onUnbind();
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }

    public final void updateSpinnerSeen() {
        if (!this.W && this.f109911w > 2) {
            this.O.b();
        }
        this.W = true;
    }

    @Override // rr0.g
    public final uj2.q x3() {
        return this.f101308z;
    }

    @Override // rr0.g
    public final Map z3() {
        p1 p1Var = this.C;
        p1Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) p1Var.f83456a;
        boolean z13 = g1Var.o("hfp_engaged_topic_tabs_local_nav_android", "enabled", z3Var) || g1Var.l("hfp_engaged_topic_tabs_local_nav_android");
        if (!this.Q && !this.S && !z13) {
            Map z33 = super.z3();
            Intrinsics.checkNotNullExpressionValue(z33, "getFirstPageRequestParams(...)");
            return z33;
        }
        HashMap hashMap = new HashMap(2);
        if (this.Q) {
            hashMap.put("HomeFeedRepository.REQUEST_PARAMS_KEY_INITIAL_HOME_FEED_REQUEST", Boolean.TRUE);
        }
        if (this.S) {
            hashMap.put("HomeFeedRepository.REQUEST_PARAMS_KEY_LOADING_HOME_FEED_POST_NUX", Boolean.TRUE);
        }
        Map map = this.T;
        if (map != null) {
            hashMap.put("HomeFeedRepository.REQUEST_PARAMS_KEY_NUX_SIGNALS_MAP", map);
        }
        if (z13) {
            hashMap.put("HomeFeedRepository.REQUEST_PARAMS_KEY_IN_LOCAL_NAV", Boolean.TRUE);
        }
        return hashMap;
    }
}
