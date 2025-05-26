package c4;

import a.d1;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class c {
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i13, @NotNull Layout.Alignment alignment, float f13, float f14, @NotNull BoringLayout.Metrics metrics, boolean z13, boolean z14, TextUtils.TruncateAt truncateAt, int i14) {
        return d1.k(charSequence, textPaint, i13, alignment, f13, f14, metrics, z13, truncateAt, i14, z14);
    }

    public static final BoringLayout.Metrics b(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        BoringLayout.Metrics isBoring;
        isBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
        return isBoring;
    }

    public static final boolean c(@NotNull BoringLayout boringLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
