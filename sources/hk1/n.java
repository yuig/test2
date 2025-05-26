package hk1;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final jo1.a f69359a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69360b;

    /* renamed from: c, reason: collision with root package name */
    public final ta2.b f69361c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f69362d;

    public n(jo1.a fragmentType, boolean z13, ta2.b bVar, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(fragmentType, "fragmentType");
        this.f69359a = fragmentType;
        this.f69360b = z13;
        this.f69361c = bVar;
        this.f69362d = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f69359a == nVar.f69359a && this.f69360b == nVar.f69360b && this.f69361c == nVar.f69361c && Intrinsics.d(this.f69362d, nVar.f69362d);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f69360b, this.f69359a.hashCode() * 31, 31);
        ta2.b bVar = this.f69361c;
        int hashCode = (e13 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        HashMap hashMap = this.f69362d;
        return hashCode + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        return "ViewBasedConstructorArgs(fragmentType=" + this.f69359a + ", isHomefeedTab=" + this.f69360b + ", inclusiveFilter=" + this.f69361c + ", inclusiveAuxData=" + this.f69362d + ")";
    }
}
