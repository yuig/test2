package com.pinterest.ui.brio.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.pinterest.ui.imageview.ProportionalImageView;
import do1.d0;
import kh2.r;
import m60.s0;
import oq.i;
import re0.a;
import zr1.b;

@Deprecated
/* loaded from: classes4.dex */
public abstract class LegacyProportionalBaseImageView extends ProportionalImageView {
    public static Drawable N;
    public a K;
    public int L;
    public final i M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyProportionalBaseImageView(Context context) {
        super(context);
        a aVar = a.MEDIUM;
        this.K = a.NONE;
        this.M = new i(this, 17);
        E2(aVar, true);
    }

    public final a D2(AttributeSet attributeSet, int i13) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.LegacyImage, i13, 0);
        int i14 = b.LegacyImage_image_size;
        a aVar = a.MEDIUM;
        int i15 = obtainStyledAttributes.getInt(i14, aVar.getValue());
        obtainStyledAttributes.recycle();
        switch (i15) {
            case 0:
                return a.XSMALL;
            case 1:
                return a.XSMALL_USE_LAYOUT_PARAMS;
            case 2:
                return a.SMALL;
            case 3:
                return a.SMALL_USE_LAYOUT_PARAMS;
            case 4:
                return aVar;
            case 5:
                return a.MEDIUM_USE_LAYOUT_PARAMS;
            case 6:
                return a.LARGE;
            case 7:
                return a.LARGE_USE_LAYOUT_PARAMS;
            case 8:
                return a.XLARGE;
            case 9:
                return a.XLARGE_USE_LAYOUT_PARAMS;
            case 10:
                return a.XXLARGE;
            case 11:
                return a.XXLARGE_USE_LAYOUT_PARAMS;
            case 12:
                return a.XXXLARGE;
            case 13:
                return a.XXXLARGE_USE_LAYOUT_PARAMS;
            case 14:
                return a.PROPORTIONAL_USE_LAYOUT_PARAMS;
            case 15:
                return a.LEGO_GRID_ATTRIBUTION;
            default:
                throw new IllegalStateException("Unsupported raw size");
        }
    }

    public void E2(a aVar, boolean z13) {
        H2();
        G2(aVar);
        this.f52564p = this.M;
        if (z13) {
            if (N == null) {
                N = getResources().getDrawable(s0.dimming_layer_light);
            }
            setForeground(N);
        }
        k2(true);
    }

    public final void G2(a aVar) {
        if (this.K == aVar) {
            return;
        }
        this.K = aVar;
        Resources resources = getResources();
        hf0.b.q();
        this.L = r.Q(aVar, resources);
    }

    public abstract void H2();

    @Override // com.pinterest.ui.imageview.ProportionalImageView, com.pinterest.ui.imageview.GenericWebImageView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15 = this.L;
        if (i15 == -1) {
            super.onMeasure(i13, i14);
            this.L = getMeasuredWidth();
        } else {
            setMeasuredDimension(i15, i15);
            int i16 = this.L;
            setMeasuredDimension(i16, i16);
        }
    }

    public LegacyProportionalBaseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = a.NONE;
        this.M = new i(this, 17);
        a D2 = D2(attributeSet, 0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d0.RoundedUserAvatar);
        boolean z13 = obtainStyledAttributes.getBoolean(d0.RoundedUserAvatar_dimmedForeground, true);
        obtainStyledAttributes.recycle();
        E2(D2, z13);
    }

    public LegacyProportionalBaseImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.K = a.NONE;
        this.M = new i(this, 17);
        a D2 = D2(attributeSet, i13);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d0.RoundedUserAvatar);
        boolean z13 = obtainStyledAttributes.getBoolean(d0.RoundedUserAvatar_dimmedForeground, true);
        obtainStyledAttributes.recycle();
        E2(D2, z13);
    }
}
