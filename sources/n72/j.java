package n72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f89728a;

    public j(Object obj) {
        this.f89728a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f89728a, ((j) obj).f89728a);
    }

    public final int hashCode() {
        Object obj = this.f89728a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.f89728a + ")";
    }
}
