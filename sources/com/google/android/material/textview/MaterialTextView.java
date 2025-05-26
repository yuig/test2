package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import fj.m;
import fk.a;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        if (c.X0(fj.c.textAppearanceLineHeightEnabled, context, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i13, m.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {m.MaterialTextAppearance_android_lineHeight, m.MaterialTextAppearance_lineHeight};
            int i14 = -1;
            for (int i15 = 0; i15 < 2 && i14 < 0; i15++) {
                i14 = d.J(context2, obtainStyledAttributes, iArr[i15], -1);
            }
            obtainStyledAttributes.recycle();
            if (i14 >= 0) {
                setLineHeight(i14);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(a.a(context, attributeSet, i13, 0), attributeSet, i13);
        Context context2 = getContext();
        if (c.X0(fj.c.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.MaterialTextView, i13, 0);
            int[] iArr = {m.MaterialTextView_android_lineHeight, m.MaterialTextView_lineHeight};
            int i14 = -1;
            for (int i15 = 0; i15 < 2 && i14 < 0; i15++) {
                i14 = d.J(context2, obtainStyledAttributes, iArr[i15], -1);
            }
            obtainStyledAttributes.recycle();
            if (i14 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, m.MaterialTextView, i13, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(m.MaterialTextView_android_textAppearance, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, m.MaterialTextAppearance);
                Context context3 = getContext();
                int[] iArr2 = {m.MaterialTextAppearance_android_lineHeight, m.MaterialTextAppearance_lineHeight};
                int i16 = -1;
                for (int i17 = 0; i17 < 2 && i16 < 0; i17++) {
                    i16 = d.J(context3, obtainStyledAttributes3, iArr2[i17], -1);
                }
                obtainStyledAttributes3.recycle();
                if (i16 >= 0) {
                    setLineHeight(i16);
                }
            }
        }
    }
}
