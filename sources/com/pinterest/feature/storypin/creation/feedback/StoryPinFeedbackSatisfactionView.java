package com.pinterest.feature.storypin.creation.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.c;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import xf1.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/storypin/creation/feedback/StoryPinFeedbackSatisfactionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StoryPinFeedbackSatisfactionView extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPinFeedbackSatisfactionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.story_pin_feedback_satisfaction_icon_size);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        View imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        c.a1(layoutParams, 0, gestaltText.getResources().getDimensionPixelSize(eo1.c.space_200), 0, 0);
        layoutParams.gravity = 1;
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.i(b.f134844i);
        addView(imageView);
        addView(gestaltText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPinFeedbackSatisfactionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.story_pin_feedback_satisfaction_icon_size);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        View imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        c.a1(layoutParams, 0, gestaltText.getResources().getDimensionPixelSize(eo1.c.space_200), 0, 0);
        layoutParams.gravity = 1;
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.i(b.f134844i);
        addView(imageView);
        addView(gestaltText);
    }
}
