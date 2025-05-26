package y9;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class m extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g jankStats, View view, Window window) {
        super(jankStats, view, window);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
    }

    @Override // y9.l
    public final long c(FrameMetrics frameMetrics) {
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        return frameMetrics.getMetric(10);
    }
}
