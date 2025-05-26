package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* loaded from: classes2.dex */
public class AppCompatRadioButton extends RadioButton {

    /* renamed from: a, reason: collision with root package name */
    public final w f16312a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatBackgroundHelper f16313b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextHelper f16314c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatEmojiTextHelper f16315d;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16313b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16314c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        if (this.f16315d == null) {
            this.f16315d = new AppCompatEmojiTextHelper(this);
        }
        this.f16315d.c(z13);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16313b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16313b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        w wVar = this.f16312a;
        if (wVar != null) {
            if (wVar.f16701f) {
                wVar.f16701f = false;
            } else {
                wVar.f16701f = true;
                wVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16314c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16314c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f16315d == null) {
            this.f16315d = new AppCompatEmojiTextHelper(this);
        }
        super.setFilters(this.f16315d.a(inputFilterArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        x2.a(getContext(), this);
        w wVar = new w(this, 1);
        this.f16312a = wVar;
        wVar.c(attributeSet, i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f16313b = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f16314c = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i13);
        if (this.f16315d == null) {
            this.f16315d = new AppCompatEmojiTextHelper(this);
        }
        this.f16315d.b(attributeSet, i13);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i13) {
        setButtonDrawable(com.bumptech.glide.c.I(getContext(), i13));
    }
}
