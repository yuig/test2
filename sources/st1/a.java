package st1;

import kotlin.jvm.internal.Intrinsics;
import r72.i1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f115171a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f115172b;

    public a(i1 mask, boolean z13) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f115171a = z13;
        this.f115172b = mask;
    }

    public static a a(a aVar, boolean z13) {
        i1 mask = aVar.f115172b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(mask, "mask");
        return new a(mask, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f115171a == aVar.f115171a && Intrinsics.d(this.f115172b, aVar.f115172b);
    }

    public final int hashCode() {
        return this.f115172b.hashCode() + (Boolean.hashCode(this.f115171a) * 31);
    }

    public final String toString() {
        return "CutoutMask(isSelected=" + this.f115171a + ", mask=" + this.f115172b + ")";
    }
}
