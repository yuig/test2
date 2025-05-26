package com.amazonaws.metrics;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class MetricFilterInputStream extends SdkFilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteThroughputHelper f28636a;

    public MetricFilterInputStream(ThroughputMetricType throughputMetricType, InputStream inputStream) {
        super(inputStream);
        this.f28636a = new ByteThroughputHelper(throughputMetricType);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, com.amazonaws.internal.MetricAware
    public final boolean a() {
        return true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ByteThroughputHelper byteThroughputHelper = this.f28636a;
        if (byteThroughputHelper.f28633b > 0) {
            AwsSdkMetrics.getServiceMetricCollector().getClass();
            byteThroughputHelper.f28633b = 0;
            byteThroughputHelper.f28632a = 0L;
        }
        ((FilterInputStream) this).in.close();
        d();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        d();
        ByteThroughputHelper byteThroughputHelper = this.f28636a;
        byteThroughputHelper.getClass();
        if (TimeUnit.NANOSECONDS.toSeconds(byteThroughputHelper.f28632a) > 10 && byteThroughputHelper.f28633b > 0) {
            AwsSdkMetrics.getServiceMetricCollector().getClass();
            byteThroughputHelper.f28633b = 0;
            byteThroughputHelper.f28632a = 0L;
        }
        long nanoTime = System.nanoTime();
        int read = ((FilterInputStream) this).in.read(bArr, i13, i14);
        if (read > 0) {
            ByteThroughputHelper byteThroughputHelper2 = this.f28636a;
            byteThroughputHelper2.f28633b += read;
            byteThroughputHelper2.f28632a = (System.nanoTime() - nanoTime) + byteThroughputHelper2.f28632a;
        }
        return read;
    }
}
