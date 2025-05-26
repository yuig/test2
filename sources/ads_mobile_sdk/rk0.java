package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rk0 extends jk0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f10666c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10667d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10668e;

    public rk0(int i13, String str, String str2) {
        super(yx0.f14443a, 0);
        this.f10666c = i13;
        this.f10667d = str;
        this.f10668e = str2;
    }

    public final String c() {
        return this.f10667d;
    }

    public final int d() {
        return this.f10666c;
    }

    public final String e() {
        return this.f10668e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk0)) {
            return false;
        }
        rk0 rk0Var = (rk0) obj;
        return this.f10666c == rk0Var.f10666c && Intrinsics.d(this.f10667d, rk0Var.f10667d) && Intrinsics.d(this.f10668e, rk0Var.f10668e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f10666c) * 31;
        String str = this.f10667d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10668e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i13 = this.f10666c;
        String str = this.f10667d;
        String str2 = this.f10668e;
        StringBuilder sb3 = new StringBuilder("WebError(errorCode=");
        sb3.append(i13);
        sb3.append(", description=");
        sb3.append(str);
        sb3.append(", failingUrl=");
        return a.a.p(sb3, str2, ")");
    }
}
