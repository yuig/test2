package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f57422a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57423b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f57424c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57425d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57426e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f57427f;

    public t0(Integer num, String str, s0 s0Var, String str2, Integer num2, Object obj) {
        this.f57422a = num;
        this.f57423b = str;
        this.f57424c = s0Var;
        this.f57425d = str2;
        this.f57426e = num2;
        this.f57427f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f57422a, t0Var.f57422a) && Intrinsics.d(this.f57423b, t0Var.f57423b) && Intrinsics.d(this.f57424c, t0Var.f57424c) && Intrinsics.d(this.f57425d, t0Var.f57425d) && Intrinsics.d(this.f57426e, t0Var.f57426e) && Intrinsics.d(this.f57427f, t0Var.f57427f);
    }

    public final int hashCode() {
        Integer num = this.f57422a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f57423b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        s0 s0Var = this.f57424c;
        int hashCode3 = (hashCode2 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        String str2 = this.f57425d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f57426e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj = this.f57427f;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "TextTag(length=" + this.f57422a + ", link=" + this.f57423b + ", metadata=" + this.f57424c + ", objectId=" + this.f57425d + ", offset=" + this.f57426e + ", tagType=" + this.f57427f + ")";
    }
}
