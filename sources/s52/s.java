package s52;

import android.app.Application;
import ao2.j0;
import ao2.v0;
import com.pinterest.boardAutoCollages.l0;
import com.pinterest.feature.unauth.sba.q0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import m90.z;
import nx.d1;
import o82.i0;
import o82.j3;
import o82.s0;
import o82.t1;
import r52.c0;
import w41.q1;
import zy.d0;

/* loaded from: classes4.dex */
public final class s extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final d0 f111203c;

    /* renamed from: d, reason: collision with root package name */
    public final i92.k f111204d;

    /* renamed from: e, reason: collision with root package name */
    public final tb0.h f111205e;

    /* renamed from: f, reason: collision with root package name */
    public final nu.a f111206f;

    /* renamed from: g, reason: collision with root package name */
    public final w60.d f111207g;

    /* renamed from: h, reason: collision with root package name */
    public final i60.a f111208h;

    /* renamed from: i, reason: collision with root package name */
    public final j0 f111209i;

    /* renamed from: j, reason: collision with root package name */
    public final g01.a f111210j;

    /* renamed from: k, reason: collision with root package name */
    public final y f111211k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(d1 trackingParamAttacher, z imagePrefetcherSEP, d0 pinalyticsSEP, i90.i boardPinsPageLoader, Application application, i92.k toastUtils, tb0.h crashReporting, nu.a toastSEP, w60.d navigatorSEP, i60.a shareBoardPinSelectionLoggingSEP, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(imagePrefetcherSEP, "imagePrefetcherSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(boardPinsPageLoader, "boardPinsPageLoader");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(shareBoardPinSelectionLoggingSEP, "shareBoardPinSelectionLoggingSEP");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f111203c = pinalyticsSEP;
        this.f111204d = toastUtils;
        this.f111205e = crashReporting;
        this.f111206f = toastSEP;
        this.f111207g = navigatorSEP;
        this.f111208h = shareBoardPinSelectionLoggingSEP;
        this.f111209i = scope;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(17), new q0(5), new s0(boardPinsPageLoader, new q52.d()), false, t1.b(), null, new gx.e(trackingParamAttacher, new jq1.b(this, 7)), imagePrefetcherSEP, null, null, 808);
        kv0.p.b(pVar, new q1(18), new q0(6), new j3(e0.b(new q())), false, new l0(13), null, null, null, null, null, 1000);
        g01.a d2 = pVar.d();
        this.f111210j = d2;
        a0 a0Var = new a0(scope);
        c0 stateTransformer = new c0((i0) d2.f63224a, new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f111211k = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f111211k.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f111211k.e();
    }

    public final void h(p args, h32.i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(this.f111209i, ((bo2.e) ho2.q.f69782a).f23612f, null, new r(args, pinalyticsContext, this, null), 2);
    }
}
