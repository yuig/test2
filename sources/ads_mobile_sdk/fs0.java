package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fs0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5264a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5265b;

    /* renamed from: c, reason: collision with root package name */
    public final nm.u f5266c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5267d;

    public fs0(String str, String str2, nm.u uVar, String str3) {
        this.f5264a = str;
        this.f5265b = str2;
        this.f5266c = uVar;
        this.f5267d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs0)) {
            return false;
        }
        fs0 fs0Var = (fs0) obj;
        return Intrinsics.d(this.f5264a, fs0Var.f5264a) && Intrinsics.d(this.f5265b, fs0Var.f5265b) && Intrinsics.d(this.f5266c, fs0Var.f5266c) && Intrinsics.d(this.f5267d, fs0Var.f5267d);
    }

    public final int hashCode() {
        String str = this.f5264a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5265b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        nm.u uVar = this.f5266c;
        int hashCode3 = (hashCode2 + (uVar == null ? 0 : uVar.f91366a.hashCode())) * 31;
        String str3 = this.f5267d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f5264a;
        String str2 = this.f5265b;
        nm.u uVar = this.f5266c;
        String str3 = this.f5267d;
        StringBuilder w13 = a.a.w("InlineAd(html=", str, ", baseUrl=", str2, ", adJson=");
        w13.append(uVar);
        w13.append(", adConfigKey=");
        w13.append(str3);
        w13.append(")");
        return w13.toString();
    }
}
