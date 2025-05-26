package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w5 implements z5 {

    /* renamed from: a, reason: collision with root package name */
    public final b7 f111839a;

    public w5(b7 step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f111839a = step;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5) && this.f111839a == ((w5) obj).f111839a;
    }

    public final int hashCode() {
        return this.f111839a.hashCode();
    }

    public final String toString() {
        return "ForceOnboarding(step=" + this.f111839a + ")";
    }
}
