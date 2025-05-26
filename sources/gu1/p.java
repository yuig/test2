package gu1;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import nt.w0;
import u50.r;

/* loaded from: classes4.dex */
public final class p extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final du1.a f66152c;

    /* renamed from: d, reason: collision with root package name */
    public final hu1.j f66153d;

    /* renamed from: e, reason: collision with root package name */
    public final y f66154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(du1.a navigationSEP, hu1.j navUserModelLoaderSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(navUserModelLoaderSEP, "navUserModelLoaderSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f66152c = navigationSEP;
        this.f66153d = navUserModelLoaderSEP;
        a0 a0Var = new a0(scope);
        w0 stateTransformer = new w0(new lt.j(27));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f66154e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f66154e.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f66154e.e();
    }
}
