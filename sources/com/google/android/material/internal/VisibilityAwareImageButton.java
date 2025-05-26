package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public int f32692a;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i13, boolean z13) {
        super.setVisibility(i13);
        if (z13) {
            this.f32692a = i13;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i13) {
        b(i13, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32692a = getVisibility();
    }
}
