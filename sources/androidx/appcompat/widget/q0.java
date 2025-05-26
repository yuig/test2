package androidx.appcompat.widget;

import android.view.textclassifier.TextClassifier;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public class q0 implements AppCompatTextView.SuperCaller {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f16670a;

    public q0(AppCompatTextView appCompatTextView) {
        this.f16670a = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void a(int i13) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int b() {
        int autoSizeTextType;
        autoSizeTextType = super/*android.widget.TextView*/.getAutoSizeTextType();
        return autoSizeTextType;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int c() {
        int autoSizeMinTextSize;
        autoSizeMinTextSize = super/*android.widget.TextView*/.getAutoSizeMinTextSize();
        return autoSizeMinTextSize;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void d(int i13, float f13) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int[] e() {
        int[] autoSizeTextAvailableSizes;
        autoSizeTextAvailableSizes = super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
        return autoSizeTextAvailableSizes;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final TextClassifier f() {
        TextClassifier textClassifier;
        textClassifier = super/*android.widget.TextView*/.getTextClassifier();
        return textClassifier;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int g() {
        int autoSizeMaxTextSize;
        autoSizeMaxTextSize = super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
        return autoSizeMaxTextSize;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void h(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void i(int i13) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final int j() {
        int autoSizeStepGranularity;
        autoSizeStepGranularity = super/*android.widget.TextView*/.getAutoSizeStepGranularity();
        return autoSizeStepGranularity;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void k(int i13) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i13);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i13, int i14, int i15, int i16) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i13) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
    }
}
