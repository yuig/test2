package y9;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: m, reason: collision with root package name */
    public final f f138117m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g jankStats, View view, Window window) {
        super(jankStats, view, window);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        ArrayList states = this.f138106c;
        Intrinsics.checkNotNullParameter(states, "states");
        f fVar = new f(states);
        fVar.f138097f = 0L;
        fVar.f138098g = 0L;
        this.f138117m = fVar;
    }

    @Override // y9.l
    public final long a(FrameMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return metrics.getMetric(13);
    }

    @Override // y9.l
    public final e b(long j13, long j14, FrameMetrics frameMetrics) {
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j15 = j13 + metric;
        this.f138114i = j15;
        p pVar = this.f138105b.f138118a;
        if (pVar != null) {
            pVar.c(j13, j15, this.f138106c);
        }
        boolean z13 = metric > j14;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        f fVar = this.f138117m;
        fVar.f138093b = j13;
        fVar.f138094c = metric;
        fVar.f138095d = z13;
        fVar.f138096e = metric3;
        fVar.f138097f = metric2;
        fVar.f138098g = metric4;
        return fVar;
    }
}
