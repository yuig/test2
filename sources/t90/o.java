package t90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f116816a;

    public o(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f116816a = actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f116816a, ((o) obj).f116816a);
    }

    public final int hashCode() {
        return this.f116816a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("CutoutEditorActionGridState(actions="), this.f116816a, ")");
    }
}
