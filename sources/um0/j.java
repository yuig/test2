package um0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements x {

    /* renamed from: a, reason: collision with root package name */
    public final List f122718a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122719b;

    public j(ArrayList sections, int i13) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f122718a = sections;
        this.f122719b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f122718a, jVar.f122718a) && this.f122719b == jVar.f122719b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122719b) + (this.f122718a.hashCode() * 31);
    }

    public final String toString() {
        return "SectionMoved(sections=" + this.f122718a + ", position=" + this.f122719b + ")";
    }
}
