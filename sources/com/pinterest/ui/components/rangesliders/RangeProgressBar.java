package com.pinterest.ui.components.rangesliders;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import kh2.p2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ma2.b;
import ma2.c;
import ma2.d;
import mz1.a;
import mz1.h;
import org.jetbrains.annotations.NotNull;
import p5.e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/pinterest/ui/components/rangesliders/RangeProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "ma2/b", "ne0/b", "SavedState", "productFilterLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class RangeProgressBar extends View {
    public static final DecelerateInterpolator B = new DecelerateInterpolator();
    public static final int C = 80;
    public b A;

    /* renamed from: a, reason: collision with root package name */
    public int f52296a;

    /* renamed from: b, reason: collision with root package name */
    public int f52297b;

    /* renamed from: c, reason: collision with root package name */
    public int f52298c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52299d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52300e;

    /* renamed from: f, reason: collision with root package name */
    public final int f52301f;

    /* renamed from: g, reason: collision with root package name */
    public final int f52302g;

    /* renamed from: h, reason: collision with root package name */
    public final int f52303h;

    /* renamed from: i, reason: collision with root package name */
    public int f52304i;

    /* renamed from: j, reason: collision with root package name */
    public int f52305j;

    /* renamed from: k, reason: collision with root package name */
    public int f52306k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f52307l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f52308m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f52309n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f52310o;

    /* renamed from: p, reason: collision with root package name */
    public ne0.b f52311p;

    /* renamed from: q, reason: collision with root package name */
    public final long f52312q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f52313r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f52314s;

    /* renamed from: t, reason: collision with root package name */
    public float f52315t;

    /* renamed from: u, reason: collision with root package name */
    public float f52316u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f52317v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f52318w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f52319x;

    /* renamed from: y, reason: collision with root package name */
    public Rect f52320y;

    /* renamed from: z, reason: collision with root package name */
    public int f52321z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/ui/components/rangesliders/RangeProgressBar$SavedState;", "Landroid/view/View$BaseSavedState;", "productFilterLibrary_release"}, k = 1, mv = {1, 9, 0})
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: a, reason: collision with root package name */
        public int f52322a;

        /* renamed from: b, reason: collision with root package name */
        public int f52323b;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel out, int i13) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, i13);
            out.writeInt(this.f52322a);
            out.writeInt(this.f52323b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeProgressBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.range_slider_style);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final synchronized void a(int i13, int i14, int i15, boolean z13, boolean z14, boolean z15) {
        b bVar;
        try {
            int i16 = this.f52306k;
            float f13 = i16 > 0 ? i14 / i16 : 0.0f;
            float f14 = i16 > 0 ? i15 / i16 : 0.0f;
            if (z15) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52315t, f13);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f52316u, f14);
                ofFloat.addUpdateListener(new ma2.a(this, ofFloat, ofFloat2, 0));
                ofFloat2.addUpdateListener(new ma2.a(this, ofFloat, ofFloat2, 1));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(C);
                animatorSet.setInterpolator(B);
                animatorSet.start();
            } else {
                g(f13, f14, i13);
            }
            if (z14 && (bVar = this.A) != null) {
                ((RangeSliderBar) bVar).k(i14, i15);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void b(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = this.f52308m;
        if (drawable != null) {
            int save = canvas.save();
            canvas.translate(getPaddingStart(), getPaddingTop());
            Rect rect = this.f52320y;
            if (rect != null) {
                int i13 = this.f52321z;
                int i14 = this.f52303h;
                float f13 = i13 - i14;
                int i15 = (int) (this.f52315t * f13);
                int i16 = (int) (this.f52316u * f13);
                Drawable drawable2 = this.f52319x;
                Intrinsics.f(drawable2);
                drawable2.setBounds(i15, rect.top, i14 + i16, rect.bottom);
            }
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final synchronized void c(int i13, int i14, boolean z13, boolean z14) {
        try {
            if (this.f52312q == Thread.currentThread().getId()) {
                a(R.id.progress, i13, i14, z13, true, z14);
            } else {
                if (this.f52311p == null) {
                    this.f52311p = new ne0.b(this, 8);
                }
                e eVar = d.f86828f;
                d dVar = (d) d.f86828f.b();
                if (dVar == null) {
                    dVar = new d();
                }
                dVar.f86829a = R.id.progress;
                dVar.f86830b = i13;
                dVar.f86831c = i14;
                dVar.f86832d = z13;
                dVar.f86833e = z14;
                this.f52318w.add(dVar);
                if (this.f52313r && !this.f52314s) {
                    removeCallbacks(this.f52311p);
                    post(this.f52311p);
                    this.f52314s = true;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void d(int i13) {
        if (i13 < 0) {
            i13 = 0;
        }
        if (i13 != this.f52306k) {
            this.f52306k = i13;
            postInvalidate();
            if (this.f52304i > i13) {
                this.f52304i = i13;
            }
            c(this.f52305j, this.f52304i, false, false);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        Drawable drawable = this.f52308m;
        if (drawable != null) {
            drawable.setHotspot(f13, f14);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        i();
    }

    public synchronized boolean e(int i13, int i14, boolean z13, boolean z14) {
        return f(i13, i14, z13, z14);
    }

    public final synchronized boolean f(int i13, int i14, boolean z13, boolean z14) {
        if (i13 > i14) {
            throw new IllegalArgumentException("startValue " + i13 + " cannot be greater than endValue " + i14);
        }
        int U = p2.U(i13, 0, p2.U(i14, 0, this.f52306k));
        int U2 = p2.U(i14, U, this.f52306k);
        if (U == this.f52305j && U2 == this.f52304i) {
            return false;
        }
        this.f52304i = U2;
        this.f52305j = U;
        c(U, U2, z13, z14);
        return true;
    }

    public final void g(float f13, float f14, int i13) {
        this.f52315t = f13;
        this.f52316u = f14;
        invalidate();
        b bVar = this.A;
        if (bVar != null) {
            RangeSliderBar rangeSliderBar = (RangeSliderBar) bVar;
            if (i13 == 16908301) {
                rangeSliderBar.r(rangeSliderBar.getWidth(), rangeSliderBar.N, f13, c.Start, Integer.MIN_VALUE);
                rangeSliderBar.r(rangeSliderBar.getWidth(), rangeSliderBar.O, f14, c.End, Integer.MIN_VALUE);
                rangeSliderBar.invalidate();
            }
        }
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = RangeProgressBar.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final void h(int i13, int i14) {
        int paddingStart = i13 - (getPaddingStart() + getPaddingEnd());
        int paddingBottom = i14 - (getPaddingBottom() + getPaddingTop());
        this.f52319x = null;
        this.f52320y = null;
        this.f52321z = paddingStart;
        Drawable drawable = this.f52308m;
        if (drawable != null) {
            drawable.setBounds(0, 0, paddingStart, paddingBottom);
            Drawable findDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(R.id.progress);
            this.f52319x = findDrawableByLayerId;
            if (findDrawableByLayerId != null) {
                this.f52320y = findDrawableByLayerId.getBounds();
            }
        }
    }

    public final void i() {
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f52308m;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable dr2) {
        Intrinsics.checkNotNullParameter(dr2, "dr");
        if (!verifyDrawable(dr2)) {
            super.invalidateDrawable(dr2);
            return;
        }
        Rect bounds = dr2.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int paddingStart = getPaddingStart() + getScrollX();
        int paddingTop = getPaddingTop() + getScrollY();
        invalidate(bounds.left + paddingStart, bounds.top + paddingTop, bounds.right + paddingStart, bounds.bottom + paddingTop);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f52308m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        synchronized (this) {
            try {
                int size = this.f52318w.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj = this.f52318w.get(i13);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    d dVar = (d) obj;
                    a(dVar.f86829a, dVar.f86830b, dVar.f86831c, dVar.f86832d, true, dVar.f86833e);
                    d.f86828f.a(dVar);
                }
                this.f52318w.clear();
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f52313r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ne0.b bVar = this.f52311p;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.f52314s = false;
        }
        super.onDetachedFromWindow();
        this.f52313r = false;
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        try {
            Drawable drawable = this.f52309n;
            if (drawable != null) {
                i16 = Math.max(this.f52299d, Math.min(this.f52300e, drawable.getIntrinsicWidth()));
                i15 = Math.max(this.f52301f, Math.min(this.f52302g, drawable.getIntrinsicHeight()));
            } else {
                i15 = 0;
                i16 = 0;
            }
            i();
            setMeasuredDimension(View.resolveSizeAndState(getPaddingStart() + getPaddingEnd() + i16, i13, 0), View.resolveSizeAndState(getPaddingTop() + getPaddingBottom() + i15, i14, 0));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        e(savedState.f52322a, savedState.f52323b, false, false);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState;
        Parcelable superState = super.onSaveInstanceState();
        if (superState != null) {
            Intrinsics.checkNotNullParameter(superState, "superState");
            savedState = new SavedState(superState);
            savedState.f52322a = this.f52305j;
            savedState.f52323b = this.f52304i;
        } else {
            savedState = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        h(i13, i14);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z13) {
        super.onVisibilityAggregated(z13);
        if (z13 != this.f52317v) {
            this.f52317v = z13;
            Drawable drawable = this.f52309n;
            if (drawable != null) {
                drawable.setVisible(z13, false);
            }
        }
    }

    @Override // android.view.View
    public final void postInvalidate() {
        if (this.f52310o) {
            return;
        }
        super.postInvalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return drawable == this.f52308m || super.verifyDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeProgressBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52318w = new ArrayList();
        this.f52312q = Thread.currentThread().getId();
        this.f52306k = 100;
        this.f52304i = 100;
        this.f52305j = 0;
        this.f52299d = 24;
        this.f52300e = 48;
        this.f52301f = 24;
        this.f52302g = 48;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.RangeProgressBar, i13, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f52310o = true;
        Drawable drawable2 = obtainStyledAttributes.getDrawable(h.RangeProgressBar_android_progressDrawable);
        if (drawable2 != null && (drawable = this.f52308m) != drawable2) {
            if (drawable != null) {
                drawable.setCallback(null);
                unscheduleDrawable(this.f52308m);
            }
            this.f52308m = drawable2;
            drawable2.setCallback(this);
            drawable2.setLayoutDirection(getLayoutDirection());
            if (drawable2.isStateful()) {
                drawable2.setState(getDrawableState());
            }
            int minimumHeight = drawable2.getMinimumHeight();
            if (this.f52302g < minimumHeight) {
                this.f52302g = minimumHeight;
                requestLayout();
            }
            Drawable drawable3 = this.f52309n;
            this.f52309n = drawable2;
            if (drawable3 != drawable2) {
                if (drawable3 != null) {
                    drawable3.setVisible(false, false);
                }
                Drawable drawable4 = this.f52309n;
                if (drawable4 != null) {
                    drawable4.setVisible(getWindowVisibility() == 0 && isShown(), false);
                }
            }
            postInvalidate();
            h(getWidth(), getHeight());
            i();
            a(R.id.progress, this.f52305j, this.f52304i, false, false, false);
        }
        this.f52299d = obtainStyledAttributes.getDimensionPixelSize(h.RangeProgressBar_android_minWidth, this.f52299d);
        this.f52300e = obtainStyledAttributes.getDimensionPixelSize(h.RangeProgressBar_android_maxWidth, this.f52300e);
        this.f52301f = obtainStyledAttributes.getDimensionPixelSize(h.RangeProgressBar_android_minHeight, this.f52301f);
        this.f52302g = obtainStyledAttributes.getDimensionPixelSize(h.RangeProgressBar_android_maxHeight, this.f52302g);
        this.f52296a = obtainStyledAttributes.getInteger(h.RangeProgressBar_range_progress_startEnd_minDiff, 0);
        this.f52303h = obtainStyledAttributes.getDimensionPixelSize(h.RangeProgressBar_range_progress_offset, 0);
        this.f52298c = obtainStyledAttributes.getInteger(h.RangeProgressBar_range_progress_endMinValue, -1);
        this.f52297b = obtainStyledAttributes.getInteger(h.RangeProgressBar_range_progress_startMaxValue, -1);
        int resourceId = obtainStyledAttributes.getResourceId(h.RangeProgressBar_android_interpolator, R.anim.linear_interpolator);
        if (resourceId > 0) {
            AnimationUtils.loadInterpolator(context, resourceId);
        }
        d(obtainStyledAttributes.getInteger(h.RangeProgressBar_android_max, this.f52306k));
        this.f52310o = false;
        int integer = obtainStyledAttributes.getInteger(h.RangeProgressBar_range_progress_startValue, this.f52305j);
        int integer2 = obtainStyledAttributes.getInteger(h.RangeProgressBar_range_progress_endValue, this.f52304i);
        obtainStyledAttributes.recycle();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        int i14 = this.f52297b;
        int i15 = this.f52298c;
        if (i14 <= i15) {
            if (i14 <= this.f52306k) {
                if (i14 != -1 || i15 != -1) {
                    this.f52296a = 0;
                }
                this.f52297b = i14;
                this.f52298c = i15;
                f(integer, integer2, false, false);
                this.f52307l = true;
                return;
            }
            throw new IllegalArgumentException(a.a.f("startBoundary ", i14, " cannot be greater max value ", this.f52306k));
        }
        throw new IllegalArgumentException(a.a.f("startBoundary ", i14, " cannot be greater than endBoundary ", i15));
    }
}
