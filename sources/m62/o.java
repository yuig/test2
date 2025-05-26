package m62;

import java.util.AbstractList;
import java.util.List;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends m2 {

    /* renamed from: d, reason: collision with root package name */
    public final List f86036d;

    public o(AbstractList colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f86036d = colors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f86036d, ((o) obj).f86036d);
    }

    public final int hashCode() {
        return this.f86036d.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Colors(colors="), this.f86036d, ")");
    }
}
