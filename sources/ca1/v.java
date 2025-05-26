package ca1;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import n91.z;
import tx0.x;
import zy.d0;
import zy.l0;

/* loaded from: classes5.dex */
public final class v extends l82.b implements l82.i {

    /* renamed from: f, reason: collision with root package name */
    public static final z f27227f = new z(7, 0);

    /* renamed from: c, reason: collision with root package name */
    public final da1.c f27228c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f27229d;

    /* renamed from: e, reason: collision with root package name */
    public final y f27230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Application application, j0 scope, da1.c claimMigrationSEP, d0 pinalyticsSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(claimMigrationSEP, "claimMigrationSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        this.f27228c = claimMigrationSEP;
        this.f27229d = pinalyticsSEP;
        a0 a0Var = new a0(scope);
        x stateTransformer = new x(new lt.j(2), 2);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f27230e = a0.b(a0Var, new u(new l0(f27227f.e(), 2)), new q91.h(this, 16), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f27230e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f27230e.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        da1.c cVar = this.f27228c;
        int i13 = cVar.f54228a;
        Object obj = cVar.f54231d;
        switch (i13) {
            case 0:
                ((xj2.b) obj).dispose();
                break;
            default:
                ((xj2.b) obj).dispose();
                break;
        }
        super.g();
    }
}
