package w21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final e f127888a;

    /* renamed from: b, reason: collision with root package name */
    public final e f127889b;

    public z1(e leftPin, e rightPin) {
        Intrinsics.checkNotNullParameter(leftPin, "leftPin");
        Intrinsics.checkNotNullParameter(rightPin, "rightPin");
        this.f127888a = leftPin;
        this.f127889b = rightPin;
    }

    public static z1 a(z1 z1Var, e leftPin, e rightPin, int i13) {
        if ((i13 & 1) != 0) {
            leftPin = z1Var.f127888a;
        }
        if ((i13 & 2) != 0) {
            rightPin = z1Var.f127889b;
        }
        z1Var.getClass();
        Intrinsics.checkNotNullParameter(leftPin, "leftPin");
        Intrinsics.checkNotNullParameter(rightPin, "rightPin");
        return new z1(leftPin, rightPin);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f127888a == z1Var.f127888a && this.f127889b == z1Var.f127889b;
    }

    public final int hashCode() {
        return this.f127889b.hashCode() + (this.f127888a.hashCode() * 31);
    }

    public final String toString() {
        return "PinState(leftPin=" + this.f127888a + ", rightPin=" + this.f127889b + ")";
    }
}
