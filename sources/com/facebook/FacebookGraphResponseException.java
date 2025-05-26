package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.e0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class FacebookGraphResponseException extends FacebookException {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f29902b;

    public FacebookGraphResponseException(e0 e0Var, String str) {
        super(str);
        this.f29902b = e0Var;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        e0 e0Var = this.f29902b;
        FacebookRequestError facebookRequestError = e0Var == null ? null : e0Var.f83046c;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{FacebookGraphResponseException: ");
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().append(\"{FacebookGraphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb3.append(message);
            sb3.append(" ");
        }
        if (facebookRequestError != null) {
            sb3.append("httpResponseCode: ");
            sb3.append(facebookRequestError.f29905a);
            sb3.append(", facebookErrorCode: ");
            sb3.append(facebookRequestError.f29906b);
            sb3.append(", facebookErrorType: ");
            sb3.append(facebookRequestError.f29908d);
            sb3.append(", message: ");
            sb3.append(facebookRequestError.a());
            sb3.append("}");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "errorStringBuilder.toString()");
        return sb4;
    }
}
