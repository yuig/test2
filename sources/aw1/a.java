package aw1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import jc0.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends BaseModalViewWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, false, c.Normal);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void s(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup viewGroup = this.f44755g;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.bottomMargin = 0;
            viewGroup.setLayoutParams(marginLayoutParams);
        }
        GestaltIconButton gestaltIconButton = this.f44749a;
        if (gestaltIconButton != null) {
            com.bumptech.glide.c.d0(gestaltIconButton);
        }
        q(false);
        ViewGroup viewGroup2 = this.f44755g;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        ViewGroup viewGroup3 = this.f44755g;
        if (viewGroup3 != null) {
            viewGroup3.addView(view);
        }
    }
}
