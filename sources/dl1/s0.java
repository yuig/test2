package dl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f55285a;

    /* renamed from: b, reason: collision with root package name */
    public final s f55286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55287c;

    public s0(u0 updateType, s model, int i13) {
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55285a = updateType;
        this.f55286b = model;
        this.f55287c = i13;
    }

    public final int a() {
        return this.f55287c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f55285a == s0Var.f55285a && Intrinsics.d(this.f55286b, s0Var.f55286b) && this.f55287c == s0Var.f55287c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55287c) + ((this.f55286b.hashCode() + (this.f55285a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SequencedModelUpdate(updateType=");
        sb3.append(this.f55285a);
        sb3.append(", model=");
        sb3.append(this.f55286b);
        sb3.append(", sequenceId=");
        return a.a.n(sb3, this.f55287c, ")");
    }
}
