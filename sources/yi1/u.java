package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f139160a;

    public u(Integer num) {
        this.f139160a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f139160a, ((u) obj).f139160a);
    }

    public final int hashCode() {
        Integer num = this.f139160a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "IndexWithinAOMChangedEvent(position=" + this.f139160a + ")";
    }
}
