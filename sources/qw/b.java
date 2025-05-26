package qw;

import com.google.android.gms.ads.AdError;
import com.pinterest.adsOpenMeasurement.analytics.json.AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.k;
import lh0.z3;
import wr.c;
import wr.d;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final c f105264a;

    /* renamed from: b, reason: collision with root package name */
    public final vr.a f105265b;

    /* renamed from: c, reason: collision with root package name */
    public final k f105266c;

    public b(d adFormatsLogger, vr.a adsCommonAnalytics, k experiments) {
        Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f105264a = adFormatsLogger;
        this.f105265b = adsCommonAnalytics;
        this.f105266c = experiments;
    }

    public final boolean c() {
        k kVar = this.f105266c;
        kVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) kVar.f83400a;
        return g1Var.o("android_ad_om_logging", "enabled", z3Var) || g1Var.l("android_ad_om_logging");
    }

    public final void d(rw.a step, Throwable throwable, f30 f30Var, Long l13) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (c()) {
            String value = step.getValue();
            String uid = f30Var != null ? f30Var.getUid() : null;
            String value2 = f30Var != null ? ((vr.b) this.f105265b).d(f30Var).getValue() : AdError.UNDEFINED_DOMAIN;
            Boolean bool = Boolean.TRUE;
            String message = throwable.getMessage();
            c.a(this.f105264a, new AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementErrorPayload(value, uid, value2, bool, l13, (message == null || message.length() == 0) ? AdError.UNDEFINED_DOMAIN : throwable.getMessage()), null, null, 14);
        }
    }
}
