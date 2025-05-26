package sa0;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final t72.j f112200a;

    public y(t72.j createShuffleAssetUseCase) {
        Intrinsics.checkNotNullParameter(createShuffleAssetUseCase, "createShuffleAssetUseCase");
        this.f112200a = createShuffleAssetUseCase;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        f0 request = (f0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof e0) {
            kotlin.jvm.internal.j.z(scope, null, null, new x(eventIntake, this, request, null), 3);
        }
    }
}
