package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatBackgroundHelper;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import bk.a0;
import bk.m;
import bk.o;
import fj.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import oi.u6;
import q5.v0;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, a0 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f32338r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f32339s = {R.attr.state_checked};

    /* renamed from: t, reason: collision with root package name */
    public static final int f32340t = l.Widget_MaterialComponents_Button;

    /* renamed from: d, reason: collision with root package name */
    public final b f32341d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f32342e;

    /* renamed from: f, reason: collision with root package name */
    public u6 f32343f;

    /* renamed from: g, reason: collision with root package name */
    public final PorterDuff.Mode f32344g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f32345h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f32346i;

    /* renamed from: j, reason: collision with root package name */
    public String f32347j;

    /* renamed from: k, reason: collision with root package name */
    public int f32348k;

    /* renamed from: l, reason: collision with root package name */
    public int f32349l;

    /* renamed from: m, reason: collision with root package name */
    public int f32350m;

    /* renamed from: n, reason: collision with root package name */
    public int f32351n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32352o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32353p;

    /* renamed from: q, reason: collision with root package name */
    public int f32354q;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f32355c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f32355c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f32355c ? 1 : 0);
        }
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.materialButtonStyle);
    }

    @Override // bk.a0
    public final void Y0(o oVar) {
        if (!h()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f32341d.d(oVar);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public final void b(ColorStateList colorStateList) {
        if (!h()) {
            super.b(colorStateList);
            return;
        }
        b bVar = this.f32341d;
        if (bVar.f32376j != colorStateList) {
            bVar.f32376j = colorStateList;
            if (bVar.b(false) != null) {
                bVar.b(false).setTintList(bVar.f32376j);
            }
        }
    }

    public final Layout.Alignment c() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            return (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
        }
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    public final int d() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    public final int e() {
        int lineCount = getLineCount();
        float f13 = 0.0f;
        for (int i13 = 0; i13 < lineCount; i13++) {
            f13 = Math.max(f13, getLayout().getLineWidth(i13));
        }
        return (int) Math.ceil(f13);
    }

    public final boolean f() {
        b bVar = this.f32341d;
        return bVar != null && bVar.f32383q;
    }

    public final boolean g() {
        WeakHashMap weakHashMap = v0.f102521a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        if (h()) {
            return this.f32341d.f32376j;
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16286a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        if (h()) {
            return this.f32341d.f32375i;
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16286a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.d();
        }
        return null;
    }

    public final boolean h() {
        b bVar = this.f32341d;
        return (bVar == null || bVar.f32381o) ? false : true;
    }

    public final void i() {
        int i13 = this.f32354q;
        boolean z13 = true;
        if (i13 != 1 && i13 != 2) {
            z13 = false;
        }
        if (z13) {
            setCompoundDrawablesRelative(this.f32346i, null, null, null);
            return;
        }
        if (i13 == 3 || i13 == 4) {
            setCompoundDrawablesRelative(null, null, this.f32346i, null);
        } else if (i13 == 16 || i13 == 32) {
            setCompoundDrawablesRelative(null, this.f32346i, null, null);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f32352o;
    }

    public final void j(int i13) {
        if (h()) {
            b bVar = this.f32341d;
            if (bVar.f32382p && bVar.f32373g == i13) {
                return;
            }
            bVar.f32373g = i13;
            bVar.f32382p = true;
            m h10 = bVar.f32368b.h();
            h10.c(i13);
            bVar.d(h10.a());
        }
    }

    public final void k(Drawable drawable) {
        if (this.f32346i != drawable) {
            this.f32346i = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void l(int i13) {
        if (this.f32354q != i13) {
            this.f32354q = i13;
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void m(RippleDrawable rippleDrawable) {
        super.setBackgroundDrawable(rippleDrawable);
    }

    public final void n(ColorStateList colorStateList) {
        if (h()) {
            b bVar = this.f32341d;
            if (bVar.f32377k != colorStateList) {
                bVar.f32377k = colorStateList;
                bVar.g();
            }
        }
    }

    public final void o(int i13) {
        if (h()) {
            b bVar = this.f32341d;
            if (bVar.f32374h != i13) {
                bVar.f32374h = i13;
                bVar.g();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (h()) {
            d7.b.y0(this, this.f32341d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, f32338r);
        }
        if (this.f32352o) {
            View.mergeDrawableStates(onCreateDrawableState, f32339s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String name;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (TextUtils.isEmpty(this.f32347j)) {
            name = (f() ? CompoundButton.class : Button.class).getName();
        } else {
            name = this.f32347j;
        }
        accessibilityEvent.setClassName(name);
        accessibilityEvent.setChecked(this.f32352o);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String name;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (TextUtils.isEmpty(this.f32347j)) {
            name = (f() ? CompoundButton.class : Button.class).getName();
        } else {
            name = this.f32347j;
        }
        accessibilityNodeInfo.setClassName(name);
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setChecked(this.f32352o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f32355c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f32355c = this.f32352o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void p(PorterDuff.Mode mode) {
        if (!h()) {
            AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16286a;
            if (appCompatBackgroundHelper != null) {
                appCompatBackgroundHelper.j(mode);
                return;
            }
            return;
        }
        b bVar = this.f32341d;
        if (bVar.f32375i != mode) {
            bVar.f32375i = mode;
            if (bVar.b(false) == null || bVar.f32375i == null) {
                return;
            }
            bVar.b(false).setTintMode(bVar.f32375i);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f32341d.f32384r) {
            toggle();
        }
        return super.performClick();
    }

    public final void q(boolean z13) {
        Drawable drawable = this.f32346i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f32346i = mutate;
            mutate.setTintList(this.f32345h);
            PorterDuff.Mode mode = this.f32344g;
            if (mode != null) {
                this.f32346i.setTintMode(mode);
            }
            int i13 = this.f32348k;
            if (i13 == 0) {
                i13 = this.f32346i.getIntrinsicWidth();
            }
            int i14 = this.f32348k;
            if (i14 == 0) {
                i14 = this.f32346i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f32346i;
            int i15 = this.f32349l;
            int i16 = this.f32350m;
            drawable2.setBounds(i15, i16, i13 + i15, i14 + i16);
            this.f32346i.setVisible(true, z13);
        }
        if (z13) {
            i();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i17 = this.f32354q;
        if (((i17 == 1 || i17 == 2) && drawable3 != this.f32346i) || (((i17 == 3 || i17 == 4) && drawable5 != this.f32346i) || ((i17 == 16 || i17 == 32) && drawable4 != this.f32346i))) {
            i();
        }
    }

    public final void r(int i13, int i14) {
        if (this.f32346i == null || getLayout() == null) {
            return;
        }
        int i15 = this.f32354q;
        if (!(i15 == 1 || i15 == 2) && i15 != 3 && i15 != 4) {
            if (i15 == 16 || i15 == 32) {
                this.f32349l = 0;
                if (i15 == 16) {
                    this.f32350m = 0;
                    q(false);
                    return;
                }
                int i16 = this.f32348k;
                if (i16 == 0) {
                    i16 = this.f32346i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i14 - d()) - getPaddingTop()) - i16) - this.f32351n) - getPaddingBottom()) / 2);
                if (this.f32350m != max) {
                    this.f32350m = max;
                    q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f32350m = 0;
        Layout.Alignment c13 = c();
        int i17 = this.f32354q;
        if (i17 == 1 || i17 == 3 || ((i17 == 2 && c13 == Layout.Alignment.ALIGN_NORMAL) || (i17 == 4 && c13 == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f32349l = 0;
            q(false);
            return;
        }
        int i18 = this.f32348k;
        if (i18 == 0) {
            i18 = this.f32346i.getIntrinsicWidth();
        }
        int e13 = i13 - e();
        WeakHashMap weakHashMap = v0.f102521a;
        int paddingEnd = (((e13 - getPaddingEnd()) - i18) - this.f32351n) - getPaddingStart();
        if (c13 == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if (g() != (this.f32354q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f32349l != paddingEnd) {
            this.f32349l = paddingEnd;
            q(false);
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f32346i != null) {
            if (this.f32346i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        if (!h()) {
            super.setBackgroundColor(i13);
            return;
        }
        b bVar = this.f32341d;
        if (bVar.b(false) != null) {
            bVar.b(false).setTint(i13);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!h()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f32341d.c();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(int i13) {
        setBackgroundDrawable(i13 != 0 ? com.bumptech.glide.c.I(getContext(), i13) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        b(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        p(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z13) {
        if (f() && isEnabled() && this.f32352o != z13) {
            this.f32352o = z13;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).d(this, this.f32352o);
            }
            if (this.f32353p) {
                return;
            }
            this.f32353p = true;
            Iterator it = this.f32342e.iterator();
            if (it.hasNext()) {
                ep.b.A(it.next());
                throw null;
            }
            this.f32353p = false;
        }
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        if (h()) {
            this.f32341d.b(false).s(f13);
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z13) {
        u6 u6Var = this.f32343f;
        if (u6Var != null) {
            u6Var.i();
        }
        super.setPressed(z13);
    }

    @Override // android.view.View
    public final void setTextAlignment(int i13) {
        super.setTextAlignment(i13);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f32352o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(@androidx.annotation.NonNull android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
