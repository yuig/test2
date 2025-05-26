package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ia {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f132549a;

    /* renamed from: b, reason: collision with root package name */
    public final ha f132550b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f132551c;

    public ia(Integer num, ha haVar, Boolean bool) {
        this.f132549a = num;
        this.f132550b = haVar;
        this.f132551c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return Intrinsics.d(this.f132549a, iaVar.f132549a) && Intrinsics.d(this.f132550b, iaVar.f132550b) && Intrinsics.d(this.f132551c, iaVar.f132551c);
    }

    public final int hashCode() {
        Integer num = this.f132549a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ha haVar = this.f132550b;
        int hashCode2 = (hashCode + (haVar == null ? 0 : haVar.hashCode())) * 31;
        Boolean bool = this.f132551c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f132549a);
        sb3.append(", metadata=");
        sb3.append(this.f132550b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f132551c, ")");
    }
}
