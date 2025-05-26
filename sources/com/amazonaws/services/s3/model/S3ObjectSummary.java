package com.amazonaws.services.s3.model;

import java.util.Date;

/* loaded from: classes3.dex */
public class S3ObjectSummary {

    /* renamed from: a, reason: collision with root package name */
    public String f28907a;

    /* renamed from: b, reason: collision with root package name */
    public String f28908b;

    /* renamed from: c, reason: collision with root package name */
    public long f28909c;

    /* renamed from: d, reason: collision with root package name */
    public Date f28910d;

    /* renamed from: e, reason: collision with root package name */
    public String f28911e;

    /* renamed from: f, reason: collision with root package name */
    public Owner f28912f;

    public final String toString() {
        return "S3ObjectSummary{bucketName='null', key='" + this.f28907a + "', eTag='" + this.f28908b + "', size=" + this.f28909c + ", lastModified=" + this.f28910d + ", storageClass='" + this.f28911e + "', owner=" + this.f28912f + '}';
    }
}
