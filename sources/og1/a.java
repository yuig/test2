package og1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import kotlin.jvm.internal.Intrinsics;
import rq.c2;

/* loaded from: classes5.dex */
public final class a extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(b.x0(context, eo1.a.color_gray_roboflow_700));
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new c2(gestaltText, 16));
        b.y2(gestaltText);
        addView(gestaltText);
    }
}
