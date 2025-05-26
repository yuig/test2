package com.pinterest.api.graphql.logging;

import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\u0082\u0001\u0001\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"com/pinterest/api/graphql/logging/KibanaMetricLog$DefaultLogPayload", "Lcom/pinterest/analytics/kibana/e;", "", "getUniqueIdentifier", "()Ljava/lang/String;", "uniqueIdentifier", "getSurfaceName", "surfaceName", "getTreatmentGroup", "treatmentGroup", "Lcom/pinterest/api/graphql/logging/KibanaMetricLog$Span$SpanLogPayload;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface KibanaMetricLog$DefaultLogPayload extends e {
    String getSurfaceName();

    String getTreatmentGroup();

    @NotNull
    String getUniqueIdentifier();
}
