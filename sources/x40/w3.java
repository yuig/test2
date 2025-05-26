package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w3 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f133571a;

    /* renamed from: b, reason: collision with root package name */
    public final v3 f133572b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f133573c;

    public w3(Integer num, v3 v3Var, Boolean bool) {
        this.f133571a = num;
        this.f133572b = v3Var;
        this.f133573c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return Intrinsics.d(this.f133571a, w3Var.f133571a) && Intrinsics.d(this.f133572b, w3Var.f133572b) && Intrinsics.d(this.f133573c, w3Var.f133573c);
    }

    public final int hashCode() {
        Integer num = this.f133571a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        v3 v3Var = this.f133572b;
        int hashCode2 = (hashCode + (v3Var == null ? 0 : v3Var.hashCode())) * 31;
        Boolean bool = this.f133573c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f133571a);
        sb3.append(", metadata=");
        sb3.append(this.f133572b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f133573c, ")");
    }
}
