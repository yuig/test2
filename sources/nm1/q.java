package nm1;

import com.pinterest.gestalt.searchField.GestaltSearchField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltSearchField f91467a;

    public q(GestaltSearchField searchField) {
        Intrinsics.checkNotNullParameter(searchField, "searchField");
        this.f91467a = searchField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f91467a, ((q) obj).f91467a);
    }

    public final int hashCode() {
        return this.f91467a.hashCode();
    }

    public final String toString() {
        return "Search(searchField=" + this.f91467a + ")";
    }
}
