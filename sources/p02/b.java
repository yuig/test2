package p02;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f98403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98404b;

    public b(ArrayList enforcementActionList, String bookmark) {
        Intrinsics.checkNotNullParameter(enforcementActionList, "enforcementActionList");
        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
        this.f98403a = enforcementActionList;
        this.f98404b = bookmark;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f98403a, bVar.f98403a) && Intrinsics.d(this.f98404b, bVar.f98404b);
    }

    public final int hashCode() {
        return this.f98404b.hashCode() + (this.f98403a.hashCode() * 31);
    }

    public final String toString() {
        return "EnforcementActionsWithBookmark(enforcementActionList=" + this.f98403a + ", bookmark=" + this.f98404b + ")";
    }
}
