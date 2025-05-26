package com.pinterest.ui.imageview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import bb2.h;
import m60.s0;

/* loaded from: classes4.dex */
public class GrayWebImageView extends WebImageView {

    /* renamed from: J, reason: collision with root package name */
    public h f52575J;

    public GrayWebImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void A2() {
        boolean z13 = this.f34151d;
        int ordinal = this.f52575J.ordinal();
        if (ordinal == 1) {
            setBackgroundResource(z13 ? s0.oval_light_gray_border : s0.rounded_rect_light_gray_border);
        } else if (ordinal == 2) {
            setBackgroundResource(z13 ? s0.oval_gray_border : s0.rounded_rect_gray_border);
        } else if (ordinal == 3) {
            setBackgroundResource(0);
        } else if (ordinal != 4) {
            setBackgroundResource(z13 ? s0.oval_gray : s0.rounded_rect_gray);
        } else {
            setBackgroundResource(s0.oval_white_border);
        }
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, hs1.a
    public final void J1() {
        p1(true);
        A2();
    }

    public GrayWebImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f52575J = h.NONE;
        A2();
    }
}
