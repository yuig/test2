package c4;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class d {
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i13, @NotNull Layout.Alignment alignment, float f13, float f14, @NotNull BoringLayout.Metrics metrics, boolean z13, TextUtils.TruncateAt truncateAt, int i14) {
        return new BoringLayout(charSequence, textPaint, i13, alignment, f13, f14, metrics, z13, truncateAt, i14);
    }

    public static final BoringLayout.Metrics b(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
