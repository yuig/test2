package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public class AmazonS3Exception extends AmazonServiceException implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public String f28846f;

    /* renamed from: g, reason: collision with root package name */
    public Map f28847g;

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ", S3 Extended Request ID: " + this.f28846f;
    }
}
