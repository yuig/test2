package tx0;

import android.app.Application;
import ao2.j0;
import com.pinterest.boardAutoCollages.k0;
import kotlin.jvm.internal.Intrinsics;
import o82.i0;
import o82.s0;

/* loaded from: classes5.dex */
public final class a0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final w12.b f119638c;

    /* renamed from: d, reason: collision with root package name */
    public final mb0.a f119639d;

    /* renamed from: e, reason: collision with root package name */
    public final mb0.a f119640e;

    /* renamed from: f, reason: collision with root package name */
    public final g01.a f119641f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.y f119642g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(w12.b newsHubService, mb0.a newsTypeFilterSEP, mb0.a experimentActivationSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(newsHubService, "newsHubService");
        Intrinsics.checkNotNullParameter(newsTypeFilterSEP, "newsTypeFilterSEP");
        Intrinsics.checkNotNullParameter(experimentActivationSEP, "experimentActivationSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f119638c = newsHubService;
        this.f119639d = newsTypeFilterSEP;
        this.f119640e = experimentActivationSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new k0(18), new bt0.u(5), new s0(new i90.i(newsHubService)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f119641f = d2;
        l82.a0 a0Var = new l82.a0(scope);
        x stateTransformer = new x((i0) d2.f63224a, 0);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f119642g = l82.a0.b(a0Var, new y(false, w12.a.None, new o82.j0()), new dx0.d(this, 6), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f119642g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f119642g.e();
    }
}
