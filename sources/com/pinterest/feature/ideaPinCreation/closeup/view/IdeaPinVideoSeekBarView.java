package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinVideoSeekBarView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinVideoSeekBarView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final IdeaPinVideoSeekBar f46068a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoSeekBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoSeekBarView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_200);
        IdeaPinVideoSeekBar ideaPinVideoSeekBar = new IdeaPinVideoSeekBar(6, context, (AttributeSet) null);
        this.f46068a = ideaPinVideoSeekBar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int i14 = aq1.c.gradient_40_black_to_transparent_rounded_corners;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i14));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2);
        ideaPinVideoSeekBar.setLayoutParams(layoutParams);
        ideaPinVideoSeekBar.setPaddingRelative(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        addView(ideaPinVideoSeekBar);
    }
}
