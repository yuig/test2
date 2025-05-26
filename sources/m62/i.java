package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r72.j0 f86011a;

    /* renamed from: b, reason: collision with root package name */
    public final k62.b f86012b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86013c;

    public i(r72.j0 effect, k62.b metadata, boolean z13) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f86011a = effect;
        this.f86012b = metadata;
        this.f86013c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f86011a, iVar.f86011a) && Intrinsics.d(this.f86012b, iVar.f86012b) && this.f86013c == iVar.f86013c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86013c) + ((this.f86012b.hashCode() + (this.f86011a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectModel(effect=");
        sb3.append(this.f86011a);
        sb3.append(", metadata=");
        sb3.append(this.f86012b);
        sb3.append(", isSelected=");
        return a.a.r(sb3, this.f86013c, ")");
    }
}
