package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.d;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f33376b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void C(View view, View view2, boolean z13, boolean z14) {
        AnimatorSet animatorSet = this.f33376b;
        boolean z15 = animatorSet != null;
        if (z15) {
            animatorSet.cancel();
        }
        AnimatorSet D = D(view, view2, z13, z15);
        this.f33376b = D;
        D.addListener(new d(this, 11));
        this.f33376b.start();
        if (z14) {
            return;
        }
        this.f33376b.end();
    }

    public abstract AnimatorSet D(View view, View view2, boolean z13, boolean z14);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
