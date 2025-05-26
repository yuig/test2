package m70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f86507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86508b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86509c;

    /* renamed from: d, reason: collision with root package name */
    public final String f86510d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86511e;

    public d(String str, String str2, String str3, String str4, String str5) {
        this.f86507a = str;
        this.f86508b = str2;
        this.f86509c = str3;
        this.f86510d = str4;
        this.f86511e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f86507a, dVar.f86507a) && Intrinsics.d(this.f86508b, dVar.f86508b) && Intrinsics.d(this.f86509c, dVar.f86509c) && Intrinsics.d(this.f86510d, dVar.f86510d) && Intrinsics.d(this.f86511e, dVar.f86511e);
    }

    public final int hashCode() {
        String str = this.f86507a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86508b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86509c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f86510d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f86511e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadingArgs(pinId=");
        sb3.append(this.f86507a);
        sb3.append(", cropSource=");
        sb3.append(this.f86508b);
        sb3.append(", boardSessionId=");
        sb3.append(this.f86509c);
        sb3.append(", entrypoint=");
        sb3.append(this.f86510d);
        sb3.append(", requestParams=");
        return a.a.p(sb3, this.f86511e, ")");
    }
}
