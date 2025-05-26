package s02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final List f110317a;

    public f(List linkedAccounts) {
        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
        this.f110317a = linkedAccounts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f110317a, ((f) obj).f110317a);
    }

    public final int hashCode() {
        return this.f110317a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ShowLinkedBAsSideEffectRequest(linkedAccounts="), this.f110317a, ")");
    }
}
