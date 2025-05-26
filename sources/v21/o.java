package v21;

import ao2.j0;
import ao2.v0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final w21.b0 f123890a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.j f123891b;

    public o(w21.b0 pinOrSpinSelectionRepository, ll.j screenNavigator) {
        Intrinsics.checkNotNullParameter(pinOrSpinSelectionRepository, "pinOrSpinSelectionRepository");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        this.f123890a = pinOrSpinSelectionRepository;
        this.f123891b = screenNavigator;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        z request = (z) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof q) {
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new l(this, null), 2);
        } else if (request instanceof w) {
            ko2.f fVar2 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new m(this, null), 2);
        } else if (request instanceof x) {
            ko2.f fVar3 = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new n(this, request, null), 2);
        }
    }
}
