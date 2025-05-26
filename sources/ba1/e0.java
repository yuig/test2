package ba1;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final e82.f f22357a;

    /* renamed from: b, reason: collision with root package name */
    public final k22.m f22358b;

    /* renamed from: c, reason: collision with root package name */
    public final xj2.b f22359c;

    /* renamed from: d, reason: collision with root package name */
    public Date f22360d;

    public e0(e82.f autoPublishManager, k22.m userService) {
        Intrinsics.checkNotNullParameter(autoPublishManager, "autoPublishManager");
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f22357a = autoPublishManager;
        this.f22358b = userService;
        this.f22359c = new xj2.b();
    }

    public static final void j(e0 e0Var) {
        if (e0Var.f22360d == null) {
            try {
                e0Var.f22360d = new SimpleDateFormat("dd/MM/yyyy").parse("04/12/2024");
            } catch (Exception unused) {
            }
        }
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        n0 request = (n0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof g0) {
            kotlin.jvm.internal.j.z(scope, null, null, new b0(this, eventIntake, null), 3);
        } else if (request instanceof i0) {
            kotlin.jvm.internal.j.z(scope, null, null, new c0(this, eventIntake, null), 3);
        } else if (request instanceof j0) {
            kotlin.jvm.internal.j.z(scope, null, null, new d0(this, (j0) request, null), 3);
        }
    }
}
