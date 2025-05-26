package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v1 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f93733a;

    public v1(Object obj) {
        this.f93733a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1) && Intrinsics.d(this.f93733a, ((v1) obj).f93733a);
    }

    public final int hashCode() {
        Object obj = this.f93733a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "InitialLoad(args=" + this.f93733a + ")";
    }
}
