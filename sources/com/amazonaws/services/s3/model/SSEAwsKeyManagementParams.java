package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class SSEAwsKeyManagementParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f28913a;

    public SSEAwsKeyManagementParams(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("AWS Key Management System Key id cannot be null");
        }
        this.f28913a = str;
    }
}
