package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements z40.w {

    /* renamed from: a, reason: collision with root package name */
    public final String f57295a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57296b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57297c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57298d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57299e;

    public d(String str, String str2, String str3, Integer num, Integer num2) {
        this.f57295a = str;
        this.f57296b = num;
        this.f57297c = str2;
        this.f57298d = str3;
        this.f57299e = num2;
    }

    @Override // z40.w
    public final String a() {
        return this.f57298d;
    }

    @Override // z40.w
    public final String b() {
        return this.f57295a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f57295a, dVar.f57295a) && Intrinsics.d(this.f57296b, dVar.f57296b) && Intrinsics.d(this.f57297c, dVar.f57297c) && Intrinsics.d(this.f57298d, dVar.f57298d) && Intrinsics.d(this.f57299e, dVar.f57299e);
    }

    @Override // z40.w
    public final String getType() {
        return this.f57297c;
    }

    public final int hashCode() {
        String str = this.f57295a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f57296b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f57297c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57298d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f57299e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.w
    public final Integer i() {
        return this.f57296b;
    }

    @Override // z40.w
    public final Integer j() {
        return this.f57299e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecentPinImage(dominantColor=");
        sb3.append(this.f57295a);
        sb3.append(", height=");
        sb3.append(this.f57296b);
        sb3.append(", type=");
        sb3.append(this.f57297c);
        sb3.append(", url=");
        sb3.append(this.f57298d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f57299e, ")");
    }
}
