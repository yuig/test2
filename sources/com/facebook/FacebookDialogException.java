package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", "com/bugsnag/android/a0", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class FacebookDialogException extends FacebookException {

    /* renamed from: b, reason: collision with root package name */
    public final int f29899b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29900c;

    public FacebookDialogException(String str, int i13, String str2) {
        super(str);
        this.f29899b = i13;
        this.f29900c = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f29899b + ", message: " + getMessage() + ", url: " + this.f29900c + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
