package r52;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f106271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106272b;

    /* renamed from: c, reason: collision with root package name */
    public final List f106273c;

    public d(int i13, int i14, ArrayList thumbnails) {
        Intrinsics.checkNotNullParameter(thumbnails, "thumbnails");
        this.f106271a = i13;
        this.f106272b = i14;
        this.f106273c = thumbnails;
    }

    @Override // r52.f
    public final List a() {
        return this.f106273c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f106271a == dVar.f106271a && this.f106272b == dVar.f106272b && Intrinsics.d(this.f106273c, dVar.f106273c);
    }

    public final int hashCode() {
        return this.f106273c.hashCode() + ep.b.b(this.f106272b, Integer.hashCode(this.f106271a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Normal(selectedCount=");
        sb3.append(this.f106271a);
        sb3.append(", maxPinCount=");
        sb3.append(this.f106272b);
        sb3.append(", thumbnails=");
        return a.c.j(sb3, this.f106273c, ")");
    }
}
