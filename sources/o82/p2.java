package o82;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p2 implements q {

    /* renamed from: a, reason: collision with root package name */
    public final l82.i0 f93688a;

    /* renamed from: b, reason: collision with root package name */
    public final o2 f93689b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93690c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.i f93691d;

    /* renamed from: e, reason: collision with root package name */
    public final Application f93692e;

    public p2(l82.i0 initialVMState, o2 stateRenderer, String tag, l82.i iVar, Application application) {
        Intrinsics.checkNotNullParameter(initialVMState, "initialVMState");
        Intrinsics.checkNotNullParameter(stateRenderer, "stateRenderer");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f93688a = initialVMState;
        this.f93689b = stateRenderer;
        this.f93690c = tag;
        this.f93691d = iVar;
        this.f93692e = application;
    }

    @Override // o82.q
    public final wt1.d b(ao2.j0 scope) {
        Application application;
        Intrinsics.checkNotNullParameter(scope, "scope");
        l82.a0 a0Var = new l82.a0(scope);
        nt.w0 stateTransformer = new nt.w0(this);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        l82.i iVar = this.f93691d;
        if (iVar != null && (application = this.f93692e) != null) {
            a0Var.c(iVar, application);
        }
        String tagged = "{" + this.f93690c + "}StableItemViewModel";
        Intrinsics.checkNotNullParameter(tagged, "tagged");
        l82.y b13 = l82.a0.b(a0Var, this.f93688a, null, 6);
        Intrinsics.checkNotNullParameter(b13, "<this>");
        return new bx0.j(b13);
    }
}
