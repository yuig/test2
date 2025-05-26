package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b2 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f93538a;

    public b2(Object obj) {
        this.f93538a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && Intrinsics.d(this.f93538a, ((b2) obj).f93538a);
    }

    public final int hashCode() {
        Object obj = this.f93538a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Refresh(args=" + this.f93538a + ")";
    }
}
