package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ke implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final x f7249a;

    public ke(x activityTracker) {
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.f7249a = activityTracker;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.APP_OPEN;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        boolean z13;
        x xVar = this.f7249a;
        synchronized (xVar) {
            z13 = xVar.f13328n;
        }
        return new pk0(new je(z13));
    }
}
