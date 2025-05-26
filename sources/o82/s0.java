package o82;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s0 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f93706a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.g0 f93707b;

    /* renamed from: c, reason: collision with root package name */
    public String f93708c;

    /* renamed from: d, reason: collision with root package name */
    public int f93709d;

    /* renamed from: e, reason: collision with root package name */
    public ao2.k2 f93710e;

    public s0(k0 pageLoader, m60.g0 pageSizeProvider) {
        Intrinsics.checkNotNullParameter(pageLoader, "pageLoader");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        this.f93706a = pageLoader;
        this.f93707b = pageSizeProvider;
        this.f93709d = Integer.parseInt(pageSizeProvider.d());
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        d2 request = (d2) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof v1) {
            j(scope, new o0(this, eventIntake, request, null));
        } else if (request instanceof x1) {
            j(scope, new p0(this, eventIntake, request, null));
        } else if (request instanceof b2) {
            j(scope, new q0(this, eventIntake, request, null));
        }
    }

    public final void j(ao2.j0 j0Var, Function1 function1) {
        ao2.k2 k2Var = this.f93710e;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        this.f93710e = kotlin.jvm.internal.j.z(j0Var, null, null, new r0(function1, null), 3);
    }

    public /* synthetic */ s0(k0 k0Var) {
        this(k0Var, new m60.h0(hf0.b.q()));
    }
}
