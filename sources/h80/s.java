package h80;

import android.app.Application;
import ao2.j0;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import zy.l0;

/* loaded from: classes5.dex */
public final class s extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final i80.b f68119c;

    /* renamed from: d, reason: collision with root package name */
    public final i80.b f68120d;

    /* renamed from: e, reason: collision with root package name */
    public final i60.a f68121e;

    /* renamed from: f, reason: collision with root package name */
    public final y f68122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i80.b imageOutpaintSEP, i80.b loadOutpaintStylesSEP, i60.a loggingSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(imageOutpaintSEP, "imageOutpaintSEP");
        Intrinsics.checkNotNullParameter(loadOutpaintStylesSEP, "loadOutpaintStylesSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f68119c = imageOutpaintSEP;
        this.f68120d = loadOutpaintStylesSEP;
        this.f68121e = loggingSEP;
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(6, "stateTransformer");
        a0Var.c(this, application);
        this.f68122f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f68122f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f68122f.e();
    }

    public final void h(i0 pinalyticsContext, String pinId, String imageSignature) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(imageSignature, "imageSignature");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        y.i(this.f68122f, new r(pinId, imageSignature, new l0(pinalyticsContext, 2)), false, new mz.c(this, 16), 2);
    }
}
