package z31;

import ao2.j0;
import ao2.v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.h;
import u50.r;
import y31.e0;

/* loaded from: classes5.dex */
public final class b implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final d30.a f140796a;

    public b(d30.a verifiedMerchantService) {
        Intrinsics.checkNotNullParameter(verifiedMerchantService, "verifiedMerchantService");
        this.f140796a = verifiedMerchantService;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        e0 request = (e0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        j.z(scope, ko2.e.f80326c, null, new a(this, request, eventIntake, null), 2);
    }
}
