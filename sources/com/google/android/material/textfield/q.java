package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes.dex */
public final class q {
    public ColorStateList A;

    /* renamed from: a, reason: collision with root package name */
    public final int f33281a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33282b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33283c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f33284d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f33285e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f33286f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f33287g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f33288h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f33289i;

    /* renamed from: j, reason: collision with root package name */
    public int f33290j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f33291k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f33292l;

    /* renamed from: m, reason: collision with root package name */
    public final float f33293m;

    /* renamed from: n, reason: collision with root package name */
    public int f33294n;

    /* renamed from: o, reason: collision with root package name */
    public int f33295o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f33296p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33297q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f33298r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f33299s;

    /* renamed from: t, reason: collision with root package name */
    public int f33300t;

    /* renamed from: u, reason: collision with root package name */
    public int f33301u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f33302v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f33303w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33304x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f33305y;

    /* renamed from: z, reason: collision with root package name */
    public int f33306z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f33287g = context;
        this.f33288h = textInputLayout;
        this.f33293m = context.getResources().getDimensionPixelSize(fj.e.design_textinput_caption_translate_y);
        this.f33281a = tb.f.c0(context, fj.c.motionDurationShort4, RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER);
        this.f33282b = tb.f.c0(context, fj.c.motionDurationMedium4, RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD);
        this.f33283c = tb.f.c0(context, fj.c.motionDurationShort4, RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD);
        this.f33284d = tb.f.d0(context, fj.c.motionEasingEmphasizedDecelerateInterpolator, gj.a.f65170d);
        int i13 = fj.c.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = gj.a.f65167a;
        this.f33285e = tb.f.d0(context, i13, linearInterpolator);
        this.f33286f = tb.f.d0(context, fj.c.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i13) {
        if (this.f33289i == null && this.f33291k == null) {
            Context context = this.f33287g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f33289i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f33289i;
            TextInputLayout textInputLayout = this.f33288h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f33291k = new FrameLayout(context);
            this.f33289i.addView(this.f33291k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.f33167d != null) {
                b();
            }
        }
        if (i13 == 0 || i13 == 1) {
            this.f33291k.setVisibility(0);
            this.f33291k.addView(textView);
        } else {
            this.f33289i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f33289i.setVisibility(0);
        this.f33290j++;
    }

    public final void b() {
        EditText editText;
        if (this.f33289i == null || (editText = this.f33288h.f33167d) == null) {
            return;
        }
        Context context = this.f33287g;
        boolean d03 = com.bumptech.glide.d.d0(context);
        LinearLayout linearLayout = this.f33289i;
        int i13 = fj.e.material_helper_text_font_1_3_padding_horizontal;
        WeakHashMap weakHashMap = v0.f102521a;
        int paddingStart = editText.getPaddingStart();
        if (d03) {
            paddingStart = context.getResources().getDimensionPixelSize(i13);
        }
        int i14 = fj.e.material_helper_text_font_1_3_padding_top;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(fj.e.material_helper_text_default_padding_top);
        if (d03) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(i14);
        }
        int i15 = fj.e.material_helper_text_font_1_3_padding_horizontal;
        int paddingEnd = editText.getPaddingEnd();
        if (d03) {
            paddingEnd = context.getResources().getDimensionPixelSize(i15);
        }
        linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
    }

    public final void c() {
        Animator animator = this.f33292l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z13, TextView textView, int i13, int i14, int i15) {
        if (textView == null || !z13) {
            return;
        }
        if (i13 == i15 || i13 == i14) {
            boolean z14 = i15 == i13;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z14 ? 1.0f : 0.0f);
            int i16 = this.f33283c;
            ofFloat.setDuration(z14 ? this.f33282b : i16);
            ofFloat.setInterpolator(z14 ? this.f33285e : this.f33286f);
            if (i13 == i15 && i14 != 0) {
                ofFloat.setStartDelay(i16);
            }
            arrayList.add(ofFloat);
            if (i15 != i13 || i14 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f33293m, 0.0f);
            ofFloat2.setDuration(this.f33281a);
            ofFloat2.setInterpolator(this.f33284d);
            ofFloat2.setStartDelay(i16);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i13) {
        if (i13 == 1) {
            return this.f33298r;
        }
        if (i13 != 2) {
            return null;
        }
        return this.f33305y;
    }

    public final CharSequence f() {
        return this.f33296p;
    }

    public final ColorStateList g() {
        AppCompatTextView appCompatTextView = this.f33298r;
        if (appCompatTextView != null) {
            return appCompatTextView.getTextColors();
        }
        return null;
    }

    public final void h() {
        this.f33296p = null;
        c();
        if (this.f33294n == 1) {
            if (!this.f33304x || TextUtils.isEmpty(this.f33303w)) {
                this.f33295o = 0;
            } else {
                this.f33295o = 2;
            }
        }
        o(this.f33294n, this.f33295o, m(this.f33298r, ""));
    }

    public final void i() {
        c();
        int i13 = this.f33294n;
        if (i13 == 2) {
            this.f33295o = 0;
        }
        o(i13, this.f33295o, m(this.f33305y, ""));
    }

    public final void j(TextView textView, int i13) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f33289i;
        if (linearLayout == null) {
            return;
        }
        if ((i13 == 0 || i13 == 1) && (frameLayout = this.f33291k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i14 = this.f33290j - 1;
        this.f33290j = i14;
        LinearLayout linearLayout2 = this.f33289i;
        if (i14 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void k(ColorStateList colorStateList) {
        this.f33302v = colorStateList;
        AppCompatTextView appCompatTextView = this.f33298r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public final void l(ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.f33305y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public final boolean m(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = v0.f102521a;
        TextInputLayout textInputLayout = this.f33288h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f33295o == this.f33294n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void n(CharSequence charSequence) {
        c();
        this.f33303w = charSequence;
        this.f33305y.setText(charSequence);
        int i13 = this.f33294n;
        if (i13 != 2) {
            this.f33295o = 2;
        }
        o(i13, this.f33295o, m(this.f33305y, charSequence));
    }

    public final void o(int i13, int i14, boolean z13) {
        TextView e13;
        TextView e14;
        if (i13 == i14) {
            return;
        }
        if (z13) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f33292l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f33304x, this.f33305y, 2, i13, i14);
            d(arrayList, this.f33297q, this.f33298r, 1, i13, i14);
            kotlin.jvm.internal.r.f0(animatorSet, arrayList);
            animatorSet.addListener(new p(this, i14, e(i13), i13, e(i14)));
            animatorSet.start();
        } else if (i13 != i14) {
            if (i14 != 0 && (e14 = e(i14)) != null) {
                e14.setVisibility(0);
                e14.setAlpha(1.0f);
            }
            if (i13 != 0 && (e13 = e(i13)) != null) {
                e13.setVisibility(4);
                if (i13 == 1) {
                    e13.setText((CharSequence) null);
                }
            }
            this.f33294n = i14;
        }
        TextInputLayout textInputLayout = this.f33288h;
        textInputLayout.Y();
        textInputLayout.b0(z13, false);
        textInputLayout.e0();
    }
}
