package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pi {

    /* renamed from: a, reason: collision with root package name */
    public final String f133052a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133053b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133054c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133055d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f133056e;

    public pi(String str, String str2, String str3, Integer num, Integer num2) {
        this.f133052a = str;
        this.f133053b = num;
        this.f133054c = str2;
        this.f133055d = str3;
        this.f133056e = num2;
    }

    public final String a() {
        return this.f133054c;
    }

    public final Integer b() {
        return this.f133056e;
    }

    public final String c() {
        return this.f133055d;
    }

    public final String d() {
        return this.f133052a;
    }

    public final Integer e() {
        return this.f133053b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi)) {
            return false;
        }
        pi piVar = (pi) obj;
        return Intrinsics.d(this.f133052a, piVar.f133052a) && Intrinsics.d(this.f133053b, piVar.f133053b) && Intrinsics.d(this.f133054c, piVar.f133054c) && Intrinsics.d(this.f133055d, piVar.f133055d) && Intrinsics.d(this.f133056e, piVar.f133056e);
    }

    public final int hashCode() {
        String str = this.f133052a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f133053b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f133054c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133055d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f133056e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContextualPinImageUrl(url=");
        sb3.append(this.f133052a);
        sb3.append(", width=");
        sb3.append(this.f133053b);
        sb3.append(", dominantColor=");
        sb3.append(this.f133054c);
        sb3.append(", type=");
        sb3.append(this.f133055d);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133056e, ")");
    }
}
