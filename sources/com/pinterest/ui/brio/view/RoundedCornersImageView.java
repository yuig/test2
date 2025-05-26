package com.pinterest.ui.brio.view;

import android.content.Context;
import android.util.AttributeSet;
import eo1.b;
import eo1.c;
import re0.a;
import ve.h;

/* loaded from: classes4.dex */
public class RoundedCornersImageView extends LegacyProportionalBaseImageView {
    public int O;

    public RoundedCornersImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.pinterest.ui.brio.view.LegacyProportionalBaseImageView
    public final void E2(a aVar, boolean z13) {
        super.E2(aVar, z13);
        Context context = getContext();
        int i13 = b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i13));
    }

    @Override // com.pinterest.ui.brio.view.LegacyProportionalBaseImageView
    public final void H2() {
        i2(false);
        if (this.O == 0) {
            this.O = getResources().getDimensionPixelOffset(c.lego_corner_radius_small);
        }
        float f13 = this.O;
        g2(f13, f13, f13, f13);
    }

    @Override // android.view.View, eo.d
    public final void setBackgroundColor(int i13) {
        if (this.O == 0) {
            this.O = getResources().getDimensionPixelOffset(c.lego_corner_radius_small);
        }
        setBackgroundDrawable(h.A(this.O, i13));
    }

    public RoundedCornersImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
