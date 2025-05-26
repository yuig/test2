package o82;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final r f93605a;

    /* renamed from: b, reason: collision with root package name */
    public ao2.k2 f93606b;

    public h(r fetcher) {
        Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        this.f93605a = fetcher;
    }

    public static final Object j(u50.r rVar, h hVar, Object obj, bl2.c cVar) {
        hVar.getClass();
        ko2.f fVar = ao2.v0.f20219a;
        Object M = kotlin.jvm.internal.j.M(cVar, ko2.e.f80326c, new d(rVar, hVar, obj, null));
        return M == cl2.a.COROUTINE_SUSPENDED ? M : Unit.f80348a;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        d2 request = (d2) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof v1) {
            ao2.k2 k2Var = this.f93606b;
            if (k2Var != null) {
                k2Var.cancel((CancellationException) null);
            }
            this.f93606b = kotlin.jvm.internal.j.z(scope, null, null, new e(this, eventIntake, request, null), 3);
            return;
        }
        if (request instanceof x1) {
            ao2.k2 k2Var2 = this.f93606b;
            if (k2Var2 != null) {
                k2Var2.cancel((CancellationException) null);
            }
            this.f93606b = kotlin.jvm.internal.j.z(scope, null, null, new f(this, eventIntake, request, null), 3);
            return;
        }
        if (request instanceof b2) {
            ao2.k2 k2Var3 = this.f93606b;
            if (k2Var3 != null) {
                k2Var3.cancel((CancellationException) null);
            }
            this.f93606b = kotlin.jvm.internal.j.z(scope, null, null, new g(this, eventIntake, request, null), 3);
        }
    }
}
