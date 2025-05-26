package rq;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d2 extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f109137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f109138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f109139c;

    /* renamed from: d, reason: collision with root package name */
    public final int f109140d;

    public d2(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109137a = str;
        this.f109138b = str2;
        this.f109139c = context.getResources().getDimensionPixelSize(eo1.c.space_600);
        this.f109140d = context.getResources().getDimensionPixelSize(eo1.c.space_400);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.k();
        int i13 = eo1.d.lego_modal_bg;
        Object obj = d5.a.f53679a;
        modalViewWrapper.setBackground(context.getDrawable(i13));
        int i14 = this.f109140d;
        int i15 = this.f109139c;
        modalViewWrapper.setPaddingRelative(i14, 0, i14, i15);
        modalViewWrapper.p(context.getString(m60.x0.product_details_header));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        String str = this.f109137a;
        if (str != null) {
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.setPaddingRelative(0, 0, 0, i15);
            gestaltText.i(new k1.j1(str, 27));
            linearLayout.addView(gestaltText);
        }
        String str2 = this.f109138b;
        if (str2 != null) {
            GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
            gestaltText2.i(new c2(gestaltText2, 0));
            dl2.b.y2(gestaltText2);
            gestaltText2.setPaddingRelative(0, 0, 0, 0);
            linearLayout.addView(gestaltText2);
            GestaltText gestaltText3 = new GestaltText(6, context, (AttributeSet) null);
            gestaltText3.i(new k1.j1(str2, 28));
            linearLayout.addView(gestaltText3);
            gestaltText3.setPaddingRelative(0, 0, 0, 0);
        }
        modalViewWrapper.t(linearLayout);
        return modalViewWrapper;
    }
}
