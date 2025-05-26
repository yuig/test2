package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

@Deprecated
/* loaded from: classes3.dex */
public enum AWSServiceMetrics implements MetricType {
    HttpClientGetConnectionTime("HttpClient");

    private final String serviceName;

    AWSServiceMetrics(String str) {
        this.serviceName = str;
    }

    public String getServiceName() {
        return this.serviceName;
    }
}
