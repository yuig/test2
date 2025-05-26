package com.amazonaws.services.s3.model;

import a.a;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Closeable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class S3Object implements Closeable, Serializable, S3RequesterChargedResult {

    /* renamed from: a, reason: collision with root package name */
    public String f28900a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f28901b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ObjectMetadata f28902c = new ObjectMetadata();

    /* renamed from: d, reason: collision with root package name */
    public transient S3ObjectInputStream f28903d;

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void c(boolean z13) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        S3ObjectInputStream s3ObjectInputStream = this.f28903d;
        if (s3ObjectInputStream != null) {
            s3ObjectInputStream.close();
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("S3Object [key=");
        sb3.append(this.f28900a);
        sb3.append(",bucket=");
        String str = this.f28901b;
        if (str == null) {
            str = "<Unknown>";
        }
        return a.p(sb3, str, "]");
    }
}
