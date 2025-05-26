package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import xk2.d;

@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/ads/formats/NativeAd;", "", "AdChoicesInfo", "Image", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class NativeAd {

    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/ads/formats/NativeAd$AdChoicesInfo;", "", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class AdChoicesInfo {
        public abstract List a();

        public abstract CharSequence b();
    }

    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b'\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/google/android/gms/ads/formats/NativeAd$Image;", "", "", "<set-?>", "a", "I", "e", "()I", "width", "b", "height", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class Image {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        public abstract Drawable a();

        /* renamed from: b, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public abstract double c();

        public abstract Uri d();

        /* renamed from: e, reason: from getter */
        public final int getWidth() {
            return this.width;
        }
    }
}
