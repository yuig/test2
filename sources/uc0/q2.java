package uc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q2 extends s2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f121854a;

    public q2(List tokenPageItems) {
        Intrinsics.checkNotNullParameter(tokenPageItems, "tokenPageItems");
        this.f121854a = tokenPageItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2) && Intrinsics.d(this.f121854a, ((q2) obj).f121854a);
    }

    public final int hashCode() {
        return this.f121854a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("TokenPageNoSearch(tokenPageItems="), this.f121854a, ")");
    }
}
