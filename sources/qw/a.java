package qw;

import com.google.android.gms.ads.AdError;
import com.pinterest.adsOpenMeasurement.analytics.json.AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import wr.c;

/* loaded from: classes.dex */
public interface a {
    static void a(a aVar, rw.a step, f30 f30Var) {
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(step, "step");
        if (bVar.c()) {
            c.a(bVar.f105264a, new AdsOpenMeasurementJsonLoggerImpl$AdsOpenMeasurementStepPayload(step.getValue(), f30Var != null ? f30Var.getUid() : null, f30Var != null ? ((vr.b) bVar.f105265b).d(f30Var).getValue() : AdError.UNDEFINED_DOMAIN, Boolean.FALSE, null), null, null, 14);
        }
    }

    static /* synthetic */ void b(a aVar, rw.a aVar2, Throwable th3, f30 f30Var, int i13) {
        if ((i13 & 4) != 0) {
            f30Var = null;
        }
        ((b) aVar).d(aVar2, th3, f30Var, null);
    }
}
