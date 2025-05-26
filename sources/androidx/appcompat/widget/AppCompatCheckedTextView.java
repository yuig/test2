package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final w f16293a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatBackgroundHelper f16294b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextHelper f16295c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatEmojiTextHelper f16296d;

    public AppCompatCheckedTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.f16295c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16294b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        w wVar = this.f16293a;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.i(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kh2.m0.K0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        if (this.f16296d == null) {
            this.f16296d = new AppCompatEmojiTextHelper(this);
        }
        this.f16296d.c(z13);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16294b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16294b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        w wVar = this.f16293a;
        if (wVar != null) {
            if (wVar.f16701f) {
                wVar.f16701f = false;
            } else {
                wVar.f16701f = true;
                wVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16295c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f16295c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.j(callback, this));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        AppCompatTextHelper appCompatTextHelper = this.f16295c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.h(context, i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        x2.a(getContext(), this);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f16295c = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i13);
        appCompatTextHelper.b();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f16294b = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        w wVar = new w(this, 0);
        this.f16293a = wVar;
        wVar.c(attributeSet, i13);
        if (this.f16296d == null) {
            this.f16296d = new AppCompatEmojiTextHelper(this);
        }
        this.f16296d.b(attributeSet, i13);
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i13) {
        setCheckMarkDrawable(com.bumptech.glide.c.I(getContext(), i13));
    }
}
