package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.text.PrecomputedTextCompat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.widget.b {
    private final AppCompatBackgroundHelper mBackgroundTintHelper;

    @NonNull
    private AppCompatEmojiTextHelper mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;
    private SuperCaller mSuperCaller;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final AppCompatTextHelper mTextHelper;

    public interface SuperCaller {
        void a(int i13);

        int b();

        int c();

        void d(int i13, float f13);

        int[] e();

        TextClassifier f();

        int g();

        void h(TextClassifier textClassifier);

        void i(int i13);

        int j();

        void k(int i13);

        void setAutoSizeTextTypeUniformWithConfiguration(int i13, int i14, int i15, int i16);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i13);
    }

    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void a() {
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.l.h(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public final AppCompatEmojiTextHelper b() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l3.f16641c) {
            return getSuperCaller().g();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f16338i.f16720e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l3.f16641c) {
            return getSuperCaller().c();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f16338i.f16719d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l3.f16641c) {
            return getSuperCaller().j();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f16338i.f16718c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l3.f16641c) {
            return getSuperCaller().e();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        return appCompatTextHelper != null ? appCompatTextHelper.f16338i.f16721f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (l3.f16641c) {
            return getSuperCaller().b() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.f16338i.f16716a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.i(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 34) {
                this.mSuperCaller = new s0(this);
            } else if (i13 >= 28) {
                this.mSuperCaller = new r0(this);
            } else {
                this.mSuperCaller = new q0(this);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        z2 z2Var = this.mTextHelper.f16337h;
        if (z2Var != null) {
            return (ColorStateList) z2Var.f16750c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        z2 z2Var = this.mTextHelper.f16337h;
        if (z2Var != null) {
            return (PorterDuff.Mode) z2Var.f16751d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        a();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            return getSuperCaller().f();
        }
        TextClassifier textClassifier = appCompatTextClassifierHelper.f16329b;
        return textClassifier == null ? k0.a(appCompatTextClassifierHelper.f16328a) : textClassifier;
    }

    @NonNull
    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return androidx.core.widget.l.a(this);
    }

    public boolean isEmojiCompatEnabled() {
        return ((e3.b) b().f16304b.f66449b).f();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            kh2.g3.t2(editorInfo, getText());
        }
        kh2.m0.K0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i13 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper == null || l3.f16641c) {
            return;
        }
        appCompatTextHelper.c();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i13, int i14) {
        a();
        super.onMeasure(i13, i14);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper == null || l3.f16641c || !appCompatTextHelper.e()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        b().c(z13);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i13, int i14, int i15, int i16) {
        if (l3.f16641c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.i(i13, i14, i15, i16);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i13) {
        if (l3.f16641c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.j(iArr, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i13) {
        if (l3.f16641c) {
            getSuperCaller().k(i13);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.k(i13);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.g();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.g();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.j(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z13) {
        ((e3.b) b().f16304b.f66449b).k(z13);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(b().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i13) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i13);
        } else {
            androidx.core.widget.l.d(this, i13);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i13) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i13);
        } else {
            androidx.core.widget.l.e(this, i13);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i13) {
        androidx.core.widget.l.f(this, i13);
    }

    public void setPrecomputedText(@NonNull PrecomputedTextCompat precomputedTextCompat) {
        androidx.core.widget.l.h(this, precomputedTextCompat);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.l(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.h(context, i13);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            getSuperCaller().h(textClassifier);
        } else {
            appCompatTextClassifierHelper.f16329b = textClassifier;
        }
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull PrecomputedTextCompat.Params params) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = params.f17945b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i13 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i13 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i13 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i13 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i13 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i13 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i13 = 7;
            }
        }
        setTextDirection(i13);
        getPaint().set(params.f17944a);
        kh2.n.c0(this, params.f17946c);
        kh2.n.f0(this, params.f17947d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i13, float f13) {
        if (l3.f16641c) {
            super.setTextSize(i13, f13);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.n(i13, f13);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i13) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface a13 = (typeface == null || i13 <= 0) ? null : f5.j.a(getContext(), typeface, i13);
        this.mIsSetTypefaceProcessing = true;
        if (a13 != null) {
            typeface = a13;
        }
        try {
            super.setTypeface(typeface, i13);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        x2.a(getContext(), this);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i13);
        appCompatTextHelper.b();
        AppCompatTextClassifierHelper appCompatTextClassifierHelper = new AppCompatTextClassifierHelper();
        appCompatTextClassifierHelper.f16328a = this;
        this.mTextClassifierHelper = appCompatTextClassifierHelper;
        b().b(attributeSet, i13);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i13, float f13) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().d(i13, f13);
        } else {
            androidx.core.widget.l.g(this, i13, f13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i13 != 0 ? com.bumptech.glide.c.I(context, i13) : null, i14 != 0 ? com.bumptech.glide.c.I(context, i14) : null, i15 != 0 ? com.bumptech.glide.c.I(context, i15) : null, i16 != 0 ? com.bumptech.glide.c.I(context, i16) : null);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i13 != 0 ? com.bumptech.glide.c.I(context, i13) : null, i14 != 0 ? com.bumptech.glide.c.I(context, i14) : null, i15 != 0 ? com.bumptech.glide.c.I(context, i15) : null, i16 != 0 ? com.bumptech.glide.c.I(context, i16) : null);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }
}
