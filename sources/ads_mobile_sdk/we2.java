package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class we2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13014a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.u f13015b;

    public we2(nm.u uVar, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f13014a = name;
        this.f13015b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2)) {
            return false;
        }
        we2 we2Var = (we2) obj;
        return Intrinsics.d(this.f13014a, we2Var.f13014a) && Intrinsics.d(this.f13015b, we2Var.f13015b);
    }

    public final int hashCode() {
        int hashCode = this.f13014a.hashCode() * 31;
        nm.u uVar = this.f13015b;
        return hashCode + (uVar == null ? 0 : uVar.f91366a.hashCode());
    }

    public final String toString() {
        return "Action(name=" + this.f13014a + ", info=" + this.f13015b + ")";
    }
}
