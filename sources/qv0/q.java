package qv0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f105198a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int W = bs1.c.W(this, eo1.c.space_400);
        layoutParams.setMargins(0, W, 0, W);
        setLayoutParams(layoutParams);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        gestaltText.setTextAlignment(4);
        gestaltText.i(d.f105169p);
        addView(gestaltText);
        this.f105198a = gestaltText;
    }
}
