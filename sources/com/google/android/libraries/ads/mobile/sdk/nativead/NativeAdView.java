package com.google.android.libraries.ads.mobile.sdk.nativead;

import ads_mobile_sdk.gk0;
import ads_mobile_sdk.vh1;
import ads_mobile_sdk.zf1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import bj.f;
import com.google.android.libraries.ads.mobile.sdk.common.BaseAdAssetViewContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAdView;", "Lcom/google/android/libraries/ads/mobile/sdk/common/BaseAdAssetViewContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NativeAdView extends BaseAdAssetViewContainer {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f32097c = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a(f ad3, MediaView mediaView) {
        Intrinsics.checkNotNullParameter(ad3, "ad");
        this.f32084a.a(mediaView, "3010");
        vh1 vh1Var = new vh1(this);
        synchronized (mediaView) {
            mediaView.f32096c = vh1Var;
            Unit unit = Unit.f80348a;
        }
        ImageView.ScaleType scaleType = mediaView.f32094a;
        if (scaleType != null) {
            vh1Var.a(scaleType);
        }
        if (ad3 instanceof zf1) {
            this.f32084a.a(((zf1) ad3).f14737a);
        } else {
            gk0.d("Internal Error: Cannot display Native Ad", null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
