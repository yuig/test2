package mv0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f88326a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(g.f88361x);
        this.f88326a = gestaltText;
        setPaddingRelative(bs1.c.W(this, eo1.c.space_300), 0, 0, bs1.c.W(this, eo1.c.space_300));
        addView(gestaltText);
    }
}
