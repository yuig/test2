package pi1;

import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.analytics.kibana.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends KibanaMetrics.Log {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e payload) {
        super("pin_rep_iab_duration_validation_log", new KibanaMetrics.Log.Metadata(null, null, 2, null), payload, null, null, 0L, 56, null);
        Intrinsics.checkNotNullParameter(payload, "payload");
    }
}
