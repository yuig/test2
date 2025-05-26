package q4;

import android.graphics.Rect;
import android.view.View;
import kotlin.collections.f0;

/* loaded from: classes3.dex */
public final class x extends org.chromium.net.y {
    @Override // org.chromium.net.y
    public final void Z(View view, int i13, int i14) {
        view.setSystemGestureExclusionRects(f0.l(new Rect(0, 0, i13, i14)));
    }
}
