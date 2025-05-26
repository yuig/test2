package com.google.android.libraries.ads.mobile.sdk.nativead;

import ads_mobile_sdk.ci1;
import ads_mobile_sdk.gf1;
import ads_mobile_sdk.vh1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bj.b;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/MediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MediaView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView.ScaleType f32094a;

    /* renamed from: b, reason: collision with root package name */
    public b f32095b;

    /* renamed from: c, reason: collision with root package name */
    public vh1 f32096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a(b bVar) {
        InternalNativeAd a13;
        this.f32095b = bVar;
        if (bVar == null || (a13 = bVar.a()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(this, "mediaViewContainer");
        if (a13.f32086n.f6369b == gf1.f5555b) {
            ci1 ci1Var = a13.f32088p;
            ci1Var.getClass();
            Intrinsics.checkNotNullParameter(this, "mediaViewContainer");
            View view = ci1Var.f3922c.f6378k;
            if (view == null) {
                removeAllViews();
                return;
            }
            removeAllViews();
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
