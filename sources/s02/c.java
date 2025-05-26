package s02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final List f110315a;

    public c(List linkedAccounts) {
        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
        this.f110315a = linkedAccounts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f110315a, ((c) obj).f110315a);
    }

    public final int hashCode() {
        return this.f110315a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ShowLinkedBAsEvent(linkedAccounts="), this.f110315a, ")");
    }
}
