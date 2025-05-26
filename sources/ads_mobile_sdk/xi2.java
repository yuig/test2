package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xi2 {

    /* renamed from: a, reason: collision with root package name */
    public final ol0 f13688a;

    /* renamed from: b, reason: collision with root package name */
    public final hl0 f13689b;

    /* renamed from: c, reason: collision with root package name */
    public final eh2 f13690c;

    public /* synthetic */ xi2(ol0 ol0Var, hl0 hl0Var, int i13) {
        this(ol0Var, (i13 & 2) != 0 ? null : hl0Var, (eh2) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi2)) {
            return false;
        }
        xi2 xi2Var = (xi2) obj;
        return this.f13688a == xi2Var.f13688a && this.f13689b == xi2Var.f13689b && Intrinsics.d(this.f13690c, xi2Var.f13690c);
    }

    public final int hashCode() {
        int hashCode = this.f13688a.hashCode() * 31;
        hl0 hl0Var = this.f13689b;
        int hashCode2 = (hashCode + (hl0Var == null ? 0 : hl0Var.hashCode())) * 31;
        eh2 eh2Var = this.f13690c;
        return hashCode2 + (eh2Var != null ? eh2Var.hashCode() : 0);
    }

    public final String toString() {
        return "SignalMeta(signalId=" + this.f13688a + ", cacheState=" + this.f13689b + ", signalData=" + this.f13690c + ")";
    }

    public xi2(ol0 signalId, hl0 hl0Var, eh2 eh2Var) {
        Intrinsics.checkNotNullParameter(signalId, "signalId");
        this.f13688a = signalId;
        this.f13689b = hl0Var;
        this.f13690c = eh2Var;
    }
}
