package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 implements z40.w {

    /* renamed from: a, reason: collision with root package name */
    public final String f120469a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f120470b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120471c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120472d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f120473e;

    public z0(String str, String str2, String str3, Integer num, Integer num2) {
        this.f120469a = str;
        this.f120470b = num;
        this.f120471c = str2;
        this.f120472d = str3;
        this.f120473e = num2;
    }

    @Override // z40.w
    public final String a() {
        return this.f120472d;
    }

    @Override // z40.w
    public final String b() {
        return this.f120469a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.f120469a, z0Var.f120469a) && Intrinsics.d(this.f120470b, z0Var.f120470b) && Intrinsics.d(this.f120471c, z0Var.f120471c) && Intrinsics.d(this.f120472d, z0Var.f120472d) && Intrinsics.d(this.f120473e, z0Var.f120473e);
    }

    @Override // z40.w
    public final String getType() {
        return this.f120471c;
    }

    public final int hashCode() {
        String str = this.f120469a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f120470b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f120471c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120472d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f120473e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.w
    public final Integer i() {
        return this.f120470b;
    }

    @Override // z40.w
    public final Integer j() {
        return this.f120473e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecentPinImage(dominantColor=");
        sb3.append(this.f120469a);
        sb3.append(", height=");
        sb3.append(this.f120470b);
        sb3.append(", type=");
        sb3.append(this.f120471c);
        sb3.append(", url=");
        sb3.append(this.f120472d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f120473e, ")");
    }
}
