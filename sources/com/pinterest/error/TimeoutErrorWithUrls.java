package com.pinterest.error;

import a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/error/TimeoutErrorWithUrls;", "Lcom/pinterest/error/TimeoutError;", "networking_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TimeoutErrorWithUrls extends TimeoutError {

    /* renamed from: b, reason: collision with root package name */
    public final String f45049b;

    public TimeoutErrorWithUrls() {
        this("");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        String str = this.f45049b;
        return (message == null || message.length() == 0) ? str : a.D(message, " : ", str);
    }

    public TimeoutErrorWithUrls(String urlsMessage) {
        Intrinsics.checkNotNullParameter(urlsMessage, "urlsMessage");
        this.f45049b = urlsMessage;
    }
}
