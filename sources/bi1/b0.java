package bi1;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import tu.d0;
import x02.i2;

/* loaded from: classes5.dex */
public final class b0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final d0 f22832c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f22833d;

    /* renamed from: e, reason: collision with root package name */
    public final co0.c f22834e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f22835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Application application, j0 scope, d0 videoFullScreenSEP, i2 pinRepository) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(videoFullScreenSEP, "videoFullScreenSEP");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f22832c = videoFullScreenSEP;
        this.f22833d = pinRepository;
        this.f22834e = new co0.c(this, 2);
        l82.a0 a0Var = new l82.a0(scope);
        a0Var.f82204b = d7.g.n(23, "stateTransformer");
        a0Var.c(this, application);
        this.f22835f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f22835f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f22835f.e();
    }

    public final void h(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        l82.y.i(this.f22835f, new z(pinId), false, new a0(this, 0), 2);
        this.f22833d.L(pinId).s().p(this.f22834e);
    }
}
