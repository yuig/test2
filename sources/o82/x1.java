package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x1 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f93746a;

    public x1(Object obj) {
        this.f93746a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && Intrinsics.d(this.f93746a, ((x1) obj).f93746a);
    }

    public final int hashCode() {
        Object obj = this.f93746a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "LoadMore(args=" + this.f93746a + ")";
    }
}
