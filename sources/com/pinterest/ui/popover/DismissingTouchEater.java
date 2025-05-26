package com.pinterest.ui.popover;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import db2.a;
import f02.h;

/* loaded from: classes4.dex */
public class DismissingTouchEater extends View {
    public DismissingTouchEater(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DismissingTouchEater(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.DismissingTouchEater, 0, 0);
        boolean z13 = obtainStyledAttributes.getBoolean(h.DismissingTouchEater_finishOnTouchOutside, true);
        obtainStyledAttributes.recycle();
        setOnClickListener(new a(z13));
    }
}
