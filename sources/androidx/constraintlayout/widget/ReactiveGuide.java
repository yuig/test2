package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes3.dex */
public class ReactiveGuide extends View implements t {

    /* renamed from: a, reason: collision with root package name */
    public int f17711a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17712b;

    /* renamed from: c, reason: collision with root package name */
    public int f17713c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17714d;

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17711a = -1;
        this.f17712b = false;
        this.f17713c = 0;
        this.f17714d = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f17711a = obtainStyledAttributes.getResourceId(index, this.f17711a);
                } else if (index == s.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f17712b = obtainStyledAttributes.getBoolean(index, this.f17712b);
                } else if (index == s.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f17713c = obtainStyledAttributes.getResourceId(index, this.f17713c);
                } else if (index == s.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f17714d = obtainStyledAttributes.getBoolean(index, this.f17714d);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f17711a != -1) {
            ConstraintLayout.getSharedValues().a(this.f17711a, this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17711a = -1;
        this.f17712b = false;
        this.f17713c = 0;
        this.f17714d = true;
        super.setVisibility(8);
        a(attributeSet);
    }
}
