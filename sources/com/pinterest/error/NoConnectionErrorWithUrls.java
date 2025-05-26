package com.pinterest.error;

import a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/error/NoConnectionErrorWithUrls;", "Lcom/pinterest/error/NetworkError;", "networking_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NoConnectionErrorWithUrls extends NetworkError {

    /* renamed from: b, reason: collision with root package name */
    public final String f45044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoConnectionErrorWithUrls(String urlsMessage, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "reason");
        Intrinsics.checkNotNullParameter(urlsMessage, "urlsMessage");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f45044b = urlsMessage;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        String str = this.f45044b;
        return (message == null || message.length() == 0) ? str : a.D(message, " : ", str);
    }
}
