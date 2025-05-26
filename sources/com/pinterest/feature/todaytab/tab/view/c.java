package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public abstract class c extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f48709e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltIcon f48710a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48711b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48712c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton.LargeSecondaryButton f48713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i13, int i14) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltIcon gestaltIcon = new GestaltIcon(context);
        gestaltIcon.g2(b.f48693j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = bs1.c.Z(gestaltIcon, eo1.c.space_400);
        layoutParams.gravity = 17;
        gestaltIcon.setLayoutParams(layoutParams);
        this.f48710a = gestaltIcon;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setPaddingRelative(0, 0, 0, bs1.c.Z(gestaltText, eo1.c.space_100));
        GestaltText i15 = gestaltText.i(new zx0.d(i13, 22));
        this.f48711b = i15;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        int Z = bs1.c.Z(gestaltText2, r0.empty_padding);
        gestaltText2.setPaddingRelative(Z, 0, Z, Z);
        GestaltText i16 = gestaltText2.i(new zx0.d(i14, 21));
        this.f48712c = i16;
        GestaltButton.LargeSecondaryButton largeSecondaryButton = new GestaltButton.LargeSecondaryButton(6, context, (AttributeSet) null);
        largeSecondaryButton.d(new a(largeSecondaryButton));
        largeSecondaryButton.e(new ca1.h(this, 28));
        this.f48713d = largeSecondaryButton;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        setGravity(17);
        int Z2 = bs1.c.Z(this, eo1.c.space_400);
        int Z3 = bs1.c.Z(this, eo1.c.space_600);
        setPaddingRelative(Z2, Z3, Z2, bs1.c.Z(this, r0.lego_floating_nav_bottom_bar_height) + Z3);
        addView(gestaltIcon);
        addView(i15);
        addView(i16);
        addView(largeSecondaryButton, -2, -2);
    }

    public abstract void a();
}
