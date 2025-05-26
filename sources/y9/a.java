package y9;

import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final List f138082a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f138083b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f138084c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f138085d;

    public a(ArrayList delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f138082a = delegates;
        this.f138084c = new ArrayList();
        this.f138085d = new ArrayList();
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i13) {
        View decorView;
        synchronized (this) {
            try {
                this.f138083b = true;
                Iterator it = this.f138082a.iterator();
                while (it.hasNext()) {
                    ((Window.OnFrameMetricsAvailableListener) it.next()).onFrameMetricsAvailable(window, frameMetrics, i13);
                }
                if (!this.f138084c.isEmpty()) {
                    Iterator it2 = this.f138084c.iterator();
                    while (it2.hasNext()) {
                        this.f138082a.add((Window.OnFrameMetricsAvailableListener) it2.next());
                    }
                    this.f138084c.clear();
                }
                if (!this.f138085d.isEmpty()) {
                    boolean z13 = !this.f138082a.isEmpty();
                    Iterator it3 = this.f138085d.iterator();
                    while (it3.hasNext()) {
                        this.f138082a.remove((Window.OnFrameMetricsAvailableListener) it3.next());
                    }
                    this.f138085d.clear();
                    if (z13 && this.f138082a.isEmpty()) {
                        if (window != null) {
                            window.removeOnFrameMetricsAvailableListener(this);
                        }
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            decorView.setTag(q.metricsDelegator, null);
                        }
                    }
                }
                this.f138083b = false;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (window != null) {
            View view = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(view, "window.decorView");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(view, "view");
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                view = parent;
                parent = view.getParent();
            }
            Object tag = view.getTag(q.metricsStateHolder);
            if (tag == null) {
                tag = new o();
                view.setTag(q.metricsStateHolder, tag);
            }
            p pVar = ((o) tag).f138118a;
            if (pVar != null) {
                pVar.b();
            }
        }
    }
}
