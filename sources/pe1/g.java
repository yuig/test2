package pe1;

import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import java.util.List;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;
import m60.w;
import nx.b0;
import nx.d1;
import nx.f0;
import qa2.h0;
import x02.i2;
import xk2.v;

/* loaded from: classes5.dex */
public final class g extends r {

    /* renamed from: a0, reason: collision with root package name */
    public final hd1.c f99939a0;

    /* renamed from: b0, reason: collision with root package name */
    public final d1 f99940b0;

    /* renamed from: c0, reason: collision with root package name */
    public final w f99941c0;

    /* renamed from: d0, reason: collision with root package name */
    public final i2 f99942d0;

    /* renamed from: e0, reason: collision with root package name */
    public final com.pinterest.feature.pin.r f99943e0;

    /* renamed from: f0, reason: collision with root package name */
    public final uk1.d f99944f0;

    /* renamed from: g0, reason: collision with root package name */
    public final c2 f99945g0;

    /* renamed from: h0, reason: collision with root package name */
    public final k11.c f99946h0;

    /* renamed from: i0, reason: collision with root package name */
    public final xj2.b f99947i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f99948j0;

    /* renamed from: k0, reason: collision with root package name */
    public final v f99949k0;

    /* renamed from: l0, reason: collision with root package name */
    public final v f99950l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hd1.c listParams, String str, a11.d clickThroughHelperFactory, d1 trackingParamAttacher, w eventManager, il1.a fragmentFactory, i2 pinRepository, com.pinterest.feature.pin.r repinAnimationUtil, uk1.d presenterPinalytics, c2 repinToastHelper, k11.c easyGiftGuideUpsellUtilFactory, String trafficSource, f4 sfExperiments, f0 pinalyticsFactory, lb0.r prefsManagerUser, b0 pinAuxHelper) {
        super(listParams, str, clickThroughHelperFactory, trackingParamAttacher, eventManager, fragmentFactory, pinRepository, repinAnimationUtil, trafficSource, pinAuxHelper);
        Intrinsics.checkNotNullParameter(listParams, "listParams");
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(repinToastHelper, "repinToastHelper");
        Intrinsics.checkNotNullParameter(easyGiftGuideUpsellUtilFactory, "easyGiftGuideUpsellUtilFactory");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        Intrinsics.checkNotNullParameter(sfExperiments, "sfExperiments");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f99939a0 = listParams;
        this.f99940b0 = trackingParamAttacher;
        this.f99941c0 = eventManager;
        this.f99942d0 = pinRepository;
        this.f99943e0 = repinAnimationUtil;
        this.f99944f0 = presenterPinalytics;
        this.f99945g0 = repinToastHelper;
        this.f99946h0 = easyGiftGuideUpsellUtilFactory;
        this.f99947i0 = new xj2.b();
        this.f99948j0 = pinRepository.t();
        this.f99949k0 = xk2.m.b(new ee1.d(this, 1));
        this.f99950l0 = xk2.m.b(new p91.v(15, this, pinAuxHelper));
        o(30, new se1.c(listParams.f68886c, listParams.f68887d, new ze1.c((String) null, 3), sfExperiments, listParams.f68901r, listParams.f68889f, pinalyticsFactory, null, false, false, null, prefsManagerUser, trafficSource, 8064));
    }

    public static final void k0(g gVar, f30 f30Var) {
        int i13 = 0;
        for (Object obj : gVar.d()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            dl1.s sVar = (dl1.s) obj;
            if ((sVar instanceof f30) && Intrinsics.d(((f30) sVar).getUid(), f30Var.getUid())) {
                gVar.u1(i13, f30Var);
                return;
            }
            if (u2.H0(sVar)) {
                List list = ((vh) sVar).f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                int i15 = 0;
                for (Object obj2 : list) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    dl1.s sVar2 = (dl1.s) obj2;
                    if ((sVar2 instanceof f30) && Intrinsics.d(((f30) sVar2).getUid(), f30Var.getUid())) {
                        gb2.f fVar = gb2.f.f64747a;
                        String uid = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        gb2.f.c(new gb2.j(uid, String.valueOf(f30Var.z4())));
                        return;
                    }
                    i15 = i16;
                }
            }
            i13 = i14;
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, wk1.e
    public final void E2() {
        super.E2();
        this.f99947i0.a(this.f99942d0.E(this.f99948j0).F(new vd1.a(2, new kc1.w(this, 26)), new vd1.a(3, f.f99938i), ck2.i.f27923c, ck2.i.f27924d));
    }

    @Override // pe1.r, mj0.g
    public final boolean a6(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return ((oj0.g) this.f99950l0.getValue()).a6(pin);
    }

    @Override // pe1.r, mj0.g
    public final void l2(f30 pin, h0 h0Var) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        ((oj0.g) this.f99950l0.getValue()).l2(pin, h0Var);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, wk1.e
    public final void onUnbind() {
        ((oj0.g) this.f99950l0.getValue()).c();
        this.f99947i0.dispose();
        super.onUnbind();
    }
}
