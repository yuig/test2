package ni1;

import com.pinterest.featurelibrary.pingridcell.sba.analytics.loggers.PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m60.f0 f90640a;

    /* renamed from: b, reason: collision with root package name */
    public final pi1.b f90641b;

    public e(m60.f0 devUtils, pi1.b pinRepIabDurationLogger) {
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        Intrinsics.checkNotNullParameter(pinRepIabDurationLogger, "pinRepIabDurationLogger");
        this.f90640a = devUtils;
        this.f90641b = pinRepIabDurationLogger;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, h request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof f) {
            ((f) request).getClass();
            this.f90640a.G("Attribution type is unknown", new Object[0]);
        } else if (request instanceof g) {
            g gVar = (g) request;
            PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload payload = new PinRepIabDurationLogger$PinRepIabDurationValidationLog$PinRepIabDurationValidationPayload(gVar.j(), gVar.k(), "sba");
            pi1.b bVar = this.f90641b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(payload, "payload");
            bVar.f100208a.a(new pi1.a(payload));
        }
    }
}
