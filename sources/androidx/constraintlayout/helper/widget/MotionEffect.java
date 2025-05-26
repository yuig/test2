package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.s;

/* loaded from: classes3.dex */
public class MotionEffect extends MotionHelper {

    /* renamed from: k, reason: collision with root package name */
    public float f17513k;

    /* renamed from: l, reason: collision with root package name */
    public int f17514l;

    /* renamed from: m, reason: collision with root package name */
    public int f17515m;

    /* renamed from: n, reason: collision with root package name */
    public int f17516n;

    /* renamed from: o, reason: collision with root package name */
    public int f17517o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17518p;

    /* renamed from: q, reason: collision with root package name */
    public int f17519q;

    /* renamed from: r, reason: collision with root package name */
    public int f17520r;

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17513k = 0.1f;
        this.f17514l = 49;
        this.f17515m = 50;
        this.f17516n = 0;
        this.f17517o = 0;
        this.f17518p = true;
        this.f17519q = -1;
        this.f17520r = -1;
        z(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01bb, code lost:
    
        if (r1 == 0.0f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0181, code lost:
    
        if (r14 == 0.0f) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0197, code lost:
    
        if (r14 == 0.0f) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ee  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(androidx.constraintlayout.motion.widget.MotionLayout r20, java.util.HashMap r21) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.y(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public final void z(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.MotionEffect_motionEffect_start) {
                    int i14 = obtainStyledAttributes.getInt(index, this.f17514l);
                    this.f17514l = i14;
                    this.f17514l = Math.max(Math.min(i14, 99), 0);
                } else if (index == s.MotionEffect_motionEffect_end) {
                    int i15 = obtainStyledAttributes.getInt(index, this.f17515m);
                    this.f17515m = i15;
                    this.f17515m = Math.max(Math.min(i15, 99), 0);
                } else if (index == s.MotionEffect_motionEffect_translationX) {
                    this.f17516n = obtainStyledAttributes.getDimensionPixelOffset(index, this.f17516n);
                } else if (index == s.MotionEffect_motionEffect_translationY) {
                    this.f17517o = obtainStyledAttributes.getDimensionPixelOffset(index, this.f17517o);
                } else if (index == s.MotionEffect_motionEffect_alpha) {
                    this.f17513k = obtainStyledAttributes.getFloat(index, this.f17513k);
                } else if (index == s.MotionEffect_motionEffect_move) {
                    this.f17520r = obtainStyledAttributes.getInt(index, this.f17520r);
                } else if (index == s.MotionEffect_motionEffect_strict) {
                    this.f17518p = obtainStyledAttributes.getBoolean(index, this.f17518p);
                } else if (index == s.MotionEffect_motionEffect_viewTransition) {
                    this.f17519q = obtainStyledAttributes.getResourceId(index, this.f17519q);
                }
            }
            int i16 = this.f17514l;
            int i17 = this.f17515m;
            if (i16 == i17) {
                if (i16 > 0) {
                    this.f17514l = i16 - 1;
                } else {
                    this.f17515m = i17 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17513k = 0.1f;
        this.f17514l = 49;
        this.f17515m = 50;
        this.f17516n = 0;
        this.f17517o = 0;
        this.f17518p = true;
        this.f17519q = -1;
        this.f17520r = -1;
        z(context, attributeSet);
    }
}
