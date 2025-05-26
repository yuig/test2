package hb2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f68542a;

    public b0(List mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f68542a = mask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f68542a, ((b0) obj).f68542a);
    }

    public final int hashCode() {
        return this.f68542a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("State(mask="), this.f68542a, ")");
    }
}
