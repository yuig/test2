package com.amazonaws.services.s3.model;

import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;

/* loaded from: classes3.dex */
public class S3ObjectInputStream extends SdkFilterInputStream {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public S3ObjectInputStream(java.io.InputStream r3) {
        /*
            r2 = this;
            boolean r0 = com.amazonaws.metrics.AwsSdkMetrics.isMetricsEnabled()
            if (r0 != 0) goto L7
            goto L1e
        L7:
            boolean r0 = r3 instanceof com.amazonaws.internal.MetricAware
            if (r0 == 0) goto L16
            r0 = r3
            com.amazonaws.internal.MetricAware r0 = (com.amazonaws.internal.MetricAware) r0
            boolean r0 = r0.a()
            r0 = r0 ^ 1
            if (r0 == 0) goto L1e
        L16:
            com.amazonaws.metrics.MetricFilterInputStream r0 = new com.amazonaws.metrics.MetricFilterInputStream
            com.amazonaws.services.s3.metrics.S3ServiceMetric$1 r1 = com.amazonaws.services.s3.metrics.S3ServiceMetric.f28825b
            r0.<init>(r1, r3)
            r3 = r0
        L1e:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.model.S3ObjectInputStream.<init>(java.io.InputStream):void");
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int available = super.available();
        if (available == 0) {
            return 1;
        }
        return available;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream
    public final void c() {
        try {
            close();
        } catch (IOException e13) {
            LogFactory.a(getClass()).a("FYI", e13);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        return super.read();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return super.read(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        return super.read(bArr, i13, i14);
    }
}
