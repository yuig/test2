package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    public final k62.e f86015a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86017c;

    public j(k62.e fontVariant, boolean z13) {
        Intrinsics.checkNotNullParameter(fontVariant, "fontVariant");
        this.f86015a = fontVariant;
        this.f86016b = z13;
        this.f86017c = fontVariant.f78432a.name();
    }

    @Override // m62.n
    public final String a() {
        return this.f86017c;
    }

    @Override // m62.n
    public final boolean b() {
        return this.f86016b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f86015a, jVar.f86015a) && this.f86016b == jVar.f86016b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86016b) + (this.f86015a.hashCode() * 31);
    }

    public final String toString() {
        return "FontItem(fontVariant=" + this.f86015a + ", isSelected=" + this.f86016b + ")";
    }
}
