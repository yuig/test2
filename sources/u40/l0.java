package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements z40.w {

    /* renamed from: a, reason: collision with root package name */
    public final String f120380a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f120381b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120382c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120383d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f120384e;

    public l0(String str, String str2, String str3, Integer num, Integer num2) {
        this.f120380a = str;
        this.f120381b = num;
        this.f120382c = str2;
        this.f120383d = str3;
        this.f120384e = num2;
    }

    @Override // z40.w
    public final String a() {
        return this.f120383d;
    }

    @Override // z40.w
    public final String b() {
        return this.f120380a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f120380a, l0Var.f120380a) && Intrinsics.d(this.f120381b, l0Var.f120381b) && Intrinsics.d(this.f120382c, l0Var.f120382c) && Intrinsics.d(this.f120383d, l0Var.f120383d) && Intrinsics.d(this.f120384e, l0Var.f120384e);
    }

    @Override // z40.w
    public final String getType() {
        return this.f120382c;
    }

    public final int hashCode() {
        String str = this.f120380a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f120381b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f120382c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120383d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f120384e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.w
    public final Integer i() {
        return this.f120381b;
    }

    @Override // z40.w
    public final Integer j() {
        return this.f120384e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecentPinImage(dominantColor=");
        sb3.append(this.f120380a);
        sb3.append(", height=");
        sb3.append(this.f120381b);
        sb3.append(", type=");
        sb3.append(this.f120382c);
        sb3.append(", url=");
        sb3.append(this.f120383d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f120384e, ")");
    }
}
