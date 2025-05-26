package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    public boolean f17715i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17716j;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintLayout_Layout_android_visibility) {
                    this.f17715i = true;
                } else if (index == s.ConstraintLayout_Layout_android_elevation) {
                    this.f17716j = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17715i || this.f17716j) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i13 = 0; i13 < this.f17647b; i13++) {
                    View viewById = constraintLayout.getViewById(this.f17646a[i13]);
                    if (viewById != null) {
                        if (this.f17715i) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f17716j && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        f();
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        f();
    }

    public void y(u4.r rVar, int i13, int i14) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
