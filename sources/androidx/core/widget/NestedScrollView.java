package androidx.core.widget;

import a.z0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import q5.r;
import q5.t;
import q5.u;
import q5.v0;
import q5.y;

/* loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements t, r, y {
    public static final float C = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final g D = new g(0);
    public static final int[] E = {R.attr.fillViewport};
    public i A;
    public final q5.h B;

    /* renamed from: a, reason: collision with root package name */
    public final float f17952a;

    /* renamed from: b, reason: collision with root package name */
    public long f17953b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f17954c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f17955d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f17956e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f17957f;

    /* renamed from: g, reason: collision with root package name */
    public int f17958g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17959h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17960i;

    /* renamed from: j, reason: collision with root package name */
    public View f17961j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17962k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f17963l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17964m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f17965n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17966o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17967p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17968q;

    /* renamed from: r, reason: collision with root package name */
    public int f17969r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f17970s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f17971t;

    /* renamed from: u, reason: collision with root package name */
    public int f17972u;

    /* renamed from: v, reason: collision with root package name */
    public int f17973v;

    /* renamed from: w, reason: collision with root package name */
    public SavedState f17974w;

    /* renamed from: x, reason: collision with root package name */
    public final u f17975x;

    /* renamed from: y, reason: collision with root package name */
    public final e3.a f17976y;

    /* renamed from: z, reason: collision with root package name */
    public float f17977z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();

        /* renamed from: a, reason: collision with root package name */
        public int f17978a;

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" scrollPosition=");
            return a.a.n(sb3, this.f17978a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f17978a);
        }
    }

    public NestedScrollView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.a.nestedScrollViewStyle);
    }

    public static boolean L(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && L((View) parent, view2);
    }

    public final boolean B0(MotionEvent motionEvent) {
        boolean z13;
        EdgeEffect edgeEffect = this.f17956e;
        if (ph.a.I(edgeEffect) != 0.0f) {
            ph.a.D0(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z13 = true;
        } else {
            z13 = false;
        }
        EdgeEffect edgeEffect2 = this.f17957f;
        if (ph.a.I(edgeEffect2) == 0.0f) {
            return z13;
        }
        ph.a.D0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final int C() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public final float D() {
        if (this.f17977z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f17977z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f17977z;
    }

    public final void F0(int i13) {
        this.f17976y.s(i13);
    }

    public final boolean T(View view, int i13, int i14) {
        Rect rect = this.f17954c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i13 >= getScrollY() && rect.top - i13 <= getScrollY() + i14;
    }

    public final void X(int i13, int i14, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i13);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f17976y.e(0, scrollY2, 0, i13 - scrollY2, i14, null, iArr);
    }

    public final void Y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17969r) {
            int i13 = actionIndex == 0 ? 1 : 0;
            this.f17958g = (int) motionEvent.getY(i13);
            this.f17969r = motionEvent.getPointerId(i13);
            VelocityTracker velocityTracker = this.f17963l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean Z(int i13, int i14, int i15, int i16) {
        boolean z13;
        boolean z14;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i17 = i15 + i13;
        if (i14 <= 0 && i14 >= 0) {
            z13 = false;
        } else {
            i14 = 0;
            z13 = true;
        }
        if (i17 <= i16) {
            if (i17 >= 0) {
                i16 = i17;
                z14 = false;
                if (z14 && !this.f17976y.h(1)) {
                    this.f17955d.springBack(i14, i16, 0, 0, 0, C());
                }
                super.scrollTo(i14, i16);
                return z13 || z14;
            }
            i16 = 0;
        }
        z14 = true;
        if (z14) {
            this.f17955d.springBack(i14, i16, 0, 0, 0, C());
        }
        super.scrollTo(i14, i16);
        if (z13) {
            return true;
        }
    }

    public final void a0(int i13) {
        boolean z13 = i13 == 130;
        int height = getHeight();
        Rect rect = this.f17954c;
        if (z13) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i14 = rect.top;
        int i15 = height + i14;
        rect.bottom = i15;
        d0(i13, i14, i15);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d0(int i13, int i14, int i15) {
        boolean z13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i16 = height + scrollY;
        boolean z14 = i13 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z15 = false;
        for (int i17 = 0; i17 < size; i17++) {
            View view2 = focusables.get(i17);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i14 < bottom && top < i15) {
                boolean z16 = i14 < top && bottom < i15;
                if (view == null) {
                    view = view2;
                    z15 = z16;
                } else {
                    boolean z17 = (z14 && top < view.getTop()) || (!z14 && bottom > view.getBottom());
                    if (z15) {
                        if (z16) {
                            if (!z17) {
                            }
                            view = view2;
                        }
                    } else if (z16) {
                        view = view2;
                        z15 = true;
                    } else {
                        if (!z17) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i14 < scrollY || i15 > i16) {
            g0(z14 ? i14 - scrollY : i15 - i16, 0, true, 1);
            z13 = true;
        } else {
            z13 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i13);
        }
        return z13;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        return this.f17976y.b(f13, f14, z13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f13, float f14) {
        return this.f17976y.c(f13, f14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return this.f17976y.d(i13, i14, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return this.f17976y.e(i13, i14, i15, i16, 0, iArr, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i13;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f17956e;
        int i14 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i13 = getPaddingLeft();
            } else {
                i13 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i13, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f17957f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(C(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i14 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i14 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final int g0(int i13, int i14, boolean z13, int i15) {
        int i16;
        int i17;
        VelocityTracker velocityTracker;
        if (i15 == 1) {
            z0(2, i15);
        }
        boolean d2 = this.f17976y.d(0, i13, i15, this.f17971t, this.f17970s);
        int[] iArr = this.f17971t;
        int[] iArr2 = this.f17970s;
        if (d2) {
            i16 = i13 - iArr[1];
            i17 = iArr2[1];
        } else {
            i16 = i13;
            i17 = 0;
        }
        int scrollY = getScrollY();
        int C2 = C();
        int overScrollMode = getOverScrollMode();
        boolean z14 = (overScrollMode == 0 || (overScrollMode == 1 && C() > 0)) && !z13;
        boolean z15 = Z(i16, 0, scrollY, C2) && !this.f17976y.h(i15);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f17976y.e(0, scrollY2, 0, i16 - scrollY2, i15, this.f17970s, iArr);
        int i18 = i17 + iArr2[1];
        int i19 = i16 - iArr[1];
        int i23 = scrollY + i19;
        EdgeEffect edgeEffect = this.f17957f;
        EdgeEffect edgeEffect2 = this.f17956e;
        if (i23 < 0) {
            if (z14) {
                ph.a.D0(edgeEffect2, (-i19) / getHeight(), i14 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i23 > C2 && z14) {
            ph.a.D0(edgeEffect, i19 / getHeight(), 1.0f - (i14 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z15 && i15 == 0 && (velocityTracker = this.f17963l) != null) {
            velocityTracker.clear();
        }
        if (i15 == 1) {
            F0(i15);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i18;
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f17975x.b();
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f17976y.h(0);
    }

    @Override // q5.s
    public final void i(View view, View view2, int i13, int i14) {
        this.f17975x.c(i13, i14);
        z0(2, i14);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f17976y.f56995a;
    }

    @Override // q5.s
    public final void k(View view, int i13) {
        this.f17975x.d(i13);
        F0(i13);
    }

    public final void k0(z0 z0Var) {
        this.A = z0Var;
    }

    @Override // q5.s
    public final void l(View view, int i13, int i14, int[] iArr, int i15) {
        this.f17976y.d(i13, i14, i15, iArr, null);
    }

    public final boolean m(int i13) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i13);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus == null || !T(findNextFocus, height, getHeight())) {
            if (i13 == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i13 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i13 != 130) {
                height = -height;
            }
            g0(height, 0, true, 1);
        } else {
            Rect rect = this.f17954c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            g0(n(rect), 0, true, 1);
            findNextFocus.requestFocus(i13);
        }
        if (findFocus != null && findFocus.isFocused() && (!T(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i13, int i14) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final int n(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i14 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i13 - verticalFadingEdgeLength : i13;
        int i15 = rect.bottom;
        if (i15 > i14 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i14, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i15 >= i14) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i14 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean o(KeyEvent keyEvent) {
        this.f17954c.setEmpty();
        int childCount = getChildCount();
        int i13 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN;
        if (childCount > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? z(33) : m(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? z(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN) : m(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
                }
                if (keyCode == 62) {
                    if (keyEvent.isShiftPressed()) {
                        i13 = 33;
                    }
                    a0(i13);
                    return false;
                }
                if (keyCode == 92) {
                    return z(33);
                }
                if (keyCode == 93) {
                    return z(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
                }
                if (keyCode == 122) {
                    a0(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                a0(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN)) ? false : true;
    }

    public final boolean o0(EdgeEffect edgeEffect, int i13) {
        if (i13 > 0) {
            return true;
        }
        float I = ph.a.I(edgeEffect) * getHeight();
        float abs = Math.abs(-i13) * 0.35f;
        float f13 = this.f17952a * 0.015f;
        double log = Math.log(abs / f13);
        double d2 = C;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f13))) < I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17960i = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00c3, code lost:
    
        if (r5 >= 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z13 = true;
        if (action == 2 && this.f17962k) {
            return true;
        }
        int i13 = action & 255;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = this.f17969r;
                    if (i14 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i14);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i14 + " in onInterceptTouchEvent");
                        } else {
                            int y13 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y13 - this.f17958g) > this.f17966o && (2 & this.f17975x.b()) == 0) {
                                this.f17962k = true;
                                this.f17958g = y13;
                                if (this.f17963l == null) {
                                    this.f17963l = VelocityTracker.obtain();
                                }
                                this.f17963l.addMovement(motionEvent);
                                this.f17972u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i13 != 3) {
                    if (i13 == 6) {
                        Y(motionEvent);
                    }
                }
            }
            this.f17962k = false;
            this.f17969r = -1;
            VelocityTracker velocityTracker = this.f17963l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f17963l = null;
            }
            if (this.f17955d.springBack(getScrollX(), getScrollY(), 0, 0, 0, C())) {
                postInvalidateOnAnimation();
            }
            F0(0);
        } else {
            int y14 = (int) motionEvent.getY();
            int x13 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y14 >= childAt.getTop() - scrollY && y14 < childAt.getBottom() - scrollY && x13 >= childAt.getLeft() && x13 < childAt.getRight()) {
                    this.f17958g = y14;
                    this.f17969r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f17963l;
                    if (velocityTracker2 == null) {
                        this.f17963l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f17963l.addMovement(motionEvent);
                    this.f17955d.computeScrollOffset();
                    if (!B0(motionEvent) && this.f17955d.isFinished()) {
                        z13 = false;
                    }
                    this.f17962k = z13;
                    z0(2, 0);
                }
            }
            if (!B0(motionEvent) && this.f17955d.isFinished()) {
                z13 = false;
            }
            this.f17962k = z13;
            VelocityTracker velocityTracker3 = this.f17963l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f17963l = null;
            }
        }
        return this.f17962k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        super.onLayout(z13, i13, i14, i15, i16);
        int i18 = 0;
        this.f17959h = false;
        View view = this.f17961j;
        if (view != null && L(view, this)) {
            View view2 = this.f17961j;
            Rect rect = this.f17954c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int n13 = n(rect);
            if (n13 != 0) {
                scrollBy(0, n13);
            }
        }
        this.f17961j = null;
        if (!this.f17960i) {
            if (this.f17974w != null) {
                scrollTo(getScrollX(), this.f17974w.f17978a);
                this.f17974w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i17 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i17 = 0;
            }
            int paddingTop = ((i16 - i14) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i17 && scrollY >= 0) {
                i18 = paddingTop + scrollY > i17 ? i17 - paddingTop : scrollY;
            }
            if (i18 != scrollY) {
                scrollTo(getScrollX(), i18);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f17960i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f17964m && View.MeasureSpec.getMode(i14) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        if (z13) {
            return false;
        }
        dispatchNestedFling(0.0f, f14, true);
        q((int) f14);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        return this.f17976y.c(f13, f14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        this.f17976y.d(i13, i14, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        X(i16, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i13) {
        i(view, view2, i13, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i13, int i14, boolean z13, boolean z14) {
        super.scrollTo(i13, i14);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i13, Rect rect) {
        if (i13 == 2) {
            i13 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN;
        } else if (i13 == 1) {
            i13 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i13) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i13);
        if (findNextFocus == null || (true ^ T(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i13, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f17974w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17978a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i13, int i14, int i15, int i16) {
        super.onScrollChanged(i13, i14, i15, i16);
        i iVar = this.A;
        if (iVar != null) {
            iVar.h(this, i14, i16);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !T(findFocus, 0, i16)) {
            return;
        }
        Rect rect = this.f17954c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int n13 = n(rect);
        if (n13 != 0) {
            if (this.f17965n) {
                r0(0, n13, false);
            } else {
                scrollBy(0, n13);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i13) {
        return x(view, view2, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        k(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f17963l == null) {
            this.f17963l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17972u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f13 = 0.0f;
        obtain.offsetLocation(0.0f, this.f17972u);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f17957f;
            EdgeEffect edgeEffect2 = this.f17956e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f17963l;
                velocityTracker.computeCurrentVelocity(1000, this.f17968q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f17969r);
                if (Math.abs(yVelocity) >= this.f17967p) {
                    if (ph.a.I(edgeEffect2) != 0.0f) {
                        if (o0(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            q(-yVelocity);
                        }
                    } else if (ph.a.I(edgeEffect) != 0.0f) {
                        int i13 = -yVelocity;
                        if (o0(edgeEffect, i13)) {
                            edgeEffect.onAbsorb(i13);
                        } else {
                            q(i13);
                        }
                    } else {
                        int i14 = -yVelocity;
                        float f14 = i14;
                        if (!this.f17976y.c(0.0f, f14)) {
                            dispatchNestedFling(0.0f, f14, true);
                            q(i14);
                        }
                    }
                } else if (this.f17955d.springBack(getScrollX(), getScrollY(), 0, 0, 0, C())) {
                    postInvalidateOnAnimation();
                }
                this.f17969r = -1;
                this.f17962k = false;
                VelocityTracker velocityTracker2 = this.f17963l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f17963l = null;
                }
                F0(0);
                this.f17956e.onRelease();
                this.f17957f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f17969r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f17969r + " in onTouchEvent");
                } else {
                    int y13 = (int) motionEvent.getY(findPointerIndex);
                    int i15 = this.f17958g - y13;
                    float x13 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i15 / getHeight();
                    if (ph.a.I(edgeEffect2) != 0.0f) {
                        float f15 = -ph.a.D0(edgeEffect2, -height, x13);
                        if (ph.a.I(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f13 = f15;
                    } else if (ph.a.I(edgeEffect) != 0.0f) {
                        float D0 = ph.a.D0(edgeEffect, height, 1.0f - x13);
                        if (ph.a.I(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f13 = D0;
                    }
                    int round = Math.round(f13 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i16 = i15 - round;
                    if (!this.f17962k && Math.abs(i16) > this.f17966o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f17962k = true;
                        i16 = i16 > 0 ? i16 - this.f17966o : i16 + this.f17966o;
                    }
                    if (this.f17962k) {
                        int g03 = g0(i16, (int) motionEvent.getX(findPointerIndex), false, 0);
                        this.f17958g = y13 - g03;
                        this.f17972u += g03;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f17962k && getChildCount() > 0 && this.f17955d.springBack(getScrollX(), getScrollY(), 0, 0, 0, C())) {
                    postInvalidateOnAnimation();
                }
                this.f17969r = -1;
                this.f17962k = false;
                VelocityTracker velocityTracker3 = this.f17963l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f17963l = null;
                }
                F0(0);
                this.f17956e.onRelease();
                this.f17957f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f17958g = (int) motionEvent.getY(actionIndex);
                this.f17969r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                Y(motionEvent);
                this.f17958g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f17969r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f17962k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f17955d.isFinished()) {
                this.f17955d.abortAnimation();
                F0(1);
            }
            int y14 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f17958g = y14;
            this.f17969r = pointerId;
            z0(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f17963l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void q(int i13) {
        if (getChildCount() > 0) {
            this.f17955d.fling(getScrollX(), getScrollY(), 0, i13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            z0(2, 1);
            this.f17973v = getScrollY();
            postInvalidateOnAnimation();
            if (j5.b.b()) {
                h.a(this, Math.abs(this.f17955d.getCurrVelocity()));
            }
        }
    }

    public final void r0(int i13, int i14, boolean z13) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f17953b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f17955d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i14 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z13) {
                z0(2, 1);
            } else {
                F0(1);
            }
            this.f17973v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f17955d.isFinished()) {
                this.f17955d.abortAnimation();
                F0(1);
            }
            scrollBy(i13, i14);
        }
        this.f17953b = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f17959h) {
            this.f17961j = view2;
        } else {
            Rect rect = this.f17954c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int n13 = n(rect);
            if (n13 != 0) {
                scrollBy(0, n13);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z13) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int n13 = n(rect);
        boolean z14 = n13 != 0;
        if (z14) {
            if (z13) {
                scrollBy(0, n13);
            } else {
                r0(0, n13, false);
            }
        }
        return z14;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z13) {
        VelocityTracker velocityTracker;
        if (z13 && (velocityTracker = this.f17963l) != null) {
            velocityTracker.recycle();
            this.f17963l = null;
        }
        super.requestDisallowInterceptTouchEvent(z13);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f17959h = true;
        super.requestLayout();
    }

    @Override // q5.t
    public final void s(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        X(i16, i17, iArr);
    }

    @Override // android.view.View
    public void scrollTo(int i13, int i14) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i13 < 0) {
                i13 = 0;
            } else if (width + i13 > width2) {
                i13 = width2 - width;
            }
            if (height >= height2 || i14 < 0) {
                i14 = 0;
            } else if (height + i14 > height2) {
                i14 = height2 - height;
            }
            if (i13 == getScrollX() && i14 == getScrollY()) {
                return;
            }
            super.scrollTo(i13, i14);
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z13) {
        this.f17976y.o(z13);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i13) {
        return this.f17976y.q(i13, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        F0(0);
    }

    @Override // q5.s
    public final void t(View view, int i13, int i14, int i15, int i16, int i17) {
        X(i16, i17, null);
    }

    public final void t0(int i13) {
        r0(0 - getScrollX(), i13 - getScrollY(), false);
    }

    @Override // q5.s
    public final boolean x(View view, View view2, int i13, int i14) {
        return (i13 & 2) != 0;
    }

    public final boolean z(int i13) {
        int childCount;
        boolean z13 = i13 == 130;
        int height = getHeight();
        Rect rect = this.f17954c;
        rect.top = 0;
        rect.bottom = height;
        if (z13 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return d0(i13, rect.top, rect.bottom);
    }

    public final boolean z0(int i13, int i14) {
        return this.f17976y.q(2, i14);
    }

    public NestedScrollView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17954c = new Rect();
        this.f17959h = true;
        this.f17960i = false;
        this.f17961j = null;
        this.f17962k = false;
        this.f17965n = true;
        this.f17969r = -1;
        this.f17970s = new int[2];
        this.f17971t = new int[2];
        this.B = new q5.h(getContext(), new t5.e(this, 1));
        int i14 = Build.VERSION.SDK_INT;
        this.f17956e = i14 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f17957f = i14 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f17952a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f17955d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f17966o = viewConfiguration.getScaledTouchSlop();
        this.f17967p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17968q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, i13, 0);
        boolean z13 = obtainStyledAttributes.getBoolean(0, false);
        if (z13 != this.f17964m) {
            this.f17964m = z13;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.f17975x = new u();
        this.f17976y = new e3.a(this);
        setNestedScrollingEnabled(true);
        v0.o(this, D);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13) {
        if (getChildCount() <= 0) {
            super.addView(view, i13);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i13, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
