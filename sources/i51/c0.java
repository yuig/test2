package i51;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f71581a;

    /* renamed from: b, reason: collision with root package name */
    public final k22.m f71582b;

    /* renamed from: c, reason: collision with root package name */
    public final x10.d f71583c;

    public c0(m60.w eventManager, k22.m userService, x10.d settingsApi) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        this.f71581a = eventManager;
        this.f71582b = userService;
        this.f71583c = settingsApi;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        t request = (t) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        String str = request.f71604a;
        uv0.a aVar = new uv0.a(7, this, eventIntake);
        this.f71581a.d(new jc0.v(new zp.v(str, this.f71582b, request.f71605b, request.f71606c, aVar), false, 0L, 30));
    }
}
