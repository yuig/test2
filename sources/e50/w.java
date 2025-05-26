package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements z40.v {

    /* renamed from: a, reason: collision with root package name */
    public final String f57438a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57439b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57440c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57441d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57442e;

    public w(String str, String str2, String str3, Integer num, Integer num2) {
        this.f57438a = str;
        this.f57439b = num;
        this.f57440c = str2;
        this.f57441d = str3;
        this.f57442e = num2;
    }

    @Override // z40.v
    public final String a() {
        return this.f57441d;
    }

    @Override // z40.v
    public final String b() {
        return this.f57438a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f57438a, wVar.f57438a) && Intrinsics.d(this.f57439b, wVar.f57439b) && Intrinsics.d(this.f57440c, wVar.f57440c) && Intrinsics.d(this.f57441d, wVar.f57441d) && Intrinsics.d(this.f57442e, wVar.f57442e);
    }

    @Override // z40.v
    public final String getType() {
        return this.f57440c;
    }

    public final int hashCode() {
        String str = this.f57438a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f57439b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f57440c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57441d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f57442e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.v
    public final Integer i() {
        return this.f57439b;
    }

    @Override // z40.v
    public final Integer j() {
        return this.f57442e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContextualPinImageUrl(dominantColor=");
        sb3.append(this.f57438a);
        sb3.append(", height=");
        sb3.append(this.f57439b);
        sb3.append(", type=");
        sb3.append(this.f57440c);
        sb3.append(", url=");
        sb3.append(this.f57441d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f57442e, ")");
    }
}
