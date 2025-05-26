package com.pinterest.feature.articlecarousel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bumptech.glide.c;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import yk1.n;
import zi0.d;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/articlecarousel/SeparatorTitleView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "articleCarouselLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SeparatorTitleView extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45086a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeparatorTitleView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SeparatorTitleView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorTitleView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(d.f141998i);
        b.y2(gestaltText);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        c.a1(layoutParams, 0, gestaltText.getResources().getDimensionPixelOffset(r0.margin), 0, gestaltText.getResources().getDimensionPixelOffset(r0.margin_quarter));
        layoutParams.gravity = 1;
        gestaltText.setLayoutParams(layoutParams);
        addView(gestaltText);
        this.f45086a = gestaltText;
    }
}
