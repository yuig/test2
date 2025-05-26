package com.google.android.gms.common;

import a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import gh.b;
import gh.c;
import gh.d;
import jh.v;
import kg.n;

/* loaded from: classes3.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f30738a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30739b;

    /* renamed from: c, reason: collision with root package name */
    public final View f30740c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f30741d;

    public SignInButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n.a(view);
        View.OnClickListener onClickListener = this.f30741d;
        if (onClickListener == null || view != this.f30740c) {
            return;
        }
        onClickListener.onClick(this);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z13) {
        super.setEnabled(z13);
        this.f30740c.setEnabled(z13);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f30741d = onClickListener;
        View view = this.f30740c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    public SignInButton(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f30741d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.SignInButton, 0, 0);
        try {
            this.f30738a = obtainStyledAttributes.getInt(d.SignInButton_buttonSize, 0);
            this.f30739b = obtainStyledAttributes.getInt(d.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            int i14 = this.f30738a;
            int i15 = this.f30739b;
            this.f30738a = i14;
            this.f30739b = i15;
            Context context2 = getContext();
            View view = this.f30740c;
            if (view != null) {
                removeView(view);
            }
            try {
                this.f30740c = v.B(context2, this.f30738a, this.f30739b);
            } catch (RemoteCreator$RemoteCreatorException unused) {
                Log.w("SignInButton", "Sign in button not found, using placeholder instead");
                int i16 = this.f30738a;
                int i17 = this.f30739b;
                zaaa zaaaVar = new zaaa(context2, null);
                Resources resources = context2.getResources();
                zaaaVar.setTypeface(Typeface.DEFAULT_BOLD);
                zaaaVar.setTextSize(14.0f);
                int i18 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
                zaaaVar.setMinHeight(i18);
                zaaaVar.setMinWidth(i18);
                int i19 = b.common_google_signin_btn_icon_dark;
                int i23 = b.common_google_signin_btn_icon_light;
                int a13 = zaaa.a(i17, i19, i23, i23);
                int i24 = b.common_google_signin_btn_text_dark;
                int i25 = b.common_google_signin_btn_text_light;
                int a14 = zaaa.a(i17, i24, i25, i25);
                if (i16 == 0 || i16 == 1) {
                    a13 = a14;
                } else if (i16 != 2) {
                    throw new IllegalStateException(a.d("Unknown button size: ", i16));
                }
                Drawable drawable = resources.getDrawable(a13);
                drawable.setTintList(resources.getColorStateList(gh.a.common_google_signin_btn_tint));
                drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
                zaaaVar.setBackgroundDrawable(drawable);
                int i26 = gh.a.common_google_signin_btn_text_dark;
                int i27 = gh.a.common_google_signin_btn_text_light;
                ColorStateList colorStateList = resources.getColorStateList(zaaa.a(i17, i26, i27, i27));
                com.bumptech.glide.d.t(colorStateList);
                zaaaVar.setTextColor(colorStateList);
                if (i16 == 0) {
                    zaaaVar.setText(resources.getString(c.common_signin_button_text));
                } else if (i16 == 1) {
                    zaaaVar.setText(resources.getString(c.common_signin_button_text_long));
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException(a.d("Unknown button size: ", i16));
                    }
                    zaaaVar.setText((CharSequence) null);
                }
                zaaaVar.setTransformationMethod(null);
                if (b7.c.D(zaaaVar.getContext())) {
                    zaaaVar.setGravity(19);
                }
                this.f30740c = zaaaVar;
            }
            addView(this.f30740c);
            this.f30740c.setEnabled(isEnabled());
            this.f30740c.setOnClickListener(this);
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
