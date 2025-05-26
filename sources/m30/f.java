package m30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f85751a;

    public f(List list) {
        this.f85751a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f85751a, ((f) obj).f85751a);
    }

    public final int hashCode() {
        List list = this.f85751a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Data(boardTitleSuggestions="), this.f85751a, ")");
    }
}
