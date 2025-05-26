package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ti implements z40.v {

    /* renamed from: a, reason: collision with root package name */
    public final String f133393a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133394b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133395c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133396d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f133397e;

    public ti(String str, String str2, String str3, Integer num, Integer num2) {
        this.f133393a = str;
        this.f133394b = num;
        this.f133395c = str2;
        this.f133396d = str3;
        this.f133397e = num2;
    }

    @Override // z40.v
    public final String a() {
        return this.f133396d;
    }

    @Override // z40.v
    public final String b() {
        return this.f133393a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti)) {
            return false;
        }
        ti tiVar = (ti) obj;
        return Intrinsics.d(this.f133393a, tiVar.f133393a) && Intrinsics.d(this.f133394b, tiVar.f133394b) && Intrinsics.d(this.f133395c, tiVar.f133395c) && Intrinsics.d(this.f133396d, tiVar.f133396d) && Intrinsics.d(this.f133397e, tiVar.f133397e);
    }

    @Override // z40.v
    public final String getType() {
        return this.f133395c;
    }

    public final int hashCode() {
        String str = this.f133393a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f133394b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f133395c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133396d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f133397e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.v
    public final Integer i() {
        return this.f133394b;
    }

    @Override // z40.v
    public final Integer j() {
        return this.f133397e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContextualPinImageUrl(dominantColor=");
        sb3.append(this.f133393a);
        sb3.append(", height=");
        sb3.append(this.f133394b);
        sb3.append(", type=");
        sb3.append(this.f133395c);
        sb3.append(", url=");
        sb3.append(this.f133396d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f133397e, ")");
    }
}
