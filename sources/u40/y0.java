package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements z40.v {

    /* renamed from: a, reason: collision with root package name */
    public final String f120445a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f120446b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120447c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120448d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f120449e;

    public y0(String str, String str2, String str3, Integer num, Integer num2) {
        this.f120445a = str;
        this.f120446b = num;
        this.f120447c = str2;
        this.f120448d = str3;
        this.f120449e = num2;
    }

    @Override // z40.v
    public final String a() {
        return this.f120448d;
    }

    @Override // z40.v
    public final String b() {
        return this.f120445a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f120445a, y0Var.f120445a) && Intrinsics.d(this.f120446b, y0Var.f120446b) && Intrinsics.d(this.f120447c, y0Var.f120447c) && Intrinsics.d(this.f120448d, y0Var.f120448d) && Intrinsics.d(this.f120449e, y0Var.f120449e);
    }

    @Override // z40.v
    public final String getType() {
        return this.f120447c;
    }

    public final int hashCode() {
        String str = this.f120445a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f120446b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f120447c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120448d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f120449e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.v
    public final Integer i() {
        return this.f120446b;
    }

    @Override // z40.v
    public final Integer j() {
        return this.f120449e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContextualPinImageUrl(dominantColor=");
        sb3.append(this.f120445a);
        sb3.append(", height=");
        sb3.append(this.f120446b);
        sb3.append(", type=");
        sb3.append(this.f120447c);
        sb3.append(", url=");
        sb3.append(this.f120448d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f120449e, ")");
    }
}
