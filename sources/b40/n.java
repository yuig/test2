package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f21726a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f21727b;

    public n(Integer num, Integer num2) {
        this.f21726a = num;
        this.f21727b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f21726a, nVar.f21726a) && Intrinsics.d(this.f21727b, nVar.f21727b);
    }

    public final int hashCode() {
        Integer num = this.f21726a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21727b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "BadgeCounts(messages=" + this.f21726a + ", newsHub=" + this.f21727b + ")";
    }
}
