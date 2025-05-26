package c4;

import android.graphics.Paint;
import android.graphics.Rect;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class p {
    public static final void a(@NotNull Paint paint, @NotNull CharSequence charSequence, int i13, int i14, @NotNull Rect rect) {
        paint.getTextBounds(charSequence, i13, i14, rect);
    }
}
