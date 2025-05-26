package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16194a;

    /* renamed from: b, reason: collision with root package name */
    public View f16195b;

    /* renamed from: c, reason: collision with root package name */
    public View f16196c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f16197d;

    /* renamed from: e, reason: collision with root package name */
    public final Drawable f16198e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f16199f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16200g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16201h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16202i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.ActionBar);
        Drawable drawable = obtainStyledAttributes.getDrawable(i.j.ActionBar_background);
        this.f16197d = drawable;
        Drawable drawable2 = obtainStyledAttributes.getDrawable(i.j.ActionBar_backgroundStacked);
        this.f16198e = drawable2;
        this.f16202i = obtainStyledAttributes.getDimensionPixelSize(i.j.ActionBar_height, -1);
        boolean z13 = true;
        if (getId() == i.f.split_action_bar) {
            this.f16200g = true;
            this.f16199f = obtainStyledAttributes.getDrawable(i.j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f16200g ? drawable != null || drawable2 != null : this.f16199f != null) {
            z13 = false;
        }
        setWillNotDraw(z13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f16197d;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
        Drawable drawable2 = this.f16198e;
        if (drawable2 != null && drawable2.isStateful()) {
            drawable2.setState(getDrawableState());
        }
        Drawable drawable3 = this.f16199f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        drawable3.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16197d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f16198e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f16199f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f16195b = findViewById(i.f.action_bar);
        this.f16196c = findViewById(i.f.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f16194a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        boolean z14;
        super.onLayout(z13, i13, i14, i15, i16);
        if (this.f16200g) {
            Drawable drawable = this.f16199f;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            Drawable drawable2 = this.f16197d;
            if (drawable2 != null) {
                if (this.f16195b.getVisibility() == 0) {
                    drawable2.setBounds(this.f16195b.getLeft(), this.f16195b.getTop(), this.f16195b.getRight(), this.f16195b.getBottom());
                } else {
                    View view = this.f16196c;
                    if (view == null || view.getVisibility() != 0) {
                        drawable2.setBounds(0, 0, 0, 0);
                    } else {
                        drawable2.setBounds(this.f16196c.getLeft(), this.f16196c.getTop(), this.f16196c.getRight(), this.f16196c.getBottom());
                    }
                }
                z14 = true;
            } else {
                z14 = false;
            }
            this.f16201h = false;
            if (!z14) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        if (this.f16195b == null && View.MeasureSpec.getMode(i14) == Integer.MIN_VALUE && (i15 = this.f16202i) >= 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(Math.min(i15, View.MeasureSpec.getSize(i14)), Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
        if (this.f16195b == null) {
            return;
        }
        View.MeasureSpec.getMode(i14);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z13 = i13 == 0;
        Drawable drawable = this.f16197d;
        if (drawable != null) {
            drawable.setVisible(z13, false);
        }
        Drawable drawable2 = this.f16198e;
        if (drawable2 != null) {
            drawable2.setVisible(z13, false);
        }
        Drawable drawable3 = this.f16199f;
        if (drawable3 != null) {
            drawable3.setVisible(z13, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f16197d;
        boolean z13 = this.f16200g;
        return (drawable == drawable2 && !z13) || (drawable == this.f16198e && this.f16201h) || ((drawable == this.f16199f && z13) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i13) {
        if (i13 != 0) {
            return super.startActionModeForChild(view, callback, i13);
        }
        return null;
    }
}
