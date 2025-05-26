package com.google.android.gms.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/google/android/gms/ads/AdError;", "", "", "a", "I", "()I", "code", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "message", "domain", "d", "Lcom/google/android/gms/ads/AdError;", "getCause", "()Lcom/google/android/gms/ads/AdError;", "cause", "Companion", "ads_mobile_sdk/y0", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdError {

    @NotNull
    public static final String GOOGLE_MOBILE_ADS_DOMAIN = "com.google.android.libraries.ads.mobile.sdk";

    @NotNull
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String domain;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AdError cause;

    public AdError(int i13, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(GOOGLE_MOBILE_ADS_DOMAIN, "domain");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(GOOGLE_MOBILE_ADS_DOMAIN, "domain");
        this.code = i13;
        this.message = message;
        this.domain = GOOGLE_MOBILE_ADS_DOMAIN;
        this.cause = null;
    }

    /* renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AdError) {
            AdError adError = (AdError) obj;
            if (this.code == adError.code && Intrinsics.d(this.message, adError.message) && Intrinsics.d(this.domain, adError.domain) && Intrinsics.d(this.cause, adError.cause)) {
                return true;
            }
        }
        return false;
    }
}
