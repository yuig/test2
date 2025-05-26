package q91;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends LinearLayout implements yk1.n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f103148c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f103149a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f103150b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, l handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f103149a = handleAction;
        GestaltText i13 = new GestaltText(6, context, (AttributeSet) null).i(new h(this, 2));
        this.f103150b = i13;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_200);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        addView(i13);
    }
}
