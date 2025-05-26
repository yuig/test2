package w01;

import android.content.Context;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.md;
import com.pinterest.api.model.vh;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import h32.d4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z0;
import lh0.z3;
import rq.d3;
import rq.e3;
import so.h6;
import so.i6;
import so.o6;
import x02.i2;

/* loaded from: classes5.dex */
public final class f0 extends i01.c implements np0.f {
    public vh A;
    public final xk2.v B;

    /* renamed from: a, reason: collision with root package name */
    public final String f127008a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f127009b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.d f127010c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.f0 f127011d;

    /* renamed from: e, reason: collision with root package name */
    public final ze1.c f127012e;

    /* renamed from: f, reason: collision with root package name */
    public final uj2.q f127013f;

    /* renamed from: g, reason: collision with root package name */
    public final yk1.v f127014g;

    /* renamed from: h, reason: collision with root package name */
    public final xo0.o f127015h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f127016i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f127017j;

    /* renamed from: k, reason: collision with root package name */
    public final lh0.a0 f127018k;

    /* renamed from: l, reason: collision with root package name */
    public final no0.a f127019l;

    /* renamed from: m, reason: collision with root package name */
    public final is1.s f127020m;

    /* renamed from: n, reason: collision with root package name */
    public final es.a f127021n;

    /* renamed from: o, reason: collision with root package name */
    public final es.h f127022o;

    /* renamed from: p, reason: collision with root package name */
    public final vr.a f127023p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f127024q;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f127025r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f127026s;

    /* renamed from: t, reason: collision with root package name */
    public f30 f127027t;

    /* renamed from: u, reason: collision with root package name */
    public ic0.a f127028u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f127029v;

    /* renamed from: w, reason: collision with root package name */
    public kh2.d f127030w;

    /* renamed from: x, reason: collision with root package name */
    public final m60.w f127031x;

    /* renamed from: y, reason: collision with root package name */
    public final np0.e f127032y;

