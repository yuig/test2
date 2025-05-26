package com.amazonaws.services.s3.model;

import ep.b;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class BucketLoggingConfiguration implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public String f28855a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f28856b = null;

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoggingConfiguration enabled=");
        sb3.append((this.f28855a == null || this.f28856b == null) ? false : true);
        String sb4 = sb3.toString();
        if (this.f28855a == null || this.f28856b == null) {
            return sb4;
        }
        StringBuilder D = b.D(sb4, ", destinationBucketName=");
        D.append(this.f28855a);
        D.append(", logFilePrefix=");
        D.append(this.f28856b);
        return D.toString();
    }
}
