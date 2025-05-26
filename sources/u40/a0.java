package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements t {

    /* renamed from: d, reason: collision with root package name */
    public final String f120287d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f120288e;

    /* renamed from: f, reason: collision with root package name */
    public final u f120289f;

    public a0(String __typename, Object obj, u uVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120287d = __typename;
        this.f120288e = obj;
        this.f120289f = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f120287d, a0Var.f120287d) && Intrinsics.d(this.f120288e, a0Var.f120288e) && Intrinsics.d(this.f120289f, a0Var.f120289f);
    }

    public final int hashCode() {
        int hashCode = this.f120287d.hashCode() * 31;
        Object obj = this.f120288e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        u uVar = this.f120289f;
        return hashCode2 + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "V3GetCurrentUserHandlerV3GetCurrentUserHandlerQuery(__typename=" + this.f120287d + ", commerceEnvConfig=" + this.f120288e + ", data=" + this.f120289f + ")";
    }
}
