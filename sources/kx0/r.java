package kx0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import androidx.recyclerview.widget.v1;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends LinearLayout implements yk1.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, v1 layoutParamsFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutParamsFactory, "layoutParamsFactory");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(q.f81082i);
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams = new PinterestStaggeredGridLayoutManagerImpl.LayoutParams(-1, -2);
        layoutParams.k();
        setLayoutParams(layoutParams);
        addView(gestaltText);
        setGravity(17);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.margin);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(eo1.c.margin_double);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(eo1.c.margin_half);
        setPaddingRelative(dimensionPixelOffset3, dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset);
    }
}
