package rh1;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g2 extends jc0.b {
    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GestaltText i13 = gestaltText.i(new q0.d(context, 20));
        jc0.n nVar = new jc0.n(context, true);
        ViewGroup viewGroup = nVar.f44753e;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = bs1.c.Z(nVar, eo1.c.lego_spacing_vertical_medium);
            viewGroup.setLayoutParams(layoutParams2);
        }
        nVar.o(false);
        vn1.b textAlignment = vn1.b.CENTER;
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        GestaltText gestaltText2 = nVar.f44750b;
        if (gestaltText2 != null) {
            gestaltText2.i(new yb0.m(textAlignment, 1));
        }
        GestaltText gestaltText3 = nVar.f44750b;
        if (gestaltText3 != null) {
            gestaltText3.i(j.B);
        }
        GestaltText gestaltText4 = nVar.f44750b;
        if (gestaltText4 != null) {
            gestaltText4.i(jc0.k.f75416o);
        }
        nVar.l(fb0.f.question_comment);
        nVar.x(i13);
        nVar.T(false);
        nVar.X(m60.x0.got_it_simple);
        lp.j action = new lp.j(nVar, 3);
        Intrinsics.checkNotNullParameter(action, "action");
        nVar.Y(true);
        nVar.A = action;
        bs1.c.R1(nVar.f75426r, true);
        return nVar;
    }
}
