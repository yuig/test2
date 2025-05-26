package p50;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f98877a;

    /* renamed from: b, reason: collision with root package name */
    public final List f98878b;

    public o(String __typename, ArrayList data) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f98877a = __typename;
        this.f98878b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f98877a, oVar.f98877a) && Intrinsics.d(this.f98878b, oVar.f98878b);
    }

    public final int hashCode() {
        return this.f98878b.hashCode() + (this.f98877a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("V3AndroidWidgetGetHomefeedPinsV3AndroidWidgetGetHomefeedPinsQuery(__typename=");
        sb3.append(this.f98877a);
        sb3.append(", data=");
        return a.c.j(sb3, this.f98878b, ")");
    }
}
