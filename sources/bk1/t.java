package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f23327a;

    public t(Integer num) {
        this.f23327a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f23327a, ((t) obj).f23327a);
    }

    public final int hashCode() {
        Integer num = this.f23327a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "IndexWithinAOMChangedEvent(position=" + this.f23327a + ")";
    }
}
