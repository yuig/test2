package dq;

import dv1.e;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f56061a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f56062b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56063c;

    public a(String str, e eVar, u0 u0Var) {
        this.f56061a = eVar;
        this.f56062b = u0Var;
        this.f56063c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f56061a, aVar.f56061a) && this.f56062b == aVar.f56062b && Intrinsics.d(null, null) && Intrinsics.d(this.f56063c, aVar.f56063c);
    }

    public final int hashCode() {
        e eVar = this.f56061a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        u0 u0Var = this.f56062b;
        int hashCode2 = (hashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 961;
        String str = this.f56063c;
        return Boolean.hashCode(true) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GraphQLNewsHubClickEvent(newsHubItem=");
        sb3.append(this.f56061a);
        sb3.append(", elementType=");
        sb3.append(this.f56062b);
        sb3.append(", clickedModel=null, link=");
        return a.a.p(sb3, this.f56063c, ", shouldNavigate=true)");
    }
}
