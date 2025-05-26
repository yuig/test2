package androidx.appcompat.widget;

import android.widget.TextView;

/* loaded from: classes2.dex */
public abstract class o0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i13, int i14, int i15, int i16) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
    }

    public static void c(TextView textView, int[] iArr, int i13) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
