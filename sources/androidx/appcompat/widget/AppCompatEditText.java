package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements q5.w {

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatBackgroundHelper f16297a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextHelper f16298b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextClassifierHelper f16299c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.core.widget.m f16300d;

    /* renamed from: e, reason: collision with root package name */
    public final tb.c f16301e;

    /* renamed from: f, reason: collision with root package name */
    public q f16302f;

    public AppCompatEditText(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.editTextStyle);
    }

    @Override // q5.w
    public final q5.g a(q5.g gVar) {
        this.f16300d.getClass();
        return androidx.core.widget.m.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16297a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16298b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.i(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT < 28 && (appCompatTextClassifierHelper = this.f16299c) != null) {
            TextClassifier textClassifier = appCompatTextClassifierHelper.f16329b;
            return textClassifier == null ? k0.a(appCompatTextClassifierHelper.f16328a) : textClassifier;
        }
        if (this.f16302f == null) {
            this.f16302f = new q(this, 1);
        }
        return this.f16302f.z();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g13;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f16298b.getClass();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && onCreateInputConnection != null) {
            kh2.g3.t2(editorInfo, getText());
        }
        kh2.m0.K0(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && i13 <= 30 && (g13 = q5.v0.g(this)) != null) {
            kh2.g3.s2(editorInfo, g13);
            onCreateInputConnection = rl2.g0.t(this, editorInfo, onCreateInputConnection);
        }
        return this.f16301e.l(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i13 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (kh2.a1.j0(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i13) {
        if (kh2.a1.k0(this, i13)) {
            return true;
        }
        return super.onTextContextMenuItem(i13);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16297a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16297a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16298b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.g();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16298b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.j(callback, this));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f16301e.f(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        AppCompatTextHelper appCompatTextHelper = this.f16298b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.h(context, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT < 28 && (appCompatTextClassifierHelper = this.f16299c) != null) {
            appCompatTextClassifierHelper.f16329b = textClassifier;
            return;
        }
        if (this.f16302f == null) {
            this.f16302f = new q(this, 1);
        }
        this.f16302f.D(textClassifier);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        x2.a(getContext(), this);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f16297a = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f16298b = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i13);
        appCompatTextHelper.b();
        AppCompatTextClassifierHelper appCompatTextClassifierHelper = new AppCompatTextClassifierHelper();
        appCompatTextClassifierHelper.f16328a = this;
        this.f16299c = appCompatTextClassifierHelper;
        this.f16300d = new androidx.core.widget.m();
        tb.c cVar = new tb.c((EditText) this);
        this.f16301e = cVar;
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

    @Override // android.widget.EditText, android.widget.TextView
    public final Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
