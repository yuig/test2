package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class m extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48735a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48736b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(b.f48701r);
        gestaltText.setPaddingRelative(0, 0, 0, gestaltText.getResources().getDimensionPixelOffset(r0.margin_quarter));
        this.f48735a = gestaltText;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(b.f48700q);
        this.f48736b = gestaltText2;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        addView(gestaltText);
        addView(gestaltText2);
    }
}
