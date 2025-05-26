package ub1;

import android.app.Application;
import ao2.j0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.notifications.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final vb1.c f121709c;

    /* renamed from: d, reason: collision with root package name */
    public final k92.l f121710d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f121711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Application application, j0 scope, vb1.c contentPermissionsSEP, k92.l toastSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(contentPermissionsSEP, "contentPermissionsSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        this.f121709c = contentPermissionsSEP;
        this.f121710d = toastSEP;
        l82.a0 a0Var = new l82.a0(scope);
        y stateTransformer = new y();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f121711e = l82.a0.b(a0Var, new z(wy0.a.DISABLED, false), new y0(this, 11), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f121711e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f121711e.e();
    }
}
