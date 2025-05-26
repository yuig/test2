package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final b7 f111770a;

    public q1(b7 step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f111770a = step;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1) && this.f111770a == ((q1) obj).f111770a;
    }

    public final int hashCode() {
        return this.f111770a.hashCode();
    }

    public final String toString() {
        return "ScheduledOnboardingStepTriggered(step=" + this.f111770a + ")";
    }
}
