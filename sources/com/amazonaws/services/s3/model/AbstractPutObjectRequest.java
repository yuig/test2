package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public String f28832d;

    /* renamed from: e, reason: collision with root package name */
    public String f28833e;

    /* renamed from: f, reason: collision with root package name */
    public File f28834f;

    /* renamed from: g, reason: collision with root package name */
    public transient InputStream f28835g;

    /* renamed from: h, reason: collision with root package name */
    public ObjectMetadata f28836h;

    /* renamed from: i, reason: collision with root package name */
    public CannedAccessControlList f28837i;

    /* renamed from: j, reason: collision with root package name */
    public AccessControlList f28838j;

    /* renamed from: k, reason: collision with root package name */
    public String f28839k;

    /* renamed from: l, reason: collision with root package name */
    public String f28840l;

    /* renamed from: m, reason: collision with root package name */
    public SSEAwsKeyManagementParams f28841m;

    /* renamed from: n, reason: collision with root package name */
    public ObjectTagging f28842n;

    public final AbstractPutObjectRequest b() {
        return (AbstractPutObjectRequest) super.clone();
    }
}
