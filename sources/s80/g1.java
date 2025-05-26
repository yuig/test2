package s80;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f111542a;

    public g1(ArrayList eventsPendingActivation) {
        Intrinsics.checkNotNullParameter(eventsPendingActivation, "eventsPendingActivation");
        this.f111542a = eventsPendingActivation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.f111542a, ((g1) obj).f111542a);
    }

    public final int hashCode() {
        return this.f111542a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("OnActivated(eventsPendingActivation="), this.f111542a, ")");
    }
}
