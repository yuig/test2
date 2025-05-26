package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f133063a;

    /* renamed from: b, reason: collision with root package name */
    public final p2 f133064b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f133065c;

    public q2(Integer num, p2 p2Var, Boolean bool) {
        this.f133063a = num;
        this.f133064b = p2Var;
        this.f133065c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return Intrinsics.d(this.f133063a, q2Var.f133063a) && Intrinsics.d(this.f133064b, q2Var.f133064b) && Intrinsics.d(this.f133065c, q2Var.f133065c);
    }

    public final int hashCode() {
        Integer num = this.f133063a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        p2 p2Var = this.f133064b;
        int hashCode2 = (hashCode + (p2Var == null ? 0 : p2Var.hashCode())) * 31;
        Boolean bool = this.f133065c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f133063a);
        sb3.append(", metadata=");
        sb3.append(this.f133064b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f133065c, ")");
    }
}
