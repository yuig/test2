package com.amazonaws.internal;

import java.security.DigestInputStream;

/* loaded from: classes3.dex */
public class SdkDigestInputStream extends DigestInputStream implements MetricAware {
    @Override // com.amazonaws.internal.MetricAware
    public final boolean a() {
        if (((DigestInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((DigestInputStream) this).in).a();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        if (j13 <= 0) {
            return j13;
        }
        int min = (int) Math.min(2048L, j13);
        byte[] bArr = new byte[min];
        long j14 = j13;
        while (j14 > 0) {
            int read = read(bArr, 0, (int) Math.min(j14, min));
            if (read == -1) {
                if (j14 == j13) {
                    return -1L;
                }
                return j13 - j14;
            }
            j14 -= read;
        }
        return j13;
    }
}
