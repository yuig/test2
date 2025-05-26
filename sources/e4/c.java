package e4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import c4.a0;
import c4.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z13, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i18)) != layout.getLineCount() - 1) {
            return;
        }
        y yVar = a0.f25629a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float T = ig1.b.T(layout, lineForOffset, paint) + ig1.b.S(layout, lineForOffset, paint);
            if (T == 0.0f) {
                return;
            }
            Intrinsics.f(canvas);
            canvas.translate(T, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z13) {
        return 0;
    }
}
