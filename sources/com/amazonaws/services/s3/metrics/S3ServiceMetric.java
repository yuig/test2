package com.amazonaws.services.s3.metrics;

import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.SimpleMetricType;
import com.amazonaws.metrics.ThroughputMetricType;

/* loaded from: classes3.dex */
public class S3ServiceMetric extends SimpleMetricType implements MetricType {

    /* renamed from: b, reason: collision with root package name */
    public static final AnonymousClass1 f28825b;

    /* renamed from: c, reason: collision with root package name */
    public static final S3ServiceMetric[] f28826c;

    /* renamed from: a, reason: collision with root package name */
    public final String f28827a;

    /* renamed from: com.amazonaws.services.s3.metrics.S3ServiceMetric$1, reason: invalid class name */
    public static class AnonymousClass1 extends S3ThroughputMetric {
    }

    /* renamed from: com.amazonaws.services.s3.metrics.S3ServiceMetric$2, reason: invalid class name */
    public static class AnonymousClass2 extends S3ThroughputMetric {
    }

    public static abstract class S3ThroughputMetric extends S3ServiceMetric implements ThroughputMetricType {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("S3".concat("DownloadThroughput"));
        f28825b = anonymousClass1;
        f28826c = new S3ServiceMetric[]{anonymousClass1, new S3ServiceMetric("S3".concat("DownloadByteCount")), new AnonymousClass2("S3".concat("UploadThroughput")), new S3ServiceMetric("S3".concat("UploadByteCount"))};
    }

    public S3ServiceMetric(String str) {
        this.f28827a = str;
    }

    @Override // com.amazonaws.metrics.MetricType
    public final String name() {
        return this.f28827a;
    }
}
