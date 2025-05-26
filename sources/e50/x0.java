package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f57450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57451b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f57452c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57453d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57454e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f57455f;

    public x0(Integer num, String str, w0 w0Var, String str2, Integer num2, Object obj) {
        this.f57450a = num;
        this.f57451b = str;
        this.f57452c = w0Var;
        this.f57453d = str2;
        this.f57454e = num2;
        this.f57455f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f57450a, x0Var.f57450a) && Intrinsics.d(this.f57451b, x0Var.f57451b) && Intrinsics.d(this.f57452c, x0Var.f57452c) && Intrinsics.d(this.f57453d, x0Var.f57453d) && Intrinsics.d(this.f57454e, x0Var.f57454e) && Intrinsics.d(this.f57455f, x0Var.f57455f);
    }

    public final int hashCode() {
        Integer num = this.f57450a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f57451b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w0 w0Var = this.f57452c;
        int hashCode3 = (hashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        String str2 = this.f57453d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f57454e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj = this.f57455f;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "TextTag(length=" + this.f57450a + ", link=" + this.f57451b + ", metadata=" + this.f57452c + ", objectId=" + this.f57453d + ", offset=" + this.f57454e + ", tagType=" + this.f57455f + ")";
    }
}
