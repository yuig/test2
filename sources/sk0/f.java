package sk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final List f113054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113055b;

    /* renamed from: c, reason: collision with root package name */
    public final int f113056c;

    /* renamed from: d, reason: collision with root package name */
    public final int f113057d;

    public f(int i13, int i14, int i15, List boardTools) {
        Intrinsics.checkNotNullParameter(boardTools, "boardTools");
        this.f113054a = boardTools;
        this.f113055b = i13;
        this.f113056c = i14;
        this.f113057d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f113054a, fVar.f113054a) && this.f113055b == fVar.f113055b && this.f113056c == fVar.f113056c && this.f113057d == fVar.f113057d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113057d) + ep.b.b(this.f113056c, ep.b.b(this.f113055b, this.f113054a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnToolListUpdated(boardTools=");
        sb3.append(this.f113054a);
        sb3.append(", sectionlessPinCount=");
        sb3.append(this.f113055b);
        sb3.append(", pinCount=");
        sb3.append(this.f113056c);
        sb3.append(", sectionCount=");
        return a.a.n(sb3, this.f113057d, ")");
    }
}
