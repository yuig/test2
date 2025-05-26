package com.amazonaws.auth;

/* loaded from: classes3.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {

    /* renamed from: a, reason: collision with root package name */
    public final String f28566a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28567b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28568c;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f28566a = str;
        this.f28567b = str2;
        this.f28568c = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String a() {
        return this.f28566a;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String b() {
        return this.f28567b;
    }
}
