package gu0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f66125a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f66126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int W = c.W(this, eo1.c.space_400);
        com.bumptech.glide.c.a1(layoutParams, W, W, W, W);
        setLayoutParams(layoutParams);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        gestaltText.i(a.f66122j);
        this.f66125a = gestaltText;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        gestaltText2.i(a.f66123k);
        this.f66126b = gestaltText2;
        addView(gestaltText);
        addView(gestaltText2);
    }
}
