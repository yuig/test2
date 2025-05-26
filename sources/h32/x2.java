package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x2 {

    /* renamed from: e, reason: collision with root package name */
    public static final c50.w2 f67391e = new c50.w2(4);

    /* renamed from: a, reason: collision with root package name */
    public final Long f67392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67393b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f67394c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67395d;

    public x2(Long l13, String str, Long l14, String str2) {
        this.f67392a = l13;
        this.f67393b = str;
        this.f67394c = l14;
        this.f67395d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return Intrinsics.d(this.f67392a, x2Var.f67392a) && Intrinsics.d(this.f67393b, x2Var.f67393b) && Intrinsics.d(this.f67394c, x2Var.f67394c) && Intrinsics.d(this.f67395d, x2Var.f67395d) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        Long l13 = this.f67392a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        String str = this.f67393b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f67394c;
        int hashCode3 = (hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.f67395d;
        return (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinProductEventData(productPinId=");
        sb3.append(this.f67392a);
        sb3.append(", pinIdStr=");
        sb3.append(this.f67393b);
        sb3.append(", pinId=");
        sb3.append(this.f67394c);
        sb3.append(", insertionId=");
        return a.a.p(sb3, this.f67395d, ", productPinIdStr=null)");
    }
}
