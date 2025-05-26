package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/ads/nativead/NativeAd;", "", "AdChoicesInfo", "Image", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class NativeAd {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/nativead/NativeAd$AdChoicesInfo;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class AdChoicesInfo {
        public abstract List a();

        public abstract CharSequence b();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/nativead/NativeAd$Image;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class Image {
        public abstract Drawable a();

        public abstract double b();

        public abstract Uri c();
    }
}
