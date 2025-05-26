package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public p f17698a;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public final p a() {
        if (this.f17698a == null) {
            this.f17698a = new p();
        }
        p pVar = this.f17698a;
        pVar.getClass();
        int childCount = getChildCount();
        HashMap hashMap = pVar.f17857f;
        hashMap.clear();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id3 = childAt.getId();
            if (pVar.f17856e && id3 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id3))) {
                hashMap.put(Integer.valueOf(id3), new k());
            }
            k kVar = (k) hashMap.get(Integer.valueOf(id3));
            if (kVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    k.b(kVar, (ConstraintHelper) childAt, id3, layoutParams);
                }
                kVar.g(id3, layoutParams);
            }
        }
        return this.f17698a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* renamed from: r0, reason: collision with root package name */
        public final float f17699r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f17700s0;

        /* renamed from: t0, reason: collision with root package name */
        public final float f17701t0;

        /* renamed from: u0, reason: collision with root package name */
        public final float f17702u0;

        /* renamed from: v0, reason: collision with root package name */
        public final float f17703v0;

        /* renamed from: w0, reason: collision with root package name */
        public final float f17704w0;

        /* renamed from: x0, reason: collision with root package name */
        public final float f17705x0;

        /* renamed from: y0, reason: collision with root package name */
        public final float f17706y0;

        /* renamed from: z0, reason: collision with root package name */
        public final float f17707z0;

        public LayoutParams() {
            super(-2, -2);
            this.f17699r0 = 1.0f;
            this.f17700s0 = false;
            this.f17701t0 = 0.0f;
            this.f17702u0 = 0.0f;
            this.f17703v0 = 0.0f;
            this.f17704w0 = 0.0f;
            this.f17705x0 = 1.0f;
            this.f17706y0 = 1.0f;
            this.f17707z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17699r0 = 1.0f;
            this.f17700s0 = false;
            this.f17701t0 = 0.0f;
            this.f17702u0 = 0.0f;
            this.f17703v0 = 0.0f;
            this.f17704w0 = 0.0f;
            this.f17705x0 = 1.0f;
            this.f17706y0 = 1.0f;
            this.f17707z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintSet_android_alpha) {
                    this.f17699r0 = obtainStyledAttributes.getFloat(index, this.f17699r0);
                } else if (index == s.ConstraintSet_android_elevation) {
                    this.f17701t0 = obtainStyledAttributes.getFloat(index, this.f17701t0);
                    this.f17700s0 = true;
                } else if (index == s.ConstraintSet_android_rotationX) {
                    this.f17703v0 = obtainStyledAttributes.getFloat(index, this.f17703v0);
                } else if (index == s.ConstraintSet_android_rotationY) {
                    this.f17704w0 = obtainStyledAttributes.getFloat(index, this.f17704w0);
                } else if (index == s.ConstraintSet_android_rotation) {
                    this.f17702u0 = obtainStyledAttributes.getFloat(index, this.f17702u0);
                } else if (index == s.ConstraintSet_android_scaleX) {
                    this.f17705x0 = obtainStyledAttributes.getFloat(index, this.f17705x0);
                } else if (index == s.ConstraintSet_android_scaleY) {
                    this.f17706y0 = obtainStyledAttributes.getFloat(index, this.f17706y0);
                } else if (index == s.ConstraintSet_android_transformPivotX) {
                    this.f17707z0 = obtainStyledAttributes.getFloat(index, this.f17707z0);
                } else if (index == s.ConstraintSet_android_transformPivotY) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == s.ConstraintSet_android_translationX) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == s.ConstraintSet_android_translationY) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == s.ConstraintSet_android_translationZ) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
