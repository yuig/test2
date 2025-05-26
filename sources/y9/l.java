package y9;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import g4.u;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l extends j {

    /* renamed from: l, reason: collision with root package name */
    public static Handler f138110l;

    /* renamed from: f, reason: collision with root package name */
    public final Window f138111f;

    /* renamed from: g, reason: collision with root package name */
    public long f138112g;

    /* renamed from: h, reason: collision with root package name */
    public long f138113h;

    /* renamed from: i, reason: collision with root package name */
    public long f138114i;

    /* renamed from: j, reason: collision with root package name */
    public final e f138115j;

    /* renamed from: k, reason: collision with root package name */
    public final k f138116k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [y9.k] */
    public l(final g jankStats, View view, Window window) {
        super(jankStats, view);
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        this.f138111f = window;
        this.f138115j = new e(this.f138106c);
        this.f138116k = new Window.OnFrameMetricsAvailableListener() { // from class: y9.k
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i13) {
                l this$0 = l.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                g jankStats2 = jankStats;
                Intrinsics.checkNotNullParameter(jankStats2, "$jankStats");
                Intrinsics.checkNotNullExpressionValue(frameMetrics, "frameMetrics");
                long max = Math.max(this$0.c(frameMetrics), this$0.f138114i);
                if (max < this$0.f138113h || max == this$0.f138112g) {
                    return;
                }
                jankStats2.a(this$0.b(max, (long) (this$0.a(frameMetrics) * jankStats2.f138102d), frameMetrics));
                this$0.f138112g = max;
            }
        };
    }

    public static a d(Window window) {
        a aVar = (a) window.getDecorView().getTag(q.metricsDelegator);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(new ArrayList());
        if (f138110l == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            handlerThread.start();
            f138110l = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(aVar2, f138110l);
        window.getDecorView().setTag(q.metricsDelegator, aVar2);
        return aVar2;
    }

    public static void e(k delegate, Window window) {
        a aVar = (a) window.getDecorView().getTag(q.metricsDelegator);
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(window, "window");
            synchronized (aVar) {
                try {
                    if (aVar.f138083b) {
                        aVar.f138085d.add(delegate);
                    } else {
                        boolean z13 = !aVar.f138082a.isEmpty();
                        aVar.f138082a.remove(delegate);
                        if (z13 && aVar.f138082a.isEmpty()) {
                            window.removeOnFrameMetricsAvailableListener(aVar);
                            window.getDecorView().setTag(q.metricsDelegator, null);
                        }
                        Unit unit = Unit.f80348a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public long a(FrameMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        View view = (View) this.f138104a.get();
        int i13 = c.f138091a;
        return u.l0(view);
    }

    public e b(long j13, long j14, FrameMetrics frameMetrics) {
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
        e eVar = this.f138115j;
        eVar.f138093b = j13;
        eVar.f138094c = metric;
        eVar.f138095d = z13;
        eVar.f138096e = metric2;
        return eVar;
    }

    public abstract long c(FrameMetrics frameMetrics);

    public final void f(boolean z13) {
        synchronized (this.f138111f) {
            try {
                if (!z13) {
                    e(this.f138116k, this.f138111f);
                    this.f138113h = 0L;
                } else if (this.f138113h == 0) {
                    a d2 = d(this.f138111f);
                    k delegate = this.f138116k;
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    synchronized (d2) {
                        try {
                            if (d2.f138083b) {
                                d2.f138084c.add(delegate);
                            } else {
                                d2.f138082a.add(delegate);
                            }
                        } finally {
                        }
                    }
                    this.f138113h = System.nanoTime();
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
