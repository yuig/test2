package hd2;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f68914a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68915b;

    public b(List points, boolean z13) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f68914a = points;
        this.f68915b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f68914a, bVar.f68914a) && this.f68915b == bVar.f68915b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68915b) + (this.f68914a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Contour(points=");
        sb3.append(this.f68914a);
        sb3.append(", inner=");
        return cb.m(sb3, this.f68915b, ')');
    }
}
