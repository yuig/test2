package c91;

import android.app.Activity;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f26990a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f26991b;

    /* renamed from: c, reason: collision with root package name */
    public final d f26992c;

    public f(Activity activity, d0 pinalytics, d featureInstallManager) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(featureInstallManager, "featureInstallManager");
        this.f26990a = activity;
        this.f26991b = pinalytics;
        this.f26992c = featureInstallManager;
    }

    public final void a(Function0 actionLambda, String str, hp1.a onDemandModule) {
        Intrinsics.checkNotNullParameter(actionLambda, "actionLambda");
        Intrinsics.checkNotNullParameter(onDemandModule, "onDemandModule");
        if (this.f26992c.a(onDemandModule)) {
            actionLambda.invoke();
            return;
        }
        List b13 = e0.b(onDemandModule);
        this.f26992c.b(this.f26990a, false, this.f26991b, str, b13);
    }
}
