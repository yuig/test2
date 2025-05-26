package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0004\u0017\u0018\u0019\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/google/android/gms/ads/RequestConfiguration;", "", "", "a", "I", "getTagForChildDirectedTreatment", "()I", "tagForChildDirectedTreatment", "b", "getTagForUnderAgeOfConsent", "tagForUnderAgeOfConsent", "", "c", "Ljava/lang/String;", "getMaxAdContentRating", "()Ljava/lang/String;", "maxAdContentRating", "", "d", "Ljava/util/List;", "getTestDeviceIds", "()Ljava/util/List;", "testDeviceIds", "Companion", "MaxAdContentRating", "TagForChildDirectedTreatment", "TagForUnderAgeOfConsent", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RequestConfiguration {

    @NotNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";

    @NotNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";

    @NotNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";

    @NotNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";

    @NotNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int tagForChildDirectedTreatment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int tagForUnderAgeOfConsent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String maxAdContentRating;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List testDeviceIds;

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/RequestConfiguration$MaxAdContentRating;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/RequestConfiguration$TagForChildDirectedTreatment;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/RequestConfiguration$TagForUnderAgeOfConsent;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface TagForUnderAgeOfConsent {
    }
}
