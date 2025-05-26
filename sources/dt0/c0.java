package dt0;

import android.app.Application;
import ao2.j0;
import com.pinterest.boardAutoCollages.k0;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;
import o82.i0;
import o82.i2;
import o82.j3;
import o82.s0;
import o82.t1;
import zy.l0;

/* loaded from: classes5.dex */
public final class c0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final zy.d0 f56230c;

    /* renamed from: d, reason: collision with root package name */
    public final at0.b f56231d;

    /* renamed from: e, reason: collision with root package name */
    public final nu.a f56232e;

    /* renamed from: f, reason: collision with root package name */
    public final i60.a f56233f;

    /* renamed from: g, reason: collision with root package name */
    public final g01.a f56234g;

    /* renamed from: h, reason: collision with root package name */
    public final l82.y f56235h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Application application, j0 scope, zs0.c activityPinsPageLoader, zy.d0 pinalyticsSEP, at0.b privacyAndDataSEP, nu.a eventManagerSEP, i60.a hftPinsLoggingSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(activityPinsPageLoader, "activityPinsPageLoader");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(privacyAndDataSEP, "privacyAndDataSEP");
        Intrinsics.checkNotNullParameter(eventManagerSEP, "eventManagerSEP");
        Intrinsics.checkNotNullParameter(hftPinsLoggingSEP, "hftPinsLoggingSEP");
        this.f56230c = pinalyticsSEP;
        this.f56231d = privacyAndDataSEP;
        this.f56232e = eventManagerSEP;
        this.f56233f = hftPinsLoggingSEP;
        kv0.p pVar = new kv0.p(4);
        j3 j3Var = new j3(e0.b(new b0()));
        int i13 = 3;
        kv0.p.b(pVar, new k0(16), new bt0.u(i13), j3Var, true, t1.a(), null, null, null, null, null, 992);
        k0 k0Var = new k0(17);
        bt0.u uVar = new bt0.u(4);
        Intrinsics.checkNotNullParameter(activityPinsPageLoader, "<this>");
        kv0.p.b(pVar, k0Var, uVar, new s0(activityPinsPageLoader), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f56234g = d2;
        l82.a0 a0Var = new l82.a0(scope);
        z stateTransformer = new z((i0) d2.f63224a);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        Object obj = null;
        this.f56235h = l82.a0.b(a0Var, new a0(ts0.b.All, false, new l0((h32.i0) null, 3), new o82.j0(f0.j(new i2(obj, i13), new i2(obj, i13)))), new f1(this, 24), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f56235h.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f56235h.e();
    }
}
