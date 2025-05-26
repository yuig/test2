package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/StoryPinActionButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StoryPinActionButton extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f46069a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f46070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPinActionButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), aq1.f.view_story_pin_action_button, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        View findViewById = findViewById(aq1.d.button_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46069a = (ImageView) findViewById;
        View findViewById2 = findViewById(aq1.d.button_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46070b = (GestaltText) findViewById2;
    }

    public final void L(p2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Integer iconRes = state.getIconRes();
        ImageView imageView = this.f46069a;
        if (iconRes != null) {
            imageView.setImageResource(state.getIconRes().intValue());
            bs1.c.U1(imageView);
        } else {
            bs1.c.X0(imageView);
        }
        Integer textRes = state.getTextRes();
        GestaltText gestaltText = this.f46070b;
        if (textRes != null) {
            gestaltText.i(new au0.f(state, 4));
        } else {
            pk.a0.k0(gestaltText);
        }
        if (state.getColorRes() != null) {
            Context context = getContext();
            int intValue = state.getColorRes().intValue();
            Object obj = d5.a.f53679a;
            imageView.setColorFilter(context.getColor(intValue));
        }
        setId(state.getIdRes());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPinActionButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), aq1.f.view_story_pin_action_button, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        View findViewById = findViewById(aq1.d.button_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46069a = (ImageView) findViewById;
        View findViewById2 = findViewById(aq1.d.button_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46070b = (GestaltText) findViewById2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPinActionButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), aq1.f.view_story_pin_action_button, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        View findViewById = findViewById(aq1.d.button_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46069a = (ImageView) findViewById;
        View findViewById2 = findViewById(aq1.d.button_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46070b = (GestaltText) findViewById2;
    }
}
