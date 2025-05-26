package ye1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f138859a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f138860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(g.f138855k);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        dl2.b.y2(gestaltText);
        this.f138859a = gestaltText;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(g.f138854j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        com.bumptech.glide.c.a1(layoutParams, 0, 0, 0, 0);
        gestaltText2.setLayoutParams(layoutParams);
        dl2.b.y2(gestaltText2);
        this.f138860b = gestaltText2;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_500);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        addView(gestaltText);
        addView(gestaltText2);
    }
}
