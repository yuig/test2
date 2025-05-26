package gz;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r implements u {

    /* renamed from: a, reason: collision with root package name */
    public final List f66355a;

    public r(ArrayList indices) {
        Intrinsics.checkNotNullParameter(indices, "indices");
        this.f66355a = indices;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f66355a, ((r) obj).f66355a);
    }

    public final int hashCode() {
        return this.f66355a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Multiple(indices="), this.f66355a, ")");
    }
}
