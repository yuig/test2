package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements z40.w {

    /* renamed from: a, reason: collision with root package name */
    public final String f57445a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57446b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57447c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57448d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57449e;

    public x(String str, String str2, String str3, Integer num, Integer num2) {
        this.f57445a = str;
        this.f57446b = num;
        this.f57447c = str2;
        this.f57448d = str3;
        this.f57449e = num2;
    }

    @Override // z40.w
    public final String a() {
        return this.f57448d;
    }

    @Override // z40.w
    public final String b() {
        return this.f57445a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f57445a, xVar.f57445a) && Intrinsics.d(this.f57446b, xVar.f57446b) && Intrinsics.d(this.f57447c, xVar.f57447c) && Intrinsics.d(this.f57448d, xVar.f57448d) && Intrinsics.d(this.f57449e, xVar.f57449e);
    }

    @Override // z40.w
    public final String getType() {
        return this.f57447c;
    }

    public final int hashCode() {
        String str = this.f57445a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f57446b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f57447c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57448d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f57449e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.w
    public final Integer i() {
        return this.f57446b;
    }

    @Override // z40.w
    public final Integer j() {
        return this.f57449e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecentPinImage(dominantColor=");
        sb3.append(this.f57445a);
        sb3.append(", height=");
        sb3.append(this.f57446b);
        sb3.append(", type=");
        sb3.append(this.f57447c);
        sb3.append(", url=");
        sb3.append(this.f57448d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f57449e, ")");
    }
}
