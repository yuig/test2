package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f16308d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatBackgroundHelper f16309a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextHelper f16310b;

    /* renamed from: c, reason: collision with root package name */
    public final tb.c f16311c;

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16309a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16310b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kh2.m0.K0(this, editorInfo, onCreateInputConnection);
        return this.f16311c.l(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16309a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16309a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16310b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16310b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i13) {
        setDropDownBackgroundDrawable(com.bumptech.glide.c.I(getContext(), i13));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f16311c.f(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        AppCompatTextHelper appCompatTextHelper = this.f16310b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.h(context, i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        x2.a(getContext(), this);
        x92.b N = x92.b.N(getContext(), attributeSet, f16308d, i13, 0);
        if (N.G(0)) {
            setDropDownBackgroundDrawable(N.x(0));
        }
        N.O();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f16309a = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f16310b = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i13);
        appCompatTextHelper.b();
        tb.c cVar = new tb.c((EditText) this);
        this.f16311c = cVar;
        cVar.j(attributeSet, i13);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener f13 = cVar.f(keyListener);
            if (f13 == keyListener) {
                return;
            }
            super.setKeyListener(f13);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
