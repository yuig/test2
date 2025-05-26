package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u0004\b!\u0010\bR$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR$\u00100\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b$\u0010;\"\u0004\b<\u0010=R$\u0010E\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b\u0013\u0010B\"\u0004\bC\u0010DR$\u0010L\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\b\u0003\u0010I\"\u0004\bJ\u0010KR$\u0010O\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\b@\u0010I\"\u0004\bN\u0010KR$\u0010U\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bG\u0010R\"\u0004\bS\u0010TR\"\u0010[\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010W\u001a\u0004\b \u0010X\"\u0004\bY\u0010ZR\"\u0010]\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010:\u001a\u0004\bP\u0010;\"\u0004\b\\\u0010=R\"\u0010`\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010:\u001a\u0004\bM\u0010;\"\u0004\b_\u0010=R\"\u0010g\u001a\u00020a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\b9\u0010d\"\u0004\be\u0010f¨\u0006h"}, d2 = {"Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;", "", "", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "setHeadline", "(Ljava/lang/String;)V", "headline", "", "Lcom/google/android/gms/ads/formats/NativeAd$Image;", "b", "Ljava/util/List;", "j", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "images", "c", "d", "setBody", "body", "Lcom/google/android/gms/ads/formats/NativeAd$Image;", "i", "()Lcom/google/android/gms/ads/formats/NativeAd$Image;", "setIcon", "(Lcom/google/android/gms/ads/formats/NativeAd$Image;)V", "icon", "e", "setCallToAction", "callToAction", "f", "setAdvertiser", "advertiser", "", "g", "Ljava/lang/Double;", "getStarRating", "()Ljava/lang/Double;", "setStarRating", "(Ljava/lang/Double;)V", "starRating", "q", "setStore", "store", "p", "setPrice", "price", "Lcom/google/android/gms/ads/VideoController;", "Lcom/google/android/gms/ads/VideoController;", "getVideoController", "()Lcom/google/android/gms/ads/VideoController;", "setVideoController", "(Lcom/google/android/gms/ads/VideoController;)V", "videoController", "", "k", "Z", "()Z", "setHasVideoContent", "(Z)V", "hasVideoContent", "Lcom/google/android/gms/ads/formats/NativeAd$AdChoicesInfo;", "l", "Lcom/google/android/gms/ads/formats/NativeAd$AdChoicesInfo;", "()Lcom/google/android/gms/ads/formats/NativeAd$AdChoicesInfo;", "setAttributionInfo", "(Lcom/google/android/gms/ads/formats/NativeAd$AdChoicesInfo;)V", "attributionInfo", "Landroid/view/View;", "m", "Landroid/view/View;", "()Landroid/view/View;", "setAdChoicesContent", "(Landroid/view/View;)V", "adChoicesContent", "n", "setMediaView", "mediaView", "o", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setMediatedAd", "(Ljava/lang/Object;)V", "mediatedAd", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "extras", "setOverrideImpressionRecording", "overrideImpressionRecording", "r", "setOverrideClickHandling", "overrideClickHandling", "", "s", "F", "()F", "setMediaContentAspectRatio", "(F)V", "mediaContentAspectRatio", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class UnifiedNativeAdMapper {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String headline;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List images;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String body;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private NativeAd.Image icon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String callToAction;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String advertiser;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Double starRating;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String store;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String price;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private VideoController videoController;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean hasVideoContent;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private NativeAd.AdChoicesInfo attributionInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private View adChoicesContent;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private View mediaView;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Object mediatedAd;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Bundle extras;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean overrideImpressionRecording;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean overrideClickHandling;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float mediaContentAspectRatio;

    /* renamed from: a, reason: from getter */
    public final View getAdChoicesContent() {
        return this.adChoicesContent;
    }

    /* renamed from: b, reason: from getter */
    public final String getAdvertiser() {
        return this.advertiser;
    }

    /* renamed from: c, reason: from getter */
    public final NativeAd.AdChoicesInfo getAttributionInfo() {
        return this.attributionInfo;
    }

    /* renamed from: d, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: e, reason: from getter */
    public final String getCallToAction() {
        return this.callToAction;
    }

    /* renamed from: f, reason: from getter */
    public final Bundle getExtras() {
        return this.extras;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getHasVideoContent() {
        return this.hasVideoContent;
    }

    /* renamed from: h, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* renamed from: i, reason: from getter */
    public final NativeAd.Image getIcon() {
        return this.icon;
    }

    /* renamed from: j, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    /* renamed from: k, reason: from getter */
    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    /* renamed from: l, reason: from getter */
    public final View getMediaView() {
        return this.mediaView;
    }

    /* renamed from: m, reason: from getter */
    public final Object getMediatedAd() {
        return this.mediatedAd;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getOverrideClickHandling() {
        return this.overrideClickHandling;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getOverrideImpressionRecording() {
        return this.overrideImpressionRecording;
    }

    /* renamed from: p, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: q, reason: from getter */
    public final String getStore() {
        return this.store;
    }
}
