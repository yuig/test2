package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes3.dex */
public class Bucket implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public String f28848a = null;

    /* renamed from: b, reason: collision with root package name */
    public Owner f28849b = null;

    /* renamed from: c, reason: collision with root package name */
    public Date f28850c = null;

    public final String toString() {
        return "S3Bucket [name=" + this.f28848a + ", creationDate=" + this.f28850c + ", owner=" + this.f28849b + "]";
    }
}
