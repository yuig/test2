package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120323a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f120324b;

    public f0(String __typename, Integer num) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120323a = __typename;
        this.f120324b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f120323a, f0Var.f120323a) && Intrinsics.d(this.f120324b, f0Var.f120324b);
    }

    public final int hashCode() {
        int hashCode = this.f120323a.hashCode() * 31;
        Integer num = this.f120324b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "UserNode(__typename=" + this.f120323a + ", followerCount=" + this.f120324b + ")";
    }
}
