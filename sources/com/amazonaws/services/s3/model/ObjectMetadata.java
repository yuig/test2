package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.util.DateUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult, ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f28886g;

    /* renamed from: a, reason: collision with root package name */
    public Map f28887a;

    /* renamed from: b, reason: collision with root package name */
    public TreeMap f28888b;

    /* renamed from: c, reason: collision with root package name */
    public Date f28889c;

    /* renamed from: d, reason: collision with root package name */
    public Date f28890d;

    /* renamed from: e, reason: collision with root package name */
    public String f28891e;

    /* renamed from: f, reason: collision with root package name */
    public Date f28892f;

    static {
        SSEAlgorithm.AES256.getAlgorithm();
        f28886g = SSEAlgorithm.KMS.getAlgorithm();
    }

    public ObjectMetadata() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f28887a = new TreeMap(comparator);
        this.f28888b = new TreeMap(comparator);
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void a(String str) {
        this.f28888b.put("x-amz-server-side-encryption-customer-algorithm", str);
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void b(String str) {
        this.f28891e = str;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void c(boolean z13) {
        if (z13) {
            this.f28888b.put("x-amz-request-charged", "requester");
        }
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void g(Date date) {
        this.f28890d = date;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void h(String str) {
        this.f28888b.put("x-amz-server-side-encryption", str);
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void i(String str) {
        this.f28888b.put("x-amz-server-side-encryption-customer-key-MD5", str);
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ObjectMetadata clone() {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        objectMetadata.f28887a = new TreeMap(comparator);
        objectMetadata.f28888b = new TreeMap(comparator);
        objectMetadata.f28887a = this.f28887a == null ? null : new TreeMap(this.f28887a);
        TreeMap treeMap = this.f28888b;
        objectMetadata.f28888b = treeMap != null ? new TreeMap((Map) treeMap) : null;
        objectMetadata.f28890d = DateUtils.a(this.f28890d);
        objectMetadata.f28891e = this.f28891e;
        objectMetadata.f28889c = DateUtils.a(this.f28889c);
        objectMetadata.f28892f = DateUtils.a(this.f28892f);
        return objectMetadata;
    }
}
