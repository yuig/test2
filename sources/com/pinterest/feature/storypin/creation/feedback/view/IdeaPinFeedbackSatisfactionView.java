package com.pinterest.feature.storypin.creation.feedback.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/storypin/creation/feedback/view/IdeaPinFeedbackSatisfactionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinFeedbackSatisfactionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f48573a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinFeedbackSatisfactionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = c.W(this, r0.idea_pin_feedback_satisfaction_icon_size);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(W, W));
        this.f48573a = imageView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        com.bumptech.glide.c.a1(layoutParams, 0, c.W(gestaltText, eo1.c.space_200), 0, 0);
        layoutParams.gravity = 1;
        gestaltText.setLayoutParams(layoutParams);
        this.f48574b = gestaltText;
        addView(imageView);
        addView(gestaltText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinFeedbackSatisfactionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = c.W(this, r0.idea_pin_feedback_satisfaction_icon_size);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(W, W));
        this.f48573a = imageView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        com.bumptech.glide.c.a1(layoutParams, 0, c.W(gestaltText, eo1.c.space_200), 0, 0);
        layoutParams.gravity = 1;
        gestaltText.setLayoutParams(layoutParams);
        this.f48574b = gestaltText;
        addView(imageView);
        addView(gestaltText);
    }
}
