package cm0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f28001a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28002b;

    public a(ArrayList pinList, String sortOption) {
        Intrinsics.checkNotNullParameter(pinList, "pinList");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        this.f28001a = pinList;
        this.f28002b = sortOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f28001a, aVar.f28001a) && Intrinsics.d(this.f28002b, aVar.f28002b);
    }

    public final int hashCode() {
        return this.f28002b.hashCode() + (this.f28001a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardListRearrangeRequestParams(pinList=" + this.f28001a + ", sortOption=" + this.f28002b + ")";
    }
}
