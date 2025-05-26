package c91;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f26989a;

    public e(d featureInstallManager) {
        Intrinsics.checkNotNullParameter(featureInstallManager, "featureInstallManager");
        this.f26989a = featureInstallManager;
    }

    public final f a(Activity activity, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        return new f(activity, pinalytics, this.f26989a);
    }
}