    /* renamed from: z, reason: collision with root package name */
    public xj2.b f127033z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String pinUid, i2 pinRepo, uk1.d presenterPinalytics, nx.f0 pinalyticsFactory, ze1.c shoppingNavParams, uj2.q networkStateStream, yk1.v viewResources, xo0.o bubbleImpressionLogger, Function0 commerceAuxData, boolean z13, lh0.a0 experiments, no0.a shoppingModuleRetrofitRemoteRequest, is1.t pinSwipePreferences, es.a adFormats, es.h adsCommonDisplay, vr.a adsCommonAnalytics) {
        super(0);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinRepo, "pinRepo");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(shoppingNavParams, "shoppingNavParams");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(shoppingModuleRetrofitRemoteRequest, "shoppingModuleRetrofitRemoteRequest");
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "pinSwipePreferences");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        this.f127008a = pinUid;
        this.f127009b = pinRepo;
        this.f127010c = presenterPinalytics;
        this.f127011d = pinalyticsFactory;
        this.f127012e = shoppingNavParams;
        this.f127013f = networkStateStream;
        this.f127014g = viewResources;
        this.f127015h = bubbleImpressionLogger;
        this.f127016i = commerceAuxData;
        this.f127017j = z13;
        this.f127018k = experiments;
        this.f127019l = shoppingModuleRetrofitRemoteRequest;
        this.f127020m = pinSwipePreferences;
        this.f127021n = adFormats;
        this.f127022o = adsCommonDisplay;
        this.f127023p = adsCommonAnalytics;
        this.f127025r = new LinkedHashMap();
        this.f127026s = new LinkedHashMap();
        m60.w wVar = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f127031x = wVar;
        this.f127032y = new np0.e(pinRepo);
        this.f127033z = new xj2.b();
        this.B = xk2.m.b(m.f127059m);
    }

    public static void q3(f0 f0Var, boolean z13) {
        f0Var.f127031x.d(new a(null, f0Var.f127008a));
    }

    @Override // np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        String lowerCase = d4.FEED.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        v4(pinUid, pinFeed, i13, i14, new i01.d(str, lowerCase, null, "shop_the_look_module"));
    }

    @Override // yk1.b
    public final void clearDisposables() {
        if (this.f127030w instanceof c0) {
            this.f127030w = null;
        }
        if (isBound()) {
            this.f127033z.d();
        }
        super.clearDisposables();
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        i01.b0 view = (i01.b0) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((e3) view).C = this;
        if (this.f127017j) {
            vh vhVar = this.A;
            if (vhVar != null) {
                s3(vhVar);
                return;
            }
            return;
        }
        f30 f30Var = this.f127027t;
        if (f30Var != null) {
            r3(f30Var, this.f127029v);
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        super.onUnbind();
        if (this.f127030w instanceof c0) {
            this.f127030w = null;
        } else {
            if (isBound()) {
                return;
            }
            this.f127033z.dispose();
            this.f127033z = new xj2.b();
        }
    }

    public final void p3(vh story) {
        uk1.d f13;
        if (story.q() == null || (Intrinsics.d(story.q(), "product_tagged_shopping_module_upsell") && story.f42865w.isEmpty())) {
            if (isBound()) {
                ((e3) ((i01.b0) getView())).f109166o.removeAllViews();
            }
            q3(this, false);
            return;
        }
        lh0.a0 a0Var = this.f127018k;
        ((g1) a0Var.f83294a).c("android_closeup_optimize_shopping_module_load");
        sq0.f fVar = (sq0.f) this.B.getValue();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(story, "model");
        fVar.m(0, 1, sq0.y.DOWN, kotlin.collections.e0.b(story));
        boolean z13 = story.z();
        String pinUid = this.f127008a;
        z0 z0Var = a0Var.f83294a;
        if (z13 || story.x() || story.D()) {
            g1 g1Var = (g1) z0Var;
            if (!g1Var.o("android_structured_feed_migration_closeup_aom", "enabled", a4.f83298b) && !g1Var.l("android_structured_feed_migration_closeup_aom")) {
                q3(this, true);
                if (isBound()) {
                    if (story.D()) {
                        e3 e3Var = (e3) ((i01.b0) getView());
                        e3Var.getClass();
                        Intrinsics.checkNotNullParameter(story, "story");
                        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                        if (e3Var.f109177z == null && e3Var.f109174w == null) {
                            e3Var.b();
                            o6 o6Var = e3Var.f109161j;
                            if (o6Var == null) {
                                Intrinsics.r("adsStlShoppingModuleViewFactory");
                                throw null;
                            }
                            Context context = e3Var.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            nx.d0 d0Var = e3Var.f109153b;
                            ao2.j0 j0Var = e3Var.f109154c;
                            e3Var.f109177z = o6Var.a(context, d0Var, j0Var);
                            gx.o oVar = e3Var.f109162k;
                            if (oVar == null) {
                                Intrinsics.r("adsStlShoppingModuleViewModelFactory");
                                throw null;
                            }
                            gx.p a13 = ((h6) oVar).a(d0Var, j0Var);
                            a13.b(new gx.k(story, pinUid), true);
                            gx.m mVar = e3Var.f109177z;
                            if (mVar != null) {
                                mVar.f66267g = a13.f66277e.e();
                                kotlin.jvm.internal.j.z(j0Var, null, null, new d3(a13, mVar, null), 3);
                                e3Var.i().addView(mVar);
                                e3Var.f109166o.setBackground(null);
                                mVar.f66268h.f100196o.setVisibility(8);
                                j1.A0(mVar.f66268h.f100195n);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    e3 e3Var2 = (e3) ((i01.b0) getView());
                    e3Var2.getClass();
                    Intrinsics.checkNotNullParameter(story, "story");
                    if (e3Var2.f109176y == null && e3Var2.f109174w == null) {
                        e3Var2.b();
                        Context context2 = e3Var2.getContext();
                        f30 pin = e3Var2.getPin();
                        String uid = pin != null ? pin.getUid() : null;
                        Intrinsics.f(context2);
                        e3Var2.f109176y = new pi0.f(context2, e3Var2.f109153b, e3Var2.f109154c, uid, 16);
                        ni0.e eVar = e3Var2.f109160i;
                        if (eVar == null) {
                            Intrinsics.r("adsCarouselPresenterFactory");
                            throw null;
                        }
                        uj2.q qVar = e3Var2.f109158g;
                        if (qVar == null) {
                            Intrinsics.r("networkStateStream");
                            throw null;
                        }
                        f13 = ((uk1.a) e3Var2.getPresenterPinalyticsFactory()).f(e3Var2.f109153b, "");
                        ni0.d a14 = ((i6) eVar).a(f13, qVar);
                        pi0.f fVar2 = e3Var2.f109176y;
                        if (fVar2 != null) {
                            yk1.j jVar = e3Var2.f109159h;
                            if (jVar == null) {
                                Intrinsics.r("mvpBinder");
                                throw null;
                            }
                            jVar.d(fVar2, a14);
                            a14.I3(0, story, fVar2);
                            e3Var2.i().addView(fVar2);
                            fVar2.f100196o.setVisibility(8);
                            j1.A0(fVar2.f100195n);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!story.C()) {
            q3(this, true);
            s3(story);
            return;
        }
        g1 g1Var2 = (g1) z0Var;
        if (!g1Var2.o("android_ads_rp_3p_qcm", "enabled", a4.f83298b) && !g1Var2.l("android_ads_rp_3p_qcm")) {
            q3(this, true);
            return;
        }
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        ew.o("qcm:" + pinUid, story);
        this.f127031x.d(new a(story, pinUid));
    }

    public final void r3(f30 updatedPin, boolean z13) {
        List list;
        List m13;
        kh2.d dVar;
        f30 f30Var;
        i01.b0 b0Var;
        i01.m mVar;
        Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
        this.f127027t = updatedPin;
        this.f127029v = z13;
        if (isBound()) {
            lh0.a0 a0Var = this.f127018k;
            a0Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) a0Var.f83294a;
            final int i13 = 1;
            final int i14 = 0;
            boolean z14 = g1Var.o("android_closeup_optimize_shopping_module_load", "enabled", z3Var) || g1Var.l("android_closeup_optimize_shopping_module_load");
            if (this.f127017j || ((!this.f127029v && ((b0Var = (i01.b0) getViewIfBound()) == null || (mVar = ((e3) b0Var).f109155d) == null || !((PinCloseupFragment) mVar).f91282J || !z14)) || (((dVar = this.f127030w) != null && !(dVar instanceof b0)) || (f30Var = this.f127027t) == null || !Intrinsics.d(f30Var.d5(), Boolean.FALSE)))) {
                kh2.d dVar2 = this.f127030w;
                boolean z15 = dVar2 instanceof d0;
                Integer num = null;
                d0 d0Var = z15 ? (d0) dVar2 : null;
                vh vhVar = d0Var != null ? d0Var.f126994a : null;
                boolean d2 = Intrinsics.d(vhVar != null ? vhVar.q() : null, "product_tagged_shopping_module_upsell");
                md O3 = updatedPin.O3();
                Integer valueOf = (O3 == null || (m13 = O3.m()) == null) ? null : Integer.valueOf(m13.size());
                if (vhVar != null && (list = vhVar.f42865w) != null) {
                    num = Integer.valueOf(list.size());
                }
                boolean z16 = !Intrinsics.d(valueOf, num);
                if (!z15 || !d2 || !z16) {
                    kh2.d dVar3 = this.f127030w;
                    if (dVar3 instanceof d0) {
                        Intrinsics.g(dVar3, "null cannot be cast to non-null type com.pinterest.feature.pin.closeup.presenter.PinCloseupShoppingModulePresenter.DataLoadState.Success");
                        vh vhVar2 = ((d0) dVar3).f126994a;
                        if (vhVar2 != null) {
                            p3(vhVar2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            f30 f30Var2 = this.f127027t;
            if (f30Var2 == null || (this.f127030w instanceof c0)) {
                return;
            }
            this.f127030w = c0.f126985a;
            xj2.b bVar = this.f127033z;
            String uid = f30Var2.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            ze1.c cVar = this.f127012e;
            bVar.a(this.f127019l.b(new u01.y(uid, cVar.f141808a, cVar.f141809b)).execute(new ak2.e(this) { // from class: w01.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f0 f126956b;

                {
                    this.f126956b = this;
                }

                @Override // ak2.e
                public final void accept(Object obj) {
                    int i15 = i14;
                    f0 this$0 = this.f126956b;
                    switch (i15) {
                        case 0:
                            vh vhVar3 = (vh) obj;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f127030w = new d0(vhVar3);
                            if (vhVar3 == null) {
                                f0.q3(this$0, false);
                                break;
                            } else {
                                List list2 = vhVar3.f42865w;
                                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                                ((vr.b) this$0.f127023p).h(list2);
                                this$0.p3(vhVar3);
                                break;
                            }
                        default:
                            Throwable error = (Throwable) obj;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            f0.q3(this$0, false);
                            Intrinsics.f(error);
                            Intrinsics.checkNotNullParameter(error, "error");
                            this$0.f127030w = new b0();
                            break;
                    }
                }
            }, new ak2.e(this) { // from class: w01.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f0 f126956b;

                {
                    this.f126956b = this;
                }

                @Override // ak2.e
                public final void accept(Object obj) {
                    int i15 = i13;
                    f0 this$0 = this.f126956b;
                    switch (i15) {
                        case 0:
                            vh vhVar3 = (vh) obj;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f127030w = new d0(vhVar3);
                            if (vhVar3 == null) {
                                f0.q3(this$0, false);
                                break;
                            } else {
                                List list2 = vhVar3.f42865w;
                                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                                ((vr.b) this$0.f127023p).h(list2);
                                this$0.p3(vhVar3);
                                break;
                            }
                        default:
                            Throwable error = (Throwable) obj;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            f0.q3(this$0, false);
                            Intrinsics.f(error);
                            Intrinsics.checkNotNullParameter(error, "error");
                            this$0.f127030w = new b0();
                            break;
                    }
                }
            }));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s3(com.pinterest.api.model.vh r44) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w01.f0.s3(com.pinterest.api.model.vh):void");
    }

    @Override // np0.f
    public final void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.i0.f50929g.getValue(), pinUid);
        String f13 = metadataProvider.f();
        String z13 = metadataProvider.z();
        int y13 = metadataProvider.y();
        ArrayList w13 = metadataProvider.w();
        nx.d0 d0Var = this.f127010c.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        bs1.c.j(z03, pinFeed, i13, f13, z13, y13, w13, "pin", d0Var, null);
        z03.m0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE", "shop_the_look_module");
        this.f127031x.d(z03);
    }
}
