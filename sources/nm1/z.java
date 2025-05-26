package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements m {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f91513a;

    /* renamed from: b, reason: collision with root package name */
    public final y f91514b;

    /* renamed from: c, reason: collision with root package name */
    public final l f91515c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f91516d;

    /* renamed from: e, reason: collision with root package name */
    public final int f91517e;

    public z(u50.i0 hintText, y yVar, l endActions, h0 variant, int i13) {
        variant = (i13 & 8) != 0 ? h0.NORMAL : variant;
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f91513a = hintText;
        this.f91514b = yVar;
        this.f91515c = endActions;
        this.f91516d = variant;
        this.f91517e = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f91513a, zVar.f91513a) && Intrinsics.d(this.f91514b, zVar.f91514b) && Intrinsics.d(this.f91515c, zVar.f91515c) && this.f91516d == zVar.f91516d && this.f91517e == zVar.f91517e;
    }

    @Override // nm1.m
    public final int getId() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.f91513a.hashCode() * 31;
        y yVar = this.f91514b;
        return Integer.hashCode(this.f91517e) + ((this.f91516d.hashCode() + ((this.f91515c.hashCode() + ((hashCode + (yVar == null ? 0 : yVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Search(hintText=");
        sb3.append(this.f91513a);
        sb3.append(", trailingIcon=");
        sb3.append(this.f91514b);
        sb3.append(", endActions=");
        sb3.append(this.f91515c);
        sb3.append(", variant=");
        sb3.append(this.f91516d);
        sb3.append(", id=");
        return a.a.n(sb3, this.f91517e, ")");
    }
}
