package com.pinterest.feature.todaytab.articlefeed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class d extends LinearLayout implements yk1.d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f48606b = 0;

    /* renamed from: a, reason: collision with root package name */
    public g f48607a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
        smallSecondaryButton.d(new c(smallSecondaryButton));
        smallSecondaryButton.e(new ca1.h(this, 26));
        smallSecondaryButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(r0.margin_triple);
        setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, getResources().getDimensionPixelOffset(r0.lego_floating_nav_bottom_bar_height) + dimensionPixelOffset2);
        addView(smallSecondaryButton);
    }
}
