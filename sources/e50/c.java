package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements z40.v {

    /* renamed from: a, reason: collision with root package name */
    public final String f57270a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57271b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57272c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57273d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57274e;

    public c(String str, String str2, String str3, Integer num, Integer num2) {
        this.f57270a = str;
        this.f57271b = num;
        this.f57272c = str2;
        this.f57273d = str3;
        this.f57274e = num2;
    }

    @Override // z40.v
    public final String a() {
        return this.f57273d;
    }

    @Override // z40.v
    public final String b() {
        return this.f57270a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f57270a, cVar.f57270a) && Intrinsics.d(this.f57271b, cVar.f57271b) && Intrinsics.d(this.f57272c, cVar.f57272c) && Intrinsics.d(this.f57273d, cVar.f57273d) && Intrinsics.d(this.f57274e, cVar.f57274e);
    }

    @Override // z40.v
    public final String getType() {
        return this.f57272c;
    }

    public final int hashCode() {
        String str = this.f57270a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f57271b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f57272c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57273d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f57274e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.v
    public final Integer i() {
        return this.f57271b;
    }

    @Override // z40.v
    public final Integer j() {
        return this.f57274e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContextualPinImageUrl(dominantColor=");
        sb3.append(this.f57270a);
        sb3.append(", height=");
        sb3.append(this.f57271b);
        sb3.append(", type=");
        sb3.append(this.f57272c);
        sb3.append(", url=");
        sb3.append(this.f57273d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f57274e, ")");
    }
}
