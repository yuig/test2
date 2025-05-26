package kc1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class b implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ic1.y f79136a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79137b;

    public /* synthetic */ b(ic1.y yVar, int i13) {
        this((i13 & 1) != 0 ? null : yVar, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f79136a, bVar.f79136a) && this.f79137b == bVar.f79137b;
    }

    public final int hashCode() {
        ic1.y yVar = this.f79136a;
        return Boolean.hashCode(this.f79137b) + ((yVar == null ? 0 : yVar.f72099a.hashCode()) * 31);
    }

    public final String toString() {
        return "ChipVMState(pronoun=" + this.f79136a + ", isSelected=" + this.f79137b + ")";
    }

    public b(ic1.y yVar, boolean z13) {
        this.f79136a = yVar;
        this.f79137b = z13;
    }
}
