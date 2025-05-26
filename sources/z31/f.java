package z31;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.h;
import m60.w;
import u50.r;
import x02.x2;
import y31.i0;

/* loaded from: classes5.dex */
public final class f implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final w f140803a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f140804b;

    public f(w eventManager, x2 userRepository) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f140803a = eventManager;
        this.f140804b = userRepository;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        i0 request = (i0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f140803a.d(new of0.a(nr.d.r7(request.f136802a, this.f140804b)));
    }
}
