package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final k62.g f86031a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86032b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86033c;

    public m(k62.g toolInfo, boolean z13) {
        Intrinsics.checkNotNullParameter(toolInfo, "toolInfo");
        this.f86031a = toolInfo;
        this.f86032b = z13;
        this.f86033c = toolInfo.f78436a.f106489a;
    }

    public static m c(m mVar, boolean z13) {
        k62.g toolInfo = mVar.f86031a;
        Intrinsics.checkNotNullParameter(toolInfo, "toolInfo");
        return new m(toolInfo, z13);
    }

    @Override // m62.n
    public final String a() {
        return this.f86033c;
    }

    @Override // m62.n
    public final boolean b() {
        return this.f86032b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f86031a, mVar.f86031a) && this.f86032b == mVar.f86032b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86032b) + (this.f86031a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolItem(toolInfo=" + this.f86031a + ", isSelected=" + this.f86032b + ")";
    }
}
