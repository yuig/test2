package pc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0 extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f99599a;

    public q0(Object obj) {
        this.f99599a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f99599a, ((q0) obj).f99599a);
    }

    public final int hashCode() {
        Object obj = this.f99599a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Present(value=" + this.f99599a + ')';
    }
}
