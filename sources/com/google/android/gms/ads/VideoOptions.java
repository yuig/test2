package com.google.android.gms.ads;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/google/android/gms/ads/VideoOptions;", "", "", "a", "Z", "getStartMuted", "()Z", "startMuted", "b", "getCustomControlsRequested", "customControlsRequested", "c", "getClickToExpandRequested", "clickToExpandRequested", "Builder", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VideoOptions {
    public static final boolean DEFAULT_START_MUTED = true;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean startMuted;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean customControlsRequested;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean clickToExpandRequested;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/VideoOptions$Builder;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private boolean f30395a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f30396b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30397c;

        public final VideoOptions a() {
            return new VideoOptions(this.f30395a, this.f30396b, this.f30397c);
        }

        public final void b(boolean z13) {
            this.f30397c = z13;
        }

        public final void c(boolean z13) {
            this.f30396b = z13;
        }

        public final void d(boolean z13) {
            this.f30395a = z13;
        }
    }

    public VideoOptions(boolean z13, boolean z14, boolean z15) {
        this.startMuted = z13;
        this.customControlsRequested = z14;
        this.clickToExpandRequested = z15;
    }
}
