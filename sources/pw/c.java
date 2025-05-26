package pw;

import com.pinterest.api.model.f30;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final sw.a f101492a;

    /* renamed from: b, reason: collision with root package name */
    public final qw.a f101493b;

    public c(sw.b pinalytics, qw.b jsonLogger) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(jsonLogger, "jsonLogger");
        this.f101492a = pinalytics;
        this.f101493b = jsonLogger;
    }

    public static rw.a b(ww.b bVar) {
        int i13 = b.f101491a[bVar.ordinal()];
        if (i13 == 1) {
            return rw.a.VIDEO_FIRST_QUARTILE;
        }
        if (i13 == 2) {
            return rw.a.VIDEO_MID_POINT;
        }
        if (i13 == 3) {
            return rw.a.VIDEO_THIRD_QUARTILE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void h(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public final void c(f30 f30Var, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[CREATIVE LOADED] Error: " + throwable.getMessage());
        rw.a aVar = rw.a.AD_LOADED;
        sw.a.b(this.f101492a, aVar, throwable, f30Var, 8);
        qw.a.b(this.f101493b, aVar, throwable, f30Var, 8);
    }

    public final void d(f30 f30Var, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[AD IMPRESSION] Error: " + throwable.getMessage());
        rw.a aVar = rw.a.AD_IMP_OCCURRED;
        sw.a.b(this.f101492a, aVar, throwable, f30Var, 8);
        qw.a.b(this.f101493b, aVar, throwable, f30Var, 8);
    }

    public final void e(f30 f30Var, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[AD SESSION CREATION] Error: " + throwable.getMessage());
        rw.a aVar = rw.a.AD_SESSION_CREATE;
        sw.a.b(this.f101492a, aVar, throwable, f30Var, 8);
        qw.a.b(this.f101493b, aVar, throwable, f30Var, 8);
    }

    public final void f(f30 f30Var, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[AD USER INTERACTION CLICK] Error: " + throwable.getMessage());
        rw.a aVar = rw.a.AD_USER_INTERACTION_CLICK;
        sw.a.b(this.f101492a, aVar, throwable, f30Var, 8);
        qw.a.b(this.f101493b, aVar, throwable, f30Var, 8);
    }

    public final void g(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public final void i(long j13, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[FETCH PARTNER] duration: " + j13 + " Error: " + throwable.getMessage());
        rw.a aVar = rw.a.FETCH_PARTNER;
        sw.a.b(this.f101492a, aVar, throwable, null, 12);
        ((qw.b) this.f101493b).d(aVar, throwable, null, Long.valueOf(j13));
    }

    public final void j(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[QUARANTINE ERROR] Error: " + throwable.getMessage());
        rw.a aVar = rw.a.QUARANTINE_ERROR;
        sw.a.b(this.f101492a, aVar, throwable, null, 12);
        qw.a.b(this.f101493b, aVar, throwable, null, 12);
    }

    public final void k(long j13, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[SDK INIT] duration: " + j13 + " Error: " + throwable.getMessage());
        rw.a aVar = rw.a.SDK_INIT;
        sw.a.b(this.f101492a, aVar, throwable, null, 12);
        ((qw.b) this.f101493b).d(aVar, throwable, null, Long.valueOf(j13));
    }

    public final void l(long j13, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[JS DOWNLOAD] duration: " + j13 + " Error: " + throwable.getMessage());
        rw.a aVar = rw.a.JS_DOWNLOAD;
        sw.a.b(this.f101492a, aVar, throwable, null, 12);
        ((qw.b) this.f101493b).d(aVar, throwable, null, Long.valueOf(j13));
    }

    public final void m(String pinId, Throwable throwable) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h("[VERIFICATION RESOURCE CREATE] Error: " + throwable.getMessage());
        rw.a aVar = rw.a.VERIFICATION_RESOURCE_CREATE;
        sw.a.b(this.f101492a, aVar, throwable, null, 12);
        qw.a.b(this.f101493b, aVar, throwable, null, 12);
    }
}
