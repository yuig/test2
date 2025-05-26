package p90;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 extends l82.b implements wt1.d {

    /* renamed from: c, reason: collision with root package name */
    public final sa0.j f99243c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.y f99244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(sa0.j sep, androidx.lifecycle.u scope, Application application) {
        super(scope);
        Intrinsics.checkNotNullParameter(sep, "sep");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f99243c = sep;
        l82.a0 a0Var = new l82.a0(scope);
        sa0.r stateTransformer = new sa0.r();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f99244d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f99244d.d();
    }

    @Override // wt1.d
    public final u50.o b(l82.i0 i0Var, boolean z13) {
        sa0.s startState = (sa0.s) i0Var;
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (sa0.a) this.f99244d.h(startState, z13, new n0(this, 2));
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f99244d.e();
    }
}
