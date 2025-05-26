package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements androidx.core.widget.b {

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatBackgroundHelper f16286a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextHelper f16287b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatEmojiTextHelper f16288c;

    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.buttonStyle);
    }

    public void b(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16286a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16286a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (l3.f16641c) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f16338i.f16720e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (l3.f16641c) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f16338i.f16719d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (l3.f16641c) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f16338i.f16718c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (l3.f16641c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        return appCompatTextHelper != null ? appCompatTextHelper.f16338i.f16721f : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (l3.f16641c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.f16338i.f16716a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.i(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper == null || l3.f16641c) {
            return;
        }
        appCompatTextHelper.c();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper == null || l3.f16641c || !appCompatTextHelper.e()) {
            return;
        }
        appCompatTextHelper.c();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        if (this.f16288c == null) {
            this.f16288c = new AppCompatEmojiTextHelper(this);
        }
        this.f16288c.c(z13);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i13, int i14, int i15, int i16) {
        if (l3.f16641c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.i(i13, i14, i15, i16);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i13) {
        if (l3.f16641c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.j(iArr, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i13) {
        if (l3.f16641c) {
            super.setAutoSizeTextTypeWithDefaults(i13);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.k(i13);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16286a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16286a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.j(callback, this));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f16288c == null) {
            this.f16288c = new AppCompatEmojiTextHelper(this);
        }
        super.setFilters(this.f16288c.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.h(context, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i13, float f13) {
        if (l3.f16641c) {
            super.setTextSize(i13, f13);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f16287b;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.n(i13, f13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        x2.a(getContext(), this);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f16286a = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f16287b = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i13);
        appCompatTextHelper.b();
        if (this.f16288c == null) {
            this.f16288c = new AppCompatEmojiTextHelper(this);
        }
        this.f16288c.b(attributeSet, i13);
    }
}
