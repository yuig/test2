package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 #2\u00020\u0001:\u0005$%#&'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\f¨\u0006("}, d2 = {"Lcom/google/android/gms/ads/nativead/NativeAdOptions;", "", "", "a", "Z", "getShouldReturnUrls", "()Z", "shouldReturnUrls", "", "b", "I", "getMediaAspectRatio", "()I", "mediaAspectRatio", "c", "getShouldRequestMultipleImages", "shouldRequestMultipleImages", "d", "getAdChoicesPlacement", "adChoicesPlacement", "Lcom/google/android/gms/ads/VideoOptions;", "e", "Lcom/google/android/gms/ads/VideoOptions;", "getVideoOptions", "()Lcom/google/android/gms/ads/VideoOptions;", "videoOptions", "f", "getUseCustomMuteThisAd", "useCustomMuteThisAd", "g", "getCustomClickGestureAllowTaps", "customClickGestureAllowTaps", "h", "getCustomClickGestureDirection", "customClickGestureDirection", "Companion", "AdChoicesPlacement", "Builder", "NativeMediaAspectRatio", "SwipeGestureDirection", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
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
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldReturnUrls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int mediaAspectRatio;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldRequestMultipleImages;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int adChoicesPlacement;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final VideoOptions videoOptions;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean useCustomMuteThisAd;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean customClickGestureAllowTaps;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int customClickGestureDirection;

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/nativead/NativeAdOptions$AdChoicesPlacement;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface AdChoicesPlacement {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/nativead/NativeAdOptions$Builder;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private boolean f30535a;

        /* renamed from: b, reason: collision with root package name */
        private int f30536b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30537c;

        /* renamed from: d, reason: collision with root package name */
        private VideoOptions f30538d;

        /* renamed from: e, reason: collision with root package name */
        private int f30539e = 1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f30540f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f30541g;

        /* renamed from: h, reason: collision with root package name */
        private int f30542h;

        public final NativeAdOptions a() {
            return new NativeAdOptions(this.f30535a, this.f30536b, this.f30537c, this.f30539e, this.f30538d, this.f30540f, this.f30541g, this.f30542h);
        }

        public final void b(int i13, boolean z13) {
            this.f30541g = z13;
            this.f30542h = i13;
        }

        public final void c(int i13) {
            this.f30539e = i13;
        }

        public final void d(int i13) {
            this.f30536b = i13;
        }

        public final void e(boolean z13) {
            this.f30540f = z13;
        }

        public final void f(VideoOptions videoOptions) {
            this.f30538d = videoOptions;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/nativead/NativeAdOptions$NativeMediaAspectRatio;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface NativeMediaAspectRatio {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/nativead/NativeAdOptions$SwipeGestureDirection;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface SwipeGestureDirection {
    }

    public NativeAdOptions(boolean z13, int i13, boolean z14, int i14, VideoOptions videoOptions, boolean z15, boolean z16, int i15) {
        this.shouldReturnUrls = z13;
        this.mediaAspectRatio = i13;
        this.shouldRequestMultipleImages = z14;
        this.adChoicesPlacement = i14;
        this.videoOptions = videoOptions;
        this.useCustomMuteThisAd = z15;
        this.customClickGestureAllowTaps = z16;
        this.customClickGestureDirection = i15;
    }
}
