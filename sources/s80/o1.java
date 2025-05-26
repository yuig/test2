package s80;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final b7 f111734a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f111735b;

    public o1(b7 step, Map stepToDisplayData) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(stepToDisplayData, "stepToDisplayData");
        this.f111734a = step;
        this.f111735b = stepToDisplayData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f111734a == o1Var.f111734a && Intrinsics.d(this.f111735b, o1Var.f111735b);
    }

    public final int hashCode() {
        return this.f111735b.hashCode() + (this.f111734a.hashCode() * 31);
    }

    public final String toString() {
        return "OnboardingRequested(step=" + this.f111734a + ", stepToDisplayData=" + this.f111735b + ")";
    }
}
