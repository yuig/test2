package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z6 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final b7 f111881a;

    /* renamed from: b, reason: collision with root package name */
    public final y6 f111882b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f111883c;

    public z6(b7 step, y6 displayData, boolean z13) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        this.f111881a = step;
        this.f111882b = displayData;
        this.f111883c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return this.f111881a == z6Var.f111881a && Intrinsics.d(this.f111882b, z6Var.f111882b) && this.f111883c == z6Var.f111883c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111883c) + ((this.f111882b.hashCode() + (this.f111881a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnboardingDisplayState(step=");
        sb3.append(this.f111881a);
        sb3.append(", displayData=");
        sb3.append(this.f111882b);
        sb3.append(", showConfetti=");
        return a.a.r(sb3, this.f111883c, ")");
    }
}
