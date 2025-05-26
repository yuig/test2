package com.pinterest.feature.ideaPinCreation.interesttagging.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import gm1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rn0.d;
import yk1.n;
import zu0.b;
import zu0.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/interesttagging/view/PinInterestTagView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinInterestTagView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltButton.SmallSecondaryButton f46534a;

    public PinInterestTagView(Context context) {
        super(context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context2, (AttributeSet) null);
        smallSecondaryButton.d(b.f142812j);
        this.f46534a = smallSecondaryButton;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(aq1.b.interest_tag_right_margin);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), dimensionPixelSize, dimensionPixelSize);
        addView(smallSecondaryButton);
    }

    public final void a(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f46534a.e(eventHandler);
    }

    public final void b(boolean z13) {
        this.f46534a.d(new d(z13, 25));
    }

    public final void e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f46534a.d(new c(text, 0));
    }

    public PinInterestTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context2, (AttributeSet) null);
        smallSecondaryButton.d(b.f142812j);
        this.f46534a = smallSecondaryButton;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(aq1.b.interest_tag_right_margin);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), dimensionPixelSize, dimensionPixelSize);
        addView(smallSecondaryButton);
    }

    public PinInterestTagView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context2, (AttributeSet) null);
        smallSecondaryButton.d(b.f142812j);
        this.f46534a = smallSecondaryButton;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(aq1.b.interest_tag_right_margin);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), dimensionPixelSize, dimensionPixelSize);
        addView(smallSecondaryButton);
    }
}
