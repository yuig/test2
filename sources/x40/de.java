package x40;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class de implements be {

    /* renamed from: d, reason: collision with root package name */
    public final String f132247d;

    /* renamed from: e, reason: collision with root package name */
    public final List f132248e;

    public de(String __typename, ArrayList data) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f132247d = __typename;
        this.f132248e = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de)) {
            return false;
        }
        de deVar = (de) obj;
        return Intrinsics.d(this.f132247d, deVar.f132247d) && Intrinsics.d(this.f132248e, deVar.f132248e);
    }

    public final int hashCode() {
        return this.f132248e.hashCode() + (this.f132247d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("V3InviteBoardCollaboratorEmailV3InviteBoardCollaboratorEmailMutation(__typename=");
        sb3.append(this.f132247d);
        sb3.append(", data=");
        return a.c.j(sb3, this.f132248e, ")");
    }
}
