package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import d7.j0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import lb.l0;
import q5.v0;
import t3.g0;

/* loaded from: classes.dex */
public final class n extends LinearLayout {

    /* renamed from: u */
    public static final /* synthetic */ int f33250u = 0;

    /* renamed from: a */
    public final TextInputLayout f33251a;

    /* renamed from: b */
    public final FrameLayout f33252b;

    /* renamed from: c */
    public final CheckableImageButton f33253c;

    /* renamed from: d */
    public final ColorStateList f33254d;

    /* renamed from: e */
    public final PorterDuff.Mode f33255e;

    /* renamed from: f */
    public final CheckableImageButton f33256f;

    /* renamed from: g */
    public final j0 f33257g;

    /* renamed from: h */
    public int f33258h;

    /* renamed from: i */
    public final LinkedHashSet f33259i;

    /* renamed from: j */
    public ColorStateList f33260j;

    /* renamed from: k */
    public final PorterDuff.Mode f33261k;

    /* renamed from: l */
    public final int f33262l;

    /* renamed from: m */
    public View.OnLongClickListener f33263m;

    /* renamed from: n */
    public final CharSequence f33264n;

    /* renamed from: o */
    public final AppCompatTextView f33265o;

    /* renamed from: p */
    public boolean f33266p;

    /* renamed from: q */
    public EditText f33267q;

    /* renamed from: r */
    public final AccessibilityManager f33268r;

    /* renamed from: s */
    public r5.b f33269s;

    /* renamed from: t */
    public final l f33270t;

