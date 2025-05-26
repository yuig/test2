package com.pinterest.ui.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import zr1.b;

/* loaded from: classes4.dex */
public class ProportionalImageView extends WebImageView {

    /* renamed from: J, reason: collision with root package name */
    public float f52576J;

    public ProportionalImageView(Context context) {
        super(context);
        this.f52576J = 1.0f;
    }

    public final void A2(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, b.ProportionalImageView);
            this.f52576J = typedArray.getFloat(b.ProportionalImageView_proportion, 1.0f);
            typedArray.recycle();
        } catch (Throwable th3) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th3;
        }
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        if (size > 0) {
            size2 = (int) (size * this.f52576J);
        } else {
            float f13 = this.f52576J;
            if (f13 == 1.0f && size2 > 0) {
                size = (int) (size2 * f13);
            }
        }
        setMeasuredDimension(size, size2);
        setMeasuredDimension(size, size2);
    }

    public ProportionalImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52576J = 1.0f;
        A2(attributeSet);
    }

    public ProportionalImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f52576J = 1.0f;
        A2(attributeSet);
    }
}
