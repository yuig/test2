package com.pinterest.ui.text;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import bb2.h;
import m60.s0;

@Deprecated
/* loaded from: classes4.dex */
public class IconView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public int f52652a;

    public IconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void f2() {
        setColorFilter(this.f52652a, PorterDuff.Mode.SRC_IN);
    }

    public IconView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        h hVar = h.TRANSPARENT;
        Context context2 = getContext();
        int i14 = eo1.b.color_gray_500;
        Object obj = d5.a.f53679a;
        this.f52652a = context2.getColor(i14);
        f2();
        int i15 = f.f52662a[hVar.ordinal()];
        if (i15 == 1) {
            setBackgroundResource(s0.rounded_rect_light_gray_border);
            return;
        }
        if (i15 == 2) {
            setBackgroundResource(s0.rounded_rect_gray_border);
        } else if (i15 != 3) {
            setBackgroundResource(0);
        } else {
            setBackgroundResource(s0.rounded_rect_gray);
        }
    }
}
