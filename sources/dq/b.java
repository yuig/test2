package dq;

import com.pinterest.api.model.qx;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final qx f56064a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f56065b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56066c;

    public b(String str, qx qxVar, u0 u0Var) {
        this.f56064a = qxVar;
        this.f56065b = u0Var;
        this.f56066c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f56064a, bVar.f56064a) && this.f56065b == bVar.f56065b && Intrinsics.d(null, null) && Intrinsics.d(this.f56066c, bVar.f56066c);
    }

    public final int hashCode() {
        qx qxVar = this.f56064a;
        int hashCode = (qxVar == null ? 0 : qxVar.hashCode()) * 31;
        u0 u0Var = this.f56065b;
        int hashCode2 = (hashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 961;
        String str = this.f56066c;
        return Boolean.hashCode(true) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NewsHubClickEvent(newsHubItem=");
        sb3.append(this.f56064a);
        sb3.append(", elementType=");
        sb3.append(this.f56065b);
        sb3.append(", clickedModel=null, link=");
        return a.a.p(sb3, this.f56066c, ", shouldNavigate=true)");
    }
}
