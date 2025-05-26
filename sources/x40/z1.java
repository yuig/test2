package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f133760a;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f133761b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f133762c;

    public z1(Integer num, y1 y1Var, Boolean bool) {
        this.f133760a = num;
        this.f133761b = y1Var;
        this.f133762c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return Intrinsics.d(this.f133760a, z1Var.f133760a) && Intrinsics.d(this.f133761b, z1Var.f133761b) && Intrinsics.d(this.f133762c, z1Var.f133762c);
    }

    public final int hashCode() {
        Integer num = this.f133760a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        y1 y1Var = this.f133761b;
        int hashCode2 = (hashCode + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        Boolean bool = this.f133762c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f133760a);
        sb3.append(", metadata=");
        sb3.append(this.f133761b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f133762c, ")");
    }
}
