package com.amazonaws.auth;

/* loaded from: classes3.dex */
public class BasicAWSCredentials implements AWSCredentials {

    /* renamed from: a, reason: collision with root package name */
    public final String f28564a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28565b;

    public BasicAWSCredentials(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }
        this.f28564a = str;
        this.f28565b = str2;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String a() {
        return this.f28564a;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String b() {
        return this.f28565b;
    }
}
