package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;
import lb.l0;
import q5.v0;

/* loaded from: classes.dex */
public final class v extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f33315a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f33316b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f33317c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f33318d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f33319e;

    /* renamed from: f, reason: collision with root package name */
    public final PorterDuff.Mode f33320f;

    /* renamed from: g, reason: collision with root package name */
    public final int f33321g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnLongClickListener f33322h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33323i;

    public v(TextInputLayout textInputLayout, x92.b bVar) {
        super(textInputLayout.getContext());
        CharSequence E;
        this.f33315a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(fj.i.design_text_input_start_icon, (ViewGroup) this, false);
        this.f33318d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f33316b = appCompatTextView;
        if (com.bumptech.glide.d.d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f33322h;
        checkableImageButton.setOnClickListener(null);
        l0.k1(checkableImageButton, onLongClickListener);
        this.f33322h = null;
        checkableImageButton.setOnLongClickListener(null);
        l0.k1(checkableImageButton, null);
        if (bVar.G(fj.m.TextInputLayout_startIconTint)) {
            this.f33319e = com.bumptech.glide.d.I(getContext(), bVar, fj.m.TextInputLayout_startIconTint);
        }
        if (bVar.G(fj.m.TextInputLayout_startIconTintMode)) {
            this.f33320f = l0.T0(bVar.B(fj.m.TextInputLayout_startIconTintMode, -1), null);
        }
        if (bVar.G(fj.m.TextInputLayout_startIconDrawable)) {
            b(bVar.x(fj.m.TextInputLayout_startIconDrawable));
            if (bVar.G(fj.m.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (E = bVar.E(fj.m.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(E);
            }
            boolean t13 = bVar.t(fj.m.TextInputLayout_startIconCheckable, true);
            if (checkableImageButton.f32664e != t13) {
                checkableImageButton.f32664e = t13;
                checkableImageButton.sendAccessibilityEvent(0);
            }
        }
        int w13 = bVar.w(fj.m.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(fj.e.mtrl_min_touch_target_size));
        if (w13 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (w13 != this.f33321g) {
            this.f33321g = w13;
            checkableImageButton.setMinimumWidth(w13);
            checkableImageButton.setMinimumHeight(w13);
        }
        if (bVar.G(fj.m.TextInputLayout_startIconScaleType)) {
            checkableImageButton.setScaleType(l0.N(bVar.B(fj.m.TextInputLayout_startIconScaleType, -1)));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(fj.g.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = v0.f102521a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(bVar.C(fj.m.TextInputLayout_prefixTextAppearance, 0));
        if (bVar.G(fj.m.TextInputLayout_prefixTextColor)) {
            appCompatTextView.setTextColor(bVar.u(fj.m.TextInputLayout_prefixTextColor));
        }
        CharSequence E2 = bVar.E(fj.m.TextInputLayout_prefixText);
        this.f33317c = TextUtils.isEmpty(E2) ? null : E2;
        appCompatTextView.setText(E2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int i13;
        CheckableImageButton checkableImageButton = this.f33318d;
        if (checkableImageButton.getVisibility() == 0) {
            i13 = kh2.w.K((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        return this.f33316b.getPaddingStart() + getPaddingStart() + i13;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f33318d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f33319e;
            PorterDuff.Mode mode = this.f33320f;
            TextInputLayout textInputLayout = this.f33315a;
            l0.v(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            l0.W0(textInputLayout, checkableImageButton, this.f33319e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f33322h;
        checkableImageButton.setOnClickListener(null);
        l0.k1(checkableImageButton, onLongClickListener);
        this.f33322h = null;
        checkableImageButton.setOnLongClickListener(null);
        l0.k1(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z13) {
        CheckableImageButton checkableImageButton = this.f33318d;
        if ((checkableImageButton.getVisibility() == 0) != z13) {
            checkableImageButton.setVisibility(z13 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f33315a.f33167d;
        if (editText == null) {
            return;
        }
        if (this.f33318d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = v0.f102521a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(fj.e.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = v0.f102521a;
        this.f33316b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i13 = (this.f33317c == null || this.f33323i) ? 8 : 0;
        setVisibility((this.f33318d.getVisibility() == 0 || i13 == 0) ? 0 : 8);
        this.f33316b.setVisibility(i13);
        this.f33315a.X();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        d();
    }
}
