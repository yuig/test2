package qr1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final m f105029a;

    /* renamed from: b, reason: collision with root package name */
    public final c60.a f105030b;

    /* renamed from: c, reason: collision with root package name */
    public final r f105031c;

    /* renamed from: d, reason: collision with root package name */
    public final wy0 f105032d;

    /* renamed from: e, reason: collision with root package name */
    public final String f105033e;

    public t(m authority, c60.a accessToken, r authMethod, wy0 wy0Var, String str) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(authMethod, "authMethod");
        this.f105029a = authority;
        this.f105030b = accessToken;
        this.f105031c = authMethod;
        this.f105032d = wy0Var;
        this.f105033e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f105029a, tVar.f105029a) && Intrinsics.d(this.f105030b, tVar.f105030b) && this.f105031c == tVar.f105031c && Intrinsics.d(this.f105032d, tVar.f105032d) && Intrinsics.d(this.f105033e, tVar.f105033e);
    }

    public final int hashCode() {
        int hashCode = (this.f105031c.hashCode() + ((this.f105030b.hashCode() + (this.f105029a.hashCode() * 31)) * 31)) * 31;
        wy0 wy0Var = this.f105032d;
        int hashCode2 = (hashCode + (wy0Var == null ? 0 : wy0Var.hashCode())) * 31;
        String str = this.f105033e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InternalAuthResult(authority=");
        sb3.append(this.f105029a);
        sb3.append(", accessToken=");
        sb3.append(this.f105030b);
        sb3.append(", authMethod=");
        sb3.append(this.f105031c);
        sb3.append(", user=");
        sb3.append(this.f105032d);
        sb3.append(", password=");
        return a.a.p(sb3, this.f105033e, ")");
    }
}
