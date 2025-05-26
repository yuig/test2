package com.pinterest.analytics.kibana;

import com.pinterest.analytics.kibana.KibanaMetrics;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends KibanaMetrics.Log {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g metadata, f dimensions, h metrics) {
        super("network_metrics", metadata, null, dimensions, metrics, 0L, 36, null);
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
    }
}
