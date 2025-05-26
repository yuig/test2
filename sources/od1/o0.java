package od1;

import com.pinterest.api.model.f30;
import es.h;
import g4.u;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import lh0.n1;
import nr0.q;
import nx.d1;
import o82.i2;
import o82.m3;
import o82.s0;
import o82.s1;
import o82.t1;
import pk.a0;
import so.kb;

/* loaded from: classes5.dex */
public final class o0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final qd1.b f94157c;

    /* renamed from: d, reason: collision with root package name */
    public final gx.e f94158d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f94159e;

    /* renamed from: f, reason: collision with root package name */
    public final mb0.a f94160f;

    /* renamed from: g, reason: collision with root package name */
    public final p70.e f94161g;

    /* renamed from: h, reason: collision with root package name */
    public final nu.b f94162h;

    /* renamed from: i, reason: collision with root package name */
    public final g01.a f94163i;

    /* renamed from: j, reason: collision with root package name */
    public final l82.y f94164j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(qd1.b loggingSEP, gx.e navigationSEP, d1 trackingParamAttacher, zy.d0 pinalyticsSEP, pd1.e pageLoader, m90.z imagePreFetcherSEP, s1 sectionPerfLoggerSEPFactory, mb0.a stlLandingPageOneBarSEP, final es.a adFormats, final es.h adsCommonDisplay, p70.e pinLoaderSEP, nu.b impressionSEP, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(pageLoader, "pageLoader");
        Intrinsics.checkNotNullParameter(imagePreFetcherSEP, "imagePreFetcherSEP");
        Intrinsics.checkNotNullParameter(sectionPerfLoggerSEPFactory, "sectionPerfLoggerSEPFactory");
        Intrinsics.checkNotNullParameter(stlLandingPageOneBarSEP, "stlLandingPageOneBarSEP");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(pinLoaderSEP, "pinLoaderSEP");
        Intrinsics.checkNotNullParameter(impressionSEP, "impressionSEP");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f94157c = loggingSEP;
        this.f94158d = navigationSEP;
        this.f94159e = pinalyticsSEP;
        this.f94160f = stlLandingPageOneBarSEP;
        this.f94161g = pinLoaderSEP;
        this.f94162h = impressionSEP;
        kv0.p pVar = new kv0.p(4);
        Set set = pd1.c.f99804a;
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        m3 m3Var = new m3() { // from class: pd1.a
            @Override // o82.m3
            public final int a(int i13, i0 i0Var) {
                int a13;
                b item = (b) i0Var;
                es.a adFormats2 = es.a.this;
                Intrinsics.checkNotNullParameter(adFormats2, "$adFormats");
                h adsCommonDisplay2 = adsCommonDisplay;
                Intrinsics.checkNotNullParameter(adsCommonDisplay2, "$adsCommonDisplay");
                Intrinsics.checkNotNullParameter(item, "item");
                f30 f30Var = item.f99803a;
                Set set2 = c.f99804a;
                a13 = q.f91882a.a(f30Var, i13, u.y0().f103256a.e(), new j6.b(hf0.b.f69002b, hf0.b.f69003c, hf0.b.f69004d), n1.f83436b.c(), null, null, adFormats2, adsCommonDisplay2);
                return c.f99804a.contains(Integer.valueOf(a13)) ? a13 : a0.j0(f30Var);
            }
        };
        bt0.u uVar = new bt0.u(27);
        com.pinterest.boardAutoCollages.l0 b13 = t1.b();
        Intrinsics.checkNotNullParameter(pageLoader, "<this>");
        kv0.p.b(pVar, m3Var, uVar, new s0(pageLoader), false, b13, null, new gx.e(trackingParamAttacher, new gv0.b(this, 24)), imagePreFetcherSEP, null, ((kb) sectionPerfLoggerSEPFactory).a(s92.i.ALL_PINS), 296);
        g01.a d2 = pVar.d();
        this.f94163i = d2;
        l82.a0 a0Var = new l82.a0(scope);
        m0 stateTransformer = new m0(new lt.j(1), (o82.i0) d2.f63224a, new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        String tagged = o0.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(tagged, "getSimpleName(...)");
        Intrinsics.checkNotNullParameter(tagged, "tagged");
        this.f94164j = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f94164j.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f94164j.e();
    }

    public final void h(h32.i0 pinalyticsContext, String title, String pinId, Boolean bool, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        l82.y.i(this.f94164j, new n0(title, pinId, bool, str, str2, str3, str4, new o82.j0(new i2(new pd1.f(pinId, bool, str, str2, str3, str4, "0.0", "0.0", "0.0", "0.0"), 2)), new zy.l0(pinalyticsContext, 2)), false, new kc1.w(this, 17), 2);
    }
}
