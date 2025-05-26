package r52;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f106261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106262b;

    /* renamed from: c, reason: collision with root package name */
    public final List f106263c;

    public b(int i13, int i14, ArrayList thumbnails) {
        Intrinsics.checkNotNullParameter(thumbnails, "thumbnails");
        this.f106261a = i13;
        this.f106262b = i14;
        this.f106263c = thumbnails;
    }

    @Override // r52.f
    public final List a() {
        return this.f106263c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f106261a == bVar.f106261a && this.f106262b == bVar.f106262b && Intrinsics.d(this.f106263c, bVar.f106263c);
    }

    public final int hashCode() {
        return this.f106263c.hashCode() + ep.b.b(this.f106262b, ep.b.b(this.f106261a, Integer.hashCode(5) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BelowMin(minPinCount=5, selectedCount=");
        sb3.append(this.f106261a);
        sb3.append(", maxPinCount=");
        sb3.append(this.f106262b);
        sb3.append(", thumbnails=");
        return a.c.j(sb3, this.f106263c, ")");
    }
}
