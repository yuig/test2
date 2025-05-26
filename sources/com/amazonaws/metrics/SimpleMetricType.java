package com.amazonaws.metrics;

import com.amazonaws.services.s3.metrics.S3ServiceMetric;

/* loaded from: classes3.dex */
public abstract class SimpleMetricType implements MetricType {
    public final boolean equals(Object obj) {
        if (!(obj instanceof MetricType)) {
            return false;
        }
        return ((S3ServiceMetric) this).f28827a.equals(((MetricType) obj).name());
    }

    public final int hashCode() {
        return ((S3ServiceMetric) this).f28827a.hashCode();
    }

    public final String toString() {
        return ((S3ServiceMetric) this).f28827a;
    }
}
