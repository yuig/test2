package com.pinterest.error;

import a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v.f1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/error/NetworkErrorWithUrls;", "Lcom/pinterest/error/NetworkError;", "<init>", "()V", "networking_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NetworkErrorWithUrls extends NetworkError {

    /* renamed from: b, reason: collision with root package name */
    public final String f45042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkErrorWithUrls(f1 response, String str) {
        super(response);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f45042b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        String str = this.f45042b;
        return str == null ? message : (message == null || message.length() == 0) ? str : a.D(message, " : ", str);
    }

    public NetworkErrorWithUrls() {
        this.f45042b = null;
    }
}
