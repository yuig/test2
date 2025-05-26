package x40;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 implements x0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133758d;

    /* renamed from: e, reason: collision with root package name */
    public final List f133759e;

    public z0(String __typename, ArrayList data) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f133758d = __typename;
        this.f133759e = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.f133758d, z0Var.f133758d) && Intrinsics.d(this.f133759e, z0Var.f133759e);
    }

    public final int hashCode() {
        return this.f133759e.hashCode() + (this.f133758d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("V3BatchDeclineContactRequestsV3BatchDeclineContactRequestsMutation(__typename=");
        sb3.append(this.f133758d);
        sb3.append(", data=");
        return a.c.j(sb3, this.f133759e, ")");
    }
}
