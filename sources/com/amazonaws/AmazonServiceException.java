package com.amazonaws;

import a.a;

/* loaded from: classes3.dex */
public class AmazonServiceException extends AmazonClientException {

    /* renamed from: a, reason: collision with root package name */
    public String f28507a;

    /* renamed from: b, reason: collision with root package name */
    public String f28508b;

    /* renamed from: c, reason: collision with root package name */
    public String f28509c;

    /* renamed from: d, reason: collision with root package name */
    public int f28510d;

    /* renamed from: e, reason: collision with root package name */
    public String f28511e;

    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str) {
        super(str);
        ErrorType errorType = ErrorType.Client;
        this.f28509c = str;
    }

    public String a() {
        return this.f28508b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f28509c);
        sb3.append(" (Service: ");
        sb3.append(this.f28511e);
        sb3.append("; Status Code: ");
        sb3.append(this.f28510d);
        sb3.append("; Error Code: ");
        sb3.append(a());
        sb3.append("; Request ID: ");
        return a.p(sb3, this.f28507a, ")");
    }
}
