package hu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes3.dex */
public final class d extends LinearLayout implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f70384d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f70385a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f70386b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIcon f70387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, Function1 handleAction, int i13) {
        super(context);
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(handleAction, "handleAction");
            this.f70385a = handleAction;
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.i(c.f70381j);
            gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
            this.f70386b = gestaltText;
            GestaltIcon gestaltIcon = new GestaltIcon(context);
            gestaltIcon.g2(c.f70382k);
            gestaltIcon.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0f));
            this.f70387c = gestaltIcon;
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            setGravity(16);
            int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_200);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_200);
            setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            addView(gestaltText);
            addView(gestaltIcon);
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        super(context);
        this.f70385a = handleAction;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(iu.b.f73679j);
        gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        this.f70386b = gestaltText2;
        GestaltIcon gestaltIcon2 = new GestaltIcon(context);
        gestaltIcon2.g2(iu.b.f73680k);
        gestaltIcon2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0f));
        this.f70387c = gestaltIcon2;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.space_200);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(eo1.c.space_200);
        setPaddingRelative(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
        addView(gestaltText2);
        addView(gestaltIcon2);
    }
}
