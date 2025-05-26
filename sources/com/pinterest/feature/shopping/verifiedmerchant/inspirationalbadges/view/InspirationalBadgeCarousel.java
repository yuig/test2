package com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cf1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/shopping/verifiedmerchant/inspirationalbadges/view/InspirationalBadgeCarousel;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "verifiedMerchantLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InspirationalBadgeCarousel extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f48530d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f48531a;

    /* renamed from: b, reason: collision with root package name */
    public View.OnClickListener f48532b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView f48533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationalBadgeCarousel(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48531a = m.b(b.f27644i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationalBadgeCarousel(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48531a = m.b(b.f27644i);
    }
}
