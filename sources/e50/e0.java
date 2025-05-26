package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f57317a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57318b;

    public e0(Integer num, String str) {
        this.f57317a = num;
        this.f57318b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f57317a, e0Var.f57317a) && Intrinsics.d(this.f57318b, e0Var.f57318b);
    }

    public final int hashCode() {
        Integer num = this.f57317a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f57318b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RequestParams(journeyDepth=" + this.f57317a + ", sourceModuleId=" + this.f57318b + ")";
    }
}
