package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements z40.v {

    /* renamed from: a, reason: collision with root package name */
    public final String f120356a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f120357b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120358c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120359d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f120360e;

    public k0(String str, String str2, String str3, Integer num, Integer num2) {
        this.f120356a = str;
        this.f120357b = num;
        this.f120358c = str2;
        this.f120359d = str3;
        this.f120360e = num2;
    }

    @Override // z40.v
    public final String a() {
        return this.f120359d;
    }

    @Override // z40.v
    public final String b() {
        return this.f120356a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.f120356a, k0Var.f120356a) && Intrinsics.d(this.f120357b, k0Var.f120357b) && Intrinsics.d(this.f120358c, k0Var.f120358c) && Intrinsics.d(this.f120359d, k0Var.f120359d) && Intrinsics.d(this.f120360e, k0Var.f120360e);
    }

    @Override // z40.v
    public final String getType() {
        return this.f120358c;
    }

    public final int hashCode() {
        String str = this.f120356a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f120357b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f120358c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120359d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f120360e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.v
    public final Integer i() {
        return this.f120357b;
    }

    @Override // z40.v
    public final Integer j() {
        return this.f120360e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContextualPinImageUrl(dominantColor=");
        sb3.append(this.f120356a);
        sb3.append(", height=");
        sb3.append(this.f120357b);
        sb3.append(", type=");
        sb3.append(this.f120358c);
        sb3.append(", url=");
        sb3.append(this.f120359d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f120360e, ")");
    }
}
