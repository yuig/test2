package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m2 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final String f131448d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(String url, String str) {
        super(str + " :: " + url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f131448d = url;
        this.f131449e = str;
    }

    @Override // dl1.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return Intrinsics.d(this.f131448d, m2Var.f131448d) && Intrinsics.d(this.f131449e, m2Var.f131449e);
    }

    @Override // dl1.u
    public final int hashCode() {
        int hashCode = this.f131448d.hashCode() * 31;
        String str = this.f131449e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UrlInfoRequestParams(url=");
        sb3.append(this.f131448d);
        sb3.append(", pinUid=");
        return a.a.p(sb3, this.f131449e, ")");
    }
}