    public n(TextInputLayout textInputLayout, x92.b bVar) {
        super(textInputLayout.getContext());
        CharSequence E;
        this.f33258h = 0;
        this.f33259i = new LinkedHashSet();
        this.f33270t = new l(this);
        m mVar = new m(this);
        this.f33268r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f33251a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f33252b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a13 = a(fj.g.text_input_error_icon, from, this);
        this.f33253c = a13;
        CheckableImageButton a14 = a(fj.g.text_input_end_icon, from, frameLayout);
        this.f33256f = a14;
        this.f33257g = new j0(this, bVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f33265o = appCompatTextView;
        if (bVar.G(fj.m.TextInputLayout_errorIconTint)) {
            this.f33254d = com.bumptech.glide.d.I(getContext(), bVar, fj.m.TextInputLayout_errorIconTint);
        }
        if (bVar.G(fj.m.TextInputLayout_errorIconTintMode)) {
            this.f33255e = l0.T0(bVar.B(fj.m.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (bVar.G(fj.m.TextInputLayout_errorIconDrawable)) {
            a13.setImageDrawable(bVar.x(fj.m.TextInputLayout_errorIconDrawable));
            o();
            l0.v(textInputLayout, a13, this.f33254d, this.f33255e);
        }
        a13.setContentDescription(getResources().getText(fj.k.error_icon_content_description));
        WeakHashMap weakHashMap = v0.f102521a;
        a13.setImportantForAccessibility(2);
        a13.setClickable(false);
        a13.f32665f = false;
        a13.setFocusable(false);
        if (!bVar.G(fj.m.TextInputLayout_passwordToggleEnabled)) {
            if (bVar.G(fj.m.TextInputLayout_endIconTint)) {
                this.f33260j = com.bumptech.glide.d.I(getContext(), bVar, fj.m.TextInputLayout_endIconTint);
            }
            if (bVar.G(fj.m.TextInputLayout_endIconTintMode)) {
                this.f33261k = l0.T0(bVar.B(fj.m.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (bVar.G(fj.m.TextInputLayout_endIconMode)) {
            j(bVar.B(fj.m.TextInputLayout_endIconMode, 0));
            if (bVar.G(fj.m.TextInputLayout_endIconContentDescription) && a14.getContentDescription() != (E = bVar.E(fj.m.TextInputLayout_endIconContentDescription))) {
                a14.setContentDescription(E);
            }
            boolean t13 = bVar.t(fj.m.TextInputLayout_endIconCheckable, true);
            if (a14.f32664e != t13) {
                a14.f32664e = t13;
                a14.sendAccessibilityEvent(0);
            }
        } else if (bVar.G(fj.m.TextInputLayout_passwordToggleEnabled)) {
            if (bVar.G(fj.m.TextInputLayout_passwordToggleTint)) {
                this.f33260j = com.bumptech.glide.d.I(getContext(), bVar, fj.m.TextInputLayout_passwordToggleTint);
            }
            if (bVar.G(fj.m.TextInputLayout_passwordToggleTintMode)) {
                this.f33261k = l0.T0(bVar.B(fj.m.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            j(bVar.t(fj.m.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence E2 = bVar.E(fj.m.TextInputLayout_passwordToggleContentDescription);
            if (a14.getContentDescription() != E2) {
                a14.setContentDescription(E2);
            }
        }
        int w13 = bVar.w(fj.m.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(fj.e.mtrl_min_touch_target_size));
        if (w13 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (w13 != this.f33262l) {
            this.f33262l = w13;
            a14.setMinimumWidth(w13);
            a14.setMinimumHeight(w13);
            a13.setMinimumWidth(w13);
            a13.setMinimumHeight(w13);
        }
        if (bVar.G(fj.m.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType N = l0.N(bVar.B(fj.m.TextInputLayout_endIconScaleType, -1));
            a14.setScaleType(N);
            a13.setScaleType(N);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(fj.g.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(bVar.C(fj.m.TextInputLayout_suffixTextAppearance, 0));
        if (bVar.G(fj.m.TextInputLayout_suffixTextColor)) {
            appCompatTextView.setTextColor(bVar.u(fj.m.TextInputLayout_suffixTextColor));
        }
        CharSequence E3 = bVar.E(fj.m.TextInputLayout_suffixText);
        this.f33264n = TextUtils.isEmpty(E3) ? null : E3;
        appCompatTextView.setText(E3);
        q();
        frameLayout.addView(a14);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(a13);
        textInputLayout.f33168d0.add(mVar);
        if (textInputLayout.f33167d != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new g0(this, 3));
    }

    public final CheckableImageButton a(int i13, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(fj.i.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i13);
        if (com.bumptech.glide.d.d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final CheckableImageButton b() {
        if (g()) {
            return this.f33253c;
        }
        if (this.f33258h == 0 || !f()) {
            return null;
        }
        return this.f33256f;
    }

    public final o c() {
        int i13 = this.f33258h;
        j0 j0Var = this.f33257g;
        o oVar = (o) ((SparseArray) j0Var.f53837d).get(i13);
        if (oVar == null) {
            if (i13 == -1) {
                oVar = new f((n) j0Var.f53838e);
            } else if (i13 == 0) {
                oVar = new t((n) j0Var.f53838e);
            } else if (i13 == 1) {
                oVar = new u((n) j0Var.f53838e, j0Var.f53836c);
            } else if (i13 == 2) {
                oVar = new e((n) j0Var.f53838e);
            } else {
                if (i13 != 3) {
                    throw new IllegalArgumentException(a.a.d("Invalid end icon mode: ", i13));
                }
                oVar = new k((n) j0Var.f53838e);
            }
            ((SparseArray) j0Var.f53837d).append(i13, oVar);
        }
        return oVar;
    }

    public final int d() {
        int L;
        if (f() || g()) {
            CheckableImageButton checkableImageButton = this.f33256f;
            L = kh2.w.L((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            L = 0;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        return this.f33265o.getPaddingEnd() + getPaddingEnd() + L;
    }

    public final TextView e() {
        return this.f33265o;
    }

    public final boolean f() {
        return this.f33252b.getVisibility() == 0 && this.f33256f.getVisibility() == 0;
    }

    public final boolean g() {
        return this.f33253c.getVisibility() == 0;
    }

    public final void h(boolean z13) {
        boolean z14;
        boolean isActivated;
        boolean isChecked;
        o c13 = c();
        boolean k13 = c13.k();
        CheckableImageButton checkableImageButton = this.f33256f;
        boolean z15 = true;
        if (!k13 || (isChecked = checkableImageButton.isChecked()) == c13.l()) {
            z14 = false;
        } else {
            checkableImageButton.setChecked(!isChecked);
            z14 = true;
        }
        if (!(c13 instanceof k) || (isActivated = checkableImageButton.isActivated()) == c13.j()) {
            z15 = z14;
        } else {
            i(!isActivated);
        }
        if (z13 || z15) {
            l0.W0(this.f33251a, checkableImageButton, this.f33260j);
        }
    }

    public final void i(boolean z13) {
        this.f33256f.setActivated(z13);
    }

    public final void j(int i13) {
        if (this.f33258h == i13) {
            return;
        }
        o c13 = c();
        r5.b bVar = this.f33269s;
        AccessibilityManager accessibilityManager = this.f33268r;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new r5.c(bVar));
        }
        this.f33269s = null;
        c13.s();
        this.f33258h = i13;
        Iterator it = this.f33259i.iterator();
        if (it.hasNext()) {
            ep.b.A(it.next());
            throw null;
        }
        k(i13 != 0);
        o c14 = c();
        int i14 = this.f33257g.f53835b;
        if (i14 == 0) {
            i14 = c14.d();
        }
        Drawable I = i14 != 0 ? com.bumptech.glide.c.I(getContext(), i14) : null;
        CheckableImageButton checkableImageButton = this.f33256f;
        checkableImageButton.setImageDrawable(I);
        TextInputLayout textInputLayout = this.f33251a;
        if (I != null) {
            l0.v(textInputLayout, checkableImageButton, this.f33260j, this.f33261k);
            l0.W0(textInputLayout, checkableImageButton, this.f33260j);
        }
        int c15 = c14.c();
        CharSequence text = c15 != 0 ? getResources().getText(c15) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        boolean k13 = c14.k();
        if (checkableImageButton.f32664e != k13) {
            checkableImageButton.f32664e = k13;
            checkableImageButton.sendAccessibilityEvent(0);
        }
        if (!c14.i(textInputLayout.O)) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.O + " is not supported by the end icon mode " + i13);
        }
        c14.r();
        r5.b h10 = c14.h();
        this.f33269s = h10;
        if (h10 != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new r5.c(this.f33269s));
            }
        }
        View.OnClickListener f13 = c14.f();
        View.OnLongClickListener onLongClickListener = this.f33263m;
        checkableImageButton.setOnClickListener(f13);
        l0.k1(checkableImageButton, onLongClickListener);
        EditText editText = this.f33267q;
        if (editText != null) {
            c14.m(editText);
            l(c14);
        }
        l0.v(textInputLayout, checkableImageButton, this.f33260j, this.f33261k);
        h(true);
    }

    public final void k(boolean z13) {
        if (f() != z13) {
            this.f33256f.setVisibility(z13 ? 0 : 8);
            n();
            p();
            this.f33251a.X();
        }
    }

    public final void l(o oVar) {
        if (this.f33267q == null) {
            return;
        }
        if (oVar.e() != null) {
            this.f33267q.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.f33256f.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void m(boolean z13) {
        TextInputLayout textInputLayout = this.f33251a;
        CheckableImageButton checkableImageButton = this.f33256f;
        if (!z13 || checkableImageButton.getDrawable() == null) {
            l0.v(textInputLayout, checkableImageButton, this.f33260j, this.f33261k);
            return;
        }
        Drawable mutate = checkableImageButton.getDrawable().mutate();
        mutate.setTint(textInputLayout.n());
        checkableImageButton.setImageDrawable(mutate);
    }

    public final void n() {
        this.f33252b.setVisibility((this.f33256f.getVisibility() != 0 || g()) ? 8 : 0);
        setVisibility((f() || g() || !((this.f33264n == null || this.f33266p) ? 8 : false)) ? 0 : 8);
    }

    public final void o() {
        CheckableImageButton checkableImageButton = this.f33253c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f33251a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.w() && textInputLayout.S()) ? 0 : 8);
        n();
        p();
        if (this.f33258h != 0) {
            return;
        }
        textInputLayout.X();
    }

    public final void p() {
        int i13;
        TextInputLayout textInputLayout = this.f33251a;
        if (textInputLayout.f33167d == null) {
            return;
        }
        if (f() || g()) {
            i13 = 0;
        } else {
            EditText editText = textInputLayout.f33167d;
            WeakHashMap weakHashMap = v0.f102521a;
            i13 = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(fj.e.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f33167d.getPaddingTop();
        int paddingBottom = textInputLayout.f33167d.getPaddingBottom();
        WeakHashMap weakHashMap2 = v0.f102521a;
        this.f33265o.setPaddingRelative(dimensionPixelSize, paddingTop, i13, paddingBottom);
    }

    public final void q() {
        AppCompatTextView appCompatTextView = this.f33265o;
        int visibility = appCompatTextView.getVisibility();
        int i13 = (this.f33264n == null || this.f33266p) ? 8 : 0;
        if (visibility != i13) {
            c().p(i13 == 0);
        }
        n();
        appCompatTextView.setVisibility(i13);
        this.f33251a.X();
    }
}
