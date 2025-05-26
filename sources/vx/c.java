package vx;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import nx.o0;
import so.ha;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f126809a;

    public c(o0 pinalyticsManager, d eventLogger, ha contextLogViewFactory) {
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(contextLogViewFactory, "contextLogViewFactory");
        this.f126809a = pinalyticsManager;
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f126809a.f92444g = null;
    }
}
