package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import fj.c;
import fj.e;
import fj.g;
import gj.a;
import java.util.WeakHashMap;
import q5.v0;
import tb.f;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f33117a;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f.d0(context, c.motionEasingEmphasizedInterpolator, a.f65168b);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f33117a = (TextView) findViewById(g.snackbar_text);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        boolean z13 = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(e.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(e.design_snackbar_padding_vertical);
        Layout layout = this.f33117a.getLayout();
        if (layout == null || layout.getLineCount() <= 1) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        if (getOrientation() != 0) {
            setOrientation(0);
        } else {
            z13 = false;
        }
        if (this.f33117a.getPaddingTop() != dimensionPixelSize || this.f33117a.getPaddingBottom() != dimensionPixelSize) {
            TextView textView = this.f33117a;
            WeakHashMap weakHashMap = v0.f102521a;
            if (textView.isPaddingRelative()) {
                textView.setPaddingRelative(textView.getPaddingStart(), dimensionPixelSize, textView.getPaddingEnd(), dimensionPixelSize);
            } else {
                textView.setPadding(textView.getPaddingLeft(), dimensionPixelSize, textView.getPaddingRight(), dimensionPixelSize);
            }
        } else if (!z13) {
            return;
        }
        super.onMeasure(i13, i14);
    }
}
