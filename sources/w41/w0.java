package w41;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f128093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        gestaltText.setLayoutParams(layoutParams);
        this.f128093a = gestaltText;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        gestaltText.i(k0.f128031k);
        addView(gestaltText);
    }
}
