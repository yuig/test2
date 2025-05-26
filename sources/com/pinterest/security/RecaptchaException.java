package com.pinterest.security;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/pinterest/security/RecaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ErrorGettingRecaptchaClient", "ErrorGettingRecaptchaHandle", "ErrorGettingRecaptchaToken", "PlayServicesNotAvailable", "UnsupportedPlayServicesVersion", "Lcom/pinterest/security/RecaptchaException$ErrorGettingRecaptchaClient;", "Lcom/pinterest/security/RecaptchaException$ErrorGettingRecaptchaHandle;", "Lcom/pinterest/security/RecaptchaException$ErrorGettingRecaptchaToken;", "Lcom/pinterest/security/RecaptchaException$PlayServicesNotAvailable;", "Lcom/pinterest/security/RecaptchaException$UnsupportedPlayServicesVersion;", "recaptcha_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class RecaptchaException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/RecaptchaException$ErrorGettingRecaptchaClient;", "Lcom/pinterest/security/RecaptchaException;", "recaptcha_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorGettingRecaptchaClient extends RecaptchaException {
        public ErrorGettingRecaptchaClient() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/RecaptchaException$ErrorGettingRecaptchaHandle;", "Lcom/pinterest/security/RecaptchaException;", "recaptcha_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorGettingRecaptchaHandle extends RecaptchaException {
        public ErrorGettingRecaptchaHandle() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/RecaptchaException$ErrorGettingRecaptchaToken;", "Lcom/pinterest/security/RecaptchaException;", "recaptcha_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorGettingRecaptchaToken extends RecaptchaException {
        public ErrorGettingRecaptchaToken() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/RecaptchaException$PlayServicesNotAvailable;", "Lcom/pinterest/security/RecaptchaException;", "recaptcha_release"}, k = 1, mv = {1, 9, 0})
    public static final class PlayServicesNotAvailable extends RecaptchaException {
        public PlayServicesNotAvailable() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/RecaptchaException$UnsupportedPlayServicesVersion;", "Lcom/pinterest/security/RecaptchaException;", "recaptcha_release"}, k = 1, mv = {1, 9, 0})
    public static final class UnsupportedPlayServicesVersion extends RecaptchaException {
        public UnsupportedPlayServicesVersion() {
            super(null);
        }
    }
}
