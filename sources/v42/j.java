package v42;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class j extends p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        h hVar;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        k kVar = (k) this.receiver;
        RoundedCornersLayout roundedCornersLayout = kVar.E;
        ViewGroup.LayoutParams layoutParams = roundedCornersLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = intValue2;
        layoutParams2.height = intValue;
        roundedCornersLayout.setLayoutParams(layoutParams2);
        ImageView imageView = kVar.B;
        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        int i13 = kVar.F;
        com.bumptech.glide.c.b1(layoutParams4, intValue2 - i13, intValue - i13, 0, 0, 12);
        imageView.setLayoutParams(layoutParams4);
        GestaltIconButton gestaltIconButton = kVar.C;
        if (gestaltIconButton != null && (hVar = kVar.f124159z) != null) {
            ViewGroup.LayoutParams layoutParams5 = gestaltIconButton.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            int G0 = (kVar.N * 2) + dl2.b.G0(kVar, hVar.f124146a.f96640b.getBackgroundSize());
            com.bumptech.glide.c.b1(layoutParams6, intValue2 - G0, intValue - G0, 0, 0, 12);
            gestaltIconButton.setLayoutParams(layoutParams6);
        }
        return Unit.f80348a;
    }
}
