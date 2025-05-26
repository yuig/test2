package lt;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import u50.r;

/* loaded from: classes3.dex */
public final class m extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final j f84756c;

    /* renamed from: d, reason: collision with root package name */
    public final g f84757d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f84758e;

    /* renamed from: f, reason: collision with root package name */
    public final Application f84759f;

    /* renamed from: g, reason: collision with root package name */
    public final y f84760g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j stateTransformer, g adsGmaCloseupSEP, j0 scope, Application application, i stateEngineBuilder) {
        super(scope);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        Intrinsics.checkNotNullParameter(adsGmaCloseupSEP, "adsGmaCloseupSEP");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(stateEngineBuilder, "stateEngineBuilder");
        this.f84756c = stateTransformer;
        this.f84757d = adsGmaCloseupSEP;
        this.f84758e = scope;
        this.f84759f = application;
        l buildEngine = new l(this, 0);
        stateEngineBuilder.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(buildEngine, "buildEngine");
        a0 a0Var = new a0(scope);
        buildEngine.invoke(a0Var);
        this.f84760g = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f84760g.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f84760g.e();
    }

    public final void h(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        k kVar = new k(pinId, null, null);
        l lVar = new l(this, 1);
        y yVar = this.f84760g;
        y.i(yVar, kVar, false, lVar, 2);
        this.f84757d.e(this.f84758e, new h(pinId), yVar.e());
    }
}
