package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r8 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f133175a;

    /* renamed from: b, reason: collision with root package name */
    public final q8 f133176b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f133177c;

    public r8(Integer num, q8 q8Var, Boolean bool) {
        this.f133175a = num;
        this.f133176b = q8Var;
        this.f133177c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return Intrinsics.d(this.f133175a, r8Var.f133175a) && Intrinsics.d(this.f133176b, r8Var.f133176b) && Intrinsics.d(this.f133177c, r8Var.f133177c);
    }

    public final int hashCode() {
        Integer num = this.f133175a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        q8 q8Var = this.f133176b;
        int hashCode2 = (hashCode + (q8Var == null ? 0 : q8Var.hashCode())) * 31;
        Boolean bool = this.f133177c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f133175a);
        sb3.append(", metadata=");
        sb3.append(this.f133176b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f133177c, ")");
    }
}
