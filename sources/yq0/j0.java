package yq0;

import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.feature.core.view.ViewTypeKibanaMetric$ViewTypePayload;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends KibanaMetrics.Log {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ViewTypeKibanaMetric$ViewTypePayload payload) {
        super("AndroidViewTypeLog", new KibanaMetrics.Log.Metadata(null, null, 2, null), payload, null, null, 0L, 56, null);
        Intrinsics.checkNotNullParameter(payload, "payload");
    }
}
