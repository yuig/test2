package com.google.android.gms.common.internal;

import a.a;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/* loaded from: classes3.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    public static final int a(int i13, int i14, int i15, int i16) {
        if (i13 == 0) {
            return i14;
        }
        if (i13 == 1) {
            return i15;
        }
        if (i13 == 2) {
            return i16;
        }
        throw new IllegalStateException(a.d("Unknown color scheme: ", i13));
    }
}
