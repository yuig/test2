package com.bumptech.glide.load;

import nd.e;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);

    private final boolean hasAlpha;

    ImageHeaderParser$ImageType(boolean z13) {
        this.hasAlpha = z13;
    }

    public boolean hasAlpha() {
        return this.hasAlpha;
    }

    public boolean isWebp() {
        int i13 = e.f90413a[ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3;
    }
}
