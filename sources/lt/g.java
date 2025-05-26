package lt;

import ao2.f0;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import u50.r;

/* loaded from: classes3.dex */
public final class g implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f84748a;

    public g(ko2.e dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f84748a = dispatcher;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, h request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof h) {
            kotlin.jvm.internal.j.z(scope, this.f84748a, null, new f(this, request, eventIntake, null), 2);
        }
    }
}
