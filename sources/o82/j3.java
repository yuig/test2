package o82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j3 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f93641a;

    public j3(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f93641a = items;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        d2 request = (d2) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if ((request instanceof v1) || (request instanceof x1) || (request instanceof b2)) {
            eventIntake.a(new m1(this.f93641a, false));
        }
    }
}
