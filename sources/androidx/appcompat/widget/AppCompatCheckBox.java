package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class AppCompatCheckBox extends CheckBox {

    /* renamed from: a, reason: collision with root package name */
    public final w f16289a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatBackgroundHelper f16290b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextHelper f16291c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatEmojiTextHelper f16292d;

    public AppCompatCheckBox(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16290b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16291c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        if (this.f16292d == null) {
            this.f16292d = new AppCompatEmojiTextHelper(this);
        }
        this.f16292d.c(z13);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16290b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16290b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        w wVar = this.f16289a;
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16291c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16291c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f16292d == null) {
            this.f16292d = new AppCompatEmojiTextHelper(this);
        }
        super.setFilters(this.f16292d.a(inputFilterArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        x2.a(getContext(), this);
        w wVar = new w(this, 1);
        this.f16289a = wVar;
        wVar.c(attributeSet, i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f16290b = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f16291c = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i13);
        if (this.f16292d == null) {
            this.f16292d = new AppCompatEmojiTextHelper(this);
        }
        this.f16292d.b(attributeSet, i13);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i13) {
        setButtonDrawable(com.bumptech.glide.c.I(getContext(), i13));
    }
}
