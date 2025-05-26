package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final z f93618a;

    public i1(z mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f93618a = mapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && Intrinsics.d(this.f93618a, ((i1) obj).f93618a);
    }

    public final int hashCode() {
        return this.f93618a.hashCode();
    }

    public final String toString() {
        return "MapTo(mapper=" + this.f93618a + ")";
    }
}
