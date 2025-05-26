package l62;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class p extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81682a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81683b;

    public p(String id3, int i13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81682a = id3;
        this.f81683b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        String str = pVar.f81682a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81682a, str) && this.f81683b == pVar.f81683b;
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        return Integer.hashCode(this.f81683b) + (this.f81682a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.n(cb.o("ItemZOrderChanged(id=", a2.a(this.f81682a), ", toZIndex="), this.f81683b, ")");
    }
}
