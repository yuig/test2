package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.s;
import u4.h;

/* loaded from: classes3.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    public float f17495i;

    /* renamed from: j, reason: collision with root package name */
    public float f17496j;

    /* renamed from: k, reason: collision with root package name */
    public float f17497k;

    /* renamed from: l, reason: collision with root package name */
    public ConstraintLayout f17498l;

    /* renamed from: m, reason: collision with root package name */
    public float f17499m;

    /* renamed from: n, reason: collision with root package name */
    public float f17500n;

    /* renamed from: o, reason: collision with root package name */
    public float f17501o;

    /* renamed from: p, reason: collision with root package name */
    public float f17502p;

    /* renamed from: q, reason: collision with root package name */
    public float f17503q;

    /* renamed from: r, reason: collision with root package name */
    public float f17504r;

    /* renamed from: s, reason: collision with root package name */
    public float f17505s;

    /* renamed from: t, reason: collision with root package name */
    public float f17506t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f17507u;

    /* renamed from: v, reason: collision with root package name */
    public View[] f17508v;

    /* renamed from: w, reason: collision with root package name */
    public float f17509w;

    /* renamed from: x, reason: collision with root package name */
    public float f17510x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17511y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17512z;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17495i = Float.NaN;
        this.f17496j = Float.NaN;
        this.f17497k = Float.NaN;
        this.f17499m = 1.0f;
        this.f17500n = 1.0f;
        this.f17501o = Float.NaN;
        this.f17502p = Float.NaN;
        this.f17503q = Float.NaN;
        this.f17504r = Float.NaN;
        this.f17505s = Float.NaN;
        this.f17506t = Float.NaN;
        this.f17507u = true;
        this.f17508v = null;
        this.f17509w = 0.0f;
        this.f17510x = 0.0f;
    }

    public final void A() {
        if (this.f17498l == null) {
            return;
        }
        if (this.f17508v == null) {
            z();
        }
        y();
        double radians = Float.isNaN(this.f17497k) ? 0.0d : Math.toRadians(this.f17497k);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f13 = this.f17499m;
        float f14 = f13 * cos;
        float f15 = this.f17500n;
        float f16 = (-f15) * sin;
        float f17 = f13 * sin;
        float f18 = f15 * cos;
        for (int i13 = 0; i13 < this.f17647b; i13++) {
            View view = this.f17508v[i13];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f19 = right - this.f17501o;
            float f23 = bottom - this.f17502p;
            float f24 = (((f16 * f23) + (f14 * f19)) - f19) + this.f17509w;
            float f25 = (((f18 * f23) + (f19 * f17)) - f23) + this.f17510x;
            view.setTranslationX(f24);
            view.setTranslationY(f25);
            view.setScaleY(this.f17500n);
            view.setScaleX(this.f17499m);
            if (!Float.isNaN(this.f17497k)) {
                view.setRotation(this.f17497k);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintLayout_Layout_android_visibility) {
                    this.f17511y = true;
                } else if (index == s.ConstraintLayout_Layout_android_elevation) {
                    this.f17512z = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17498l = (ConstraintLayout) getParent();
        if (this.f17511y || this.f17512z) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i13 = 0; i13 < this.f17647b; i13++) {
                View viewById = this.f17498l.getViewById(this.f17646a[i13]);
                if (viewById != null) {
                    if (this.f17511y) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f17512z && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
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
    public final void setPivotX(float f13) {
        this.f17495i = f13;
        A();
    }

    @Override // android.view.View
    public final void setPivotY(float f13) {
        this.f17496j = f13;
        A();
    }

    @Override // android.view.View
    public final void setRotation(float f13) {
        this.f17497k = f13;
        A();
    }

    @Override // android.view.View
    public final void setScaleX(float f13) {
        this.f17499m = f13;
        A();
    }

    @Override // android.view.View
    public final void setScaleY(float f13) {
        this.f17500n = f13;
        A();
    }

    @Override // android.view.View
    public final void setTranslationX(float f13) {
        this.f17509w = f13;
        A();
    }

    @Override // android.view.View
    public final void setTranslationY(float f13) {
        this.f17510x = f13;
        A();
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void t() {
        z();
        this.f17501o = Float.NaN;
        this.f17502p = Float.NaN;
        h hVar = ((ConstraintLayout.LayoutParams) getLayoutParams()).f17688q0;
        hVar.b0(0);
        hVar.W(0);
        y();
        layout(((int) this.f17505s) - getPaddingLeft(), ((int) this.f17506t) - getPaddingTop(), getPaddingRight() + ((int) this.f17503q), getPaddingBottom() + ((int) this.f17504r));
        A();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void u(ConstraintLayout constraintLayout) {
        this.f17498l = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f17497k = rotation;
        } else {
            if (Float.isNaN(this.f17497k)) {
                return;
            }
            this.f17497k = rotation;
        }
    }

    public final void y() {
        if (this.f17498l == null) {
            return;
        }
        if (this.f17507u || Float.isNaN(this.f17501o) || Float.isNaN(this.f17502p)) {
            if (!Float.isNaN(this.f17495i) && !Float.isNaN(this.f17496j)) {
                this.f17502p = this.f17496j;
                this.f17501o = this.f17495i;
                return;
            }
            View[] l13 = l(this.f17498l);
            int left = l13[0].getLeft();
            int top = l13[0].getTop();
            int right = l13[0].getRight();
            int bottom = l13[0].getBottom();
            for (int i13 = 0; i13 < this.f17647b; i13++) {
                View view = l13[i13];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f17503q = right;
            this.f17504r = bottom;
            this.f17505s = left;
            this.f17506t = top;
            if (Float.isNaN(this.f17495i)) {
                this.f17501o = (left + right) / 2;
            } else {
                this.f17501o = this.f17495i;
            }
            if (Float.isNaN(this.f17496j)) {
                this.f17502p = (top + bottom) / 2;
            } else {
                this.f17502p = this.f17496j;
            }
        }
    }

    public final void z() {
        int i13;
        if (this.f17498l == null || (i13 = this.f17647b) == 0) {
            return;
        }
        View[] viewArr = this.f17508v;
        if (viewArr == null || viewArr.length != i13) {
            this.f17508v = new View[i13];
        }
        for (int i14 = 0; i14 < this.f17647b; i14++) {
            this.f17508v[i14] = this.f17498l.getViewById(this.f17646a[i14]);
        }
    }

    public Layer(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17495i = Float.NaN;
        this.f17496j = Float.NaN;
        this.f17497k = Float.NaN;
        this.f17499m = 1.0f;
        this.f17500n = 1.0f;
        this.f17501o = Float.NaN;
        this.f17502p = Float.NaN;
        this.f17503q = Float.NaN;
        this.f17504r = Float.NaN;
        this.f17505s = Float.NaN;
        this.f17506t = Float.NaN;
        this.f17507u = true;
        this.f17508v = null;
        this.f17509w = 0.0f;
        this.f17510x = 0.0f;
    }
}
