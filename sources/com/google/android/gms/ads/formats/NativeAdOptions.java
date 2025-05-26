package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import xk2.d;

@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000  2\u00020\u0001:\u0004!\" #R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006¨\u0006$"}, d2 = {"Lcom/google/android/gms/ads/formats/NativeAdOptions;", "", "", "a", "Z", "getShouldReturnUrls", "()Z", "shouldReturnUrls", "", "b", "I", "getImageOrientation", "()I", "imageOrientation", "c", "getMediaAspectRatio", "mediaAspectRatio", "d", "getShouldRequestMultipleImages", "shouldRequestMultipleImages", "e", "getAdChoicesPlacement", "adChoicesPlacement", "Lcom/google/android/gms/ads/VideoOptions;", "f", "Lcom/google/android/gms/ads/VideoOptions;", "getVideoOptions", "()Lcom/google/android/gms/ads/VideoOptions;", "videoOptions", "g", "getUseCustomMuteThisAd", "useCustomMuteThisAd", "Companion", "AdChoicesPlacement", "Builder", "NativeMediaAspectRatio", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_NOT_SET = -1;
    public static final int ORIENTATION_PORTRAIT = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldReturnUrls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int imageOrientation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int mediaAspectRatio;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldRequestMultipleImages;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int adChoicesPlacement;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final VideoOptions videoOptions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean useCustomMuteThisAd;

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/formats/NativeAdOptions$AdChoicesPlacement;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface AdChoicesPlacement {
    }

    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private boolean f30407a;

        /* renamed from: b, reason: collision with root package name */
        private int f30408b;

        /* renamed from: c, reason: collision with root package name */
        private int f30409c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30410d;

        /* renamed from: e, reason: collision with root package name */
        private VideoOptions f30411e;

        /* renamed from: f, reason: collision with root package name */
        private int f30412f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f30413g;
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/formats/NativeAdOptions$NativeMediaAspectRatio;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface NativeMediaAspectRatio {
    }
}
