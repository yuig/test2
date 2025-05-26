package z51;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import l11.p;

/* loaded from: classes5.dex */
public final class b extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f140864a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c actionHandler) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = bs1.c.W(gestaltText, eo1.c.space_800);
        gestaltText.setLayoutParams(layoutParams);
        int W = bs1.c.W(gestaltText, eo1.c.space_400);
        gestaltText.setPaddingRelative(W, gestaltText.getPaddingTop(), W, gestaltText.getPaddingBottom());
        gestaltText.i(a.f140861o);
        addView(gestaltText);
        GestaltButton.LargePrimaryButton largePrimaryButton = new GestaltButton.LargePrimaryButton(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = bs1.c.W(largePrimaryButton, eo1.c.space_400);
        layoutParams2.gravity = 1;
        largePrimaryButton.setLayoutParams(layoutParams2);
        addView(largePrimaryButton.d(a.f140862p).e(new p(actionHandler, 9)));
    }
}
