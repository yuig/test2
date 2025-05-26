package com.pinterest.activity.webhook.util;

import java.security.GeneralSecurityException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/activity/webhook/util/SignatureExpiredException;", "Ljava/security/GeneralSecurityException;", "()V", "deepLinkLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SignatureExpiredException extends GeneralSecurityException {
    public SignatureExpiredException() {
        super("SignatureExpired");
    }
}
