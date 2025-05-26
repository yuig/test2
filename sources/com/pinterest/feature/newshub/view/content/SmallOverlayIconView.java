package com.pinterest.feature.newshub.view.content;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bs1.c;
import com.pinterest.ui.imageview.ProportionalImageView;
import dx0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zu1.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/newshub/view/content/SmallOverlayIconView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SmallOverlayIconView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ProportionalImageView f46836a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallOverlayIconView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SmallOverlayIconView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallOverlayIconView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundResource(b.news_hub_multi_user_avatar_background);
        ProportionalImageView proportionalImageView = new ProportionalImageView(context);
        proportionalImageView.i2(true);
        c.s1(proportionalImageView, 0, 0, new d(proportionalImageView, 7), 3);
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(proportionalImageView);
        this.f46836a = proportionalImageView;
    }
}
