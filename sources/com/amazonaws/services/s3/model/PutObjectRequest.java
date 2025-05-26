package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class PutObjectRequest extends AbstractPutObjectRequest implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public boolean f28899o;

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final PutObjectRequest clone() {
        PutObjectRequest putObjectRequest = (PutObjectRequest) b();
        putObjectRequest.f28518a = this.f28518a;
        putObjectRequest.f28520c = this.f28520c;
        ObjectMetadata objectMetadata = this.f28836h;
        putObjectRequest.f28838j = this.f28838j;
        putObjectRequest.f28837i = this.f28837i;
        putObjectRequest.f28835g = this.f28835g;
        putObjectRequest.f28836h = objectMetadata == null ? null : objectMetadata.clone();
        putObjectRequest.f28840l = this.f28840l;
        putObjectRequest.f28839k = this.f28839k;
        putObjectRequest.f28841m = this.f28841m;
        return putObjectRequest;
    }
}
