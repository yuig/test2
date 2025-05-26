package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f57405a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57406b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57407c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f57408d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f57409e;

    public q0(Integer num, String str, String str2, Integer num2, Object obj) {
        this.f57405a = num;
        this.f57406b = str;
        this.f57407c = str2;
        this.f57408d = num2;
        this.f57409e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f57405a, q0Var.f57405a) && Intrinsics.d(this.f57406b, q0Var.f57406b) && Intrinsics.d(this.f57407c, q0Var.f57407c) && Intrinsics.d(this.f57408d, q0Var.f57408d) && Intrinsics.d(this.f57409e, q0Var.f57409e);
    }

    public final int hashCode() {
        Integer num = this.f57405a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f57406b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57407c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f57408d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj = this.f57409e;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "TextTag(length=" + this.f57405a + ", link=" + this.f57406b + ", objectId=" + this.f57407c + ", offset=" + this.f57408d + ", tagType=" + this.f57409e + ")";
    }
}
