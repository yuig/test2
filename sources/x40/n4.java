package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f132873a;

    /* renamed from: b, reason: collision with root package name */
    public final m4 f132874b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f132875c;

    public n4(Integer num, m4 m4Var, Boolean bool) {
        this.f132873a = num;
        this.f132874b = m4Var;
        this.f132875c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return Intrinsics.d(this.f132873a, n4Var.f132873a) && Intrinsics.d(this.f132874b, n4Var.f132874b) && Intrinsics.d(this.f132875c, n4Var.f132875c);
    }

    public final int hashCode() {
        Integer num = this.f132873a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        m4 m4Var = this.f132874b;
        int hashCode2 = (hashCode + (m4Var == null ? 0 : m4Var.hashCode())) * 31;
        Boolean bool = this.f132875c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f132873a);
        sb3.append(", metadata=");
        sb3.append(this.f132874b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f132875c, ")");
    }
}
