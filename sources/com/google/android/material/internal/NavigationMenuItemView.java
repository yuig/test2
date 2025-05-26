package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.i3;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements n.b0 {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public n.q B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final kj.d F;

    /* renamed from: v, reason: collision with root package name */
    public int f32679v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f32680w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f32681x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f32682y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f32683z;

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // n.b0
    public final void e(n.q qVar) {
        StateListDrawable stateListDrawable;
        this.B = qVar;
        int i13 = qVar.f88675a;
        if (i13 > 0) {
            setId(i13);
        }
        setVisibility(qVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(i.a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = v0.f102521a;
            setBackground(stateListDrawable);
        }
        boolean isCheckable = qVar.isCheckable();
        refreshDrawableState();
        boolean z13 = this.f32681x;
        CheckedTextView checkedTextView = this.f32683z;
        if (z13 != isCheckable) {
            this.f32681x = isCheckable;
            this.F.h(checkedTextView, 2048);
        }
        boolean isChecked = qVar.isChecked();
        refreshDrawableState();
        checkedTextView.setChecked(isChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (isChecked && this.f32682y) ? 1 : 0);
        setEnabled(qVar.isEnabled());
        checkedTextView.setText(qVar.f88679e);
        t(qVar.getIcon());
        View actionView = qVar.getActionView();
        if (actionView != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(fj.g.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.A.removeAllViews();
            this.A.addView(actionView);
        }
        setContentDescription(qVar.f88691q);
        i3.a(this, qVar.f88692r);
        n.q qVar2 = this.B;
        if (qVar2.f88679e == null && qVar2.getIcon() == null && this.B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.A.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.A.setLayoutParams(layoutParams2);
        }
    }

    @Override // n.b0
    public final n.q g() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        n.q qVar = this.B;
        if (qVar != null && qVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public final void t(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.C);
            }
            int i13 = this.f32679v;
            drawable.setBounds(0, 0, i13, i13);
        } else if (this.f32680w) {
            if (this.E == null) {
                Resources resources = getResources();
                int i14 = fj.f.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = e5.n.f57243a;
                Drawable drawable2 = resources.getDrawable(i14, theme);
                this.E = drawable2;
                if (drawable2 != null) {
                    int i15 = this.f32679v;
                    drawable2.setBounds(0, 0, i15, i15);
                }
            }
            drawable = this.E;
        }
        this.f32683z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32682y = true;
        kj.d dVar = new kj.d(this, 3);
        this.F = dVar;
        s(0);
        LayoutInflater.from(context).inflate(fj.i.design_navigation_menu_item, (ViewGroup) this, true);
        this.f32679v = context.getResources().getDimensionPixelSize(fj.e.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(fj.g.design_menu_item_text);
        this.f32683z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        v0.o(checkedTextView, dVar);
    }
}
