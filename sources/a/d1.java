package a;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d1 {
    public static /* synthetic */ LineBreakConfig.Builder g() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout k(CharSequence charSequence, TextPaint textPaint, int i13, Layout.Alignment alignment, float f13, float f14, BoringLayout.Metrics metrics, boolean z13, TextUtils.TruncateAt truncateAt, int i14, boolean z14) {
        return new BoringLayout(charSequence, textPaint, i13, alignment, f13, f14, metrics, z13, truncateAt, i14, z14);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback l(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher n(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
