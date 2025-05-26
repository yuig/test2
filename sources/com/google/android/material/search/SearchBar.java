package com.google.android.material.search;

import a8.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.e0;
import fj.l;
import java.util.WeakHashMap;
import n.o;
import q5.v0;
import v.d3;

/* loaded from: classes3.dex */
public class SearchBar extends Toolbar {

    /* renamed from: m0, reason: collision with root package name */
    public static final int f32944m0 = l.Widget_Material3_SearchBar;
    public final TextView U;
    public final boolean V;
    public final boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public final d3 f32945a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Drawable f32946b0;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f32947c0;

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f32948d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f32949e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Integer f32950f0;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f32951g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f32952h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f32953i0;

    /* renamed from: j0, reason: collision with root package name */
    public final bk.i f32954j0;

    /* renamed from: k0, reason: collision with root package name */
    public final AccessibilityManager f32955k0;

    /* renamed from: l0, reason: collision with root package name */
    public final v f32956l0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public String f32957c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32957c = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f32957c);
        }
    }

    public SearchBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.materialSearchBarStyle);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void A(Drawable drawable) {
        int u13;
        if (this.f32947c0 && drawable != null) {
            Integer num = this.f32950f0;
            if (num != null) {
                u13 = num.intValue();
            } else {
                u13 = b7.c.u(this, drawable == this.f32946b0 ? fj.c.colorOnSurfaceVariant : fj.c.colorOnSurface);
            }
            drawable = drawable.mutate();
            drawable.setTint(u13);
        }
        super.A(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void B(View.OnClickListener onClickListener) {
        if (this.f32948d0) {
            return;
        }
        super.B(onClickListener);
        I(false);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void C(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void D(CharSequence charSequence) {
    }

    public final void H() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z13 = getLayoutDirection() == 1;
        ImageButton b13 = e0.b(this);
        int width = (b13 == null || !b13.isClickable()) ? 0 : z13 ? getWidth() - b13.getLeft() : b13.getRight();
        ActionMenuView a13 = e0.a(this);
        int right = a13 != null ? z13 ? a13.getRight() : getWidth() - a13.getLeft() : 0;
        float f13 = -(z13 ? right : width);
        if (!z13) {
            width = right;
        }
        setHandwritingBoundsOffsets(f13, 0.0f, -width, 0.0f);
    }

    public final void I(boolean z13) {
        ImageButton b13 = e0.b(this);
        if (b13 == null) {
            return;
        }
        b13.setClickable(!z13);
        b13.setFocusable(!z13);
        Drawable background = b13.getBackground();
        if (background != null) {
            this.f32951g0 = background;
        }
        b13.setBackgroundDrawable(z13 ? null : this.f32951g0);
        H();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (this.V && this.f32949e0 == null && !(view instanceof ActionMenuView)) {
            this.f32949e0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i13, layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.y0(this, this.f32954j0);
        if (this.W && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(fj.e.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(fj.e.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i13 = marginLayoutParams.leftMargin;
            if (i13 == 0) {
                i13 = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i13;
            int i14 = marginLayoutParams.topMargin;
            if (i14 == 0) {
                i14 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i14;
            int i15 = marginLayoutParams.rightMargin;
            if (i15 != 0) {
                dimensionPixelSize = i15;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i16 = marginLayoutParams.bottomMargin;
            if (i16 != 0) {
                dimensionPixelSize2 = i16;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f32953i0) {
                if (layoutParams.f32134a == 0) {
                    layoutParams.f32134a = 53;
                }
            } else if (layoutParams.f32134a == 53) {
                layoutParams.f32134a = 0;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        TextView textView = this.U;
        CharSequence text = textView.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(textView.getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = textView.getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        View view = this.f32949e0;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i17 = measuredWidth + measuredWidth2;
            int measuredHeight = this.f32949e0.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i18 = measuredHeight + measuredHeight2;
            View view2 = this.f32949e0;
            WeakHashMap weakHashMap = v0.f102521a;
            if (getLayoutDirection() == 1) {
                view2.layout(getMeasuredWidth() - i17, measuredHeight2, getMeasuredWidth() - measuredWidth2, i18);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i17, i18);
            }
        }
        H();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        View view = this.f32949e0;
        if (view != null) {
            view.measure(i13, i14);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f18020a);
        this.U.setText(savedState.f32957c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = this.U.getText();
        savedState.f32957c = text == null ? null : text.toString();
        return savedState;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void q(int i13) {
        o n13 = n();
        boolean z13 = n13 instanceof o;
        if (z13) {
            n13.B();
        }
        super.q(i13);
        this.f32952h0 = i13;
        if (z13) {
            n13.A();
        }
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        bk.i iVar = this.f32954j0;
        if (iVar != null) {
            iVar.s(f13);
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: g, reason: collision with root package name */
        public boolean f32958g;

        public ScrollingViewBehavior() {
            this.f32958g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.h(coordinatorLayout, view, view2);
            if (!this.f32958g && (view2 instanceof AppBarLayout)) {
                this.f32958g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                com.google.android.material.appbar.l.a(appBarLayout, 0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f32958g = false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchBar(@androidx.annotation.NonNull android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
