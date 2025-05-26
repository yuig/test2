package oq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f97110b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f97111a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.sema_space_200);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.sema_space_300);
        setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setBackground(getResources().getDrawable(q80.a.rounded_rect_gray_ai, context.getTheme()));
        setOnClickListener(new m(0));
        setOnLongClickListener(null);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(n.f97091j);
        this.f97111a = gestaltText;
        addView(gestaltText);
    }
}
