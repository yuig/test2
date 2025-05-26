package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.s;
import java.util.HashMap;
import x4.u;

/* loaded from: classes3.dex */
public class MotionHelper extends ConstraintHelper implements u {

    /* renamed from: i, reason: collision with root package name */
    public boolean f17521i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17522j;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17521i = false;
        this.f17522j = false;
        m(attributeSet);
    }

    public void a(int i13) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.MotionHelper_onShow) {
                    this.f17521i = obtainStyledAttributes.getBoolean(index, this.f17521i);
                } else if (index == s.MotionHelper_onHide) {
                    this.f17522j = obtainStyledAttributes.getBoolean(index, this.f17522j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void y(MotionLayout motionLayout, HashMap hashMap) {
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17521i = false;
        this.f17522j = false;
        m(attributeSet);
    }
}
