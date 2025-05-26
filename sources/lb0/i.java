package lb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f82710a;

    public i(Object obj) {
        this.f82710a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f82710a, ((i) obj).f82710a);
    }

    public final int hashCode() {
        Object obj = this.f82710a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Optional(value=" + this.f82710a + ")";
    }
}
