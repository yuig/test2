package sa0;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import x02.i2;

/* loaded from: classes5.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final u62.t f112175a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f112176b;

    public j(u62.t delegate, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f112175a = delegate;
        this.f112176b = pinRepository;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        o request = (o) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof l) {
            kotlin.jvm.internal.j.z(scope, null, null, new g(request, this, eventIntake, scope, null), 3);
            return;
        }
        boolean z13 = request instanceof m;
        u62.t tVar = this.f112175a;
        if (z13) {
            l0.J0(l0.Q0(new h(eventIntake, null), tVar.f120883h), scope);
        } else if (request instanceof n) {
            l0.J0(l0.Q0(new i(eventIntake, null), tVar.f120885j), scope);
        } else if (request instanceof k) {
            tVar.e(((k) request).f112177a);
        }
    }
}
