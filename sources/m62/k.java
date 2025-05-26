package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    public final r72.w0 f86021a;

    /* renamed from: b, reason: collision with root package name */
    public final k62.d f86022b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86023c;

    /* renamed from: d, reason: collision with root package name */
    public final String f86024d;

    public k(r72.w0 setting, k62.d metadata, boolean z13) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f86021a = setting;
        this.f86022b = metadata;
        this.f86023c = z13;
        this.f86024d = setting.b();
    }

    @Override // m62.n
    public final String a() {
        return this.f86024d;
    }

    @Override // m62.n
    public final boolean b() {
        return this.f86023c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f86021a, kVar.f86021a) && Intrinsics.d(this.f86022b, kVar.f86022b) && this.f86023c == kVar.f86023c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86023c) + ((this.f86022b.hashCode() + (this.f86021a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Item(setting=");
        sb3.append(this.f86021a);
        sb3.append(", metadata=");
        sb3.append(this.f86022b);
        sb3.append(", isSelected=");
        return a.a.r(sb3, this.f86023c, ")");
    }
}
