package kd1;

import ao2.j0;
import bt0.u;
import com.pinterest.api.model.vh;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kv0.p;
import l82.a0;
import l82.y;
import lh0.x3;
import o82.i0;
import o82.i2;
import o82.s0;
import u50.r;
import w41.q1;
import yw0.n;
import zw0.s;
import zy.l0;
import zy.q0;

/* loaded from: classes5.dex */
public final class b extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final j0 f79230c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f79231d;

    /* renamed from: e, reason: collision with root package name */
    public final nu.b f79232e;

    /* renamed from: f, reason: collision with root package name */
    public final q0 f79233f;

    /* renamed from: g, reason: collision with root package name */
    public final g22.b f79234g;

    /* renamed from: h, reason: collision with root package name */
    public g01.a f79235h;

    /* renamed from: i, reason: collision with root package name */
    public y f79236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j0 scope, w60.d navigatorSEP, nu.b impressionSEP, q0 unscopedPinalyticsSEPFactory, g22.b storyFeedService, x3 shoppingExperiments) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(impressionSEP, "impressionSEP");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(storyFeedService, "storyFeedService");
        Intrinsics.checkNotNullParameter(shoppingExperiments, "shoppingExperiments");
        this.f79230c = scope;
        this.f79231d = navigatorSEP;
        this.f79232e = impressionSEP;
        this.f79233f = unscopedPinalyticsSEPFactory;
        this.f79234g = storyFeedService;
    }

    public static final g01.a h(b bVar, boolean z13) {
        g01.a aVar = bVar.f79235h;
        if (aVar != null) {
            return aVar;
        }
        p pVar = new p(4);
        if (z13) {
            q1 q1Var = new q1(8);
            u uVar = new u(25);
            g22.b storyFeedService = bVar.f79234g;
            Intrinsics.checkNotNullParameter(storyFeedService, "storyFeedService");
            p.b(pVar, q1Var, uVar, new s0(new i90.i(storyFeedService)), false, null, null, null, null, null, null, 1016);
        } else {
            p.b(pVar, new q1(9), new u(26), new o82.h(a.f79229a), false, null, null, null, null, null, null, 1016);
        }
        g01.a d2 = pVar.d();
        bVar.f79235h = d2;
        return d2;
    }

    @Override // l82.i
    public final do2.i a() {
        return i(false).d();
    }

    @Override // l82.i
    public final r c() {
        return i(false).e();
    }

    public final y i(boolean z13) {
        y yVar = this.f79236i;
        if (yVar != null) {
            return yVar;
        }
        a0 a0Var = new a0(this.f79230c);
        zw0.r stateTransformer = new zw0.r((i0) h(this, z13).f63224a, new lt.j(1));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        y a13 = a0Var.a();
        this.f79236i = a13;
        return a13;
    }

    public final void j(vh story, String clientTrackingParams, boolean z13) {
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        y i13 = i(z13);
        o82.j0 j0Var = new o82.j0(e0.b(new i2((Object) null, 3)));
        n nVar = n.DROPDOWN;
        l0 l0Var = new l0((h32.i0) null, 3);
        String uid = story.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        y.i(i13, new s(story, z13, j0Var, nVar, l0Var, clientTrackingParams, new o82.j0(e0.b(new i2(new g22.a(uid), 2)))), false, new r1.f(this, z13, 28), 2);
    }
}
