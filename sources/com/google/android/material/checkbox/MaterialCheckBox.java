package com.google.android.material.checkbox;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.w;
import fj.c;
import fj.g;
import fj.k;
import fj.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lb.l0;
import va.f;
import xj.b;

/* loaded from: classes3.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[][] A;
    public static final int B;

    /* renamed from: x, reason: collision with root package name */
    public static final int f32416x = l.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f32417y = {c.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f32418z;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f32419e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f32420f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32421g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32422h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f32423i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f32424j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f32425k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f32426l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32427m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f32428n;

    /* renamed from: o, reason: collision with root package name */
    public final ColorStateList f32429o;

    /* renamed from: p, reason: collision with root package name */
    public final PorterDuff.Mode f32430p;

    /* renamed from: q, reason: collision with root package name */
    public int f32431q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f32432r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32433s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f32434t;

    /* renamed from: u, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f32435u;

    /* renamed from: v, reason: collision with root package name */
    public final f f32436v;

    /* renamed from: w, reason: collision with root package name */
    public final b f32437w;

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f32438a;

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" CheckedState=");
            int i13 = this.f32438a;
            return a.a.p(sb3, i13 != 1 ? i13 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeValue(Integer.valueOf(this.f32438a));
        }
    }

    static {
        int i13 = c.state_error;
        f32418z = new int[]{i13};
        A = new int[][]{new int[]{R.attr.state_enabled, i13}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.checkboxStyle);
    }

    public final void a() {
        ColorStateList colorStateList;
        this.f32425k = d7.b.x(this.f32425k, this.f32428n, getButtonTintMode());
        Drawable drawable = this.f32426l;
        ColorStateList colorStateList2 = this.f32429o;
        this.f32426l = d7.b.x(drawable, colorStateList2, this.f32430p);
        if (this.f32427m) {
            f fVar = this.f32436v;
            if (fVar != null) {
                b bVar = this.f32437w;
                fVar.d(bVar);
                fVar.c(bVar);
            }
            Drawable drawable2 = this.f32425k;
            if ((drawable2 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable2).addTransition(g.checked, g.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f32425k).addTransition(g.indeterminate, g.unchecked, fVar, false);
            }
        }
        Drawable drawable3 = this.f32425k;
        if (drawable3 != null && (colorStateList = this.f32428n) != null) {
            drawable3.setTintList(colorStateList);
        }
        Drawable drawable4 = this.f32426l;
        if (drawable4 != null && colorStateList2 != null) {
            drawable4.setTintList(colorStateList2);
        }
        super.setButtonDrawable(d7.b.s(this.f32425k, this.f32426l, -1, -1));
        refreshDrawableState();
    }

    public final void b(int i13) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f32431q != i13) {
            this.f32431q = i13;
            super.setChecked(i13 == 1);
            refreshDrawableState();
            c();
            if (this.f32433s) {
                return;
            }
            this.f32433s = true;
            LinkedHashSet linkedHashSet = this.f32419e;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                    throw null;
                }
            }
            if (this.f32431q != 2 && (onCheckedChangeListener = this.f32435u) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f32433s = false;
        }
    }

    public final void c() {
        if (Build.VERSION.SDK_INT < 30 || this.f32434t != null) {
            return;
        }
        int i13 = this.f32431q;
        super.setStateDescription(i13 == 1 ? getResources().getString(k.mtrl_checkbox_state_description_checked) : i13 == 0 ? getResources().getString(k.mtrl_checkbox_state_description_unchecked) : getResources().getString(k.mtrl_checkbox_state_description_indeterminate));
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.f32425k;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.f32428n;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f32431q == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32421g && this.f32428n == null && this.f32429o == null) {
            this.f32421g = true;
            if (this.f32420f == null) {
                int u13 = b7.c.u(this, c.colorControlActivated);
                int u14 = b7.c.u(this, c.colorError);
                int u15 = b7.c.u(this, c.colorSurface);
                int u16 = b7.c.u(this, c.colorOnSurface);
                this.f32420f = new ColorStateList(A, new int[]{b7.c.F(u15, 1.0f, u14), b7.c.F(u15, 1.0f, u13), b7.c.F(u15, 0.54f, u16), b7.c.F(u15, 0.38f, u16), b7.c.F(u15, 0.38f, u16)});
            }
            setButtonTintList(this.f32420f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        if (this.f32431q == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f32417y);
        }
        if (this.f32423i) {
            View.mergeDrawableStates(onCreateDrawableState, f32418z);
        }
        this.f32432r = d7.b.N(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f32422h || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (l0.H0(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f32423i) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f32424j));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        b(savedState.f32438a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f32438a = this.f32431q;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(int i13) {
        setButtonDrawable(com.bumptech.glide.c.I(getContext(), i13));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.f32428n == colorStateList) {
            return;
        }
        this.f32428n = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        w wVar = this.f16289a;
        if (wVar != null) {
            wVar.f16698c = mode;
            wVar.f16700e = true;
            wVar.a();
        }
        a();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z13) {
        b(z13 ? 1 : 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z13) {
        super.setEnabled(z13);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f32435u = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.f32434t = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        b(!isChecked() ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCheckBox(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.f32425k = drawable;
        this.f32427m = false;
        a();
    }
}
