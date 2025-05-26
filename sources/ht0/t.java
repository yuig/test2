package ht0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rq.c2;

/* loaded from: classes5.dex */
public final class t extends FrameLayout implements yk1.n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f70137b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f70138a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, Function0 onUpdateSettingButtonClick) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onUpdateSettingButtonClick, "onUpdateSettingButtonClick");
        this.f70138a = onUpdateSettingButtonClick;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(eo1.c.space_600);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(k.f70117l);
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(new c2(gestaltText2, 6));
        GestaltButton.SmallPrimaryButton smallPrimaryButton = new GestaltButton.SmallPrimaryButton(6, context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, smallPrimaryButton.getResources().getDimensionPixelSize(eo1.c.space_400), 0, 0);
        smallPrimaryButton.setLayoutParams(layoutParams);
        GestaltButton e13 = smallPrimaryButton.d(k.f70116k).e(new np0.h(this, 6));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        CardView cardView = new CardView(context, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        int dimensionPixelSize2 = cardView.getResources().getDimensionPixelSize(eo1.c.space_200);
        layoutParams2.setMargins(dimensionPixelSize2, 0, dimensionPixelSize2, cardView.getResources().getDimensionPixelSize(eo1.c.space_400));
        cardView.setLayoutParams(layoutParams2);
        int i13 = eo1.b.color_themed_background_elevation_floating;
        Object obj = d5.a.f53679a;
        cardView.k(context.getColor(i13));
        cardView.t(cardView.getResources().getDimension(eo1.c.lego_corner_radius_medium_to_large));
        cardView.setElevation(cardView.getResources().getDimension(eo1.c.space_200));
        linearLayout.addView(gestaltText);
        linearLayout.addView(gestaltText2);
        linearLayout.addView(e13);
        cardView.addView(linearLayout);
        addView(cardView);
    }
}
