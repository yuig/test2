package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "com/bugsnag/android/a0", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class FacebookServiceException extends FacebookException {

    /* renamed from: b, reason: collision with root package name */
    public final FacebookRequestError f29914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError requestError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.f29914b = requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        FacebookRequestError facebookRequestError = this.f29914b;
        sb3.append(facebookRequestError.f29905a);
        sb3.append(", facebookErrorCode: ");
        sb3.append(facebookRequestError.f29906b);
        sb3.append(", facebookErrorType: ");
        sb3.append(facebookRequestError.f29908d);
        sb3.append(", message: ");
        sb3.append(facebookRequestError.a());
        sb3.append("}");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return sb4;
    }
}
