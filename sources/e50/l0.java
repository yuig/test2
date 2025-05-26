package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57385a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f57386b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f57387c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f57388d;

    /* renamed from: e, reason: collision with root package name */
    public final String f57389e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f57390f;

    public l0(String __typename, j0 j0Var, Integer num, k0 k0Var, String str, Integer num2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57385a = __typename;
        this.f57386b = j0Var;
        this.f57387c = num;
        this.f57388d = k0Var;
        this.f57389e = str;
        this.f57390f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f57385a, l0Var.f57385a) && Intrinsics.d(this.f57386b, l0Var.f57386b) && Intrinsics.d(this.f57387c, l0Var.f57387c) && Intrinsics.d(this.f57388d, l0Var.f57388d) && Intrinsics.d(this.f57389e, l0Var.f57389e) && Intrinsics.d(this.f57390f, l0Var.f57390f);
    }

    public final int hashCode() {
        int hashCode = this.f57385a.hashCode() * 31;
        j0 j0Var = this.f57386b;
        int hashCode2 = (hashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        Integer num = this.f57387c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        k0 k0Var = this.f57388d;
        int hashCode4 = (hashCode3 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        String str = this.f57389e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f57390f;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "OneBarModule(__typename=" + this.f57385a + ", action=" + this.f57386b + ", animation=" + this.f57387c + ", display=" + this.f57388d + ", id=" + this.f57389e + ", moduleType=" + this.f57390f + ")";
    }
}
