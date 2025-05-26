package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.y1;
import bk.a0;
import bk.o;
import com.google.android.material.internal.g;
import fj.c;
import fj.l;
import java.util.Arrays;
import java.util.WeakHashMap;
import lb.l0;
import nj.b;
import nj.e;
import nj.f;
import oi.u6;
import q5.v0;
import zj.a;

/* loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements e, a0, g {

    /* renamed from: u, reason: collision with root package name */
    public static final int f32439u = l.Widget_MaterialComponents_Chip_Action;

    /* renamed from: v, reason: collision with root package name */
    public static final Rect f32440v = new Rect();

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f32441w = {R.attr.state_selected};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f32442x = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public final f f32443e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f32444f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f32445g;

    /* renamed from: h, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f32446h;

    /* renamed from: i, reason: collision with root package name */
    public u6 f32447i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32448j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32449k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32450l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32451m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f32452n;

    /* renamed from: o, reason: collision with root package name */
    public int f32453o;

    /* renamed from: p, reason: collision with root package name */
    public int f32454p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f32455q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f32456r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f32457s;

    /* renamed from: t, reason: collision with root package name */
    public final b f32458t;

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.chipStyle);
    }

    @Override // bk.a0
    public final void Y0(o oVar) {
        this.f32443e.Y0(oVar);
    }

    public final void a(int i13) {
        this.f32454p = i13;
        if (!this.f32452n) {
            InsetDrawable insetDrawable = this.f32444f;
            if (insetDrawable == null) {
                d();
                return;
            }
            if (insetDrawable != null) {
                this.f32444f = null;
                setMinWidth(0);
                f fVar = this.f32443e;
                setMinHeight((int) (fVar != null ? fVar.A : 0.0f));
                d();
                return;
            }
            return;
        }
        int max = Math.max(0, i13 - ((int) this.f32443e.A));
        int max2 = Math.max(0, i13 - this.f32443e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f32444f;
            if (insetDrawable2 == null) {
                d();
                return;
            }
            if (insetDrawable2 != null) {
                this.f32444f = null;
                setMinWidth(0);
                f fVar2 = this.f32443e;
                setMinHeight((int) (fVar2 != null ? fVar2.A : 0.0f));
                d();
                return;
            }
            return;
        }
        int i14 = max2 > 0 ? max2 / 2 : 0;
        int i15 = max > 0 ? max / 2 : 0;
        if (this.f32444f != null) {
            Rect rect = new Rect();
            this.f32444f.getPadding(rect);
            if (rect.top == i15 && rect.bottom == i15 && rect.left == i14 && rect.right == i14) {
                d();
                return;
            }
        }
        if (getMinHeight() != i13) {
            setMinHeight(i13);
        }
        if (getMinWidth() != i13) {
            setMinWidth(i13);
        }
        this.f32444f = new InsetDrawable((Drawable) this.f32443e, i14, i15, i14, i15);
        d();
    }

    public final boolean b() {
        f fVar = this.f32443e;
        if (fVar != null) {
            Drawable drawable = fVar.M;
            if ((drawable != null ? l0.C1(drawable) : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        f fVar = this.f32443e;
        return fVar != null && fVar.Q;
    }

    public final void d() {
        int[] iArr = a.f142043a;
        ColorStateList c13 = a.c(this.f32443e.E);
        Drawable drawable = this.f32444f;
        if (drawable == null) {
            drawable = this.f32443e;
        }
        this.f32445g = new RippleDrawable(c13, drawable, null);
        f fVar = this.f32443e;
        if (fVar.f90963x0) {
            fVar.f90963x0 = false;
            fVar.f90965y0 = null;
            fVar.onStateChange(fVar.getState());
        }
        RippleDrawable rippleDrawable = this.f32445g;
        WeakHashMap weakHashMap = v0.f102521a;
        setBackground(rippleDrawable);
        e();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f32443e;
        if (fVar == null || !f.I(fVar.M)) {
            return;
        }
        f fVar2 = this.f32443e;
        ?? isEnabled = isEnabled();
        int i13 = isEnabled;
        if (this.f32451m) {
            i13 = isEnabled + 1;
        }
        int i14 = i13;
        if (this.f32450l) {
            i14 = i13 + 1;
        }
        int i15 = i14;
        if (this.f32449k) {
            i15 = i14 + 1;
        }
        int i16 = i15;
        if (isChecked()) {
            i16 = i15 + 1;
        }
        int[] iArr = new int[i16];
        int i17 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i17 = 1;
        }
        if (this.f32451m) {
            iArr[i17] = 16842908;
            i17++;
        }
        if (this.f32450l) {
            iArr[i17] = 16843623;
            i17++;
        }
        if (this.f32449k) {
            iArr[i17] = 16842919;
            i17++;
        }
        if (isChecked()) {
            iArr[i17] = 16842913;
        }
        if (Arrays.equals(fVar2.f90962w0, iArr)) {
            return;
        }
        fVar2.f90962w0 = iArr;
        if (fVar2.Q() && fVar2.K(fVar2.getState(), iArr)) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f32443e) == null) {
            return;
        }
        int F = (int) (fVar.F() + fVar.f90941b0 + fVar.Y);
        f fVar2 = this.f32443e;
        int E = (int) (fVar2.E() + fVar2.U + fVar2.X);
        if (this.f32444f != null) {
            Rect rect = new Rect();
            this.f32444f.getPadding(rect);
            E += rect.left;
            F += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = v0.f102521a;
        setPaddingRelative(E, paddingTop, F, paddingBottom);
    }

    public final void f() {
        TextPaint paint = getPaint();
        f fVar = this.f32443e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        f fVar2 = this.f32443e;
        yj.e eVar = fVar2 != null ? fVar2.f90948i0.f32705g : null;
        if (eVar != null) {
            eVar.e(getContext(), paint, this.f32458t);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f32455q)) {
            return this.f32455q;
        }
        if (!c()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f32462g.f32694b) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f32443e;
        if (fVar != null) {
            return fVar.A0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.y0(this, this.f32443e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f32441w);
        }
        if (c()) {
            View.mergeDrawableStates(onCreateDrawableState, f32442x);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z13, int i13, Rect rect) {
        super.onFocusChanged(z13, i13, rect);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            RectF rectF = this.f32457s;
            rectF.setEmpty();
            b();
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (this.f32450l != contains) {
                this.f32450l = contains;
                refreshDrawableState();
            }
        } else if (actionMasked == 10 && this.f32450l) {
            this.f32450l = false;
            refreshDrawableState();
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i13;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f32671c) {
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i14 >= chipGroup.getChildCount()) {
                        i15 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i14);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i14).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    i14++;
                }
                i13 = i15;
            } else {
                i13 = -1;
            }
            Object tag = getTag(fj.g.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) y1.j(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i13, 1, false, isChecked()).f19715a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i13) {
        RectF rectF = this.f32457s;
        rectF.setEmpty();
        b();
        return (rectF.contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        if (this.f32453o != i13) {
            this.f32453o = i13;
            e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r0 != 3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.f32457s
            r1.setEmpty()
            r5.b()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L33
            r4 = 2
            if (r0 == r4) goto L25
            r1 = 3
            if (r0 == r1) goto L3c
            goto L55
        L25:
            boolean r0 = r5.f32449k
            if (r0 == 0) goto L55
            if (r1 != 0) goto L5d
            if (r0 == 0) goto L5d
            r5.f32449k = r3
            r5.refreshDrawableState()
            goto L5d
        L33:
            boolean r0 = r5.f32449k
            if (r0 == 0) goto L3c
            r5.playSoundEffect(r3)
            r0 = r2
            goto L3d
        L3c:
            r0 = r3
        L3d:
            boolean r1 = r5.f32449k
            if (r1 == 0) goto L46
            r5.f32449k = r3
            r5.refreshDrawableState()
        L46:
            if (r0 != 0) goto L5d
            goto L55
        L49:
            if (r1 == 0) goto L55
            boolean r6 = r5.f32449k
            if (r6 == r2) goto L5d
            r5.f32449k = r2
            r5.refreshDrawableState()
            goto L5d
        L55:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5c
            goto L5d
        L5c:
            r2 = r3
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        Drawable drawable2 = this.f32444f;
        if (drawable2 == null) {
            drawable2 = this.f32443e;
        }
        if (drawable == drawable2 || drawable == this.f32445g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f32444f;
        if (drawable2 == null) {
            drawable2 = this.f32443e;
        }
        if (drawable == drawable2 || drawable == this.f32445g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundResource(int i13) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z13) {
        f fVar = this.f32443e;
        if (fVar == null) {
            this.f32448j = z13;
        } else if (fVar.Q) {
            super.setChecked(z13);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i15 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i13, i14, i15, i16);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i15 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i13, i14, i15, i16);
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        f fVar = this.f32443e;
        if (fVar != null) {
            fVar.s(f13);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f32443e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f32443e;
        if (fVar != null) {
            fVar.A0 = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i13) {
        if (i13 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i13);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i13) {
        if (this.f32443e == null) {
            return;
        }
        super.setLayoutDirection(i13);
    }

    @Override // android.widget.TextView
    public final void setLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i13);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i13);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i13) {
        super.setMaxWidth(i13);
        f fVar = this.f32443e;
        if (fVar != null) {
            fVar.C0 = i13;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i13);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f32446h = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z13) {
        if (!z13) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z13);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f32443e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.B0 ? null : charSequence, bufferType);
        f fVar2 = this.f32443e;
        if (fVar2 == null || TextUtils.equals(fVar2.F, charSequence)) {
            return;
        }
        fVar2.F = charSequence;
        fVar2.f90948i0.f32703e = true;
        fVar2.invalidateSelf();
        fVar2.J();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        f fVar = this.f32443e;
        if (fVar != null) {
            Context context2 = fVar.f90942c0;
            fVar.f90948i0.c(new yj.e(context2, i13), context2);
        }
        f();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i13, float f13) {
        super.setTextSize(i13, f13);
        f fVar = this.f32443e;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i13, f13, getResources().getDisplayMetrics());
            com.google.android.material.internal.a0 a0Var = fVar.f90948i0;
            yj.e eVar = a0Var.f32705g;
            if (eVar != null) {
                eVar.f139201k = applyDimension;
                a0Var.f32699a.setTextSize(applyDimension);
                fVar.a();
            }
        }
        f();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i13) {
        super.setTextAppearance(i13);
        f fVar = this.f32443e;
        if (fVar != null) {
            Context context = fVar.f90942c0;
            fVar.f90948i0.c(new yj.e(context, i13), context);
        }
        f();
    }
}
