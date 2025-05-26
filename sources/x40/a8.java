package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a8 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f131918a;

    /* renamed from: b, reason: collision with root package name */
    public final z7 f131919b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f131920c;

    public a8(Integer num, z7 z7Var, Boolean bool) {
        this.f131918a = num;
        this.f131919b = z7Var;
        this.f131920c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        return Intrinsics.d(this.f131918a, a8Var.f131918a) && Intrinsics.d(this.f131919b, a8Var.f131919b) && Intrinsics.d(this.f131920c, a8Var.f131920c);
    }

    public final int hashCode() {
        Integer num = this.f131918a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        z7 z7Var = this.f131919b;
        int hashCode2 = (hashCode + (z7Var == null ? 0 : z7Var.hashCode())) * 31;
        Boolean bool = this.f131920c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f131918a);
        sb3.append(", metadata=");
        sb3.append(this.f131919b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f131920c, ")");
    }
}
