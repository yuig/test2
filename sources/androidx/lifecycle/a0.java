package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public r f18580a;

    /* renamed from: b, reason: collision with root package name */
    public x f18581b;

    public final void a(z zVar, q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        r targetState = event.getTargetState();
        r state1 = this.f18580a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (targetState != null && targetState.compareTo(state1) < 0) {
            state1 = targetState;
        }
        this.f18580a = state1;
        this.f18581b.c(zVar, event);
        this.f18580a = targetState;
    }
}
