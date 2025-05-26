package dl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f55289a;

    /* renamed from: b, reason: collision with root package name */
    public final s f55290b;

    public v0(s sVar, s newModel) {
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        this.f55289a = sVar;
        this.f55290b = newModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f55289a, v0Var.f55289a) && Intrinsics.d(this.f55290b, v0Var.f55290b);
    }

    public final int hashCode() {
        s sVar = this.f55289a;
        return this.f55290b.hashCode() + ((sVar == null ? 0 : sVar.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdatedModel(oldModel=" + this.f55289a + ", newModel=" + this.f55290b + ")";
    }
}
