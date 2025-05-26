package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ui implements z40.w {

    /* renamed from: a, reason: collision with root package name */
    public final String f133516a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133517b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133518c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133519d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f133520e;

    public ui(String str, String str2, String str3, Integer num, Integer num2) {
        this.f133516a = str;
        this.f133517b = num;
        this.f133518c = str2;
        this.f133519d = str3;
        this.f133520e = num2;
    }

    @Override // z40.w
    public final String a() {
        return this.f133519d;
    }

    @Override // z40.w
    public final String b() {
        return this.f133516a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui)) {
            return false;
        }
        ui uiVar = (ui) obj;
        return Intrinsics.d(this.f133516a, uiVar.f133516a) && Intrinsics.d(this.f133517b, uiVar.f133517b) && Intrinsics.d(this.f133518c, uiVar.f133518c) && Intrinsics.d(this.f133519d, uiVar.f133519d) && Intrinsics.d(this.f133520e, uiVar.f133520e);
    }

    @Override // z40.w
    public final String getType() {
        return this.f133518c;
    }

    public final int hashCode() {
        String str = this.f133516a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f133517b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f133518c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133519d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f133520e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.w
    public final Integer i() {
        return this.f133517b;
    }

    @Override // z40.w
    public final Integer j() {
        return this.f133520e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecentPinImage(dominantColor=");
        sb3.append(this.f133516a);
        sb3.append(", height=");
        sb3.append(this.f133517b);
        sb3.append(", type=");
        sb3.append(this.f133518c);
        sb3.append(", url=");
        sb3.append(this.f133519d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f133520e, ")");
    }
}
