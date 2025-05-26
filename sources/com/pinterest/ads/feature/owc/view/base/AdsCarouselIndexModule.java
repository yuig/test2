package com.pinterest.ads.feature.owc.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps.p;
import ps.q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/base/AdsCarouselIndexModule;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsCarouselIndexModule extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final CarouselIndexView f35295a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35296b;

    /* renamed from: c, reason: collision with root package name */
    public float f35297c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsCarouselIndexModule(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i13) {
        this.f35295a.e(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsCarouselIndexModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, q.ads_closeup_carousel_index_module, this);
        View findViewById = findViewById(p.opaque_one_tap_carousel_index_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35295a = (CarouselIndexView) findViewById;
    }
}
