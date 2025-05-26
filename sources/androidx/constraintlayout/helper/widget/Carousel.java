package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.s;
import java.util.ArrayList;
import x4.b0;
import x4.y;

/* loaded from: classes3.dex */
public class Carousel extends MotionHelper {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f17469k;

    /* renamed from: l, reason: collision with root package name */
    public int f17470l;

    /* renamed from: m, reason: collision with root package name */
    public MotionLayout f17471m;

    /* renamed from: n, reason: collision with root package name */
    public int f17472n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17473o;

    /* renamed from: p, reason: collision with root package name */
    public int f17474p;

    /* renamed from: q, reason: collision with root package name */
    public int f17475q;

    /* renamed from: r, reason: collision with root package name */
    public int f17476r;

    /* renamed from: s, reason: collision with root package name */
    public int f17477s;

    /* renamed from: t, reason: collision with root package name */
    public float f17478t;

    /* renamed from: u, reason: collision with root package name */
    public int f17479u;

    /* renamed from: v, reason: collision with root package name */
    public int f17480v;

    /* renamed from: w, reason: collision with root package name */
    public float f17481w;

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17469k = new ArrayList();
        this.f17470l = 0;
        this.f17472n = -1;
        this.f17473o = false;
        this.f17474p = -1;
        this.f17475q = -1;
        this.f17476r = -1;
        this.f17477s = -1;
        this.f17478t = 0.9f;
        this.f17479u = 4;
        this.f17480v = 1;
        this.f17481w = 2.0f;
        z(context, attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, x4.u
    public final void a(int i13) {
        int i14 = this.f17470l;
        if (i13 == this.f17477s) {
            this.f17470l = i14 + 1;
        } else if (i13 == this.f17476r) {
            this.f17470l = i14 - 1;
        }
        if (!this.f17473o) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        b0 b0Var;
        b0 b0Var2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i13 = 0; i13 < this.f17647b; i13++) {
                this.f17469k.add(motionLayout.getViewById(this.f17646a[i13]));
            }
            this.f17471m = motionLayout;
            if (this.f17480v == 2) {
                y z03 = motionLayout.z0(this.f17475q);
                if (z03 != null && (b0Var2 = z03.f131867l) != null) {
                    b0Var2.f131664c = 5;
                }
                y z04 = this.f17471m.z0(this.f17474p);
                if (z04 == null || (b0Var = z04.f131867l) == null) {
                    return;
                }
                b0Var.f131664c = 5;
            }
        }
    }

    public final void z(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.Carousel_carousel_firstView) {
                    this.f17472n = obtainStyledAttributes.getResourceId(index, this.f17472n);
                } else if (index == s.Carousel_carousel_backwardTransition) {
                    this.f17474p = obtainStyledAttributes.getResourceId(index, this.f17474p);
                } else if (index == s.Carousel_carousel_forwardTransition) {
                    this.f17475q = obtainStyledAttributes.getResourceId(index, this.f17475q);
                } else if (index == s.Carousel_carousel_emptyViewsBehavior) {
                    this.f17479u = obtainStyledAttributes.getInt(index, this.f17479u);
                } else if (index == s.Carousel_carousel_previousState) {
                    this.f17476r = obtainStyledAttributes.getResourceId(index, this.f17476r);
                } else if (index == s.Carousel_carousel_nextState) {
                    this.f17477s = obtainStyledAttributes.getResourceId(index, this.f17477s);
                } else if (index == s.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f17478t = obtainStyledAttributes.getFloat(index, this.f17478t);
                } else if (index == s.Carousel_carousel_touchUpMode) {
                    this.f17480v = obtainStyledAttributes.getInt(index, this.f17480v);
                } else if (index == s.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f17481w = obtainStyledAttributes.getFloat(index, this.f17481w);
                } else if (index == s.Carousel_carousel_infinite) {
                    this.f17473o = obtainStyledAttributes.getBoolean(index, this.f17473o);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public Carousel(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17469k = new ArrayList();
        this.f17470l = 0;
        this.f17472n = -1;
        this.f17473o = false;
        this.f17474p = -1;
        this.f17475q = -1;
        this.f17476r = -1;
        this.f17477s = -1;
        this.f17478t = 0.9f;
        this.f17479u = 4;
        this.f17480v = 1;
        this.f17481w = 2.0f;
        z(context, attributeSet);
    }
}
