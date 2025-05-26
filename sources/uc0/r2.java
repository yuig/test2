package uc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r2 extends s2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f121857a;

    public r2(List tokens) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        this.f121857a = tokens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2) && Intrinsics.d(this.f121857a, ((r2) obj).f121857a);
    }

    public final int hashCode() {
        return this.f121857a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("TokenPageSearch(tokens="), this.f121857a, ")");
    }
}
