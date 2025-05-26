package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class AbortMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final String f28829d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28830e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28831f;

    public AbortMultipartUploadRequest(String str, String str2, String str3) {
        this.f28829d = str;
        this.f28830e = str2;
        this.f28831f = str3;
    }
}
