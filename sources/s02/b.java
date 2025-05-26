package s02;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final List f110314a;

    public b(ArrayList linkedAccounts) {
        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
        this.f110314a = linkedAccounts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f110314a, ((b) obj).f110314a);
    }

    public final int hashCode() {
        return this.f110314a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("AccountsLoaded(linkedAccounts="), this.f110314a, ")");
    }
}
