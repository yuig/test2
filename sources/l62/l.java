package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;
import r72.l1;

/* loaded from: classes4.dex */
public final class l extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81652a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f81653b;

    /* renamed from: c, reason: collision with root package name */
    public final double f81654c;

    /* renamed from: d, reason: collision with root package name */
    public final double f81655d;

    public l(String id3, l1 offset, double d2, double d13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f81652a = id3;
        this.f81653b = offset;
        this.f81654c = d2;
        this.f81655d = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        String str = lVar.f81652a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81652a, str) && Intrinsics.d(this.f81653b, lVar.f81653b) && Double.compare(this.f81654c, lVar.f81654c) == 0 && Double.compare(this.f81655d, lVar.f81655d) == 0;
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return Double.hashCode(this.f81655d) + a.c.a(this.f81654c, (this.f81653b.hashCode() + (this.f81652a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ItemChanged(id=" + a2.a(this.f81652a) + ", offset=" + this.f81653b + ", scale=" + this.f81654c + ", rotation=" + this.f81655d + ")";
    }
}
