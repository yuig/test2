package y52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.r f137784a;

    public c(lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f137784a = prefsManagerUser;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        b0 request = (b0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f137784a.h("board_preview_share_tooltip", request.f137783a);
    }
}
