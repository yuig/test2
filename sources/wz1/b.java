package wz1;

import ao2.j0;
import ao2.v0;
import com.pinterest.qrCodeLogin.h0;
import ko2.e;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import u50.r;

/* loaded from: classes4.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final cr1.a f131239a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f131240b;

    public b(cr1.a accountService, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f131239a = accountService;
        this.f131240b = activeUserManager;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        h0 request = (h0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        f fVar = v0.f20219a;
        j.z(scope, e.f80326c, null, new a(request, this, eventIntake, null), 2);
    }
}
