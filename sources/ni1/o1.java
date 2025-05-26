package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f90760a;

    public o1(Integer num) {
        this.f90760a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1) && Intrinsics.d(this.f90760a, ((o1) obj).f90760a);
    }

    public final int hashCode() {
        Integer num = this.f90760a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final Integer j() {
        return this.f90760a;
    }

    public final String toString() {
        return "PinRepIndexWithinAOMChangedEvent(indexWithinAOM=" + this.f90760a + ")";
    }
}
