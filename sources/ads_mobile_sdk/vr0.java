package ads_mobile_sdk;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vr0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12614a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f12615b;

    public vr0(a.o8 o8Var, qf2 qf2Var) {
        this.f12614a = o8Var;
        this.f12615b = qf2Var;
    }

    @Override // a.v7
    public final Object get() {
        x activityTracker = (x) this.f12614a.get();
        Set foregroundStateChangeListeners = (Set) this.f12615b.get();
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(foregroundStateChangeListeners, "foregroundStateChangeListeners");
        return new rr0(activityTracker, foregroundStateChangeListeners);
    }
}
